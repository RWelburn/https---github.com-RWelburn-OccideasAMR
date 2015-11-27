/**
 * Version:
 *     $Id: MainServlet.java,v 1.188 2009/05/27 02:01:02 troy.sadkowsky Exp $
 *
 * Revisions:
 *     $Log: MainServlet.java,v $
 *     Revision 1.188  2009/05/27 02:01:02  troy.sadkowsky
 *     bug fix 814 3cat frequency hours
 *
 *     Revision 1.187  2009/04/27 03:19:26  troy.sadkowsky
 *     prefix comes from context tags
 *
 *     Revision 1.186  2009/04/11 11:39:18  ray.welburn
 *     implement numberpad
 *
 *     Revision 1.185  2009/04/08 05:21:45  ray.welburn
 *     Isolate other controls when running interview
 *
 *     Revision 1.184  2009/03/09 07:27:42  troy.sadkowsky
 *     new prifix for demo apps
 *
 *     Revision 1.183  2009/03/06 01:10:57  troy.sadkowsky
 *     participant tracking updates
 *
 *     Revision 1.182  2009/02/26 23:55:26  troy.sadkowsky
 *     new image for report button
 *
 *     Revision 1.181  2009/02/19 03:38:23  troy.sadkowsky
 *     archive report functions
 *
 *     Revision 1.180  2009/02/04 22:47:49  troy.sadkowsky
 *     New report functions
 *
 *     Revision 1.179  2009/01/21 08:47:01  troy.sadkowsky
 *     show and hide action bar
 *
 *     Revision 1.178  2009/01/07 05:51:23  troy.sadkowsky
 *     more v2 updates
 *
 *     Revision 1.177  2009/01/06 07:41:14  troy.sadkowsky
 *     v2 updates
 *
 *     Revision 1.176  2009/01/06 01:17:45  troy.sadkowsky
 *     report to excel functions
 *
 *     Revision 1.175  2009/01/05 06:54:54  troy.sadkowsky
 *     progress bar updates
 *
 *     Revision 1.174  2008/12/29 02:45:05  troy.sadkowsky
 *     increased speed of participant lists
 *
 *     Revision 1.173  2008/12/22 08:18:43  troy.sadkowsky
 *     fix for halt and starting interview again
 *
 *     Revision 1.172  2008/12/22 04:06:06  troy.sadkowsky
 *     various updates
 *
 *     Revision 1.171  2008/12/20 02:07:03  troy.sadkowsky
 *     v2 updates
 *
 *     Revision 1.170  2008/12/18 03:15:30  ray.welburn
 *     Added AJAX scripts for updating progress of java processes
 *
 *     Revision 1.169  2008/12/13 04:43:52  ray.welburn
 *     add alert when study name is duplicate
 *
 *     Revision 1.168  2008/12/11 15:32:17  ray.welburn
 *     Add cookies for login
 *
 *     Revision 1.167  2008/12/07 05:17:55  ray.welburn
 *     Change to use only one showcombobox method
 *
 *     Revision 1.166  2008/11/24 01:17:06  ray.welburn
 *     modify title on edit interview
 *
 *     Revision 1.165  2008/11/21 06:11:05  ray.welburn
 *     updates to interview
 *
 *     Revision 1.164  2008/11/05 05:31:37  ray.welburn
 *     Add Job moved to action button and errors to text boxes
 *
 *     Revision 1.163  2008/10/27 22:57:27  troy.sadkowsky
 *     assessment updates
 *
 *     Revision 1.162  2008/10/10 05:53:41  troy.sadkowsky
 *     permission level update
 *
 *     Revision 1.161  2008/09/24 12:17:45  troy.sadkowsky
 *     demo ready
 *
 *     Revision 1.160  2008/09/15 03:08:28  troy.sadkowsky
 *     new auto gen button
 *
 *     Revision 1.159  2008/09/12 02:41:34  troy.sadkowsky
 *     encrypt user id
 *
 *     Revision 1.158  2008/09/10 09:12:36  troy.sadkowsky
 *     interview review updates
 *
 *     Revision 1.157  2008/09/03 05:12:34  ray.welburn
 *     Update to include PT values
 *
 *     Revision 1.156  2008/08/25 01:36:15  ray.welburn
 *     Updates to use single dbobject and participant status table
 *
 *     Revision 1.155  2008/08/11 01:56:57  ray.welburn
 *     move study object to common package
 *
 *     Revision 1.154  2008/08/05 00:28:25  ray.welburn
 *     Use session for progress bar
 *
 *     Revision 1.153  2008/08/02 06:23:17  troy.sadkowsky
 *     new frozen jsm in db and view
 *
 *     Revision 1.152  2008/07/31 00:43:17  ray.welburn
 *     Small fix to html
 *
 *     Revision 1.151  2008/07/28 04:09:10  ray.welburn
 *     Showing Study Module options now conditional on source
 *
 *     Revision 1.150  2008/07/24 12:07:23  ray.welburn
 *     Studies now selected where study option useoccideas set
 *
 *     Revision 1.149  2008/07/05 03:35:23  troy.sadkowsky
 *     format update
 *
 *     Revision 1.148  2008/06/01 09:37:19  ray.welburn
 *     Search for users and filter for lhs user menu
 *
 *     Revision 1.147  2008/05/30 01:52:29  troy.sadkowsky
 *     removed old code
 *
 *
 */
package com.researchit.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

import com.researchit.FrozenJobSpecificModule;
import com.researchit.Interview;
import com.researchit.JobHistory;
import com.researchit.JobSpecificModule;
//import com.researchit.JobTitle;
//import com.researchit.participant.bcees.BCEESJobHistory;
//import com.researchit.participant.bcees.HibernateUtil;
//import com.researchit.BCEES.BCEESJobHistory;
//import com.researchit.BCEES.HibernateUtil;
//import com.researchit.User.Permission;
import com.researchit.common.Address;
import com.researchit.common.Participant;
import com.researchit.ParticipantStatus;
//import com.researchit.ProgressNotifier;
import com.researchit.Question;
import com.researchit.StudyStatus;
import com.researchit.User;
import com.researchit.common.Study;
import com.researchit.html.ActionButton;
import com.researchit.html.HTMLObject;
import com.researchit.html.InterviewManagementSystem;
import com.researchit.html.OccCalendar;
//import org.slf4j.*;
//import org.hibernate.Session;



/**
 * Servlet implementation class for Servlet: ControllerServlet
 * 
 * @web.servlet name="MainServlet" display-name="MainServlet"
 * 
 * @web.servlet-mapping url-pattern="/MainServlet"
 * 
 */
public class MainServlet extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet {

	private static final long serialVersionUID = 1L;

