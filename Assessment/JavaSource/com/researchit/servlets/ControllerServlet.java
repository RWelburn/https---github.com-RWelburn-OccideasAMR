/**
 * Revisions:
 *     $Log: ControllerServlet.java,v $
 *     Revision 1.104  2009/05/27 02:00:08  troy.sadkowsky
 *     bug fix 814 3cat frequency hours
 *
 *     Revision 1.103  2009/05/06 08:23:17  troy.sadkowsky
 *     fix for progress bar and use auto assessments
 *
 *     Revision 1.102  2009/02/24 00:27:26  ray.welburn
 *     Corrections to nvaigation between modules
 *
 *     Revision 1.101  2009/02/19 03:31:11  troy.sadkowsky
 *     archive report functions
 *
 *     Revision 1.100  2009/02/04 22:33:31  troy.sadkowsky
 *     New report functions
 *
 *     Revision 1.99  2009/01/21 08:42:22  troy.sadkowsky
 *     show and hide action bar
 *
 *     Revision 1.98  2009/01/07 05:51:52  troy.sadkowsky
 *     more v2 updates
 *
 *     Revision 1.97  2009/01/06 07:42:35  troy.sadkowsky
 *     v2 updates
 *
 *     Revision 1.96  2009/01/06 01:17:40  troy.sadkowsky
 *     report to excel functions
 *
 *     Revision 1.95  2008/12/30 00:11:58  troy.sadkowsky
 *     paging and speed enhancements
 *
 *     Revision 1.94  2008/12/23 10:33:23  troy.sadkowsky
 *     speed enhancements, linked jsms, progress bar
 *
 *     Revision 1.93  2008/12/20 02:06:57  troy.sadkowsky
 *     v2 updates
 *
 *     Revision 1.92  2008/12/17 03:58:33  ray.welburn
 *     New title bars and coles buttons added
 *
 *     Revision 1.91  2008/11/25 23:27:48  troy.sadkowsky
 *     Assessment report updates
 *
 *     Revision 1.90  2008/11/15 09:08:54  troy.sadkowsky
 *     various bug fixes and code cleaning
 *
 *     Revision 1.89  2008/09/24 12:15:19  troy.sadkowsky
 *     demo ready
 *
 *     Revision 1.88  2008/09/20 08:59:43  troy.sadkowsky
 *     new assessment updates
 *
 *     Revision 1.87  2008/09/12 02:38:30  troy.sadkowsky
 *     ASsessment report updates
 *
 *     Revision 1.86  2008/09/10 09:09:59  troy.sadkowsky
 *     assessment updates
 *
 *     Revision 1.85  2008/08/25 01:36:07  ray.welburn
 *     Updates to use single dbobject and participant status table
 *
 *     Revision 1.84  2008/08/20 03:38:48  troy.sadkowsky
 *     assessment updates
 *
 *     Revision 1.83  2008/08/13 04:18:29  troy.sadkowsky
 *     assessment review updates
 *
 *     Revision 1.82  2008/08/11 01:46:30  ray.welburn
 *     move study object to common package
 *
 *     Revision 1.81  2008/08/02 06:18:37  troy.sadkowsky
 *     removed jess
 *
 *     Revision 1.80  2008/07/08 04:32:21  troy.sadkowsky
 *     run auto assessments on selected
 *
 *     Revision 1.79  2008/07/05 03:32:45  troy.sadkowsky
 *     new previous button
 *
 *     Revision 1.78  2008/06/29 23:19:27  troy.sadkowsky
 *     ability to run all auto assessments
 *
 *     Revision 1.77  2008/06/01 11:59:12  ray.welburn
 *     Add lastupdated to participant on job history update and assessment run
 *
 *     Revision 1.76  2008/05/30 01:52:52  troy.sadkowsky
 *     removed old code
 *
 *     Revision 1.75  2008/05/29 04:12:18  ray.welburn
 *     participant last updated applied to all participant changes
 *
 *     Revision 1.74  2008/05/18 12:19:37  troy.sadkowsky
 *     added note to those assessments made from previous jh assessments
 *
 *     Revision 1.73  2008/04/28 06:37:53  troy.sadkowsky
 *     export assessments to excel
 *
 *     Revision 1.72  2008/04/22 23:24:51  troy.sadkowsky
 *     new assessment requirements
 *
 *     Revision 1.71  2008/04/01 14:38:18  troy.sadkowsky
 *     new report on studies page and new filter by jsm
 *
 *     Revision 1.70  2008/03/12 07:50:48  troy.sadkowsky
 *     reworked actionlogger
 *
 *     Revision 1.69  2008/03/11 06:45:25  troy.sadkowsky
 *     modification to action logger to include session values as well as names
 *
 *     Revision 1.68  2008/03/06 03:08:38  ray.welburn
 *     Additions to Action logger to log user actions
 *
 *     Revision 1.67  2008/03/02 23:34:49  ray.welburn
 *     Logout goes back to home page
 *
 *     Revision 1.66  2008/02/15 02:04:56  ray.welburn
 *     Corrrect Excel export
 *
 *     Revision 1.65  2008/02/14 06:56:32  ray.welburn
 *     Logout now goes to home page
 *
 *     Revision 1.64  2007/12/08 02:43:03  ray.welburn
 *     Status Filter now works with timebased and text searches
 *
 *     Revision 1.63  2007/12/06 05:05:18  ray.welburn
 *     Add icon to times based search
 *
 *     Revision 1.62  2007/12/06 02:27:15  ray.welburn
 *     Added ability of users to change page size
 *
 *     Revision 1.61  2007/12/05 23:12:02  ray.welburn
 *     Added time based search
 *
 *     Revision 1.60  2007/12/04 01:44:03  troy.sadkowsky
 *     changed logout redirect
 *
 *     Revision 1.59  2007/11/24 06:26:27  troy.sadkowsky
 *     filter by participant status
 *
 *     Revision 1.58  2007/11/16 04:09:54  troy.sadkowsky
 *     conflict fix and tidy up
 *
 *     
 */
