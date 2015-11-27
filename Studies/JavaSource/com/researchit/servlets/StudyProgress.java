/**
 * Version:
 *     $Id$
 *
 * Revisions:
 *     $Log$
 *     Revision 1.14  2009/05/06 08:25:37  troy.sadkowsky
 *     progress bar updates
 *
 *     Revision 1.13  2009/04/22 04:05:59  ray.welburn
 *     Cause refresh on completion of create ssjsms
 *
 *     Revision 1.12  2009/01/07 05:51:24  troy.sadkowsky
 *     more v2 updates
 *
 *     Revision 1.11  2009/01/05 06:54:54  troy.sadkowsky
 *     progress bar updates
 *
 *     Revision 1.10  2008/09/10 09:12:36  troy.sadkowsky
 *     interview review updates
 *
 *     Revision 1.9  2008/09/03 07:37:25  troy.sadkowsky
 *     tidy code and ensure connections close
 *
 *     Revision 1.8  2008/08/13 04:40:53  troy.sadkowsky
 *     removed debug print
 *
 *     Revision 1.7  2008/08/11 01:56:57  ray.welburn
 *     move study object to common package
 *
 *     Revision 1.6  2008/08/05 00:28:25  ray.welburn
 *     Use session for progress bar
 *
 *     Revision 1.5  2008/05/26 08:25:15  troy.sadkowsky
 *     reworked main functions
 *
 */
package com.researchit.servlets;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import com.researchit.JobSpecificModule;
import com.researchit.ProgressNotifier;
import com.researchit.User;
import com.researchit.common.Study;

public class StudyProgress implements Runnable{

	public static final Integer SAVESTUDY = 1;
	public static final Integer FREEZEJSMS = 2;
	public static final Integer OTHER = 3;
	HttpSession session;
	Integer function;
	Study study;
	ArrayList<JobSpecificModule> exclusionJSMs;
	ArrayList<JobSpecificModule> jsmsToFreeze;
	User user;
	ProgressNotifier pNotifier;
	
	public ProgressNotifier getPNotifier() {
		return pNotifier;
	}
	public void setPNotifier(ProgressNotifier notifier) {
		pNotifier = notifier;
	}
	public Study getStudy() {
		return study;
	}
	public void setStudy(Study study) {
		this.study = study;
	}
	public StudyProgress(HttpSession session) {
		super();
		this.session = session;		
	}
	public void run() {
		switch(this.getFunction()){
			case 1:{ //SAVE STUDY
				try {
					int iCount = 0;
					ArrayList<JobSpecificModule> jsms = study.getStudySpecificJsmsPreview();
					for(JobSpecificModule jsm: jsms){
						if(!(this.getExclusionJSMs().contains(jsm))){
							if(!(study.getStudySpecificJsms().contains(jsm))){
								iCount++;
							}
						}						
					}
					session.setAttribute("totalcount", iCount);
					session.setAttribute("ProgressTotal", iCount);
					int iTotal = iCount;
					iCount = 0;
					for(JobSpecificModule jsm: jsms){
						if(!(this.getExclusionJSMs().contains(jsm))){
							if(!(study.getStudySpecificJsms().contains(jsm))){								
								study.linkJSM(jsm.getId(),user.getId());
								iCount++;
								session.setAttribute("count", iCount);
								session.setAttribute("Progress", iCount);
							}
						}
					}
					iCount++;
					session.setAttribute("count", iCount);
					session.setAttribute("Progress", iTotal);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			break;
			case 2:{ //Freeze JSMs
				try {
					int iCountTotal = jsmsToFreeze.size();
					session.setAttribute("ProgressTotal", iCountTotal);
					session.setAttribute("totalcount", iCountTotal);
					int iCount = 0;
					for(JobSpecificModule jsm: jsmsToFreeze){
						jsm.freeze(study);
						iCount++;
						session.setAttribute("Progress", iCount);
						session.setAttribute("count", iCount);
					}
					session.setAttribute("Progress", iCountTotal);
					session.removeAttribute("freezeJSMs");
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
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public ArrayList<JobSpecificModule> getExclusionJSMs() {
		if(exclusionJSMs==null){
			exclusionJSMs = new ArrayList<JobSpecificModule>();
		}
		return exclusionJSMs;
	}
	public void setExclusionJSMs(ArrayList<JobSpecificModule> exclusionJSMs) {
		this.exclusionJSMs = exclusionJSMs;
	}
	public ArrayList<JobSpecificModule> getJsmsToFreeze() {
		return jsmsToFreeze;
	}
	public void setJsmsToFreeze(ArrayList<JobSpecificModule> jsmsToFreeze) {
		this.jsmsToFreeze = jsmsToFreeze;
	}
}