	/*
	 * (non-Java-doc)
	 * 
	 * @see javax.servlet.http.HttpServlet#HttpServlet()
	 */
	public MainServlet() {
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
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
		try {
			//Get the cookies
			if (request.getCookies() != null) {
				Cookie[] cookies = request.getCookies();
				for (Cookie cookie: cookies) {
					if (cookie.getName().equalsIgnoreCase("user")) {
						request.setAttribute("username",cookie.getValue());
						request.setAttribute("rememberme", "checked");
					}else if (cookie.getName().equalsIgnoreCase("password")) {
						request.setAttribute("password",cookie.getValue());
					}
				}
			}
			if (request.getAttribute("cookieConnect")!=null){
				if(request.getAttribute("username")!=null){
					String username = request.getAttribute("username").toString();
					if(request.getAttribute("password")!=null){
						String password = request.getAttribute("password").toString();
						User theUser = new User(username, password);
						if (theUser.hasPermission(User.Permission.STUDIESLOGIN))  {
							request.getSession().setAttribute("UserObject", theUser);
						}						
					}
				}
			}
			if (request.getSession().getAttribute("UserObject") != null) {
				//User user = (User) request.getSession().getAttribute("UserObject");
				//if(user.getStudies().size()==1){
				//	String studyId = user.getStudies().get(0).getId();
				//	request.getSession().setAttribute("StudyID",studyId);
				//}
				String strLocation = "";
				
				if (request.getSession().getAttribute("PageSize") == null) {
					request.getSession().setAttribute("PageSize", 10);
				}
				if (request.getParameter("Location") != null) {
					strLocation = request.getParameter("Location");
					request.getSession().setAttribute("Location", strLocation);
				}
				if (request.getSession().getAttribute("Location") != null) {
					strLocation = request.getSession().getAttribute("Location").toString();
				}             
				int iLocation = this.getLocationInt(strLocation);
				if (request.getAttribute("printView") != null) {
					response.getWriter().println("<form action=ControllerServlet method=post>");
					this.showMainTable(request, response, iLocation);
					response.getWriter().println("</form>");
				}else{
				if(iLocation==3){
					//String participantId = request.getSession().getAttribute("ParticipantID").toString();
					//                	Participant p = new Participant(Long.valueOf(request.getSession().getAttribute("ParticipantID").toString()));
					//                	String studyID = request.getSession().getAttribute("StudyID").toString();
					//        			Study study = new Study(studyID);               
					//                	response.getWriter().println("<form action=ControllerServlet method=post>");
					//                    response.getWriter().println("<table width=100% height=100% cellpadding=0 cellspacing=0 border=0>");
					//                    response.getWriter().println("<tr>");
					//                    response.getWriter().println("<td >&nbsp;</td>");            
					//                    response.getWriter().println("<td bgcolor=#000000 width=1></td>");            
					//                    response.getWriter().println("<td bgcolor=#87B3D0 width=3></td>");            
					//                    response.getWriter().println("<td width=700 valign=top align=center bgcolor=#f9faff style='border-top: 2px solid #87B3D0; border-bottom: 1px solid #87B3D0;'>");            
					//                    response.getWriter().println("<table width=650 height=100% cellpadding=0 cellspacing=0 border=0 bgcolor=#f9faff>");            
					//                    response.getWriter().println("<tr>");                     
					//                    response.getWriter().println("<td valign=middle height=50px><a href=mailto:alisona@ichr.uwa.edu.au >Email InterRett: alisona@ichr.uwa.edu.au</a><br/><a href=mailto:occideas.support@researchit.com.au >Email OccIDEAS: occideas.support@researchit.com.au</a></td><td align=right><a href=ControllerServlet?Action=1&selfAdmin=1&Logout=true onclick=\"return showProgress()\">Log out</a>&nbsp;&nbsp;</td>");                                 
					//                    response.getWriter().println("</tr>");                 
					//                    response.getWriter().println("<tr><td colspan=2 valign=top height=25px>");  
					//                    String part = "";
					//                    InterviewManagementSystem ims = new InterviewManagementSystem();
					//                    if(p.getStatusId().equalsIgnoreCase(ParticipantStatus.READYFORINTERVIEW)){
					//                    	response.getWriter().println(ims.showSelfAdministeredNavTitle(p,5));
					//                    	part = "- Part 3";
					//                	}else{
					//                		response.getWriter().println(ims.showSelfAdministeredNavTitle(p,4));
					//                		part = "- Part 2";
					//                	}                   
					//                    response.getWriter().println("<div class=ProgressBar id=\"progressBar\" >Loading...</div>");                     
					//                    response.getWriter().println("</td></tr>");                     
					//                    response.getWriter().println("<tr class=ListHeader >");                     
					//                    response.getWriter().println("<td height=50px style='padding: 5px; border-left: 1px solid #87B3D0;'>The "+study.getName()+"<br/>"+part+"</td><td style='padding: 5px; border-right: 1px solid #87B3D0;' align=right>Participant Reference Number: "+p.getReferenceNumber()+"</td>");                                 
					//                    response.getWriter().println("</tr>");
					//                    response.getWriter().println("<tr>");            
					//                    response.getWriter().println("<td colspan=2 align=left valign=top style='border: 1px solid #87B3D0;'>");  
					//                    if(request.getAttribute("saveSuccessful")!=null){
					//                    	response.getWriter().println("<font style='font-size: 14pt; color: #006600'>Save Successful</font>"); 
					//                    	if(p.getStatusId().equalsIgnoreCase(ParticipantStatus.TOBEUPDATED)){
					//                    		response.getWriter().println("<input type=submit name=Action value='Mark Complete' />");
					//                    	}else{
					//                    		response.getWriter().println("<font style='font-size: 14pt; color: #006600'> Data Marked Complete</font>"); 
					//                    	}                   	 
					//                    }
					//                    this.showSelfAdministered(request,response);                  
					//                    response.getWriter().println("</td>");
					//                    response.getWriter().println("</tr>");                   
					//                    response.getWriter().println("<tr><td>&nbsp;</td></tr>");                   
					//                    response.getWriter().println("</table>");
					//                    response.getWriter().println("</td>");
					//                    response.getWriter().println("<td bgcolor=#87B3D0 width=3></td>");           		
					//                    response.getWriter().println("<td bgcolor=#000000 width=1></td>");
					//                    response.getWriter().println("<td >&nbsp;</td>");
					//                    response.getWriter().println("</tr>");                    
					//                    response.getWriter().println("</table>");
					//                    response.getWriter().println("<input type=hidden id=radioChangeFlag value=0 />");
					//                    response.getWriter().println("<input type=hidden name=participantStatus value=3 />");
					//                    response.getWriter().println("<input type=hidden name=scrollPos value=0></input>");
					//                    response.getWriter().println("</form>");
				}else{
					if(request.getAttribute("attachFile")!=null){
						response.getWriter().println("<form action=\"ImportStudyNotesServlet\" method=\"post\" enctype=\"multipart/form-data\">");
					}else if(request.getSession().getAttribute("importJHs")!=null){
						response.getWriter().println("<form action=\"ImportExcelJobHistoriesServlet\" method=\"post\" enctype=\"multipart/form-data\">");
					}else if (request.getAttribute("runWizard")!=null){
						//response.getWriter().println("<form>");
						response.getWriter().println(this.showWizard(request, response));
					}else{
						response.getWriter().println("<form action=\"ControllerServlet\" method=\"post\" id=controllerpost name=controllerpost>");
					}

					response.getWriter().println(" <table cellpadding=0 cellspacing=0 class=MainPage id=MainPage>");
					response.getWriter().println(" <tr>");
					response.getWriter().println(" <td align=center valign=top>");
					response.getWriter().println(" <table cellpadding=0 cellspacing=0 class=MainTable >");
					response.getWriter().println(" <tr height=80px> <!-- fixed height to stop resize -->");
					response.getWriter().println(" <td colspan=3 valign=top> ");
					response.getWriter().println(" <!-- Header -->");										 
					this.showHeaderMenu(request, response, iLocation);
					response.getWriter().println(" </td>");
					response.getWriter().println(" </tr>");
					response.getWriter().println(" <tr>");
					response.getWriter().println(" <td width=10px>&nbsp;</td> ");
					response.getWriter().println(" <td valign=top> ");
					response.getWriter().println(" <table class=Content><tr>");										 
					response.getWriter().println(" <td valign=top class=LHSMenu  >");
					response.getWriter().println(" <!-- Menu -->	");
					this.showLHSMenu(request, response, iLocation);											
					response.getWriter().println(" </td>");
					response.getWriter().println(" <td valign=top class=Content>");
					response.getWriter().println(" <!-- Contents -->");					
					this.showMainTable(request, response, iLocation);						
					response.getWriter().println(" </td>");
					response.getWriter().println(" </tr></table>");
					response.getWriter().println(" </td>");
					response.getWriter().println(" <td width=10px>&nbsp;</td> ");
					response.getWriter().println(" </tr>");
					response.getWriter().println(" </table>");
					response.getWriter().println(" </td> ");		
					response.getWriter().println(" </tr>");					
					response.getWriter().println("<!-- Floating Action Button Menu -->");
					boolean bShowActionButtons = true;
					if (request.getAttribute("printView") != null) {
						iLocation = 3;//Set to print screen location						
					}					
					if(request.getSession().getAttribute("MinActionButtons")!=null){
						bShowActionButtons = false;	
					}
					if(bShowActionButtons){
						if (request.getAttribute("printView") == null) {
							response.getWriter().println("<tr>");
							response.getWriter().println("<td valign=top class=ContentTableActionButtons >");
							response.getWriter().println(this.showActionButtons(request, iLocation));
							response.getWriter().println(" </td> ");		
							response.getWriter().println(" </tr>");
						}
					}else{						
						response.getWriter().println("<tr>");
						response.getWriter().println("<td valign=top class=ContentTableActionButtons >");
						response.getWriter().println(this.showActionButtonsMinimized(request, iLocation));
						response.getWriter().println(" </td> ");		
						response.getWriter().println(" </tr>");												
					}
					response.getWriter().println(" </table> ");
					response.getWriter().println("<input type=hidden id=InterviewStatus value='" + request.getSession().getAttribute("InterviewStatus") + "' />");
					response.getWriter().println("</form>");
				} 
				
				}
				
			} else {
				response.getWriter().println("<form action='./ValidateServlet' method=post>");
				response.getWriter().println(" <table cellpadding=0 cellspacing=0 class=MainPage id=MainPage>");
				response.getWriter().println(" <tr>");
				response.getWriter().println(" <td align=center valign=top>");
				response.getWriter().println(" <table cellpadding=0 cellspacing=0 class=MainTable >");
				response.getWriter().println(" <tr height=80px> <!-- fixed height to stop resize -->");
				response.getWriter().println(" <td colspan=2 valign=top> ");
				response.getWriter().println(" <!-- Header -->");										 
				this.showTopMenu(request,response);
				response.getWriter().println(" </td>");
				response.getWriter().println(" </tr>");
				response.getWriter().println(" <tr>");
				response.getWriter().println(" <td valign=top align=center>");
				response.getWriter().println(" <!-- Contents -->");					
				this.showLogin(request, response);					
				response.getWriter().println(" </td>");
				response.getWriter().println(" </tr>");
				response.getWriter().println(" </table>");
				response.getWriter().println(" </td> ");		
				response.getWriter().println(" </tr>");
				response.getWriter().println(" </table> ");			
				response.getWriter().println("</form>");              
			}
		} catch (Throwable e) {
			e.printStackTrace();   
			String msg = e.getMessage();
			if(msg == null){
				msg = e.toString();
			}
			request.setAttribute("errorMessage", msg);
			RequestDispatcher dis = request.getRequestDispatcher("errorpage.jsp");
			dis.forward(request, response);
		}
	}
	//	private void showSelfAdministered(HttpServletRequest request, HttpServletResponse response) throws Exception {
	//		if (request.getSession().getAttribute("ParticipantID") != null) {
	//			InterviewManagementSystem ims = new InterviewManagementSystem();
	//        	//String participantId = request.getSession().getAttribute("ParticipantID").toString();
	//        	Participant p = new Participant(Long.valueOf(request.getSession().getAttribute("ParticipantID").toString()));     	
	//        	if((p.getStatusId().equalsIgnoreCase(ParticipantStatus.READYFORINTERVIEW))||(p.getStatusId().equalsIgnoreCase(ParticipantStatus.INTERVIEWINCOMPLETE))){
	//        		this.showSelfAdministreredInterview(request,response);
	//        	}else{	
	//        		response.getWriter().println(ims.showSelfAdministeredJobHistoryCalendar(p)); 
	//        	}    	
	//        }
	//	}
	private void showLHSMenu(HttpServletRequest request, HttpServletResponse response,int iLocation) throws Throwable {
		User user = (User)request.getSession().getAttribute("UserObject");
		if (request.getSession().getAttribute("participantPage") == null) {
			request.getSession().setAttribute("participantPage",1);
		}
		int participantPage = Integer.parseInt(request.getSession().getAttribute("participantPage").toString());			
		String studyID = "";
		InterviewManagementSystem ims = new InterviewManagementSystem();
		Study study = new Study();

		if (request.getSession().getAttribute("StudyID") != null) {
			studyID = request.getSession().getAttribute("StudyID").toString();
			study = new Study(studyID);
			response.getWriter().println(ims.showLHSMTabs("Study", false, study));
			study.setUserId(user.getId());
			if(iLocation==0){
				String jsmId = "";
				if (request.getSession().getAttribute("JSMId") != null) {
					jsmId = request.getSession().getAttribute("JSMId").toString();
				}	            
				response.getWriter().println(ims.showStudyWithJSMs(study, jsmId));	            
			}else if(iLocation==1){
				List<Participant> participants = new ArrayList<Participant>();
				String statusFilterId = "None";
				Long participantId = null;
				if (request.getSession().getAttribute("ParticipantID") != null) {
					String pId = request.getSession().getAttribute("ParticipantID").toString();
					if(!(pId.equalsIgnoreCase("New"))){
						participantId = Long.valueOf(pId);
					}

				}
				if (request.getSession().getAttribute("StatusFilter")!=null){
					statusFilterId = request.getSession().getAttribute("StatusFilter").toString();
				}				
				//If searching for text
				if (request.getSession().getAttribute("searchTxt") != null) {
					//Get the list of matching participants
					study = getSearchedParticipantList(request);
					//If the status filter is also selected
					if (!statusFilterId.equals("None")){
						//Filter the matching participants by status
						participants = study.filterParticipants(statusFilterId);
					}else{
						participants = study.getParticipants();
					}
					//If doing a time based search
				}else if (request.getSession().getAttribute("SearchPeriod") != null){
					//Get list of matching participants
					study = this.getUpdatedParticipantsForPeriod(request);
					//					If the status filter is also selected
					if (!statusFilterId.equals("None")){
						//						Filter the matching participants by status
						participants = study.filterParticipants(statusFilterId);
					}
					//If not searching then
				} else {
					//					If the status filter is selected 
					if(!statusFilterId.equals("None")){
						//Get participants matching status
						participants = study.filterParticipants(statusFilterId);
					}else{
						//						Otherwise just get the study participants
						participants = study.filterParticipants(ParticipantStatus.NONE);
					}
				} 
				response.getWriter().println(ims.showStudyWithParticipants(study,participants,participantId, participantPage, Integer.parseInt(request.getSession().getAttribute("PageSize").toString())));	
			}else if(iLocation==2){
				List<Participant> participants = new ArrayList<Participant>();
				String statusFilterId = "None";
				Long participantId = null;
				if (request.getSession().getAttribute("ParticipantID") != null) {
					participantId = Long.valueOf(request.getSession().getAttribute("ParticipantID").toString());		            	    	            	
				}
				if (request.getSession().getAttribute("StatusFilter")!=null){
					statusFilterId = request.getSession().getAttribute("StatusFilter").toString();
				}				
				//If searching for text
				if (request.getSession().getAttribute("searchTxt") != null) {
					//Get the list of matching participants
					study = getSearchedParticipantList(request);
					participants = study.getParticipants();
					//If the status filter is also selected
					if (!statusFilterId.equals("None")){
						//Filter the matching participants by status
						participants = study.filterParticipants(statusFilterId);
					}
					//If doing a time based search
				}else if (request.getSession().getAttribute("SearchPeriod") != null){
					//Get list of matching participants
					study = this.getUpdatedParticipantsForPeriod(request);
					//					If the status filter is also selected
					if (!statusFilterId.equals("None")){
						//						Filter the matching participants by status
						participants = study.filterParticipants(statusFilterId);
					}else{
						participants = study.getParticipants();
					}
					//If not searching then
				} else {
					//					If the status filter is selected 
					if(!statusFilterId.equals("None")){
						//Get participants matching status
						participants = study.filterParticipants(statusFilterId);
					}else{
						//						Otherwise just get the study participants
						participants = study.filterParticipants(ParticipantStatus.NONE);
					}
				} 
				response.getWriter().println(ims.showStudyWithParticipants(study,participants,participantId, participantPage, Integer.parseInt(request.getSession().getAttribute("PageSize").toString())));					
			}				
		}else {
			//No study selected
			response.getWriter().println(ims.showLHSMTabs("Study", false, null));
			ArrayList<Study> studies = study.getStudies(user.getId());           
			response.getWriter().println(ims.showStudies(studyID,studies));
		}		
	}
	private Study getSearchedParticipantList(HttpServletRequest request) throws Exception {
		//Searches participant name or reference number for matching string - Case insensitive
		Study study = null;
		if (request.getSession().getAttribute("StudyID") != null) {
			String studyID = request.getSession().getAttribute("StudyID").toString();
			study = new Study(studyID);
			String searchTxt = request.getSession().getAttribute("searchTxt").toString();
			study.searchParticipants(searchTxt);
		}
		return study;
	}	
	private Study getUpdatedParticipantsForPeriod(HttpServletRequest request) throws Exception{
		String period = request.getSession().getAttribute("SearchPeriod").toString();
		String studyID = request.getSession().getAttribute("StudyID").toString();
		Study study = new Study(studyID);
		String[] periodOptions = {"today", "week", "fortnight", "month"};
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
		//sql = "SELECT id FROM participant WHERE studyid = '" + studyID + "' AND lastupdated BETWEEN '" + fromDate.getDatabaseFormatDate() + "' and '" + toDate.getDatabaseFormatDate() + "' ORDER BY lastupdated DESC";
		//Participant participant = new Participant();
		study.searchParticipantsPeriod(fromDate,toDate);
		return study;
	}	
	private void showLogin(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String strUsername = "";
		String strPassword = "";
		String strError = "";
		String checked = "";
		if (request.getAttribute("username") != null) {
			strUsername = request.getAttribute("username").toString();
		}
		if (request.getAttribute("password") != null) {
			strPassword = request.getAttribute("password").toString();
		}
		if (request.getAttribute("error") != null) {
			strError = request.getAttribute("error").toString();
		}
		if (request.getAttribute("rememberme") != null) {
			checked = "checked";
		}
		InterviewManagementSystem ims = new InterviewManagementSystem();
		response.getWriter().println(ims.showLogin(strUsername,strPassword,checked,strError));
	}
	private void showMainTable(HttpServletRequest request, HttpServletResponse response,int iLocation) throws Throwable {
		response.getWriter().println("<table cellspacing=0 class=ContentTable>");
		response.getWriter().println("<tr>");
		response.getWriter().println("<td valign=top class=ContentTableMain>	");							
		response.getWriter().println("<div class=ProgressBar id=\"progressBar\" >Loading...</div>");
		response.getWriter().println("<div class=SaveSuccessful id=SaveSuccessful >Save Successful</div>");
		if (request.getAttribute("errorMessage") != null) {
			response.getWriter().println("<table border=0 ><tr><td></td><td><span class=isMandatory>"
					+ request.getAttribute("errorMessage")
					+ "</span></td></tr></table>");
		}	
		response.getWriter().println("<div class=MainDiv >");	
		//		 show body
		switch (iLocation) {
		case 0: { // studies
			this.showStudiesLocation(request,response);
			break;
		}
		case 1: { // job histories
			this.showJobHistoriesLocation(request,response);
			break;
		}
		case 2: { // interviews
			this.showInterviewLocation(request,response);
			break;
		}
		default: {
			response.getWriter().println("Error: Unknown Location");
		}
		}
		response.getWriter().println("</DIV>");
		response.getWriter().println("</td>");
		response.getWriter().println("</tr>");
		response.getWriter().println("</table>");
	}   
	private void showInterviewLocation(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ArrayList<Object> arrayL = new ArrayList<Object>();
		arrayL.add(request.getSession().getAttribute("PageURL").toString());
		if (request.getSession().getAttribute("participantPage") == null) {
			request.getSession().setAttribute("participantPage",1);
		}
		int participantPage = Integer.parseInt(request.getSession().getAttribute("participantPage").toString());
		InterviewManagementSystem ims = new InterviewManagementSystem();
		User user = (User) request.getSession().getAttribute("UserObject");
		if (request.getSession().getAttribute("StudyID") == null) {
			arrayL.add("Interviews");
			response.getWriter().println(ims.showNavTitle(arrayL));
			response.getWriter().println("<br><br><br><table><tr><td>Please choose a Study to view the Interviews</td></tr></table>");
		} else {
			Study study = new Study(request.getSession().getAttribute("StudyID").toString());        	
			arrayL.add(study);
			arrayL.add("Interviews");
			Participant participant = null; 
			if (request.getSession().getAttribute("ParticipantID") == null) {              
				response.getWriter().println(ims.showNavTitle(arrayL));
				List<Participant> participants = new ArrayList<Participant>();
				String statusFilterId = "None";
				//If there is search text get participant list conforming to search text
				if (request.getSession().getAttribute("StatusFilter") != null) {
					statusFilterId = request.getSession().getAttribute("StatusFilter").toString();
				}
				if (request.getSession().getAttribute("searchTxt") != null) {
					//Get the study participants matching the search criteria
					study = getSearchedParticipantList(request);
					//If the statusFilterId is not "None" then apply the status filter to the searched participants
					if (!statusFilterId.equals("None")){
						participants = study.filterParticipants(request.getSession().getAttribute("StatusFilter").toString());
					}else{
						participants = study.getParticipants();
					}
				}else if (request.getSession().getAttribute("SearchPeriod") != null){
					study = this.getUpdatedParticipantsForPeriod(request);
					if (!statusFilterId.equals("None")){
						participants = study.filterParticipants(statusFilterId);
					}else{
						participants = study.getParticipants();
					}
				}else{
					if(!statusFilterId.equals("None")){
						participants = study.filterParticipants(statusFilterId);
					}else{
						//		            	Otherwise default to none
						participants = study.filterParticipants(ParticipantStatus.NONE);
					}
				}    			
				response.getWriter().println(ims.showParticipants(participants,user, participantPage,statusFilterId, Integer.parseInt(request.getSession().getAttribute("PageSize").toString())));  
			} else {
				participant = new Participant(Long.valueOf(request.getSession().getAttribute("ParticipantID").toString()));
				arrayL.add(participant);
				ParticipantStatus status = new ParticipantStatus();   
				arrayL.add("Next");
				response.getWriter().println(ims.showNavTitle(arrayL));
				response.getWriter().println(ims.showParticipantDetails(participant));               	

				String jhid = "";
				if (request.getSession().getAttribute("JobHistoryID") == null) {
					if (request.getSession().getAttribute("ShowPrintInterviews") != null) {
						//Show all participant interviews print view
						response.getWriter().println(showAllParticipantInterviews(study, participant));
					}else{
					//show ready job histories
					response.getWriter().println(ims.showReadyJobHistories(jhid, study.getId(),participant));              	                   
					response.getWriter().println(ims.showParticipantCommentsStatus(participant, status.getParticipantInterviewStatuses()));  
					}
				} else {                	
					String jhID = request.getSession().getAttribute("JobHistoryID").toString();
					if(request.getSession().getAttribute("JSMID") != null) {
						String jsmId = request.getSession().getAttribute("JSMID").toString();
						FrozenJobSpecificModule fjsm = new FrozenJobSpecificModule(jsmId);
						Interview interview = participant.getInterview(fjsm.getId(),jhID);
						//show ready job histories
						response.getWriter().println(ims.showReadyJobHistories(jhID,study.getId(),participant));
						if(interview.getId().equalsIgnoreCase("")){//Show interview start button
							response.getWriter().println("<table><tr><td><a href=ControllerServlet?Action=StartInterview&frozenJSMID=" 
									+ fjsm.getId() + "&jobhistoryID="+jhID+ " onclick=\"return showProgress()\">Start</a></td></tr></table>");
						}else{
							boolean readonly = false;
							if(participant.getStatusId().equalsIgnoreCase(ParticipantStatus.READYFORASSESSMENT)){
								readonly = true;
							}
							//if in review mode
							//show Title bar with close option
							response.getWriter().println("<table style='width:100%;background:#17698B;'><tr class=windowTop><td align=center width=100%>Edit Interview</td><td>Close</td><td style='text-align: right;width:16px;'><input type=image src='ImageStream?ImageName=close.gif' name=closeEditI title='Close Edit Mode' height=16 width=16/></td></tr></table>");
							JobHistory jh = new JobHistory(interview.getJobHistoryId());
							fjsm.setInterviewId(interview.getId());
							response.getWriter().println(ims.showJSMStartNote(fjsm,jh));
							if(request.getSession().getAttribute("InterviewID")==null){
								request.getSession().setAttribute("InterviewID",interview.getId());
							}
							response.getWriter().println(ims.showAllQuestionsInterviewReview1(fjsm,interview.getId(),readonly,study));
							//                    		response.getWriter().println(ims.showAllQuestionsInterviewReview(fjsm.getQuestions(),interview.getId(),readonly));
						}                  	
					}else{
						//if in interview mode
						this.showInterview(request,response);
					}                  
				}              
			}
		}
	}
	//    private void showSelfAdministreredInterview(HttpServletRequest request, HttpServletResponse response) throws Exception {
	//    	String jhid = "";
	//    	if(request.getSession().getAttribute("JobHistoryID")!=null){
	//    		jhid = request.getSession().getAttribute("JobHistoryID").toString();
	//    	}
	//        InterviewManagementSystem ims = new InterviewManagementSystem();
	//        Participant participant = new Participant(Long.valueOf(request.getSession().getAttribute("ParticipantID").toString()));   
	//        Study study = new Study(request.getSession().getAttribute("StudyID").toString());
	//        response.getWriter().println(ims.showSelfAdministeredReadyJobHistories(jhid, study.getId(),participant));    
	//        if(request.getSession().getAttribute("JobHistoryID")!=null){
	//	        if (request.getSession().getAttribute("InterviewID") != null) {
	//	            String interviewId = request.getSession().getAttribute("InterviewID").toString();
	//	            JobHistory jh = new JobHistory(jhid);
	//	            Interview interview = new Interview(interviewId);
	//	            FrozenJobSpecificModule fjsm = new FrozenJobSpecificModule(interview.getFrozenJsmId());
	//				fjsm.setInterviewId(interviewId);
	//				response.getWriter().println("<table width=100% cellpadding=0 cellspacing=0>");
	//				response.getWriter().println("<tr class=ListHeader><td align=center><hr></td></tr>");
	//				response.getWriter().println("<tr class=ListHeader><td align=center>The following questions relating to your job <span style='color: #17698B'>"+jh.getJobDescription()+"</span> with <span style='color: #17698B'>"+jh.getEmployer()+"</span> in the year <span style='color: #17698B'>"+jh.getYearStarted()+"</span></td></tr>");
	//				response.getWriter().println("<tr class=ListHeader><td align=center><hr></td></tr>");
	//				response.getWriter().println("</table>");
	//				if (request.getSession().getAttribute("NextQuestion") != null) {
	//	                Question question = (Question)request.getSession().getAttribute("NextQuestion");
	//	                question.setInterviewID(interview.getId());
	//	                response.getWriter().println(ims.showSelfAdministeredInterviewQuestion(question,study));
	//	            } else {
	//	                if(request.getSession().getAttribute("Note")!=null){
	//	                	String strNote = request.getSession().getAttribute("Note").toString();
	//	                    
	//		                if(strNote.equalsIgnoreCase("End")){
	//	                        response.getWriter().println(ims.showJSMEndNote(jh));
	//	                        if(interview.getNote().equalsIgnoreCase("Finish")){
	//	                    		response.getWriter().println(ims.showInterviewsEndNote(study));
	//	                        }
	//	                    }else{
	//	                    	
	//	    					Question question = fjsm.getNextQuestion("");
	//	    	                question.setInterviewID(interview.getId());
	//	    	                response.getWriter().println(ims.showSelfAdministeredInterviewQuestion(question,study));
	//	                    }
	//	                }else if(request.getParameter("review")!=null){
	//	                	boolean readonly = false;
	//                		if(participant.getStatusId().equalsIgnoreCase(ParticipantStatus.READYFORASSESSMENT)){
	//                			readonly = false;
	//                        }
	//                		response.getWriter().println(ims.showAllQuestionsInterviewReview(fjsm.getQuestions(),interview.getId(),readonly));
	//	                }
	//	            }
	//	        }
	//        }
	//        if(participant.isFinishingAllInterviews()){
	//        	response.getWriter().println(ims.showSurveyLink(participant));
	//        }
	//    }
	private void showInterview(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String jhid = request.getSession().getAttribute("JobHistoryID").toString();
		InterviewManagementSystem ims = new InterviewManagementSystem();
		Participant participant = new Participant(Long.valueOf(request.getSession().getAttribute("ParticipantID").toString()));
		Study study = new Study(request.getSession().getAttribute("StudyID").toString());

		response.getWriter().println(ims.showReadyJobHistories(jhid,study.getId(),participant));

		//Show Title and close button when editing interview question
		if (request.getSession().getAttribute("InterviewStatus") != null){
			response.getWriter().println("<DIV id='Interview' class='" + request.getSession().getAttribute("InterviewStatus".toString()) + "'>");
		}
		response.getWriter().println("<table style='width:100%;background:#17698B;'><tr class=windowTop><td style='text-align:center;'>Edit Interview Question</td><td>Close</td><td style='text-align:right;width:16px;'><input type=image src='ImageStream?ImageName=close.gif' name=closeEditI title='Close Edit Mode' height=16 width=16/></td></tr></table>");			
		if (request.getSession().getAttribute("InterviewID") != null) {
			String interviewId = request.getSession().getAttribute("InterviewID").toString();
			JobHistory jh = new JobHistory(jhid);
			Interview interview = new Interview(interviewId);
			if (request.getSession().getAttribute("NextQuestion") != null) {
				Question question = (Question)request.getSession().getAttribute("NextQuestion");
				question.setInterviewID(interview.getId());
				boolean isReview = false;
				if(request.getSession().getAttribute("ReviewUpdate")!=null){
					isReview = true;
				}
				response.getWriter().println(ims.showJobHistoryInterview(jh, question,study,isReview));
			} else {
				if(request.getSession().getAttribute("Note")!=null){
					FrozenJobSpecificModule fjsm = new FrozenJobSpecificModule(interview.getFrozenJsmId());
					fjsm.setInterviewId(interviewId);
					String strNote = request.getSession().getAttribute("Note").toString();
					if(strNote.equalsIgnoreCase("Start")){
						if(interview.getNote().equalsIgnoreCase("Start")){
							response.getWriter().println(ims.showInterviewsStartNote(study));
						}
						response.getWriter().println(ims.showJSMStartNote(fjsm,jh));
					}else if(strNote.equalsIgnoreCase("End")){
						request.getSession().removeAttribute("InterviewStatus");
						response.getWriter().println(ims.showJSMEndNote(jh));
						if(interview.getNote().equalsIgnoreCase("Finish")){
							response.getWriter().println(ims.showInterviewsEndNote(study));
						}
						if(interview.getNote().equalsIgnoreCase("Incomplete")){
							response.getWriter().println(ims.showInterviewsIncompleteNote());
						}
						//ParticipantStatus status = new ParticipantStatus(); 
						//response.getWriter().println(ims.showParticipantCommentsStatus(participant, status.getParticipantInterviewStatuses()));         
					}
				}
			}
		}
	}

