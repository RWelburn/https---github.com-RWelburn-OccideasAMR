/**
 * Revisions:
 *     $Log: AssessmentSystem.java,v $
 *     Revision 1.182  2009/05/27 02:00:44  troy.sadkowsky
 *     bug fix 814 3cat frequency hours
 *
 *     Revision 1.181  2009/03/09 06:57:20  troy.sadkowsky
 *     bug fixes from demo testing
 *
 *     Revision 1.180  2009/02/23 06:00:37  troy.sadkowsky
 *     update reports
 *
 *     Revision 1.179  2009/02/19 04:31:55  troy.sadkowsky
 *     formatting and removed commented out code
 *
 *     Revision 1.178  2009/02/19 04:24:34  troy.sadkowsky
 *     debug info on assessment report generation
 *
 *     Revision 1.177  2009/02/19 03:37:36  troy.sadkowsky
 *     archive report functions
 *
 *     Revision 1.176  2009/02/04 22:45:48  troy.sadkowsky
 *     New report functions
 *
 *     Revision 1.175  2009/01/21 08:44:53  troy.sadkowsky
 *     bug fix for job history panel
 *
 *     Revision 1.174  2009/01/07 05:51:08  troy.sadkowsky
 *     more v2 updates
 *
 *     Revision 1.173  2009/01/06 07:40:51  troy.sadkowsky
 *     v2 updates
 *
 *     Revision 1.172  2009/01/06 01:17:35  troy.sadkowsky
 *     report to excel functions
 *
 *     Revision 1.171  2009/01/05 06:54:23  troy.sadkowsky
 *     progress bar updates
 *
 *     Revision 1.170  2008/12/30 00:11:38  troy.sadkowsky
 *     paging and speed enhancements
 *
 *     Revision 1.169  2008/12/29 02:44:05  troy.sadkowsky
 *     increased speed of participant lists
 *
 *     Revision 1.168  2008/12/23 10:32:24  troy.sadkowsky
 *     speed enhancements, linked jsms, progress bar
 *
 *     Revision 1.167  2008/12/22 04:06:21  troy.sadkowsky
 *     various updates
 *
 *     Revision 1.166  2008/12/20 02:07:08  troy.sadkowsky
 *     v2 updates
 *
 *     Revision 1.165  2008/12/17 03:57:27  ray.welburn
 *     New title bars and coles buttons added
 *
 *     Revision 1.164  2008/12/07 05:18:45  ray.welburn
 *     Change to use only one showcombobox method
 *
 *     Revision 1.163  2008/12/02 05:52:15  troy.sadkowsky
 *     show fired rules
 *
 *     Revision 1.162  2008/11/25 23:29:44  troy.sadkowsky
 *     minor layout updates
 *
 *     Revision 1.161  2008/11/15 09:08:59  troy.sadkowsky
 *     various bug fixes and code cleaning
 *
 *     Revision 1.160  2008/11/14 09:14:39  troy.sadkowsky
 *     usability updates
 *
 *     Revision 1.159  2008/10/27 22:57:32  troy.sadkowsky
 *     assessment updates
 *
 *     Revision 1.158  2008/10/17 03:40:07  troy.sadkowsky
 *     bug fixes
 *
 *     Revision 1.157  2008/10/10 06:08:15  Troy.Sadkowsky
 *     minor updates
 *
 *     Revision 1.156  2008/10/10 05:53:12  troy.sadkowsky
 *     permission level update
 *
 *     Revision 1.155  2008/10/03 02:57:30  troy.sadkowsky
 *     assessment updates
 *
 *     Revision 1.154  2008/09/24 12:16:59  troy.sadkowsky
 *     demo ready
 *
 *     Revision 1.153  2008/09/20 08:59:29  troy.sadkowsky
 *     new assessment updates
 *
 *     Revision 1.152  2008/09/15 03:07:41  troy.sadkowsky
 *     new filter capabiities
 *
 *     Revision 1.151  2008/09/12 02:40:17  troy.sadkowsky
 *     ASsessment report updates
 *
 *     Revision 1.150  2008/09/10 09:11:35  troy.sadkowsky
 *     ASsessment updates
 *
 *     Revision 1.149  2008/09/03 07:35:24  troy.sadkowsky
 *     tidy code and ensure connections close
 *
 *     Revision 1.148  2008/09/03 05:01:44  ray.welburn
 *     Add PT statuses
 *
 *     Revision 1.147  2008/09/02 23:30:43  Troy.Sadkowsky
 *     removed old code and enhanced jsm exporter
 *
 *     Revision 1.146  2008/08/25 01:37:25  ray.welburn
 *     Updates to use single dbobject and participant status table
 *
 *     Revision 1.145  2008/08/20 03:36:34  troy.sadkowsky
 *     assessment updates
 *
 *     Revision 1.144  2008/08/11 01:50:09  ray.welburn
 *     move study object to common package
 *
 *     Revision 1.143  2008/08/11 00:46:19  troy.sadkowsky
 *     rule conversion from ajsms
 *
 *     Revision 1.142  2008/08/06 01:08:30  troy.sadkowsky
 *     assessment updates
 *
 *     Revision 1.141  2008/08/02 06:16:56  troy.sadkowsky
 *     removed jess and reworked rules and ajsms
 *
 *     Revision 1.140  2008/07/31 01:56:55  ray.welburn
 *     MainDB removed
 *
 *     Revision 1.139  2008/07/23 00:16:07  troy.sadkowsky
 *     new updates
 *
 *     Revision 1.138  2008/07/22 06:55:07  ray.welburn
 *     integration changes for new interface
 *
 *     Revision 1.137  2008/07/05 03:30:14  troy.sadkowsky
 *     new previous button
 *
 *     Revision 1.136  2008/06/29 23:25:01  troy.sadkowsky
 *     debugging code for rule validation
 *
 *     Revision 1.135  2008/06/04 00:52:10  ray.welburn
 *     more progress elements added to make progress bar smoother
 *
 *     Revision 1.134  2008/05/26 08:23:24  troy.sadkowsky
 *     Removed old code
 *
 *     Revision 1.133  2008/05/22 02:05:55  ray.welburn
 *     Add toggle summmary/detail for study
 *
 *     Revision 1.132  2008/05/18 12:14:54  troy.sadkowsky
 *     fixed link for non jsm jhs
 *
 *     Revision 1.131  2008/05/11 11:42:59  troy.sadkowsky
 *     update study summary report
 *
 *     Revision 1.130  2008/04/28 06:38:36  troy.sadkowsky
 *     export assessments to excel
 *
 *     Revision 1.129  2008/04/22 23:21:15  troy.sadkowsky
 *     new assessment requirements
 *
 *     Revision 1.128  2008/04/22 10:27:58  ray.welburn
 *     Navitle now consistant across locations
 *
 *     Revision 1.127  2008/04/15 22:58:03  troy.sadkowsky
 *     melb updates
 *
 *     Revision 1.126  2008/04/09 00:59:18  ray.welburn
 *     Make title edit buttons consistant
 *
 *     Revision 1.125  2008/04/04 03:15:50  ray.welburn
 *     Style changes
 *
 *     Revision 1.124  2008/04/01 14:42:03  troy.sadkowsky
 *     new report on studies page and new filter by jsm
 *
 *     Revision 1.123  2008/03/28 00:42:17  troy.sadkowsky
 *     fix link from agent ajsm
 *
 *     Revision 1.122  2008/03/27 23:03:19  ray.welburn
 *     Remove onclick from wiki button
 *
 *     Revision 1.121  2008/03/26 12:36:23  troy.sadkowsky
 *     fix nav bar
 *
 *     Revision 1.120  2008/03/22 04:44:26  ray.welburn
 *     images from database applied to alll images
 *
 *     Revision 1.119  2008/03/18 01:27:35  ray.welburn
 *     wiki.gif added to page
 *
 *     Revision 1.118  2008/03/13 07:26:06  ray.welburn
 *     change help icon to wiki
 *
 *     Revision 1.117  2008/03/13 06:08:43  ray.welburn
 *     Images from database now used
 *
 *     Revision 1.116  2008/03/13 05:33:51  ray.welburn
 *     Unused methods commented out
 *
 *     Revision 1.115  2008/03/11 06:44:36  troy.sadkowsky
 *     update to stop url appearing in nav bar
 *
 *     Revision 1.114  2008/03/05 07:47:27  troy.sadkowsky
 *     replaced - with _ to be consistent with wiki naming convention
 *
 *     Revision 1.113  2008/03/01 07:35:25  ray.welburn
 *     Modify how help navigaes to wiki
 *
 *     Revision 1.112  2008/02/15 04:00:22  troy.sadkowsky
 *     removed olf code, added data cleaning functions and ui updates
 *
 *     Revision 1.111  2008/02/15 02:04:14  ray.welburn
 *     Corrrect Excel export
 *
 *     Revision 1.110  2008/02/15 00:20:22  ray.welburn
 *     toExcel icon added
 *
 *     Revision 1.109  2008/02/14 02:37:50  ray.welburn
 *     Modify help button to go to appropriate page in help wiki
 *
 *     Revision 1.108  2008/02/13 02:37:03  ray.welburn
 *     Remove User manual references
 *
 *     Revision 1.107  2008/02/08 07:37:38  troy.sadkowsky
 *     build v1.71 updates
 *
 *     Revision 1.106  2008/01/14 12:57:16  troy.sadkowsky
 *     rules view updates
 *
 *     Revision 1.105  2008/01/11 04:04:02  troy.sadkowsky
 *     show with parent
 *
 *     Revision 1.104  2007/12/21 01:24:25  troy.sadkowsky
 *     fix for rule numbers
 *
 *     Revision 1.103  2007/11/25 22:30:00  troy.sadkowsky
 *     read only rules
 *
 *     Revision 1.102  2007/11/21 01:57:37  ray.welburn
 *     Added page numbers and count field for interview statuses
 *
 *     Revision 1.101  2007/11/18 03:46:47  troy.sadkowsky
 *     bug fix if agentid not set
 *
 *     Revision 1.100  2007/11/16 04:19:28  troy.sadkowsky
 *     conflict fix and tidy up
 *
 *     Revision 1.99  2007/11/16 03:11:30  ray.welburn
 *     changes to search and paging functions
 *
 *     Revision 1.95  2007/11/09 05:16:45  troy.sadkowsky
 *     updated jh statuses
 *
 *     Revision 1.94  2007/11/08 11:39:54  troy.sadkowsky
 *     show final assessment with colours
 *
 *     Revision 1.93  2007/11/08 06:48:41  troy.sadkowsky
 *     progress bar
 *
 *     Revision 1.92  2007/11/06 11:52:41  troy.sadkowsky
 *     next participant
 *
 *     Revision 1.91  2007/11/05 22:59:09  troy.sadkowsky
 *     fixed navigation links
 *
 *     Revision 1.90  2007/11/04 12:06:24  troy.sadkowsky
 *     assessment report
 *
 *     Revision 1.89  2007/11/03 04:58:22  troy.sadkowsky
 *     statuses and next participants
 *
 *     Revision 1.88  2007/10/29 09:43:50  ray.welburn
 *     Search filter added to LHS  participants menu
 *
 *     Revision 1.87  2007/10/27 06:36:56  ray.welburn
 *     Paging for participants
 *
 *     Revision 1.86  2007/10/24 11:51:00  ray.welburn
 *     Group agents in LHS menu
 *
 *     Revision 1.85  2007/10/18 23:10:18  troy.sadkowsky
 *     new import functions
 *
 *     Revision 1.84  2007/10/16 02:48:12  troy.sadkowsky
 *     reports and single rules
 *
 *     Revision 1.83  2007/10/15 05:55:04  troy.sadkowsky
 *     new report view
 *
 *     Revision 1.82  2007/10/10 03:17:02  ray.welburn
 *     Mouseoveron LHS menu now shows full name
 *
 *     Revision 1.81  2007/10/08 07:33:12  troy.sadkowsky
 *     added cvs revision tag
 *
 */
package com.researchit.html;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.researchit.Agent;
import com.researchit.AgentGroup;
import com.researchit.Assessment;
import com.researchit.FrozenJobSpecificModule;
import com.researchit.FrozenQA;
import com.researchit.Interview;
import com.researchit.JobHistory;
import com.researchit.JobHistoryStatus;
import com.researchit.JobSpecificModule;
import com.researchit.ParticipantStatus;
import com.researchit.PossibleAnswer;
import com.researchit.ProgressNotifier;
import com.researchit.Question;
import com.researchit.Util;
import com.researchit.common.DBBaseObject;
import com.researchit.common.Participant;
import com.researchit.common.Study;
import com.researchit.expert.ExpertAgent;
import com.researchit.expert.ExpertFact;
import com.researchit.expert.ExpertFactRequirement;
import com.researchit.expert.ExpertRule;
import com.researchit.io.Report;

public class AssessmentSystem extends HTMLObject {
	
	private int AGENTLENGTH = 17;

