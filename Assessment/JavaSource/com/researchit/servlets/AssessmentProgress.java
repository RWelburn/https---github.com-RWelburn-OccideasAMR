/**
 * Version:
 *     $Id$
 *
 * Revisions:
 *     $Log$
 *     Revision 1.13  2009/05/27 02:00:08  troy.sadkowsky
 *     bug fix 814 3cat frequency hours
 *
 *     Revision 1.12  2009/05/06 08:23:17  troy.sadkowsky
 *     fix for progress bar and use auto assessments
 *
 *     Revision 1.11  2009/01/05 06:52:17  troy.sadkowsky
 *     progress bar updates
 *
 *     Revision 1.10  2008/12/23 10:33:23  troy.sadkowsky
 *     speed enhancements, linked jsms, progress bar
 *
 *     Revision 1.9  2008/09/12 02:38:30  troy.sadkowsky
 *     ASsessment report updates
 *
 *     Revision 1.8  2008/08/20 03:38:48  troy.sadkowsky
 *     assessment updates
 *
 *     Revision 1.7  2008/08/13 04:18:29  troy.sadkowsky
 *     assessment review updates
 *
 *     Revision 1.6  2008/08/11 01:46:30  ray.welburn
 *     move study object to common package
 *
 *     Revision 1.5  2008/07/08 04:32:21  troy.sadkowsky
 *     run auto assessments on selected
 *
 *     Revision 1.4  2008/05/30 01:52:52  troy.sadkowsky
 *     removed old code
 *
 *
 */
package com.researchit.servlets;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import com.researchit.Agent;
import com.researchit.FrozenJobSpecificModule;
import com.researchit.JobHistory;
import com.researchit.ProgressNotifier;
import com.researchit.common.Study;
import com.researchit.expert.Engine;
import com.researchit.expert.ExpertAgent;
import com.researchit.html.AssessmentSystem;
import com.researchit.html.OccCalendar;

public class AssessmentProgress implements Runnable{

	public static final Integer SHOWINTERVIEWREPORT = 1;
	public static final Integer AUTOASSESSALL = 2;
	public static final Integer AUTOASSESSJHS = 3;
	public static final Integer AUTOASSESSJHSALL = 4;
	HttpSession session;
	Integer function;
	ArrayList<FrozenJobSpecificModule> fjsms;
	ArrayList<Agent> agents;
	Study study;
	Agent agent;
	ProgressNotifier pNotifier;
	private List<JobHistory> jobHistories;
	
	public List<JobHistory> getJobHistories() {
		return jobHistories;
	}
	public void setJobHistories(List<JobHistory> jobHistories) {
		this.jobHistories = jobHistories;
	}
	public ProgressNotifier getPNotifier() {
		return pNotifier;
	}
	public void setPNotifier(ProgressNotifier notifier) {
		pNotifier = notifier;
	}
	public Agent getAgent() {
		return agent;
	}
	public void setAgent(Agent agent) {
		this.agent = agent;
	}
	public Study getStudy() {
		return study;
	}
	public void setStudy(Study study) {
		this.study = study;
	}
	public AssessmentProgress(HttpSession session) {
		super();
		this.session = session;		
	}
	public void run() {
		switch(this.getFunction()){
			case 1:{ //SHOWINTERVIEWREPORT
				String output = "";
				AssessmentSystem as = new AssessmentSystem();
				try {
					
					output = as.showInterviewReport(fjsms,study,pNotifier);
				} catch (Exception e) {
					e.printStackTrace();
				}
				session.setAttribute("OutPut",output);
			}
			break;
			case 2:{ //AUTOASSESS
				try {
					Engine engine = new Engine();
					agent.setStudyId(study.getId());
					//List<JobHistory> jhs = new ArrayList<JobHistory>();
					JobHistory jh = new JobHistory();
		        	String sql = "SELECT     jobhistory.id, jobhistory.referencenumber"
		        		+" FROM         jobhistory INNER JOIN"
		        		+"                      participant ON jobhistory.participantid = participant.id INNER JOIN"
		        		+"                      study ON participant.studyid = study.id INNER JOIN"
		        		+"                      studyagents ON study.id = studyagents.studyid"
		        		+" WHERE     (studyagents.agentid = "+agent.getId()+") AND (study.id = "+study.getId()+") AND (participant.participantstatusid = 4) ORDER BY jobhistory.referencenumber";
					jobHistories = jh.getJobHistories(sql);
					//pNotifier.setCurrentPos(0);
					//pNotifier.setSize(jobHistories.size());
					//pNotifier.save();	
					int iCountTotal = jobHistories.size();
					session.setAttribute("totalcount", iCountTotal);
					session.setAttribute("ProgressTotal", iCountTotal);
					int iCount = 0;
					for(JobHistory jh1: jobHistories){
						session.setAttribute("count", iCount+1);
						session.setAttribute("Progress", iCount+1);
						engine.Evaluate11(new ExpertAgent(agent.getId()),jh1,study);
						iCount++;
						//pNotifier.setCurrentPos(iCount);
						//pNotifier.save();
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			break;
			case 3:{ //AUTOASSESS set array of jhs
				try {
					Engine engine = new Engine();
					agent.setStudyId(study.getId());
					//pNotifier.setCurrentPos(0);
					//pNotifier.setSize(jobHistories.size());
					//pNotifier.save();	
					int iCount = 0;
					int iAgents = study.getAgents().size();
					int iCountTotal = jobHistories.size()*iAgents;
					session.setAttribute("totalcount", iCountTotal);
					session.setAttribute("ProgressTotal", iCountTotal);
					for(JobHistory jh1: jobHistories){
						session.setAttribute("count", iCount+iAgents);
						session.setAttribute("Progress", iCount+iAgents);
						engine.Evaluate11(new ExpertAgent(agent.getId()),jh1,study);
						iCount++;
						//pNotifier.setCurrentPos(iCount);
						//pNotifier.save();
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			break;
			case 4:{ //AUTOASSESS set array of jhs
				try {
					OccCalendar now = new OccCalendar();
					Engine engine = new Engine();
					//agent.setStudyId(study.getId());
					//pNotifier.setCurrentPos(0);
					//pNotifier.setSize(jobHistories.size());
					//pNotifier.save();	
					int iCount = 0;
					//int iAgents = study.getAgents().size();
					int iCountTotal = jobHistories.size();
					session.setAttribute("totalcount", iCountTotal);
					session.setAttribute("ProgressTotal", iCountTotal);
					for(JobHistory jh1: jobHistories){						
						
						for(Agent agent : this.agents){
							engine.Evaluate11(new ExpertAgent(agent.getId()),jh1,study);
						}
						
						iCount++;
						session.setAttribute("count", iCount+1);
						session.setAttribute("Progress", iCount+1);						//pNotifier.setCurrentPos(iCount);
						//pNotifier.save();
					}
					session.setAttribute("Progress", iCountTotal);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			break;
		}		
		session.removeAttribute("InProgress");
/*		session.removeAttribute("count");
		session.removeAttribute("totalcount");
		session.removeAttribute("ProgressTotal");
		session.removeAttribute("Progress");*/
	}
	public Integer getFunction() {
		return function;
	}
	public void setFunction(Integer function) {
		this.function = function;
	}
	public ArrayList<FrozenJobSpecificModule> getFjsms() {
		return fjsms;
	}
	public void setFjsms(ArrayList<FrozenJobSpecificModule> fjsms) {
		this.fjsms = fjsms;
	}
	public ArrayList<Agent> getAgents() {
		return agents;
	}
	public void setAgents(ArrayList<Agent> agents) {
		this.agents = agents;
	}
}