	private void showJobHistoriesLocation(HttpServletRequest request, HttpServletResponse response) throws Exception {       
		ArrayList<Object> arrayL = new ArrayList<Object>();
		boolean addOrEditParticipant = request.getSession().getAttribute("EditMode")!=null;
		boolean isNewParticipant = false;
		boolean aParticipantIsSelected = request.getSession().getAttribute("ParticipantID") != null;
		if (aParticipantIsSelected) {
			isNewParticipant = request.getSession().getAttribute("ParticipantID").toString().equalsIgnoreCase("New");
		}
		boolean addingJob = request.getSession().getAttribute("addJob") != null;
		boolean addingAddress = request.getSession().getAttribute("addAddress") != null;
		boolean allocatingJSMs = request.getSession().getAttribute("allocateJSMs") != null;
		arrayL.add(request.getSession().getAttribute("PageURL").toString());
		if (request.getSession().getAttribute("participantPage") == null) {
			request.getSession().setAttribute("participantPage",1);
		}
		int participantPage = Integer.parseInt(request.getSession().getAttribute("participantPage").toString());

		InterviewManagementSystem ims = new InterviewManagementSystem();
		if (request.getSession().getAttribute("StudyID") == null) {
			//no study selected
			arrayL.add("Job Calendars");
			response.getWriter().println(ims.showNavTitle(arrayL));
			response.getWriter().println("<br><br><br><table><tr><td>Please choose a Study to view the Job Calendars</td></tr></table>");
		} else {
			//study selected
			String studyId = request.getSession().getAttribute("StudyID").toString();
			Study study = new Study(studyId);
			arrayL.add(study);
			arrayL.add("Job Calendars");
			User user = (User) request.getSession().getAttribute("UserObject");
			if (request.getSession().getAttribute("importJHs") != null) {
				String importResult = "";
				if (request.getSession().getAttribute("ImportResult") != null) {
					importResult = request.getSession().getAttribute("ImportResult").toString();
				}
				arrayL.add("Import Job Histories");
				response.getWriter().println(ims.showNavTitle(arrayL));
				response.getWriter().println(ims.showImport("importJHs", importResult));
			}else{
				if (request.getSession().getAttribute("ParticipantID") == null) { 
					if(request.getAttribute("reports") != null){
						arrayL.add("Reports");
						response.getWriter().println(ims.showNavTitle(arrayL));
						response.getWriter().println(ims.showReportsJobHistories(study));
					}else{
						//  					no participant selected so show all participants in this study
						response.getWriter().println(ims.showNavTitle(arrayL));
						String statusFilterId = "None";
						List<Participant> participants = new ArrayList<Participant>();

						if (request.getSession().getAttribute("StatusFilter") != null) {
							statusFilterId = request.getSession().getAttribute("StatusFilter").toString();
						}
						//If there is search text get participant list conforming to search text
						if (request.getSession().getAttribute("searchTxt") != null) {
							//Get the study participants matching the search criteria
							study = getSearchedParticipantList(request);
							//If the statusFilterId is not "None" then apply the status filter to the searched participants

							if (!statusFilterId.equals("None")){
								participants = study.filterParticipants(request.getSession().getAttribute("StatusFilter").toString());
							}else{
								participants = study.getParticipants();
							}
						}else if (request.getSession().getAttribute("SearchPeriod") != null){
							study = this.getUpdatedParticipantsForPeriod(request);
							if (!statusFilterId.equals("None")){
								participants = study.filterParticipants(statusFilterId);
							}else{
								participants = study.getParticipants();
							}
						}else{
							if(!statusFilterId.equals("None")){
								participants = study.filterParticipants(statusFilterId);
							}else{
								//  							Otherwise default to none
								participants = study.filterParticipants(ParticipantStatus.NONE);
							}
						}
						response.getWriter().println(ims.showParticipants(participants,user, participantPage,statusFilterId, Integer.parseInt(request.getSession().getAttribute("PageSize").toString())));              
					}           	            
				}else{
					//a participant is selected
					Participant participant = null;
					if (addOrEditParticipant) {
						//participant = new Participant(Long.valueOf(request.getSession().getAttribute("ParticipantID").toString()));
						if(isNewParticipant){
							//adding a new participant
							participant = new Participant();
							arrayL.add("Add Participant");
							if(participant.getParticipantRefnum().equals("")){
								//new participant so auto set number
								participant.setAutoRefNumber(studyId);
							}   	                 	                                
							response.getWriter().println(ims.showNavTitle(arrayL));
							response.getWriter().println(ims.showParticipantJobHistoryCalendar(participant)); 

						}else{//is Existing participant
							participant = new Participant(Long.valueOf(request.getSession().getAttribute("ParticipantID").toString()));
							arrayL.add(participant);

							if (addingJob) {//show job details
								JobHistory jh = null;
								if (request.getSession().getAttribute("JobHistory") != null) {
									jh = (JobHistory)request.getSession().getAttribute("JobHistory");
									if (request.getSession().getAttribute("FormErrors") != null) {
										jh.setErrorMessage(request.getSession().getAttribute("FormErrors").toString());
									}
								}else{
									jh = new JobHistory();
									int iCount = participant.getJobHistories().size();
									jh.setReferenceNumber("J"+iCount);
								}
								arrayL.add("Add Job");
								response.getWriter().println(ims.showNavTitle(arrayL));
								response.getWriter().println(ims.showAddJob(participant, jh));
							}else if (addingAddress) {//show address details
								Address address = null;
								if (request.getSession().getAttribute("Address") != null) {
									address = (Address)request.getSession().getAttribute("Address");
								}else{
									address = new Address();
									int iCount = participant.getAddresses().size()+1;
									address.setArea("R"+iCount);
								}
								arrayL.add("Add Address");
								response.getWriter().println(ims.showNavTitle(arrayL));
								response.getWriter().println(ims.showAddAddress(participant, address));
							}else{//Show the participant details

								if (request.getSession().getAttribute("FormErrors") != null) {
									participant.setErrorMessage(request.getSession().getAttribute("FormErrors").toString());
								}
								response.getWriter().println(ims.showNavTitle(arrayL));
								response.getWriter().println(ims.showParticipantJobHistoryCalendar(participant)); 
							}
							//							else if(request.getAttribute("Mapping")!=null){
							//							//mapping the jobtitles 
							//							if(request.getSession().getAttribute("JobHistoryID")!= null){	 
							//								String jhid = request.getSession().getAttribute("JobHistoryID").toString();
							//								JobHistory jh = new JobHistory(jhid);
							//								ArrayList<JobTitle> jobs = null;
							//								if(request.getAttribute("jobs")!=null){
							//									jobs = (ArrayList<JobTitle>)request.getAttribute("jobs");
							//								}
							//								arrayL.add("JSM Mapping");
							//								response.getWriter().println(ims.showNavTitle(arrayL));
							//								response.getWriter().println(ims.showMappingJob(jh,jobs)); 
							//							}	
							//						}
						}
						/*if(request.getAttribute("EditMode")!=null){
						//edit mode selected so show edit page
						if(participant.getParticipantRefnum().equals("")){
							//new participant so auto set number
							participant.setAutoRefNumber(studyId);
						}   	                 	                                
						arrayL.add("Edit");
						response.getWriter().println(ims.showNavTitle(arrayL));
						response.getWriter().println(ims.showParticipantJobHistoryCalendar(participant)); 
					}else{ 
						if (request.getSession().getAttribute("addJob") == null && request.getSession().getAttribute("addaddress") == null) {
							//not edit mode so show status details
							arrayL.add("Next");
							response.getWriter().println(ims.showNavTitle(arrayL));
							response.getWriter().println(ims.showJobHistoryDetails(participant.getJobHistories("", true)));//, this.getJobHistoryData(participant)));	                
							ParticipantStatus status = new ParticipantStatus();
							List<ParticipantStatus> statuses = status.getParticipantJobHistoryStatuses();
							response.getWriter().println(ims.showParticipantCommentsStatus(participant, statuses));
						}
					}*/
					}else if (allocatingJSMs){//not edit mode so show status details
						arrayL.add("Next");
						participant = new Participant(Long.valueOf(request.getSession().getAttribute("ParticipantID").toString()));
						response.getWriter().println(ims.showNavTitle(arrayL));
						response.getWriter().println(ims.showJobHistoryDetails(participant.getJobHistories("", true)));//, this.getJobHistoryData(participant)));	                
						ParticipantStatus status = new ParticipantStatus();
						List<ParticipantStatus> statuses = status.getParticipantJobHistoryStatuses();
						response.getWriter().println(ims.showParticipantCommentsStatus(participant, statuses));
					}
				}
			}
		}
	}
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void showStudiesLocation(HttpServletRequest request, HttpServletResponse response) throws Exception {   	 
		ArrayList<Object> arrayL = new ArrayList<Object>();
		arrayL.add(request.getSession().getAttribute("PageURL").toString());
		InterviewManagementSystem ims = new InterviewManagementSystem();
		Study study = new Study();
		if (request.getSession().getAttribute("StudyID") == null) {
			arrayL.add("Studies");
			User user = (User)request.getSession().getAttribute("UserObject");
			List<Study> studies = study.getStudies(user.getId());                   
			if(request.getSession().getAttribute("EditMode") != null) {
				String error = "";
				if (request.getAttribute("duplicatestudyerror") != null) {
					Study duplicateStudy = new Study(request.getAttribute("duplicatestudyerror").toString());
					error = "Sorry the name '" + duplicateStudy.getName() + "' is already in use by the study whose description is " + duplicateStudy.getDescription();
				}
				arrayL.add("Add Study");
				response.getWriter().println(ims.showNavTitle(arrayL));
				response.getWriter().println(ims.showStudyEdit(study, error));
			}else{            	
				response.getWriter().println(ims.showNavTitle(arrayL));
				response.getWriter().println(ims.showTable("", studies, true,"studies", true));	
			}
		} else {
			study = new Study(request.getSession().getAttribute("StudyID").toString());
			arrayL.add(study);
			if(request.getSession().getAttribute("EditMode") != null) {
				String error = "";
				if (request.getAttribute("duplicatestudyerror") != null) {
					Study duplicateStudy = new Study(request.getAttribute("duplicatestudyerror").toString());
					error = "Sorry the name '" + duplicateStudy.getName() + "' is already in use by the study whose description is " + duplicateStudy.getDescription();
				}
				arrayL.add("Edit Study");
				response.getWriter().println(ims.showNavTitle(arrayL));
				response.getWriter().println(ims.showStudyEdit(study, error));
			}else if(request.getAttribute("optionsMode") != null) {
				arrayL.add("Study Options");
				String strSearch = "";
				ArrayList<User> searchedUsers = null;
				if (request.getSession().getAttribute("Search") != null) {
					strSearch = request.getSession().getAttribute("Search").toString();
				}
				if (request.getSession().getAttribute("searchedusers") != null) {
					searchedUsers = (ArrayList<User>)request.getSession().getAttribute("searchedusers");
				}
				response.getWriter().println(ims.showNavTitle(arrayL));
				response.getWriter().println(ims.showStudyOptions(study, strSearch, searchedUsers, false));
			}else if((request.getAttribute("agentsMode") != null)||(request.getParameter("agentsMode") != null)) {
				arrayL.add("Study Agents");
				response.getWriter().println(ims.showNavTitle(arrayL));           	            	
				boolean bPreviewMode = false;
				if((request.getAttribute("previewMode") != null)){
					bPreviewMode = true;
				}
				ArrayList<JobSpecificModule> excludedJSMs = new ArrayList<JobSpecificModule>();
				if((request.getSession().getAttribute("JsmsExcluded") != null)){		
					String jsmIDsExcluded = request.getSession().getAttribute("JsmsExcluded").toString();
					for(String id:jsmIDsExcluded.split(",")){
						JobSpecificModule jsm = new JobSpecificModule();
						jsm.setId(id);
						excludedJSMs.add(jsm);
					}
				}
				response.getWriter().println(ims.showStudyAgents(study,bPreviewMode,excludedJSMs));				 
			}else if((request.getAttribute("JsmsMode") != null)||(request.getParameter("JsmsMode") != null)) {
				arrayL.add("Study JSMs");
				response.getWriter().println(ims.showNavTitle(arrayL));
				if(request.getSession().getAttribute("InProgress")!=null){

					String message = "";
					if(request.getSession().getAttribute("freezeJSMs") != null){
						message = "Your Study Specific JSMs are beeing frozen so they may be used for interviews.<br>Once complete you may view them <a href=main.jsp?JsmsMode=true>here</a>";
					}else{
						message = "Your Study Specific JSMs are being created, " +
						"you may navigate to the <a href=../Questionnaire/>Questionnaire Management System</a> " +
						"to make any required updates before you <a href=main.jsp?JsmsMode=true>freeze</a> them.";
					}					
					response.getWriter().println(ims.showProgressBar(message));
				}else{
					response.getWriter().println(ims.showStudyJsms(study));
				}           	
			}else if (request.getAttribute("editStudyNote")!= null){
				arrayL.add("Edit Study Note");
				response.getWriter().println(ims.showNavTitle(arrayL));
				response.getWriter().println(ims.showEditStudyNotes(study.getStudyNotes()));            		
			}else if(request.getAttribute("attachFile")!= null) {
				arrayL.add("Attach File");
				response.getWriter().println(ims.showNavTitle(arrayL));
				response.getWriter().println(ims.showImport("", ""));            		
			}else{       		
				//inserted
				if (request.getSession().getAttribute("JSMID") != null) {
					String jsmID = request.getSession().getAttribute("JSMID").toString();               	
					if(request.getParameter("isFrozen")!=null){               		
						FrozenJobSpecificModule fjsm = new FrozenJobSpecificModule(jsmID);                		
						arrayL.add(fjsm);               		              		
						response.getWriter().println(ims.showNavTitle(arrayL));
						response.getWriter().println(ims.showStructuredJSM(fjsm,study));
					}else{
						JobSpecificModule jsm = new JobSpecificModule(jsmID);
						arrayL.add(jsm);                 		
						ArrayList minimisedQuestionIds = new ArrayList();
						if (request.getSession().getAttribute("minimisedQuestionIds") != null) {
							minimisedQuestionIds = (ArrayList) request.getSession().getAttribute("minimisedQuestionIds");
							jsm.setShowHideQuestionsAnswers(minimisedQuestionIds);
						}
						response.getWriter().println(ims.showNavTitle(arrayL));
						response.getWriter().println(ims.showStructuredJSM(jsm)); 
					}              	
				}else{
					response.getWriter().println(ims.showNavTitle(arrayL));
					response.getWriter().println(ims.showStudy(study, false));
				}      		
			}
		}
	}   
	private int getLocationInt(String strLocation) {
		int iRetValue = 0;
		if (strLocation.equalsIgnoreCase("Studies")) {
			iRetValue = 0;
		} else if (strLocation.equalsIgnoreCase("Job_Calendars")) {
			iRetValue = 1;
		} else if (strLocation.equalsIgnoreCase("Interviews")) {
			iRetValue = 2;
		}else if (strLocation.equalsIgnoreCase("Participant")) {
			iRetValue = 3;
		}else if (strLocation.equalsIgnoreCase("Roles")) {
			iRetValue = 4;
		}
		return iRetValue;
	}
	public void showTopMenu(HttpServletRequest request,HttpServletResponse response) throws Exception{   
		User user = new User();
		if (request.getSession().getAttribute("UserObject") != null) {
			user = (User)request.getSession().getAttribute("UserObject");
		}
		String prefix = "";
		try{
			InitialContext initCtx= new InitialContext();
			Context envCtx = (Context)initCtx.lookup("java:comp/env");
			prefix = (String)envCtx.lookup("webprefix");
		}catch(Exception e){

		} 
		response.getWriter().println("<table cellspacing=0 cellpadding=0 class=TopMenu>");
		response.getWriter().println("<tr><td>&nbsp;</td><td class=small style='color:black;'>Welcome "+user.getUserName()+"</td><td>&nbsp;</td><td>&nbsp;</td><td>&nbsp;</td><td>&nbsp;</td><td>&nbsp;</td><td rowspan=2 class=topmenu align=right title='"+HTMLObject.getSystemVersion()+"'><a href=http://www.occideas.org target=_top onclick=\"return showProgress()\"><img src='ImageStream?ImageName=OccIDEAS.jpg' border=0></img></a></td></tr>");
		response.getWriter().println("<tr>");
		if(user.hasPermission(User.Permission.QUESTIONNAIRELOGIN)){
			response.getWriter().println("<td width=5px >&nbsp;</td><td valign=center background='ImageStream?ImageName=mainTabUnselected.gif' align=center width=200px ><a class=TopMenu href=../"+prefix+"Questionnaire/ValidateServlet?sid="+request.getSession().getId()+"&u="+user.getEncryptedId()+"&p="+user.getPassword()+" target=_top onclick=\"return showProgress()\">Questionnaire</a></td>");			
		}
		response.getWriter().println("<td  width=5px>&nbsp;</td><td  valign=center background='ImageStream?ImageName=mainTab.gif' width=200px align=center >Studies</td>");

		if(user.hasPermission(User.Permission.ASSESSMENTLOGIN)){			
			response.getWriter().println("<td  width=5px>&nbsp;</td><td  valign=center align=center background='ImageStream?ImageName=mainTabUnselected.gif' width=200px><a class=TopMenu href=../"+prefix+"Assessment/ValidateServlet?sid="+request.getSession().getId()+"&u="+user.getEncryptedId()+"&p="+user.getPassword()+" target=_top onclick=\"return showProgress()\">Assessment</a></td><td  width=180px>&nbsp;</td>");
		}
		response.getWriter().println("</tr>");
		response.getWriter().println("</table>");
	}		
	private void showHeaderMenu(HttpServletRequest request, HttpServletResponse response,int iLocation) throws Exception { 
		//show the top blue system tabs
		this.showTopMenu(request,response);

		response.getWriter().println("<table cellspacing=0 cellpadding=0 width=100%>");
		response.getWriter().println("<tr><td width=100% height=5px class=topCurves colspan=10></td></tr>");
		response.getWriter().println("<tr>");
		response.getWriter().println("<td width=50px >&nbsp;</td>");

		boolean showSearch = false;
		if ((iLocation == 1 || iLocation == 2) && request.getSession().getAttribute("StudyID") != null){
			showSearch = true;
		}
		String strSearchTableData = "";       
		if (showSearch) {			
			String strSearch = "";
			String timeBased = "false";
			String s1="",s2="",s3="",s4="";
			if (request.getSession().getAttribute("searchTxt") != null) {
				strSearch = request.getSession().getAttribute("searchTxt").toString();
			}
			if (request.getSession().getAttribute("Timebased") != null) {// A time based search
				timeBased = request.getSession().getAttribute("Timebased").toString();
			}
			if (request.getSession().getAttribute("SearchPeriod") != null){
				String searchPeriod = request.getSession().getAttribute("SearchPeriod").toString();
				if (searchPeriod.equals("today")){s1 = " selected ";}
				if (searchPeriod.equals("week")){s2 = " selected ";}
				if (searchPeriod.equals("fortnight")){s3 = " selected ";}
				if (searchPeriod.equals("month")){s4 = " selected ";}
			}
			if (timeBased.equals("true")) {
				strSearchTableData = "<td class=SearchButton align=right style='padding-right:10px;'><table cellpadding=0 cellspacing=0><tr><td><a style='font-size:80%;color:white'>Search Last Updated </a>" +
				"<input type='image' src='ImageStream?ImageName=calendar_day_red.gif' title='Time Based Search is ON' width='14' height='14' name='time'></input>" +
				"<select name='SelectPeriod'>" +
				"<option " + s1 + "value='today'>Today</option>" + 
				"<option " + s2 + "value='week'>This Week</option>" + 
				"<option " + s3 + "value='fortnight'>This Fortnight</option>" + 
				"<option " + s4 + "value='month'>This Month</option>" + 
				"</select>" +
				"</td><td style='background-color:white;' title='Search'><input type=image src='ImageStream?ImageName=search.gif' name=Search alt='Search' onclick=\"showProgress()\" ></input>" +
				"</td><td style='background-color:white;' title='Clear Search'><input type=image src='ImageStream?ImageName=clearsearch.gif' name=Clear alt='Clear'></input></td></tr></table></td>";
			} else {
				if(strSearch.trim().equalsIgnoreCase("")){
					strSearch = "Participant Search";
				}
				strSearchTableData = "<td class=SearchButton align=right style='padding-right:10px;'><table cellpadding=0 cellspacing=0><tr><td><a style='font-size:80%;color:white'>Search Last Updated </a>" +
				"<input type='image' src='ImageStream?ImageName=calendar_day.gif' title='Time Based Search is OFF' width='14' height='14' name='time'></input>" +
				"<input type=text size=20 name=searchTxt value='" + strSearch + "' onfocus=\"clearText(this);\"></input>" +
				"</td><td style='background-color:white;' title='Search'><input type=image src='ImageStream?ImageName=search.gif' name=Search alt='Search' onclick=\"showProgress()\" ></input>" +
				"</td><td style='background-color:white;' title='Clear Search'><input type=image src='ImageStream?ImageName=clearsearch.gif' name=Clear alt='Clear'></input></td></tr></table></td>";
			}
		}else{
			strSearchTableData = "<td ></td>";
		}

		String[] list = new String[3];
		list[0] = "Studies";
		list[1] = "Job_Calendars";
		list[2] = "Interviews";
		response.getWriter().println("<td><table cellpadding=0 cellspacing=0><tr>");
		for (int i = 0; i < list.length; i++) {
			String strBackgroundImage = "";
			String linkClass = "class=TopMenu";
			if (iLocation == i) {               
				strBackgroundImage = "background='ImageStream?ImageName=locationTab.gif'";
				linkClass = "";
			}else{
				strBackgroundImage = "background='ImageStream?ImageName=locationTabUnselected.gif'";
			}
			String linkText = list[i];
			if(linkText.equalsIgnoreCase("Job_Calendars")){
				linkText = "Participants";
			}
			response.getWriter().println("<td class=YellowTab " + strBackgroundImage
					+ " align=center><a "+linkClass+" href=main.jsp?Location=" + list[i]
					                                                                  + " onclick=\"return showProgress()\">" + linkText + "</a>&nbsp;&nbsp;</td>");
			response.getWriter().println("<td width=2px >&nbsp;</td>");
		} 
		response.getWriter().println("</tr></table></td>");
		response.getWriter().println(strSearchTableData);       
		response.getWriter().println("</tr></table>");
	} 