    public AssessmentSystem() {
        super();
    }
	public String showInterviewReport(ArrayList<FrozenJobSpecificModule> fjsms,Study study,ProgressNotifier pNotifier) throws Exception {		
		String retValue = "";
		int iCount = 0;
		for(FrozenJobSpecificModule currentfjsm: fjsms){
			ArrayList<Interview> interviews = currentfjsm.getInterviews(study.getId());
			for(Interview interview: interviews){
				FrozenJobSpecificModule fjsm = new FrozenJobSpecificModule(interview.getFrozenJsmId());
				for(@SuppressWarnings("unused")
				Question q:fjsm.getQuestions()){
					iCount ++;
				}
			}
		}
		pNotifier.setCurrentPos(0);
		pNotifier.setSize(iCount);
		pNotifier.save();
		iCount = 0;
		for(FrozenJobSpecificModule currentfjsm: fjsms){
			retValue += "<div id=interviewReport class=InterviewReport>";
			retValue += "<table class=ContentList><tr class=ListHeader>";			
			retValue += "<td>JSM:"+this.truncateName(currentfjsm.getName(),this.JSMLENGTH)+"<br>"+currentfjsm.getDateCreated()+"</td>";
			retValue += "<td>Participant</td>";
			retValue += "<td>Job History</td>";						
			for(Question q:currentfjsm.getQuestions()){
				retValue += this.showReportColNames(q);
			}
			retValue += "</tr>";
			String currentJsmId = currentfjsm.getId();		
			ArrayList<Interview> interviews = currentfjsm.getInterviews(study.getId());
			for(Interview interview: interviews){
				String jhId = interview.getJobHistoryId();
				JobHistory jh = null;
				Participant p = null;
				if(jhId.equalsIgnoreCase("NULL")){
					p = new Participant(Long.valueOf(interview.getParticipantId()));
				}else{
					jh = new JobHistory(jhId);
					p = new Participant(Long.valueOf(jh.getParticipantId()));
				}				
				Assessment autoAssessment = new Assessment();			
				FrozenJobSpecificModule fjsm = new FrozenJobSpecificModule(interview.getFrozenJsmId());				
				if(!(currentJsmId.equalsIgnoreCase(fjsm.getId()))){
					currentJsmId = fjsm.getId();			
					retValue += "<tr>";
					retValue += "<td>JSM:"+fjsm.getName()+fjsm.getId()+"</td>";
					retValue += "<td>Participant</td>";
					retValue += "<td>Job History</td>";
					for(Question q:fjsm.getQuestions()){
						retValue += this.showReportColNames(q);
						iCount++;
						pNotifier.setCurrentPos(iCount);
						pNotifier.save();
					}
					retValue += "</tr>";				
				}				
				retValue += "<tr>";
				if(jh!=null){
					retValue += "<td></td><td ><a href=main.jsp?Location=Participants&participantID="
		                + p.getParticipantId()
		                + "&jobhistoryID="+interview.getJobHistoryId()+">"
		                + p.getReferenceNumber()
		                + "</a></td>";
					retValue += "<td >"+jh.getReferenceNumber()+"</td>";
				}else{
					retValue += "<td>&nbsp;</td><td>&nbsp;</td><td>&nbsp;</td>";
				}
				for(Question q:fjsm.getQuestions()){
					retValue += this.showReportAnswerValue(interview,q,autoAssessment);
					iCount++;
					pNotifier.setCurrentPos(iCount);
					pNotifier.save();
				}
				retValue += "</tr>";
			}			
			retValue += "</table>";
			retValue += "</div>";
		}
		return retValue;
	}
	public String showInterviewReportQuick(ArrayList<FrozenJobSpecificModule> fjsms,Study study) throws Exception {		
		String retValue = "";
		for(FrozenJobSpecificModule currentfjsm: fjsms){
			retValue += "<div id=interviewReport class=InterviewReport>";
			retValue += "<table class=ContentList><tr class=ListHeader>";			
			retValue += "<td>JSM:"+this.truncateName(currentfjsm.getName(),this.JSMLENGTH)+"<br>"+currentfjsm.getDateCreated()+"</td>";
			retValue += "<td>Participant</td>";
			retValue += "<td>Job History</td>";			
			
			for(Question q:currentfjsm.getFrozenQuestions()){
	        	retValue +="\n<td>"+q.getName()+"</td>"; 	        		        	     	
	        }

			retValue += "</tr>";
			String currentJsmId = currentfjsm.getId();		
			ArrayList<Interview> interviews = currentfjsm.getInterviews(study.getId());

			for(Interview interview: interviews){
				String jhId = interview.getJobHistoryId();
				JobHistory jh = null;
				Participant p = null;
				if(jhId.equalsIgnoreCase("NULL")){
					p = new Participant(Long.valueOf(interview.getParticipantId()));
				}else{
					jh = new JobHistory(jhId);
					p = new Participant(Long.valueOf(jh.getParticipantId()));
				}						
				FrozenJobSpecificModule fjsm = new FrozenJobSpecificModule(interview.getFrozenJsmId());
				
				if(!(currentJsmId.equalsIgnoreCase(fjsm.getId()))){
					currentJsmId = fjsm.getId();			
					retValue += "<tr>";
					retValue += "<td>JSM:"+fjsm.getName()+fjsm.getId()+"</td>";
					retValue += "<td>Participant</td>";
					retValue += "<td>Job History</td>";
					for(Question q:currentfjsm.getFrozenQuestions()){
			        	retValue +="\n<td>"+q.getName()+"</td>"; 	        		        	     	
			        }
					retValue += "</tr>";				
				}				
				retValue += "<tr>";
				if(jh!=null){
					retValue += "<td></td><td ><a href=main.jsp?Location=Participants&participantID="
		                + p.getParticipantId()
		                + "&jobhistoryID="+interview.getJobHistoryId()+">"
		                + p.getReferenceNumber()
		                + "</a></td>";
					retValue += "<td >"+jh.getReferenceNumber()+"</td>";
				}else{
					retValue += "<td>&nbsp;</td><td>&nbsp;</td><td>&nbsp;</td>";
				}			
				for(FrozenQA qa:currentfjsm.getFrozenQuestionsAndAnswers()){
		        	String description = "";
		        	if(qa.getQuestionId()!=null){
		        		ArrayList<PossibleAnswer> answers = interview.getAnswers(qa);
		        		int iSize = answers.size();
		        		int iCount = 1;
		        		for(PossibleAnswer pa:answers){
		        			description += pa.getActualAnswer();
		        			if(iSize>iCount){
		        				description += "|";
		        			}
		        			iCount++;
		        		}		        		
		        		retValue +="\n<td style='padding-left:"+qa.getIndentLevel()+"0px'>"+description+"</td>"; 
		        	}	        	     	
		        }				
				retValue += "</tr>";
			}			
			retValue += "</table>";
			retValue += "</div>";
		}
		return retValue;
	}
	public String showInterviewReport(JobSpecificModule currentfjsm,String studyId) throws Exception {
		String retValue = "";
		retValue += "<table ><tr class=ListHeader>";
		retValue += "<td>JSM:"+currentfjsm.getName()+currentfjsm.getId()+"</td>";
		retValue += "<td>Participant</td>";
		retValue += "<td>Job History</td>";		
		for(Question q:currentfjsm.getQuestions()){
			retValue += this.showReportColNames(q);
		}
		retValue += "</tr>";
		retValue += "</table>";		
		return retValue;
	}
	private String showReportAnswerValue(Interview interview, Question question,Assessment autoAssessment) throws Exception {
		String retValue = "";
		ArrayList<PossibleAnswer> answers = interview.getAnswers(question.getJsmQuestionStructureID());
		String answersHTML = this.showInterviewReportAnswers(answers,autoAssessment);
		String cssClass = "";
		if(!(question.getParentID().equalsIgnoreCase("100"))){
			PossibleAnswer pa = new PossibleAnswer("",question.getParentID());
			Question pq = new Question("",pa.getJsmQuestionStructureID());
			pq.setInterviewID(interview.getId());
			for(PossibleAnswer pqpa: pq.getAnswers()){
				String parentanswer = pqpa.getName();
				if(parentanswer.equalsIgnoreCase(pa.getName())){					
					cssClass = "class=RequiredAnswers";
				}
			}
		}else{
			cssClass = "class=RequiredAnswers";
		}
		question.setInterviewID(interview.getId());
		if(question.isSkipped()){
			cssClass = "class=\"skippedWarning\"";
		}
		retValue += "<td "+cssClass+">"+answersHTML+"</td>";
		for(Question q:question.getChildQuestions()){
			retValue += this.showReportAnswerValue(interview,q,autoAssessment);
		}
		return retValue;
	}
	private String showInterviewReportAnswers(ArrayList<PossibleAnswer> answers,Assessment autoAssessment) throws Exception {
		String retValue = "";
		for(PossibleAnswer pa: answers){
			String cssClass = "";
			if(!(pa.getId().equalsIgnoreCase(""))){
				for(ExpertRule er: autoAssessment.getRules()){
					if(pa.isInRule(er)){
		        		cssClass = "class='"+er.getOutCome()+"'";
					}
				}
			}
			retValue += "<div style='border-right: #ffffff 1px solid; border-top: #ffffff 1px solid; border-left: #ffffff 1px solid; border-bottom: #ffffff 1px solid;' "+cssClass+">"+pa.getDescription()+"</div>";
		}
		return retValue;
	}
	private String showReportColNames(Question question) throws Exception {
		String retValue = "";
		if(question.isAssociateJSM()){
			String jsmId = question.getAssociateJSMID();
			if(!(jsmId.equalsIgnoreCase(""))){
				JobSpecificModule jsm = new JobSpecificModule(jsmId);
				for(Question q:jsm.getQuestions()){
					retValue += this.showReportColNames(q);
				}
			}	
		}else{
			String colName = "";
			if(!(question.getParentID().equalsIgnoreCase("100"))){ //not root question
				if(question.getTypeID().equalsIgnoreCase(Question.FREQUENCY)){
					Question pq = new Question("",question.getParentQuestionID());
					PossibleAnswer pa = new PossibleAnswer("",question.getParentID());
					if(pq.getTypeID().equalsIgnoreCase(Question.FREQUENCY)){
						Question ppq = new Question("",pq.getParentQuestionID());
						colName = ppq.getName()+"-"+pa.getName()+">";
					}else{
						colName = pq.getName()+"-"+pa.getName()+">";
					}					
				}else{
					PossibleAnswer pa = new PossibleAnswer("",question.getParentID());
					colName = pa.getName()+">";
				}
				
			}
			colName += question.getName();
			retValue += "<td>"+colName+"</td>";
		}		
		for(Question q:question.getChildQuestions()){
			retValue += this.showReportColNames(q);
		}
		return retValue;
	}
	public String showInterviewReportExcel(FrozenJobSpecificModule fjsm,String studyId) throws Exception {
		String retValue = "";
		retValue += "JSM:"+fjsm.getName()+fjsm.getId()+",";
		retValue += "Participant,";
		retValue += "Job History,";		
		int iSequence = 1;
		String prefix = fjsm.getName();
		for(Question q:fjsm.getFrozenQuestions()){	
			String name = q.getName().replace(',',' ');
			retValue += prefix+iSequence+name+",";	
			iSequence++;
		}
		retValue += "\n";		
		for(Interview interview: fjsm.getInterviews(studyId)){			
			retValue += ","+interview.getParticipantReferenceNumber()+","+interview.getJobHistoryReferenceNumber()+",";			
			for(Question parentQ:fjsm.getFrozenQuestions()){
				parentQ.setInterviewID(interview.getId()); 
				int iAnswerCount = 1;
				int iAnswerCountSize = parentQ.getAnswers().size();
    			for(PossibleAnswer actualAnswer:parentQ.getAnswers()){
    				retValue += actualAnswer.getActualAnswer();
    				if((iAnswerCountSize>1)&&(iAnswerCount<iAnswerCountSize)){
    					retValue += "|";
    				}
    				iAnswerCount++;
    			}
    			retValue += ",";
			}
			retValue += "\n";
		}
		return retValue;
	}
	public String showInterviewReportHTML(FrozenJobSpecificModule fjsm,String studyId) throws Exception {
		String retValue = "<table border=1>";
		retValue += "<tr><td>";
		retValue += "AMRID</td><td>";
		retValue += "Participant</td><td>";
		retValue += "Job History</td>";		
		int iSequence = 1;
		String prefix = fjsm.getName();
		for(Question q:fjsm.getFrozenQuestions()){	
			String name = q.getName();			
			if(q.isMultiple()){
				int i=1;
				for(PossibleAnswer pa: q.getPossibleAnswers()){
					retValue += "<td>"+prefix+"_"+iSequence+"_"+name+"_"+pa.getName()+"_"+i+"</td>";
					i++;
				}
			}else{
				retValue += "<td>"+prefix+"_"+iSequence+"_"+name+"</td>";
			}				
			iSequence++;
		}
		retValue += "</tr>";		
		for(Interview interview: fjsm.getInterviews(studyId)){			
			retValue += "<td>"+interview.getAmrRefId()+"</td><td>"+interview.getParticipantReferenceNumber()+"</td><td>"+interview.getJobHistoryReferenceNumber()+"</td>";			
			for(Question parentQ:fjsm.getFrozenQuestions()){
				parentQ.setInterviewID(interview.getId()); 
				
				if(parentQ.isMultiple()){
					int i=0;
					for(PossibleAnswer pa: parentQ.getPossibleAnswers()) {//parentQ.getAnswers()){
						
						String actualAnswer = "";
						if(parentQ.getAnswers().contains(pa)){
							actualAnswer = parentQ.getAnswers().get(i).getActualAnswer();
							retValue += "<td>"+actualAnswer+"</td>";
							i++;
						}else{
							retValue += "<td> </td>";
						}

					}
				}else{
					int iAnswerCount = 1;
					int iAnswerCountSize = parentQ.getAnswers().size();
					retValue += "<td>";
					for(PossibleAnswer actualAnswer:parentQ.getAnswers()){
	    				retValue += actualAnswer.getActualAnswer();
	    				if((iAnswerCountSize>1)&&(iAnswerCount<iAnswerCountSize)){
	    					retValue += "|";
	    				}
	    				iAnswerCount++;
	    			}
					retValue += "</td>";
				}				   			
			}
			retValue += "</tr>";
		}
		retValue += "</table>";
		return retValue;
	}
	public String showInterviewReportExcel(JobSpecificModule jsm,String studyId) throws Exception {
		String retValue = "";
		
		retValue += "JSM:"+jsm.getName()+jsm.getId()+",";
		retValue += "Participant,";
		retValue += "Job History,";
		
		for(Question q:jsm.getQuestions()){
			retValue += this.showReportColNamesExcel(q);
		}
		retValue += "\n";		
		return retValue;
	}
	private String showReportColNamesExcel(Question question) throws Exception {
		String retValue = "";
		if(question.isAssociateJSM()){
			String jsmId = question.getAssociateJSMID();
			if(!(jsmId.equalsIgnoreCase(""))){
				JobSpecificModule jsm = new JobSpecificModule(jsmId);
				for(Question q:jsm.getQuestions()){
					retValue += this.showReportColNamesExcel(q);
				}
			}	
		}else{
			String colName = "";
			if(!(question.getParentID().equalsIgnoreCase("100"))){ //not root question
				if(question.getTypeID().equalsIgnoreCase(Question.FREQUENCY)){
					Question pq = new Question("",question.getParentQuestionID());
					PossibleAnswer pa = new PossibleAnswer("",question.getParentID());
					if(pq.getTypeID().equalsIgnoreCase(Question.FREQUENCY)){
						Question ppq = new Question("",pq.getParentQuestionID());
						colName = ppq.getName()+"-"+pa.getName()+">";
					}else{
						colName = pq.getName()+"-"+pa.getName()+">";
					}					
				}else{
					PossibleAnswer pa = new PossibleAnswer("",question.getParentID());
					colName = pa.getName()+">";
				}
				
			}
			colName += question.getName();
			retValue += colName;
		}		
		for(Question q:question.getChildQuestions()){
			retValue += this.showReportColNamesExcel(q);
		}
		return retValue;
	}
    public String showEditRules(ExpertRule er) throws Exception{
    	String strRetValue = "<table class=rules cellpadding=0 cellspacing=0>";
		if(er.getId().equalsIgnoreCase("")){
			strRetValue += "<tr class=windowTop><td colspan=2 align=center>New Rule</td><td>Close</td><td style=\"text-align: right;\"><input type=image src='ImageStream?ImageName=close.gif' name=closeEdit title='Close Edit Mode' height=16 width=16/></td></tr>";			
		}else{
			strRetValue += "<tr class=windowTop><td colspan=2 align=center>Edit Rule "+er.getName()+"</td><td>Close</td><td style=\"text-align: right;\"><input type=image src='ImageStream?ImageName=close.gif' name=closeEdit title='Close Edit Mode' height=16 width=16/></td></tr>";					
		}
    	strRetValue += "\n<tr><td valign=top align=right><b>"+er.getType()+"</b></td>";
    	strRetValue += "\n<td valign=top><table class=rules>";
		
		strRetValue += "\n<tr><td>Rule Name</td><td><input size=50 type=text name=ruleName value=\""+er.getName()+"\" /></td></tr>";
		strRetValue += "\n<tr><td>Rule Description</td><td>"+er.getDescription()+"</td></tr>";
		strRetValue += "\n<tr><td valign=top align=right><b>Facts</b></td>";
		strRetValue += "\n<td>";
		strRetValue += "\n<table class=facts>";
		List<ExpertFact> efs = er.getFacts();
		int iFCount = 1;
		int iFSize = efs.size();
		for(ExpertFact ef:efs){		
			strRetValue += "<tr><td>Fact Name</td><td><input size=50 type=text name=factName_"+ef.getId()+" value=\""+ef.getName()+"\" /></td><td rowspan=3><input type=image src='ImageStream?ImageName=minus.gif' name="+ef.getId()+"_removeFact title='Remove Fact' width=10 height=10></input></td></tr>";
			strRetValue += "<tr><td>Fact Description</td><td><input type=text name=factDescription_"+ef.getId()+" value=\""+ef.getDescription()+"\" /></td></tr>";
			strRetValue += "\n<tr><td valign=top align=right><b>Fact Requirements</b></td>";
			strRetValue += "\n<td>";
			strRetValue += "\n<table class=factrequirements>";	
			List<ExpertFactRequirement> efrs = ef.getFactRequirements();
			int iFRCount = 1;
			int iFRSize = efrs.size();
			for(ExpertFactRequirement efr:efrs){
				if(efr.getType().equalsIgnoreCase("")){
					strRetValue += "<tr><td class=alert>Type</td><td><select name=efrType_"+efr.getId()+"><option value=Q>Q</option><option value=JH>JH</option></select></td></tr>";					
				}
				if(efr.getType().equalsIgnoreCase("JH")){
					strRetValue += "<tr><td>JH Attribute</td><td>"+efr.getJobHistoryAttribute()+"</td><td rowspan=3><input type=image src='ImageStream?ImageName=minus.gif' name="+efr.getId()+"_removeRequirement title='Remove Fact Requirement' width=10 height=10></input></td></tr>";
					strRetValue += "<tr><td>Condition</td><td>"+efr.getCondition()+"</td></tr>";
					strRetValue += "<tr><td>Value</td><td>"+efr.getJobHistoryValue()+"</td></tr>";					
				}else{
					String questionId = efr.getQuestionId();
					Question q = new Question();
					strRetValue += "<tr>";						
					if(questionId.equalsIgnoreCase("NULL")){						
						strRetValue += "<td class=alert>Question</td><td>"+this.showCombo("","factRequirementQuestion_"+efr.getId(),q.getQuestions(),false,false, false)+"</td>";												
					}else{
						q = new Question(questionId);
						strRetValue += "<td>Question</td><td>"+q.getName()+"</td>";						
					}
					strRetValue += "<td rowspan=2><input type=image src='ImageStream?ImageName=minus.gif' name="+efr.getId()+"_removeRequirement title='Remove Fact Requirement' width=10 height=10></input></td></tr>";
					String answerId = efr.getAnswerId();
					PossibleAnswer pa = new PossibleAnswer();
					strRetValue += "<tr>";					
					if(answerId.equalsIgnoreCase("NULL")){						
						strRetValue += "<td class=alert>Answer</td><td>"+this.showCombo("","factRequirementAnswer_"+efr.getId(),pa.getPossibleAnswers(""),false,false, false)+"</td>";												
					}else{
						pa = new PossibleAnswer(answerId);
						strRetValue += "<td>Answer</td><td>"+pa.getName()+"</td>";						
					}
					strRetValue += "</tr>";					
				}
				if(iFRCount==iFRSize){
					strRetValue += "<tr><td colspan=2><input type=image src='ImageStream?ImageName=plus.gif' name="+ef.getId()+"_addORRequirement title='Add Fact Requirement' width=10 height=10></input></td></tr>";										
				}else{
					strRetValue += "<tr><td colspan=2><hr/></td></tr>";															
				}
				iFRCount++;
			}
			strRetValue += "</table>";
			strRetValue += "</td>";
			strRetValue += "</tr>";									
			if(iFCount==iFSize){
				strRetValue += "<tr><td colspan=2><input type=image src='ImageStream?ImageName=plus.gif' name=addANDFact title='Add Fact' width=10 height=10></input></td></tr>";										
			}else{
				strRetValue += "<tr><td colspan=2><hr/></td></tr>";														
			}
			iFCount++;
		}
		strRetValue += "\n</table>";
		strRetValue += "\n</td>";
		strRetValue += "\n</tr>";
		strRetValue += "\n</table>";
		strRetValue += "\n</td>";
		strRetValue += "\n</tr>";
		strRetValue += "\n</table>";
		return strRetValue;
    }
    public String showExposureAssessment(boolean bReadOnly,Agent agent,Assessment assessment,Assessment autoAssessment,Study study) throws Exception {
    	return this.showExposureAssessment(bReadOnly,agent,assessment,autoAssessment,null,study);
    }
	public String showExposureAssessment(boolean bReadOnly,Agent agent,Assessment assessment,Assessment autoAssessment,Participant participant,Study study) throws Exception {
    	String retValue = "";
    	
    	retValue += "<table border=1>";
    	retValue += "<tr><td colspan=5><b>Exposure Assessment for "+agent.getName()+"</b></td></tr>";
    	retValue += "<tr><td></td><td colspan=4 align=center><b>Assessment</b></td>";
    	retValue += "<tr><td>Probability</td><td colspan=2>";
    	retValue += this.showExposureProbability(assessment.getExposure());
    	retValue += "</td><td>";
    	retValue += "Auto:";       
    	retValue += autoAssessment.getExposure();        
    	retValue += "</td>";
    	retValue += "</tr>";
       	retValue += "<tr>";
    	retValue += "<td>Level</td><td colspan=2>";
    	retValue += this.showExposureLevel(assessment.getLevel());
    	retValue += "</td><td>";
    	retValue += "Auto:";   
    	retValue += autoAssessment.getLevel();
    	retValue += "</td>";
    	retValue += "</tr>";
    	
    	
       	retValue += "<tr>";
    	retValue += "<td>Frequency weeks/yr</td><td colspan=2>";
    	retValue += this.showExposureFrequencyWeeks(assessment.getFrequencyweeks());
    	retValue += "</td><td>";
    	retValue += "Auto:";   
    	String weeks = String.valueOf(autoAssessment.getFrequencyweeks());
    	if(weeks.equalsIgnoreCase("-1.0")){
    		weeks = "";
    	}
    	retValue +=  weeks;
    	retValue += "</td>";
    	retValue += "</tr>";
    	
    	
       	retValue += "<tr>";
    	retValue += "<td>Frequency hours/week</td><td colspan=2>";
    	if(study.hasOption(Study.Option.CAT3FREQ)){
        	retValue += this.showExposureFrequencyHours3Cat(assessment.getFrequencyhours());
        }else{
        	retValue += this.showExposureFrequencyHours(assessment.getFrequencyhours());
        }
    	retValue += "</td><td>";
    	retValue += "Auto:";   
    	String hours = String.valueOf(autoAssessment.getFrequencyhours());
    	if(hours.equalsIgnoreCase("-1.0")){
    		hours = "";
    	}else if(hours.equalsIgnoreCase("3333.0")){
    		hours = "&gt;30 hours per week";
    	}else if(hours.equalsIgnoreCase("2222.0")){
    		hours = "5-30 hours per week";
    	}else if(hours.equalsIgnoreCase("1111.0")){
    		hours = "&lt;5 hours per week";
    	}
    	retValue += hours;
    	retValue += "</td>";
    	retValue += "</tr>";
    	
    	retValue += "<tr>";
    	retValue += "<td>Comments";
    	retValue += "</td>";
        retValue += "<td colspan=3 align=center>";
        retValue += "<textarea name=comments cols=20 rows=3 >"+assessment.getComments()+"</textarea>";
        
        retValue += "</td>";
        retValue += "</tr>";
    	retValue += "<tr>";
        retValue += "<td colspan=4 align=center>";
        String disabled = "";
        if(bReadOnly){
        	disabled = " disabled ";
        }
        retValue += "<input type=submit name=Save value=Save "+disabled+"></input><input type=submit name=RemoveAssessment value=Clear "+disabled+"></input><input type=hidden name=Action value=SaveAssessment "+disabled+"></input><input type=hidden name=AgentID value="
            + assessment.getAgentId()
            + "></input><input type=hidden name=jobHistoryID value="
            + assessment.getJobHistoryId()
            + " "+disabled+"></input> ";
        retValue += "<input type=submit name=UseAuto value=\"Use Auto\" "+disabled+"></input>";
        if(participant != null){
        	retValue += "<input type=submit name=UsePrevious value=\"Use\" onclick=\"return confirmValueSelected('jobHistory')\" "+disabled+"></input>";
        	retValue += "<select name=jobHistory id=jobHistory>";
    		retValue += "<option selected value=NULL></option>";
    		for(JobHistory jh: participant.getJobHistories()){
        		retValue += "<option value=" + jh.getId() + ">" + jh.getName() + "</option>";
        	}
    		retValue += "</select>";
    		retValue += "<input type=checkbox name=allAgents />All Agents";
        }
    	retValue += "</td>";
        retValue += "</tr>";
    	retValue += "</table>";
    	return retValue;
    }   
	private String showExposureLevel(String level) {
    	String retValue = "";
    	retValue += "<table>";
        retValue += "<tr>";      
        retValue += "<td><select name=Level>";
        if ((level == null) || (level.equalsIgnoreCase("")) || (level.equalsIgnoreCase("null")) || (level.equalsIgnoreCase("None"))) {
        	retValue += "<option value='' selected></option><option value='Unknown'>Unknown</option><option value='Low'>Low</option><option value='Medium'>Medium</option><option value='High'>High</option>";
        } else if (level.equalsIgnoreCase("Unknown")) {
            retValue += "<option value=''></option><option value='Unknown' selected>Unknown</option><option value='Low' >Low</option><option value='Medium'>Medium</option><option value='High'>High</option>";
        } else if (level.equalsIgnoreCase("Low")) {
            retValue += "<option value=''></option><option value='Unknown'>Unknown</option><option value='Low' selected>Low</option><option value='Medium'>Medium</option><option value='High'>High</option>";
        } else if (level.equalsIgnoreCase("Medium")) {
            retValue += "<option value=''></option><option value='Unknown'>Unknown</option><option value='Low'>Low</option><option value='Medium' selected>Medium</option><option value='High'>High</option>";
        } else if (level.equalsIgnoreCase("High")) {
            retValue += "<option value=''></option><option value='Unknown'>Unknown</option><option value='Low'>Low</option><option value='Medium'>Medium</option><option value='High' selected>High</option>";
        }
        retValue += "</select></td>";
        retValue += "</tr>";       
        retValue += "</table>"; 
        return retValue;
	}
	private String showExposureFrequencyWeeks(float weeks) {
    	String retValue = "";
    	retValue += "<table>";
        retValue += "<tr>";      
        retValue += "<td><input size=3 type=text name=Weeks value="+weeks+" /></td>";
        retValue += "</tr>";       
        retValue += "</table>"; 
        return retValue;
	}
	private String showExposureFrequencyHours(float hours) {
    	String retValue = "";
    	retValue += "<table>";
        retValue += "<tr>";      
        retValue += "<td><input size=3 type=text name=Hours value="+hours+" /></td>";
        retValue += "</tr>";       
        retValue += "</table>"; 
        return retValue;
	}
	private String showExposureFrequencyHours3Cat(float hours) {
    	String retValue = "";
    	retValue += "<table>";
        retValue += "<tr>";      
        retValue += "<td>";
        retValue += "\n<select name=Hours>";
          
        retValue += "<option></option>"; 
        String strSelected = "";
	    if (hours==1111) {
	    	strSelected = "selected";
	    }
	    retValue += "<option value=1111 " + strSelected + " >&lt;5 hours per week</option>";
	    strSelected = "";
	    if (hours==2222) {
	        strSelected = "selected";
	    }
	    retValue += "<option value=2222 " + strSelected + " >5-30 hours per week</option>";
	    strSelected = "";
	    if (hours==3333) {
	        strSelected = "selected";
	    }
	    retValue += "<option value=3333 " + strSelected + " >&gt;30 hours per week</option>";
	
	    if(strSelected.equalsIgnoreCase("")){
	    	retValue += "<option value=" + hours + " selected>"+hours+"</option>";
	    }
	    retValue += "</select>";
        retValue += "</td>";
        retValue += "</tr>";       
        retValue += "</table>"; 
        return retValue;
	}
	private String showExposureProbability(String exposure) {
    	String retValue = "<table><tr>";   
    	retValue += "<td><select name=Exposure>";
        if ((exposure == null) || (exposure.equalsIgnoreCase(""))|| (exposure.equalsIgnoreCase("NULL"))) {
            retValue += "<option value='' selected></option><option value='None'>None</option><option value='Possible'>Possible</option><option value='Probable'>Probable</option>";
        } else if (exposure.equalsIgnoreCase("None")) {
            retValue += "<option value=''></option><option value='None' selected>None</option><option value='Possible'>Possible</option><option value='Probable'>Probable</option>";
        } else if (exposure.equalsIgnoreCase("Possible")) {
            retValue += "<option value=''></option><option value='None'>None</option><option value='Possible' selected>Possible</option><option value='Probable'>Probable</option>";
        } else if (exposure.equalsIgnoreCase("Probable")) {
            retValue += "<option value=''></option><option value='None'>None</option><option value='Possible'>Possible</option><option value='Probable' selected>Probable</option>";
        }
        retValue += "</select></td>";
        retValue += "</tr>";	     	        
        retValue += "</table>"; 
        return retValue;
	}
    public String showExposureAssessmentDetails(Assessment assessment) throws Exception {

        String strHTML = "";
        strHTML += "<table>";
        strHTML += "<tr>";
        boolean bIsAssessed = false;
        if(!(assessment.getId().equalsIgnoreCase(""))){
        	bIsAssessed = true;
        }
        if(bIsAssessed){
	        if ((assessment.getExposure() != null) && (!(assessment.getExposure().equalsIgnoreCase("")))) {
	        	strHTML += "<td nowrap><b>Exposure:</b>&nbsp;"+assessment.getExposure()+"";
	        	if(!(assessment.getExposure().equalsIgnoreCase("None"))){
	        		strHTML += "<br><b>Level:</b>&nbsp;";
	    	        strHTML += "";
	    	        if ((assessment.getLevel() != null) && (!(assessment.getLevel().equalsIgnoreCase("")))) {
	    	            strHTML += ""+assessment.getLevel() + "";
	    	        }else{
	    	        	strHTML += "";
	    	        }
	    	        strHTML += "<br><b>Frequency:</b>";
	    	        strHTML += "";
	    	        strHTML += "&nbsp;"
	    	                + assessment.getFrequencyweeks()
	    	                + "&nbsp;wks&nbsp;"
	    	                + assessment.getFrequencyhours()
	    	                + "&nbsp;hrs</td>";
	        	}
	        } else{
	        	strHTML += "<td>NS</td>";
	        }
	        
	        if (assessment.getDontknow().equalsIgnoreCase("on")) {
	            strHTML += "<td>Don't Know</td>";
	        }  
        }else{
        	if(!(assessment.getId().equalsIgnoreCase(""))){
        		strHTML += "<td>NS</td>";
            }	
        }
        strHTML += "</tr>";
        strHTML += "</table>";
        return strHTML;
    }
    public String showExposureAssessmentDetails(String agentID, JobHistory jh) throws Exception {
    	return this.showExposureAssessmentDetails(agentID,jh,"");
    }
    public String showExposureAssessmentDetails(String agentID, JobHistory jh,String assessor) throws Exception {
    	String assessorUserName = "";
    	if(!(assessor.equalsIgnoreCase(""))){
    		assessorUserName = "AND (assessorusername = '"+assessor+"')";
    	}else{
    		assessorUserName = "AND (NOT(assessorusername = 'OccIDEAS'))";
    	}
        String strSQL = "SELECT id, jobhistoryid, agentid, exposure, level, frequencyweeks," +
        " frequencyhours, dontknow, assessorusername, assessorid, comments " +
        " FROM agentassessments " +
        " WHERE (jobhistoryid = " + jh.getId()+ ") AND (agentid = "+agentID+") "+assessorUserName;
        ResultSet rs = null;
        String exposure = "";
        String level = "";
        String weeks = "";
        String hours = "";
        String dontknow = "";
        Agent agent = new Agent(agentID);
        try {
            rs = agent.sqlExecuteSelect(strSQL);
            if (rs != null) {
                if (rs.next()) {
                    exposure = rs.getString("exposure");
                    level = rs.getString("level");
                    weeks = rs.getString("frequencyweeks");
                    hours = rs.getString("frequencyhours");
                    dontknow = rs.getString("dontknow");
                }
                if (rs.getStatement() != null) {
                    rs.getStatement().close();
                }
                rs.close();
            }
        } catch (SQLException e) {
            //System.out.println(e.getMessage());
            throw new Exception(e.getMessage());
        } finally {
            agent.closeConnection();
        }

        String strHTML = "";
        strHTML += "<table>";
        strHTML += "<tr>";
        boolean bIsAssessed = false;
        if(!(assessor.equalsIgnoreCase(""))){
        	bIsAssessed = jh.isAgentAssessedBy(agent.getId(),assessor);
        }else{
        	bIsAssessed = jh.isAgentAssessedAuto(agent.getId());
        }
        if(bIsAssessed){
	        if ((exposure != null) && (!(exposure.equalsIgnoreCase("")))) {
	        	strHTML += "<td nowrap><b>Exposure:</b>&nbsp;"+exposure+"";
	        	if(!(exposure.equalsIgnoreCase("None"))){
	        		strHTML += "<br><b>Level:</b>&nbsp;";
	    	        strHTML += "";
	    	        if ((level != null) && (!(level.equalsIgnoreCase("")))) {
	    	            strHTML += ""+level + "";
	    	        }else{
	    	        	strHTML += "";
	    	        }
	    	        strHTML += "<br><b>Frequency:</b>";
	    	        strHTML += "";
	    	        strHTML += "&nbsp;"
	    	                + weeks
	    	                + "&nbsp;wks&nbsp;"
	    	                + hours
	    	                + "&nbsp;hrs</td>";
	        	}
	        } else{
	        	strHTML += "<td>NS</td>";
	        }	        
	        if (dontknow.equalsIgnoreCase("on")) {
	            strHTML += "<td>Don't Know</td>";
	        }  
        }else{
        	if(!(assessor.equalsIgnoreCase(""))){
        		strHTML += "<td>NS</td>";
            }else{
            	strHTML += "<td>NS</td>";
            }	
        }
        strHTML += "</tr>";
        strHTML += "</table>";
        return strHTML;
    }
    public String showReadyJobHistories(String selId, List<JobHistory> jobHistories,Study study) throws Exception {
    	String strHTML = "";
    	strHTML += this.showTitleBarAndCloseButton("Assessment Participant View", "closeEdit");
        strHTML += "\n<table class=ContentList>";
        
        strHTML += "<tr class=ListHeader><td align=center>Assessments</td><td>Complete</td><td>Reference</td><td>Job Title</td><td>JSM</td><td>JH Status</td></tr>";
        for (JobHistory jh : jobHistories) {
            String action ="";
            String status = jh.getStatusName();    
            if(jh.getStatusId().equalsIgnoreCase(JobHistoryStatus.TOBEREVIEWED)){
            	status = "<span class=warning title='This Job History needs to be reviewed'>"+status+"</span>";
        	}else if(jh.getStatusId().equalsIgnoreCase(JobHistoryStatus.TOBEINTERVIEWED)){
        		status = "<span class=warning title='This Job History needs to be interviewed'>"+status+"</span>";
        	}
            action = this.showManualAssessments(jh,study);
            String jsmlink = jh.getFinalJSMName();            
            strHTML += "<tr ><td align=center>"
                    +action+"</td><td align=center>"+jh.isAllManuallyAssessed(study)+"</td><td ><a href=ControllerServlet?Action=ViewAssessments&jobhistoryID="+jh.getId()+">"
                    +jh.getReferenceNumber()+"</a></td><td>"
                    +jh.getJobDescription()+"</td><td>"
                    +jsmlink+"</td><td>"
                    +status+"</td></tr>";
        }
        strHTML += "</table>";
        return strHTML;
    }
	public String showStudyWithJobHistoryAgents(Study study, Participant participant, JobHistory jobHistory, String agentId,ArrayList<Agent> agents) throws Exception {
		String strRetValue = "<table class=LHSMenuContent>";
        strRetValue += "\n<tr><td style='padding-left: 5px' class=\"Highlight\" colspan=2><a href=main.jsp?jobhistoryID="
                + jobHistory.getId()
                + ">"
                + participant.getReferenceNumber()
                + " - "
                + jobHistory.getReferenceNumber()
                + "</a></td></tr>";
        boolean bAgentFound = false;
        for (Agent agent : agents) {
        	String manualAssessmentFlag = "";
        	String autoAssessmentsFlag = "";
            if(jobHistory != null){
                if (jobHistory.isAgentAssessedManual(agent.getId())) {
                	String outcome = jobHistory.getManualAssessment(agent.getId()).getOutCome();
                    manualAssessmentFlag += "<div style='float: left;' class="+outcome+" title='Manual "+agent.getName()+" "+outcome+"'>&nbsp;</div>";
                }
                if (jobHistory.isAgentAssessedAuto(agent.getId())) {
                	String outcome = jobHistory.getAutoAssessment(agent.getId()).getOutCome();
                    autoAssessmentsFlag += "<div style='float: left;' class="+outcome+" title='Auto "+agent.getName()+" "+outcome+"'>&nbsp;</div>";
                }
            }
            String strClass = "";
            if (agent.getId().equalsIgnoreCase(agentId)) {	
            	strClass = "class=\"Highlight\"";
            	bAgentFound = true;
            } else {
            	strClass = "class=\"agents\"";
            }
            strRetValue += "\n<tr><td style='padding-left: 10px' nowrap "+strClass+"><a href=main.jsp?agentID="
                + agent.getId()
                + ">"
                + agent.getName()
                + "</a></td><td >"+manualAssessmentFlag+"</td><td >"+autoAssessmentsFlag+"</td></tr>";
        }
        if(!(agentId.equalsIgnoreCase(""))){
        	if(!bAgentFound){
            	Agent agent = new Agent(agentId);
            	String tickHTML = "";

                if(jobHistory != null){
                    if (jobHistory.isAgentAssessedAuto(agent.getId())) {
                    	String outcome = jobHistory.getAutoAssessment(agent.getId()).getOutCome();
                        tickHTML = "<div class="+outcome+">&nbsp;</div>";
                    }
                }
                String strClass = "";
                if (agent.getId().equalsIgnoreCase(agentId)) {	
                	strClass = "class=\"Highlight\"";
                	bAgentFound = true;
                } else {
                	strClass = "class=\"agents\"";
                }
                strRetValue += "\n<tr><td style='padding-left: 10px' nowrap "+strClass+"><a href=main.jsp?agentID="
                    + agent.getId()
                    + ">"
                    + agent.getName()
                    + "</a></td><td>"+tickHTML+"</td></tr>";
            }
        }
        strRetValue += "</table>";
        return strRetValue;
	}
	public String showAgentAssessmentReport(List<JobHistory> jhs,Agent agent,String selId,String selJSMId,Study study,boolean bShowJHDetail,int iPageNr,int iPageSize,int iTotalCount) throws Exception {
		String strRetValue = "<table class=ContentList>";
		strRetValue += "<tr class=ListHeader>";
		int iStartNr = ((iPageNr-1)*iPageSize)+1;
		int iEndNr = (iStartNr+iPageSize)-1;
		if(iEndNr>iTotalCount){
			iEndNr = iTotalCount;
		}
    	strRetValue += "<td nowrap align=center class=small >"+iStartNr+" - "+iEndNr+" of "+iTotalCount+"</td>";       
		strRetValue += "<td rowspan=2>Job History Reference</td>";	
		strRetValue += "<td style='border-bottom: 1px solid #b2b2b2'>Status Filter on:</td>";
		strRetValue += "<td style='border-bottom: 1px solid #b2b2b2'>JSM</td>";
		strRetValue += "<td nowrap>Manual Assessment</td>";
		strRetValue += "<td nowrap>Auto Assessment</td>";
		strRetValue += "<td rowspan=2>Comments</td>";
		strRetValue += "</tr>";
		strRetValue += "<tr class=ListHeader><td><img alt='Select All' id=selectAllImage name=selectAllImage src='ImageStream?ImageName=unchecked.gif' onclick=swapSelectAllImage(this); /></td>";
		JobHistoryStatus jhss = new JobHistoryStatus();
		strRetValue += "<td>"+this.showCombo(selId,"jhStatus",jhss.getAssessmentJobHistoryStatuses(),true,true,false)+"</td>";
		if(study==null){
			strRetValue += "<td></td>";	
		}else{
			strRetValue += "<td>"+this.showCombo(selJSMId,"jhJSM",study.getStudySpecificJsms(),true,true,false)+"</td>";					
		}
		strRetValue += "<td >";
		strRetValue += "<div style='float:left;padding:2px;' class=PROBABLEHIGH><a href=main.jsp?assessmentType=Manual&exposureFilter=PROBABLEHIGH>H</a></div>";
		strRetValue += "<div style='float:left;padding:2px;' class=PROBABLEMEDIUM><a href=main.jsp?assessmentType=Manual&exposureFilter=PROBABLEMEDIUM>M</a></div>";
		strRetValue += "<div style='float:left;padding:2px;' class=PROBABLELOW><a href=main.jsp?assessmentType=Manual&exposureFilter=PROBABLELOW>L</a></div>";
		strRetValue += "<div style='float:left;padding:2px;' class=PROBABLEUNKNOWN><a href=main.jsp?assessmentType=Manual&exposureFilter=PROBABLEUNKNOWN>U</a></div>";
		strRetValue += "<div style='float:left;padding:2px;' class=POSSIBLEUNKNOWN><a href=main.jsp?assessmentType=Manual&exposureFilter=POSSIBLEUNKNOWN>P</a></div>";
		strRetValue += "<div style='float:left;padding:2px;' class=NONE><a href=main.jsp?assessmentType=Manual&exposureFilter=NONE>N</a></div>";
		strRetValue += "<div style='float:left;padding:2px;' title='Not Set'><a href=main.jsp?assessmentType=Manual&exposureFilter=NS>NS</a></div>";
		strRetValue += "</td>";
		strRetValue += "<td >";
		strRetValue += "<div style='float:left;padding:2px;' class=PROBABLEHIGH><a href=main.jsp?assessmentType=Auto&exposureFilter=PROBABLEHIGH>H</a></div>";
		strRetValue += "<div style='float:left;padding:2px;' class=PROBABLEMEDIUM><a href=main.jsp?assessmentType=Auto&exposureFilter=PROBABLEMEDIUM>M</a></div>";
		strRetValue += "<div style='float:left;padding:2px;' class=PROBABLELOW><a href=main.jsp?assessmentType=Auto&exposureFilter=PROBABLELOW>L</a></div>";
		strRetValue += "<div style='float:left;padding:2px;' class=PROBABLEUNKNOWN><a href=main.jsp?assessmentType=Auto&exposureFilter=PROBABLEUNKNOWN>U</a></div>";
		strRetValue += "<div style='float:left;padding:2px;' class=POSSIBLEUNKNOWN><a href=main.jsp?assessmentType=Auto&exposureFilter=POSSIBLEUNKNOWN>P</a></div>";
		strRetValue += "<div style='float:left;padding:2px;' class=NONE><a href=main.jsp?assessmentType=Auto&exposureFilter=NONE>N</a></div>";
		strRetValue += "</td>";
		strRetValue += "</tr>";
		//int i = 0;
		for(JobHistory jh: jhs){
			//i++;
			jh.getPersistentObject();
			Participant p = new Participant(Long.valueOf(jh.getParticipantId()));
			strRetValue += "<tr>";
			strRetValue += "<td><input type=checkbox name=jhCheckBox_"+ jh.getId()+ " /></td>";
			strRetValue += "<td ><a href=main.jsp?Location=Participants&participantID="+p.getParticipantId()+"&agentID="+agent.getId()+"&jobhistoryID="+jh.getId()+">"+p.getReferenceNumber()+":"+jh.getReferenceNumber()+"</a></td>";
			strRetValue += "<td align=center>"+jh.getStatusName()+"</td>";
			String jsmname = "";
			jsmname = jh.getFinalJSMName();
			strRetValue += "<td >"+jsmname+"</td>";
			if(agent.getId().equalsIgnoreCase("")){
				strRetValue += "<td class=warning colspan=3>Please select agent</td>";
			}else{
				Assessment assessment = jh.getManualAssessment(agent.getId());
				Assessment autoAssessment = jh.getAutoAssessment(agent.getId());
				String underline = "";
				if(assessment.isSame(autoAssessment)){
					underline = "";
				}else{
					underline = "class=warning";
				}
				strRetValue += "<td "+underline+">"+this.showExposureAssessmentDetails(assessment)+"</td>";
				strRetValue += "<td "+underline+">"+this.showExposureAssessmentDetails(autoAssessment)+"</td>";
				strRetValue += "<td "+underline+">"+assessment.getComments()+"</td>";
			}			
			strRetValue += "</tr>";
			if(bShowJHDetail){
				strRetValue += "<tr style='background-color: #e7f4fc;'><td style='padding-left: 20px' colspan=7>"+this.showJobHistoryDetail(jh)+"</td></tr>";
			}			
		}		
		strRetValue += "</table>";
		return strRetValue;		
	}
	public String showReportExcel(List<JobHistory> jhs,String agentID,String selId,String selJSMId,Study study) throws Exception {
		String strRetValue = "";     
		strRetValue += "Job History Reference,";		
		strRetValue += "Status Filter,";
		strRetValue += "JSM,";
		strRetValue += "Manual Assessment,";
		strRetValue += "Auto Assessment,";
		strRetValue += "Comments";
		strRetValue += "\n";		
		for(JobHistory jh: jhs){
			jh.getPersistentObject();
			Participant p = new Participant(Long.valueOf(jh.getParticipantId()));
			strRetValue += p.getReferenceNumber()+",";
			strRetValue += jh.getStatusName()+",";
			String jsmname = "";					
			jsmname = jh.getFinalJSMName();
			strRetValue += jsmname+",";			
			Assessment assessment = jh.getManualAssessment(agentID);
			Assessment autoAssessment = jh.getAutoAssessment(agentID);			
			strRetValue += this.showExposureAssessmentDetailsExcel(assessment)+",";
			strRetValue += this.showExposureAssessmentDetailsExcel(autoAssessment)+",";
			strRetValue += assessment.getComments()+"";						
			strRetValue += "\n";			
		}
		return strRetValue;		
	}
	private String showExposureAssessmentDetailsExcel(Assessment assessment) {
		String strValue = "";
        strValue += "";
        strValue += "";
        boolean bIsAssessed = false;
        if(!(assessment.getId().equalsIgnoreCase(""))){
        	bIsAssessed = true;
        }
        if(bIsAssessed){
	        if ((assessment.getExposure() != null) && (!(assessment.getExposure().equalsIgnoreCase("")))) {
	        	strValue += "Exposure:"+assessment.getExposure()+"";
	        	if(!(assessment.getExposure().equalsIgnoreCase("None"))){
	        		strValue += "-Level:";
	    	        strValue += "";
	    	        if ((assessment.getLevel() != null) && (!(assessment.getLevel().equalsIgnoreCase("")))) {
	    	            strValue += ""+assessment.getLevel() + "";
	    	        }else{
	    	        	strValue += "";
	    	        }
	    	        strValue += "-Frequency:";
	    	        strValue += "";
	    	        strValue += ""
	    	                + assessment.getFrequencyweeks()
	    	                + "wks:"
	    	                + assessment.getFrequencyhours()
	    	                + "hrs";
	        	}
	        } else{
	        	strValue += "NS";
	        }
	        
	        if (assessment.getDontknow().equalsIgnoreCase("on")) {
	            strValue += "Don't Know";
	        }  
        }else{
        	if(!(assessment.getId().equalsIgnoreCase(""))){
        		strValue += "NS";
            }	
        }
        strValue += "";
        strValue += "";
        return strValue;
	}
	private String showJobHistoryDetail(JobHistory jh) throws Exception {
		String retValue = "";
    	retValue += "<table class=ContentList>";
        retValue += "<tr style='background-color: #f4f9fb'><td>Title<td><b>" + jh.getJobDescription() + "</b></td>";
        //retValue += "<td>Tasks<td><b>" + jh.getDuties() + "</b></td>";
        retValue += "<td>Age</td><td><b>" + jh.getAge() + "</b></td>";
        retValue += "<td>Started</td><td><b>" + jh.getYearStarted() + "</b></td>";       	     
        retValue += "<td>Duration</td><td><b>" + jh.getDurationYears() + "</b></td>";
        retValue += "<td>Weeks</td><td><b>" + jh.getWeeksPerYear() + "</b></td>";
        retValue += "<td>Hours</td><td><b>" + jh.getHoursPerWeek() + "</b></td>";
        retValue += "<td>Employer</td><td><b>" + jh.getEmployer() + "</b></td>";
        retValue += "<td>Suburb</td><td><b>" + jh.getSuburb() + "</b></td>";
        retValue += "<td>State</td><td><b>" + jh.getState() + "</b></td>";
        retValue += "<td>Country</td><td><b>" + jh.getCountry() + "</b></td></tr>";
        retValue += "</table>";
        return retValue;
	}
	public String showNavTitle(Question q, PossibleAnswer a,JobHistory jh) {
		String strRetValue = "<table>";
		strRetValue += "<tr>";
		strRetValue += "<td class=jobhistories>Back To Job History: <a href=main.jsp?Location=Participants&participantID="+jh.getParticipantId()+"&jobhistoryID="+jh.getId()+">"+jh.getReferenceNumber()+"</a></td>";
		strRetValue += "</tr>";
		strRetValue += "<tr>";
		strRetValue += "<td class=searchHighlight><b>Report On:</b> Assessments for those participants that answered the question <b><i>"+q.getDescription()+"</i></b>";
		strRetValue += " as <b><i>"+a.getName()+"</i></b></td>";
		strRetValue += "</tr>";
		strRetValue += "</table>";
		return strRetValue;
	}
	public String showNavTitle(ArrayList<Object> arrayL) {
        String strNavTitle = "<table width=100% class=NavTitle cellspacing=0><tr><td style='width:90%;text-align:left;'>";
        String strClassName = "";
        String navPath = "";
        String wikiPage = "";
        int pos = 0;
        int count = 1;
        
        for(Object obj: arrayL) {
        	if(obj!=null){
        		if (obj instanceof String) {
        			String strLocation =(String)obj;
        			navPath += strLocation + "_";
    				if(strLocation.equalsIgnoreCase("Next")){
	                    strNavTitle += "<a href=ControllerServlet?Action=Next onclick=\"return showProgress()\"><img border=0 src='ImageStream?ImageName=moveright.gif' alt=next /></a>";   	                    
	            	}else if(strLocation.equalsIgnoreCase("Previous")){
	                    strNavTitle += "<a href=ControllerServlet?Action=Previous onclick=\"return showProgress()\"><img border=0 src='ImageStream?ImageName=moveleft.gif' alt=previous /></a>";   	                    
	            	} else if(strLocation.equalsIgnoreCase("To Excel")){
	                    strNavTitle += "<a href=ControllerServlet?Action=ShowReportExcel ><img border=0 width=16px height=16px src='ImageStream?ImageName=toExcel.jpg' alt='To Excel' /></a>";
  					}else if(strLocation.contains("Questionnaire/")||strLocation.contains("Studies/")||strLocation.contains("Assessment/")){
  						//do nothing
	            	}else if(strLocation.contains("PROB")||strLocation.contains("POSS")||strLocation.contains("NONE")){
	            		strNavTitle += strLocation+">";
	            	}else if(strLocation.contains("Assessment:")){
	            		strNavTitle += strLocation+">";
	            	}else if(strLocation.contains("[Clear]")){
	            		strNavTitle += "<a href=main.jsp?ClearFilters="+strLocation+ " onclick=\"return showProgress()\">"+strLocation+":</a>>";
	            	}else{
    					strNavTitle += "<a href=main.jsp?Location="+strLocation+ " onclick=\"return showProgress()\">"+strLocation+":</a>>";  
	            	}         		
            	}else if (obj instanceof DBBaseObject){
            		DBBaseObject dbobj = (DBBaseObject)obj;
            		strClassName = dbobj.getClass().toString().replace(" ",".");
    	        	pos = dbobj.getClass().toString().lastIndexOf(".")+1;
    	        	strClassName = dbobj.getClass().toString().substring(pos);
    	        	if(strClassName.equalsIgnoreCase("JobSpecificModule")){
    	        		strClassName = "JSM";
    	        	}else if(strClassName.equalsIgnoreCase("ExpertAgent")){
    	        		strClassName = "Agent";
    	        	}else if(strClassName.equalsIgnoreCase("ExpertRule")){
    	        		strClassName = "Rule";
    	        	}
    	        	if (count == arrayL.size()) {
    	            	strNavTitle += strClassName+":"+dbobj.getName()+">";
    	        	}else{
    	        		if(strClassName.equalsIgnoreCase("Study")){
        	            	strNavTitle += "<a href=main.jsp?Location=Studies&"+strClassName.toLowerCase()+"ID="+dbobj.getId()+"&keepJSM=true >"+this.truncateName(dbobj.getName(),this.AGENTLENGTH)+":</a>>";        		      	        		
        	        	}else if(strClassName.equalsIgnoreCase("ParticipantStatus")){
        	        		strNavTitle += dbobj.getName()+">";
        	        	}else{
        	            	strNavTitle += "<a href=main.jsp?"+strClassName.toLowerCase()+"ID="+dbobj.getId()+" >"+strClassName+":</a>"+this.truncateName(dbobj.getName(),this.AGENTLENGTH)+">";        		      	        		
        	        	}
    	        	}	        	
            	}		
        	}       	
        	++count;
        }
		wikiPage = Util.getWikiPage(navPath);

        strNavTitle += "</td><td style='width:10%;text-align:right;' title='OccIDEAS Wiki Help'>" +
		"<a href='http://wiki.occideas.org/JSPWiki/Wiki.jsp";
		if (!wikiPage.equals("")) {
			strNavTitle += "?page=" + wikiPage;
		}
		strNavTitle += "' target='_blank'>" 
			+ "Help</a>" 
			+ "</td></tr></table>";

        return strNavTitle;
    }
	public String showStudyWithJSMs(Study study, String selJSMId,int pageSize, int pageNumber, int totalPages,boolean bShowPageNrs) throws Exception {
		String strRetValue = "<table class=LHSMenuContent>";
		strRetValue += "<tr ><td colspan=2><b>Mapped JSMs</td></tr>";		
        ArrayList<JobSpecificModule> jsms = study.getStudySpecificJsms();
        for (JobSpecificModule jsm : jsms) {
        	String strClass= "";
            if (jsm.getId().equalsIgnoreCase(selJSMId)) {
            	strClass= "class=\"Highlight\"";
            } 
            String shortName = this.truncateName(jsm.getName(),this.JSMLENGTH);           
            strRetValue += "<tr ><td>&nbsp;</td><td "+strClass+" title='"+jsm.getName()+"'><a href=main.jsp?jsmID="
                + jsm.getId()
                + ">"
                + shortName
                + "</a></td><td></td></tr>";
        }
        strRetValue += "<tr ><td colspan=2 style='border-top: 1px solid #2484ab;padding-left:10px;' ><a href=main.jsp?jhStatus="
            + JobHistoryStatus.NOTTOBEINTERVIEWEDTIME
            + ">No Time</a></td></tr>";
        
        strRetValue += "<tr ><td colspan=2><b>Other Job Histories</td></tr>";
        strRetValue += "<tr ><td>&nbsp;</td><td ><a href=main.jsp?jhStatus="
            + JobHistoryStatus.NOTTOBEINTERVIEWEDNOJSM
            + ">No Appropriate JSM</a></td></tr>";
        strRetValue += "<tr ><td>&nbsp;</td><td ><a href=main.jsp?jhStatus="
            + JobHistoryStatus.NOTTOBEINTERVIEWEDSCOPE
            + ">Not In Scope</a></td></tr>";
        strRetValue += "<tr ><td>&nbsp;</td><td ><a href=main.jsp?jhStatus="
            + JobHistoryStatus.UNEXPOSEDJOB
            + ">Unexposed Job</a></td></tr>";
        strRetValue += "</table>";
        if(bShowPageNrs){			       	
	        if(!(selJSMId.equalsIgnoreCase(""))){
	        	//int itemsOnPage = pageSize;
	        	
	            //int totalPages = Util.getTotalPagesFromPagedItems(study.getJobHistoriesForAssessment(selJSMId).size(), itemsOnPage);    
	            //If a user is on the last page then selects search,'participantPage' should be returned to 1
	            if (pageNumber > totalPages){pageNumber = 1;}
	            int prevPage = pageNumber - 1;
	            if (prevPage < 1){prevPage = 1;}      
	            int nextPage = pageNumber + 1;
	            if (nextPage > totalPages){nextPage = totalPages;}       
	            //show 'page x of y' text
	            strRetValue += showPaging(prevPage,pageNumber, totalPages, nextPage, false);
	            //show box for changing page size 
	            strRetValue += showPageSize(pageSize);
	        }  else{
	        	//int itemsOnPage = pageSize;
	            //int totalPages = Util.getTotalPagesFromPagedItems(study.getJobHistoriesForAssessment().size(), itemsOnPage);    
	            //If a user is on the last page then selects search,'participantPage' should be returned to 1
	            if (pageNumber > totalPages){pageNumber = 1;}
	            int prevPage = pageNumber - 1;
	            if (prevPage < 1){prevPage = 1;}      
	            int nextPage = pageNumber + 1;
	            if (nextPage > totalPages){nextPage = totalPages;}       
	            //show 'page x of y' text
	            strRetValue += showPaging(prevPage,pageNumber, totalPages, nextPage, false);
	            //show box for changing page size 
	            strRetValue += showPageSize(pageSize);
	        }
        }
        return strRetValue;
    }
	public String showStudyWithAgents(Study study, String selAgentId,int pageSize, int pageNumber, int iTotal) throws Exception {
		String strRetValue = "<table class=LHSMenuContent>";
        strRetValue += "\n<tr><td class=small></td><td class=small></td></tr>";
        AgentGroup ag = new AgentGroup();
		for (AgentGroup agentGroup : ag.getAgentGroups()){
			String groupHeader = "";
			boolean firstAgent = true;
			for (Agent agent : study.getAgents()){
				if(agentGroup.getAgents().contains(agent)) {
					String highlight = "";
					if(firstAgent == true){
						groupHeader = "\n<tr><td>" + agentGroup.getName() + "</td></tr>";
					}else{
						groupHeader = "";
					}
					firstAgent = false;
					strRetValue += groupHeader;
					if (agent.getId().equalsIgnoreCase(selAgentId)) {
						highlight = "class=Highlight";			
					} else{
						highlight = "class=LHSMenuAgents";
					}
					strRetValue += "\n<tr><td "+highlight+" title='" + agent.getName() + "'><a name=anchor_"
						+ agent.getId()
						+ "></a><a href=main.jsp?agentID=" + agent.getId()
						+ " onclick=\"return showProgress()\">" + this.truncateName(agent.getName(),this.AGENTLENGTH)
						+ "</a></td></tr>";
				}
			}
		}  
		strRetValue += "</table>";
        int totalPages = Util.getTotalPagesFromPagedItems(iTotal,pageSize);    
        //If a user is on the last page then selects search,'participantPage' should be returned to 1
        if (pageNumber > totalPages){pageNumber = 1;}
        int prevPage = pageNumber - 1;
        if (prevPage < 1){prevPage = 1;}      
        int nextPage = pageNumber + 1;
        if (nextPage > totalPages){nextPage = totalPages;}       
        //show 'page x of y' text
        strRetValue += showPaging(prevPage,pageNumber, totalPages, nextPage, false);
        //show box for changing page size 
        strRetValue += showPageSize(pageSize);       
        return strRetValue;
    }
    public String showJobHistorySummary(JobHistory jh,ExpertRule er) throws Exception {
        String retValue = "";
        String status = jh.getStatusName();            
        String jsmlink = jh.getFinalJSMName()+" " +status ;
    	retValue += "<table class=ContentList>";
    	retValue += "<tr class=ListHeader><td colspan=5 align=center>Job History Panel</td></tr>";
        retValue += "<tr><td><b>Job Title</b></td><td>" + jh.getJobDescription() + "</td></tr>";
        //retValue += "<tr><td><b>Job Duties</b></td><td>" + jh.getDuties() + "</td></tr>";
        retValue += "<tr><td><b>JSM</b></td><td>" + jsmlink + "</td></tr>";
        retValue += "<tr ><td><b>Age</b></td><td>" + jh.getAge() + "</td></tr>";
        Participant p = new Participant(Long.valueOf(jh.getParticipantId()));
        retValue += "<tr ><td><b>Gender</b></td><td>" + p.getGender() + "</td></tr>";
        if(er!=null){
        	String jhCondition = "";
        	boolean bFound = false;
        	for(ExpertFact ef : er.getFacts()){
        		if(ef.isJobHistoryFact()){
        			bFound = true; 
        			jhCondition += ef.getName();
        		}
        	}
        	String strHighlight = "";
        	if(bFound){
        		strHighlight = "class='Highlight'";
        	}
            retValue += "<tr "+strHighlight+" ><td><b>Year Started</b></td><td>" + jh.getYearStarted() + "&nbsp;"+jhCondition+"</td></tr>";      	
        }else{
            retValue += "<tr ><td><b>Year Started</b></td><td>" + jh.getYearStarted() + "</td></tr>";       	
        }
        retValue += "<tr ><td><b>Duration in years</b></td><td>" + jh.getDurationYears() + "</td></tr>";
        retValue += "<tr ><td><b>Weeks Per Year</b></td><td>" + jh.getWeeksPerYear() + "</td></tr>";
        retValue += "<tr ><td><b>Hours Per Week</b></td><td>" + jh.getHoursPerWeek() + "</td></tr>";
        retValue += "<tr><td><b>Employer</b></td><td>" + jh.getEmployer() + "</td></tr>";
        retValue += "<tr ><td><b>Suburb</b></td><td>" + jh.getSuburb() + "</td></tr>";
        retValue += "<tr ><td><b>State</b></td><td>" + jh.getState() + "</td></tr>";
        retValue += "<tr ><td><b>Country</b></td><td>" + jh.getCountry() + "</td></tr>";
        retValue += "</table>";
        return retValue;
    }
	public String showStudy(Study study, JobSpecificModule jsm, Agent agent,boolean bShowDetail) throws Exception {
		String retValue = "";
		retValue +="<table class=EditView>";
		retValue +="<tr>";
        retValue +="<td >&nbsp;Name</td>";
        retValue +="<td >" + study.getName() + "</td>";
        retValue +="</tr>";
        retValue +="<tr>";
        retValue +="<td >&nbsp;Description</td>";
        retValue +="<td >" + study.getDescription() + "</td>";
        retValue +="</tr>";
        retValue +="<tr >";
        retValue +="<td >&nbsp;Status</td>";
        retValue +="<td >" + study.getOccStatusName() + "</td>";
        retValue +="</tr>";
        retValue +="<tr>";
        retValue +="<td >&nbsp;Agents</td>";
        retValue +="<td >" + this.showList(study.getAgents()) + "</td>";
        retValue +="</tr>";       
        retValue +="<tr >";
        retValue +="<td nowrap>&nbsp;Participant Count</td>";
        retValue +="<td >" + study.getParticipantCount(ParticipantStatus.NONE) + "</td>";
        retValue +="</tr>";
        retValue +="<tr>";
        retValue +="<td nowrap style='padding-left:20px'>&nbsp;Not Ready for Assessment Count</td>";
        String[] statuses = {ParticipantStatus.TOBEREVIEWED,ParticipantStatus.READYFORINTERVIEW,ParticipantStatus.INTERVIEWINCOMPLETE};
        retValue +="<td >" + study.getParticipantCount(statuses) + "</td>";//participantstatuses at interview stage
        retValue +="</tr>";
        retValue +="<tr>";
        retValue +="<td nowrap style='padding-left:20px'>&nbsp;Ready for Assessment Count</td>"; 
        retValue +="<td >" + study.getParticipantCount(ParticipantStatus.READYFORASSESSMENT) + "</td>";
        retValue +="</tr>";
        retValue +="<tr >";
        retValue +="<td nowrap style='padding-left:20px'>&nbsp;Incompleted Assessment Count</td>";
        retValue +="<td >" + study.getParticipantCount(ParticipantStatus.ASSESSMENTINCOMPLETE) + "</td>";
        retValue +="</tr>";
        retValue +="<tr>";
        retValue +="<td nowrap style='padding-left:20px'>&nbsp;Completed Assessment Count</td>";
        retValue +="<td >" + study.getParticipantCount(ParticipantStatus.ASSESSMENTCOMPLETE) + "</td>";
        retValue +="</tr>";      		       
        retValue +="<tr>";		
        retValue +="<td colspan=2>";
        retValue +="<table width=100%>";
        String showDetailSwitch = "<a href=main.jsp?showAssessmentDetail=true onclick=\"return showProgress()\">More Detail</a>";
        if(bShowDetail){
        	showDetailSwitch = "<a href=main.jsp?showAssessmentDetail=false onclick=\"return showProgress()\">Less Detail</a>";
        }
        retValue +="<tr class=ListHeader>";
        retValue +="<td colspan=5>Assessments "+showDetailSwitch+"</td>";
        retValue +="</tr>";
        String firedRulesHeader = "";
        if(jsm!=null){
        	firedRulesHeader ="<td width=420px>Fired Rules</td>";
        }else{
        	firedRulesHeader ="<td width=420px></td>";
        }
        retValue +="<tr class=ListHeader>";
        retValue +="<td width=150px>JSMs</td>";       
        retValue +="<td align=center>Ready Total<br><span class=small>(jhs*agents)</span></td><td align=center>Auto Assessed</td><td align=center>Manual Assessed</td>"+firedRulesHeader+"";
        retValue +="</tr>";
        if(bShowDetail){       	
            for(JobSpecificModule fjsm: study.getStudySpecificJsms()){       		 
            	String jsmname = this.truncateName(fjsm.getName(),this.JSMLENGTH);  
            	
            	String studyId = study.getId();
                
                fjsm.setStudyId(studyId);
            	int iJobHistoryCount = fjsm.getJobHistoryCount();
            	int iAgentCount = study.getAgents().size();
            	
            	int iReadyAutoAssessed = Integer.valueOf(fjsm.getCountAssessmentReadyAutoAssessed());       
            	int iManualAssessed = Integer.valueOf(fjsm.getCountAssessmentManualDone());       	
            	retValue +="<tr>";
                retValue +="<td>"+jsmname+"</td>";
                retValue +="<td align=center nowrap>"+(iJobHistoryCount*iAgentCount)+"("+iJobHistoryCount+"*"+iAgentCount+")</td>";
                retValue +="<td align=center>"+iReadyAutoAssessed+"</td><td align=center>"+iManualAssessed+"</td>";           
                retValue +="</tr>";
                if(jsm!=null){
                	if(fjsm.getId().equalsIgnoreCase(jsm.getId())){           		
                		for(Agent agnt: study.getAgents()){
                			int iAgentReadyAutoAssessed = Integer.valueOf(fjsm.getCountAssessmentReadyAutoAssessed(agnt));    
                			int iAgentManualAssessed = Integer.valueOf(fjsm.getCountAssessmentManualDone(agnt));              	
                        	ExpertAgent ea = new ExpertAgent(agnt.getId());
                        	String tdHigh = "";
                        	int iHighCount = ea.getCountFiredRules(study,jsm.getId(),ExpertRule.PROBABLEHIGH);
                        	if(iHighCount!=0){
                        		tdHigh = "<td class='PROBABLEHIGH' title='Probable High'>&nbsp;</td>";                    		
                        	}
                        	String tdMedium = "";
                        	int iMediumCount = ea.getCountFiredRules(study,jsm.getId(),ExpertRule.PROBABLEMEDIUM);
                        	if(iMediumCount!=0){
                        		tdMedium = "<td class='PROBABLEMEDIUM' title='Probable Medium'>&nbsp;</td>";                  		
                        	}
                        	String tdLow = "";
                        	int iLowCount = ea.getCountFiredRules(study,jsm.getId(),ExpertRule.PROBABLELOW);
                        	if(iLowCount!=0){
                        		tdLow = "<td class='PROBABLELOW' title='Probable Low'>&nbsp;</td>";                  		
                        	}
                        	String tdUnknown = "";
                        	int iUnknownCount = ea.getCountFiredRules(study,jsm.getId(),ExpertRule.PROBABLEUNKNOWN);
                        	if(iUnknownCount!=0){
                        		tdUnknown = "<td class='PROBABLEUNKNOWN' title='Probable Unknown'>&nbsp;</td>";                  		
                        	}
                        	String tdPossible = "";
                        	int iPossibleCount = ea.getCountFiredRules(study,jsm.getId(),ExpertRule.POSSIBLEUNKNOWN);
                        	if(iPossibleCount!=0){
                        		tdPossible = "<td class='POSSIBLEUNKNOWN' title='Possible Unknown'>&nbsp;</td>";                		
                        	}
                			retValue +="<tr style='background-color: #eef7fc'>";
                            retValue +="<td style='padding-left:10px'><a href=main.jsp?Location=Agents&agentID="+agnt.getId()+">"+agnt.getName()+"</a></td><td>&nbsp;</td><td align=center>"+iAgentReadyAutoAssessed+"</td><td align=center>"+iAgentManualAssessed+"</td><td width=420px><table cellspacing=0 cellpadding=0><tr>"+tdHigh+""+tdMedium+""+tdLow+""+tdUnknown+""+tdPossible+"</tr></table></td>";
                            retValue +="</tr>";
                		}           		
                	}
                }           	    	      	       	
            }  
                       
        }
    	int iTotalTotal = study.getJobHistoryCountInterviewed();
    	int iTotalAuto = study.getJobHistoryCountInterviewedAssessedAuto();
        int iTotalOther = study.getJobHistoryCountInterviewedAssessed();
        String warning = "";
        if((iTotalTotal*study.getAgents().size())>iTotalAuto){
        	String strListOfReferenceNumbers = study.getRemainingAssessments();
        	warning = "<div title="+strListOfReferenceNumbers+"><span class=warning>Auto Assessments Needed</span></div>";
        }
    	retValue +="<tr>";
        retValue +="<td>Interviewed</td><td align=center>"+(iTotalTotal*study.getAgents().size())+"("+iTotalTotal+"*"+study.getAgents().size()+")</td><td align=center>"+iTotalAuto+"</td><td align=center>"+iTotalOther+"</td><td width=420px>"+warning+"</td>";
        retValue +="</tr>"; 
        iTotalTotal = study.getJobHistoryCountNoTimeForInterviewed();
        iTotalOther = study.getJobHistoryCountNotTimeForInterviewedAssessed();
        retValue +="<tr>";
        retValue +="<td>No Time</td><td align=center>"+(iTotalTotal*study.getAgents().size())+"("+iTotalTotal+"*"+study.getAgents().size()+")</td><td align=center>No Auto</td><td align=center>"+iTotalOther+"</td>";
        retValue +="</tr>";
        int iOtherTotal = study.getJobHistoryCountNotInScope();      
        int iOther = study.getJobHistoryCountNotInScopeAssessed();
        retValue +="<tr>";
        retValue +="<td>Not in Scope</td><td>"+(iOtherTotal*study.getAgents().size())+"("+iOtherTotal+"*"+study.getAgents().size()+")</td><td align=center>No Auto</td><td align=center>"+iOther+"</td><td width=420px></td>";
        retValue +="</tr>";
        iOtherTotal = study.getJobHistoryCountNoAppropriateJSM();      
        iOther = study.getJobHistoryCountNoAppropriateJSMAssessed();
        iTotalAuto = study.getJobHistoryCountNoAppropriateJSMAssessedAuto();
        retValue +="<tr>";
        retValue +="<td>No Appropriate JSM</td><td>"+(iOtherTotal*study.getAgents().size())+"("+iOtherTotal+"*"+study.getAgents().size()+")</td><td align=center>"+iTotalAuto+"</td><td align=center>"+iOther+"</td><td width=420px></td>";
        retValue +="</tr>";
        iOtherTotal = study.getJobHistoryCountUnexposedJob();      
        iOther = study.getJobHistoryCountUnexposedJobAssessed();
        int iUnexposedAutoAssessed  = study.getJobHistoryCountUnexposedJobAssessedAuto();
        retValue +="<tr>";
        retValue +="<td>Unexposed Job</td><td>"+(iOtherTotal*study.getAgents().size())+"("+iOtherTotal+"*"+study.getAgents().size()+")</td><td align=center>"+iUnexposedAutoAssessed+"</td><td align=center>"+iOther+"</td><td width=420px></td>";
        retValue +="</tr>";
        retValue +="</table>";       
        retValue +="</td>";
        retValue +="</tr>";      
        retValue +="</table>";
        return retValue;
	}
    public String showAssessmentSummary(JobHistory jh,Study study) throws Exception {
        String retValue = "";     
        retValue += "<table  class=ContentList>";
        retValue += "<tr><td class=agents><b>Agent</b></td><td class=agents><b>Manual Exposure Assessment</b></td><td class=agents><b>Auto Exposure Assessment</b></td></tr>";
        for(Agent agent: study.getAgents()){
            retValue += "<tr>";
            retValue += "<td class=agents><a href=main.jsp?agentID="
                + agent.getId()
                + ">"
                + agent.getName()
                + "</a></td>";
        	retValue += "<td class=agents>"+this.showExposureAssessmentDetails(agent.getId(),jh)+"</td>";
        	retValue += "<td class=agents>"+this.showExposureAssessmentDetails(agent.getId(),jh,"OccIDEAS")+"</td>";
        }
        retValue += "</table>";
        return retValue;
    }
	public String showAgentRules(ExpertAgent agent,JobSpecificModule jsm,boolean showAll,boolean justValid) throws Exception {
		String retValue = "<table class=occIDEASAssessment>";            
		retValue += "<tr class=ListHeader><td>Current Rules</td></tr>";            
		retValue += "<tr>";                       
		retValue += "<td valign=top>";        
		agent.setRules(null);
		if(justValid){
			retValue += this.showRulesDescription(agent.getValidRules(jsm.getId()),jsm);
		}else{
			retValue += this.showRulesDescription(agent.getJSMRules(jsm.getId()),jsm);			
		}    
		retValue += "</td>";            
		retValue += "</tr>";                     
		retValue += "</table>";            
		return retValue;
	}
	public String showRulesDescription(ArrayList<ExpertRule> rules,JobSpecificModule jsm) throws Exception {
		String strHTML = "<table class=rules border=1>";   
        strHTML += "<tr class=ListHeader><td width=10px align=center><image width=18 height=18 alt='Select All' title='Select All' src='ImageStream?ImageName=selectall.gif' onclick='checkAllCheckboxes();' /></td><td colspan=3>Description</td><td>JSMID</td><td>JSMs</td><td>Is Valid</td></tr>";
        for (ExpertRule rule : rules) {   
        	
            strHTML += "<tr>";
            strHTML += "<td width=10px title="+rule.getId()+"><input id="+rule.getId()+" type=checkbox name=rulesCheckBox_" + rule.getId() + "></input></td><td width=7px class="+rule.getOutCome()+">"+rule.getSequence()+"</td><td colspan=2><label for="+rule.getId()+">"
            + rule.getFullDescription()
            + "</label></td>";
            String warning = ""; 
            String deleted = "";
            if(jsm!=null){
            	if(!(jsm.getId().equalsIgnoreCase(rule.getJsmId()))){
                	warning = "class=warning";
                }
            }
        	if(rule.getJsmId()!=null && (!(rule.getJsmId().equalsIgnoreCase("")))){
            	JobSpecificModule jsm1 = new JobSpecificModule(rule.getJsmId());
            	if(jsm1.getName().equalsIgnoreCase("")){
            		deleted = ":deleted";
            	}         	
            }                                 
            strHTML += "<td "+warning+">"+rule.getJsmId()+deleted+"</td><td>"+this.showList(rule.getJSMs())+"</td>";            
            if(!(rule.isValid())){
            	strHTML += "<td><image src='ImageStream?ImageName=out.gif'  /></td>";
        	}else{
        		strHTML += "<td><image src='ImageStream?ImageName=in.gif'  /></td>";
        	}
            strHTML += "</tr>";
          
            if(rule.getChildRules().size()>0){          	
        		for (ExpertRule childRule : rule.getChildRules()) {  
        			if(childRule.getTypeId().equalsIgnoreCase(ExpertRule.TYPEFREQUENCYWEEKS)){   
        				String jsmQId = childRule.getFrequencyWeeksQId();
        				Question q = new Question("",jsmQId);
        				deleted = "";
        				if(q.getId().equalsIgnoreCase("")){
        					deleted = ":deleted";
        				}
        				strHTML += "<tr><td width=10px><input id="+childRule.getId()+" type=checkbox name=rulesCheckBox_" + childRule.getId() + "></input></td><td width=10px></td><td ><label for="+childRule.getId()+">"
                        + "Frequency Weeks"
                        + "</label></td><td>"+jsmQId+deleted+"</td><td>"+childRule.getJsmId()+"</td><td></td><td>"+childRule.isValid()+"</td></tr>";
        			}else if (childRule.getTypeId().equalsIgnoreCase(ExpertRule.TYPEFREQUENCYHOURS)) {
        				String jsmQId = childRule.getFrequencyHoursQId();
        				Question q = new Question("",jsmQId);
        				deleted = "";
        				if(q.getId().equalsIgnoreCase("")){
        					deleted = ":deleted";
        				}
        				strHTML += "<tr><td width=10px><input id="+childRule.getId()+" type=checkbox name=rulesCheckBox_" + childRule.getId() + "></input></td><td width=10px></td><td ><label for="+childRule.getId()+">"
                        + "Frequency Hours"
                        + "</label></td><td>"+jsmQId+deleted+"</td><td>"+childRule.getJsmId()+"</td><td></td><td>"+childRule.isValid()+"</td></tr>";
        			}else{
        				strHTML += "<tr><td width=10px><input id="+childRule.getId()+" type=checkbox name=rulesCheckBox_" + childRule.getId() + "></input></td><td width=10px></td><td ><label for="+childRule.getId()+">"
                        + childRule.getFullDescription()
                        + "</label></td><td></td><td>"+childRule.getJsmId()+"</td><td></td><td>"+childRule.isValid()+"</td></tr>";
        			}
            	}          	
            }
        }
        strHTML += "</table>";
        return strHTML;
	}
	public String showDBRuleTransfer() throws Exception {
		String strRetValue = "<table class=dbrule>";
    	strRetValue += "\n<tr>";
    	strRetValue += "\n<td><input type=text name=constring value='jdbc:mysql://localhost/occideasalpha_dbo' />";
    	Agent agent = new Agent();
    	strRetValue += this.showCombo("","agent",agent.getAllAgents(),false,false, false);
    	strRetValue += "<table cellpadding=2 cellspacing=0 class=Login>";                     
        strRetValue += "<tr>";
        strRetValue += "<td>&nbsp;</td><td align=right >Username:</td>";
        strRetValue += "<td><input type=text name=username value='user' class=button></input></td><td>&nbsp;</td>";
        strRetValue += "</tr>";
        strRetValue += "<tr><td colspan=4>&nbsp;</td></tr>";             
        strRetValue += "<tr>";
        strRetValue += "<td>&nbsp;</td><td align=right>Password:</td>";
        strRetValue += "<td><input type=password name=password value='root' class=button></input></td><td>&nbsp;</td>";
        strRetValue += "</tr>";
        strRetValue += "<tr><td colspan=4>&nbsp;</td></tr>";                      
        strRetValue += "</table>";
    	strRetValue += "\n<select name=dbtype><option value=MYSQL>MYSQL</option><option value=SQLSERVER>SQL Server</option></select>";
		
		strRetValue += "\n<input type=submit name=Action value=AgentTransfer /></td></tr>";
	
		strRetValue += "\n</table>";
		return strRetValue;
	}
	public String showAllJobHistorySummary(JobHistory seljh,Participant p,Agent agent,Study study) throws Exception {
		String strHTML = "\n<table class=ContentList>";
		strHTML += "<tr class=ListHeader><td colspan=8 align=center>Job Calendar Panel</td></tr>";
		strHTML += "<tr class=ListHeader><td >ID</td><td >Final JSM</td><td >Status</td><td colspan=3>Assessed</td></tr>";
        //int i = 1;
        for (JobHistory jh : p.getJobHistories()) {
            String strRowClass = "class=\"Disabled\"";
            String autoAssessedClass = "";
            String manualAssessedClass = "";
            if (seljh.getId().equalsIgnoreCase(jh.getId())) {
            	strRowClass = " class=\"Highlight\" ";
            }
        	if(agent!=null){
        		if (jh.isAgentAssessedBy(agent.getId(),"OccIDEAS")) {
                	String outcome = jh.getAutoAssessment(agent.getId()).getOutCome();
                	autoAssessedClass = "<div class="+outcome+" title='Auto "+agent.getName()+" "+outcome+"'>&nbsp;</div>";
                }
        		if(jh.isAgentAssessedManual(agent.getId())){
        			String outcome = jh.getManualAssessment(agent.getId()).getOutCome();
        			manualAssessedClass = "<div class="+outcome+" title='Manual "+agent.getName()+" "+outcome+"'>&nbsp;</div>";
        		}
        	}          
            String refNumber = jh.getReferenceNumber();
            if(refNumber.equalsIgnoreCase("")){
            	refNumber = "[Not Set]";
            }
            
            strHTML += "<tr "+strRowClass+"><td><a href=main.jsp?jobhistoryID="
            +jh.getId()+">"
            +refNumber+"</a></td><td >"
            +this.truncateName(jh.getFinalJSMName(),this.JSMLENGTH) +"</td><td >"+jh.getStatusName()+"</td><td align=center>"
            +jh.isAllManuallyAssessed(study)+"</td><td>"+manualAssessedClass+"</td><td>"+autoAssessedClass+"</td></tr>";            
            //i++;
        }
        strHTML += "</table>";
        return strHTML;
	}
	public String showRules(ExpertRule seler,Assessment autoAssessment,Study study) throws Exception {
		String strHTML = "\n<table class=ContentList >";
		strHTML += "<tr class=ListHeader><td colspan=2>Fired Rules</td><td >wks</td><td >hrs</td></tr>";
        for (ExpertRule er : autoAssessment.getRules()) {
            String strRowClass = "";
            if(seler!=null){
	            if (seler.getId().equalsIgnoreCase(er.getId())) {
	            	strRowClass = " class=\"Highlight\" ";
	            } 
            }
            strHTML += "<tr "+strRowClass+" >";
            
            strHTML += "<td class="+er.getOutCome()+" >&nbsp;</td><td><a href=main.jsp?ruleId="
            +er.getId()+"#"
            +er.getId()+">"
            +er.getOutCome()+"</a></td>";
            
            String weeks = er.getFrequencyWeeksValue();
            String hours = er.getFrequencyHoursValue();
            //String theAnswer = actualAnswer.getActualAnswer();
            if(study.hasOption(Study.Option.CAT3FREQ)){
            	if(hours!=null){
            		if(hours.equalsIgnoreCase("1111")){
                		hours = "&lt;5 hours per week";
                    }else if(hours.equalsIgnoreCase("2222")){
                    	hours = "5-30 hours per week";
                    }else if(hours.equalsIgnoreCase("3333")){
                    	hours = "&gt;30 hours per week";
                    }
            	}           	
            }
            strHTML += "<td>"+weeks+"</td><td>"+hours+"</td>";
            
            
            strHTML += "</tr>";
        }
        strHTML += "</table>";
        return strHTML;
	}
	public String showParticipantCommentsStatus(Participant participant, List<ParticipantStatus> statuses) throws Exception {
    	String strHTML = "";       
        strHTML += "<table width=100% cellpadding=0 cellspacing=0 style='border: 2px solid #e4f0f5;'>";
        if (participant.getJobHistories().size() == 0){
        	strHTML += "<tr><td>No Job Histories Found</td></tr>";
        }
        strHTML += "<tr>";
        strHTML += "<td>";
    	strHTML += "\n<table class=EditView>";
        strHTML += "\n<tr><td >Comments</td><td ><textarea cols=40 rows=4 name=comments>"+ participant.getComments() + "</textarea></td></tr>";
        String warning = "";
        if(!(participant.isAtAssessmentStage())){
        	warning = "<td><span class=warning>Warning: This participant may not be ready for assessment</td>";
        }       
        strHTML += "\n<tr><td >Participant Status</td><td>" + this.showParticipantStatuses(participant.getStatusId(), "participantStatus", statuses) + "</td>" + warning + "</tr>";
        strHTML += "\n</table>";
        strHTML += "\n</td>";
        strHTML += "\n</tr>";
        strHTML += "\n</table>";
        return strHTML;
    }
	public String showOtherInterviewLinks(JobHistory jh,String selectedId) throws Exception {
		String strHTML = "";
		ArrayList<Interview> interviews = jh.getInterviews();
		if(interviews.size()>1){
			strHTML = "\n<table cellpadding=2 cellspacing=0>";
			int i = 1;
			strHTML += "<tr class=ListHeader><td>Interviews</td>";
	        for (Interview interview: interviews) {
	            String strRowClass = "";           
	            if (selectedId.equalsIgnoreCase(interview.getId())) {
	            	strRowClass = " class=\"Highlight\" ";
	            } 
	            strHTML += "<td "+strRowClass+"><a href=main.jsp?interviewId="
	            +interview.getId()+">"
	            +i+"</a></td>";
	            i++;
	        }
	        strHTML += "</tr>";
	        strHTML += "</table>";
		}		
        return strHTML;
	}
	public String showJobHistoryAssessmentSummary(ArrayList<JobHistory> jhs,boolean bShowJHDetail,Study study, int iTotalCount, int iPageNr, int iPageSize) throws Exception {
		String strRetValue = "<table class=ContentList>";
		strRetValue += "<tr class=ListHeader>";
		int iStartNr = ((iPageNr-1)*iPageSize)+1;
		int iEndNr = (iStartNr+iPageSize)-1;
		if(iEndNr>iTotalCount){
			iEndNr = iTotalCount;
		}
    	strRetValue += "<td align=center class=small >"+iStartNr+" - "+iEndNr+" of "+iTotalCount+"</td>";       
		strRetValue += "<td>Job History</td>";
		strRetValue += "<td>Mapped JSM</td>";
		strRetValue += "<td>Auto Assessments</td>";
		strRetValue += "<td>Assessed</td>";
		strRetValue += "</tr>";
		strRetValue += "<tr class=ListHeader>";
    	strRetValue += "<td ><img alt='Select All' id=selectAllImage name=selectAllImage src='ImageStream?ImageName=unchecked.gif' onclick=swapSelectAllImage(this); /></td>";       
		strRetValue += "<td></td>";
		strRetValue += "<td></td>";
		strRetValue += "<td style='padding-left:15px;'>";
		strRetValue += "<div style='float:left;padding:2px;' class=PROBABLEHIGH><a href=main.jsp?exposureFilter=PROBABLEHIGH>H</a></div>";
		strRetValue += "<div style='float:left;padding:2px;' class=PROBABLEMEDIUM><a href=main.jsp?exposureFilter=PROBABLEMEDIUM>M</a></div>";
		strRetValue += "<div style='float:left;padding:2px;' class=PROBABLELOW><a href=main.jsp?exposureFilter=PROBABLELOW>L</a></div>";
		strRetValue += "<div style='float:left;padding:2px;' class=PROBABLEUNKNOWN><a href=main.jsp?exposureFilter=PROBABLEUNKNOWN>U</a></div>";
		strRetValue += "<div style='float:left;padding:2px;' class=POSSIBLEUNKNOWN><a href=main.jsp?exposureFilter=POSSIBLEUNKNOWN>P</a></div>";
		strRetValue += "<div style='float:left;padding:2px;' class=NONE><a href=main.jsp?exposureFilter=NONE>N</a></div>";
		strRetValue += "</td>";
		strRetValue += "<td>";
		strRetValue += "<div style='float:left;padding:2px;'><a href=main.jsp?assessmentFilter=True>Yes</a></div>";
		strRetValue += "<div style='float:left;padding:2px;'><a href=main.jsp?assessmentFilter=False>No</a></div>";
		strRetValue += "</td>";
		strRetValue += "</tr>";
		
		for(JobHistory jh: jhs){
			if (!(jh.getFinalJSMId().equalsIgnoreCase(""))) {
	            JobSpecificModule fjsm = new JobSpecificModule(jh.getFinalJSMId());
	            jh.setFinalJSMName(fjsm.getName());
	        }		
			strRetValue += "<tr>";
			strRetValue += "<td><input type=checkbox name=jhCheckBox_"+ jh.getId()+ " /></td>";
			strRetValue += "<td ><a href=main.jsp?Location=Participants&participantID="+jh.getParticipantId()+"&jobhistoryID="+jh.getId()+">"+jh.getParticipantReferenceNumber()+":"+jh.getReferenceNumber()+"</a></td>";
			String jhStatus = "";
			if(jh.getStatusId().equalsIgnoreCase(JobHistoryStatus.NOTTOBEINTERVIEWEDTIME)){
				jhStatus = jh.getFinalJSMName()+" - No Time";
			}else if(jh.getStatusId().equalsIgnoreCase(JobHistoryStatus.INTERVIEWED)){
				jhStatus = jh.getFinalJSMName()+" - Interviewed";
			}else if(jh.getStatusId().equalsIgnoreCase(JobHistoryStatus.TOBEINTERVIEWED)){
				jhStatus = jh.getFinalJSMName()+" - To Be Interviewed";
			}else if(jh.getStatusId().equalsIgnoreCase(JobHistoryStatus.TOBEREVIEWED)){
				jhStatus = jh.getFinalJSMName()+" - To Be Reviewed";
			}else if(jh.getStatusId().equalsIgnoreCase(JobHistoryStatus.UNEXPOSEDJOB)){
				jhStatus = "Unexposed Job";
			}else if(jh.getStatusId().equalsIgnoreCase(JobHistoryStatus.NOTTOBEINTERVIEWEDNOJSM)){
				jhStatus = "No Appropriate JSM";
			}else if(jh.getStatusId().equalsIgnoreCase(JobHistoryStatus.NOTTOBEINTERVIEWEDSCOPE)){
				jhStatus = "Not In Scope";
			}
			strRetValue += "<td>"+jhStatus+"</td>";
			if(jh.getStatusId().equalsIgnoreCase(JobHistoryStatus.NOTTOBEINTERVIEWEDSCOPE)){
				strRetValue += "<td>Not Auto Assessed</td>";
			}else if(jh.getStatusId().equalsIgnoreCase(JobHistoryStatus.NOTTOBEINTERVIEWEDTIME)){
				strRetValue += "<td>Not Auto Assessed</td>";
			}else{
				strRetValue += "<td>"+this.showAutoAssessments(jh)+"</td>";
			}
			String isAssessed = "No";
			if(jh.isAllManuallyAssessed(study)){
				isAssessed = "Yes";
			}
			strRetValue += "<td>"+isAssessed+"</td>";
			strRetValue += "</tr>";
			if(bShowJHDetail){
				jh.getPersistentObject();
				strRetValue += "<tr><td style='padding-left: 20px;border-bottom:solid;' colspan=7>"+this.showJobHistoryDetail(jh)+"</td></tr>";
			}
		}
		strRetValue += "</table>";
        return strRetValue;
	}
	private String showAutoAssessments(JobHistory jh) throws Exception {
		String strRetValue = "<table><tr><td>";
		boolean bFound = false;
		for(Assessment assessment: jh.getAutoAssessments()){	
			Agent agent = new Agent(assessment.getAgentId());
			strRetValue += "<div class='"+assessment.getOutCome()+"'><a href=main.jsp?Location=Participants&participantID="+jh.getParticipantId()+"&agentID="+agent.getId()+"&jobhistoryID="+jh.getId()+">"+agent.getName()+"</a></div>";		
			bFound = true;
		}
		if(!(bFound)){
			strRetValue += "<span class=warning>Auto Assessments Needed</span>";	
		}
		strRetValue += "</td></tr></table>";
        return strRetValue;
	}
	private String showManualAssessments(JobHistory jh,Study study) throws Exception {
		String strRetValue = "<table><tr>";
		if(!(jh.getFinalJSMId().equalsIgnoreCase("NULL"))){
			if(!(jh.getStatusId().equalsIgnoreCase(JobHistoryStatus.NOTTOBEINTERVIEWEDSCOPE))){
        		JobSpecificModule jsm = new JobSpecificModule(jh.getFinalJSMId());
        		for(Agent agent: jsm.getAgents()){
        			if(study.getAgents().contains(agent)){
        				Assessment assessment = jh.getManualAssessment(agent.getId());
        				if(assessment.getId().equalsIgnoreCase("")){
            				strRetValue += "<td width=10px title='"+agent.getName()+"' style='border: 1px solid #2484ab'><a href=main.jsp?Location=Participants&participantID="+jh.getParticipantId()+"&agentID="+agent.getId()+"&jobhistoryID="+jh.getId()+">&nbsp;</a></td>";       					
        				}else{
            				strRetValue += "<td style='border: 1px solid #2484ab' width=10px class='"+assessment.getOutCome()+"' title='"+agent.getName()+"'><a href=main.jsp?Location=Participants&participantID="+jh.getParticipantId()+"&agentID="+agent.getId()+"&jobhistoryID="+jh.getId()+">&nbsp;</a></td>";        					
        				}
        			}
            	} 
        	} else{
    			strRetValue += "<td align=center>Not Assessed</td>";	    		
        	}
    	}else{
    		for(Agent agent: study.getAgents()){
				Assessment assessment = jh.getManualAssessment(agent.getId());
				if(assessment.getId().equalsIgnoreCase("")){
    				strRetValue += "<td width=10px title='"+agent.getName()+"' style='border: 1px solid #2484ab'><a href=main.jsp?Location=Participants&participantID="+jh.getParticipantId()+"&agentID="+agent.getId()+"&jobhistoryID="+jh.getId()+">&nbsp;</a></td>";       					
				}else{
    				strRetValue += "<td style='border: 1px solid #2484ab' width=10px class='"+assessment.getOutCome()+"' title='"+agent.getName()+"'><a href=main.jsp?Location=Participants&participantID="+jh.getParticipantId()+"&agentID="+agent.getId()+"&jobhistoryID="+jh.getId()+">&nbsp;</a></td>";        					
				}
        	}     		
    	}
		strRetValue += "</tr></table>";
        return strRetValue;
	}
	public String showStudyWithJSMsAndAgents(Study study) throws Exception {
		String strRetValue = "<table class=LHSMenuContent>";
        ArrayList<JobSpecificModule> jsms = study.getStudySpecificJsms();
        for (JobSpecificModule jsm : jsms) {       	
            String agentsFired = "";
            String shortName = this.truncateName(jsm.getName(),this.JSMLENGTH);           
            strRetValue += "<tr ><td colspan=6 style='padding-left:10px;font-weight:bold;' title='"+jsm.getName()+"'><a href=main.jsp?jsmID="
                + jsm.getId()
                + ">"
                + shortName
                + "</a></td></tr>";
            strRetValue += agentsFired;
        }
        if(jsms.size() == 0){
        	strRetValue += "<tr><td>Details &gt;</td></tr>";
        }
        strRetValue += "</table>";
        return strRetValue;
	}
	public String showAssessmentReportHTML(Study study) throws Exception {
		String strRetValue = "";		
		strRetValue += "<table border=1>";
		strRetValue += "<tr>";
		strRetValue += "<td>ParticipantReferenceNumber</td>";
		strRetValue += "<td>JobHistoryReferenceNumber</td>";
		strRetValue += "<td>JobHistoryStatus</td>";
		strRetValue += "<td>JSM</td>";
		ArrayList<Agent> agents = study.getAgents();
		for(Agent agent: agents){
			strRetValue += "<td>"+agent.getName()+"_Probable_Manual</td>";
			strRetValue += "<td>"+agent.getName()+"_Level_Manual</td>";
			strRetValue += "<td>"+agent.getName()+"_Weeks_Manual</td>";
			strRetValue += "<td>"+agent.getName()+"_Hours_Manual</td>";
			strRetValue += "<td>"+agent.getName()+"_Probable_Auto</td>";
			strRetValue += "<td>"+agent.getName()+"_Level_Auto</td>";
			strRetValue += "<td>"+agent.getName()+"_Weeks_Auto</td>";
			strRetValue += "<td>"+agent.getName()+"_Hours_Auto</td>";
		}
		strRetValue += "</tr>";
		ArrayList<JobHistory> jhs = study.getJobHistoriesWithAssessments();
		//int iSize = jhs.size();
		//int iIndex = 0;
		for(JobHistory jh: jhs){
			//System.out.println("Processing "+iIndex+" of "+ iSize+" at "+new Date());
			strRetValue += "<tr>";
			strRetValue += "<td>"+jh.getParticipantReferenceNumber()+"</td>";
			strRetValue += "<td>"+jh.getReferenceNumber()+"</td>";
			strRetValue += "<td>"+jh.getStatusId()+"</td>";
			strRetValue += "<td>"+jh.getFinalJSMId()+"</td>";
			for(Agent agent: agents){				
				Assessment assessment = jh.getAssessmentManual(agent);
				if(assessment.getId().equalsIgnoreCase("")){
					strRetValue += "<td>No Manual</td><td>No Manual</td><td>No Manual</td><td>No Manual</td>";
				}else{
					strRetValue += "<td>"+assessment.getExposure()+"</td>";
					strRetValue += "<td>"+assessment.getLevel()+"</td>";
					strRetValue += "<td>"+assessment.getFrequencyweeks()+"</td>";
					strRetValue += "<td>"+assessment.getFrequencyhours()+"</td>";
				}
				Assessment autoAssessment = jh.getAssessmentAuto(agent);
				if(autoAssessment.getId().equalsIgnoreCase("")){
					strRetValue += "<td>No Auto</td><td>No Auto</td><td>No Auto</td><td>No Auto</td>";
				}else{
					strRetValue += "<td>"+autoAssessment.getExposure()+"</td>";
					strRetValue += "<td>"+autoAssessment.getLevel()+"</td>";
					strRetValue += "<td>"+autoAssessment.getFrequencyweeks()+"</td>";
					strRetValue += "<td>"+autoAssessment.getFrequencyhours()+"</td>";	
				}							
			}
			strRetValue += "</tr>";
			//iIndex++;
		}
		strRetValue += "</table>";
        return strRetValue;
	}
	public String showReportsAssessments(Study study) throws Exception {
		String strRetValue = "";
		strRetValue += "<table class=EditView cellspacing=0 bgcolor=#f9faff>";
		strRetValue += "<tr class=windowTop ><td align=right>Archived Reports</td><td>Close</td><td style=\"text-align: right;\"><input type=image src='ImageStream?ImageName=close.gif' name=closeEdit title='Close Edit Mode' height=16 width=16/></td></tr>";
		strRetValue += "<tr class=ListHeader><td>Name</td><td>Time Stamp</td></tr>";
		int i=1;
		for(Report report: study.getReportsAssessments()){
			strRetValue += "<tr>";
			String name = "";
			if(report.getName().equalsIgnoreCase("")){
				name = study.getName()+"_AssessmentReport_"+i;
			}
			strRetValue += "<td>"+name+"</td><td><a href=ControllerServlet?Action=ActionButton&Report=Assessment&ReportId="+report.getId()+">"+report.getDateCreated()+"</a></td>";
			strRetValue += "</tr>";
			i++;
		}		
		strRetValue += "</table>";
        return strRetValue;
	}	
}