package com.researchit.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.researchit.Agent;
import com.researchit.Assessment;
import com.researchit.JobHistory;
import com.researchit.JobHistoryStatus;
import com.researchit.ParticipantStatus;
import com.researchit.User;
import com.researchit.UserActionLogger;
import com.researchit.common.Participant;
import com.researchit.common.Study;
import com.researchit.expert.Engine;
import com.researchit.expert.ExpertAgent;
import com.researchit.html.AssessmentSystem;
import com.researchit.html.OccCalendar;
import com.researchit.io.Report;

/**
 * Servlet implementation class for Servlet: ControllerServlet
 * 
 * @web.servlet name="ControllerServlet" display-name="ControllerServlet"
 * 
 * @web.servlet-mapping url-pattern="/ControllerServlet"
 * 
 */
public class ControllerServlet extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet {

    private static final long serialVersionUID = 1L;

    /*
     * (non-Java-doc)
     * 
     * @see javax.servlet.http.HttpServlet#HttpServlet()
     */
    public ControllerServlet() {
        super();
    }

    /*
     * (non-Java-doc)
     * 
     * @see javax.servlet.http.HttpServlet#doGet(HttpServletRequest arg0,
     *      HttpServletResponse arg1)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }

    /*
     * (non-Java-doc)
     * 
     * @see javax.servlet.http.HttpServlet#doPost(HttpServletRequest arg0,
     *      HttpServletResponse arg1)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String strScrollPos = "0";
        try {
        	if(request.getSession().getAttribute("UserObject")!=null){
				User user = (User) request.getSession().getAttribute("UserObject");
	            if (request.getParameter("scrollPos") != null) {
	                strScrollPos = request.getParameter("scrollPos");
	                request.setAttribute("scrollPos", strScrollPos);
	            }
	            if (request.getParameter("pagesize") != null) {
					request.getSession().setAttribute("PageSize", request.getParameter("pagesize"));
					request.getSession().removeAttribute("participantPage");
	            }     		
	            if (request.getParameter("Action") != null) {
	            	UserActionLogger ual = new UserActionLogger(Integer.parseInt(user.getId()), this.getAction(request));
					if (!ual.getAction().equals("-")) {
						ual.saveActionLog();
					}
	                String strAction = request.getParameter("Action").toString();
	                this.separateIdFromNames(request);
	                if (request.getParameter("logout.x") != null) {
	                    this.logOut(request, response);
					}else if (request.getParameter("closeEdit.x") != null) {
						this.closeEditMode(request, response);
	        		} else if (request.getParameter("runAssessments.x") != null) {
						this.runAssessments(request, response);
	                } else if (request.getParameter("jobHistoryDetail.x") != null) {
						this.toggleJobDetail(request, response);
					} else if (request.getParameter("studyManager.x") != null) {
						this.studyManager(request, response);
	                }else if (request.getParameter("quickJHAssessment.x") != null) {
						this.quickAssessmentJH(request, response);
	                }else if (request.getParameter("quickAssessment.x") != null) {
						this.quickAssessment(request, response);
	                }else if (request.getParameter("batchConfirm.x") != null) {
						this.batchConfirm(request, response);
	                }else if (request.getParameter("useAutoNones.x") != null) {
						this.useAutoNones(request, response);
	                } else if (request.getParameter("Report") != null) {
	                    this.showReportExcel(request, response);
	                } else if (request.getParameter("toExcel.x") != null) {
	                    this.showReportList(request, response);
	                } else if (request.getParameter("createReportAssessment.x") != null) {
	                    this.createReportAssessment(request, response);
	                } else if (request.getParameter("fullView.x") != null) {
						this.printView(request, response);
					} else if (request.getParameter("minimise.x") != null) {
						this.minimiseActionButtons(request, response);
					} else if (request.getParameter("maximise.x") != null) {
						this.maximiseActionButtons(request, response);
					} else if (request.getParameter("saveParticipantStatus.x") != null) {
		            	this.setParticipantStatus(request, response);		                    
		            } else if (strAction.equalsIgnoreCase("ViewAssessments")) {
	                    this.showAssessments(request, response);
	                } else if (strAction.equalsIgnoreCase("SaveAssessment")) {
	                    this.saveAssessment(request, response);    
//	                } else if (strAction.equalsIgnoreCase("ShowReportExcel")) {
//	                    this.showReportExcel(request, response);
	                } else if (strAction.equalsIgnoreCase("Previous")) {
	                    this.movePrevious(request, response);
	                } else if (strAction.equalsIgnoreCase("Next")) {
	                    this.moveNext(request, response);
	                } else if (request.getParameter("time.x") != null) { //toggle for time based search
                    	this.setTimeBasedSearch(request, response);
	                } else if (request.getParameter("Clear.x") != null) {
						this.clearSearchString(request, response);
	                } else if (request.getParameter("SelectPeriod") != null) {
                    	this.searchPeriod(request, response);
	                } else if (request.getParameter("jhStatus") != null) {
						this.filterByJobHistoryStatus(request, response);
					} else if (request.getParameter("searchTxt") != null) {
						if ((!request.getParameter("searchTxt").equalsIgnoreCase(""))&&(!request.getParameter("searchTxt").equalsIgnoreCase("Participant Search"))){
							this.searchTxt(request, response);
						}else if (request.getParameter("participantStatus") != null) {
							this.filterByParticipantStatus(request, response);
						}
					} else if (request.getParameter("pagesize") != null) {
						request.getSession().setAttribute("PageSize", request.getParameter("pagesize"));
						RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
				        dis.forward(request, response);
		            } else { 
	                	throw new Exception("OccIDEAS Exception 'No Action Type'");
	                }
	            } else { 
                	throw new Exception("OccIDEAS Exception 'No Action'");
                }
        	}else{
                this.logOut(request, response);
            }
        } catch (Exception e) {
            e.printStackTrace();
            request.setAttribute("errorMessage", e.getMessage());
            RequestDispatcher dis = request.getRequestDispatcher("errorpage.jsp");
            dis.forward(request, response);
        }
    }   
    private void createReportAssessment(HttpServletRequest request, HttpServletResponse response) throws Exception {
		AssessmentSystem as = new AssessmentSystem();
		String studyId = request.getSession().getAttribute("StudyID").toString();
		Study study = new Study(studyId);
		Report report = new Report();
		report.setStudyId(studyId);
		report.setFileDataString(as.showAssessmentReportHTML(study));
		report.setReportType(Report.ASSESSMENTSREPORT);		
		report.insert();
		request.setAttribute("reports",true);
        RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
        dis.forward(request, response);
	}

	private void showReportList(HttpServletRequest request, HttpServletResponse response) throws Exception {		
		request.setAttribute("reports",true);
        RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
        dis.forward(request, response);					
	}
	private void quickAssessmentJH(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String studyID = request.getSession().getAttribute("StudyID").toString();
		Study study = new Study(studyID);
		if(request.getSession().getAttribute("JobHistoryID")!=null){
			String jhId =request.getSession().getAttribute("JobHistoryID").toString();
			JobHistory jh = new JobHistory(jhId);
			Participant p = new Participant(Long.valueOf(jh.getParticipantId()));		
			User user = (User)request.getSession().getAttribute("UserObject");
	        String username = user.getName();
	        String userid = user.getId();
	        //for(Agent agent : study.getAgents()){
			//	jh.removeAssessment(agent.getId());
			//}
			for(Assessment assessment: jh.getAutoAssessments()){
				assessment.setAssessorusername(username);
	            assessment.setAssessorId(userid);
	            if(!(assessment.hasManualAssessment())){
					assessment.insert();
				}
			}			            
    		p.setStatusId(ParticipantStatus.ASSESSMENTINCOMPLETE);
    		
            OccCalendar now = new OccCalendar();
			p.setLastUpdated(now.getDatabaseFormatDate());
			p.save();
		}else if(request.getSession().getAttribute("ParticipantID")!=null){
			String pId =request.getSession().getAttribute("ParticipantID").toString();
			Participant p = new Participant(Long.parseLong(pId));
			for(JobHistory jh : p.getJobHistories()){
				User user = (User)request.getSession().getAttribute("UserObject");
		        String username = user.getName();
		        String userid = user.getId();
				for(Assessment assessment: jh.getAutoAssessments()){
					assessment.setAssessorusername(username);
		            assessment.setAssessorId(userid);
					assessment.insert();
				}				            
	    	}
			OccCalendar now = new OccCalendar();
			p.setStatusId(ParticipantStatus.ASSESSMENTCOMPLETE);	    			            
			p.setLastUpdated(now.getDatabaseFormatDate());
			p.save();
		}else{
			java.util.Enumeration postedvalues = request.getParameterNames();
	        while (postedvalues.hasMoreElements()) {
	            String strPost = postedvalues.nextElement().toString();
	            if (strPost.contains("participantCheckBox")) {
	                String pID = strPost.substring(strPost.indexOf("_") + 1);
	                Participant p = new Participant(Long.valueOf(pID));
	                for(JobHistory jh : p.getJobHistories()){
	    				User user = (User)request.getSession().getAttribute("UserObject");
	    		        String username = user.getName();
	    		        String userid = user.getId();
	    				for(Assessment assessment: jh.getAutoAssessments()){
	    					assessment.setAssessorusername(username);
	    		            assessment.setAssessorId(userid);
	    		            if(!(assessment.hasManualAssessment())){
	    						assessment.insert();
	    					}
	    				}			
	    	            if(jh.isAllManuallyAssessed(study)){
	    	    			p.setStatusId(ParticipantStatus.ASSESSMENTCOMPLETE);
	    	            }else{
	    	    			p.setStatusId(ParticipantStatus.ASSESSMENTINCOMPLETE);
	    	    		}	            
	    			}
	    			OccCalendar now = new OccCalendar();
	    			p.setLastUpdated(now.getDatabaseFormatDate());
	    			p.save();
	            }           
	        }
		}
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}

	private void studyManager(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.sendRedirect("../StudyMgr/ValidateServlet");
	}
	
	private void batchConfirm(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//String studyID = request.getSession().getAttribute("StudyID").toString();
		//Study study = new Study(studyID);
		User user = (User) request.getSession().getAttribute("UserObject");
		OccCalendar now = new OccCalendar();
		Enumeration postedvalues = request.getParameterNames();
		while (postedvalues.hasMoreElements()) {
			String strPost = postedvalues.nextElement().toString();
			if (strPost.contains("jhCheckBox")) {
				String lqID = strPost.substring(strPost.indexOf("_") + 1);
				JobHistory jh = new JobHistory(lqID);	
				//for(Agent agent : study.getAgents()){
				//	jh.removeAssessment(agent.getId());
				//}
				for(Assessment assessment: jh.getAutoAssessments()){
					assessment.setAssessorusername(user.getName());
					assessment.setAssessorId(user.getId());
					assessment.setJobHistoryId(jh.getId());
					if(!(assessment.hasManualAssessment())){
						assessment.insert();
					}
				}				
				Participant p = new Participant(Long.valueOf(jh.getParticipantId()));
	            //if(jh.isAllAssessed()){	     	
	    		//	p.setStatusId(ParticipantStatus.ASSESSMENTCOMPLETE);
	            //}else{
	    			p.setStatusId(ParticipantStatus.ASSESSMENTINCOMPLETE);
	    		//}
	            //jh.update();
	            p.setLastUpdated(now.getDatabaseFormatDateTime());
	            p.save();
	        	//p.update();        	
			}
		}
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}
	private void useAutoNones(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String studyID = request.getSession().getAttribute("StudyID").toString();
		Study study = new Study(studyID);
		User user = (User) request.getSession().getAttribute("UserObject");
		OccCalendar now = new OccCalendar();
		for(Participant p:study.filterParticipants(ParticipantStatus.READYFORASSESSMENT)){
			boolean isAllNoExposure = true;
			for(JobHistory jh: p.getJobHistories()){
				ArrayList<Assessment> assessments = jh.getAutoAssessments();
				if(assessments.size()>0){
					for(Assessment assessment:assessments){
						if(!(assessment.getExposure().equalsIgnoreCase("None"))){
							isAllNoExposure = false;
						}else{
							String username = user.getName();
					        String userid = user.getId();
							assessment.setAssessorusername(username);
				            assessment.setAssessorId(userid);
							assessment.insert();
						}
					}
				}else{
					isAllNoExposure = false;
				}			
			}
			if(isAllNoExposure){
//				for(JobHistory jh : p.getJobHistories()){
//					String username = user.getName();
//			        String userid = user.getId();
//					for(Assessment assessment: jh.getAutoAssessments()){
//						assessment.setAssessorusername(username);
//			            assessment.setAssessorId(userid);
//						assessment.insert();
//					}				            
//		    	}
				p = new Participant(Long.valueOf(p.getParticipantId()));
				p.setStatusId(ParticipantStatus.ASSESSMENTCOMPLETE);	    			            
				p.setLastUpdated(now.getDatabaseFormatDate());
				p.save();
			}
		}
		
		Enumeration postedvalues = request.getParameterNames();
		while (postedvalues.hasMoreElements()) {
			String strPost = postedvalues.nextElement().toString();
			if (strPost.contains("jhCheckBox")) {
				String lqID = strPost.substring(strPost.indexOf("_") + 1);
				JobHistory jh = new JobHistory(lqID);	
				//for(Agent agent : study.getAgents()){
				//	jh.removeAssessment(agent.getId());
				//}
				for(Assessment assessment: jh.getAutoAssessments()){
					assessment.setAssessorusername(user.getName());
					assessment.setAssessorId(user.getId());
					assessment.setJobHistoryId(jh.getId());
					if(!(assessment.hasManualAssessment())){
						assessment.insert();
					}
				}				
				Participant p = new Participant(Long.valueOf(jh.getParticipantId()));
	            //if(jh.isAllAssessed()){	     	
	    		//	p.setStatusId(ParticipantStatus.ASSESSMENTCOMPLETE);
	            //}else{
	    			p.setStatusId(ParticipantStatus.ASSESSMENTINCOMPLETE);
	    		//}
	            //jh.update();
	            p.setLastUpdated(now.getDatabaseFormatDateTime());
	            p.save();
	        	//p.update();        	
			}
		}
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}

	private void movePrevious(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String lastIds = "";
		if(request.getSession().getAttribute("PreviousIDs")!=null){
			String previousIds = request.getSession().getAttribute("PreviousIDs").toString();
			String jhId = "";
			String[] ids = previousIds.split(",");
			int i = 0;
			int iSize = ids.length;
			for(String id: ids){
				i++;
				if(i==iSize){
					jhId = id;
				}else{
					lastIds += id+",";
				}
			}
			JobHistory jh = new JobHistory(jhId);
			request.getSession().setAttribute("ParticipantID",jh.getParticipantId());				
			request.getSession().setAttribute("JobHistoryID",jhId);				
		}
		if(lastIds.equalsIgnoreCase("")){
			request.getSession().removeAttribute("PreviousIDs");
		}else{
			request.getSession().setAttribute("PreviousIDs",lastIds);
		}		
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
        dis.forward(request, response);
	}
	/*
	private void exportReportToExcel(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String jhStatusId = request.getParameter("jhStatus").toString();
		request.getSession().setAttribute("StatusFilter",jhStatusId);
		if (request.getParameter("jhJSM") != null) {
			String jhJSMId = request.getParameter("jhJSM").toString();
			request.getSession().setAttribute("JSMFilter",jhJSMId);
		}
		String reportName = "excelReport";
		String agentId = request.getSession().getAttribute("AgentID").toString();
		String studyId = request.getSession().getAttribute("StudyID").toString();
		Study study = new Study(studyId);
		List<JobHistory> jhs = new ArrayList<JobHistory>();
		JobHistory jh = new JobHistory();   
		String statusFilterId = "None";
		String jsmFilterId = "None";
		if (request.getSession().getAttribute("AnswerID") != null) {       	
        	jh = new JobHistory();	            
            String answerID = request.getSession().getAttribute("AnswerID").toString();
            String questionID = request.getSession().getAttribute("QuestionID").toString();
            String answerDescription = request.getSession().getAttribute("AnswerDescription").toString();
            String statusFilter = "";
            if(request.getSession().getAttribute("StatusFilter")!=null){
            	statusFilterId = request.getSession().getAttribute("StatusFilter").toString();
            	if(!(statusFilterId.equalsIgnoreCase("None"))){
            		statusFilter = " AND jobhistory.jobhistorystatusid = "+statusFilterId;
            	} 	
            }
            String jsmFilter = "";
            if(request.getSession().getAttribute("JSMFilter")!=null){
            	jsmFilterId = request.getSession().getAttribute("JSMFilter").toString();
            	if(!(jsmFilterId.equalsIgnoreCase("None"))){
            		jsmFilter = " AND jobhistory.finaljsmid = "+jsmFilterId;
            	} 	
            }
        	String sql = "SELECT jsminterview.jobhistoryid AS id,jobhistory.referencenumber FROM  jsminterviewanswers" +
        			" INNER JOIN jsminterview ON jsminterviewanswers.jsminterviewid = jsminterview.id" +
        			" INNER JOIN jobhistory ON jsminterview.jobhistoryid = jobhistory.id" +
        			" INNER JOIN participant ON jobhistory.participantid = participant.id " +
        			" WHERE (jsminterviewanswers.jsmquestionstructureid = "+questionID+")" +
        					" AND (jsminterviewanswers.possibleanswerid = "+answerID+")" +
        					" AND (jsminterviewanswers.answerdescription = "+answerDescription+") AND (participant.studyid = "+studyId+") "
        					+statusFilter+" "
        					+jsmFilter+" ORDER BY jsminterview.jobhistoryid ";       	
        	jhs = jh.getJobHistories(sql);	
        	reportName = answerDescription;
        } else if (request.getSession().getAttribute("AgentID") != null){      	       	   	 
        	String statusFilter = "";
        	Agent agent = new Agent(agentId);
        	reportName = agent.getName();
	        if(request.getSession().getAttribute("StatusFilter")!=null){
	        	statusFilterId = request.getSession().getAttribute("StatusFilter").toString();
	        	if(!(statusFilterId.equalsIgnoreCase("None"))){
            		statusFilter = " AND jobhistory.jobhistorystatusid = "+statusFilterId;
            	}else{
		        	statusFilter = "AND (jobhistory.jobhistorystatusid IN (2,3,4,5,6,7))";
	            }
	        }else{
	        	statusFilter = "AND (jobhistory.jobhistorystatusid IN (2,3,4,5,6,7))";
            }
	        String jsmFilter = "";
            
            if(request.getSession().getAttribute("JSMFilter")!=null){
            	jsmFilterId = request.getSession().getAttribute("JSMFilter").toString();
            	if(!(jsmFilterId.equalsIgnoreCase("None"))){
            		jsmFilter = " AND jobhistory.finaljsmid = "+jsmFilterId;
            	} 	
            }
    		String sql = "SELECT jobhistory.id, jobhistory.referencenumber"
        		+" FROM jobhistory INNER JOIN"
        		+" participant ON jobhistory.participantid = participant.id INNER JOIN"
        		+" study ON participant.studyid = study.id "
        		+" WHERE (study.id = "+studyId+") "+statusFilter+" "+jsmFilter+" ORDER BY participant.id,jobhistory.id";
        	jhs = jh.getJobHistories(sql);			
        }		
		response.setContentType("application/xls");
		response.setHeader("Content-disposition","attachment;filename=\""+reportName+".csv\"");
		AssessmentSystem as = new AssessmentSystem();
		response.getOutputStream().print(as.showReportExcel(jhs,agentId,statusFilterId,jsmFilterId,study));		
	}
	*/
	private void quickAssessment(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String studyID = request.getSession().getAttribute("StudyID").toString();
		Study study = new Study(studyID);
		OccCalendar now = new OccCalendar();
		String exposure = "";
	    String level = "";
	    String weeks = "";
	    String hours = "";
	    String dontknow = "";
	    	
		String agentId = request.getSession().getAttribute("AgentID").toString();
		ExpertAgent agent = new ExpertAgent(agentId);

		Enumeration postedvalues = request.getParameterNames();
		while (postedvalues.hasMoreElements()) {
			String strPost = postedvalues.nextElement().toString();
			if (strPost.contains("jhCheckBox")) {
				String lqID = strPost.substring(strPost.indexOf("_") + 1);
				JobHistory jh = new JobHistory(lqID);	
				
	        	Assessment autoAssessment = agent.getAutoAssessment(jh);
	        	if(!(autoAssessment.getId().equalsIgnoreCase(""))){
	        		jh.removeAssessment(agent.getId());
	        		exposure = autoAssessment.getExposure();
		        	if(!(autoAssessment.getLevel().equalsIgnoreCase("None"))){
		        		level = autoAssessment.getLevel();
		        	}           
		            weeks = String.valueOf(autoAssessment.getFrequencyweeks());
		            hours = String.valueOf(autoAssessment.getFrequencyhours());
		            dontknow = autoAssessment.getDontknow();
		            Assessment assessment = new Assessment();
		            if(!(weeks.equalsIgnoreCase("-1.0"))){
		            	assessment.setFrequencyweeks(Float.valueOf(weeks));
		            }
		            if(!(hours.equalsIgnoreCase("-1.0"))){
		            	assessment.setFrequencyhours(Float.valueOf(hours));  
		            } 		            
		            assessment.setAgentId(agent.getId());
		            assessment.setJobHistoryId(jh.getId());
		            assessment.setExposure(exposure);
		            assessment.setLevel(level);		            		                              
		            assessment.setDontknow(dontknow);
		            User user = (User)request.getSession().getAttribute("UserObject");
		            String username = user.getName();
		            String userid = user.getId();
		            assessment.setAssessorusername(username);
		            assessment.setAssessorId(userid);
		            assessment.save();
		            Participant p = new Participant(Long.valueOf(jh.getParticipantId()));
		            if(jh.isAllManuallyAssessed(study)){	     	
		    			p.setStatusId(ParticipantStatus.ASSESSMENTCOMPLETE);
		            }else{
		    			p.setStatusId(ParticipantStatus.ASSESSMENTINCOMPLETE);
		    		}
		            p.setLastUpdated(now.getDatabaseFormatDateTime());
		        	p.save();
	        	}	        	
			}
		}
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}
	private void toggleJobDetail(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getSession().getAttribute("ShowJHDetail")==null){
			request.getSession().setAttribute("ShowJHDetail","On");
		}else{
			request.getSession().removeAttribute("ShowJHDetail");
		}
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}
	private void setTimeBasedSearch(HttpServletRequest request, HttpServletResponse response) throws Exception{
		if (request.getSession().getAttribute("Timebased") == null) {
			request.getSession().setAttribute("Timebased", "false");
		}
		if (request.getSession().getAttribute("Timebased").equals("false")) {
			request.getSession().setAttribute("Timebased", "true");
		}else{
			request.getSession().setAttribute("Timebased", "false");
		}	
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}	
    private void filterByJobHistoryStatus(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String jhStatusId = request.getParameter("jhStatus").toString();
		request.getSession().setAttribute("StatusFilter",jhStatusId);
		if (request.getParameter("jhJSM") != null) {
			String jhJSMId = request.getParameter("jhJSM").toString();
			request.getSession().setAttribute("JSMFilter",jhJSMId);
		}
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
        dis.forward(request, response);
	}
    private void filterByParticipantStatus(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String jhStatusId = request.getParameter("participantStatus").toString();
		request.getSession().setAttribute("StatusFilter",jhStatusId);
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
        dis.forward(request, response);
	}
	private void searchTxt(HttpServletRequest request, HttpServletResponse response) throws Exception{		
   		request.getSession().setAttribute("searchTxt",request.getParameter("searchTxt"));
		if (request.getParameter("participantStatus") != null) {
			this.filterByParticipantStatus(request, response);
		}else {
			RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
			dis.forward(request, response);
		}
	}	
	private void searchPeriod(HttpServletRequest request, HttpServletResponse response) throws Exception{
		String period = request.getParameter("SelectPeriod");
		request.getSession().setAttribute("SearchPeriod", period);
		if (request.getParameter("participantStatus") != null) {
			this.filterByParticipantStatus(request, response);
		}else {
			RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
			dis.forward(request, response);
		}
	}
	private void clearSearchString(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getSession().removeAttribute("searchTxt");
		request.getSession().removeAttribute("SearchPeriod");
		request.getSession().setAttribute("Timebased", "false");
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}	
   	private void showAssessments(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String jhid = request.getParameter("jobhistoryID");     
        request.getSession().setAttribute("JobHistoryID", jhid);
        RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
        dis.forward(request, response);
    }
   	private void separateIdFromNames(HttpServletRequest request) {
    	java.util.Enumeration postedvalues = request.getParameterNames();
    	while (postedvalues.hasMoreElements()) {
            String strPost = postedvalues.nextElement().toString();
            if (strPost.contains("_addToRule.x")) {
            	String id = strPost.substring(0,strPost.indexOf("_"));
            	request.setAttribute("questionId",id);           	
            	request.setAttribute("addToRule.x",id);
            }else if (strPost.contains("_yearAddToRule.x")) {
            	String id = strPost.substring(0,strPost.indexOf("_"));
            	request.setAttribute("jhId",id);           	
            	request.setAttribute("addYearToRule",id);
            	request.setAttribute("jhAttribute","yearStarted");
            }else if (strPost.contains("_addORRequirement.x")) {
            	String id = strPost.substring(0,strPost.indexOf("_"));
            	request.setAttribute("addORRequirement",id);           	
            }else if (strPost.contains("_removeRequirement.x")) {
            	String id = strPost.substring(0,strPost.indexOf("_"));
            	request.setAttribute("removeRequirement",id);           	
            }else if (strPost.contains("_removeFact.x")) {
            	String id = strPost.substring(0,strPost.indexOf("_"));
            	request.setAttribute("removeFact",id);           	
            }
    	}		
	}
	private void runAssessments(HttpServletRequest request, HttpServletResponse response) throws Exception {
    	String studyID = request.getSession().getAttribute("StudyID").toString();				
		Study study = new Study(studyID);	
		
		if (request.getSession().getAttribute("JobHistoryID") != null) {
			String jhId = request.getSession().getAttribute("JobHistoryID").toString();
			JobHistory jh1 = new JobHistory(jhId);
			if(request.getSession().getAttribute("AgentID")!=null){
				String agentId = request.getSession().getAttribute("AgentID").toString();
				Engine engine = new Engine();
				engine.Evaluate11(new ExpertAgent(agentId),jh1,study);
			}			
		}else{
			List<JobHistory> jhs = new ArrayList<JobHistory>();		
			AssessmentProgress prog = new AssessmentProgress(request.getSession());		
			prog.setAgents(study.getAgents());
			prog.setStudy(study);						
			JobHistory jh = new JobHistory();
	    	String sql = "SELECT jobhistory.id, jobhistory.referencenumber " +
			" FROM jobhistory INNER JOIN participant ON jobhistory.participantid = participant.id " +
			" WHERE (participant.studyid="+study.getId()+") AND ((jobhistory.jobhistorystatusid="+JobHistoryStatus.INTERVIEWED+") " +
			" OR (jobhistory.jobhistorystatusid="+JobHistoryStatus.NOTTOBEINTERVIEWEDNOJSM+") " +
			" OR (jobhistory.jobhistorystatusid="+JobHistoryStatus.UNEXPOSEDJOB+"));";					
			
	    	jhs = jh.getJobHistories(sql);
			prog.setJobHistories(jhs);
			
			prog.setFunction(AssessmentProgress.AUTOASSESSJHSALL);
			Thread t = new Thread(prog);
			t.start();    							
			request.getSession().setAttribute("InProgress",true);
			request.getSession().removeAttribute("count");
			request.getSession().removeAttribute("Progress");
			request.setAttribute("script", "startPoll();");
		}
		
		
		//request.getSession().setAttribute("MinActionButtons",true);
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);	
	}
	private void logOut(HttpServletRequest request, HttpServletResponse response) throws IOException {	
		try {
			User user = (User) request.getSession().getAttribute("UserObject");
			ArrayList<String> action = new ArrayList<String>();
			action.add("Logout");
			UserActionLogger ual;
			ual = new UserActionLogger(Integer.parseInt(user.getId()), action);
			ual.saveActionLog();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		Enumeration sessionNames = request.getSession().getAttributeNames();
        while (sessionNames.hasMoreElements()) {
            request.getSession().removeAttribute(sessionNames.nextElement().toString());
        }
        response.sendRedirect("/Assessment/");
	}
	private void moveNext(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String lastIds = "";
		if(request.getSession().getAttribute("PreviousIDs")!=null){
			lastIds = request.getSession().getAttribute("PreviousIDs").toString();
		}
		if(request.getSession().getAttribute("ParticipantID")!=null){
			//Long participantId = Long.valueOf((request.getSession().getAttribute("ParticipantID").toString()));
			Participant p = new Participant(Long.valueOf((request.getSession().getAttribute("ParticipantID").toString())));
			if(request.getSession().getAttribute("JobHistoryID")!=null){
				String jhId = request.getSession().getAttribute("JobHistoryID").toString();
				lastIds += jhId+",";
				JobHistory jh = new JobHistory(jhId);
				boolean bFound = false;
				for(JobHistory jh1: p.getJobHistories()){
					//boolean bValid = false;
					//if(jh1.getStatusId().equalsIgnoreCase(JobHistoryStatus.NOTTOBEINTERVIEWEDNOJSM)){
					//	bValid = true;
					//}else if(jh1.getStatusId().equalsIgnoreCase(JobHistoryStatus.NOTTOBEINTERVIEWEDTIME)){
					//	bValid = true;
					//}else if(jh1.getStatusId().equalsIgnoreCase(JobHistoryStatus.TOBEINTERVIEWED)){
					//	bValid = true;
					//}
					//if(bValid){
					if(!(jhId.equalsIgnoreCase(jh1.getId()))){
						int iCurrentId = Integer.valueOf(jhId);
						int iNewId = Integer.valueOf(jh1.getId());
						if(iCurrentId<iNewId){
							if(jh1.getFinalJSMName().equalsIgnoreCase(jh.getFinalJSMName())){
								jhId = jh1.getId();
								bFound = true;
								break;
							}
						}						
					}
					//}										
				}
				if(!(bFound)){
					String nextId = p.getNextAssessmentParticipantId(jh.getFinalJSMName());
					if(!(nextId.equalsIgnoreCase(""))){	
						p = new Participant(Long.valueOf(nextId));
						for(JobHistory jh1: p.getJobHistories()){
							if(jh1.getFinalJSMName().equalsIgnoreCase(jh.getFinalJSMName())){
								jhId = jh1.getId();
								request.getSession().setAttribute("JobHistoryID",jhId);	
								bFound = true;
								break;
							}
						}					
						request.getSession().setAttribute("ParticipantID",nextId);	
						if(!(bFound)){
							request.getSession().removeAttribute("AgentID");
							request.getSession().removeAttribute("JobHistoryID");
							request.getSession().removeAttribute("RuleID");
							request.getSession().removeAttribute("JSMID");
							request.getSession().removeAttribute("InterviewID");
						}
					}
				}else{
					request.getSession().setAttribute("JobHistoryID",jhId);	
				}
//				JobHistory nextJobHistory = new JobHistory(jhId);
//				String interviewId = "";
//				if(nextJobHistory.getCurrentInterview()!=null){
//					interviewId = nextJobHistory.getCurrentInterview().getId();
//					request.getSession().setAttribute("InterviewID",interviewId);
//				}							
//				request.getSession().setAttribute("JobHistoryID",jhId);				
			}else{
				String jhId = "";
				if(p.getJobHistories().size()>0){
					jhId = p.getJobHistories().get(0).getId();
				}
				lastIds = jhId+",";
				String nextId = p.getNextAssessmentParticipantId("");
				request.getSession().setAttribute("ParticipantID",nextId);	
			}
		}
		request.getSession().setAttribute("PreviousIDs",lastIds);
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
        dis.forward(request, response);
	}
	private void showReportExcel(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String studyID = request.getSession().getAttribute("StudyID").toString();
//		Study study = new Study(studyID);
//		AssessmentSystem as = new AssessmentSystem();		
//		response.setContentType("text/html");
//		response.setHeader("Content-disposition","attachment;filename=\""+study.getName()+".htm\"");		
//		response.getOutputStream().print(as.showAssessmentReportHTML(study));	
		
		Study study = new Study(studyID);
		response.setContentType("text/html");
		response.setHeader("Content-disposition","attachment;filename=\""+study.getName()+".htm\"");	
		String reportId = request.getParameter("ReportId");
		Report report = new Report(reportId);
		response.getOutputStream().print(report.getFileDataString());
	}
	private void saveAssessment(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String studyID = request.getSession().getAttribute("StudyID").toString();
		Study study = new Study(studyID);
		User user = (User)request.getSession().getAttribute("UserObject");
        String username = user.getName();
        String userid = user.getId();
		OccCalendar now = new OccCalendar();
		String jhid = request.getParameter("jobHistoryID"); //jhnull
        JobHistory jh = new JobHistory(jhid);
        String agentid = request.getParameter("AgentID");       
        String exposure = "";
        String level = "";
        String weeks = "";
        String hours = "";
        String dontknow = "";
        String comments = "";
        if(request.getParameter("UseAuto")!=null){      	
    		Agent agent = new Agent(agentid);
        	Assessment autoAssessment = agent.getAutoAssessment(jh);
        	exposure = autoAssessment.getExposure();
        	if(!(autoAssessment.getLevel().equalsIgnoreCase("None"))){
        		level = autoAssessment.getLevel();
        	}           
            weeks = String.valueOf(autoAssessment.getFrequencyweeks());
            hours = String.valueOf(autoAssessment.getFrequencyhours());
            dontknow = autoAssessment.getDontknow();
            if(jh.getStatusId().equalsIgnoreCase(JobHistoryStatus.NOTTOBEINTERVIEWEDTIME)){
                comments = "Note: No JSM due to time constraints, therefore used last JH assessment from Job History with same JSM";
            }
            if(weeks.equalsIgnoreCase("-1.0")){
            	weeks = request.getParameter("Weeks");
            }
            if(hours.equalsIgnoreCase("-1.0")){
            	hours = request.getParameter("Hours");
            }  
            if(level==null){
                level = "";
            }
            if(exposure==null){
                exposure = "";
            }
            if(dontknow==null){
                dontknow = "";
            }
            Assessment assessment = new Assessment();
            assessment.setAgentId(agentid);
            assessment.setJobHistoryId(jh.getId());
            assessment.setExposure(exposure);
            assessment.setLevel(level);
            assessment.setFrequencyweeks(Float.valueOf(weeks));
            assessment.setFrequencyhours(Float.valueOf(hours));                    
            assessment.setDontknow(dontknow);
            assessment.setAssessorusername(username);
            assessment.setAssessorId(userid);
            assessment.setComments(comments);
            assessment.save();       	
        }else if(request.getParameter("UsePrevious")!=null){
        	String previousJHId = request.getParameter("jobHistory");
        	if(!(previousJHId.equalsIgnoreCase("NULL"))){
        		JobHistory prevjh = new JobHistory(previousJHId);
        		if(request.getParameter("allAgents")!=null){
        			if(prevjh.isAllManuallyAssessed(study)){
        				for(Assessment assessment: prevjh.getManualAssessments()){
            				assessment.setAssessorusername(username);
            				assessment.setJobHistoryId(jh.getId());
            	            assessment.setAssessorId(userid);
            	            assessment.setComments("Note: No JSM due to time constraints, therefore used JH assessment from Job History Reference Number: "+prevjh.getReferenceNumber());
            	            if(!(assessment.hasManualAssessment())){
        						assessment.insert();
        					}else{
        						request.setAttribute("script","alert('This Job History already has a manual assessment');");
        					}
            			}
        			}else{
        				request.setAttribute("script","alert('Previous Job History not assessed for all agents');");
        			}           		
            	}else{
	            	Assessment prevAssessment = prevjh.getManualAssessment(agentid);
	            	exposure = prevAssessment.getExposure();
	            	if(!(exposure.equalsIgnoreCase(""))){
	            		if(!(prevAssessment.getLevel().equalsIgnoreCase("None"))){
		            		level = prevAssessment.getLevel();
		            	}           
		                weeks = String.valueOf(prevAssessment.getFrequencyweeks());
		                hours = String.valueOf(prevAssessment.getFrequencyhours());
		                dontknow = prevAssessment.getDontknow();
		                comments = "Note: No JSM due to time constraints, therefore used JH assessment from Job History Reference Number: "+prevjh.getReferenceNumber();
		                if(weeks.equalsIgnoreCase("-1.0")){
		                	weeks = request.getParameter("Weeks");
		                }
		                if(hours.equalsIgnoreCase("-1.0")){
		                	hours = request.getParameter("Hours");
		                }
		                if(level==null){
		                    level = "";
		                }
		                if(exposure==null){
		                    exposure = "";
		                }
		                if(dontknow==null){
		                    dontknow = "";
		                }
		                Assessment assessment = new Assessment();
		                assessment.setAgentId(agentid);
		                assessment.setJobHistoryId(jh.getId());
		                assessment.setExposure(exposure);
		                assessment.setLevel(level);
		                assessment.setFrequencyweeks(Float.valueOf(weeks));
		                assessment.setFrequencyhours(Float.valueOf(hours));                    
		                assessment.setDontknow(dontknow);
		                assessment.setAssessorusername(username);
		                assessment.setAssessorId(userid);
		                assessment.setComments(comments);
		                assessment.save();
	            	}else{
        				request.setAttribute("script","alert('Previous Job History not assessed for agent "+agentid+"');");
        			} 	            	  
            	}
        	}       	 
        }else{
        	exposure = request.getParameter("Exposure");
            level = request.getParameter("Level");
            weeks = request.getParameter("Weeks");
            hours = request.getParameter("Hours");
            dontknow = request.getParameter("Dontknow");
            comments = request.getParameter("comments");
            if(level==null){
                level = "";
            }
            if(exposure==null){
                exposure = "";
            }
            if(dontknow==null){
                dontknow = "";
            }
            Assessment assessment = new Assessment();
            assessment.setAgentId(agentid);
            assessment.setJobHistoryId(jh.getId());
            assessment.setExposure(exposure);
            assessment.setLevel(level);
            assessment.setFrequencyweeks(Float.valueOf(weeks));
            assessment.setFrequencyhours(Float.valueOf(hours));                    
            assessment.setDontknow(dontknow);
            assessment.setAssessorusername(username);
            assessment.setAssessorId(userid);
            assessment.setComments(comments);
            assessment.save();
        }              
        if (request.getParameter("RemoveAssessment") != null) {
            jh.removeAssessment(agentid);
        } else {
//          if all agents assessed mark as complete
            //String pid = request.getSession().getAttribute("ParticipantID").toString();
            Participant p = new Participant(Long.valueOf(request.getSession().getAttribute("ParticipantID").toString()));
            if(jh.isAllManuallyAssessed(study)){
    			p.setStatusId(ParticipantStatus.ASSESSMENTCOMPLETE);
            }else{
    			p.setStatusId(ParticipantStatus.ASSESSMENTINCOMPLETE);
    		}
            jh.update();
            p.setLastUpdated(now.getDatabaseFormatDateTime());
        	p.save();       	
        }       
        request.setAttribute("AgentID", agentid);
        String script = "";
        if(request.getAttribute("script")!=null){
        	script = request.getAttribute("script").toString();        	
        }else{
        	script += "flashSaveSuccessful();";
        }
        request.setAttribute("script",script);
        RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
        dis.forward(request, response);
    } 
	private ArrayList<String> getAction(HttpServletRequest request) {		
		ArrayList<String> actionList = new ArrayList<String>();
		actionList.add("Assessment Management System");
		actionList.add("Param");
		Enumeration actions = request.getParameterNames();
		while (actions.hasMoreElements()) {
			String strPost = actions.nextElement().toString();
			actionList.add(strPost);
		}
		actionList.add("Attrib");
		actions = request.getAttributeNames();
		while (actions.hasMoreElements()) {
			String strPost = actions.nextElement().toString();
			actionList.add(strPost);
		}
		actionList.add("Sess");
		actions = request.getSession().getAttributeNames();
		while (actions.hasMoreElements()) {
			String strPost = actions.nextElement().toString();
			if(strPost.equalsIgnoreCase("Location")){
				strPost += request.getSession().getAttribute(strPost).toString();
			}
			if(strPost.equalsIgnoreCase("StudyID")){
				strPost += request.getSession().getAttribute(strPost).toString();
			}
			if(strPost.equalsIgnoreCase("AgentID")){
				strPost += request.getSession().getAttribute(strPost).toString();
			}
			if(strPost.equalsIgnoreCase("ParticipantID")){
				strPost += request.getSession().getAttribute(strPost).toString();
			}
			actionList.add(strPost);
		}
		return actionList;
	}
	private void setParticipantStatus(HttpServletRequest request, HttpServletResponse response) throws Exception {
        OccCalendar now = new OccCalendar();
    	//String strParticipantId = request.getSession().getAttribute("ParticipantID").toString();
        Participant p = new Participant(Long.valueOf(request.getSession().getAttribute("ParticipantID").toString()));
        p.setComments(request.getParameter("comments"));  
        if(request.getParameter("year")!=null){
        	String nextContactDateTime = 
        	request.getParameter("year") + "-"
        	+ request.getParameter("month") + "-" 
        	+ request.getParameter("day") + " " 
        	+ request.getParameter("hour") + ":" 
        	+ request.getParameter("minute") + ":00.0";
        	
        	p.setNextContactDateTime(nextContactDateTime); 	

        }    
        String statusId = request.getParameter("participantStatus");
        if(!(statusId.equalsIgnoreCase("None"))){
			p.setStatusId(statusId);
		}else{
			p.setStatusId(null);
		}
        p.setLastUpdated(now.getDatabaseFormatDateTime());
        p.save();
        request.setAttribute("script","flashSaveSuccessful();");
        RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
    }
	private void printView(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("printView", true);
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}
	private void maximiseActionButtons(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.getSession().removeAttribute("MinActionButtons");
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}
	private void minimiseActionButtons(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.getSession().setAttribute("MinActionButtons",true);
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}
	private void closeEditMode(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		if (request.getSession().getAttribute("ParticipantID") != null && request.getSession().getAttribute("JobHistoryID") == null){
			request.getSession().removeAttribute("ParticipantID");
		}
		if (request.getSession().getAttribute("ParticipantID") != null && request.getSession().getAttribute("JobHistoryID") != null){
			request.getSession().removeAttribute("JobHistoryID");
		}
		request.setAttribute("scrollPos", request.getSession().getAttribute("ScrollPos"));
		request.getSession().removeAttribute("ScrollPos");
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}
}