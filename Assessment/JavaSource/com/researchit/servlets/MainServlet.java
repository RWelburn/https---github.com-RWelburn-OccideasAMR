/**
 * Revisions:
 *     $Log: MainServlet.java,v $
 *     Revision 1.172  2009/05/27 02:00:08  troy.sadkowsky
 *     bug fix 814 3cat frequency hours
 *
 *     Revision 1.171  2009/04/27 03:19:36  troy.sadkowsky
 *     prefix comes from context tags
 *
 *     Revision 1.170  2009/03/09 07:27:38  troy.sadkowsky
 *     new prifix for demo apps
 *
 *     Revision 1.169  2009/03/06 01:12:36  troy.sadkowsky
 *     participant tracking updates
 *
 *     Revision 1.168  2009/02/23 05:55:32  troy.sadkowsky
 *     new button image for reports
 *
 *     Revision 1.167  2009/02/19 03:31:11  troy.sadkowsky
 *     archive report functions
 *
 *     Revision 1.166  2009/02/04 22:33:30  troy.sadkowsky
 *     New report functions
 *
 *     Revision 1.165  2009/01/21 08:42:22  troy.sadkowsky
 *     show and hide action bar
 *
 *     Revision 1.164  2009/01/21 08:28:29  troy.sadkowsky
 *     bug fix for save assessment
 *
 *     Revision 1.163  2009/01/07 05:51:51  troy.sadkowsky
 *     more v2 updates
 *
 *     Revision 1.162  2009/01/06 07:42:35  troy.sadkowsky
 *     v2 updates
 *
 *     Revision 1.161  2009/01/05 06:52:17  troy.sadkowsky
 *     progress bar updates
 *
 *     Revision 1.160  2008/12/30 00:11:58  troy.sadkowsky
 *     paging and speed enhancements
 *
 *     Revision 1.159  2008/12/29 02:46:20  troy.sadkowsky
 *     increased speed of participant lists
 *
 *     Revision 1.158  2008/12/23 10:33:23  troy.sadkowsky
 *     speed enhancements, linked jsms, progress bar
 *
 *     Revision 1.157  2008/12/22 04:06:16  troy.sadkowsky
 *     various updates
 *
 *     Revision 1.156  2008/12/20 02:06:57  troy.sadkowsky
 *     v2 updates
 *
 *     Revision 1.155  2008/12/17 03:58:32  ray.welburn
 *     New title bars and coles buttons added
 *
 *     Revision 1.154  2008/12/11 15:32:26  ray.welburn
 *     Add cookies for login
 *
 *     Revision 1.153  2008/11/25 23:27:48  troy.sadkowsky
 *     Assessment report updates
 *
 *     Revision 1.152  2008/11/15 09:08:54  troy.sadkowsky
 *     various bug fixes and code cleaning
 *
 *     Revision 1.151  2008/11/14 09:15:10  troy.sadkowsky
 *     usability updates
 *
 *     Revision 1.150  2008/11/06 07:02:22  ray.welburn
 *     Add "Details >
 *     " the LHS menu when study selected
 *
 *     Revision 1.149  2008/11/05 06:32:55  Troy.Sadkowsky
 *     fixed filters and clear link
 *
 *     Revision 1.148  2008/11/04 06:42:12  ray.welburn
 *     Remove check box from assessment/studies
 *
 *     Revision 1.147  2008/10/27 22:57:22  troy.sadkowsky
 *     assessment updates
 *
 *     Revision 1.146  2008/10/20 06:17:54  Troy.Sadkowsky
 *     fixed default filter
 *
 *     Revision 1.145  2008/10/10 05:51:41  troy.sadkowsky
 *     permission level update
 *
 *     Revision 1.144  2008/10/03 02:56:25  troy.sadkowsky
 *     assessment updates
 *
 *     Revision 1.143  2008/09/24 12:15:19  troy.sadkowsky
 *     demo ready
 *
 *     Revision 1.142  2008/09/20 08:59:43  troy.sadkowsky
 *     new assessment updates
 *
 *     Revision 1.141  2008/09/15 03:07:17  troy.sadkowsky
 *     new filter capabiities
 *
 *     Revision 1.140  2008/09/12 02:38:30  troy.sadkowsky
 *     ASsessment report updates
 *
 *     Revision 1.139  2008/09/11 02:47:16  troy.sadkowsky
 *     only show jhs that are ready for assessments
 *
 *     Revision 1.138  2008/09/10 09:09:59  troy.sadkowsky
 *     assessment updates
 *
 *     Revision 1.137  2008/08/25 01:36:05  ray.welburn
 *     Updates to use single dbobject and participant status table
 *
 *     Revision 1.136  2008/08/20 03:38:48  troy.sadkowsky
 *     assessment updates
 *
 *     Revision 1.135  2008/08/13 04:18:29  troy.sadkowsky
 *     assessment review updates
 *
 *     Revision 1.134  2008/08/11 01:46:29  ray.welburn
 *     move study object to common package
 *
 *     Revision 1.133  2008/08/11 00:45:22  troy.sadkowsky
 *     rearrange assessment yellow tabs
 *
 *     Revision 1.132  2008/08/05 00:35:46  ray.welburn
 *     Use session for progress bar
 *
 *     Revision 1.131  2008/08/02 06:17:45  troy.sadkowsky
 *     renamed yellow tabs
 *
 *     Revision 1.130  2008/07/24 12:06:38  ray.welburn
 *     Studies now selected where study option useoccideas set
 *
 *     Revision 1.129  2008/07/23 00:13:56  troy.sadkowsky
 *     new jh tab
 *
 *     Revision 1.128  2008/07/05 03:33:08  troy.sadkowsky
 *     new previous button
 *
 *     Revision 1.127  2008/06/04 00:44:37  ray.welburn
 *     remove jsmid attribute when navigating away from assessment report page
 *
 *     Revision 1.126  2008/05/30 01:52:51  troy.sadkowsky
 *     removed old code
 *
 *     Revision 1.125  2008/05/22 02:08:08  ray.welburn
 *     Remove html errors from reports page
 *
 *     Revision 1.124  2008/05/18 12:20:06  troy.sadkowsky
 *     action button bar updates
 *
 *     Revision 1.123  2008/04/28 06:37:52  troy.sadkowsky
 *     export assessments to excel
 *
 *     Revision 1.122  2008/04/22 23:24:50  troy.sadkowsky
 *     new assessment requirements
 *
 *     Revision 1.121  2008/04/22 10:23:24  ray.welburn
 *     Navitle now consistant across locations
 *
 *     Revision 1.120  2008/04/15 22:59:11  troy.sadkowsky
 *     melb updates
 *
 *     Revision 1.119  2008/04/09 02:18:20  ray.welburn
 *     LHS tabs can now include an object name eg study name
 *
 *     Revision 1.118  2008/04/07 00:39:26  troy.sadkowsky
 *     fix for showing filtered questions in assessment
 *
 *     Revision 1.117  2008/04/06 03:40:29  ray.welburn
 *     Change  to Actionbuttons position
 *
 *     Revision 1.116  2008/04/04 00:19:13  ray.welburn
 *     New LHS tabs added
 *
 *     Revision 1.115  2008/04/01 14:38:15  troy.sadkowsky
 *     new report on studies page and new filter by jsm
 *
 *     Revision 1.114  2008/03/26 12:37:05  troy.sadkowsky
 *     show other interviews if more than one
 *
 *     Revision 1.113  2008/03/22 04:43:22  ray.welburn
 *     images from database applied to alll images
 *
 *     Revision 1.112  2008/03/13 06:08:02  ray.welburn
 *     Images from database now used
 *
 *     Revision 1.111  2008/03/13 01:44:53  ray.welburn
 *     Pages now use database images
 *
 *     Revision 1.110  2008/03/13 01:14:23  troy.sadkowsky
 *     minor fix action buttons
 *
 *     Revision 1.109  2008/03/12 23:28:12  troy.sadkowsky
 *     move action buttons
 *
 *     Revision 1.108  2008/03/01 07:38:42  ray.welburn
 *     Modify how help navigaes to wiki
 *
 *     Revision 1.107  2008/02/08 07:39:08  troy.sadkowsky
 *     build v1.71 updates
 *
 *     Revision 1.106  2008/01/24 03:59:57  troy.sadkowsky
 *     minor style class fix
 *
 *     Revision 1.105  2008/01/13 21:22:18  troy.sadkowsky
 *     show with parent
 *
 *     Revision 1.104  2007/12/08 06:37:27  ray.welburn
 *     Changed icon and added title text to time based search
 *
 *     Revision 1.103  2007/12/08 02:43:02  ray.welburn
 *     Status Filter now works with timebased and text searches
 *
 *     Revision 1.102  2007/12/06 05:05:17  ray.welburn
 *     Add icon to times based search
 *
 *     Revision 1.101  2007/12/06 03:31:14  ray.welburn
 *     Add search updated text to time based search
 *
 *     Revision 1.100  2007/12/06 02:27:14  ray.welburn
 *     Added ability of users to change page size
 *
 *     Revision 1.99  2007/12/05 23:12:01  ray.welburn
 *     Added time based search
 *
 *     Revision 1.98  2007/11/24 06:26:26  troy.sadkowsky
 *     filter by participant status
 *
 *     Revision 1.97  2007/11/24 03:59:38  troy.sadkowsky
 *     filter by participant status
 *
 *     Revision 1.96  2007/11/16 04:09:53  troy.sadkowsky
 *     conflict fix and tidy up
 *
 *     Revision 1.95  2007/11/16 03:04:01  ray.welburn
 *     changes to search and paging functions
 *
 *     Revision 1.91  2007/11/09 05:18:22  troy.sadkowsky
 *     removed old code and jh statuses
 *
 *     Revision 1.90  2007/11/08 11:40:38  troy.sadkowsky
 *     show final assessment with colours
 *
 *     Revision 1.89  2007/11/08 06:49:28  troy.sadkowsky
 *     progress bar
 *
 *     Revision 1.88  2007/11/06 11:53:10  troy.sadkowsky
 *     next participant
 *
 *     Revision 1.87  2007/11/05 23:02:23  troy.sadkowsky
 *     statuses and next participants
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
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.researchit.Agent;
import com.researchit.Assessment;
import com.researchit.FrozenJobSpecificModule;
import com.researchit.Interview;
import com.researchit.JobHistory;
import com.researchit.JobHistoryStatus;
import com.researchit.JobSpecificModule;
import com.researchit.ParticipantStatus;
import com.researchit.PossibleAnswer;
import com.researchit.Question;
import com.researchit.User;
import com.researchit.Util;
import com.researchit.User.Permission;
import com.researchit.common.Participant;
import com.researchit.common.Study;
import com.researchit.expert.ExpertAgent;
import com.researchit.expert.ExpertRule;
import com.researchit.html.ActionButton;
import com.researchit.html.AssessmentSystem;
import com.researchit.html.HTMLObject;
import com.researchit.html.OccCalendar;

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
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
            if (request.getSession().getAttribute("UserObject") != null) {
    			User user = (User) request.getSession().getAttribute("UserObject");
    			if(user.getStudies().size()==1){
    				String studyId = user.getStudies().get(0).getId();
    				request.getSession().setAttribute("StudyID",studyId);
    			}
                // get the location
                String strLocation = "";
                if (request.getSession().getAttribute("PageSize") == null) {
                    request.getSession().setAttribute("PageSize", 100);
                    }
                if (request.getParameter("Location") != null) {
                    strLocation = request.getParameter("Location");
                    request.getSession().setAttribute("Location", strLocation);
                }
                if (request.getSession().getAttribute("Location") != null) {
                    strLocation = request.getSession().getAttribute("Location").toString();
                }
                int iLocation = this.getLocationInt(strLocation);
                response.getWriter().println("<form action=ControllerServlet method=post id=controllerpost>");
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
				response.getWriter().println("<tr>");
				response.getWriter().println("<td valign=top class=ContentTableActionButtons >");
				response.getWriter().println("<!-- Floating Action Button Menu -->");
				//boolean bShowActionButtons = true;
				//if(request.getSession().getAttribute("InProgress")!=null){
				//	bShowActionButtons = false;	
				//}
				if(request.getSession().getAttribute("MinActionButtons")!=null){
					response.getWriter().println(this.showActionButtonsMinimized(request, iLocation));		
				}else{
					response.getWriter().println(this.showActionButtons(request, iLocation));		
				}
				response.getWriter().println(" </td> ");		
				response.getWriter().println(" </tr>");

				response.getWriter().println(" </table> ");		
				response.getWriter().println("</form>");
            } else {
            	response.getWriter().println("<form action='./ValidateServlet' method=post>");
				response.getWriter().println(" <table cellpadding=0 cellspacing=0 class=MainPage>");
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
            request.setAttribute("errorMessage", e.getMessage());
            RequestDispatcher dis = request.getRequestDispatcher("errorpage.jsp");
            dis.forward(request, response);
        }
    }
    private void showLHSMenu(HttpServletRequest request, HttpServletResponse response, int iLocation) throws Exception {
    	String studyID = "";   	
		AssessmentSystem as = new AssessmentSystem();
		Study study = new Study();
		if (request.getSession().getAttribute("participantPage") == null) {
			request.getSession().setAttribute("participantPage",1);
		}
		int pageNumber = Integer.parseInt(request.getSession().getAttribute("participantPage").toString());
		int pageSize = 100;
		if(request.getSession().getAttribute("PageSize")!=null){
			pageSize = Integer.parseInt(request.getSession().getAttribute("PageSize").toString());
		}
		if (request.getSession().getAttribute("StudyID") != null) {
			studyID = request.getSession().getAttribute("StudyID").toString();
			study = new Study(studyID);		
			response.getWriter().println(as.showLHSMTabs("Study", false, study));
			JobHistory jh = new JobHistory();
            String jsmId = "";
			if (request.getSession().getAttribute("JSMID") != null) {
                jsmId = request.getSession().getAttribute("JSMID").toString();
            }
			String agentId = "";
            if (request.getSession().getAttribute("AgentID") != null) {
                agentId = request.getSession().getAttribute("AgentID").toString();
            }
			if(iLocation==0){	
				if(request.getSession().getAttribute("InProgress")!=null){
					response.getWriter().println("<table class=LHSMenuContent><tr><td>In Progress...</td></tr></table>");
				}else{
					//if (jsmId.equals("") && agentId.equals("")) {
					//	response.getWriter().println("<table class=LHSMenuContent><tr><td>Details &gt;</td></tr></table>");
					//}else{
					response.getWriter().println(as.showStudyWithJSMsAndAgents(study));
					//}
				}   	  
			}else if(iLocation==1){
				int totalPages = 0;
				if((request.getSession().getAttribute("StatusFilter")!=null)&&(!request.getSession().getAttribute("StatusFilter").toString().equalsIgnoreCase("None"))){							    		
					ArrayList<JobHistory> jhs =  new ArrayList<JobHistory>();  
					totalPages = Util.getTotalPagesFromPagedItems(jhs.size(), pageSize);
					ArrayList<JobHistory> jhs1 = new ArrayList<JobHistory>();
					if(request.getSession().getAttribute("StatusFilter")!=null){
						String jhStatus = request.getSession().getAttribute("StatusFilter").toString();
						jhs = study.getJobHistoriesForAssessment(Integer.valueOf(jhStatus));
						for(JobHistory jh1 : jhs){
	    					if(jh1.getStatusId().equalsIgnoreCase(jhStatus)){
	    						jhs1.add(jh1);
	    					}
	    				}
	    			}
					totalPages = Util.getTotalPagesFromPagedItems(jhs1.size(), pageSize);						            
				} else if((request.getSession().getAttribute("JSMID")!=null)&&(!request.getSession().getAttribute("JSMID").toString().equalsIgnoreCase("None"))){   			    							
					jsmId = request.getSession().getAttribute("JSMID").toString();	    			
					ArrayList<JobHistory> jhs = study.getJobHistoriesForAssessment(jsmId);   
					totalPages = Util.getTotalPagesFromPagedItems(jhs.size(), pageSize);						            
				}
				response.getWriter().println(as.showStudyWithJSMs(study,jsmId,pageSize,pageNumber, totalPages,true));	            									
			}else if(iLocation==2){
				if(request.getSession().getAttribute("StudyID").toString()!=null){
        			//studyId = request.getSession().getAttribute("StudyID").toString();
        			study = new Study(studyID);
        			if (request.getSession().getAttribute("AgentID") == null){
        				if(study.getAgents().size()>0){
        					agentId = study.getAgents().get(0).getId();
        					request.getSession().setAttribute("AgentID",agentId);
        				}
        			}
        		}
				String statusFilterId = "";	   
				String statusFilter = "";
		        if(request.getSession().getAttribute("StatusFilter")!=null){
		        	statusFilterId = request.getSession().getAttribute("StatusFilter").toString();
		        	if(!(statusFilterId.equalsIgnoreCase("None"))){
//		        		JobHistoryStatus  jhStatus = new JobHistoryStatus(statusFilterId); 	        		  
	            		statusFilter = " AND jobhistory.jobhistorystatusid = "+statusFilterId;
	            	}else{	
			        	statusFilter = "AND (jobhistory.jobhistorystatusid IN (2,3,4,5,6,7))";
		            }
		        }else{
		        	statusFilterId = JobHistoryStatus.INTERVIEWED;
//		        	JobHistoryStatus jhStatus = new JobHistoryStatus(statusFilterId);		        	
		        	statusFilter = " AND jobhistory.jobhistorystatusid = "+statusFilterId;
		        }
		        String jsmFilter = "";
	            String jsmFilterId = "None";
	            if(request.getSession().getAttribute("JSMFilter")!=null){
	            	jsmFilterId = request.getSession().getAttribute("JSMFilter").toString();
	            	if(!(jsmFilterId.equalsIgnoreCase("None"))){
	     //       		JobSpecificModule jsm = new JobSpecificModule(jsmFilterId);
		            		            	
		           		jsmFilter = " AND jobhistory.finaljsmid = "+jsmFilterId;
		            		            	
	            	}	
	            }
	            ArrayList<JobHistory> jhs = new ArrayList<JobHistory>();
	    		jhs = study.getJobHistoriesForAssessment(statusFilter, jsmFilter);    		     	       		        	        	
				int iTotalSize = jhs.size();
				response.getWriter().println(as.showStudyWithAgents(study, agentId,pageSize,pageNumber,iTotalSize));
			}else if(iLocation==3){
				if (request.getSession().getAttribute("AgentID") == null){
    				if(study.getAgents().size()>0){
    					agentId = study.getAgents().get(0).getId();
    					request.getSession().setAttribute("AgentID",agentId);
    				}
    			}
				Long participantId = null;		
				if (request.getSession().getAttribute("JobHistoryID") != null) {
	            	String jhId = request.getSession().getAttribute("JobHistoryID").toString();
	            	//participantId = request.getSession().getAttribute("ParticipantID").toString();
	            	Participant participant = new Participant(Long.valueOf(request.getSession().getAttribute("ParticipantID").toString()));
	            	jh = new JobHistory(jhId);
	            	ArrayList<Agent> agents = new ArrayList<Agent>();
	            	ArrayList<Agent> studyAgents = study.getAgents();	            	
            		if(!(jh.getFinalJSMId().equalsIgnoreCase("NULL"))){
            			if(!(jh.getStatusId().equalsIgnoreCase(JobHistoryStatus.NOTTOBEINTERVIEWEDSCOPE))){
    	            		JobSpecificModule jsm = new JobSpecificModule(jh.getFinalJSMId());
		            		for(Agent agent: jsm.getAgents()){
		            			if(studyAgents.contains(agent)){
		            				agents.add(agent);
		            				if(agentId.equalsIgnoreCase("")){
		            					agentId = agent.getId();
		            					request.getSession().setAttribute("AgentID",agentId);
		            				}
		            			}
			            	} 
		            		response.getWriter().println(as.showStudyWithJobHistoryAgents(study, participant,jh,agentId,agents));
    	            	} else{
    	            		response.getWriter().println(as.showStudyWithJobHistoryAgents(study, participant,jh,agentId,studyAgents));
    	            	}
	            	}else{     		            	
		            	response.getWriter().println(as.showStudyWithJobHistoryAgents(study, participant,jh,agentId,studyAgents));
	            	}		            		            		            	
	            }else {
	            	List<Participant> participants = new ArrayList<Participant>();
					String statusFilterId = "None";					
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
						//If the status filter is also selected
						if (!statusFilterId.equals("None")){
							//Filter the matching participants by status
							participants = study.filterParticipants(statusFilterId);
						}else{
//							Otherwise just get the study participants
							participants = study.filterParticipants(ParticipantStatus.NONE);
						}
						//If doing a time based search
					}else if (request.getSession().getAttribute("SearchPeriod") != null){
						//Get list of matching participants
						study = this.getUpdatedParticipantsForPeriod(request);
//						If the status filter is also selected
						if (!statusFilterId.equals("None")){
//							Filter the matching participants by status
							participants = study.filterParticipants(statusFilterId);
						}else{
//							Otherwise just get the study participants
							participants = study.filterParticipants(ParticipantStatus.NONE);
						}
						//If not searching then
					} else {
//						If the status filter is selected 
						if(!statusFilterId.equals("None")){
							//Get participants matching status
							participants = study.filterParticipants(statusFilterId);
						}else{
//							Otherwise just get the study participants
							participants = study.filterParticipants(ParticipantStatus.NONE);
						}
					} 
	            	response.getWriter().println(as.showStudyWithParticipants(study,participants,participantId, pageNumber, pageSize));
	            }									
			}
		}else {
			response.getWriter().println(as.showLHSMTabs("Study", false, null));
			User user = (User) request.getSession().getAttribute("UserObject");
			response.getWriter().println(as.showStudies(studyID,study.getStudies(user.getId())));
		}
	}
	private void showHeaderMenu(HttpServletRequest request, HttpServletResponse response,int iLocation) throws Exception {
        this.showTopMenu(request,response); 
        response.getWriter().println("<table cellspacing=0 cellpadding=0 width=100%>");
        response.getWriter().println("<tr><td width=100% height=5px class=topCurves colspan=10></td></tr>");
        response.getWriter().println("<tr>");
        response.getWriter().println("<td width=50px >&nbsp;</td>");
        String[] list = new String[4];
        
        boolean showSearch = false;
        String searchBox = "";
        if (iLocation == 3){showSearch = true;}		       
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
				searchBox = "<td class=SearchButton align=right style='padding-right:10px;'><table cellpadding=0 cellspacing=0><tr><td><a style='font-size:80%;color:white'>Search Lastupdated </a>" +
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
				searchBox = "<td class=SearchButton align=right style='padding-right:10px;'><table cellpadding=0 cellspacing=0><tr><td><a style='font-size:80%;color:white'>Search Lastupdated </a>" +
						"<input type='image' src='ImageStream?ImageName=calendar_day.gif' title='Time Based Search is OFF' width='14' height='14' name='time'></input>" +
						"<input type=text size=20 name=searchTxt value='" + strSearch + "' onfocus=\"clearText(this);\"></input>" +
						"</td><td style='background-color:white;' title='Search'><input type=image src='ImageStream?ImageName=search.gif' name=Search alt='Search' onclick=\"showProgress()\" ></input>" +
						"</td><td style='background-color:white;' title='Clear Search'><input type=image src='ImageStream?ImageName=clearsearch.gif' name=Clear alt='Clear'></input></td></tr></table></td>";
			}
		}
        list[0] = "Studies";
        list[1] = "Job_Histories";
        list[2] = "Agents";
        list[3] = "Participants";
        response.getWriter().println("<td ><table cellpadding=0 cellspacing=0><tr>");
        for (int i = 0; i < list.length; i++) {
            String strBackgroundImage = "";
            String linkClass = "class=TopMenu";
            if (iLocation == i) {               
                strBackgroundImage = "background='ImageStream?ImageName=locationTab.gif'";
                linkClass = "";
            }else{
            	strBackgroundImage = "background='ImageStream?ImageName=locationTabUnselected.gif'";
            }
            response.getWriter().println("<td class=YellowTab " + strBackgroundImage
                    + " align=center><a "+linkClass+" href=main.jsp?Location=" + list[i]
                    + ">" + list[i] + "</a>&nbsp;&nbsp;</td>");
            response.getWriter().println("<td width=2px >&nbsp;</td>");
        } 
        response.getWriter().println("</tr></table></td>");
        response.getWriter().println(searchBox); 
        response.getWriter().println("</tr></table>");
    }
    public void showTopMenu(HttpServletRequest request,HttpServletResponse response) throws Exception {
    	User user = new User();
    	String prefix = "";
    	try{
    		InitialContext initCtx= new InitialContext();
            Context envCtx = (Context)initCtx.lookup("java:comp/env");
            prefix = (String)envCtx.lookup("webprefix");
    	}catch(Exception e){
    		
    	}   	
		if (request.getSession().getAttribute("UserObject") != null) {
			user = (User)request.getSession().getAttribute("UserObject");
		}
    	response.getWriter().println("<table cellspacing=0 cellpadding=0 class=TopMenu>");
		response.getWriter().println("<tr><td>&nbsp;</td><td class=small style='color:black;'>Welcome "+user.getUserName()+"</td><td>&nbsp;</td><td>&nbsp;</td><td>&nbsp;</td><td>&nbsp;</td><td>&nbsp;</td><td rowspan=2 class=topmenu align=right title='"+HTMLObject.getSystemVersion()+"'><a href=http://www.occideas.org target=_top><img src='ImageStream?ImageName=OccIDEAS.jpg' border=0></img></a></td></tr>");
		response.getWriter().println("<tr>");		
		if(user.hasPermission(User.Permission.QUESTIONNAIRELOGIN)){
			response.getWriter().println("<td width=5px >&nbsp;</td><td valign=center background='ImageStream?ImageName=mainTabUnselected.gif' align=center width=200px ><a class=TopMenu href=../"+prefix+"Questionnaire/ValidateServlet?sid="+request.getSession().getId()+"&u="+user.getEncryptedId()+"&p="+user.getPassword()+" target=_top >Questionnaire</a></td>");			
		}
		if(user.hasPermission(User.Permission.STUDIESLOGIN)){
			response.getWriter().println("<td width=5px>&nbsp;</td><td  valign=center background='ImageStream?ImageName=mainTabUnselected.gif' width=200px align=center ><a class=TopMenu href=../"+prefix+"Studies/ValidateServlet?sid="+request.getSession().getId()+"&u="+user.getEncryptedId()+"&p="+user.getPassword()+" target=_top >Studies</a></td>");			
		}
		response.getWriter().println("<td width=5px>&nbsp;</td><td  valign=center align=center background='ImageStream?ImageName=mainTab.gif' width=200px>Assessment</td><td  width=width=180px>&nbsp;</td>");
		response.getWriter().println("</tr>");
		response.getWriter().println("</table>");
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
        AssessmentSystem assessment = new AssessmentSystem();
        response.getWriter().print(assessment.showLogin(strUsername,strPassword,checked,strError));
    }   
	private void showMainTable(HttpServletRequest request, HttpServletResponse response,int iLocation) throws Exception {
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
		response.getWriter().println("<div id=MainDiv class=MainDiv >");	
//		 show body
        switch (iLocation) {
	        case 0: { // studies
	            this.showStudiesLocation(request, response);
	            break;
	        }
	        case 1: { // job specific modules
	        	this.showJobHistoriesLocation(request, response);
	            break;
	        }
	        case 2: { //agent location
	        	//request.getSession().removeAttribute("JSMID");
	        	this.showAgentsLocation(request, response);
	        	break;
	        }
	        case 3: { //participant	        		        	
	        	//request.getSession().removeAttribute("JSMID");
	            if (request.getSession().getAttribute("StudyID") != null) {
	                this.showParticipantLocation(request, response);
	            } else {
	                ArrayList<Object> arrayL = new ArrayList<Object>();
	        		arrayL.add(request.getSession().getAttribute("PageURL").toString());
	                AssessmentSystem as = new AssessmentSystem();
	                arrayL.add("Participants");
	            	response.getWriter().print(as.showNavTitle(arrayL));
	            	response.getWriter().print("<br/><br/><br/><table><tr><td>Please choose a study to view the job histories entered</td></tr></table>");
	            }
	        	break;
	        }
	        default: {
	            response.getWriter().print("Error: Unknown Location");
	        }
        }
        response.getWriter().println("</td>");
		response.getWriter().println("</tr>");
		response.getWriter().println("</table>");
    }
	private void showJobHistoriesLocation(HttpServletRequest request, HttpServletResponse response) throws Exception {
		AssessmentSystem as = new AssessmentSystem();
		ArrayList<Object> arrayL = new ArrayList<Object>();
		arrayL.add(request.getSession().getAttribute("PageURL").toString());
		arrayL.add("Job Histories");   	
    	if (request.getSession().getAttribute("StudyID") != null) {
    		String studyId = request.getSession().getAttribute("StudyID").toString();
    		Study study = new Study(studyId);
    		if((request.getSession().getAttribute("JSMID")!=null)&&(!request.getSession().getAttribute("JSMID").toString().equalsIgnoreCase("None"))){   			    			
				boolean bFilterOn = false;
    			String jsmId = request.getSession().getAttribute("JSMID").toString();
    			JobSpecificModule jsm = new JobSpecificModule(jsmId);
    			arrayL.add(jsm);
    			ArrayList<JobHistory> jhs = study.getJobHistoriesForAssessment(jsmId);
    			ArrayList<JobHistory> jhs1 = new ArrayList<JobHistory>();
    			
    			jhs1 = jhs;
    			
    			ArrayList<JobHistory> jhs2 = new ArrayList<JobHistory>();
    			if(request.getSession().getAttribute("ExposureFilter")!=null){
    				String exposureStatus = request.getSession().getAttribute("ExposureFilter").toString();
    				arrayL.add(exposureStatus);
    				bFilterOn = true;
    				for(JobHistory jh : jhs1){
    					if(jh.hasExposure(exposureStatus)){
    						jhs2.add(jh);
    					}
    				}
    			}else{
    				jhs2 = jhs1;
    			}
    			ArrayList<JobHistory> jhs3 = new ArrayList<JobHistory>();
    			if(request.getSession().getAttribute("AssessmentFilter")!=null){
    				String assessmentStatus = request.getSession().getAttribute("AssessmentFilter").toString();
    				arrayL.add("Assessment:"+assessmentStatus);
    				bFilterOn = true;
    				for(JobHistory jh : jhs2){
    					if(assessmentStatus.equalsIgnoreCase("True")){
    						if(jh.isAllManuallyAssessed(study)){
        						jhs3.add(jh);
        					}
    					}else if(assessmentStatus.equalsIgnoreCase("False")){
    						if(!(jh.isAllManuallyAssessed(study))){
        						jhs3.add(jh);
        					}
    					}
    					
    				}
    			}else{
    				jhs3 = jhs2;
    			}
    			boolean bShowJHDetail = false;
	        	if((request.getSession().getAttribute("ShowJHDetail")!=null)){
    				bShowJHDetail = true;
	        		arrayL.add("Job History Detail On");   	        	  	        		  	        		
	        	}
	        	if(bFilterOn){
	        		arrayL.add("[Clear]");
	        	}
	        	response.getWriter().println(as.showNavTitle(arrayL));
	        	if (request.getSession().getAttribute("participantPage") == null) {
	    			request.getSession().setAttribute("participantPage",1);
	            }
	        	//int iTotalCount = jhs3.size();
	        	int pageSize = Integer.parseInt(request.getSession().getAttribute("PageSize").toString());
	            int participantPage = Integer.parseInt(request.getSession().getAttribute("participantPage").toString());
	            int itemsOnPage = pageSize;
	            if (participantPage > Util.getTotalPagesFromPagedItems(jhs1.size(), itemsOnPage)){
	            	participantPage = Util.getTotalPagesFromPagedItems(jhs1.size(), itemsOnPage);
	            } 
	            Object[] pageList = Util.getPageFromPagedItems(jhs3, itemsOnPage, participantPage);
	            ArrayList<JobHistory> jhs4 = new ArrayList<JobHistory>();
	            for (Object item : pageList) {
	            	jhs4.add((JobHistory)item);
	            } 
    			response.getWriter().println(as.showJobHistoryAssessmentSummary(jhs4,bShowJHDetail,study,jhs3.size(),participantPage,pageSize));  				   			
        	}else if((request.getSession().getAttribute("StatusFilter")!=null)&&(!request.getSession().getAttribute("StatusFilter").toString().equalsIgnoreCase("None"))){
        		ArrayList<JobHistory> jhs = new ArrayList<JobHistory>();
    			ArrayList<JobHistory> jhs1 = new ArrayList<JobHistory>();
        		if(request.getSession().getAttribute("StatusFilter")!=null){
    				String jhStatus = request.getSession().getAttribute("StatusFilter").toString();
    				jhs = study.getJobHistoriesForAssessment(Integer.valueOf(jhStatus));        			
        			for(JobHistory jh : jhs){
    					if(jh.getStatusId().equalsIgnoreCase(jhStatus)){
    						jhs1.add(jh);
    					}
    				}
    			}else{
    				jhs1 = jhs;
    			}
    			ArrayList<JobHistory> jhs2 = new ArrayList<JobHistory>();
    			if(request.getSession().getAttribute("ExposureFilter")!=null){
    				String exposureStatus = request.getSession().getAttribute("ExposureFilter").toString();
    				arrayL.add(exposureStatus);
    				for(JobHistory jh : jhs1){
    					if(jh.hasExposure(exposureStatus)){
    						jhs2.add(jh);
    					}
    				}
    			}else{
    				jhs2 = jhs1;
    			}
    			ArrayList<JobHistory> jhs3 = new ArrayList<JobHistory>();
    			if(request.getSession().getAttribute("AssessmentFilter")!=null){
    				String assessmentStatus = request.getSession().getAttribute("AssessmentFilter").toString();
    				if(assessmentStatus.equalsIgnoreCase("True")){
    					arrayL.add("Assessed: Yes");
    				}else{
    					arrayL.add("Assessed: No");
    				}
    				for(JobHistory jh : jhs2){
    					if(assessmentStatus.equalsIgnoreCase("True")){
    						if(jh.isAllManuallyAssessed(study)){
        						jhs3.add(jh);
        					}
    					}else if(assessmentStatus.equalsIgnoreCase("False")){
    						if(!(jh.isAllManuallyAssessed(study))){
        						jhs3.add(jh);
        					}
    					}
    					
    				}
    			}else{
    				jhs3 = jhs2;
    			}
    			boolean bShowJHDetail = false;
	        	if(request.getSession().getAttribute("ShowJHDetail")!=null){
	        		bShowJHDetail = true;
	        		arrayL.add("Job History Detail On");
	        	}
	        	response.getWriter().println(as.showNavTitle(arrayL));
	        	if (request.getSession().getAttribute("participantPage") == null) {
	    			request.getSession().setAttribute("participantPage",1);
	            }
	        	int pageSize = Integer.parseInt(request.getSession().getAttribute("PageSize").toString());
	            int participantPage = Integer.parseInt(request.getSession().getAttribute("participantPage").toString());
	            int itemsOnPage = pageSize;
	            if (participantPage > Util.getTotalPagesFromPagedItems(jhs1.size(), itemsOnPage)){
	            	participantPage = Util.getTotalPagesFromPagedItems(jhs1.size(), itemsOnPage);
	            } 
	            Object[] pageList = Util.getPageFromPagedItems(jhs3, itemsOnPage, participantPage);
	            ArrayList<JobHistory> jhs4 = new ArrayList<JobHistory>();
	            for (Object item : pageList) {
	            	jhs4.add((JobHistory)item);
	            } 
            	response.getWriter().println(as.showJobHistoryAssessmentSummary(jhs4,bShowJHDetail,study,jhs3.size(),participantPage,pageSize));  						      		
        	}else{
        		response.getWriter().println("<table><tr><td><br/><br/><br/>Please select a JSM</td></tr></table>");         		
        	}
    	}else{
    		response.getWriter().println("<table><tr><td><br/><br/><br/>Please select a study</td></tr></table>");
    	}   	 			
	}
	private Study getSearchedParticipantList(HttpServletRequest request) throws Exception {
		//Searches participant jobs or reference number for matching string - Case insensitive
		Study study = null;
		if (request.getSession().getAttribute("StudyID") != null) {
			String studyID = request.getSession().getAttribute("StudyID").toString();
			study = new Study(studyID);
			String searchTxt = request.getSession().getAttribute("searchTxt").toString();
			study.searchParticipantsAssessment(searchTxt);
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
	private void showParticipantLocation(HttpServletRequest request, HttpServletResponse response) throws Exception {
		User user = (User) request.getSession().getAttribute("UserObject");
        ArrayList<Object> arrayL = new ArrayList<Object>();
		arrayL.add(request.getSession().getAttribute("PageURL").toString());
        if (request.getSession().getAttribute("participantPage") == null) {
			request.getSession().setAttribute("participantPage",1);
        }
        int participantPage = Integer.parseInt(request.getSession().getAttribute("participantPage").toString());
        Study study = new Study(request.getSession().getAttribute("StudyID").toString());
        AssessmentSystem as = new AssessmentSystem();  
        JobSpecificModule jsm = null;
        Participant participant = null;
        String jsmId = "";
        if(request.getSession().getAttribute("JSMID")!=null){
        	jsmId = request.getSession().getAttribute("JSMID").toString();
        	if(!(jsmId.equalsIgnoreCase("None"))){
        		jsm = new JobSpecificModule(jsmId);    
        	} 	 	
        }
        if (request.getSession().getAttribute("ParticipantID") == null) {
        	arrayL.add(study);
        	arrayL.add("Participants");
        	if(request.getAttribute("reports") != null){
        		arrayL.add("Reports");
        		response.getWriter().println(as.showNavTitle(arrayL));
        		response.getWriter().println(as.showReportsAssessments(study));
        	}else{              	
	        	List<Participant> participants = new ArrayList<Participant>();
	        	String statusFilterId = ParticipantStatus.READYFORASSESSMENT;
	
	            if (request.getSession().getAttribute("StatusFilter") != null) {
	            	statusFilterId = request.getSession().getAttribute("StatusFilter").toString();
	            }
	    		if (request.getSession().getAttribute("searchTxt") != null) {
	            	//Get the study participants matching the search criteria
	    			study = getSearchedParticipantList(request);
	            	String search = request.getSession().getAttribute("searchTxt").toString();
	            	arrayL.add("Searched:"+search);
	            	//If the statusFilterId is not "None" then apply the status filter to the searched participants
					if (!statusFilterId.equals("None")){
						participants = study.filterParticipants(statusFilterId);
						ParticipantStatus ps = new ParticipantStatus(statusFilterId);
		            	arrayL.add(ps);
					}else{
	//		            	Otherwise default to none
		            	participants = study.filterParticipants(ParticipantStatus.NONE);
		            }
	            }else if (request.getSession().getAttribute("SearchPeriod") != null){
	            	study = this.getUpdatedParticipantsForPeriod(request);
	            	arrayL.add("Last Updated");
					if (!statusFilterId.equals("None")){
						participants = study.filterParticipants(statusFilterId);
						ParticipantStatus ps = new ParticipantStatus(statusFilterId);
		            	arrayL.add(ps);
					}else{
	//		            	Otherwise default to none
		            	participants = study.filterParticipants(ParticipantStatus.NONE);
		            }
	            }else{
	                if(!statusFilterId.equals("None")){
		            	participants = study.filterParticipants(statusFilterId);
		            	ParticipantStatus ps = new ParticipantStatus(statusFilterId);
		            	arrayL.add(ps);
		            }else{
	//		            	Otherwise default to none
		            	participants = study.filterParticipants(ParticipantStatus.NONE);
		            }
				}
	        	response.getWriter().println(as.showNavTitle(arrayL));
	        	response.getWriter().println(as.showParticipants(participants,user, participantPage,statusFilterId, Integer.parseInt(request.getSession().getAttribute("PageSize").toString())));
        	}
        } else {
            participant = new Participant(Long.valueOf(request.getSession().getAttribute("ParticipantID").toString()));
            String jhid = "";
            if (request.getSession().getAttribute("JobHistoryID") == null) {
            	arrayL.add(study);
            	arrayL.add("Participants");   
            	arrayL.add(jsm);
            	participant.setId(participant.getParticipantId().toString());
            	arrayL.add(participant); 
            	//previous
            	if(request.getSession().getAttribute("PreviousIDs")!=null){
            		arrayL.add("Previous");
            	}
            	arrayL.add("Next");
            	response.getWriter().println(as.showNavTitle(arrayL));//Assessment Participant View
                response.getWriter().println(as.showReadyJobHistories(jsmId,participant.getJobHistories(""),study)); 
                ParticipantStatus status = new ParticipantStatus();
            	List<ParticipantStatus> statuses = status.getParticipantAssessmentStatuses();
            	response.getWriter().println(as.showParticipantCommentsStatus(participant,statuses));
            } else {           	
                jhid = request.getSession().getAttribute("JobHistoryID").toString();
                JobHistory jh = new JobHistory(jhid);
                if ((request.getSession().getAttribute("AgentID") == null)&&(request.getAttribute("AgentID") == null)) {
                	if(!(jh.getFinalJSMId().equalsIgnoreCase("NULL"))){
            			if(!(jh.getStatusId().equalsIgnoreCase(JobHistoryStatus.NOTTOBEINTERVIEWEDSCOPE))){
    	            		jsm = new JobSpecificModule(jh.getFinalJSMId());
    	            		for(Agent agent: jsm.getAgents()){
    	            			if(study.getAgents().contains(agent)){
    	            				request.getSession().setAttribute("AgentID",agent.getId());
    	            			}
    		            	} 
    	            	}
                	}
                }
                arrayL.add(study);
                arrayL.add("Participants");
                arrayL.add(jsm);
                participant.setId(participant.getParticipantId().toString());
                arrayL.add(participant);
                arrayL.add(jh);
                ExpertAgent agent = null;
                if ((request.getSession().getAttribute("AgentID") != null)||(request.getAttribute("AgentID") != null)) {
                	String agentID = request.getSession().getAttribute("AgentID").toString();
                    agent = new ExpertAgent(agentID);
                	arrayL.add(agent);
                	//previous
                	if(request.getSession().getAttribute("PreviousIDs")!=null){
                		arrayL.add("Previous");
                	}
                	arrayL.add("Next");
                	response.getWriter().println(as.showNavTitle(arrayL)); 
                }else{
                	//previous
                	if(request.getSession().getAttribute("PreviousIDs")!=null){
                		arrayL.add("Previous");
                	}
                	arrayL.add("Next");
                	response.getWriter().println(as.showNavTitle(arrayL));
                }
            	//doing an assessment                    
                arrayL.add(agent);
                response.getWriter().println(as.showTitleBarAndCloseButton("Participant Job History Summary View", "closeEdit"));
                response.getWriter().println("<table class='frontpages'>");
                response.getWriter().println("<tr>");
                response.getWriter().println("<td valign=top class=AllJobHistorySummary>"); 
//              show current selected jh
	            ExpertRule er = null;
	        	if(request.getSession().getAttribute("RuleID") != null){
	        		er = new ExpertRule(request.getSession().getAttribute("RuleID").toString());
	        	}
	            response.getWriter().println(as.showJobHistorySummary(jh,er));
	           
	            response.getWriter().println("</td>"); 
	            response.getWriter().println("<td valign=top class=AllJobHistorySummary>");
	            if ((request.getSession().getAttribute("AgentID") != null)||(request.getAttribute("AgentID") != null)) {
	//                	show assessment
	            	response.getWriter().println("<table class=occIDEASAssessment cellpadding=0 cellspacing=0><tr>");
	                response.getWriter().println("<tr class=ListHeader><td align=center colspan=5>Exposure Assessment Panel</td></tr>");
	                response.getWriter().println("<td valign=top>");
	                Assessment assessment = agent.getAssessment(jh);
	                Assessment autoAssessment = agent.getAutoAssessment(jh);
	                boolean bReadOnly = true;
	                if(user.hasPermission(User.Permission.RUNASSESSMENT)){
	                	bReadOnly = false;
	                }
	                if(jh.getStatusId().equalsIgnoreCase(JobHistoryStatus.NOTTOBEINTERVIEWEDTIME)){
	                	response.getWriter().println(as.showExposureAssessment(bReadOnly,agent,assessment,autoAssessment,participant,study));
	                }else{
	                	response.getWriter().println(as.showExposureAssessment(bReadOnly,agent,assessment,autoAssessment,study));
	                }                                         
	                response.getWriter().println("</td>");
	                response.getWriter().println("</tr>");
	                response.getWriter().println("</table>");
	                if(!(autoAssessment.getId().equalsIgnoreCase(""))){
	                	response.getWriter().println(as.showRules(er,autoAssessment,study));
	                }
	            }else{
	            	ParticipantStatus status = new ParticipantStatus();
	            	List<ParticipantStatus> statuses = status.getParticipantAssessmentStatuses();
	            	response.getWriter().println(as.showParticipantCommentsStatus(participant,statuses));
	            }
	            response.getWriter().println("</td>");   
                response.getWriter().println("</tr>"); 
                response.getWriter().println("<tr>");                
                response.getWriter().println("<tr>");                
                response.getWriter().println("<td colspan=2><hr/></td>");                                      
                response.getWriter().println("</tr>");                
                response.getWriter().println("<td valign=top class=AllJobHistorySummary>");
//              show questions
                response.getWriter().println("<table width=100%><tr class=ListHeader><td align=center>Participant Interview Panel</td></tr></table>");               		
                if(request.getSession().getAttribute("InterviewID") != null){
                	String interviewId = request.getSession().getAttribute("InterviewID").toString();
                	Interview interview = new Interview(interviewId);
                	FrozenJobSpecificModule fjsm = new FrozenJobSpecificModule(interview.getFrozenJsmId());
                    if ((request.getSession().getAttribute("AgentID") != null)||(request.getAttribute("AgentID") != null)) {
                    	if (fjsm.hasAgent(agent.getId())) {                        		
                            response.getWriter().println(as.showOtherInterviewLinks(jh,interviewId));  
                            if(request.getSession().getAttribute("RuleID") != null){
                                response.getWriter().println(as.showAllQuestionsInterviewReviewRule(fjsm,interviewId,agent,er,study));                                                                                      	
                            }else{
                                response.getWriter().println(as.showAllQuestionsInterviewReviewAgent(fjsm,interviewId,agent,study));                                                           
                            }
                        } else {
                            response.getWriter().println("<table><tr><td class=questions>No questions answered relating to this agent</td></tr></table>");
                        }
                    }else{
                        response.getWriter().println(as.showOtherInterviewLinks(jh,interviewId));                                                           
                        response.getWriter().println(as.showAllQuestionsInterviewReviewFull(fjsm,interviewId));                                                           
                    }
                }else {
                	if (jh.getCurrentInterview() == null) {
                        response.getWriter().println("<table><tr><td class=questions>No interview performed</td></tr></table>");               		
                	}else{
                		//Interview intv = jh.getCurrentInterview();
         //       		String v = intv.getFrozenJsmId();
                    	FrozenJobSpecificModule fjsm = new FrozenJobSpecificModule(jh.getCurrentInterview().getFrozenJsmId());
                        response.getWriter().println(as.showOtherInterviewLinks(jh,jh.getCurrentInterview().getId()));
                        if(agent==null){
                            response.getWriter().println(as.showAllQuestionsInterviewReviewFull(fjsm,jh.getCurrentInterview().getId()));                                                                          		                        	
                        }else{
                        	if(request.getSession().getAttribute("RuleID") != null){
                                response.getWriter().println(as.showAllQuestionsInterviewReviewRule(fjsm,jh.getCurrentInterview().getId(),agent,er,study));                       		                     		
                        	}else{
                                response.getWriter().println(as.showAllQuestionsInterviewReviewAgent(fjsm,jh.getCurrentInterview().getId(),agent,study));                       		
                        	}
                        }
                	}
                }            
                response.getWriter().println("</td>");                 
                response.getWriter().println("<td valign=top class=AllJobHistorySummary>");
//              show all jobs and status
	            response.getWriter().println(as.showAllJobHistorySummary(jh,participant,agent,study));
	            response.getWriter().println("</td>");                                
                response.getWriter().println("</tr>"); 
                response.getWriter().println("</table>");    
            }
        }            
    }
	private void showAgentsLocation(HttpServletRequest request, HttpServletResponse response) throws Exception {
    	AssessmentSystem as = new AssessmentSystem();
    	ArrayList<Object> arrayL = new ArrayList<Object>();
		arrayL.add(request.getSession().getAttribute("PageURL").toString());
		Study study = null;
		String studyId = "";
		if(request.getSession().getAttribute("StudyID")!=null){
			studyId = request.getSession().getAttribute("StudyID").toString();
			study = new Study(studyId);
			if (request.getSession().getAttribute("AgentID") == null){
				if(study.getAgents().size()>0){
					String agentId = study.getAgents().get(0).getId();
					request.getSession().setAttribute("AgentID",agentId);
				}
			}
		}
    	Agent agent = null;
    	ArrayList<JobHistory> jhs = new ArrayList<JobHistory>();
        JobHistory jh = new JobHistory();         
        if (request.getSession().getAttribute("AnswerID") != null) {       	
			String jhId = request.getSession().getAttribute("JobHistoryID").toString();
        	jh = new JobHistory(jhId);	            
            String answerID = request.getSession().getAttribute("AnswerID").toString();
            String questionID = request.getSession().getAttribute("QuestionID").toString();
            String answerDescription = request.getSession().getAttribute("AnswerDescription").toString();       	
        	jhs = study.getJobHistoriesWithAnswer(answerID,questionID,answerDescription);
        	
        	Question q = new Question("",questionID);
        	PossibleAnswer a = new PossibleAnswer(answerID);       	
        	arrayL.add(jh);
        	arrayL.add(q);
        	arrayL.add(a);
        	String agentID = "";
        	if (request.getSession().getAttribute("AgentID") != null){
        		agentID = request.getSession().getAttribute("AgentID").toString();
        		agent = new Agent(agentID);
        	}else{
        		agent = new Agent();
        	}
        	boolean bShowJHDetail = false;
        	if(request.getSession().getAttribute("ShowJHDetail")!=null){
        		bShowJHDetail = true;
        		arrayL.add("Job History Detail On");
        	}
        	ArrayList<JobHistory> jhs1 = this.filterJobHistories(request,jhs,agent); 
        	String jsmFilterId = "None";
            if(request.getSession().getAttribute("JSMFilter")!=null){
            	jsmFilterId = request.getSession().getAttribute("JSMFilter").toString();
            	if(!(jsmFilterId.equalsIgnoreCase("None"))){
            		JobSpecificModule jsm = new JobSpecificModule(jsmFilterId);
	            	arrayL.add(jsm);  	            	      	
            	}	
            }
        	response.getWriter().println(as.showNavTitle(q,a,jh));       	
        	response.getWriter().println(as.showAgentAssessmentReport(jhs1,agent,"None","None",study,bShowJHDetail,0,0,jhs1.size()));		
        } else if (request.getSession().getAttribute("AgentID") != null){
        	arrayL.add("Agents");   	       	
			boolean bFilterOn = false;
        	String agentID = request.getSession().getAttribute("AgentID").toString();
        	agent = new Agent(agentID); 
        	String statusFilter = "";
        	String statusFilterId = "";	        		        	
	        if(request.getSession().getAttribute("StatusFilter")!=null){
	        	statusFilterId = request.getSession().getAttribute("StatusFilter").toString();
	        	if(!(statusFilterId.equalsIgnoreCase("None"))){
	        		JobHistoryStatus  jhStatus = new JobHistoryStatus(statusFilterId); 
	        		arrayL.add(jhStatus);  
            		statusFilter = " AND jobhistory.jobhistorystatusid = "+statusFilterId;
            	}else{
            		arrayL.add("None"); 
		        	statusFilter = "AND (jobhistory.jobhistorystatusid IN (2,3,4,5,6,7))";
	            }
	        }else{
	        	statusFilterId = JobHistoryStatus.INTERVIEWED;
	        	JobHistoryStatus jhStatus = new JobHistoryStatus(statusFilterId);
	        	arrayL.add(jhStatus);
	        	statusFilter = " AND jobhistory.jobhistorystatusid = "+statusFilterId;
	        }
	        String jsmFilter = "";
            String jsmFilterId = "None";
            if(request.getSession().getAttribute("JSMFilter")!=null){
            	jsmFilterId = request.getSession().getAttribute("JSMFilter").toString();
            	if(!(jsmFilterId.equalsIgnoreCase("None"))){
            		JobSpecificModule jsm = new JobSpecificModule(jsmFilterId);
	            	arrayL.add(jsm);  	            	
	           		jsmFilter = " AND jobhistory.finaljsmid = "+jsmFilterId;
	            	bFilterOn = true;		            	
            	}	
            }
    		jhs = study.getJobHistoriesForAssessment(statusFilter, jsmFilter);
        	arrayL.add(agent);       	       		        	
        	boolean bShowJHDetail = false;
        	if(request.getSession().getAttribute("ShowJHDetail")!=null){
        		bShowJHDetail = true;
        		arrayL.add("Job History Detail On");
        	}	        	
        	ArrayList<JobHistory> jhs1 = this.filterJobHistories(request,jhs,agent); 
        	if(request.getSession().getAttribute("AssessmentType")!=null){
    			String assessmentType = request.getSession().getAttribute("AssessmentType").toString();
    			arrayL.add(assessmentType);
    			if(request.getSession().getAttribute("ExposureFilter")!=null){
    				String exposureFilter = request.getSession().getAttribute("ExposureFilter").toString();
    				arrayL.add(exposureFilter);
    				bFilterOn = true;
    			}
        	}	        	  
        	if(bFilterOn){
        		arrayL.add("[Clear]");
        	}
        	response.getWriter().println(as.showNavTitle(arrayL));        	        	
        	if (request.getSession().getAttribute("participantPage") == null) {
    			request.getSession().setAttribute("participantPage",1);
            }
        	int pageSize = Integer.parseInt(request.getSession().getAttribute("PageSize").toString());
            int participantPage = Integer.parseInt(request.getSession().getAttribute("participantPage").toString());
            int itemsOnPage = pageSize;
            if (participantPage > Util.getTotalPagesFromPagedItems(jhs1.size(), itemsOnPage)){
            	participantPage = Util.getTotalPagesFromPagedItems(jhs1.size(), itemsOnPage);
            } 
            Object[] pageList = Util.getPageFromPagedItems(jhs1, itemsOnPage, participantPage);
            ArrayList<JobHistory> jhs2 = new ArrayList<JobHistory>();
            for (Object item : pageList) {
            	jhs2.add((JobHistory)item);
            }       	
        	response.getWriter().println(as.showAgentAssessmentReport(jhs2,agent,statusFilterId,jsmFilterId,study,bShowJHDetail,participantPage,pageSize,jhs1.size()));			
        }else if (request.getSession().getAttribute("StudyID") == null) {
        	arrayL.add("Agents");
        	response.getWriter().println(as.showNavTitle(arrayL));
        	response.getWriter().println("<table><tr><td><br/><br/><br/>Please select a study</td></tr></table>");
        }else if (request.getSession().getAttribute("AgentID") == null){
        	arrayL.add("Agents");
        	response.getWriter().println(as.showNavTitle(arrayL));
        	response.getWriter().println("<table><tr><td><br/><br/><br/>Please select an agent to display report</td></tr></table>");
        }
    } 
	private ArrayList<JobHistory> filterJobHistories(HttpServletRequest request,ArrayList<JobHistory> jhs,Agent agent) throws Exception {
		ArrayList<JobHistory> retValue = new ArrayList<JobHistory>();
		
		if(request.getSession().getAttribute("AssessmentType")!=null){
			String assessmentType = request.getSession().getAttribute("AssessmentType").toString();
			if(assessmentType.equalsIgnoreCase("Manual")){
				String exposureFilter = request.getSession().getAttribute("ExposureFilter").toString();
				if(exposureFilter.equalsIgnoreCase("PROBABLEHIGH")){
					for(JobHistory jh: jhs){
						jh.getPersistentObject();
						if(jh.getManualAssessment(agent.getId()).getOutCome().equalsIgnoreCase("PROBABLEHIGH")){
							retValue.add(jh);
						}
					}
				}else if(exposureFilter.equalsIgnoreCase("PROBABLEMEDIUM")){
					for(JobHistory jh: jhs){
						jh.getPersistentObject();
						if(jh.getManualAssessment(agent.getId()).getOutCome().equalsIgnoreCase("PROBABLEMEDIUM")){
							retValue.add(jh);
						}
					}
				}else if(exposureFilter.equalsIgnoreCase("PROBABLELOW")){
					for(JobHistory jh: jhs){
						jh.getPersistentObject();
						if(jh.getManualAssessment(agent.getId()).getOutCome().equalsIgnoreCase("PROBABLELOW")){
							retValue.add(jh);
						}
					}
				}else if(exposureFilter.equalsIgnoreCase("POSSIBLEUNKNOWN")){
					for(JobHistory jh: jhs){
						jh.getPersistentObject();
						if(jh.getManualAssessment(agent.getId()).getOutCome().equalsIgnoreCase("POSSIBLEUNKNOWN")){
							retValue.add(jh);
						}
					}
				}else if(exposureFilter.equalsIgnoreCase("NONE")){
					for(JobHistory jh: jhs){
						jh.getPersistentObject();
						if(jh.getManualAssessment(agent.getId()).getOutCome().equalsIgnoreCase("NONE")){
							retValue.add(jh);
						}
					}
				}else if(exposureFilter.equalsIgnoreCase("NS")){
					for(JobHistory jh: jhs){
						jh.getPersistentObject();
						if(jh.getManualAssessment(agent.getId()).getId().equalsIgnoreCase("")){
							retValue.add(jh);
						}else if(jh.getManualAssessment(agent.getId()).getExposure().equalsIgnoreCase("NULL")){
							retValue.add(jh);
						}
					}
				}else if(exposureFilter.equalsIgnoreCase("NULL")){
					retValue=jhs;
				}
			}else if(assessmentType.equalsIgnoreCase("Auto")){
				String exposureFilter = request.getSession().getAttribute("ExposureFilter").toString();
				if(exposureFilter.equalsIgnoreCase("PROBABLEHIGH")){
					for(JobHistory jh: jhs){
						jh.getPersistentObject();
						if(jh.getAutoAssessment(agent.getId()).getOutCome().equalsIgnoreCase("PROBABLEHIGH")){
							retValue.add(jh);
						}
					}
				}else if(exposureFilter.equalsIgnoreCase("PROBABLEMEDIUM")){
					for(JobHistory jh: jhs){
						jh.getPersistentObject();
						if(jh.getAutoAssessment(agent.getId()).getOutCome().equalsIgnoreCase("PROBABLEMEDIUM")){
							retValue.add(jh);
						}
					}
				}else if(exposureFilter.equalsIgnoreCase("PROBABLELOW")){
					for(JobHistory jh: jhs){
						jh.getPersistentObject();
						if(jh.getAutoAssessment(agent.getId()).getOutCome().equalsIgnoreCase("PROBABLELOW")){
							retValue.add(jh);
						}
					}
				}else if(exposureFilter.equalsIgnoreCase("POSSIBLEUNKNOWN")){
					for(JobHistory jh: jhs){
						jh.getPersistentObject();
						if(jh.getAutoAssessment(agent.getId()).getOutCome().equalsIgnoreCase("POSSIBLEUNKNOWN")){
							retValue.add(jh);
						}
					}
				}else if(exposureFilter.equalsIgnoreCase("NONE")){
					for(JobHistory jh: jhs){
						jh.getPersistentObject();
						if(jh.getAutoAssessment(agent.getId()).getOutCome().equalsIgnoreCase("NONE")){
							retValue.add(jh);
						}
					}
				}else if(exposureFilter.equalsIgnoreCase("NULL")){
					retValue=jhs;
				}
			} else{
				retValue = jhs;
			}
		}else{
			retValue = jhs;
		}
		
		return retValue;
	}

	private void showStudiesLocation(HttpServletRequest request, HttpServletResponse response) throws Exception {
        AssessmentSystem as = new AssessmentSystem();
        ArrayList<Object> arrayL = new ArrayList<Object>();
		arrayL.add(request.getSession().getAttribute("PageURL").toString());
        if (request.getSession().getAttribute("StudyID") == null) {
            Study study = new Study();
            User user = (User) request.getSession().getAttribute("UserObject");
            arrayL.add("Studies");
            response.getWriter().println(as.showNavTitle(arrayL));
            response.getWriter().println(as.showTable("", study.getStudies(user.getId()), false,"studies", true));
        } else {
            Study study = new Study(request.getSession().getAttribute("StudyID").toString());
            arrayL.add(study);
			if(request.getSession().getAttribute("InProgress")!=null){
				String message = "The Auto Assessments are being processed.<br>Click <a href=main.jsp>here</a> when complete.";
				response.getWriter().println(as.showProgressBar(message));
			}else{
				boolean bShowDetail = false;
				if(request.getSession().getAttribute("ShowAssessmentDetail")!=null){
					String assessmentDetail = request.getSession().getAttribute("ShowAssessmentDetail").toString();
					if(assessmentDetail.equalsIgnoreCase("true")){
						bShowDetail = true;							
					}else{
						bShowDetail = false;							
					}
				}
				if(request.getSession().getAttribute("JSMID")!=null){
					String jsmID = request.getSession().getAttribute("JSMID").toString();
					if(!(jsmID.equalsIgnoreCase("None"))){
						JobSpecificModule jsm = new JobSpecificModule(jsmID);
		        		arrayL.add(jsm); 
		        		if(request.getSession().getAttribute("AgentID")!=null){
		        			String agentId = request.getSession().getAttribute("AgentID").toString();
		        			Agent agent = new Agent(agentId);
		        			arrayL.add(agent);
		        			response.getWriter().println(as.showNavTitle(arrayL));
			            	response.getWriter().println(as.showStudy(study,jsm,agent,bShowDetail)); 
		        		}else{
		        			response.getWriter().println(as.showNavTitle(arrayL));
			            	response.getWriter().println(as.showStudy(study,jsm,null,bShowDetail)); 
		        		}
					}else{
						response.getWriter().println(as.showNavTitle(arrayL));
		            	response.getWriter().println(as.showStudy(study,null,null,bShowDetail)); 
					}		            				
				}else{
					response.getWriter().println(as.showNavTitle(arrayL));
	            	response.getWriter().println(as.showStudy(study,null,null,bShowDetail)); 
				}				 
			}          	                    
        }
    }  
    private int getLocationInt(String strLocation) {
        int iRetValue = 0;
        if (strLocation.equalsIgnoreCase("Studies")) {
            iRetValue = 0;
        } else if (strLocation.equalsIgnoreCase("Job_Histories")) {
            iRetValue = 1;
        }else if (strLocation.equalsIgnoreCase("Agents")) {
            iRetValue = 2;
        }else if (strLocation.equalsIgnoreCase("Participants")) {
            iRetValue = 3;
        }else if (strLocation.equalsIgnoreCase("Roles")) {
        	iRetValue = 4;
        }
        return iRetValue;

    }
    private String showActionButtons(HttpServletRequest request,int iLocation) throws Exception {
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
	        	if (request.getSession().getAttribute("StudyID") != null) {
	            	ActionButton runAssessment = new ActionButton("runAssessments","Run Auto Assessments", "run.gif");
	            	ActionButton useAutoNones = new ActionButton("useAutoNones","Accept No Exposures", "useauto.gif");
		        	if(user.hasPermission(User.Permission.RUNASSESSMENT)){
	            		runAssessment.setEnabled(true);
	            	}
		        	//Reliability Study code tweaking
		        	String studyId = request.getSession().getAttribute("StudyID").toString();
		        	if(studyId.equalsIgnoreCase("11")){
		        		runAssessment.setEnabled(false);
		        	}else if(studyId.equalsIgnoreCase("12")){
		        		runAssessment.setEnabled(false);
		        	}else{
		        		useAutoNones.setEnabled(true);
		        	}
	                strHTML += runAssessment.getTxtHTML();
	                
	                strHTML += useAutoNones.getTxtHTML();
		        	
	            } 
	            break;
	        }
	        case 1: { // job histories
	        	ActionButton quickAssessment = new ActionButton("batchConfirm","Use Auto Assessment", "useauto.gif");
	        	ActionButton showJobHistoryDetails = new ActionButton("jobHistoryDetail","Show Job History Details", "jobs.gif");
	        	if(user.hasPermission(User.Permission.RUNASSESSMENT)){
	        		showJobHistoryDetails.setEnabled(true);
	        		quickAssessment.setEnabled(true);
	        	}
	        	strHTML += quickAssessment.getTxtHTML();
	        	strHTML += showJobHistoryDetails.getTxtHTML();
	            break;
	        }
	        case 2: { // agents       	
	        	ActionButton quickAssessment = new ActionButton("quickAssessment","Use Auto Assessment", "useauto.gif");
	        	ActionButton showJobHistoryDetails = new ActionButton("jobHistoryDetail","Show Job History Details", "jobs.gif");
	        	//ActionButton exportToExcel = new ActionButton("exportToExcel","Export Report to Excel", "export.gif");
	        	if(user.hasPermission(User.Permission.RUNASSESSMENT)){
	        		quickAssessment.setEnabled(true);
	        		showJobHistoryDetails.setEnabled(true);
	        		//exportToExcel.setEnabled(true);
	        	}
	        	strHTML += quickAssessment.getTxtHTML();
	        	strHTML += showJobHistoryDetails.getTxtHTML();
	        	//strHTML += exportToExcel.getTxtHTML();
	            break;
	        }
	        case 3: { // participants
        		ActionButton quickAssessment = new ActionButton("quickJHAssessment","Use Auto Assessment All Agents", "useauto.gif");
            	ActionButton saveParticipant = new ActionButton("saveParticipantStatus","Save Participant Status", "save.gif");
            	ActionButton reportToExcel = new ActionButton("toExcel","Report All Results", "toexcel.gif");
        		ActionButton createReportJobHistory = new ActionButton("createReportAssessment","Create a report now", "runreport.gif");
        		ActionButton runAssessment = new ActionButton("runAssessments","Run Auto Assessments", "run.gif");
            	if(user.hasPermission(User.Permission.RUNASSESSMENT)){            		
            		if (request.getSession().getAttribute("ParticipantID") != null){
        				String pid = request.getSession().getAttribute("ParticipantID").toString();
        				Participant p = new Participant(Long.parseLong(pid));
        				if(p.isAtAssessmentStage()){
        					quickAssessment.setEnabled(true);
        				}else{
        					quickAssessment.setTitle("Participant is not at Assessment stage");
        				}
        				if (request.getSession().getAttribute("JobHistoryID") == null) {
        					saveParticipant.setEnabled(true);
            				strHTML += saveParticipant.getTxtHTML();
        				} else{
        					runAssessment.setEnabled(true);
        				}
        				strHTML += quickAssessment.getTxtHTML();
        				strHTML += runAssessment.getTxtHTML();
        			} else {  
        				if(request.getAttribute("reports") != null){
        					createReportJobHistory.setOnClick(" onclick=\"return confirm('Warning:  The data generated in this report is raw data and should be subjected to integrity checks before use in analysis.  This may be a lengthy process depending on the size of your study.  This process will continue to run even if the internet browser closed.');\"");
        					createReportJobHistory.setEnabled(true);
            				strHTML += createReportJobHistory.getTxtHTML();
                    	}else{
                    		quickAssessment.setEnabled(true);
            				strHTML += quickAssessment.getTxtHTML();	 
            				//reportToExcel.setOnClick(" onclick=\"return confirm('This may take some time. Please be patient.');\"");
                			reportToExcel.setEnabled(true);
            				strHTML += reportToExcel.getTxtHTML();
                    	}       				
        			}
            	}    				        	  
	            break;
	        }
	        default: {
	            strHTML += "";
	        }
        }
        if(user.hasPermission(Permission.STUDYMGRLOGIN)){
			ActionButton sm = new ActionButton("studyManager","Study Manager", "studymanager.gif");
			sm.setEnabled(true);
			strHTML += sm.getTxtHTML();
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
}