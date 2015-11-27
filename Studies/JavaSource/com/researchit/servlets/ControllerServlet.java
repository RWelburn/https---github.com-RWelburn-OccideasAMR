/**
 * Revisions:
 *     $Log: ControllerServlet.java,v $
 *     Revision 1.195  2009/05/27 02:01:02  troy.sadkowsky
 *     bug fix 814 3cat frequency hours
 *
 *     Revision 1.194  2009/05/06 08:25:37  troy.sadkowsky
 *     progress bar updates
 *
 *     Revision 1.193  2009/04/08 05:21:40  ray.welburn
 *     Isolate other controls when running interview
 *
 *     Revision 1.192  2009/04/05 12:00:48  ray.welburn
 *     Replace ' with ` in study names
 *
 *     Revision 1.191  2009/02/26 23:55:26  troy.sadkowsky
 *     new image for report button
 *
 *     Revision 1.190  2009/02/24 00:27:11  ray.welburn
 *     Corrections to nvaigation between modules
 *
 *     Revision 1.189  2009/02/19 03:38:23  troy.sadkowsky
 *     archive report functions
 *
 *     Revision 1.188  2009/02/04 22:47:49  troy.sadkowsky
 *     New report functions
 *
 *     Revision 1.187  2009/02/01 12:31:22  ray.welburn
 *     phone and email now saved in residential address table
 *
 *     Revision 1.186  2009/01/21 08:47:01  troy.sadkowsky
 *     show and hide action bar
 *
 *     Revision 1.185  2009/01/07 05:51:23  troy.sadkowsky
 *     more v2 updates
 *
 *     Revision 1.184  2009/01/06 07:41:14  troy.sadkowsky
 *     v2 updates
 *
 *     Revision 1.183  2009/01/06 01:17:45  troy.sadkowsky
 *     report to excel functions
 *
 *     Revision 1.182  2009/01/05 06:54:54  troy.sadkowsky
 *     progress bar updates
 *
 *     Revision 1.181  2008/12/29 02:45:05  troy.sadkowsky
 *     increased speed of participant lists
 *
 *     Revision 1.180  2008/12/23 10:32:41  troy.sadkowsky
 *     speed enhancements, linked jsms, progress bar
 *
 *     Revision 1.179  2008/12/22 08:18:43  troy.sadkowsky
 *     fix for halt and starting interview again
 *
 *     Revision 1.178  2008/12/22 04:06:06  troy.sadkowsky
 *     various updates
 *
 *     Revision 1.177  2008/12/20 02:07:03  troy.sadkowsky
 *     v2 updates
 *
 *     Revision 1.176  2008/12/18 03:15:29  ray.welburn
 *     Added AJAX scripts for updating progress of java processes
 *
 *     Revision 1.175  2008/12/17 03:50:49  ray.welburn
 *     New title bars and coles buttons added
 *
 *     Revision 1.174  2008/12/13 04:43:52  ray.welburn
 *     add alert when study name is duplicate
 *
 *     Revision 1.173  2008/12/10 03:47:02  ray.welburn
 *     Update halt on interview
 *
 *     Revision 1.172  2008/12/08 01:56:27  ray.welburn
 *     Implement save participant on add job
 *
 *     Revision 1.171  2008/12/04 11:13:37  Randal.Anderson
 *     Removed error messages from the top of the page when required fields have not been entered
 *
 *     Revision 1.170  2008/12/02 05:52:44  troy.sadkowsky
 *     use page size for random study
 *
 *     Revision 1.169  2008/11/21 06:11:04  ray.welburn
 *     updates to interview
 *
 *     Revision 1.168  2008/11/06 02:22:05  ray.welburn
 *     Add comment when no users found
 *
 *     Revision 1.167  2008/11/06 01:27:16  ray.welburn
 *     Message alert for adding participants updated
 *
 *     Revision 1.166  2008/11/05 06:15:31  ray.welburn
 *     Study acronym now study name
 *
 *     Revision 1.165  2008/11/05 05:31:36  ray.welburn
 *     Add Job moved to action button and errors to text boxes
 *
 *     Revision 1.164  2008/10/27 22:57:27  troy.sadkowsky
 *     assessment updates
 *
 *     Revision 1.163  2008/09/24 12:17:45  troy.sadkowsky
 *     demo ready
 *
 *     Revision 1.162  2008/09/15 03:08:28  troy.sadkowsky
 *     new auto gen button
 *
 *     Revision 1.161  2008/09/12 02:41:34  troy.sadkowsky
 *     encrypt user id
 *
 *     Revision 1.160  2008/09/11 04:12:23  ray.welburn
 *     study headline
 *
 *     Revision 1.159  2008/09/10 09:12:36  troy.sadkowsky
 *     interview review updates
 *
 *     Revision 1.158  2008/09/03 07:37:24  troy.sadkowsky
 *     tidy code and ensure connections close
 *
 *     Revision 1.157  2008/09/03 05:12:33  ray.welburn
 *     Update to include PT values
 *
 *     Revision 1.156  2008/08/25 01:36:15  ray.welburn
 *     Updates to use single dbobject and participant status table
 *
 *     Revision 1.155  2008/08/20 03:34:58  troy.sadkowsky
 *     bug fix allow enter key and clear button on user search study options
 *
 *     Revision 1.154  2008/08/13 04:41:33  troy.sadkowsky
 *     removed rett self admin functions
 *
 *     Revision 1.153  2008/08/11 01:56:57  ray.welburn
 *     move study object to common package
 *
 *     Revision 1.152  2008/08/05 00:28:25  ray.welburn
 *     Use session for progress bar
 *
 *     Revision 1.151  2008/08/02 06:23:17  troy.sadkowsky
 *     new frozen jsm in db and view
 *
 *     Revision 1.150  2008/07/28 04:09:08  ray.welburn
 *     Showing Study Module options now conditional on source
 *
 *     Revision 1.149  2008/07/23 00:17:48  troy.sadkowsky
 *     fix bug on close new participant
 *
 *     Revision 1.148  2008/07/22 22:56:41  ray.welburn
 *     login changed to allow for participant and biospecimens login
 *
 *     Revision 1.147  2008/07/05 03:35:05  troy.sadkowsky
 *     set jh status on complete interview
 *
 *     Revision 1.146  2008/06/29 23:28:20  troy.sadkowsky
 *     enhanced study update insert code
 *
 *     Revision 1.145  2008/06/27 04:02:44  ray.welburn
 *     allow enter key on some pages
 *
 *     Revision 1.144  2008/06/04 00:55:04  ray.welburn
 *     Search now stays on options page
 *
 *     Revision 1.143  2008/06/02 04:35:11  ray.welburn
 *     Additional validation on participant and job history for numbers
 *
 *     Revision 1.142  2008/06/01 09:37:18  ray.welburn
 *     Search for users and filter for lhs user menu
 *
 *     Revision 1.141  2008/05/30 01:52:31  troy.sadkowsky
 *     removed old code
 *
 *     Revision 1.140  2008/05/29 04:12:15  ray.welburn
 *     participant last updated applied to all participant changes
 *
 *     Revision 1.139  2008/05/26 08:25:13  troy.sadkowsky
 *     reworked main functions
 *
 *     Revision 1.138  2008/05/18 12:11:21  troy.sadkowsky
 *     added preview function for study jsms
 *
 *     Revision 1.137  2008/05/11 23:08:40  troy.sadkowsky
 *     Updated alert message on new participant
 *
 *     Revision 1.136  2008/04/27 01:04:34  ray.welburn
 *     alert message for Study priority updatred
 *
 *     Revision 1.135  2008/04/22 10:25:05  ray.welburn
 *     Start and end notes moved to studynotes as well
 *
 *     Revision 1.134  2008/04/15 23:02:32  troy.sadkowsky
 *     melb updates
 *
 *     Revision 1.133  2008/04/08 22:26:00  ray.welburn
 *     Alert when study not started adding participants
 *
 *     Revision 1.132  2008/03/28 00:43:22  troy.sadkowsky
 *     fix for showing with parent
 *
 *     Revision 1.131  2008/03/21 03:56:05  ray.welburn
 *     complete edit page for published study projects
 *
 *     Revision 1.130  2008/03/18 02:50:22  troy.sadkowsky
 *     put progress bar back
 *
 *     Revision 1.129  2008/03/18 01:29:51  ray.welburn
 *     Study projects option added
 *
 *     Revision 1.128  2008/03/13 01:47:42  ray.welburn
 *     Pages now use database images
 *
 *     Revision 1.126  2008/03/12 07:48:01  troy.sadkowsky
 *     ability to remove frozen JSMs
 *
 *     Revision 1.125  2008/03/11 06:45:31  troy.sadkowsky
 *     modification to action logger to include session values as well as names
 *
 *     Revision 1.124  2008/03/06 03:07:10  ray.welburn
 *     Additions to Action logger to log user actions
 *
 *     Revision 1.123  2008/03/02 23:37:19  ray.welburn
 *     Logout goes back to home page
 *
 *     Revision 1.122  2008/02/25 04:26:18  troy.sadkowsky
 *     rett survey link updates
 *
 *     Revision 1.121  2008/02/15 06:36:08  ray.welburn
 *     Change so that only sysadmin can delete studies directly
 *
 *     Revision 1.120  2008/02/15 04:21:58  ray.welburn
 *     Change so that only troy can delete studies directly
 *
 *     Revision 1.119  2008/02/14 06:55:32  ray.welburn
 *     Logout now goes to home page
 *
 *     Revision 1.118  2008/02/08 07:40:22  troy.sadkowsky
 *     build v1.71 updates
 *
 *     Revision 1.117  2008/02/03 23:29:21  troy.sadkowsky
 *     only show started interviews
 *
 *     Revision 1.116  2008/01/24 22:09:42  troy.sadkowsky
 *     removed if skipped not finished
 *
 *     Revision 1.115  2008/01/24 11:19:15  troy.sadkowsky
 *     rett participant interview status
 *
 *     Revision 1.114  2008/01/24 04:02:21  troy.sadkowsky
 *     review interveiw
 *
 *     Revision 1.113  2008/01/11 03:58:41  troy.sadkowsky
 *     show with parent
 *
 *     Revision 1.112  2007/12/09 23:42:07  troy.sadkowsky
 *     survey for JSM section
 *
 *     Revision 1.111  2007/12/08 01:58:05  ray.welburn
 *     Status Filter now works with timebased and text searches
 *
 *     Revision 1.110  2007/12/06 05:05:54  ray.welburn
 *     Add icon to times based search
 *
 *     Revision 1.109  2007/12/06 02:28:14  ray.welburn
 *     Added ability of users to change page size
 *
 *     Revision 1.108  2007/12/05 21:58:52  ray.welburn
 *     Added time based search
 *
 *     Revision 1.107  2007/12/04 06:28:32  troy.sadkowsky
 *     corrrect log out page on self admin
 *
 *     Revision 1.106  2007/12/04 01:45:26  troy.sadkowsky
 *     changed logout redirect
 *
 *     Revision 1.105  2007/11/24 03:56:14  troy.sadkowsky
 *     filter by participant status
 *
 *     Revision 1.104  2007/11/23 06:27:41  troy.sadkowsky
 *     default parent q with freq to on
 *
 *     Revision 1.103  2007/11/18 02:26:16  troy.sadkowsky
 *     bug fix for interviews
 *
 *     Revision 1.102  2007/11/16 04:21:07  troy.sadkowsky
 *     bug fix for self administered questionnaire
 *
 *     
 */