	private String showActionButtonsMinimized(HttpServletRequest request, int iLocation) throws Exception {  	
		String strHTML = "";
		strHTML += "<div id=divActionButtons class=actionButtonsMinimised>";
		strHTML += "<table width=100%><tr><td align=center>";
		strHTML += "<div id=divActionButtonsBar class=actionButtonsBar>";
		strHTML += "<span class=actionButtons>Action Buttons</span><br/>";
		ActionButton maximize = new ActionButton("maximise","Show Action Buttons", "arrowopen.gif");
		maximize.setEnabled(true);
		strHTML += maximize.getTxtHTML();
		strHTML += "<input type=hidden name=Action value=ActionButton></input>";
		strHTML += "<input type=hidden name=scrollPos id=scrollPos value=0></input>";
		strHTML += "</div>";
		strHTML += "</td></tr></table>";
		strHTML += "</div>";
		return strHTML;
	}
	private String showActionButtons(HttpServletRequest request, int iLocation) throws Exception { 
		User user = (User)request.getSession().getAttribute("UserObject");

		String strHTML = "";
		strHTML += "<div id=divActionButtons class=actionButtons>";
		strHTML += "<table width=100%><tr><td align=center>";
		strHTML += "<div id=divActionButtonsBar class=actionButtonsBar>";
		strHTML += "<span class=actionButtons>Action Buttons</span><br/>";
		ActionButton minimize = new ActionButton("minimise","Hide Action Buttons", "arrowclose.gif");
		minimize.setEnabled(true);
		strHTML += minimize.getTxtHTML();
		switch (iLocation) {
		case 0: { // studies       	
			ActionButton saveStudy = new ActionButton("saveStudy","Save Study", "save.gif");
			ActionButton previewJSMs = new ActionButton("previewJSMs","Preview JSMs", "previewjsms.gif");
			ActionButton removeJSMs = new ActionButton("removeJSMs","Remove JSMs", "removejsms.gif");
			ActionButton createSSJSMs = new ActionButton("saveStudyAgents","Create Study Specific JSMs", "createssjsms.gif");
			ActionButton newStudy = new ActionButton("newStudy","New Study", "add.gif");
			ActionButton editStudy = new ActionButton("newStudy","Edit Study", "edit.gif");
			ActionButton studyDelete = new ActionButton("studyDelete","Delete Study", "delete.gif");
			ActionButton studyOptions = new ActionButton("studyOptions","Study Options", "studyoptions.gif");
			ActionButton studyAgents = new ActionButton("studyAgents","Study Agents", "studyagents.gif");
			ActionButton studyJsms = new ActionButton("studyJsms","Study JSMs", "studyjsms.gif");
			ActionButton saveStudyOptions = new ActionButton("saveStudyOptions","Save Study", "save.gif");
			ActionButton editStudyNotes = new ActionButton("editStudyNotes","Edit Study Notes", "studynotes.gif");
			ActionButton copyStudy = new ActionButton("copyStudy","Copy", "copy.gif");
			ActionButton attachFile = new ActionButton("attachFile","Attach File", "attach.gif");
			ActionButton deleteFile = new ActionButton("deleteFile","Delete File", "detach.gif");
			ActionButton printView = new ActionButton("printView","Print View", "print.gif");
			ActionButton reportToExcel = new ActionButton("toExcelInterviews","Report All Results", "toexcel.gif");
			ActionButton freezeJSMs = new ActionButton("freezeJSMs","Freeze JSMs", "freezejsms.gif");
			ActionButton frozenJSMDelete = new ActionButton("frozenJSMDelete","Delete Frozen JSM", "delete.gif");
			ActionButton startWizard = new ActionButton("startWizard","Start Study Wizard", "add.gif");

			if (request.getSession().getAttribute("StudyID") == null) {	
				if(request.getSession().getAttribute("EditMode") != null) {
					if(user.hasPermission(User.Permission.EDITSTUDY)) {
						saveStudy.setEnabled(true);
					}
					strHTML += saveStudy.getTxtHTML();

				}else{

					if(user.hasPermission(User.Permission.ADDSTUDY)) {
						newStudy.setEnabled(true);
						newStudy.setOnClick(" onclick=\"removeAllCheckBoxes();\"");
						startWizard.setEnabled(true);
					}
					strHTML += newStudy.getTxtHTML();
					strHTML += startWizard.getTxtHTML();
					if(user.hasPermission(User.Permission.EDITSTUDY)) {
						editStudy.setEnabled(true);
						editStudy.setOnClick(" onclick=\"return validateOnlyOneCheckBox();\"");
					}
					strHTML += editStudy.getTxtHTML();
					if(user.hasPermission(User.Permission.DELETESTUDY)){
						studyDelete.setEnabled(true);
						studyDelete.setOnClick(" onclick=\"return validateCheckBoxesConfirmDelete('Please select a record to delete','study');\"");
					}
					strHTML += studyDelete.getTxtHTML();
				}

				/*}else if (request.getSession().getAttribute("EditPublishedPage") != null) { 
            		if (user.hasPermission(User.Permission.EDITSTUDY)) {
            			savePublishedPage.setEnabled(true);
            		}
            		strHTML += savePublishedPage.getTxtHTML();*/
			} else {
				if(request.getAttribute("optionsMode") != null) {
					if (user.hasPermission(User.Permission.EDITSTUDY)) {
						saveStudyOptions.setEnabled(true);
						editStudyNotes.setEnabled(true);
					}
					strHTML += saveStudyOptions.getTxtHTML();
					strHTML += editStudyNotes.getTxtHTML();
					strHTML += copyStudy.getTxtHTML();
				}else if(request.getAttribute("agentsMode") != null) { 
					if (user.hasPermission(User.Permission.EDITSTUDY)) {
						previewJSMs.setEnabled(true);
						previewJSMs.setOnClick(" onclick=\"showProgress();\"");
					}
					if(request.getAttribute("previewMode")!= null){
						removeJSMs.setEnabled(true);
						strHTML += removeJSMs.getTxtHTML();
						createSSJSMs.setEnabled(true);
						createSSJSMs.setOnClick(" onclick=\"return confirm('Are you sure you would like to include all listed JSMs?  [All JSMS highlighted in red will not be included]'));\"");
						strHTML += createSSJSMs.getTxtHTML();
					}
					strHTML += previewJSMs.getTxtHTML();
					strHTML += ActionButton.getSelectAllTxtHTML();
				}else if((request.getAttribute("JsmsMode") != null)||(request.getParameter("JsmsMode") != null)) { 
					if (user.hasPermission(User.Permission.EDITSTUDY)) {
						freezeJSMs.setEnabled(true);
						freezeJSMs.setOnClick(" onclick=\"return validateCheckBoxes('Please choose a JSM to freeze')\"");
						frozenJSMDelete.setEnabled(true);
						//freezeJSMs.setOnClick(" onclick=\"return validateCheckBoxes('Please choose a JSM to freeze'); startPoll();\"");
					}
					strHTML += freezeJSMs.getTxtHTML();
					strHTML += frozenJSMDelete.getTxtHTML();
				}else if(request.getSession().getAttribute("EditMode") != null) { 
					//If in edit mode, show save and attach file action buttons
					if (user.hasPermission(User.Permission.EDITSTUDY)) {
						saveStudy.setEnabled(true);
					}
					strHTML += saveStudy.getTxtHTML();
				}else if(request.getAttribute("editStudyNote")!= null){
					if (user.hasPermission(User.Permission.EDITSTUDY)) {
						deleteFile.setEnabled(true);
						attachFile.setEnabled(true);
					}
					strHTML += deleteFile.getTxtHTML();
					strHTML += attachFile.getTxtHTML();
				}else if(request.getAttribute("attachFile")!= null){
					if (user.hasPermission(User.Permission.EDITSTUDY)) {
						attachFile.setEnabled(true);
					}
					strHTML += attachFile.getTxtHTML();
				}else if ((request.getParameter("jsmID") != null)||(request.getAttribute("jsmID") != null)){           		 
					printView.setEnabled(true);
					strHTML += printView.getTxtHTML();
					if(request.getParameter("isFrozen")!=null){ 
						reportToExcel.setOnClick(" onclick=\"return confirm('Warning:  The data generated in this report is raw data and should be subjected to integrity checks before use in analysis.  This may be a lengthy process depending on the size of your study.  If you are archiving, this process will continue to run even if the internet browser closed.');\"");
						reportToExcel.setEnabled(true);
						strHTML += reportToExcel.getTxtHTML();
					}
				}else {
					if (user.hasPermission(User.Permission.EDITSTUDY)) {
						studyOptions.setEnabled(true);
						studyJsms.setEnabled(true);               		
						if (request.getSession().getAttribute("StudyID") != null) {
							Study study = new Study(request.getSession().getAttribute("StudyID").toString());
							if(study.getStatusId().equalsIgnoreCase(StudyStatus.INITIALPHASE)){
								studyAgents.setEnabled(true);
							}
						}               		
						editStudy.setEnabled(true);
					}
					strHTML += studyOptions.getTxtHTML();
					strHTML += studyAgents.getTxtHTML();
					strHTML += studyJsms.getTxtHTML();
					strHTML += editStudy.getTxtHTML();
				}
			}
			break;
		}
		case 1: { // Participants
			ActionButton saveParticipant = new ActionButton("saveParticipant","Save Participant", "save.gif");
			ActionButton newParticipant = new ActionButton("newParticipant","New Participant", "newparticipant.gif");
			ActionButton editParticipant = new ActionButton("editParticipant","Edit Participant", "edit.gif");
			ActionButton participantDelete = new ActionButton("participantDelete","Delete", "delete.gif");
			//ActionButton importJHs = new ActionButton("importJHs","Import Job Histories", "map.gif");
			ActionButton SaveJobHistory = new ActionButton("SaveJobHistory","Save", "save.gif");
			//ActionButton importJHFile = new ActionButton("importJHFile","Upload File", "map.gif");
			ActionButton JobHistoryDelete = new ActionButton("JobHistoryDelete","Delete", "delete.gif");
			ActionButton deleteHistory = new ActionButton("deleteHistory","Delete History", "delete.gif");
			ActionButton newJob = new ActionButton("newJob","New Job", "newjob.gif");
			ActionButton saveJob = new ActionButton("saveJob","Save Job", "save.gif");
			ActionButton newAddress = new ActionButton("newAddress","New Address", "newaddress.gif");
			ActionButton saveAddress = new ActionButton("saveAddress","Save Address", "save.gif");
			ActionButton editHistory = new ActionButton("editHistory","Edit History", "edit.gif");
			ActionButton mapJSMs = new ActionButton("mapJSMs","Allocate JSMs", "allocatejsms.gif");
			ActionButton exportAllJhAddress = new ActionButton("exportAllJhAddress","Export All JH & Address", "export.gif");
			ActionButton exportJhAddress = new ActionButton("exportJhAddress","Export JH & Address", "export.gif");
			ActionButton toggleTranscript = new ActionButton("toggleTranscript","Toggle Transcript Sent", "save.gif");
			//			ActionButton reportToExcel = new ActionButton("toExcel","Report All Results", "toexcel.gif");
			//			ActionButton createReportJobHistory = new ActionButton("createReportJobHistory","Create a report now", "runreport.gif");
			//			ActionButton expParticipants = new ActionButton("expParticipants","Export Participants With Status", "toexcel.gif");

			if (request.getSession().getAttribute("StudyID") != null) {//study selected
				if (request.getSession().getAttribute("ParticipantID") != null) {//participant selected
					if (request.getSession().getAttribute("addJob")!=null) {//Add or Edit job history
						//newJob.setEnabled(true);
						//strHTML += newJob.getTxtHTML();
						saveJob.setEnabled(true);
						saveJob.setOnClick("onClick='return ValidateJobHistoryForm()'");
						strHTML += saveJob.getTxtHTML();
					}else if(request.getSession().getAttribute("addAddress")!=null){
						//newAddress.setEnabled(true);
						//strHTML += newAddress.getTxtHTML();
						saveAddress.setEnabled(true);
						saveAddress.setOnClick("onClick='return ValidateResidentialHistoryForm();ClearDirtyFlag()'");
						strHTML += saveAddress.getTxtHTML();

					}else{//Add or Edit participant
						if(request.getSession().getAttribute("EditMode")!=null){
							//newParticipant.setEnabled(true);
							//strHTML += newParticipant.getTxtHTML();
							saveParticipant.setEnabled(true);
							saveParticipant.setOnClick("onClick='return ValidateParticipantForm()'");
							strHTML += saveParticipant.getTxtHTML();
							if (!(request.getSession().getAttribute("ParticipantID").toString().equalsIgnoreCase("New"))){
								newAddress.setEnabled(true);
								strHTML += newAddress.getTxtHTML();							
								newJob.setEnabled(true);
								strHTML += newJob.getTxtHTML();
								editHistory.setEnabled(true);
								strHTML += editHistory.getTxtHTML();
								deleteHistory.setEnabled(true);
								strHTML += deleteHistory.getTxtHTML();
								exportJhAddress.setEnabled(true);
								strHTML += exportJhAddress.getTxtHTML();
								if(user.hasPermission(User.Permission.EDITJOBHISTORY)) {
									mapJSMs.setEnabled(true);
									strHTML += mapJSMs.getTxtHTML();
								}
							}	
						}else{
							if(user.hasPermission(User.Permission.EDITJOBHISTORY)) {
								editParticipant.setEnabled(true);
							}
							strHTML += editParticipant.getTxtHTML();
							if(user.hasPermission(User.Permission.EDITJOBHISTORY)){
								SaveJobHistory.setEnabled(true);
							}
							strHTML += SaveJobHistory.getTxtHTML();
							if(user.hasPermission(User.Permission.DELETEJOBHISTORY)) {
								JobHistoryDelete.setEnabled(true);
								JobHistoryDelete.setOnClick(" onclick=\"return validateCheckBoxesConfirmDelete('Please select a record to delete','job');\"");
							}
							strHTML += JobHistoryDelete.getTxtHTML();
						}       	
					}
				}else{//no participant selected
					newParticipant.setEnabled(true);
					strHTML += newParticipant.getTxtHTML();
					if(user.hasPermission(User.Permission.DELETEPARTICIPANT)) {
						participantDelete.setEnabled(true);
						participantDelete.setOnClick(" onclick=\"return validateCheckBoxesConfirmDelete('Please select a record to delete','participant');\"");
					}
					strHTML += participantDelete.getTxtHTML();
					exportAllJhAddress.setEnabled(true);
					strHTML += exportAllJhAddress.getTxtHTML();
					toggleTranscript.setEnabled(true);
					strHTML += toggleTranscript.getTxtHTML();
				}
			}
			break;
		}
		case 2: { // interview:
			ActionButton randomStudy = new ActionButton("randomStudy","Random Participants", "debug.gif");
			ActionButton saveParticipantStatus = new ActionButton("SaveParticipantStatus","Save", "save.gif");    		
			ActionButton expParticipants = new ActionButton("expParticipantsForInterviewers","Export Participants With Status", "toexcel.gif");
			ActionButton expAmrParticipants = new ActionButton("expParticipantsForAmr","Export Participants With Status for AMR Report", "toexcel.gif");
			ActionButton expAmrParticipantsQAss = new ActionButton("expParticipantsForAmrQAss","Export Participants with question assessments", "toexcel.gif");
			ActionButton printInterviews = new ActionButton("printInterviews","Print Interviews", "print.gif");
			if (request.getSession().getAttribute("StudyID") != null) {
				if(user.hasPermission(User.Permission.RANDOMSTUDY)) {
					randomStudy.setEnabled(true);
					strHTML += randomStudy.getTxtHTML();
				}  
				if (request.getSession().getAttribute("JobHistoryID") == null){
					expParticipants.setEnabled(true);
					strHTML += expParticipants.getTxtHTML();
					expAmrParticipants.setEnabled(true);
					strHTML += expAmrParticipants.getTxtHTML();
					expAmrParticipantsQAss.setEnabled(true);
					strHTML += expAmrParticipantsQAss.getTxtHTML();
				}
			}   		         
			if (request.getSession().getAttribute("ParticipantID") != null) {
				if(user.hasPermission(User.Permission.SAVEINTERVIEW)) {
					saveParticipantStatus.setEnabled(true);
				}
				if (request.getSession().getAttribute("JobHistoryID") == null){
					strHTML += saveParticipantStatus.getTxtHTML();            		
				}
				printInterviews.setEnabled(true);
				strHTML += printInterviews.getTxtHTML();
			}
			break;
		}
		case 3: {//print view:
			ActionButton printView = new ActionButton("printToWord","Print to Word", "print.gif");
			printView.setEnabled(true);
			strHTML += printView.getTxtHTML();
			break;
		}
		default: {
			strHTML += "";
		}
		}

		ActionButton logout = new ActionButton("logout","Log Out", "logout.gif");
		logout.setEnabled(true);
		strHTML += logout.getTxtHTML();

		strHTML += "<input type=hidden name=Action value=ActionButton></input>";
		strHTML += "<input type=hidden name=scrollPos id=scrollPos value=0></input>";
		strHTML += "</div>";
		strHTML += "</td></tr></table>";
		strHTML += "</div>";
		return strHTML;
	}
	private String showWizard(HttpServletRequest request, HttpServletResponse response){

		String retHtml = " <div id='study_wiz' class='runwiz'>";
		retHtml += "<table><tr><td colspan=4>";
		retHtml += "Study Wizard";
		retHtml += "</td></tr><tr><td colspan=4>";
		retHtml += "Step <input type='text' size='1' id='wizardStep' disabled value='" + request.getAttribute("wizardStep") + "'></input> of 7";
		retHtml += "</td></tr><tr class='wizardStepsRow'><td colspan=4>";
		retHtml += "<div id='wizardStepContent'>";
		//Wizard Step Content
		retHtml += "<table><tr><td>Study Name</td></tr><tr><td>";
		retHtml += "<input type=text id='studyName' autocomplete='off'></input>";
		retHtml += "</td></tr></table>";
		retHtml += "</div>";
		retHtml += "</td></tr><tr><td colspan=4>";
		retHtml += "<span id='userMessage'>Messages</span>";
		retHtml += "</td></tr><tr><td>";
		//retHtml += "<input type=button id='back_btn' value='<' onclick='backForm()'></input>";
		retHtml += "&nbsp;</td><td>";
		retHtml += "<input type='button' id='save_btn' value='Save' onclick='saveForm()'></input>";
		retHtml += "</td><td>";
		retHtml += "<input type=button id='next_btn' value='>' onclick='nextForm()' disabled></input>";
		retHtml += "</td><td>";
		retHtml += "<input type=button id='finish_btn' value='Finish' onclick=\"return finishForm()\"></input>";
		retHtml += "</td></tr></table>";
		retHtml += "</div>";
		return retHtml;
	}

	public String showAllParticipantInterviews(Study study, Participant participant) throws Exception{
		//boolean readonly = true;
		String htmlText = "";
		InterviewManagementSystem ims = new InterviewManagementSystem();

		//show Title bar with close option
		htmlText += "<table style='width:100%;background:#17698B;'><tr class=windowTop><td align=center width=100%>View All Participant Interviews</td></tr></table>";
		for (JobHistory jobHistory: participant.getJobHistories()) {
			List<Interview> interviews = jobHistory.getInterviews();
			for (Interview interview: interviews) {
				FrozenJobSpecificModule fjsm = new FrozenJobSpecificModule(interview.getFrozenJsmId());
				htmlText += "<table style='width:100%;background:#17698B;'><tr class=windowTop><td align=center width=100%>" + fjsm.getName() + "</td></tr></table>";
				htmlText += ims.showAllQuestionsInterviewReviewFull(fjsm, interview.getId());
			}


		}

		return htmlText;
	}
}