package com.researchit.servlets;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.researchit.Agent;
import com.researchit.FrozenJobSpecificModule;
import com.researchit.FrozenQA;
import com.researchit.Interview;
import com.researchit.JobHistory;
import com.researchit.JobHistoryStatus;
import com.researchit.JobSpecificModule;
import com.researchit.ParticipantStatus;
import com.researchit.PossibleAnswer;
import com.researchit.Question;
import com.researchit.StudyNote;
import com.researchit.StudyStatus;
import com.researchit.User;
import com.researchit.UserActionLogger;
import com.researchit.common.Address;
import com.researchit.common.Participant;
import com.researchit.common.Study;
import com.researchit.html.AssessmentSystem;
import com.researchit.html.InterviewManagementSystem;
import com.researchit.html.OccCalendar;
import com.researchit.io.DataGenerator;
import com.researchit.io.Exporter;
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
				}
				if (request.getParameter("Action") != null) {
					UserActionLogger ual = new UserActionLogger(Integer.parseInt(user.getId()), this.getAction(request));
					if (!ual.getAction().equals("-")) {
						ual.saveActionLog();
					}
					this.separateIdFromNames(request);
					if(this.isLogout(request, response)){
						this.logOut(request, response);
					}else if(!(this.checkPerformParameterActions(request, response))){
						if(!(this.checkPerformActionButtonActions(request, response))){
							//no action found, report error to db and just refresh
							ArrayList<String> errorList = new ArrayList<String>();
							errorList.add("No Action Found: Studies ControllerServlet");
							ual = new UserActionLogger(Integer.parseInt(user.getId()), errorList);
							if (!ual.getAction().equals("-")) {
								ual.saveActionLog();
							}
							response.sendRedirect("../StudyMgr/ValidateServlet");
							//response.sendRedirect("main.jsp");
						}
					}
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
	private boolean checkPerformActionButtonActions(HttpServletRequest request, HttpServletResponse response) throws Exception {
		boolean retValue = true;
		String strAction = request.getParameter("Action").toString();	
		if (strAction.equalsIgnoreCase("ActionButton")) {
			if (request.getParameter("deleteFile.x") != null) {
				this.deleteFile(request, response);
			}else if (request.getParameter("saveParticipant.x") != null) {
				this.saveParticipant(request);						
				RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
				dis.forward(request, response);
			}else if (request.getParameter("closeEditI.x") != null) {
				this.closeEditMode(request, response);
			}else if (request.getAttribute("editInterviewQuestion.x") != null) {
				this.editInterviewQuestion(request, response);
			}else if (request.getParameter("printInterviews.x") != null) {
				this.printInterviews(request, response);
			}else if (request.getAttribute("editJHFrequencyValues.x") != null) {
				this.editJHFrequencyValues(request, response);
			}else if (request.getParameter("mapJSMs.x") != null) {
				this.mapJob(request, response);
			}else if (request.getParameter("randomStudy.x") != null) {
				this.randomStudy(request, response);
			}else if (request.getParameter("studyDelete.x") != null) {
				this.deleteStudies(request, response);
			}else if (request.getParameter("minimise.x") != null) {
				this.minimiseActionButtons(request, response);
			}else if (request.getParameter("maximise.x") != null) {
				this.maximiseActionButtons(request, response);
			}else if (request.getParameter("attachFile.x") != null) {
				this.attachFile(request, response);	
			}else if (request.getParameter("editStudyNotes.x") != null) {
				this.editStudyNotes(request, response);		                        
			}else if (request.getParameter("newStudy.x") != null) {
				this.editOrNewStudy(request, response);
			}else if (request.getParameter("startWizard.x") != null) {
				this.startStudyWizard(request, response);
			}else if (request.getParameter("exportJhAddress.x") != null) {
				this.exportJhAddress(request, response);
			}else if (request.getParameter("exportAllJhAddress.x") != null) {
				this.exportAllJhAddress(request, response);
			}else if (request.getParameter("copyStudy.x") != null) {
				//                this.copyStudy(request, response);
			}else if (request.getParameter("saveStudy.x") != null) {
				this.saveStudy(request, response);
			}else if (request.getParameter("saveStudyOptions.x") != null) {
				this.saveStudyOptions(request, response);
			}else if (request.getParameter("removeJSMs.x") != null) {
				this.removeStudyJSMs(request, response);
			}else if (request.getParameter("previewJSMs.x") != null) {
				this.previewStudyJSMs(request, response);
			}else if (request.getParameter("saveStudyAgents.x") != null) {
				this.saveStudyAgents(request, response);
			}else if (request.getParameter("toExcelInterviews.x") != null) {
				this.showReportExcel(request, response);
			}else if (request.getParameter("toExcel.x") != null) {
				this.showReportList(request, response);
			}else if (request.getParameter("createReportJobHistory.x") != null) {
				this.createReportJobHistory(request, response);
			}else if (request.getParameter("Report") != null) {
				this.showReportExcel(request, response);
			} else if (request.getParameter("freezeJSMs.x") != null) {
				this.freezeJSMToStudy(request, response);
			}else if (request.getParameter("frozenJSMDelete.x") != null) {
				this.frozenJSMDelete(request, response);
			}else if (request.getParameter("studyOptions.x") != null) {
				this.studyOptionsMode(request, response);
			}else if (request.getParameter("studyAgents.x") != null) {
				this.studyAgentsMode(request, response);
			}else if (request.getParameter("studyJsms.x") != null) {
				this.studyJsmsMode(request, response);
			}else if (request.getParameter("importJHs.x") != null) {
				this.importJHs(request, response);
			}else if (request.getParameter("newJob.x") != null) {
				if(this.saveParticipant(request)){
					this.addJob(request, response);
				}
			}else if (request.getParameter("newAddress.x") != null) {
				if(this.saveParticipant(request)){
					this.addAddress(request, response);
				}
			}else if (request.getParameter("saveJob.x") != null) {
				this.saveJob(request, response);
			}else if (request.getParameter("saveAddress.x") != null) {
				this.saveAddress(request, response);
			}else if (request.getParameter("editHistory.x") != null) {
				this.editHistory(request, response);
			}else if (request.getParameter("deleteHistory.x") != null) {
				this.deleteHistory(request, response);
			}else if (request.getParameter("editParticipant.x") != null) {
				this.editParticipant(request, response);
			}else if (request.getParameter("newParticipant.x") != null) {
				//if(this.saveParticipant(request)){
				this.newParticipant(request, response);
				//}else{
				//	RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
				//    dis.forward(request, response);
				//}             	
			}else if (request.getParameter("JobHistoryDelete.x") != null) {
				this.removeJobHistory(request, response);
			}else if (request.getParameter("participantDelete.x") != null) {
				this.deleteParticipant(request, response);
			}else if (request.getParameter("OpenMapJob.x") != null) {
				this.addSaveJobHistory(request);
				this.openMapJob(request, response);
			}else if (request.getParameter("SaveJobHistory.x") != null) {
				this.addSaveJobHistory(request, response);
			}else if (request.getParameter("SaveParticipantStatus.x") != null) {
				this.setFullInterviewStatus(request, response);		                    
			}else if (request.getParameter("printView.x") != null) {
				this.printView(request, response);
			}else if (request.getParameter("printToWord.x") != null) {
				this.printToWord(request, response);
			} else if (request.getParameter("expParticipantsForInterviewers.x") != null) {
				this.showInterviewersReportExcel(request, response);
			} else if (request.getParameter("expParticipantsForAmr.x") != null) {
				this.showAmrReportExcel(request, response);
			} else if (request.getParameter("expParticipantsForAmrQAss.x") != null) {
				this.showAmrReportQAssExcel(request, response);
			} else if (request.getParameter("toggleTranscript.x") != null) {
				this.toggleTranscript(request, response);   
			} else if (request.getParameter("expParticipants.x") != null) {
				this.exportParticipants(request, response);
			}else if (request.getAttribute("MinMax.y") != null) {
				this.minimiseMaximise(request, response);
			}else if (request.getParameter("closeEdit.x") != null) {
				this.closeEditMode(request, response);
			}else if (request.getParameter("time.x") != null) { //toggle for time based search
				this.setTimeBasedSearch(request, response);
			} else if (request.getParameter("Clear.x") != null) { // these action need to be left last
				this.clearSearchString(request, response);
			} else if (request.getParameter("SelectPeriod") != null) {
				this.searchPeriod(request, response);
			} else if (request.getParameter("userSearchString") != null && !request.getParameter("userSearchString").equals("")) {
				this.forwardSearchString(request, response);
			}else if (request.getParameter("searchTxt") != null) {
				if ((!request.getParameter("searchTxt").equalsIgnoreCase(""))&&(!request.getParameter("searchTxt").equalsIgnoreCase("Participant Search"))){
					this.searchTxt(request, response);
				}else if (request.getParameter("participantStatus") != null) {
					this.filterByStatus(request, response);
				}
			} else{
				retValue = false;
			}
		} else{
			retValue = false;
		}
		return retValue;
	}
	private void toggleTranscript(HttpServletRequest request, HttpServletResponse response) throws NumberFormatException, Exception {
		Map<String, String[]> parameterMap = request.getParameterMap();
		Iterator<Entry<String, String[]>> iterator = parameterMap.entrySet().iterator();
		while(iterator.hasNext()) {
			String key = (String) iterator.next().getKey();
			if (key.contains("participantCheckBox")) {
				Participant participant = new Participant(Long.valueOf(key.substring(key.indexOf("_") + 1)));
				participant.getPersistantObject();
				participant.setTranscriptSent(participant.isTranscriptSent() == true?false:true);//toggle the value
				participant.save();
			}
		}
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}

	private void mapJob(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getSession().setAttribute("allocateJSMs",true);
		request.getSession().removeAttribute("EditMode");
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}

	private void createReportJobHistory(HttpServletRequest request, HttpServletResponse response) throws Exception {
		InterviewManagementSystem ims = new InterviewManagementSystem();
		String studyId = request.getSession().getAttribute("StudyID").toString();
		Study study = new Study(studyId);
		Report report = new Report();
		report.setStudyId(studyId);
		report.setFileDataString(ims.showParticipantReportHTML(study));
		report.setReportType(Report.JOBHISTORYREPORT);		
		report.insert();
		request.setAttribute("reports",true);
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
	private void randomStudy(HttpServletRequest request, HttpServletResponse response) throws Exception {
		Study study = new Study(request.getSession().getAttribute("StudyID").toString());
		DataGenerator dg = new DataGenerator();
		int iPageSize = 10;
		try{
			iPageSize = Integer.parseInt(request.getSession().getAttribute("PageSize").toString());
		}catch (Exception e){
			//			To Do deal with e.getMessage());
		}
		dg.generateInterviews(study,iPageSize);
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}
	private boolean checkPerformParameterActions(HttpServletRequest request, HttpServletResponse response) throws Exception {
		boolean retValue = true;
		String strAction = request.getParameter("Action").toString();
		if (strAction.equalsIgnoreCase("beginInterview")) {
			this.beginInterview(request, response);
		} else if (strAction.equalsIgnoreCase("Save Survey")) {
			this.saveSurveyAnswers(request, response);
		} else if (strAction.equalsIgnoreCase("SaveParticipant")) {
			this.saveParticipant(request);						
			RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
			dis.forward(request, response);
		} else if (strAction.equalsIgnoreCase("Save")) {  //self admin save
			this.saveParticipant(request);						
			RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
			dis.forward(request, response);
		} else if (strAction.equalsIgnoreCase("Add Job")) {
			if(this.saveParticipant(request)){
				this.addJob(request, response);   
			}                          
			RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
			dis.forward(request, response);
		} else if (strAction.equalsIgnoreCase("Mark Complete")) {
			if(this.saveParticipant(request)){
				this.markJobHistoryComplete(request);   
			}  
			//forward them to survey
			//String pID = request.getSession().getAttribute("ParticipantID").toString();
			RequestDispatcher dis = request.getRequestDispatcher("selfadminpagesurvey.jsp?PID="+request.getSession().getAttribute("ParticipantID").toString());
			dis.forward(request, response);
			/*} else if (strAction.equalsIgnoreCase("Add Task")) {
			this.addTask(request, response);*/
		} else if (strAction.equalsIgnoreCase("StartInterview")) {
			this.startInterview(request, response);
		} else if (strAction.equalsIgnoreCase("interviewSaveAnswer")) {										
			this.saveInterviewAnswerAndFindNextQuestion(request, response);					
		} else if (strAction.equalsIgnoreCase("setStatusInterview")) {
			this.setInterviewStatus(request, response);
		} else if (strAction.equalsIgnoreCase("removeJobHistory")) {
			this.removeJobHistory(request, response);
		} else if (strAction.equalsIgnoreCase("Next")) {
			this.findNextParticipant(request, response);
			/*} else if (strAction.equalsIgnoreCase("Search For Job")) {
            this.searchForJob(request, response);*/
		} else{
			retValue = false;
		}
		return retValue;
	}
	private boolean isLogout(HttpServletRequest request, HttpServletResponse response) throws Exception {
		boolean retValue = false;
		String strAction = request.getParameter("Action").toString();
		if (request.getParameter("logout.x") != null) {
			retValue = true;
		} else if (request.getParameter("Logout") != null) {
			retValue = true;
		} else if (strAction.equalsIgnoreCase("Logout")) {
			retValue = true;
		}  
		return retValue;
	}
	@SuppressWarnings("rawtypes")
	private void removeStudyJSMs(HttpServletRequest request, HttpServletResponse response) throws Exception {
		Enumeration postedvalues = request.getParameterNames();
		String jsmIDsExcluded = "";
		while (postedvalues.hasMoreElements()) {
			String strPost = postedvalues.nextElement().toString();
			if (strPost.contains("jsmsCheckBox")) {
				String jsmID = strPost.substring(strPost.indexOf("_") + 1);
				jsmIDsExcluded += jsmID+",";
			}
		}  	
		request.setAttribute("previewMode", true);
		request.setAttribute("agentsMode",true);
		request.getSession().setAttribute("JsmsExcluded",jsmIDsExcluded);
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}
	private void showReportList(HttpServletRequest request, HttpServletResponse response) throws Exception {		
		request.setAttribute("reports",true);
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);

	}
	private void showInterviewersReportExcel(HttpServletRequest request, HttpServletResponse response) throws Exception {
		if (request.getParameter("StudyId") != "" && request.getParameter("StatusFilter") != "") {
			Study study = new Study(request.getParameter("StudyId"));
			List<Participant> participants = study.filterParticipants(request.getParameter("StatusFilter"));

			String filedata = "";									
			InterviewManagementSystem ims = new InterviewManagementSystem();							
			filedata = ims.showInterviewersReport(participants);

			response.setContentType("text/html");
			response.setHeader("Content-disposition","attachment;filename=\"interviewersReport.htm\"");
			response.getOutputStream().print(filedata);	
		}
	}
	private void showAmrReportExcel(HttpServletRequest request, HttpServletResponse response) throws Exception {
		if (request.getParameter("StudyId") != "" && request.getParameter("StatusFilter") != "") {
			Study study = new Study(request.getParameter("StudyId"));
			List<Participant> participants = study.filterParticipants(request.getParameter("StatusFilter"));

			String filedata = "";									
			InterviewManagementSystem ims = new InterviewManagementSystem();							
			filedata = ims.showAmrReportAsCsv(participants);

			response.setContentType("text/html");
			response.setHeader("Content-disposition","attachment;filename=\"AmrReport.csv\"");
			response.getOutputStream().print(filedata);	
		}
	}
	private void showAmrReportQAssExcel(HttpServletRequest request, HttpServletResponse response) throws Exception {
		if (request.getParameter("StudyId") != "" && request.getParameter("StatusFilter") != "") {
			Study study = new Study(request.getParameter("StudyId"));
			List<Participant> participants = study.filterParticipants(request.getParameter("StatusFilter"));

			String filedata = "";									
			InterviewManagementSystem ims = new InterviewManagementSystem();							
			filedata = ims.showAmrReportQAssAsCsv(participants);

			response.setContentType("text/html");
			response.setHeader("Content-disposition","attachment;filename=\"AmrReportQAss.csv\"");
			response.getOutputStream().print(filedata);	
		}
	}
	private void showReportExcel(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String studyID = request.getSession().getAttribute("StudyID").toString();
		if(request.getSession().getAttribute("JSMID")!=null){
			String jsmID = request.getSession().getAttribute("JSMID").toString();               		
			FrozenJobSpecificModule fjsm = new FrozenJobSpecificModule(jsmID); 
			String filedata = "";
			if(request.getParameter("Report")!=null){
				String reportId = request.getParameter("ReportId");
				Report report = new Report(reportId);
				filedata = report.getFileDataString();
			}else{							
				AssessmentSystem as = new AssessmentSystem();							
				filedata = as.showInterviewReportHTML(fjsm,studyID);
				if(request.getParameter("ArchiveData")!=null){
					Report report = new Report();
					report.setStudyId(studyID);
					report.setFileDataString(filedata);
					report.setReportType(Report.INTERVIEWSREPORT);	
					report.setFrozenJSMId(jsmID);
					report.insert();
				}	
			}	
			response.setContentType("text/html");
			response.setHeader("Content-disposition","attachment;filename=\""+fjsm.getName()+".htm\"");
			response.getOutputStream().print(filedata);			
		}else{
			Study study = new Study(studyID);
			response.setContentType("text/html");
			response.setHeader("Content-disposition","attachment;filename=\""+study.getName()+".htm\"");	
			String reportId = request.getParameter("ReportId");
			Report report = new Report(reportId);
			response.getOutputStream().print(report.getFileDataString());	
		}			
	}
	private void forwardSearchString(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String strSearch = request.getParameter("userSearchString").trim();
		if (!(strSearch.equalsIgnoreCase(""))) {
			request.getSession().setAttribute("Search", strSearch);
		}
		User user = new User();
		ArrayList<User> allUsers = user.getAllUsers();
		ArrayList<User> searchedUsers = new ArrayList<User>();

		for (User u : allUsers) {
			if (u.getUserName().toLowerCase().contains(strSearch.toLowerCase())) {
				searchedUsers.add(u);
			}
		}
		request.setAttribute("optionsMode", true);
		//request.getSession().removeAttribute("Search");
		request.getSession().setAttribute("searchedusers", searchedUsers);
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}

	@SuppressWarnings("rawtypes")
	private void frozenJSMDelete(HttpServletRequest request, HttpServletResponse response) throws Exception {	
		Study study = new Study(request.getSession().getAttribute("StudyID").toString());
		Enumeration postedvalues = request.getParameterNames();
		String errorMessage = "";
		while (postedvalues.hasMoreElements()) {
			String strPost = postedvalues.nextElement().toString();
			if (strPost.contains("jsmsCheckBox")) {
				String jsmID = strPost.substring(strPost.indexOf("_") + 1);
				FrozenJobSpecificModule fjsm = new FrozenJobSpecificModule(jsmID);
				if (!(fjsm.getName().equalsIgnoreCase(""))) {
					int iInterviewCount = fjsm.getInterviews(study.getId()).size();
					if(iInterviewCount>0){
						errorMessage += ":"+fjsm.getName()+" has "+iInterviewCount+" interviews";
					}else{
						fjsm.delete();
					}

				} else {
					JobSpecificModule jsm = new JobSpecificModule(jsmID);
					errorMessage += ":"+jsm.getName();
				}
			}
		}
		if(!(errorMessage.equalsIgnoreCase(""))){
			request.setAttribute("script", "alert('Can not delete Study Specific JSMs " + errorMessage + "')");
		}
		request.setAttribute("JsmsMode",true);
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}
	@SuppressWarnings("rawtypes")
	private void saveStudyAgents(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String studyID = request.getSession().getAttribute("StudyID").toString();
		Study study = new Study(studyID);		
		study.removeAllAgents();
		Enumeration postedvalues = request.getParameterNames();
		while (postedvalues.hasMoreElements()) {
			String strPost = postedvalues.nextElement().toString();
			if (strPost.contains("agentsCheckBox")) {
				String strAgentID = strPost.substring(strPost.indexOf("_") + 1);
				Agent agent = new Agent(strAgentID);
				study.addAgent(agent);
			}
		}
		if(!(study.getName().equalsIgnoreCase("InterRett work practices pilot study"))){
			User user = (User) request.getSession().getAttribute("UserObject");
			study.removeAllJSMs();
			//study.removeAllRules();
			//			ProgressNotifier pNotifier = new ProgressNotifier();
			//			pNotifier.save();

			StudyProgress prog = new StudyProgress(request.getSession());		
			if(request.getSession().getAttribute("JsmsExcluded")!= null){
				ArrayList<JobSpecificModule> jsms = new ArrayList<JobSpecificModule>();
				String jsmIDsExcluded = request.getSession().getAttribute("JsmsExcluded").toString();
				for(String id:jsmIDsExcluded.split(",")){
					JobSpecificModule jsm = new JobSpecificModule();
					jsm.setId(id);
					jsms.add(jsm);
				}
				prog.setExclusionJSMs(jsms);
			}
			request.getSession().setAttribute("InProgress","true");
			request.getSession().setAttribute("totalcount","0");
			request.getSession().setAttribute("count", "0");
			prog.setStudy(study);
			prog.setUser(user);
			//			prog.setPNotifier(pNotifier);
			prog.setFunction(StudyProgress.SAVESTUDY);
			Thread t = new Thread(prog);
			t.start();    							
			//request.getSession().setAttribute("InProgress",pNotifier.getId());
		}
		//request.getSession().setAttribute("MinActionButtons",true);
		request.setAttribute("JsmsMode",true);
		request.setAttribute("script","startPoll();");
		request.getSession().removeAttribute("JsmsExcluded");
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}
	@SuppressWarnings("rawtypes")
	private ArrayList<String> getAction(HttpServletRequest request) {		
		ArrayList<String> actionList = new ArrayList<String>();
		actionList.add("Study Management System");
		actionList.add("Param");
		Enumeration actions = request.getParameterNames();
		while (actions.hasMoreElements()) {
			String strPost = actions.nextElement().toString();
			if(strPost.toLowerCase().contains("checkbox")){
				continue;
			}
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
			if(strPost.equalsIgnoreCase("JobHistoryID")){
				strPost += request.getSession().getAttribute(strPost).toString();
			}
			if(strPost.equalsIgnoreCase("ParticipantID")){
				strPost += request.getSession().getAttribute(strPost).toString();
			}
			actionList.add(strPost);
		}
		return actionList;
	}
	private void editJHFrequencyValues(HttpServletRequest request, HttpServletResponse response) throws Exception {
		if (request.getAttribute("questionId") != null) {
			String strInterviewId = request.getSession().getAttribute("InterviewID").toString();
			Interview interview = new Interview(strInterviewId);
			JobHistory jh = new JobHistory(interview.getJobHistoryId());
			String qId = request.getAttribute("questionId").toString();
			Question question = new Question("",qId);
			question.setInterviewID(strInterviewId);
			String actualAnswer = question.getAnswers().get(0).getActualAnswer();
			if(question.getName().contains("weeks")){			
				jh.setWeeksPerYear(Float.parseFloat(actualAnswer));		
			}else if(question.getName().contains("hours")){
				jh.setHoursPerWeek(Float.parseFloat(actualAnswer));
			}
			jh.update();
			//request.getSession().removeAttribute("JSMID");
		}
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}
	private void editInterviewQuestion(HttpServletRequest request, HttpServletResponse response) throws Exception {
		if (request.getAttribute("questionId") != null) {
			String strInterviewId = request.getSession().getAttribute("InterviewID").toString();
			String qId = request.getAttribute("questionId").toString();
			FrozenQA fqa = new FrozenQA(qId);
			Question nextQuestion = new Question("",fqa.getJsmQuestionStructureId());
			nextQuestion.setInterviewID(strInterviewId);
			request.getSession().setAttribute("NextQuestion", nextQuestion);
			request.getSession().setAttribute("ReviewUpdate", true);
			request.getSession().setAttribute("JSMIDtmp", request.getSession().getAttribute("JSMID"));
			request.getSession().removeAttribute("JSMID");
		}		
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}
	private void searchPeriod(HttpServletRequest request, HttpServletResponse response) throws Exception{
		request.getSession().setAttribute("SearchPeriod", request.getParameter("SelectPeriod"));
		request.getSession().setAttribute("participantPage",1);
		if (request.getParameter("participantStatus") != null) {
			this.filterByStatus(request, response);
		}else {
			RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
			dis.forward(request, response);
		}
	}
	private void filterByStatus(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String jhStatusId = request.getParameter("participantStatus").toString();
		request.getSession().setAttribute("StatusFilter",jhStatusId);
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}
	private void clearSearchString(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getSession().removeAttribute("searchTxt");
		request.getSession().removeAttribute("Search");
		request.getSession().removeAttribute("SearchPeriod");
		request.getSession().setAttribute("Timebased", "false");
		if(request.getParameter("optionsMode")!=null){
			request.getSession().removeAttribute("searchedusers");		
			request.setAttribute("optionsMode", true);
		}
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}
	private void findNextParticipant(HttpServletRequest request, HttpServletResponse response) throws Exception {
		if(request.getSession().getAttribute("ParticipantID")!=null){
			//String participantId = request.getSession().getAttribute("ParticipantID").toString();
			Participant currentP = new Participant(Long.valueOf(request.getSession().getAttribute("ParticipantID").toString()));
			String studyID = request.getSession().getAttribute("StudyID").toString();
			Study study = new Study(studyID);	

			String statusFilterId = "None";
			List<Participant> participants = new ArrayList<Participant>();

			//If there is search text get participant list conforming to search text
			if (request.getSession().getAttribute("StatusFilter") != null) {
				statusFilterId = request.getSession().getAttribute("StatusFilter").toString();
			}
			if (request.getSession().getAttribute("searchTxt") != null) {
				//Get the study participants matching the search criteria
				participants = this.getSearchedParticipantList(request);
				//If the statusFilterId is not "None" then apply the status filter to the searched participants

				if (!statusFilterId.equals("None")){
					participants = study.filterParticipants(request.getSession().getAttribute("StatusFilter").toString());
				}
			}else if (request.getSession().getAttribute("SearchPeriod") != null){
				participants = this.getUpdatedParticipantsForPeriod(request);
				if (!statusFilterId.equals("None")){
					participants = study.filterParticipants(statusFilterId);
				}
			}else{
				if(!statusFilterId.equals("None")){
					participants = study.filterParticipants(statusFilterId);
				}else{
					//	            	Otherwise default to none
					participants = study.filterParticipants(ParticipantStatus.NONE);
				}
			}
			Long nextId = currentP.getParticipantId();
			boolean bBreak = false;
			for(Participant p:participants){			
				if(bBreak){
					nextId = p.getParticipantId();
					break;
				}
				if(currentP.getParticipantId().equals(p.getParticipantId())){					
					bBreak = true;
				}
			}		
			request.getSession().setAttribute("ParticipantID",String.valueOf(nextId));
		}
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}
	private List<Participant> getUpdatedParticipantsForPeriod(HttpServletRequest request) throws Exception{
		String period = request.getSession().getAttribute("SearchPeriod").toString();
		String studyID = request.getSession().getAttribute("StudyID").toString();
		String[] periodOptions = {"today", "week", "fortnight", "month"};
		String sql ="";
		OccCalendar fromDate = new OccCalendar();
		OccCalendar toDate = new OccCalendar();
		int caseNo = -1;
		for (int index = 0; index < periodOptions.length; index++) {
			if (periodOptions[index].equals(period)) {
				caseNo = index;
			}
		}
		switch (caseNo){
		case 0: //today
			break;
		case 1: //past week
			fromDate.set(OccCalendar.DAY_OF_MONTH, (fromDate.get(OccCalendar.DAY_OF_MONTH) - 7));
			break;
		case 2: //past fortnight
			fromDate.set(OccCalendar.DAY_OF_MONTH, (fromDate.get(OccCalendar.DAY_OF_MONTH) - 14));
			break;
		case 3: //past month
			fromDate.set(OccCalendar.DAY_OF_MONTH, (fromDate.get(OccCalendar.DAY_OF_MONTH) - 30));
			break;
		default:
		}
		sql = "SELECT id FROM participant WHERE studyid = '" + studyID + "' AND lastupdated BETWEEN '" + fromDate.getDatabaseFormatDate() + "' and '" + toDate.getDatabaseFormatDate() + "' ORDER BY lastupdated DESC";
		Participant participant = new Participant();

		return participant.getParticipants(sql);
	}	
	private List<Participant> getSearchedParticipantList(HttpServletRequest request) throws Exception {
		//Searches participant name or reference number for matching string - Case insensitive
		List<Participant> participants = new ArrayList<Participant>();
		if (request.getSession().getAttribute("StudyID") != null) {
			String studyID = request.getSession().getAttribute("StudyID").toString();
			Study study = new Study(studyID);
			String searchTxt = request.getSession().getAttribute("searchTxt").toString();
			participants = study.searchParticipants(searchTxt);
		}
		return participants;
	}
	private void searchTxt(HttpServletRequest request, HttpServletResponse response) throws Exception{		
		request.getSession().setAttribute("searchTxt",request.getParameter("searchTxt"));
		request.getSession().setAttribute("participantPage",1);
		if (request.getParameter("participantStatus") != null) {
			this.filterByStatus(request, response);
		} else {
			RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
			dis.forward(request, response);
		}
	} 	
	@SuppressWarnings("unchecked")
	private void minimiseMaximise(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if (request.getAttribute("questionId") != null) {
			String qId = request.getAttribute("questionId").toString();
			ArrayList<String> minimisedQuestions = new ArrayList<String>();
			if (request.getSession().getAttribute("minimisedQuestionIds") != null) {
				minimisedQuestions = (ArrayList<String>) request.getSession().getAttribute("minimisedQuestionIds");
			}
			if (minimisedQuestions.contains(qId)) {
				minimisedQuestions.remove(qId);
			} else {
				minimisedQuestions.add(qId);
			}
			request.getSession().setAttribute("minimisedQuestionIds",minimisedQuestions);
		}
		String jsmId = request.getSession().getAttribute("JSMID").toString();
		request.setAttribute("jsmID",jsmId);
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}
	private void markJobHistoryComplete(HttpServletRequest request) throws Exception {
		OccCalendar now = new OccCalendar();
		//String pID = request.getSession().getAttribute("ParticipantID").toString();
		Participant p = new Participant(Long.valueOf(request.getSession().getAttribute("ParticipantID").toString()));
		p.setStatusId(ParticipantStatus.TOBEREVIEWED);
		p.setLastUpdated(now.getDatabaseFormatDateTime());
		p.save();
	}
	@SuppressWarnings("rawtypes")
	private void saveStudyOptions(HttpServletRequest request, HttpServletResponse response) throws Exception {
		Study study = new Study(request.getSession().getAttribute("StudyID").toString());
		study.removeOptions();

		if(request.getParameter("autoselect")!=null){
			study.saveOption(Study.Option.AUTOGENERATEID);
		}
		if(request.getParameter("globalDontKnow")!=null){
			study.saveOption(Study.Option.GLOBALDONTKNOW);
		}
		if(request.getParameter("editPublishedPage")!=null){
			study.saveOption(Study.Option.EDITPUBLISHEDPAGE);
		}
		if(request.getParameter("cat3freq")!=null){
			study.saveOption(Study.Option.CAT3FREQ);
		}
		/*if(request.getParameter("useparticipant")!=null){
			study.saveOption(Study.Option.USEPARTICIPANT);
		}
		if(request.getParameter("usebiospecimens")!=null){
			study.saveOption(Study.Option.USEBIOSPECIMENS);
		}*/
		if(request.getParameter("startNote")!=null){
			study.setStartNote(request.getParameter("startNote").toString());
		}
		if(request.getParameter("endNote")!=null){
			study.setEndNote(request.getParameter("endNote").toString());
		}
		String status = request.getParameter("studyStatus");
		study.setStatusId(status);
		study.update();
		JobSpecificModule jsmtemp = new JobSpecificModule();

		study.removeAllUsers();		
		Enumeration postedvalues = request.getParameterNames();
		while (postedvalues.hasMoreElements()) {
			String strPost = postedvalues.nextElement().toString();
			if (strPost.contains("usersCheckBox")) {
				String id = strPost.substring(strPost.indexOf("_") + 1);
				User user = new User();
				user.setId(id);
				user.addStudy(study.getId());
				ArrayList<JobSpecificModule> jsms = jsmtemp.getStudySpecificJSMs(user.getId());
				for(JobSpecificModule jsm: study.getStudySpecificJsms()){
					if(!(jsms.contains(jsm))){
						jsm.shareWithUser(id);
					}					
				}
			}
		}
		request.getSession().removeAttribute("searchedusers");
		request.setAttribute("optionsMode",true);
		request.setAttribute("script","flashSaveSuccessful();");
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}
	private void studyOptionsMode(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("optionsMode", true);   	
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);	
	}
	private void studyAgentsMode(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("agentsMode", true);   	
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);	
	}
	private void studyJsmsMode(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("JsmsMode", true);   	
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);	
	}
	private void closeEditMode(HttpServletRequest request, HttpServletResponse response) throws Exception {		
		request.setAttribute("scrollPos",request.getSession().getAttribute("ScrollPos"));
		//request.getSession().removeAttribute("JSMID");
		if (request.getSession().getAttribute("JSMID") == null && request.getSession().getAttribute("JSMIDtmp") != null){
			request.getSession().setAttribute("JSMID", request.getSession().getAttribute("JSMIDtmp"));
			request.getSession().removeAttribute("JSMIDtmp");
		}else{
			request.getSession().removeAttribute("JSMID");
			request.getSession().removeAttribute("JobHistoryID");
		}
		if(request.getSession().getAttribute("ShowPrintInterviews") != null){ 
			request.getSession().removeAttribute("ShowPrintInterviews");
		}
		if (request.getSession().getAttribute("EditPublishedPage") != null) {
			request.getSession().removeAttribute("EditPublishedPage");
			request.setAttribute("optionsMode", true); 
		}
		if (request.getSession().getAttribute("allocateJSMs") != null) {
			request.getSession().removeAttribute("allocateJSMs");
		}
		if (request.getSession().getAttribute("StudyID") != null) {
			request.getSession().removeAttribute("EditMode");
		}
		if(request.getSession().getAttribute("ParticipantID")!=null){
			if(request.getSession().getAttribute("ParticipantID").toString().equalsIgnoreCase("New")){
				request.getSession().removeAttribute("ParticipantID");
				request.getSession().removeAttribute("EditMode");
			}
		}
		if(request.getParameter("closeEditI.x")!=null){
			if(request.getSession().getAttribute("InterviewID")!=null){
				request.getSession().removeAttribute("InterviewID");
			}else{
				if(request.getSession().getAttribute("addJob")!=null){ 
					request.getSession().removeAttribute("addJob");
					request.getSession().removeAttribute("JobHistory");
					request.getSession().setAttribute("EditMode", true);
				}else if(request.getSession().getAttribute("addAddress")!=null){ 
					request.getSession().removeAttribute("addAddress");
					request.getSession().removeAttribute("Address");
					request.getSession().setAttribute("EditMode", true);
				}else{
					request.getSession().removeAttribute("ParticipantID");
					request.getSession().removeAttribute("EditMode");
				}
			}

		}else{
			if(request.getSession().getAttribute("ParticipantID")!=null){
				if(request.getSession().getAttribute("ParticipantID").toString().equalsIgnoreCase("New")){
					request.getSession().removeAttribute("ParticipantID");
				}
				if(request.getSession().getAttribute("StudyID") != null) {
					request.getSession().removeAttribute("ParticipantID");
				}
			}

		}	
		if(request.getSession().getAttribute("InterviewStatus")!=null){
			if(request.getSession().getAttribute("InterviewID")!=null){
				String interviewId = request.getSession().getAttribute("InterviewID").toString();
				Interview interview = new Interview(interviewId);
				interview.updateStatus("halt");
				request.getSession().removeAttribute("InterviewID");
				request.getSession().removeAttribute("NextQuestion");
				request.getSession().removeAttribute("JobHistoryID");
			}
			request.getSession().removeAttribute("InterviewStatus");			
		}
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}	
	private void newParticipant(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, Exception {
		Study study = new Study(request.getSession().getAttribute("StudyID").toString());
		if (study.getOccStatusName().equals("In Progress")) {
			request.getSession().setAttribute("EditMode", true);	
			request.getSession().setAttribute("ParticipantID","New");
		}else{
			request.setAttribute("script", "alert('To add participants the study status must be changed to \"In Progress\". To change the study status go to Studies->Select Study and click the study options action button. Or see the study manager.')");
		}

		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}
	private void editParticipant(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getSession().setAttribute("EditMode", true);
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}
	@SuppressWarnings("rawtypes")
	private void openMapJob(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setAttribute("Mapping", true);
		Enumeration postedvalues = request.getParameterNames();
		String id = "";
		while (postedvalues.hasMoreElements()) {
			String strPost = postedvalues.nextElement().toString();
			if (strPost.contains("jobHistoriesCheckBox")) {
				id = strPost.substring(strPost.indexOf("_") + 1);				
				break;
			}           
		}
		request.getSession().setAttribute("JobHistoryID",id);
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}

	@SuppressWarnings("rawtypes")
	private void logOut(HttpServletRequest request, HttpServletResponse response) throws Exception {
		if(request.getParameter("selfAdmin")!=null){
			response.sendRedirect("participantLogin.jsp?Logout=true");
		}else{
			Enumeration sessionNames = request.getSession().getAttributeNames();
			while (sessionNames.hasMoreElements()) {
				request.getSession().removeAttribute(sessionNames.nextElement().toString());
			}
			response.sendRedirect("/Studies/");
		}   
	}

	private void beginInterview(HttpServletRequest request, HttpServletResponse response) throws Exception {
		if(request.getParameter("interviewId")!=null){
			String interviewId = request.getParameter("interviewId");
			Interview interview = new Interview(interviewId);
			FrozenJobSpecificModule fjsm = new FrozenJobSpecificModule(interview.getFrozenJsmId());
			//           Question nextQuestion = fjsm.getNextQuestion("");
			FrozenQA frozenQA = null;
			Question nextQuestion = fjsm.getNextInterviewQuestion(frozenQA,interview);
			request.getSession().setAttribute("NextQuestion",nextQuestion);
			request.getSession().setAttribute("InterviewStatus","InterviewRun");
		}
		//request.getSession().setAttribute("MinActionButtons",true);
		request.getSession().removeAttribute("ReviewUpdate");
		request.getSession().removeAttribute("JSMID");
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);       
	}
	@SuppressWarnings("rawtypes")
	private void removeJobHistory(HttpServletRequest request, HttpServletResponse response) throws Exception {
		if(request.getParameter("jobHistoryId")!=null){
			String strJobHistoryId = request.getParameter("jobHistoryId");
			JobHistory jh = new JobHistory(strJobHistoryId);
			jh.delete();		
		}else{
			Enumeration postedvalues = request.getParameterNames();
			while (postedvalues.hasMoreElements()) {
				String strPost = postedvalues.nextElement().toString();
				if (strPost.contains("jobHistoriesCheckBox")) {
					String strJobHistoryId = strPost.substring(strPost.indexOf("_") + 1);
					JobHistory jh = new JobHistory(strJobHistoryId);
					jh.delete();
				}           
			}	        
		}
		request.getSession().setAttribute("EditMode", true);
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);	
	}
	private void setFullInterviewStatus(HttpServletRequest request, HttpServletResponse response) throws Exception {
		this.setParticipantStatus(request);
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}
	private void setParticipantStatus(HttpServletRequest request) throws Exception {
		if(request.getSession().getAttribute("ParticipantID")!=null){
			OccCalendar now = new OccCalendar();
			//String strParticipantId = request.getSession().getAttribute("ParticipantID").toString();
			Participant p = new Participant(Long.valueOf(request.getSession().getAttribute("ParticipantID").toString()));
			if(request.getParameter("comments")!=null){
				p.setComments(request.getParameter("comments"));  

			}
			if(request.getParameter("year")!=null){
				String nextContactDateTime = 
						request.getParameter("year") + "-"
								+ request.getParameter("month") + "-" 
								+ request.getParameter("day") + " " 
								+ request.getParameter("hour") + ":" 
								+ request.getParameter("minute") + ":00.0";

				p.setNextContactDateTime(nextContactDateTime); 	

			}  
			if(request.getParameter("participantStatus")!=null){
				String statusId = request.getParameter("participantStatus");
				if(!(statusId.equalsIgnoreCase("None"))){
					p.setStatusId(statusId);
				}else{
					p.setStatusId(null);
				}
				p.setLastUpdated(now.getDatabaseFormatDateTime());
				p.save();
				request.setAttribute("script","flashSaveSuccessful();");
			}           
		}        
	}
	private void setInterviewStatus(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//String jhID = "";
		if(request.getParameter("interviewId")!=null){
			String interviewId = request.getParameter("interviewId");
			String status = request.getParameter("status");
			if(status.equalsIgnoreCase("resume")){
				Interview interview = new Interview(interviewId);
				interview.updateStatus("resume");
				//jhID = interview.getJobHistoryId();
				request.getSession().setAttribute("InterviewID",interviewId);
				request.getSession().setAttribute("Note","Start");
				request.getSession().removeAttribute("NextQuestion");
			}else if(status.equalsIgnoreCase("complete")){
				Interview interview = new Interview(interviewId);
				interview.updateStatus("complete");
				request.getSession().removeAttribute("InterviewID");
				request.getSession().removeAttribute("NextQuestion");
				request.getSession().removeAttribute("InterviewStatus");
				//jhID = interview.getJobHistoryId();
			}else if(status.equalsIgnoreCase("suspend")){
				Interview interview = new Interview(interviewId);
				interview.updateStatus("suspend");
				//jhID = interview.getJobHistoryId();
				request.getSession().removeAttribute("InterviewID");
				request.getSession().removeAttribute("NextQuestion");
			}else if(status.equalsIgnoreCase("halt")){
				Interview interview = new Interview(interviewId);
				interview.updateStatus("halt");
				//jhID = interview.getJobHistoryId();
				request.getSession().removeAttribute("InterviewID");
				request.getSession().removeAttribute("NextQuestion");
				request.getSession().removeAttribute("InterviewStatus");
				request.getSession().removeAttribute("JobHistoryID");

			}
			request.getSession().removeAttribute("JSMID");
			//           request.getSession().setAttribute("JobHistoryID",jhID);
			RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
			dis.forward(request, response);
		}	
	}

	private void startInterview(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//String pId = request.getSession().getAttribute("ParticipantID").toString();
		Interview interview = new Interview();
		if(request.getParameter("frozenJSMID")!=null){
			FrozenJobSpecificModule fjsm = new FrozenJobSpecificModule(request.getParameter("frozenJSMID"));
			String jhID = request.getParameter("jobhistoryID");
			interview.setJobHistoryId(jhID);
			interview.setFrozenJsmId(fjsm.getId());
			interview.setStatus(Interview.STARTED);
			interview.setParticipantId(request.getSession().getAttribute("ParticipantID").toString());
			interview.save();   
			JobHistory jh = new JobHistory(jhID);
			jh.setStatusId(JobHistoryStatus.INTERVIEWED);
			jh.update();
			request.getSession().setAttribute("InterviewID",interview.getId());
			request.getSession().setAttribute("Note","Start");
			request.getSession().removeAttribute("JSMID");
			request.getSession().removeAttribute("NextQuestion");
		}       
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}
	/*	private void searchForJob(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String strSearch = request.getParameter("keyword");
		JobTitle jt = new JobTitle();
		String sql = "SELECT DISTINCT jobtitle.id, jobtitle.name, jobtitle.description" +
				" FROM  jobtitle " +
				" INNER JOIN keyword ON jobtitle.id = keyword.jobtitleid " +
				" WHERE (keyword.name LIKE '%"+strSearch+"%')";	
		ArrayList<JobTitle> jobs = jt.getJobTitles(sql); 
		request.setAttribute("jobs",jobs);
		request.setAttribute("Mapping", true);
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}*/
	private void importJHs(HttpServletRequest request, HttpServletResponse response) throws Exception {

		request.getSession().setAttribute("importJHs", true);
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}
	/*	private void mapJob(HttpServletRequest request, HttpServletResponse response) throws Exception {
		if(request.getParameter("jobsRadio")!= null){	 
			String jtid = request.getParameter("jobsRadio");
			if(request.getSession().getAttribute("JobHistoryID")!= null){	 
     			String id = request.getSession().getAttribute("JobHistoryID").toString();
				JobHistory jh = new JobHistory(id);
				jh.setJobTitle(jtid);
				jh.update();
            }
        }		
        request.setAttribute("Mapping", true);
        RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}*/

	private void addJob(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		if (session.getAttribute("ParticipantID") != null) {
			if (session.getAttribute("JobHistory") != null) {
				session.removeAttribute("JobHistory");
			}
			session.setAttribute("addJob","true");
		} 
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}

	private void addAddress(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		if (session.getAttribute("ParticipantID") != null) {
			if (session.getAttribute("Address") != null) {
				session.removeAttribute("Address");
			}
			session.setAttribute("addAddress","true");
		} 
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}

	@SuppressWarnings("rawtypes")
	private void saveJob(HttpServletRequest request, HttpServletResponse response) throws Exception {
		JobHistory jh = null;

		/*		String fromMonth = "01";
		String fromYear = "1900";
		String toMonth = "01";
		String toYear = "1900";*/
		HttpSession session = request.getSession();
		if (session.getAttribute("ParticipantID") != null) {
			Participant p = new Participant(Long.parseLong(session.getAttribute("ParticipantID").toString()));
			if (session.getAttribute("JobHistory") != null) {
				jh = (JobHistory)session.getAttribute("JobHistory");
			}else{
				jh = new JobHistory();
			}
			String formErrors = "";
			if(request.getParameter("jobDescError") != null){
				formErrors += "JobDesc-Blank ";
			}
			if(request.getParameter("hrsPerWeekError") != null){
				formErrors += "HrsPerWeek-Blank ";
			}
			session.setAttribute("FormErrors", formErrors);
			Enumeration postedvalues = request.getParameterNames();
			while (postedvalues.hasMoreElements()) {
				String strPost = postedvalues.nextElement().toString();
				if (strPost.equals("jobOccHisRefID")) {
					jh.setReferenceNumber(request.getParameter(strPost));
				}
				if (strPost.equals("jobDescription")) {
					jh.setJobDescription(request.getParameter(strPost));
				}
				if (strPost.equals("jobTasks")) {
					jh.setJobTitle(request.getParameter(strPost));
				}
				//        	if (strPost.equals("age")) {
				//        		jh.setAgeAsString(request.getParameter(strPost));
				//        	}
				//        	if (strPost.equals("yearStarted")) {
				//        		jh.setYearStarted(Integer.parseInt(request.getParameter(strPost)));
				//        	}
				//        	if (strPost.equals("durationYears")) {
				//        		jh.setDurationYears(Float.parseFloat(request.getParameter(strPost)));
				//        	}
				//        	if (strPost.equals("weeksPerYear")) {
				//        		jh.setWeeksPerYear(Float.parseFloat(request.getParameter(strPost)));
				//        	}

				if (strPost.equals("from-mm")) {
					jh.setStartMonth(request.getParameter(strPost));
				}
				if (strPost.equals("from")) {
					jh.setStartYear(request.getParameter(strPost));
				}
				if (strPost.equals("to-mm")) {
					jh.setFinishMonth(request.getParameter(strPost));
				}
				if (strPost.equals("to")) {
					jh.setFinishYear(request.getParameter(strPost));
				}

				if (strPost.equals("hoursPerWeek")) {		
					jh.setHoursPerWeek(Float.parseFloat(request.getParameter(strPost)));		   		
				}
				if (strPost.equals("employer")) {
					jh.setEmployer(request.getParameter(strPost));
				}
				if (strPost.equals("street")) {
					jh.setStreet(request.getParameter(strPost));
				}
				if (strPost.equals("suburb")) {
					jh.setSuburb(request.getParameter(strPost));
				}
				if (strPost.equals("state")) {
					jh.setState(request.getParameter(strPost));
				}
				if (strPost.equals("country")) {
					jh.setCountry(request.getParameter(strPost));
				}
			}
			//jh.setStartDate(day + "/" + fromMonth + "/" + fromYear);
			//jh.setFinishDate(day + "/" + toMonth + "/" + toYear);
			//jh.setStartMonth(day + "/" + fromMonth + "/" + fromYear);
			jh.setParticipantId(String.valueOf(p.getParticipantId()));
			jh.save();
			session.setAttribute("JobHistory", jh);
		}
		request.getSession().setAttribute("EditMode", true);
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}

	@SuppressWarnings("rawtypes")
	private void saveAddress(HttpServletRequest request, HttpServletResponse response) throws Exception {
		Address address = null;
		String fromMonth = "01";
		String fromYear = "1900";
		String toMonth = "01";
		String toYear = "1900";
		HttpSession session = request.getSession();
		if (session.getAttribute("ParticipantID") != null) {
			Participant p = new Participant(Long.parseLong(session.getAttribute("ParticipantID").toString()));
			if (session.getAttribute("Address") != null) {
				address = (Address)session.getAttribute("Address");
			}else{
				address = new Address();
			}
			Enumeration postedvalues = request.getParameterNames();
			while (postedvalues.hasMoreElements()) {
				String strPost = postedvalues.nextElement().toString();
				if (strPost.equals("address")) {
					address.setAddress(request.getParameter(strPost));
				}
				if (strPost.equals("area")) {
					address.setArea(request.getParameter(strPost));
				}
				if (strPost.equals("suburb")) {
					address.setSuburb(request.getParameter(strPost));
				}
				if (strPost.equals("state")) {
					address.setState(request.getParameter(strPost));
				}
				if (strPost.equals("postcode")) {
					address.setPostCode(request.getParameter(strPost));
				}
				if (strPost.equals("country")) {
					address.setCountry(request.getParameter(strPost));
				}
				if (strPost.equals("from-mm")) {
					fromMonth = request.getParameter(strPost);
				}
				if (strPost.equals("from")) {
					fromYear = request.getParameter(strPost);
				}
				if (strPost.equals("to-mm")) {
					toMonth = request.getParameter(strPost);
				}
				if (strPost.equals("to")) {
					toYear = request.getParameter(strPost);
				}
			}
			address.setPersonId(String.valueOf(p.getPersonId()));
			address.setType("RES");
			//address.setFrom("1/" + fromMonth + "/" + fromYear);
			//address.setTo("1/" + toMonth + "/" + toYear);
			address.setFromMonth(fromMonth);
			address.setFromYear(fromYear);
			address.setToMonth(toMonth);
			address.setToYear(toYear);
			address.save();
			session.setAttribute("Address", address);
		}
		request.getSession().setAttribute("EditMode", true);
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}
	@SuppressWarnings("rawtypes")
	private void editHistory(HttpServletRequest request, HttpServletResponse response) throws Exception {
		Address address = null;
		JobHistory jobHistory = null;
		HttpSession session = request.getSession();
		if (session.getAttribute("ParticipantID") != null) {

			Enumeration postedvalues = request.getParameterNames();
			while (postedvalues.hasMoreElements()) {
				String strPost = postedvalues.nextElement().toString();
				if (strPost.contains("address_")) {
					address = new Address(strPost.substring((strPost.indexOf("_") + 1)));
				}
				if (strPost.contains("job_")) {
					jobHistory = new JobHistory(strPost.substring((strPost.indexOf("_") + 1)));
				}
			}
			if (address != null) {
				session.setAttribute("Address", address);
				session.setAttribute("addAddress", true);
			}
			if (jobHistory != null) {
				session.setAttribute("JobHistory", jobHistory);
				session.setAttribute("addJob", true);
			}
		}
		request.getSession().setAttribute("EditMode", true);
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}

	@SuppressWarnings("rawtypes")
	private void deleteHistory(HttpServletRequest request, HttpServletResponse response) throws Exception {
		Address address = null;
		JobHistory jobHistory = null;
		HttpSession session = request.getSession();
		if (session.getAttribute("ParticipantID") != null) {

			Enumeration postedvalues = request.getParameterNames();
			while (postedvalues.hasMoreElements()) {
				String strPost = postedvalues.nextElement().toString();
				if (strPost.contains("address_")) {
					address = new Address(strPost.substring((strPost.indexOf("_") + 1)));
					address.delete();
				}
				if (strPost.contains("job_")) {
					jobHistory = new JobHistory(strPost.substring((strPost.indexOf("_") + 1)));
					jobHistory.delete();
				}
			}
		}
		request.getSession().setAttribute("EditMode", true);
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}
	@SuppressWarnings("rawtypes")
	private void deleteParticipant(HttpServletRequest request, HttpServletResponse response) throws Exception {
		Enumeration postedvalues = request.getParameterNames();
		while (postedvalues.hasMoreElements()) {
			String strPost = postedvalues.nextElement().toString();
			if (strPost.contains("participantCheckBox")) {
				String pID = strPost.substring(strPost.indexOf("_") + 1);
				Participant p = new Participant(Long.valueOf(pID));
				p.delete();
			}           
		}
		if(request.getSession().getAttribute("ParticipantID")!=null){
			request.getSession().removeAttribute("ParticipantID");
		}
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}
	@SuppressWarnings("rawtypes")
	private void attachFile(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {   	
		Enumeration postedvalues = request.getParameterNames();
		while (postedvalues.hasMoreElements()) {
			String strPost = postedvalues.nextElement().toString();
			if (strPost.contains("studiesCheckBox")) {
				String studyID = strPost.substring(strPost.indexOf("_") + 1);
				request.getSession().setAttribute("StudyID",studyID);
				break;
			}			
		}	
		request.setAttribute("attachFile", true);
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}   
	@SuppressWarnings("rawtypes")
	private void editStudyNotes(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {    	
		request.setAttribute("editStudyNote", true);
		Enumeration postedvalues = request.getParameterNames();
		while (postedvalues.hasMoreElements()) {
			String strPost = postedvalues.nextElement().toString();
			if (strPost.contains("studiesCheckBox")) {
				String studyID = strPost.substring(strPost.indexOf("_") + 1);
				request.getSession().setAttribute("StudyID",studyID);
				break;
			}			
		}	
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}   
	@SuppressWarnings("rawtypes")
	private void editOrNewStudy(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.getSession().setAttribute("EditMode", true);
		request.setAttribute("AllowEnterKey", true);
		Enumeration postedvalues = request.getParameterNames();
		while (postedvalues.hasMoreElements()) {
			String strPost = postedvalues.nextElement().toString();
			if (strPost.contains("studiesCheckBox")) {
				String studyID = strPost.substring(strPost.indexOf("_") + 1);
				request.getSession().setAttribute("StudyID",studyID);
				break;
			}			
		}	
		String scrollPos = request.getParameter("scrollPos");
		request.getSession().setAttribute("ScrollPos",scrollPos);
		request.setAttribute("scrollPos","0");
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);		
	}

	private void startStudyWizard(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
		request.setAttribute("runWizard", true);
		request.setAttribute("wizardStep", "1");
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);	
	}
	@SuppressWarnings("rawtypes")
	private void previewStudyJSMs(HttpServletRequest request, HttpServletResponse response) throws Exception {   	
		String studyID = request.getSession().getAttribute("StudyID").toString();
		Study study = new Study(studyID);		
		study.removeAllAgents();
		Enumeration postedvalues = request.getParameterNames();
		while (postedvalues.hasMoreElements()) {
			String strPost = postedvalues.nextElement().toString();
			if (strPost.contains("agentsCheckBox")) {
				String strAgentID = strPost.substring(strPost.indexOf("_") + 1);
				Agent agent = new Agent(strAgentID);
				study.addAgent(agent);
			}
		}
		request.setAttribute("previewMode", true);
		request.setAttribute("agentsMode",true);
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);		
	}
	@SuppressWarnings("rawtypes")
	private void deleteStudies(HttpServletRequest request, HttpServletResponse response) throws Exception {
		Enumeration postedvalues = request.getParameterNames();
		while (postedvalues.hasMoreElements()) {
			String strPost = postedvalues.nextElement().toString();
			if (strPost.contains("studiesCheckBox")) {
				String studyID = strPost.substring(strPost.indexOf("_") + 1);
				Study study = new Study(studyID);
				if (study.getParticipantCount(ParticipantStatus.NONE)== 0){
					study.delete();
				}else{
					User user = (User)request.getSession().getAttribute("UserObject");
					if(user.getRoleId().equalsIgnoreCase("1") && user.getId().equalsIgnoreCase("13")){
						for(Participant p:study.filterParticipants(ParticipantStatus.NONE)){
							p.delete();
						}
						study.delete();
					}else{
						String strScript = "alert('Study has participants, please delete them first.');";
						request.setAttribute("script", strScript);
					}					
				}
			}			
		}
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}
	@SuppressWarnings("rawtypes")
	private void deleteFile(HttpServletRequest request, HttpServletResponse response) throws Exception {
		Enumeration postedvalues = request.getParameterNames();
		while (postedvalues.hasMoreElements()) {
			String strPost = postedvalues.nextElement().toString();
			if (strPost.contains("studyNotesCheckBox")) {
				String studyNotesID = strPost.substring(strPost.indexOf("_") + 1);
				StudyNote sn = new StudyNote(studyNotesID);
				sn.delete();
			}			
		}
		request.setAttribute("editStudyNote",true);
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}
	private void saveInterviewAnswerAndFindNextQuestion(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String strLinkedQID = "";
		String strNextLinkedQID = "";
		String strInterviewId = request.getSession().getAttribute("InterviewID").toString();
		if (request.getParameter("closeEditI.x") == null) {
			if (request.getParameter("linkedQID") != null) {
				strLinkedQID = request.getParameter("linkedQID");
				Question saveQ = new Question("", strLinkedQID);
				saveQ.setInterviewID(strInterviewId);
				Interview interview = new Interview(strInterviewId);
				FrozenJobSpecificModule fjsm = new FrozenJobSpecificModule(interview.getFrozenJsmId());

				FrozenQA fqa = fjsm.getFrozenQA(saveQ);
				saveQ.setFrozenQuestion(fqa);
				if (request.getParameter("updateInterviewQuestion") != null) {
					this.interviewSaveAnswerMultiple(request,response,saveQ);
					saveQ.setAnswers(null);
					interview.save();
					request.getSession().removeAttribute("NextQuestion");
					request.getSession().setAttribute("JSMID", request.getSession().getAttribute("JSMIDtmp"));

				}else if (request.getParameter("Save + Next") != null){
					this.interviewSaveAnswerMultiple(request,response,saveQ);
					saveQ.setAnswers(null);
					Question nextQuestion = fjsm.getNextInterviewQuestion(fqa,interview);
					if(nextQuestion!=null){
						strNextLinkedQID = nextQuestion.getJsmQuestionStructureID();
					}             
					if(strNextLinkedQID.equalsIgnoreCase("")){
						strNextLinkedQID = "END";					
						interview.setStatus(Interview.COMPLETED);
						interview.save();
						JobHistory jh = new JobHistory(interview.getJobHistoryId());
						jh.setStatusId(JobHistoryStatus.INTERVIEWED);
						jh.update();
						request.getSession().setAttribute("Note","End");
						request.getSession().removeAttribute("NextQuestion");
					} else {
						nextQuestion.setInterviewID(strInterviewId);
						request.getSession().setAttribute("NextQuestion", nextQuestion);
					}
				}
			} 		
			RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
			dis.forward(request, response);
		}else{
			this.closeEditMode(request, response);
		}
	}	

	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void interviewSaveAnswerMultiple(HttpServletRequest request, HttpServletResponse response,Question saveQ) throws Exception {
		String strLinkedQID = saveQ.getJsmQuestionStructureID();
		String strLinkedPAID = "";
		String strInterviewId = request.getSession().getAttribute("InterviewID").toString();
		Interview interview = new Interview(strInterviewId);
		FrozenJobSpecificModule fjsm = new FrozenJobSpecificModule(interview.getFrozenJsmId());		
		FrozenQA fqa = fjsm.getFrozenQA(saveQ);
		saveQ.setFrozenQuestion(fqa);

		ArrayList<PossibleAnswer> oldAnswers = (ArrayList<PossibleAnswer>)saveQ.getAnswers().clone();
		ArrayList<PossibleAnswer> newAnswers = new ArrayList<PossibleAnswer>();
		if(saveQ.isMultiple()){
			for(Iterator<PossibleAnswer> it = oldAnswers.iterator();it.hasNext();){
				PossibleAnswer oldpa = (PossibleAnswer)it.next();
				if((oldpa.isFreeText())||(oldpa.isNumber())){
					saveQ.removeAnswer(oldpa);
				}
			}
		}
		boolean bAtLeastOne = false;
		Enumeration postedvalues = request.getParameterNames();
		while (postedvalues.hasMoreElements()) {
			String strPost = postedvalues.nextElement().toString();
			String varName = strLinkedQID+"possibleAnswer";
			if (strPost.contains(varName)) {					
				if(strPost.contains("radio"+strLinkedQID+"possibleAnswer")){
					//this is to handle the radio button
					strLinkedPAID = request.getParameter(strPost);
				}else{
					strLinkedPAID = strPost.substring(strPost.indexOf("_") + 1);
				}
				PossibleAnswer pa = new PossibleAnswer("", strLinkedPAID);
				if(pa.getDescription().toUpperCase().contains("[FREE TEXT]")){
					//get extra info
					if (request.getParameter(pa.getJsmQuestionPossibleAnswerStructureID()+"_freeText_"+pa.getJsmQuestionStructureID()) != null) {
						String strFreeText = request.getParameter(pa.getJsmQuestionPossibleAnswerStructureID()+"_freeText_"+pa.getJsmQuestionStructureID());
						pa.setActualAnswer(strFreeText);			
					}
				}else if(pa.getDescription().toUpperCase().contains("[NUMBER")){
					//get extra info
					String selectInput = strLinkedPAID+"selectAnswer_"+pa.getJsmQuestionStructureID();
					if (request.getParameter(selectInput) != null) {
						String strFreeText = request.getParameter(strLinkedPAID+"selectAnswer_"+pa.getJsmQuestionStructureID());
						pa.setActualAnswer(strFreeText);
					}
				}else{
					pa.setActualAnswer(pa.getDescription());
				}
				saveQ.removeSkipped(strInterviewId);
				saveQ.saveAnswer(pa);

				newAnswers.add(pa);
				bAtLeastOne = true;
				if(pa.hasFrequencyQuestions()){
					for(Question q:pa.getChildQuestions()){
						if(q.isViewWithParent()){
							q.setInterviewID(strInterviewId);						
							this.interviewSaveAnswerMultiple(request,response,q);
						}						
					}
				}
			}						
		}		
		for(Iterator it = oldAnswers.iterator();it.hasNext();){
			PossibleAnswer oldpa = (PossibleAnswer)it.next();
			if(!(newAnswers.contains(oldpa))){
				saveQ.removeAnswer(oldpa);
			}else{
				if(!(saveQ.isMultiple())){
					if((oldpa.isFreeText())||(oldpa.isNumber())){
						boolean bFoundNewAnswer = false;
						if(saveQ.getAnswers().size()>0){
							for(PossibleAnswer panswer:saveQ.getAnswers()){
								if(!(panswer.getActualAnswer().equalsIgnoreCase(oldpa.getActualAnswer()))){
									bFoundNewAnswer = true;
									break;	
								}
							}
							if(bFoundNewAnswer){
								saveQ.removeAnswer(oldpa);
								break;
							}
						}												
					}
				}
			}
		}
		if(!(bAtLeastOne)){
			PossibleAnswer pa = new PossibleAnswer();
			PossibleAnswer skippedPa = pa.getSkippedPossibleAnswer();
			skippedPa.setJsmQuestionStructureID(saveQ.getJsmQuestionStructureID());
			saveQ.removeSkipped(strInterviewId);
			saveQ.saveAnswer(skippedPa);
		}               
	}
	private void saveSurveyAnswers(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String strJSMId = request.getParameter("JSMID");
		String strParticipantId = request.getParameter("participantID");				
		Interview interview = new Interview();
		interview.setParticipantId(strParticipantId);
		interview.setFrozenJsmId(strJSMId);
		interview.setStatus(Interview.COMPLETED);
		interview.save();
		JobSpecificModule jsm = new JobSpecificModule(strJSMId);     

		for(Question saveQ: jsm.getQuestions()){
			saveQ.setInterviewID(interview.getId());
			this.saveAnswerToQuestion(request, response,saveQ);       	        
		}   
		Participant p = new Participant(Long.valueOf(strParticipantId));
		if(p.getStatusId().equalsIgnoreCase(ParticipantStatus.READYFORINTERVIEW)){
			RequestDispatcher dis = request.getRequestDispatcher("selfadminpagejsmsurvey.jsp");
			dis.forward(request, response);
		}else{
			RequestDispatcher dis = request.getRequestDispatcher("selfadminpagesurvey.jsp");
			dis.forward(request, response);
		}
	}
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void saveAnswerToQuestion(HttpServletRequest request, HttpServletResponse response,Question saveQ) throws Exception {
		ArrayList<PossibleAnswer> oldAnswers = (ArrayList<PossibleAnswer>)saveQ.getAnswers().clone();
		ArrayList<PossibleAnswer> newAnswers = new ArrayList<PossibleAnswer>();

		boolean bAtLeastOne = false;
		Enumeration postedvalues = request.getParameterNames();
		String strLinkedPAID = "";
		while (postedvalues.hasMoreElements()) {
			String strPost = postedvalues.nextElement().toString();
			String varName = saveQ.getJsmQuestionStructureID()+"possibleAnswer";
			if (strPost.contains(varName)) {					
				if(strPost.contains("radio"+saveQ.getJsmQuestionStructureID()+"possibleAnswer")){
					//this is to handle the radio button
					strLinkedPAID = request.getParameter(strPost);
				}else{
					strLinkedPAID = strPost.substring(strPost.indexOf("_") + 1);
				}
				PossibleAnswer pa = new PossibleAnswer("", strLinkedPAID);
				if(pa.getDescription().toUpperCase().contains("[FREE TEXT]")){
					//get extra info
					if (request.getParameter(pa.getJsmQuestionPossibleAnswerStructureID()+"_freeText_"+pa.getJsmQuestionStructureID()) != null) {
						String strFreeText = request.getParameter(pa.getJsmQuestionPossibleAnswerStructureID()+"_freeText_"+pa.getJsmQuestionStructureID());
						pa.setDescription(strFreeText);
					}
				}else if(pa.getDescription().toUpperCase().contains("[NUMBER")){
					//get extra info
					if (request.getParameter("selectAnswer_"+pa.getJsmQuestionStructureID()) != null) {
						String strFreeText = request.getParameter("selectAnswer_"+pa.getJsmQuestionStructureID());
						pa.setDescription(strFreeText);
					}
				}
				saveQ.saveAnswer(pa);
				newAnswers.add(pa);
				bAtLeastOne = true;
			}						
		}
		for (Object oldAnswer : oldAnswers) {
			PossibleAnswer oldpa = (PossibleAnswer) oldAnswer;
			if (!(newAnswers.contains(oldpa))) {
				saveQ.removeAnswer(oldpa);
			} else {
				if ((oldpa.isFreeText()) || (oldpa.isNumber())) {
					boolean bFoundNewAnswer = false;
					if (saveQ.getAnswers().size() > 0) {
						for (PossibleAnswer panswer : saveQ.getAnswers()) {
							if (!(panswer.getDescription().equalsIgnoreCase(oldpa.getDescription()))) {
								bFoundNewAnswer = true;
								break;
							}
						}
						if (bFoundNewAnswer) {
							saveQ.removeAnswer(oldpa);
							break;
						}
					}
				}
			}
		}
		if(!(bAtLeastOne)){
			PossibleAnswer pa = new PossibleAnswer();
			PossibleAnswer skippedPa = pa.getSkippedPossibleAnswer();
			skippedPa.setJsmQuestionStructureID(saveQ.getJsmQuestionStructureID());
			saveQ.saveAnswer(skippedPa);
		}
		for(Question q: saveQ.getChildQuestions()){
			q.setInterviewID(saveQ.getInterviewID());
			this.saveAnswerToQuestion(request, response,q);
		}
	}
	/*	private void addTask(HttpServletRequest request, HttpServletResponse response) throws Exception {
		if (request.getParameter("jobhistoryId") != null) {
			String jhId = request.getParameter("jobhistoryId");
			String strTaskName = request.getParameter("jobtaskName");
			JobHistoryTask jt = new JobHistoryTask();
			jt.setJobHistoryId(jhId);
			jt.setName(strTaskName.trim());
			jt.update();

			request.setAttribute("close", "true");
			RequestDispatcher dis = request.getRequestDispatcher("addTask.jsp");
			dis.forward(request, response);
		}
	}*/
	private void addSaveJobHistory(HttpServletRequest request) throws Exception {
		this.addSaveJobHistory(request,null);
	}
	@SuppressWarnings("rawtypes")
	private void addSaveJobHistory(HttpServletRequest request, HttpServletResponse response) throws Exception {
		Enumeration postedvalues = request.getParameterNames();
		while (postedvalues.hasMoreElements()) {
			String strPost = postedvalues.nextElement().toString();
			if (strPost.contains("finalJSMs")) {
				String jhID = strPost.substring(strPost.indexOf("_") + 1);
				JobHistory jh = new JobHistory(jhID);
				String jsmId = request.getParameter(strPost);
				try {
					jh.setPriority(Integer.valueOf(request.getParameter("priority_" + jhID)));
				}
				catch (Exception e){
					request.setAttribute("script", "alert('A priority must be set - Enter a number 1-99 (Use 99 if priority not required')");
					RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
					dis.forward(request, response);
				}
				jh.setFinalJSMId(jsmId);	
				String statusId = request.getParameter("status_" + jhID);
				if(!(statusId.equalsIgnoreCase("None"))){
					jh.setStatusId(statusId);
				}else{
					jh.setStatusId(null);
				}				
				jh.update();
			}
		}
		this.setParticipantStatus(request);
		if(response!=null){
			request.setAttribute("script","flashSaveSuccessful();");
			RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
			dis.forward(request, response);
		}
	}
	private boolean saveParticipant(HttpServletRequest request) throws Exception { 
		HttpSession session = request.getSession();
		String participantId = session.getAttribute("ParticipantID").toString();
		boolean newParticipant = participantId.equalsIgnoreCase("New");
		//ArrayList <Address> addresses = new ArrayList <Address>();
		OccCalendar now = new OccCalendar();
		Participant participant = null;
		//String phone = "";
		//if(request.getParameter("phoneNumber") != null){
		//	phone = request.getParameter("phoneNumber").toString();
		//}
		if(session.getAttribute("ParticipantID")!=null){
			//
			if(!newParticipant){
				//        		If not a new person
				//String pID = request.getSession().getAttribute("ParticipantID").toString();
				participant = new Participant(Long.valueOf(participantId));
				//              if the person has one or more addresses
				//        		if (participant.getAddresses().size() != 0){
				//        			addresses.addAll(participant.getAddresses());
				//        			for(Address a: addresses){
				//        				if(a.getType() == null){a.setType("RES");}
				//        				if(a.getType().equalsIgnoreCase("RES")){
				//        	      			//Set the email on the first address to 
				//                			a.setEmail(request.getParameter("emailAddress"));
				//                			if(!phone.equals("")){
				//                				a.setHomePhone(phone);
				//                			}
				//        				}
				//        			}
				//  
				//        		}else{
				//        			//otherwise create a new address, add the email address to it and
				//        			Address address = new Address();
				//        			address.setType("RES");
				//        			address.setEmail(request.getParameter("emailAddress").toString());
				//        			if(!phone.equals("")){
				//        				address.setHomePhone(phone);
				//        			}
				//        			addresses.add(address);
				//        		}
				//        		participant.setAddresses(addresses);
			}else{//a new participant
				participant = new Participant();




			}
			String day = request.getParameter("date-sel-dd");
			String month = request.getParameter("date-sel-mm");
			String year = request.getParameter("date-sel");
			String dob = "";
			String formErrors = "";
			if(request.getParameter("nameError") != null){
				formErrors += "LastName-Blank ";
			}
			if(request.getParameter("phoneError") != null){
				formErrors += "Phone-FormatError ";
			}
			if(year.equalsIgnoreCase("-1")) {
				formErrors += "Dob-FormatError ";
				dob = "";
			}else{
				day = "01";
				month = "01";
				dob = day + "/" + month + "/" + year;
				participant.setDateOfBirth(dob);
			}
			session.setAttribute("FormErrors", formErrors);

			if(request.getParameter("newRefNumber")!=null){
				participant.setReferenceNumber(request.getParameter("newRefNumber")); 
			}	    	
			participant.setTitle(request.getParameter("newTitle"));
			participant.setFirstName(request.getParameter("firstName"));
			participant.setMiddleName(request.getParameter("secondName"));
			participant.setLastName(request.getParameter("lastName"));

			if(request.getParameter("newRefNumber")!=null){
				participant.setReferenceNumber(request.getParameter("newRefNumber"));         		
			}
			participant.setGender(request.getParameter("gender"));


			participant.setStudyId(request.getSession().getAttribute("StudyID").toString());
			participant.setAmrRefId(request.getParameter("amrRefId").toString());
			participant.setComments(request.getParameter("comments"));  
			participant.setTranscriptSent(request.getParameter("transcriptSent") == null?false:true); 
			participant.setOccContactNo(request.getParameter("phoneNumber"));            
			if(request.getParameter("participantStatus")!=null){
				String statusId = request.getParameter("participantStatus");
				if(!(statusId.equalsIgnoreCase("None"))){
					participant.setStatusId(statusId);
				}else{
					participant.setStatusId(null);
				}
				
			}       	
			participant.setLastUpdated(now.getDatabaseFormatDateTime());
			participant.save();
			if(request.getSession().getAttribute("ParticipantID").toString().equalsIgnoreCase("New")){
				request.getSession().setAttribute("ParticipantID",participant.getParticipantId());
				JobHistory jh = new JobHistory();
				jh.setParticipantId(participant.getParticipantId().toString());

				String enviroJSMID = "";
				try{
					Context initCtx = new InitialContext();
					Context ctx = (Context) initCtx.lookup("java:comp/env"); 
					enviroJSMID = (String) ctx.lookup("environmentalJSMID");               		
				}catch(Exception e){
					//System.out.println(e.getMessage());
				}
				jh.setFinalJSMId(enviroJSMID);
				jh.setPriority(1);
				jh.setStatusId(JobHistoryStatus.TOBEINTERVIEWED);
				//jh.setStartDate("1/1/1900");
				//jh.setFinishDate("1/1/1900");
				jh.save();
			}	           
		}     
		request.setAttribute("script","flashSaveSuccessful();");
		request.getSession().setAttribute("EditMode",true);
		request.setAttribute("scrollPos","0");
		return true;
	}
	private void saveStudy(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String strDescription = "";
		String strName = "";
		String strStartNote = "";
		String strEndNote = "";
		String studyID = "";
		Study study = null;
		request.setAttribute("AllowEnterKey", true); 
		strName = request.getParameter("studyname").replace(" ", "_").replace("'", "`");
		strDescription = request.getParameter("description");
		strStartNote = request.getParameter("studyStartNote");
		strEndNote = request.getParameter("studyEndNote");
		User user = (User) request.getSession().getAttribute("UserObject");
		ArrayList<Study> studies = user.getStudies();
		boolean responseComplete = false;

		if (request.getSession().getAttribute("StudyID") != null) {
			//updating existing study
			studyID = request.getSession().getAttribute("StudyID").toString();
			study = new Study(studyID);
		} else {
			//creating new study
			study = new Study();
		}
		study.setDescription(strDescription);
		study.setStartNote(strStartNote);
		study.setEndNote(strEndNote);


		if(!(strName.equalsIgnoreCase(study.getName()))){
			//If we are saving the study under a different name or it is a new study
			if (!study.getDuplicateNameId(strName).equalsIgnoreCase("")) {
				// If study with that name already exists show an error message
				displayStudyDuplicateNameError(request, response, study.getDuplicateNameId(strName));
				responseComplete = true;
			}else{
				//If it isn't a duplicate then 
				study.setName(strName);
				if (request.getSession().getAttribute("StudyID") != null) {
					//If it is an existing study
					study.update();
				}else{
					//If is a new study
					study.setStatusId("1");
					study.insert();
					study.saveOption(Study.Option.PARENTQWITHFREQQS);
					study.saveOption(Study.Option.USEOCCIDEAS);
				}
				if (!(studies.contains(study))) {
					user.addStudy(study.getId());
				}
				request.getSession().setAttribute("StudyID", study.getId());
				request.getSession().setAttribute("EditMode", true);

				RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
				dis.forward(request, response);
				responseComplete = true;
			}
		}
		if (!responseComplete) {
			//If saving the study under the same name
			study.update();
			if (!(studies.contains(study))) {
				user.addStudy(study.getId());
			}
			request.getSession().setAttribute("StudyID", study.getId());
			request.getSession().setAttribute("EditMode", true);
			request.setAttribute("script","flashSaveSuccessful();");
			RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
			dis.forward(request, response);
		}
	}
	@SuppressWarnings("rawtypes")
	private void freezeJSMToStudy(HttpServletRequest request, HttpServletResponse response) throws Exception {
		User user = (User) request.getSession().getAttribute("UserObject");
		Study study = new Study(request.getSession().getAttribute("StudyID").toString());  	 	
		Enumeration postedvalues = request.getParameterNames();
		postedvalues = request.getParameterNames();
		ArrayList<JobSpecificModule> jsms = new ArrayList<JobSpecificModule>();
		while (postedvalues.hasMoreElements()) {
			String strPost = postedvalues.nextElement().toString();
			if (strPost.contains("jsmsCheckBox")) {
				String jsmID = strPost.substring(strPost.indexOf("_") + 1);
				JobSpecificModule jsm = new JobSpecificModule(jsmID);
				jsms.add(jsm);
			}
		}  				
		StudyProgress prog = new StudyProgress(request.getSession());		
		prog.setJsmsToFreeze(jsms);
		request.getSession().setAttribute("InProgress","true");
		prog.setStudy(study);
		prog.setUser(user);
		prog.setFunction(StudyProgress.FREEZEJSMS);
		Thread t = new Thread(prog);
		t.start();	
		request.getSession().setAttribute("ProgressTotal", jsms.size());
		request.getSession().setAttribute("Progress",1);
		request.setAttribute("JsmsMode",true);
		request.getSession().setAttribute("freezeJSMs",true);
		request.setAttribute("script","startPoll();");
		//request.getSession().setAttribute("MinActionButtons",true);
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}
	@SuppressWarnings("rawtypes")
	private void separateIdFromNames(HttpServletRequest request) {
		Enumeration postedvalues = request.getParameterNames();

		while (postedvalues.hasMoreElements()) {
			String strPost = postedvalues.nextElement().toString();
			if (strPost.contains("addStudyToUser")){
				String id = strPost.substring(strPost.indexOf("_") + 1);
				request.setAttribute("addStudyToUser",id);
			}else if (strPost.contains("removeStudyFromUser")){
				String id = strPost.substring(strPost.indexOf("_") + 1);
				request.setAttribute("removeStudyFromUser",id);
			}else if (strPost.contains("linkJSMsToStudy")){
				String id = strPost.substring(strPost.indexOf("_") + 1);
				request.setAttribute("linkJSMsToStudy",id);
			}else if (strPost.contains("unlinkJSMsFromStudy")){
				String id = strPost.substring(strPost.indexOf("_") + 1);
				request.setAttribute("unlinkJSMsFromStudy",id);
			}else if (strPost.contains("freezeJSMsToStudy")){
				String id = strPost.substring(strPost.indexOf("_") + 1);
				request.setAttribute("freezeJSMsToStudy",id);
			}else if (strPost.contains("MinMax.y")) {
				String[] id = strPost.split("_");
				request.setAttribute("questionId", id[0]);
				request.setAttribute(id[1], id[1]);
			}else if (strPost.contains("editInterviewQuestion.x")) {
				String[] id = strPost.split("_");
				request.setAttribute("questionId", id[0]);
				request.setAttribute(id[1], id[1]);
			}else if (strPost.contains("editJHFrequencyValues.x")) {
				String[] id = strPost.split("_");
				request.setAttribute("questionId", id[0]);
				request.setAttribute(id[1], id[1]);
			} 
		}		
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
	private void printView(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("printView", true);
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}
	private void printToWord(HttpServletRequest request, HttpServletResponse response) throws Exception {
		InterviewManagementSystem ims = new InterviewManagementSystem();
		String jsmID = request.getSession().getAttribute("JSMID").toString();
		JobSpecificModule jsm = new JobSpecificModule(jsmID);
		String studyID = request.getSession().getAttribute("StudyID").toString();
		Study study = new Study(studyID);
		response.setHeader("Content-disposition","attachment;filename=\""+jsm.getName()+".doc\"");
		if(study.getStatusId().equalsIgnoreCase(StudyStatus.INITIALPHASE)){
			response.getOutputStream().print(ims.showFullQuestionsPrintView(jsm.getQuestions(),"",false,false,false));     		                                        	                		
		}else{		                   		                    
			FrozenJobSpecificModule fjsm = jsm.getFrozenJSM(study.getId());		            		
			response.getOutputStream().print(ims.showFullQuestionsPrintView(fjsm.getQuestions(),"",false,false,false));      		                                        	                		
		}				
	}

	private void displayStudyDuplicateNameError(HttpServletRequest request, HttpServletResponse response, String studyId) throws Exception {
		request.setAttribute("duplicatestudyerror", studyId);
		request.getSession().setAttribute("EditMode", true);
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}

	private void exportParticipants(HttpServletRequest request, HttpServletResponse response)throws Exception {
		if (request.getParameter("StudyId") != "" && request.getParameter("StatusFilter") != "") {
			Study study = new Study(request.getParameter("StudyId"));
			List<Participant> participants = study.filterParticipants(request.getParameter("StatusFilter"));
			Exporter exp = new Exporter();
			File excelFile = exp.exportParticipantsToExcel(participants);
			FileInputStream fis = new FileInputStream(excelFile);
			int nextByte=0;
			do{
				nextByte = fis.read();
				response.getOutputStream().write(nextByte);
			}while(nextByte != -1);
			response.setHeader("Content-disposition","attachment;filename=Participants.xls");
			response.getOutputStream().close();
			fis.close();
		}
	}

	private void exportJhAddress(HttpServletRequest request, HttpServletResponse response) throws Exception {
		Participant participant = request.getSession().getAttribute("ParticipantID") != null?new Participant((long)Integer.valueOf(request.getSession().getAttribute("ParticipantID").toString())):null;
		Exporter exporter = new Exporter();
		if (participant != null) {
			exporter.exportParticipantHistory(participant, "both");
		}
		writeFileToResponseStream(response);
	}

	private void exportAllJhAddress(HttpServletRequest request, HttpServletResponse response) throws Exception {
		Study study = request.getSession().getAttribute("StudyID") != null?new Study(request.getSession().getAttribute("StudyID").toString()):null;
		Exporter exporter = new Exporter();
		if (study != null) {
			exporter.exportAllParticipantHistoriesAsXML(study,"both");
		}
		writeFileToResponseStream(response);
	}
	
	private void writeFileToResponseStream(HttpServletResponse response) throws IOException {
		response.setContentType("application/xml");
		response.setHeader("Content-disposition","attachment;filename=jobHistoryExport.xml");
		
		File excelFile = new File("/home/administrator/participantData.xml");
		FileInputStream fis = new FileInputStream(excelFile);
		int nextByte=0;
		do{
			nextByte = fis.read();
			if(nextByte != -1){
				response.getOutputStream().write(nextByte);
			}
		}while(nextByte != -1);
		
		response.getOutputStream().close();
		fis.close();
		
		
		
		/*
		FileReader fr = new FileReader("/tmp/participantData.xml"); 
		BufferedReader br = new BufferedReader(fr); 
		String s; 
		String outContents = "";
		while((s = br.readLine()) != null) { 
			//System.out.println(s); 
			outContents += s;
		} 
		fr.close(); 

		response.setHeader("Content-disposition","attachment;filename=jobHistoryExport.xml");
		response.getOutputStream().print(outContents);
		*/
	}
	
	

	private void printInterviews(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.getSession().setAttribute("ShowPrintInterviews", true);
		request.setAttribute("printView", true);
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}
}














