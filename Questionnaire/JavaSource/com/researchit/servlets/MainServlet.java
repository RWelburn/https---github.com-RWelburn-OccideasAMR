/**
 * Revisions:
 *     $Log: MainServlet.java,v $
 *     Revision 1.214  2009/04/27 03:19:30  troy.sadkowsky
 *     prefix comes from context tags
 *
 *     Revision 1.213  2009/03/09 07:27:32  troy.sadkowsky
 *     new prifix for demo apps
 *
 *     Revision 1.212  2009/02/04 22:37:46  troy.sadkowsky
 *     fixed wiki page for shared keyphrase
 *
 *     Revision 1.211  2009/01/21 08:42:39  troy.sadkowsky
 *     show and hide action bar
 *
 *     Revision 1.210  2009/01/06 07:41:47  troy.sadkowsky
 *     v2 updates
 *
 *     Revision 1.209  2009/01/05 06:52:49  troy.sadkowsky
 *     progress bar updates and demo intro
 *
 *     Revision 1.208  2008/12/21 23:29:13  troy.sadkowsky
 *     highlight if agent not on parent
 *
 *     Revision 1.207  2008/12/20 02:07:13  troy.sadkowsky
 *     v2 updates
 *
 *     Revision 1.206  2008/12/14 22:40:54  troy.sadkowsky
 *     removed auto minimise of rules display and added action buttons for doing it manually
 *
 *     Revision 1.205  2008/12/11 15:32:35  ray.welburn
 *     Add cookies for login
 *
 *     Revision 1.204  2008/11/25 22:58:34  ray.welburn
 *     add edit view to rules
 *
 *     Revision 1.203  2008/11/14 09:14:54  troy.sadkowsky
 *     usability updates
 *
 *     Revision 1.202  2008/11/07 05:02:00  ray.welburn
 *     Add close button to view/edit rules and remove from view rules
 *
 *     Revision 1.201  2008/11/06 00:39:49  ray.welburn
 *     Add close button to view rules page
 *
 *     Revision 1.200  2008/11/03 06:55:40  ray.welburn
 *     Remove select al butoon from agent tab
 *
 *     Revision 1.199  2008/11/03 06:46:59  ray.welburn
 *     remove minmax action button from agents tab
 *
 *     Revision 1.198  2008/10/20 00:37:44  troy.sadkowsky
 *     to excel show rules
 *
 *     Revision 1.197  2008/10/10 05:51:58  troy.sadkowsky
 *     permission level update
 *
 *     Revision 1.196  2008/10/08 01:45:29  troy.sadkowsky
 *     fix frequency rules
 *
 *     Revision 1.195  2008/09/24 12:16:54  troy.sadkowsky
 *     demo ready
 *
 *     Revision 1.194  2008/09/12 02:40:57  troy.sadkowsky
 *     encrypt user id
 *
 *     Revision 1.193  2008/09/03 07:36:48  troy.sadkowsky
 *     tidy code and ensure connections close
 *
 *     Revision 1.192  2008/08/20 03:35:53  troy.sadkowsky
 *     removed old code and changes for new rule updates
 *
 *     Revision 1.191  2008/08/13 04:39:37  troy.sadkowsky
 *     fix for adding jobs
 *
 *     Revision 1.190  2008/08/13 04:34:57  ray.welburn
 *     modifications to add/edit agentexamples
 *
 *     Revision 1.189  2008/06/22 22:54:20  ray.welburn
 *     name change to share gif
 *
 *     Revision 1.188  2008/06/11 00:35:12  troy.sadkowsky
 *     updated action buttons
 *
 *     Revision 1.187  2008/06/04 00:52:37  troy.sadkowsky
 *     changed updatetimestamps to use session jsmid
 *
 *     Revision 1.186  2008/06/01 09:37:10  ray.welburn
 *     Search for users and filter for lhs user menu
 *
 *     Revision 1.185  2008/05/30 01:52:07  troy.sadkowsky
 *     removed old code
 *
 *     Revision 1.184  2008/05/18 12:13:11  troy.sadkowsky
 *     action button bar updates
 *
 *     Revision 1.183  2008/05/10 07:41:11  troy.sadkowsky
 *     updates for export JSMs
 *
 *     Revision 1.182  2008/04/22 23:27:11  troy.sadkowsky
 *     made a info header
 *
 *     Revision 1.181  2008/04/22 10:25:39  ray.welburn
 *     Navitle now consistant across locations
 *
 *     Revision 1.180  2008/04/15 23:00:42  troy.sadkowsky
 *     renamed lhsm tab draw function
 *
 *     Revision 1.179  2008/04/11 07:02:20  ray.welburn
 *     Fix for when jsmtype set to agents then selecting jsmtab
 *
 *     Revision 1.178  2008/04/09 02:19:12  ray.welburn
 *     LHS tabs can now include an object name eg study name
 *
 *     Revision 1.177  2008/04/06 03:40:50  ray.welburn
 *     Change  to Actionbuttons position
 *
 *     Revision 1.176  2008/03/30 23:55:54  ray.welburn
 *     ShowJSMTabs now modified to allow placement on all pages
 *
 *     Revision 1.175  2008/03/24 23:40:10  ray.welburn
 *     Code tidying
 *
 *     Revision 1.174  2008/03/22 04:44:51  ray.welburn
 *     images from database applied to alll images
 *
 *     Revision 1.173  2008/03/18 10:39:44  ray.welburn
 *     swap bmp images for gif and add globalminmax to structure view
 *
 *     Revision 1.172  2008/03/16 03:49:47  ray.welburn
 *     Add Global min max button
 *
 *     Revision 1.171  2008/03/13 01:46:23  ray.welburn
 *     Pages now use database images
 *
 *     Revision 1.170  2008/03/12 23:07:25  troy.sadkowsky
 *     minor changes for action buttons
 *
 *     Revision 1.169  2008/03/12 16:46:04  troy.sadkowsky
 *     move action buttons
 *
 *     Revision 1.168  2008/03/12 07:49:04  troy.sadkowsky
 *     fixed highlight on agent select
 *
 *     Revision 1.167  2008/03/05 02:37:58  troy.sadkowsky
 *     validation of jsm
 *
 *     Revision 1.166  2008/03/01 07:40:53  ray.welburn
 *     Modify how help navigaes to wiki
 *
 *     Revision 1.165  2008/03/01 04:22:30  troy.sadkowsky
 *     new validation and remove duplicate rule actions
 *
 *     Revision 1.163  2008/02/25 04:44:54  ray.welburn
 *     Add Select all button when adding agents
 *
 *     Revision 1.162  2008/02/25 04:24:40  troy.sadkowsky
 *     new export function
 *
 *     Revision 1.161  2008/02/24 05:17:56  ray.welburn
 *     add Min Max button to rhs when adding agents
 *
 *     Revision 1.160  2008/02/15 08:39:22  troy.sadkowsky
 *     copy jsms function
 *
 *     Revision 1.159  2008/02/15 04:02:46  troy.sadkowsky
 *     removed olf code, added data cleaning functions and ui updates
 *
 *     Revision 1.158  2008/02/14 06:28:55  ray.welburn
 *     Print viewpage now left justifies text
 *
 *     Revision 1.157  2008/02/14 02:40:13  ray.welburn
 *     Modify help button to go to appropriate page in help wiki
 *
 *     Revision 1.156  2008/02/13 02:30:30  ray.welburn
 *     Remove User manual references
 *
 *     Revision 1.155  2008/02/12 15:03:53  troy.sadkowsky
 *     shared questions and answers
 *
 *     Revision 1.154  2008/01/31 00:08:48  troy.sadkowsky
 *     copy paste back for study specific jsms
 *
 *     Revision 1.153  2008/01/24 04:01:26  troy.sadkowsky
 *     bug fix for new agent display
 *
 *     Revision 1.152  2008/01/21 14:01:06  troy.sadkowsky
 *     remove add level q
 *
 *     Revision 1.151  2008/01/14 23:16:14  troy.sadkowsky
 *     layout fix
 *
 *     Revision 1.150  2007/12/04 06:20:48  ray.welburn
 *     Search in job location not searching keywords
 *
 *     Revision 1.149  2007/12/04 01:44:53  troy.sadkowsky
 *     removed old code
 *
 *     Revision 1.148  2007/11/29 06:44:59  ray.welburn
 *     New icons for rules
 *
 *     Revision 1.147  2007/11/27 03:42:41  ray.welburn
 *     Modified for new agentexamples object
 *
 *     Revision 1.146  2007/11/25 22:29:40  troy.sadkowsky
 *     read only rules
 *
 *     Revision 1.145  2007/11/12 06:32:54  ray.welburn
 *     util references changed to static references
 *
 *     Revision 1.144  2007/11/12 04:00:03  ray.welburn
 *     Search results returned restricted to 10 matched jsm's
 *
 *     Revision 1.143  2007/11/11 07:36:08  ray.welburn
 *     LHS menu not remembering selection when changing tabs
 *
 *     Revision 1.142  2007/11/09 05:19:04  troy.sadkowsky
 *     removed old code
 *
 *     Revision 1.141  2007/10/25 03:51:47  troy.sadkowsky
 *     renamed admin section to misc
 *
 *     Revision 1.140  2007/10/15 05:59:15  troy.sadkowsky
 *     copy paste rules
 *
 *     Revision 1.139  2007/10/10 05:30:37  ray.welburn
 *     remove redundant role code
 *
 *     Revision 1.138  2007/10/03 23:05:42  troy.sadkowsky
 *     new images
 *
 *     Revision 1.137  2007/10/03 13:25:52  troy.sadkowsky
 *     new images
 *
 *     Revision 1.136  2007/10/03 12:00:27  troy.sadkowsky
 *     fix for log in once requirement
 *
 *     Revision 1.135  2007/10/03 07:12:18  ray.welburn
 *     Images moved to Occideaslib and links used for project access to images
 *
 *     Revision 1.134  2007/09/27 07:03:36  ray.welburn
 *     Reorganise roles and permissions & remove redundant code
 *
 *     Revision 1.133  2007/09/25 02:47:35  ray.welburn
 *     Interviews project changed to Studies
 *
 *     Revision 1.132  2007/09/21 14:39:22  troy.sadkowsky
 *     new button Images
 *
 *     Revision 1.131  2007/09/20 12:11:12  ray.welburn
 *     Cleaning up rules page
 *
 *     Revision 1.130  2007/09/13 06:35:43  ray.welburn
 *     ActionButton Class made public and used in all projects
 *
 *     Revision 1.129  2007/09/13 03:37:58  ray.welburn
 *     Refactor maxminimise of Q&A's and put functionality into JSM object
 *
 *     Revision 1.128  2007/09/12 04:53:13  ray.welburn
 *     Redundant code removed
 *
 *     Revision 1.127  2007/09/11 23:03:09  troy.sadkowsky
 *     incorporate top menu with permissions
 *
 *     Revision 1.126  2007/09/05 09:02:34  troy.sadkowsky
 *     new button Images
 *
 *     Revision 1.125  2007/09/04 23:29:13  troy.sadkowsky
 *     fixed move up and down (was deleting jsms)
 *
 *     Revision 1.124  2007/08/31 05:54:44  ray.welburn
 *     *** empty log message ***
 *
 *     Revision 1.123  2007/08/29 12:15:04  ray.welburn
 *     Enable select all option for permissions checkboxes in roles
 *
 *     Revision 1.122  2007/08/28 23:33:42  ray.welburn
 *     Action buttons now disabled if not enavled
 *
 *     Revision 1.121  2007/08/25 01:18:12  ray.welburn
 *     Revamp of action buttons to allow users to see what they don't have permission to do and to make subsequent changes easier
 *
 *     Revision 1.120  2007/08/23 23:39:00  ray.welburn
 *     Modified for add new user
 *
 *     Revision 1.119  2007/08/23 02:25:29  ray.welburn
 *     Apply "loading..." timer onclick  to all hrefs
 *
 *     Revision 1.118  2007/08/22 06:07:32  ray.welburn
 *     Modified action buttons for agent edit view to show only update agents and logout
 *
 *     Revision 1.117  2007/08/22 05:22:22  ray.welburn
 *     Removal of commented out code
 *
 *     Revision 1.116  2007/08/20 11:53:32  troy.sadkowsky
 *     show agent rules fix
 *
 *     Revision 1.115  2007/08/19 13:06:36  troy.sadkowsky
 *     show search box first in row
 *
 *     Revision 1.114  2007/08/19 06:43:42  troy.sadkowsky
 *     moved tabs to right
 *
 *     Revision 1.113  2007/08/19 00:32:07  ray.welburn
 *     Update to Validation of AJSM linked JSMs
 *
 *     Revision 1.112  2007/08/17 13:53:10  troy.sadkowsky
 *     style updates
 *
 *     Revision 1.111  2007/08/16 23:43:14  ray.welburn
 *     Functionality added to allow colapsing of first 9 levels of question (and answers) in a JSM structural, agent and search view
 *
 *     Revision 1.110  2007/08/14 23:16:42  troy.sadkowsky
 *     bug fix for agent updates
 *
 *     Revision 1.109  2007/08/13 00:20:55  troy.sadkowsky
 *     share jsms
 *
 *     Revision 1.108  2007/08/09 04:47:41  ray.welburn
 *     When changing to structure view, if the JSMType has not been set then default it to "JSMs" type
 *
 *     Revision 1.107  2007/08/08 23:55:04  troy.sadkowsky
 *     views for share jsms feature
 *
 *     Revision 1.106  2007/08/08 02:37:51  ray.welburn
 *     Correct error preventing Update Agents Action button working - modifies updateAgents to updateAgents.x
 *
 *     Revision 1.105  2007/08/06 02:08:51  troy.sadkowsky
 *     show un allocated job titles if no job titles allocated
 *
 *     Revision 1.104  2007/08/04 03:12:21  troy.sadkowsky
 *     removed old code and show rules view
 *
 *     Revision 1.103  2007/08/03 08:49:04  ray.welburn
 *     Move update agents button to RHS menu and show appropriately
 *
 *     Revision 1.102  2007/08/03 01:19:51  ray.welburn
 *     Action button list only shows import and logout in import screen and import button removed from main body
 *
 *     Revision 1.101  2007/08/02 09:08:39  troy.sadkowsky
 *     separate rule creation from viewing mjsm
 *
 *     Revision 1.100  2007/08/01 07:02:19  ray.welburn
 *     Update to show AJSMs in LHS menu when clicking on ajsm hyperlink in structure view
 *
 *     Revision 1.99  2007/07/30 12:23:50  ray.welburn
 *     //if the linkAJSM button is pressed only show logout action button
 *
 *     Revision 1.98  2007/07/28 07:41:43  ray.welburn
 *     //Flush contents of JSMs array after use
 *             request.getSession().setAttribute("JSMs", null);
 *
 *     Revision 1.97  2007/07/28 01:34:40  troy.sadkowsky
 *     agent description updates and clean mql
 *
 *     Revision 1.96  2007/07/19 05:26:51  troy.sadkowsky
 *     remove factrequirement code
 *
 *     Revision 1.95  2007/07/13 05:40:16  Jeff.Keys
 *     case sensitive search count
 *     show search count
 *
 *     Revision 1.94  2007/07/08 23:22:11  Jeff.Keys
 *     ordered jsm searches
 *
 *     Revision 1.93  2007/07/04 07:17:28  Jeff.Keys
 *     hide search function
 *
 *     Revision 1.92  2007/07/03 07:36:05  Jeff.Keys
 *     search clean up
 *
 *     Revision 1.91  2007/06/30 08:12:57  Jeff.Keys
 *     edit jsms
 *
 *     Revision 1.90  2007/06/30 02:58:00  Jeff.Keys
 *     questionnaire searches -agents
 *
 *     Revision 1.89  2007/06/28 15:04:57  Jeff.Keys
 *     showProgress wait
 *
 *     Revision 1.88  2007/06/28 14:41:24  Jeff.Keys
 *     questionnaire searches -structure
 *
 *     Revision 1.87  2007/06/28 11:31:42  Jeff.Keys
 *     loading prompt for search
 *
 *     Revision 1.86  2007/06/28 08:27:21  Jeff.Keys
 *     loading prompt for search
 *
 *     Revision 1.85  2007/06/28 07:31:30  Jeff.Keys
 *     questionnaire searches -jsms
 *
 *     Revision 1.84  2007/06/21 08:54:18  Troy.Sadkowsky
 *     restructure logic for searches and maintainability
 *
 */

package com.researchit.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.researchit.AgentExample;
import com.researchit.AgentGroup;
import com.researchit.Interview;
import com.researchit.JobHistory;
import com.researchit.JobSpecificModule;
import com.researchit.PossibleAnswer;
import com.researchit.Question;
import com.researchit.User;
import com.researchit.Util;
import com.researchit.User.Permission;
import com.researchit.common.Study;
import com.researchit.expert.ExpertAgent;
import com.researchit.expert.ExpertRule;
import com.researchit.html.ActionButton;
import com.researchit.html.HTMLObject;
import com.researchit.html.InterviewManagementSystem;
import com.researchit.html.MasterQuestionList;

/**
 * Servlet implementation class for Servlet: ControllerServlet
 * 
 * @web.servlet name="ControllerServlet" display-name="ControllerServlet"
 * 
 * @web.servlet-mapping url-pattern="/ControllerServlet"
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
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
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
			if (request.getAttribute("cookieConnect")!=null){
				if(request.getAttribute("username")!=null){
					String username = request.getAttribute("username").toString();
					if(request.getAttribute("password")!=null){
						String password = request.getAttribute("password").toString();
						User theUser = new User(username, password);
						if (theUser.hasPermission(User.Permission.QUESTIONNAIRELOGIN))  {
							request.getSession().setAttribute("UserObject", theUser);
						}						
					}
				}
			}
			if (request.getSession().getAttribute("UserObject") != null) {
				int iLocation = this.getLocationInt(request);
				if (request.getAttribute("printView") != null) {
					response.getWriter().println(" <td valign=top class=Content>");
					response.getWriter().println(" <!-- Contents -->");		
					this.showMainTable(request, response, iLocation);
				} else {
					if (request.getAttribute("Import") != null) {
						response.getWriter().println("<FORM action=ImportJSMServlet method=POST enctype=\"multipart/form-data\">");
					} else {
						response.getWriter().println("<form action=ControllerServlet method=post id=controllerpost>");
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
					response.getWriter().println(" <td valign=top>");
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
					if (request.getAttribute("printView") == null) {
						if(request.getSession().getAttribute("MinActionButtons")!=null){
							response.getWriter().println(this.showActionButtonsMinimized(request, iLocation));		
						}else{
							response.getWriter().println(this.showActionButtons(request, iLocation));		
						}							
					}		
					response.getWriter().println("</td>");
					response.getWriter().println("</tr>");
					response.getWriter().println(" </table> ");			
					response.getWriter().println("</form>");
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
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("errorMessage", e.getMessage());
			RequestDispatcher dis = request.getRequestDispatcher("errorpage.jsp");
			dis.forward(request, response);
		}
	}

	private void showLHSMenu(HttpServletRequest request, HttpServletResponse response, int iLocation) throws Exception {
		if ((iLocation == 0)) {// JSMS
			this.showLHSJSMs(request, response);
		} else if ((iLocation == 1)) {// Structure
			this.showLHSJSMs(request, response);
		} else if ((iLocation == 2)) {// agents
			this.showLHSJSMWithAgents(request, response);
		} else if ((iLocation == 3)) {// jobs
			this.showLHSJSMs(request, response);
		}else if ((iLocation == 4)) {// demo
			this.showLHSJSMs(request, response);
		}
	}
	private void showLHSJSMWithAgents(HttpServletRequest request, HttpServletResponse response) throws Exception {
		User user = (User) request.getSession().getAttribute("UserObject");
		MasterQuestionList mql = new MasterQuestionList();
		JobSpecificModule jsm = new JobSpecificModule();
		String jsmID = "";
		String strAgentId = "";
		String jsmType = "";
		if (request.getSession().getAttribute("JSMType") != null) {
			jsmType = request.getSession().getAttribute("JSMType").toString();
		}
		boolean bAddAgent = false;
		if(user.hasPermission(User.Permission.ADDAGENT)){
			bAddAgent = true;
		}
		response.getWriter().println(mql.showLHSMTabs(jsmType, bAddAgent, null,user));
		if (request.getSession().getAttribute("JSMID") != null) {
			jsmID = request.getSession().getAttribute("JSMID").toString();
			jsm = new JobSpecificModule(jsmID);
			if (request.getSession().getAttribute("AgentID") != null) {
				strAgentId = request.getSession().getAttribute("AgentID").toString();
				ExpertAgent agent = new ExpertAgent(strAgentId);
				if (request.getSession().getAttribute("ShowRules") != null) {
					ExpertRule.RuleOutcome outcome = null;					
					if (request.getSession().getAttribute("Outcome") != null) {
						String ruleType = request.getSession().getAttribute("Outcome").toString();
						outcome = ExpertRule.RuleOutcome.valueOf(ruleType);
					}	
					boolean validate = false;
					response.getWriter().println(mql.showLHSAgentsRules(jsm, agent, outcome,validate));
				} else {
					response.getWriter().println(mql.showJSMWithAgents(jsm, strAgentId));
				}
			} else {
				response.getWriter().println(mql.showJSMWithAgents(jsm, strAgentId));
			}
		} else {
			if (request.getSession().getAttribute("JSMType") != null) {
				//User user = (User) request.getSession().getAttribute("UserObject");
				jsmType = request.getSession().getAttribute("JSMType").toString();
				if (jsmType.equalsIgnoreCase("TAJSMs")) {
					response.getWriter().println(mql.showAllJSMs(jsmID, jsm.getTemplateAJSMs()));
				} else if (jsmType.equalsIgnoreCase("AJSMs")) {
					response.getWriter().println(mql.showAllJSMs(jsmID, jsm.getStudySpecificAJSMs(user.getId())));
				} else if (jsmType.equalsIgnoreCase("JSMs")) {
					response.getWriter().println(mql.showAllJSMs(jsmID, jsm.getStudySpecificJSMs(user.getId())));
				} else if (jsmType.equalsIgnoreCase("TJSMs")) {
					response.getWriter().println(mql.showAllJSMs(jsmID, jsm.getTemplateJSMs()));
				} else if (jsmType.equalsIgnoreCase("Agents")) {
					if (request.getSession().getAttribute("AgentID") != null) {
						strAgentId = request.getSession().getAttribute("AgentID").toString();
					}
					AgentGroup ag = new AgentGroup();
					ArrayList<AgentGroup> agentGroups = ag.getAgentGroups();
					response.getWriter().println(mql.showAllAgentGroups(strAgentId, agentGroups));
				}
			} else {
				if (request.getSession().getAttribute("AgentID") != null) {
					strAgentId = request.getSession().getAttribute("AgentID").toString();
				}
				AgentGroup ag = new AgentGroup();
				ArrayList<AgentGroup> agentGroups = ag.getAgentGroups();
				response.getWriter().println(mql.showAllAgentGroups(strAgentId, agentGroups));
			}
		}
	}
	private void showLHSJSMs(HttpServletRequest request, HttpServletResponse response) throws Exception {
		User user = (User) request.getSession().getAttribute("UserObject");
		MasterQuestionList mql = new MasterQuestionList();
		JobSpecificModule jsm = new JobSpecificModule();
		String jsmID = "";
		if (request.getSession().getAttribute("JSMID") != null) {
			jsmID = request.getSession().getAttribute("JSMID").toString();
		}
		String jsmType = "";
		if (request.getSession().getAttribute("JSMType") != null) {
			if (request.getSession().getAttribute("JSMType").toString().equalsIgnoreCase("Agents")) {
				request.getSession().setAttribute("JSMType","TAJSMs");
			}
			jsmType = request.getSession().getAttribute("JSMType").toString();
			response.getWriter().println(mql.showLHSMTabs(jsmType, false, null,user));
			if (jsmType.equalsIgnoreCase("TAJSMs")) {
				response.getWriter().println(mql.showAllJSMs(jsmID, jsm.getTemplateAJSMs()));
			} else if (jsmType.equalsIgnoreCase("AJSMs")) {
				response.getWriter().println(mql.showAllJSMs(jsmID, jsm.getStudySpecificAJSMs(user.getId())));
			} else if (jsmType.equalsIgnoreCase("JSMs")) {
				response.getWriter().println(mql.showAllJSMs(jsmID, jsm.getStudySpecificJSMs(user.getId())));				
			} else if (jsmType.equalsIgnoreCase("TJSMs")) {
				response.getWriter().println(mql.showAllJSMs(jsmID, jsm.getTemplateJSMs()));
			}
		} else {
			response.getWriter().println(mql.showLHSMTabs(jsmType, false, null,user));
			response.getWriter().println(mql.showAllJSMs(jsmID, jsm.getTemplateJSMs()));
		}
	}
	public void showTopMenu(HttpServletRequest request,HttpServletResponse response) throws Exception {
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
		response.getWriter().println("<tr><td>&nbsp;</td><td class=small style='color:black;'>Welcome "+user.getUserName()+"</td><td>&nbsp;</td><td>&nbsp;</td><td>&nbsp;</td><td>&nbsp;</td><td>&nbsp;</td><td rowspan=2 class=topmenu align=right title='"+HTMLObject.getSystemVersion()+"'><a href=http://www.occideas.org target=_top><img src='ImageStream?ImageName=occideas.jpg' border=0 onclick=\"return showProgress()\"></img></a></td></tr>");
		response.getWriter().println("<tr>");
		response.getWriter().println("<td width=5px>&nbsp;</td><td valign=center background='ImageStream?ImageName=maintab.gif' align=center width=200px >Questionnaire</td>");
		if(user.hasPermission(User.Permission.STUDIESLOGIN)){
			response.getWriter().println("<td width=5px>&nbsp;</td><td valign=center background='ImageStream?ImageName=maintabunselected.gif' width=200px align=center ><a class=TopMenu href=../"+prefix+"Studies/ValidateServlet?sid="+request.getSession().getId()+"&u="+user.getEncryptedId()+"&p="+user.getPassword()+" onclick=\"return showProgress()\">Studies</a></td><td  width=5px>&nbsp;</td>");			
		}
		if(user.hasPermission(User.Permission.ASSESSMENTLOGIN)){
			response.getWriter().println("<td width=5px>&nbsp;</td><td valign=center align=center background='ImageStream?ImageName=maintabunselected.gif' width=200px><a class=TopMenu href=../"+prefix+"Assessment/ValidateServlet?sid="+request.getSession().getId()+"&u="+user.getEncryptedId()+"&p="+user.getPassword()+" onclick=\"return showProgress()\">Assessment</a></td><td  width=width=180px>&nbsp;</td>");
		}
		response.getWriter().println("</tr>");
		response.getWriter().println("</table>");
	}
	private void showHeaderMenu(HttpServletRequest request,HttpServletResponse response, int iLocation) throws Exception {
		//show the top blue system tabs
		this.showTopMenu(request,response);
				
		String searchBar = "";
		response.getWriter().println("<table cellspacing=0 cellpadding=0 width=100%>");
		response.getWriter().println(" <tr><td width=100% height=5px class=topCurves colspan=10></td></tr>");
        response.getWriter().println("<tr>");
        response.getWriter().println("<td width=50px >&nbsp;</td>");
		if (request.getAttribute("Import") == null) {
			String strLocation = "";
			if (request.getSession().getAttribute("Location") != null) {
				strLocation = request.getSession().getAttribute("Location").toString();
			}
			boolean showSearch = true;
			// if Agents tab is clicked then do a search only if both the JSMID
			// and AgentID contain null values
			if (strLocation.equalsIgnoreCase("Agents")) {
				if (request.getSession().getAttribute("ShowRules") != null) {
					showSearch = false;
				}
			}
			if (showSearch) {
				String strSearch = "Word Search";
				if (request.getSession().getAttribute("Search") != null) {
					strSearch = request.getSession().getAttribute("Search").toString();
				}
				searchBar = "<td class=SearchButton align=right style='padding-right:10px;'><table cellpadding=0 cellspacing=0><tr><td><input type=text size=20 name=searchString onfocus=\"clearText(this);\" value=\""
										+ strSearch
										+ "\" /></td><td style='background-color:white;' title='Search'><input type=image src='ImageStream?ImageName=search.gif' name=Search alt='Search' onclick=\"showProgress()\" /></td><td style='background-color:white;' title='Clear Search'><input type=image src='ImageStream?ImageName=clearsearch.gif' name=Clear alt='Clear' /></td></tr></table></td>";
			}
		}		
		String[] list = new String[4];
		list[0] = "JSMs";
		list[1] = "Structure";
		list[2] = "Agents";
		list[3] = "Jobs";
		response.getWriter().println("<td><table cellpadding=0 cellspacing=0><tr>");
		for (int i = 0; i < list.length; i++) {
			//Set default tab status as unselected
			String strBackgroundImage = "background='ImageStream?ImageName=locationtabunselected.gif'";
			String linkClass = "class=TopMenu";
//			if this is the selected tab...
			if (iLocation == i) {
				strBackgroundImage = "background='ImageStream?ImageName=locationtab.gif'";
				linkClass = "";
			}
			//Create the tab and href to appropriate location (show a progreess bar if necessary)
			response.getWriter().println("<td class=YellowTab " + strBackgroundImage
						+ " align=center><a "+linkClass+" href=main.jsp?Location="
						+ list[i] + "&jsmType=" + request.getSession().getAttribute("JSMType")+ " onclick=\"return showProgress()\">" + list[i]
						                                                         + "</a>&nbsp;&nbsp;</td>");
			response.getWriter().println("<td width=2px >&nbsp;</td>");
		}
		response.getWriter().println("</tr></table></td>");
		response.getWriter().println(searchBar);
		response.getWriter().println("</tr></table>");									
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
		response.getWriter().print(ims.showLogin(strUsername, strPassword, checked, strError));
	}
	private void showMainTable(HttpServletRequest request, HttpServletResponse response, int iLocation) throws Exception {
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
			case 0: { // JSMs
				this.showJSMsLocation(request, response);
				break;
			}
			case 1: { // structure
				// show Edit All Mode
				this.showStructureLocation(request, response);
				break;
			}
			case 2: {
				// show all chemicals
				this.showAgentLocation(request, response);
				break;
			}
/*			case 3: { // Jobs
				this.showJobLocation(request, response);
				break;
			}*/
			case 4: { // Demo Intro
				this.showDemoIntro(request, response);
				break;
			}
			default: {
				response.getWriter().print("Error: Unknown Location");
			}
		}	
		response.getWriter().println("</div>");
		response.getWriter().println("</td>");
		
		response.getWriter().println("</tr>");
		response.getWriter().println("</table>");
		if (request.getAttribute("printView") == null) {
			String strCheckedIDsList = "";
			HttpSession ses = request.getSession();
			if (ses.getAttribute("stringCheckedIDsList") != null) {
				strCheckedIDsList = ses.getAttribute("stringCheckedIDsList").toString();
			}
			response.getWriter().println("<input type=hidden id=checkedIDsList value='"+ strCheckedIDsList + "'></input>");
		}
	}
	@SuppressWarnings("unchecked")
	private void showStructureLocation(HttpServletRequest request, HttpServletResponse response) throws Exception {
		User user = (User) request.getSession().getAttribute("UserObject");
		MasterQuestionList mql = new MasterQuestionList();
		ArrayList<Object> arrayL = new ArrayList<Object>();
		arrayL.add(request.getSession().getAttribute("PageURL").toString());
		arrayL.add("Structure");
		String strSearch = "";
		if (request.getSession().getAttribute("JSMID") != null) {
			// A JSM has been selected
			String jsmID = request.getSession().getAttribute("JSMID").toString();
			JobSpecificModule jsm = new JobSpecificModule(jsmID);
			arrayL.add(jsm);
			if (request.getSession().getAttribute("QuestionIDs") != null) {
				// Questions have been selected and edit button clicked
				String questionIds = request.getSession().getAttribute("QuestionIDs").toString();
				arrayL.add("Add_Edit");
				response.getWriter().println(mql.showNavTitle(arrayL));
				response.getWriter().println(mql.showEditQuestions(questionIds, user));
			} else if (request.getAttribute("linkAJSM") != null) {
				// The Link AJSM button has been clicked
				arrayL.add("Link AJSM");
				PossibleAnswer pa = new PossibleAnswer();
				if (request.getSession().getAttribute("PossibleAnswerID") != null) {
					String paID = request.getSession().getAttribute("PossibleAnswerID").toString();
					pa = new PossibleAnswer("", paID);
				}
				response.getWriter().println(mql.showNavTitle(arrayL));
				//pa.setJsmID(jsmID);
				response.getWriter().println(mql.showLinkAJSM(pa, user.getId(),jsmID));
			} else {
				// not editing questions
				ArrayList<String> minimisedQuestionIds = new ArrayList<String>();
				ArrayList<Question> qs = jsm.getQuestions();
				if (request.getSession().getAttribute("minimisedQuestionIds") != null) {
					minimisedQuestionIds = (ArrayList<String>) request.getSession().getAttribute("minimisedQuestionIds");
				}
				jsm.setShowHideQuestionsAnswers(minimisedQuestionIds);
				//setShowHideQuestionsAnswers(minimisedQuestionIds, qs);
				if (request.getAttribute("printView") != null) {
					// show print view
					arrayL.add("Print View");
					response.getWriter().println(mql.showNavTitle(arrayL));
					response.getWriter().println(mql.showFullQuestions(qs, "", false, true, false,""));
				} else if (request.getSession().getAttribute("Search") != null) {
					strSearch = request.getSession().getAttribute("Search").toString();
					arrayL.add("Searched");
					arrayL.add("Searched on <span class=searchHighlight>"
							+ strSearch + "</span>");
					response.getWriter().println(mql.showNavTitle(arrayL));
					if (jsm.containsSearch(strSearch)) {
						response.getWriter().println(mql.showSearchedCount(jsm));
						response.getWriter().println(mql.showSearchedFullQuestions(qs, strSearch,false));
					} else {
						response.getWriter().println("<em>"
												+ jsm.getName()
												+ " has no questions or answers containing "
												+ strSearch + "</em>");
					}
				} else {
					response.getWriter().println(mql.showNavTitle(arrayL));

					if (request.getSession().getAttribute("GlobalMinMax") != null) {
						response.getWriter().println(mql.showGlobalMinMax(request.getSession().getAttribute("GlobalMinMax").toString()));	
					}else{
						response.getWriter().println(mql.showGlobalMinMax("maximise"));	
					}
					response.getWriter().println(mql.showFullQuestions(qs, strSearch, false, true));
				}
			}
		} else if (request.getSession().getAttribute("Search") != null) {
			strSearch = request.getSession().getAttribute("Search").toString();
			arrayL.add("Searched");
			arrayL.add("Searched on <span class=searchHighlight>" + strSearch
					+ "</span>");
			response.getWriter().println(mql.showNavTitle(arrayL));
			ArrayList<JobSpecificModule> jsmA = new JobSpecificModule().getSearchedJSMs(strSearch, true);
			ArrayList<String> minimisedQuestionIds = new ArrayList<String>();
			if (request.getSession().getAttribute("minimisedQuestionIds") != null) {
				minimisedQuestionIds = (ArrayList<String>) request.getSession().getAttribute("minimisedQuestionIds");
			}
			if (!jsmA.isEmpty()) {
				jsmA = Util.mergeSort(jsmA);
				String retVal = "";
				for (JobSpecificModule jsm : jsmA) {
					ArrayList<Question> qs = jsm.getQuestions();
					jsm.setShowHideQuestionsAnswers(minimisedQuestionIds);
					retVal += mql.showSearchedCount(jsm);
					retVal += mql.showJSMHeaderStructure(jsm);
					retVal += mql.showSearchedFullQuestions(qs, strSearch,false);
				}
				response.getWriter().println(retVal);
			} else {
				response.getWriter().println("<em> No matching questions or answers</em>");
			}
		} else {
			response.getWriter().println(mql.showNavTitle(arrayL));
			response.getWriter().println("<br><br><br><table><tr><td>Please choose a JSM to view the structure</td></tr></table>");
		}
	}
	private void showDemoIntro(HttpServletRequest request, HttpServletResponse response) throws Exception {		
		MasterQuestionList mql = new MasterQuestionList();
		//int iLocation = this.getLocationInt(request);
		//this.showActionButtons(request, iLocation);								
		response.getWriter().println(mql.showDemoIntro());		
	}
/*	@SuppressWarnings("unchecked")
	private void showJobLocation(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ArrayList<Object> arrayL = new ArrayList<Object>();
		arrayL.add(request.getSession().getAttribute("PageURL").toString());
		arrayL.add("Jobs");
		String strHTML = "";
		String search = "";
		MasterQuestionList mql = new MasterQuestionList();
		//int iLocation = this.getLocationInt(request);
		//this.showActionButtons(request, iLocation);
		ArrayList<JobTitle> jobs = new ArrayList<JobTitle>();
		if (request.getSession().getAttribute("jobs") != null) {
			jobs = (ArrayList<JobTitle>)request.getSession().getAttribute("jobs");
			arrayL.add("Edit");
			response.getWriter().print(mql.showNavTitle(arrayL));
			String jsmID = null;
			if (request.getSession().getAttribute("JSMID") != null) {
				jsmID = request.getSession().getAttribute("JSMID").toString();
			}
			response.getWriter().print(mql.showEditJobs(jobs, jsmID));
		} else {
			if (request.getSession().getAttribute("JSMID") != null) {
				String jsmID = request.getSession().getAttribute("JSMID").toString();
				JobSpecificModule jsm = new JobSpecificModule(jsmID);
				arrayL.add(jsm);
				if (request.getSession().getAttribute("Search") != null) {
					search = request.getSession().getAttribute("Search").toString();
					arrayL.add("Searched on " + search);
				}				
				if(jsm.getJobs().size()==0){
					String sql = "SELECT id,name,description,jsmid FROM jobtitle WHERE jsmid IS NULL ORDER BY name";
					JobTitle jt = new JobTitle();
					arrayL.add("Jobs Not Allocated Yet");
					strHTML = mql.showNavTitle(arrayL);	
					strHTML += mql.showJobsWithJSM(jt.getJobTitlesWithJSMs(sql), search);
				}else{
					strHTML = mql.showNavTitle(arrayL);				
					strHTML += mql.showJobsWithJSM(jsm.getJobs(), search);
				}
			} else if (request.getSession().getAttribute("Search") != null) {
				search = request.getSession().getAttribute("Search").toString();
				arrayL.add("Searched on " + search);
				JobTitle jt = new JobTitle();
				String sql = "SELECT jobtitle.id FROM jobtitle left join keyword " +
						"ON jobtitle.id = keyword.jobtitleid " +
						"WHERE jobtitle.name LIKE '%" + search + "%' " +
						"OR jobtitle.description LIKE '%" + search + "%' " +
						"OR keyword.name LIKE '%" + search + "%' " +
						"OR keyword.description LIKE '%" + search + "%' ";
				strHTML = mql.showNavTitle(arrayL);
				if(request.getSession().getAttribute("JobHistoryId")!=null){
					String jhId = request.getSession().getAttribute("JobHistoryId").toString();
					JobHistory jh = new JobHistory(jhId);
		            String searchJobsLinkBack = "<a href=../Studies/main.jsp?cookieconnect=true&Location=Job_Calendars&participantID="+jh.getParticipantId()+">Link Back to Job Calendar</a>";
					strHTML += searchJobsLinkBack;
				}
				strHTML += mql.showJobsWithJSM(jt.getJobTitles(sql), search);
			} else {
				String sql = "SELECT id,name,description,jsmid FROM jobtitle ORDER BY name";
				JobTitle jt = new JobTitle();
				strHTML = mql.showNavTitle(arrayL);
				strHTML += mql.showJobsWithJSM(jt.getJobTitlesWithJSMs(sql),"");
			}
			response.getWriter().print(strHTML);
		}
	}*/
	@SuppressWarnings("unchecked")
	private void showAgentLocation(HttpServletRequest request, HttpServletResponse response) throws Exception {
		MasterQuestionList mql = new MasterQuestionList();
		ArrayList<Object> arrayL = new ArrayList<Object>();
		//String mode = "view";
		arrayL.add(request.getSession().getAttribute("PageURL").toString());
		arrayL.add("Agents");
		String strSearch = "";
		if (request.getSession().getAttribute("QuestionIDs") != null) {
			// show the edit agent-question associations view
			String questionIds = "";
			if (request.getSession().getAttribute("QuestionIDs") != null) {
				questionIds = request.getSession().getAttribute("QuestionIDs").toString();
				arrayL.add("Edit Agents");
			}
			response.getWriter().println(mql.showNavTitle(arrayL));
			response.getWriter().println(mql.showEditAgents(questionIds));
		} else {
			if (request.getSession().getAttribute("JSMID") != null) {
				// A jsm has been selected
				String jsmID = request.getSession().getAttribute("JSMID").toString();
				JobSpecificModule jsm = new JobSpecificModule(jsmID);
				arrayL.add(jsm);
				ArrayList<String> minimisedQuestionIds = new ArrayList<String>();
				// look for minimised questions
				if (request.getSession().getAttribute("minimisedQuestionIds") != null) {
					minimisedQuestionIds = (ArrayList<String>) request.getSession().getAttribute("minimisedQuestionIds");
				// apply the minimised flag to those qs that are minimised
					jsm.setShowHideQuestionsAnswers(minimisedQuestionIds);
				}
				if (request.getSession().getAttribute("AgentID") != null) {
					// An agent has been selected
					String agentId = request.getSession().getAttribute("AgentID").toString();
					ExpertAgent agent = new ExpertAgent(agentId);
					arrayL.add(agent);

					if (request.getSession().getAttribute("Outcome") != null) {
						// a rule type has been selected
						String ruleLevelTypeId = request.getSession().getAttribute("Outcome").toString();
						
						ExpertRule er = new ExpertRule();
						//ExpertRule levelExpertRule = new ExpertRule();
						if (request.getSession().getAttribute("RuleID") != null) {
							// a probabilty rule has been selected
							String ruleId = request.getSession().getAttribute("RuleID").toString();
							er = new ExpertRule(ruleId);
						}
						if (er.getId().equalsIgnoreCase("")) {
							// no probability rule selected so show first rule
							if (agent.getValidRules(ExpertRule.RuleOutcome.valueOf(ruleLevelTypeId), jsm.getId()).size() > 0) {
								er = agent.getValidRules(ExpertRule.RuleOutcome.valueOf(ruleLevelTypeId), jsm.getId()).get(0);							
								request.getSession().setAttribute("RuleID",er.getId());
							}
						}
						arrayL.add(er);
						response.getWriter().println(mql.showNavTitle(arrayL));
						User user = (User) request.getSession().getAttribute("UserObject");
						if(user.hasPermission(Permission.EDITRULES) && request.getSession().getAttribute("editRuleMode") != null){
							boolean bValid = true;
							if(request.getParameter("invalidRules")!=null){
								bValid = false;
							}
							response.getWriter().println(mql.showRulesView(agent, er, jsm,bValid));
						}else{
							response.getWriter().println(mql.showRulesViewReadOnly(agent, er, jsm));
						}						
					} else {
						//View Rules button is clicked
						if (request.getSession().getAttribute("ShowRules") != null) {							
							response.getWriter().println(mql.showNavTitle(arrayL));
							if (request.getSession().getAttribute("minimisedQuestionIds") != null) {
								minimisedQuestionIds = (ArrayList<String>) request.getSession().getAttribute("minimisedQuestionIds");
							}
							jsm.getMjsmsQuestions(agentId);
							jsm.setShowHideQuestionsAnswers(minimisedQuestionIds);
							if (request.getSession().getAttribute("GlobalMinMax") != null) {
								response.getWriter().println(mql.showGlobalMinMax(request.getSession().getAttribute("GlobalMinMax").toString()));	
							}else{
								response.getWriter().println(mql.showGlobalMinMax("maximise"));	
							}
							response.getWriter().println(mql.showFullQuestionsAgentView(jsm.getQuestions(),agent, true));
							
						} else {
							// do not show rules
							response.getWriter().println(mql.showNavTitle(arrayL));
							// show the structure of the jsm related to the
							// agent selected
							if (request.getSession().getAttribute("minimisedQuestionIds") != null) {
								minimisedQuestionIds = (ArrayList<String>) request.getSession().getAttribute("minimisedQuestionIds");
							}
							jsm.getMjsmsQuestions(agentId);
							jsm.setShowHideQuestionsAnswers(minimisedQuestionIds);
							response.getWriter().println(mql.showFullQuestionsAgentView(jsm.getQuestions(),agent, false));
						}
					}
				} else {
					// no agent selected
					if (request.getSession().getAttribute("Search") != null) {
						strSearch = request.getSession().getAttribute("Search").toString();
						arrayL.add("Searched on " + strSearch);
						response.getWriter().println(mql.showNavTitle(arrayL));
						if (request.getSession().getAttribute("GlobalMinMax") != null) {
							response.getWriter().println(mql.showGlobalMinMax(request.getSession().getAttribute("GlobalMinMax").toString()));	
						}else{
							response.getWriter().println(mql.showGlobalMinMax("maximise"));	
						}
						response.getWriter().println(mql.showFullQuestions(jsm.getQuestions(), strSearch,true, true, true, strSearch));
					} else if (request.getAttribute("ValidateMode") != null) {						
						arrayL.add("Validate Mode");
						response.getWriter().println(mql.showNavTitle(arrayL));
						response.getWriter().println(mql.showValidationReport(jsm));
					} else {
						// show full jsm structure with agent associations
						response.getWriter().println(mql.showNavTitle(arrayL));
						
						if (request.getSession().getAttribute("GlobalMinMax") != null) {
							response.getWriter().println(mql.showGlobalMinMax(request.getSession().getAttribute("GlobalMinMax").toString()));	
						}else{
							response.getWriter().println(mql.showGlobalMinMax("maximise"));	
						}						
						response.getWriter().println(mql.showFullQuestions(jsm.getQuestions(),strSearch, true, true));
					}
				}
			} else {
				if (request.getSession().getAttribute("AgentID") != null) {
					String agentId = request.getSession().getAttribute("AgentID").toString();
					AgentGroup agent = new AgentGroup(agentId);
					Boolean addExample = false;
					if (request.getAttribute("EditMode") != null) {
						arrayL.add("Edit");
					//Edit TLV page	
						if (request.getParameter("removeexample") != null) {
							AgentExample ae = new AgentExample(request.getAttribute("ExampleId").toString(),Integer.parseInt(agentId));
							agent.deleteExample(ae);
							ae.delete();					
						}						
						if(request.getAttribute("AddExample") != null) {
							addExample = true; 
						}						
						response.getWriter().println(mql.showNavTitle(arrayL));
						response.getWriter().println(mql.showAgentGroupEdit(agent, addExample));
					} else if (request.getSession().getAttribute("ListMode") != null) {
						//Non-edit mode for Agent TLV
						if (request.getSession().getAttribute("Search") != null) {
							strSearch = request.getSession().getAttribute("Search").toString();
						}
						response.getWriter().println(mql.showNavTitle(arrayL));
						response.getWriter().println(mql.showAgentGroup(agent, strSearch));
					} else if ((request.getSession().getAttribute("ViewMode") != null) || ((request.getSession().getAttribute("ViewMode") == null))){
						if (request.getSession().getAttribute("Search") != null) {
							strSearch = request.getSession().getAttribute("Search").toString();
						}
						response.getWriter().println(mql.showNavTitle(arrayL));
						response.getWriter().println(mql.showAgentGroupView(agent, strSearch));
					}
				} else {
					AgentGroup ag = new AgentGroup();
					if (request.getSession().getAttribute("EditMode") != null) {
						arrayL.add("Edit");
						response.getWriter().println(mql.showNavTitle(arrayL));
						response.getWriter().println(mql.showAgentGroupEdit(ag, false));
					} else if (request.getSession().getAttribute("ListMode") != null){
						if (request.getSession().getAttribute("Search") != null) {
							// only search on agents
							strSearch = request.getSession().getAttribute("Search").toString();
							arrayL.add("Search for Agents containing "
									+ "<span class=searchHighlight>"
									+ strSearch + "</span>");
							response.getWriter().println(mql.showNavTitle(arrayL));
							AgentGroup searchAgents = new AgentGroup();
							ArrayList<AgentGroup> ags = searchAgents.getSearchedAgentGroups(strSearch);
							if (ags.isEmpty()) {
								response.getWriter().println("<em>No matching agents</em>");
							} else {
								response.getWriter().println(mql.showAgentGroupsList(ags,strSearch));
							}
						} else {
							response.getWriter().println(mql.showNavTitle(arrayL));
							response.getWriter().println(mql.showAgentGroupsList(ag.getAgentGroups(), strSearch));
						}
					} else if ((request.getSession().getAttribute("ViewMode") != null) || ((request.getSession().getAttribute("ViewMode") == null))){
						if (request.getSession().getAttribute("Search") != null) {
							// only search on agents
							strSearch = request.getSession().getAttribute("Search").toString();
							arrayL.add("Search for Agents containing "
									+ "<span class=searchHighlight>"
									+ strSearch + "</span>");
							response.getWriter().println(mql.showNavTitle(arrayL));
							AgentGroup searchAgents = new AgentGroup();
							ArrayList<AgentGroup> ags = searchAgents.getSearchedAgentGroups(strSearch);
							if (ags.isEmpty()) {
								response.getWriter().println("<em>No matching agents</em>");
							} else {
								response.getWriter().println(mql.showAgentGroupsView(ags,strSearch));
							}
						} else {
							response.getWriter().println(mql.showNavTitle(arrayL));
							response.getWriter().println(mql.showAgentGroupsView(ag.getAgentGroups(), strSearch));
						}
					}
				}
			}
		}
	}
	@SuppressWarnings("unchecked")
	private void showJSMsLocation(HttpServletRequest request, HttpServletResponse response) throws Exception {
		MasterQuestionList mql = new MasterQuestionList();
		ArrayList<Object> arrayL = new ArrayList<Object>();
		arrayL.add(request.getSession().getAttribute("PageURL").toString());
		arrayL.add("Job Specific Modules");
		ArrayList<JobSpecificModule> jsms = new ArrayList<JobSpecificModule>();
		if (request.getSession().getAttribute("JSMType") != null) {
			// a jsmtype has been selected
			if (request.getSession().getAttribute("JSMType").toString().equalsIgnoreCase("Agents")) {
				request.getSession().setAttribute("JSMType","TAJSMs");
			}
			String jsmType = request.getSession().getAttribute("JSMType").toString();
			if (jsmType.equalsIgnoreCase("TAJSMs")) {
				arrayL.add("Template AJSMs");
			} else if (jsmType.equalsIgnoreCase("AJSMs")) {
				arrayL.add("AJSMs");
			} else if (jsmType.equalsIgnoreCase("TJSMs")) {
				arrayL.add("Template JSMs");
			} else if (jsmType.equalsIgnoreCase("JSMs")) {
				arrayL.add("JSMs");
			}
		} else {
			// no jsmtype selected so show default of template jsms
			arrayL.add("Template JSMs");
		}
		if (request.getAttribute("Import") != null) {
			arrayL.add("Import");
			response.getWriter().println(mql.showNavTitle(arrayL));
			response.getWriter().println(mql.showImport());
		} else if (request.getSession().getAttribute("JSMID") != null) {
			// a jsm has been selected
			String jsmID = request.getSession().getAttribute("JSMID").toString();
			JobSpecificModule jsm = new JobSpecificModule(jsmID);
			arrayL.add(jsm);
				
			//get list of AJSMs
//			ArrayList<JobSpecificModule> associatedJSMs = new ArrayList<JobSpecificModule>(jsm.getAJSMAssociatedJSMs());
//			if (associatedJSMs.size() != 0) {	
//				//Set list of Associated JSMs
//				jsm.setJsmAssociates(mql.showList(associatedJSMs));				
//			}			
			if (request.getAttribute("EditMode") != null) {
				// show the jsm in edit mode
				arrayL.add("Edit");
				response.getWriter().println(mql.showNavTitle(arrayL));
				jsms.add(jsm);
				response.getWriter().println(mql.showEditJSMs(jsms));
			} else if(request.getSession().getAttribute("ShareJSMs") != null){
				arrayL.add("Share JSMs");
				response.getWriter().println(mql.showNavTitle(arrayL));
				String jsmIds = request.getSession().getAttribute("JSMIDs").toString();
				String strSearch = "";
				ArrayList<User> searchedUsers = null;
				if (request.getSession().getAttribute("Search") != null) {
					strSearch = request.getSession().getAttribute("Search").toString();
				}
				if (request.getSession().getAttribute("searchedusers") != null) {
					searchedUsers = (ArrayList<User>)request.getSession().getAttribute("searchedusers");
				}
				response.getWriter().println(mql.showUserJSMs(jsmIds, strSearch, searchedUsers));
				
			} else if (request.getSession().getAttribute("InterviewID") != null) {
				arrayL.add("Preview JSM Interview");
				response.getWriter().println(mql.showNavTitle(arrayL));InterviewManagementSystem ims = new InterviewManagementSystem();
				String interviewId = request.getSession().getAttribute("InterviewID").toString();
				String jhid = request.getSession().getAttribute("JobHistoryID").toString();
				JobHistory jh = new JobHistory(jhid);
				String studyId = request.getSession().getAttribute("StudyID").toString();
				Study study = new Study(studyId);
				Interview interview = new Interview(interviewId);
				if (request.getSession().getAttribute("NextQuestion") != null) {
					Question question = (Question)request.getSession().getAttribute("NextQuestion");
					question.setInterviewID(interview.getId());
					
					response.getWriter().println(ims.showJobHistoryInterview(jh, question,study,false));
				} else {
					study.deleteAndClean();
					request.getSession().removeAttribute("InterviewID");
					response.getWriter().println(ims.showInterviewsPreviewEndNote());
				}
			}else{
				// not edit mode so show the jsm description
				if (request.getSession().getAttribute("Search") != null) {
					String search = request.getSession().getAttribute("Search").toString();
					arrayL.add("Searched");
					arrayL.add("<span class=searchHighlight>" + search
							+ "</span>");
					response.getWriter().println(mql.showNavTitle(arrayL));
					if (jsm.containsSearch(search)) {
						response.getWriter().println(mql.showSearchedCount(jsm));
						response.getWriter().println(mql.showSearchedJSMDescription(jsm, search));
					} else {
						response.getWriter().println("<em>"
												+ jsm.getName()
												+ " has no questions or answers containing "
												+ search + "</em>");
					}
				} else {
					response.getWriter().println(mql.showNavTitle(arrayL));
					response.getWriter().println(mql.showJSMDescription(jsm));
				}
			}
		} else {
			// not import nor upload and no single jsm selected
			JobSpecificModule jsm = new JobSpecificModule();
			if (request.getSession().getAttribute("JSMs") != null) {
				// multiple jsms selected via check boxes
				ArrayList<JobSpecificModule> sesObj = (ArrayList<JobSpecificModule>) request.getSession().getAttribute("JSMs");
				for (Iterator<JobSpecificModule> it = sesObj.iterator(); it.hasNext();) {
					JobSpecificModule temp = (JobSpecificModule) it.next();
					jsms.add(temp);
				}			
				if (request.getAttribute("EditMode") != null) {
					arrayL.add("Edit");
					response.getWriter().println(mql.showNavTitle(arrayL));
					response.getWriter().println(mql.showEditJSMs(jsms));
				}else if (request.getAttribute("Export") != null) {
					arrayL.add("Export");
					response.getWriter().println(mql.showNavTitle(arrayL));
					response.getWriter().println(mql.showExport(jsms));
				} else {
					// not edit mode on multiple JSMs
					if (request.getSession().getAttribute("Search") != null) {
						// do search on selected
						String search = request.getSession().getAttribute("Search").toString();
						arrayL.add("Searched");
						arrayL.add("<span class=searchHighlight>" + search + "</span>");
						response.getWriter().println(mql.showNavTitle(arrayL));
						ArrayList<JobSpecificModule> searchArray = new JobSpecificModule().getSearchedJSMs(search);
						ArrayList<JobSpecificModule> matchedArray = new ArrayList<JobSpecificModule>();
						for (JobSpecificModule _jsm : jsms) {
							for (JobSpecificModule searchJSM : searchArray) {
								if (_jsm.getId().equalsIgnoreCase(searchJSM.getId())) {
									matchedArray.add(searchJSM);
								}
							}
						}
						if (matchedArray.size() > 0) {
							//Util util = new Util();
							matchedArray = Util.mergeSort(matchedArray);
							response.getWriter().println(mql.showSearchResults(matchedArray,search));
						} else {
							response.getWriter().println("<em>No matching questions or answers</em>");
						}						
					} else {
						arrayL.add("Searched");
						arrayL.add("<span class=searchHighlight>\"\"</span>");
						response.getWriter().println(mql.showNavTitle(arrayL));
						response.getWriter().println("<em>No search value specified</em>");
					}
				}
				request.getSession().removeAttribute("JSMs");
			} else {
				// no JSMs selected
				if (request.getSession().getAttribute("JSMType") != null) {
					// a jsm type has been selected
					User user = (User) request.getSession().getAttribute("UserObject");
					String jsmType = request.getSession().getAttribute("JSMType").toString();
					if (jsmType.equalsIgnoreCase("TAJSMs")) {
						if (request.getSession().getAttribute("Search") != null) {
							String search = request.getSession().getAttribute("Search").toString();
							arrayL.add("Searched");
							arrayL.add("<span class=searchHighlight>" + search + "</span>");
							response.getWriter().println(mql.showNavTitle(arrayL));
							ArrayList<JobSpecificModule> searchArray = new JobSpecificModule().getSearchedJSMs(search, "TAJSMs", user, true);
							if (searchArray.size() > 10){
								response.getWriter().println("<em>More than 10 matching JSM's - please refine your search</em>");
							} else if (searchArray.size() > 0) {
								//Util util = new Util();
								searchArray = Util.mergeSort(searchArray);
								response.getWriter().println(mql.showSearchResults(searchArray,search));
							}else {
								response.getWriter().println("<em>No matching questions or answers</em>");
							}
						} else {
							response.getWriter().println(mql.showNavTitle(arrayL));
							response.getWriter().println(mql.showTable("", jsm.getTemplateAJSMs(),true,"jsms", true));
						}
					} else if (jsmType.equalsIgnoreCase("AJSMs")) {
						if (request.getSession().getAttribute("Search") != null) {
							String search = request.getSession().getAttribute("Search").toString();
							arrayL.add("Searched");
							arrayL.add("<span class=searchHighlight>" + search
									+ "</span>");
							response.getWriter().println(mql.showNavTitle(arrayL));
							ArrayList<JobSpecificModule> searchArray = new JobSpecificModule().getSearchedJSMs(search, "AJSMs", user, true);
							if (searchArray.size() > 10){
								response.getWriter().println("<em>More than 10 matching JSM's - please refine your search</em>");							} else if (searchArray.size() > 0) {
								//Util util = new Util();
								searchArray = Util.mergeSort(searchArray);
								response.getWriter().println(mql.showSearchResults(searchArray,search));
							}else {
								response.getWriter().println("<em>No matching questions or answers</em>");
							}
						} else {
							response.getWriter().println(mql.showNavTitle(arrayL));
							response.getWriter().println(mql.showTable("", jsm.getStudySpecificAJSMs(user.getId()),true,"jsms", true));
						}
					} else if (jsmType.equalsIgnoreCase("TJSMs")) {
						if (request.getSession().getAttribute("Search") != null) {
							String search = request.getSession().getAttribute("Search").toString();
							arrayL.add("Searched");
							arrayL.add("<span class=searchHighlight>" + search
									+ "</span>");
							response.getWriter().println(mql.showNavTitle(arrayL));
							ArrayList<JobSpecificModule> searchArray = new JobSpecificModule().getSearchedJSMs(search, "TJSMs", user, true);
							if (searchArray.size() > 10){
								response.getWriter().println("<em>More than 10 matching JSM's - please refine your search</em>");							} else if (searchArray.size() > 0) {
								//Util util = new Util();
								searchArray = Util.mergeSort(searchArray);
								response.getWriter().println(mql.showSearchResults(searchArray,search));
							}else {
								response.getWriter().println("<em>No matching questions or answers</em>");
							}
						} else {
							response.getWriter().println(mql.showNavTitle(arrayL));
							response.getWriter().println(mql.showTable("", jsm.getTemplateJSMs(),true,"jsms", true));
						}
					} else if (jsmType.equalsIgnoreCase("JSMs")) {
						if (request.getSession().getAttribute("Search") != null) {
							String search = request.getSession().getAttribute("Search").toString();
							arrayL.add("Searched");
							arrayL.add("<span class=searchHighlight>" + search
									+ "</span>");
							response.getWriter().println(mql.showNavTitle(arrayL));
							ArrayList<JobSpecificModule> searchArray = new JobSpecificModule().getSearchedJSMs(search, "JSMs", user, true);
							if (searchArray.size() > 10){
								response.getWriter().println("<em>More than 10 matching JSM's - please refine your search</em>");							} else if (searchArray.size() > 0) {
								//Util util = new Util();
								searchArray = Util.mergeSort(searchArray);
								response.getWriter().println(mql.showSearchResults(searchArray,search));
							}else {
								response.getWriter().println("<em>No matching questions or answers</em>");
							}
						} else if(request.getSession().getAttribute("ShareJSMs") != null){
							arrayL.add("Share JSMs");
							response.getWriter().println(mql.showNavTitle(arrayL));
							String jsmIds = request.getSession().getAttribute("JSMIDs").toString();
							String strSearch = "";
							ArrayList<User> searchedUsers = null;
							if (request.getSession().getAttribute("Search") != null) {
								strSearch = request.getSession().getAttribute("Search").toString();
							}
							if (request.getSession().getAttribute("searchedusers") != null) {
								searchedUsers = (ArrayList<User>)request.getSession().getAttribute("searchedusers");
							}
							response.getWriter().println(mql.showUserJSMs(jsmIds, strSearch, searchedUsers));
						} else {
							response.getWriter().println(mql.showNavTitle(arrayL));
							response.getWriter().println(mql.showTable("", jsm.getStudySpecificJSMs(user.getId()), true,"jsms", true));
						}
					}
				} else {
					// no jsm type selected so show default
					if (request.getSession().getAttribute("Search") != null) {
						String search = request.getSession().getAttribute("Search").toString();
						arrayL.add("Searched");
						arrayL.add("<span class=searchHighlight>" + search
								+ "</span>");
						response.getWriter().println(mql.showNavTitle(arrayL));
						ArrayList<JobSpecificModule> searchArray = new JobSpecificModule().getSearchedJSMs(search, true);
						if (searchArray.size() > 0) {
							//Util util = new Util();
							searchArray = Util.mergeSort(searchArray);
							response.getWriter().println(mql.showSearchResults(searchArray, search));
						} else {
							response.getWriter().println("<em>No matching questions or answers</em>");
						}
					} else {
						response.getWriter().println(mql.showNavTitle(arrayL));
						response.getWriter().println(mql.showTable("", jsm.getTemplateJSMs(),true,"jsms", true));
					}
				}
			}
		}
		// Flush contents of JSMs array after use
		request.getSession().setAttribute("JSMs", null);
	}
	private int getLocationInt(HttpServletRequest request) {
		String strLocation = "";
		if (request.getParameter("Location") != null) {
			strLocation = request.getParameter("Location");
			request.getSession().setAttribute("Location", strLocation);
		}
		if (request.getSession().getAttribute("Location") != null) {
			strLocation = request.getSession().getAttribute("Location").toString();
		}
		int iRetValue = 0;
		if (strLocation.equalsIgnoreCase("JSMs")) {
			iRetValue = 0;
		} else if (strLocation.equalsIgnoreCase("Structure")) {
			iRetValue = 1;
		} else if (strLocation.equalsIgnoreCase("Agents")) {
			iRetValue = 2;
		} else if (strLocation.equalsIgnoreCase("Jobs")) {
			iRetValue = 3;
		} else if (strLocation.equalsIgnoreCase("Demo")) {
			iRetValue = 4;
		}
		return iRetValue;
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
	/**
	 * showActionButtons
	 * 
	 * @param request
	 * @param iLocation
	 * @return
	 * @throws Exception
	 *             Manages display of the action button list on the RHS of the
	 *             screen
	 */
	private String showActionButtons(HttpServletRequest request, int iLocation)
			throws Exception {
		User user = (User) request.getSession().getAttribute("UserObject");
		JobSpecificModule jsm = new JobSpecificModule();
		if(request.getSession().getAttribute("JSMID")!=null){
			String jsmId = request.getSession().getAttribute("JSMID").toString();
			jsm = new JobSpecificModule(jsmId);
		}
		String strHTML = "";
		strHTML += "<div id=divActionButtons class=actionButtons>";
		strHTML += "<table width=100%><tr><td align=center>";
		strHTML += "<div id=divActionButtonsBar class=actionButtonsBar>";
		strHTML += "<span class=actionButtons>Action Buttons</span><br/>";
		ActionButton minimize = new ActionButton("minimise","Hide Action Buttons", "arrowclose.gif");
		minimize.setEnabled(true);
        strHTML += minimize.getTxtHTML();
		switch (iLocation) {
		case 0: { // jsm:
			//Set up Action Buttons for this location
			ActionButton saveJSM = new ActionButton("saveJSM","Save JSM", "save.gif");
			ActionButton editJSMs = new ActionButton("editJSMs","Edit JSM", "edit.gif");
			ActionButton addJSM = new ActionButton("addJSM","Add", "addjsm.gif");
			ActionButton deleteJSM = new ActionButton("deleteJSM","Delete JSM", "deletejsm.gif");
			ActionButton deleteJSMs = new ActionButton("deleteJSM","Delete", "deletejsms.gif");
			ActionButton saveSharedJSMs = new ActionButton("saveSharedJSMs","Share with users", "save.gif");
			ActionButton importJSM = new ActionButton("importJSM","Import", "import.gif");
			ActionButton exportJSM = new ActionButton("exportJSM","Export", "export.gif");
			ActionButton shareJSMs = new ActionButton("shareJSMs","Share JSMs", "share.gif");
			ActionButton copyJSMs = new ActionButton("copyJSMs","Copy JSMs", "copy.gif");			
			ActionButton previewInterview = new ActionButton("previewInterview","Preview Interview", "quickassess.gif");
			// If edit mode is selected
			if (request.getAttribute("EditMode") != null) {
				// if the user has edit JSM or JSM permission..
				if (user.hasPermission(User.Permission.EDITJSM)
						|| user.hasPermission(User.Permission.ADDJSM)) {
					//Enable Save Button
					saveJSM.setEnabled(true);
				}
				if(jsm.isReadOnly()){
					saveJSM.setEnabled(false);
				}
				strHTML += saveJSM.getTxtHTML();
				
				// If import has been selected..
			} else if (request.getAttribute("Export") != null) {
				// if the user has export JSM or JSM permission..
				if (user.hasPermission(User.Permission.EXPORTJSM)
						|| user.hasPermission(User.Permission.EXPORTJSM)) {
					//Enable Save Button
					exportJSM.setEnabled(true);
				}
				strHTML += exportJSM.getTxtHTML();
				
				// If import has been selected..
			} else if (request.getAttribute("Import") != null) {
				// and the user has permission to import....
				if (user.hasPermission(User.Permission.IMPORTJSM)) {
					//Enable Save Button
					importJSM.setEnabled(true);
				}
				strHTML += importJSM.getTxtHTML();
			} else {
				if(request.getSession().getAttribute("ShareJSMs")!=null){
					//show the save button only
					saveSharedJSMs.setEnabled(true);
					strHTML += saveSharedJSMs.getTxtHTML();
				} else {
					// If a JSM has been selected
					if (request.getSession().getAttribute("JSMID") != null) {
						// and the user has edit permission
						if (user.hasPermission(User.Permission.EDITJSM)) {
							// add the edit button to the action button list
							editJSMs.setEnabled(true);
						}
						if(jsm.isReadOnly()){
							editJSMs.setEnabled(false);
						}
						strHTML += editJSMs.getTxtHTML();
						// and if the user has delete permission
						if (user.hasPermission(User.Permission.DELETEJSM)) {
							// Enable the delete button
							deleteJSM.setEnabled(true);
						}
						deleteJSM.setOnClick(" onclick=\"return confirm('Do you wish to delete this record?');\"");
						strHTML += deleteJSM.getTxtHTML();
						// if current user is owner
						if(jsm.getUserId()!=null){
							if(jsm.getUserId().equalsIgnoreCase(user.getId())){
								shareJSMs.setEnabled(true);								
							}
							strHTML += shareJSMs.getTxtHTML();
						}	
						previewInterview.setEnabled(true);
						strHTML += previewInterview.getTxtHTML();
					} else {
						// If a JSM was not selected then if the user has
						// permission...
						if (user.hasPermission(User.Permission.IMPORTJSM)) {
							// Enable the importJSM action button
							importJSM.setEnabled(true);
						}
						String jsmType = "JSMs";
						if (request.getSession().getAttribute("JSMType") != null) {
							jsmType = request.getSession().getAttribute("JSMType").toString();
						}
						boolean ssJSMs = true;
						if (jsmType.equalsIgnoreCase("TAJSMs")) {
							ssJSMs = false;
						} else if (jsmType.equalsIgnoreCase("TJSMs")) {
							ssJSMs = false;
						} 
						if(!(ssJSMs)){
							strHTML += importJSM.getTxtHTML();
						}						
						if (user.hasPermission(User.Permission.EXPORTJSM)) {
							// Enable the exportJSM action button 
							exportJSM.setEnabled(true);
						}
						if(!(ssJSMs)){
							strHTML += exportJSM.getTxtHTML();
						}						
						if (user.hasPermission(User.Permission.ADDJSM)) {
							// Enable the addJSM action button
							addJSM.setEnabled(true);
						}
						if(!(ssJSMs)){
							strHTML += addJSM.getTxtHTML();
						}					
						if (user.hasPermission(User.Permission.EDITJSM)) {
							// Enable the edit action button to the button list
							editJSMs.setEnabled(true);
						}
						strHTML += editJSMs.getTxtHTML();
						if (user.hasPermission(User.Permission.COPYJSMS)) {
							// Enable the copy action button to the button list
							copyJSMs.setEnabled(true);
						}
						strHTML += copyJSMs.getTxtHTML();
						if (user.hasPermission(User.Permission.DELETEJSM)) {
							// Enable the delete action button to the button list
							deleteJSMs.setEnabled(true);
						}
						deleteJSMs.setOnClick(" onclick=\"return validateCheckBoxesConfirmDelete('Please select a record to delete','jsm');\"");
						strHTML += deleteJSMs.getTxtHTML();						
					}
				}
			}
			break;
		}
		case 1: { // structure
			//Set up Action Buttons for this location
			ActionButton switchToAgents = new ActionButton("switchToAgents","Switch to Agents", "updateagents.gif");
			ActionButton saveQuestions = new ActionButton("saveQuestions","Save Questions", "save.gif");
			ActionButton editSelectedQuestion = new ActionButton("editSelectedQuestion","Edit Selected", "editquestion.gif");
			ActionButton addProbabilityQuestion = new ActionButton("addProbabilityQuestion","Add a Prob Question", "addprobquestion.gif");
			ActionButton addFreqQuestion = new ActionButton("addFreqQuestion","Add Frequency Question", "addfrequencyquestion.gif");
			ActionButton moveUp = new ActionButton("moveUp","Move up in sequence", "moveup.gif");
			ActionButton moveDown = new ActionButton("moveDown","Move down in sequence", "movedown.gif");
			ActionButton structureRemove = new ActionButton("structureRemove","Remove", "remove.gif");
			ActionButton copy = new ActionButton("copy","Copy", "copy.gif");
			ActionButton printView = new ActionButton("printView","Print View", "print.gif");
			ActionButton paste = new ActionButton("paste","Paste", "paste.gif");
			ActionButton linkAJSM = new ActionButton("linkAJSM","Link AJSM", "linkajsm.gif");
			ActionButton minMax = new ActionButton("minMax","Minimise Maximise Selected Q's & A's", "minmax.gif");
			
//			 if the linkAJSM button is pressed only show logout action button
			if (request.getAttribute("linkAJSM") != null) {
				if (request.getAttribute("linkAJSM").toString().equals("true")) {
					break;
				}
			}
			// if the validation jsm button is pressed only show logout action button
			if (request.getAttribute("ValidateMode") != null) {
				break;
			}			
			//if questionids exist assume user has permission to save and show save button
			if (request.getSession().getAttribute("QuestionIDs") != null) {
				saveQuestions.setEnabled(true);
				strHTML += saveQuestions.getTxtHTML();
			} else {
				if (request.getSession().getAttribute("JSMID") != null) {
					if (user.hasPermission(User.Permission.EDITJSMQUESTIONANSWER)) {
						editSelectedQuestion.setEnabled(true);
						switchToAgents.setEnabled(true);
						if(jsm.isReadOnly()){
							editSelectedQuestion.setEnabled(false);
						}
					}					
					editSelectedQuestion.setOnClick(" onclick=\"return validateCheckBoxes('Please choose an item to edit');\""); 
					strHTML += switchToAgents.getTxtHTML();
					strHTML += editSelectedQuestion.getTxtHTML();
					if (user.hasPermission(User.Permission.ADDJSMQUESTIONANSWER)) {
						addProbabilityQuestion.setEnabled(true);
						addFreqQuestion.setEnabled(true);
						if(jsm.isReadOnly()){
							addProbabilityQuestion.setEnabled(false);
							addFreqQuestion.setEnabled(false);
						}
					}
					strHTML += addProbabilityQuestion.getTxtHTML();
					addFreqQuestion.setOnClick(" onclick=\"return validateCheckBoxes('Please choose a possible answer to add frequency questions to');\"");
					strHTML += addFreqQuestion.getTxtHTML();						
					if (user.hasPermission(User.Permission.EDITJSM)) {
						moveUp.setEnabled(true);
						moveDown.setEnabled(true);
						if(jsm.isReadOnly()){
							moveUp.setEnabled(false);
							moveDown.setEnabled(false);
						}
					}
					moveUp.setOnClick(" onclick=\"return validateCheckBoxes('Please choose an item to move up in sequence');\"");
					strHTML += moveUp.getTxtHTML();
					moveDown.setOnClick(" onclick=\"return validateCheckBoxes('Please choose an item to move down in sequence');\"");
					strHTML += moveDown.getTxtHTML();
					if (user.hasPermission(User.Permission.ADDJSMQUESTIONANSWER)) {
						copy.setEnabled(true);
						paste.setEnabled(true);	
						if(jsm.isReadOnly()){
							copy.setEnabled(false);
							paste.setEnabled(false);	
						}
					}
					copy.setOnClick(" onclick=\"return validateOnlyOneCheckBox();\" ");
					strHTML += copy.getTxtHTML();
					strHTML += paste.getTxtHTML();						
					if (user.hasPermission(User.Permission.DELETEJSMQUESTIONANSWER)) {
						structureRemove.setEnabled(true);
						if(jsm.isReadOnly()){
							structureRemove.setEnabled(false);
						}
					}
					structureRemove.setOnClick(" onclick=\"return validateCheckBoxesConfirmDelete('Please select a record to delete','question/answer');\"");
					strHTML += structureRemove.getTxtHTML();
					if (user.hasPermission(User.Permission.LINKAJSM)) {
						linkAJSM.setEnabled(true);
						if(jsm.isReadOnly()){
							linkAJSM.setEnabled(false);
						}
					}
					strHTML += linkAJSM.getTxtHTML();					
					minMax.setEnabled(true);
					strHTML += minMax.getTxtHTML();
					printView.setEnabled(true);
					strHTML += printView.getTxtHTML();
				}
			}
			break;
		}
		case 2: { // agents:
			//Set up action Buttons for location
			ActionButton updateRule = new ActionButton("updateRule","Save Rule", "save.gif");
			ActionButton editRule = new ActionButton("editRule","Edit Rule", "edit.gif");
			ActionButton deleteRule = new ActionButton("deleteRule","Delete Rule", "delete.gif");
			ActionButton simpleHigh = new ActionButton("simpleHigh","Simple High Rule", "highrule.gif");
			ActionButton simpleMedium = new ActionButton("simpleMedium","Simple Medium Rule", "medrule.gif");
			ActionButton simpleLow = new ActionButton("simpleLow","Simple Low Rule", "lowrule.gif");
			ActionButton simpleUnknown = new ActionButton("simpleUnknown","Level Unknown", "unkrule.gif");
			ActionButton simplePossible = new ActionButton("simplePossible","Simple Possible Rule", "possrule.gif");
			ActionButton viewRules = new ActionButton("viewRules","View Rules", "viewrules.gif");
			ActionButton updateAgents = new ActionButton("updateAgents","Update Agents", "save.gif");
			ActionButton editAgentsSelectedQuestion = new ActionButton("editSelectedQuestion","Edit Selected", "updateagents.gif");
			ActionButton saveAgent = new ActionButton("saveAgent","Save", "save.gif");
			ActionButton agentNew = new ActionButton("agentNew","Add", "add.gif");
			ActionButton agentEdit = new ActionButton("agentEdit","Edit", "edit.gif");
			ActionButton deleteAgents = new ActionButton("deleteAgents","Delete", "delete.gif");
			ActionButton copyRules = new ActionButton("copyRules","Copy Rules", "copyrules.gif");
			ActionButton pasteRules = new ActionButton("pasteRules","Paste Rules", "pasterules.gif");
			//ActionButton minMax = new ActionButton("minMax","Minimise Maximise Selected Q's & A's", "minmax.gif");
			ActionButton removeDuplicateRules = new ActionButton("removeDuplicateRules","Remove Duplicate Rules", "removeduplicates.gif");
			ActionButton validateRules = new ActionButton("validateRules","Validate Rules", "validatejsm.gif");
			//ActionButton defaultFequencyRules = new ActionButton("defaultFrequencyRules","Default Frequency Rules", "quickassess.gif");
			ActionButton toExcel = new ActionButton("toExcel","Convert to Excel", "toexcel.gif");
			ActionButton switchToEditQuestions = new ActionButton("switchToStructure","Switch To Structure", "editquestion.gif");
			ActionButton switchToListMode = new ActionButton("switchToListMode","Switch To List Mode", "listview.gif");
			ActionButton switchToViewMode = new ActionButton("switchToViewMode","Switch To View Mode", "tableview.gif");
			ActionButton minMax = new ActionButton("minMax","Minimise Maximise Selected Q's & A's", "minmax.gif");
			
			if (request.getSession().getAttribute("JSMID") != null) {
				if (request.getSession().getAttribute("AgentID") != null) {
					if (request.getSession().getAttribute("ShowRules") != null) {
						// assume permission as show rules is controlled by view
						// rule action button
						if (request.getSession().getAttribute("RuleID") != null) {
							if (user.hasPermission(User.Permission.EDITRULES)) {								
								if(jsm.isReadOnly()){
									updateRule.setEnabled(false);
									deleteRule.setEnabled(false);
								}else{
									updateRule.setEnabled(true);
									editRule.setEnabled(true);
									deleteRule.setEnabled(true);
									if (request.getSession().getAttribute("editRuleMode") == null) {
										updateRule.setEnabled(false);
										editRule.setEnabled(true);
										strHTML += editRule.getTxtHTML();
									}
								}
							}
							//strHTML += editRule.getTxtHTML();
							strHTML += updateRule.getTxtHTML();
							deleteRule.setOnClick(" onclick=\"return confirm('Are you sure you would like to delete this rule?');\" ");
							strHTML += deleteRule.getTxtHTML();
						} else {
							//String jsmType = request.getSession().getAttribute("JSMType").toString();
							//if ((jsmType.equalsIgnoreCase("TAJSMs")) || (jsmType.equalsIgnoreCase("TJSMs"))) {
								if (user.hasPermission(User.Permission.EDITRULES)) {
									simpleHigh.setEnabled(true);
									simpleHigh.setOnClick(" onclick=\"return validateOnlyOneCheckBox();\" ");
									simpleMedium.setEnabled(true);
									simpleMedium.setOnClick(" onclick=\"return validateOnlyOneCheckBox();\" ");
									simpleLow.setEnabled(true);
									simpleLow.setOnClick(" onclick=\"return validateOnlyOneCheckBox();\" ");
									simpleUnknown.setEnabled(true);
									simpleUnknown.setOnClick(" onclick=\"return validateOnlyOneCheckBox();\" ");
									simplePossible.setEnabled(true);
									simplePossible.setOnClick(" onclick=\"return validateOnlyOneCheckBox();\" ");
									copyRules.setEnabled(true);
									pasteRules.setEnabled(true);
									
									if(jsm.isReadOnly()){
										simpleHigh.setEnabled(false);
										simpleMedium.setEnabled(false);
										simpleLow.setEnabled(false);
										simpleUnknown.setEnabled(false);
										simplePossible.setEnabled(false);
										copyRules.setEnabled(false);
										pasteRules.setEnabled(false);
									}
								}								
								strHTML += simpleHigh.getTxtHTML();								
								strHTML += simpleMedium.getTxtHTML();								
								strHTML += simpleLow.getTxtHTML();								
								strHTML += simpleUnknown.getTxtHTML();								
								strHTML += simplePossible.getTxtHTML();													
								strHTML += copyRules.getTxtHTML();								
								strHTML += pasteRules.getTxtHTML();
								
							//}
							if (user.hasPermission(User.Permission.EDITRULES)) {
								removeDuplicateRules.setEnabled(true);
								strHTML += removeDuplicateRules.getTxtHTML();
								validateRules.setEnabled(true);
								strHTML += validateRules.getTxtHTML();
							}				
						}
					} else {
						//String jsmType = request.getSession().getAttribute("JSMType").toString();
						if (user.hasPermission(User.Permission.VIEWRULES)) {
							// show 'viewrules' action button
							viewRules.setEnabled(true);
						}
						strHTML += viewRules.getTxtHTML();
					}					
				} else {
					if (user.hasPermission(User.Permission.EDITJSMQUESTIONANSWER)) {
						
						if(jsm.isReadOnly()){
							updateAgents.setEnabled(false);
							editAgentsSelectedQuestion.setEnabled(false);				
						}else{
							updateAgents.setEnabled(true);
							editAgentsSelectedQuestion.setEnabled(true);
						}						
						editAgentsSelectedQuestion.setOnClick(" onclick=\"return validateCheckBoxes('Please choose an item to edit');\"");
						switchToEditQuestions.setEnabled(true);
					}
					if(user.hasPermission(User.Permission.EDITRULES)){
						//defaultFequencyRules.setEnabled(true);
						toExcel.setEnabled(true);
					}
					if (request.getSession().getAttribute("QuestionIDs") != null)  {
						strHTML += updateAgents.getTxtHTML();	
					}else{						
						strHTML += switchToEditQuestions.getTxtHTML();
						strHTML += editAgentsSelectedQuestion.getTxtHTML();
						validateRules.setEnabled(true);
						strHTML += validateRules.getTxtHTML();
						//strHTML += defaultFequencyRules.getTxtHTML();
						strHTML += toExcel.getTxtHTML();
					}
				}
				minMax.setEnabled(true);
				strHTML += minMax.getTxtHTML();
			} else {
				if (request.getAttribute("EditMode") != null) {
					// assume permission granted as EditMode is switched on by
					// add and edit buttons
					saveAgent.setEnabled(true);
					strHTML += saveAgent.getTxtHTML();
            	} else {
            		if(request.getSession().getAttribute("ListMode")!=null){
            			switchToViewMode.setEnabled(true);
            			strHTML += switchToViewMode.getTxtHTML();
            		}else if((request.getSession().getAttribute("ViewMode")!=null)||(request.getSession().getAttribute("ViewMode")==null)){
            			switchToListMode.setEnabled(true);
            			strHTML += switchToListMode.getTxtHTML();
            		}
					if (user.hasPermission(User.Permission.ADDAGENT)) {
						agentNew.setEnabled(true);
					}
					strHTML += agentNew.getTxtHTML();
					if (user.hasPermission(User.Permission.EDITAGENT)) {
						agentEdit.setEnabled(true);
					}
					agentEdit.setOnClick(" onclick=\"return validateOnlyOneCheckBox();\"");
					strHTML += agentEdit.getTxtHTML();
					if (user.hasPermission(User.Permission.DELETEAGENT)) {
						deleteAgents.setEnabled(true);
					}
					deleteAgents.setOnClick(" onclick=\"return validateCheckBoxesConfirmDelete('Please select a record to delete','agent');\"");
					strHTML += deleteAgents.getTxtHTML();
				}
				//minMax.setEnabled(true);
				//strHTML += minMax.getTxtHTML();
				//strHTML += ActionButton.getSelectAllTxtHTML();
			}
			
			break;
		}
		case 3: { // jobs:
			//Set up Action Buttons for location
			ActionButton jobNew = new ActionButton("jobNew","New Job", "add.gif");
			ActionButton jobEdit = new ActionButton("jobEdit","Edit Job", "edit.gif");
			ActionButton jobDelete = new ActionButton("jobDelete","Delete Job", "delete.gif");
			ActionButton saveJob = new ActionButton("saveJob","Save Job", "save.gif");
						
			if (request.getSession().getAttribute("editJob") == null) {
				if (user.hasPermission(User.Permission.ADDJOB)) {
					jobNew.setEnabled(true);
				}
				strHTML += jobNew.getTxtHTML();
				if (user.hasPermission(User.Permission.DELETEJOB)) {
					jobDelete.setEnabled(true);
				}
				jobDelete.setOnClick(" onclick=\"return validateCheckBoxesConfirmDelete('Please select a record to delete','job');\"");
				strHTML += jobDelete.getTxtHTML();
				if (user.hasPermission(User.Permission.EDITJOB)) {
					jobEdit.setEnabled(true);
				}
				jobEdit.setOnClick(" onclick=\"return validateCheckBoxes('Please choose an item to edit');\"");
				strHTML += jobEdit.getTxtHTML();
			} else {
				Boolean isEditMode = false;
				isEditMode = (Boolean) request.getSession().getAttribute("editJob");
				if (isEditMode) {
					if (user.hasPermission(User.Permission.EDITJOB)) {
						saveJob.setEnabled(true);
					}
					strHTML += saveJob.getTxtHTML();
				} else {
					if (user.hasPermission(User.Permission.ADDJOB)) {
						jobNew.setEnabled(true);
					}
					strHTML += jobNew.getTxtHTML();
					if (user.hasPermission(User.Permission.DELETEJOB)) {
						jobDelete.setEnabled(true);
					}
					jobDelete.setOnClick(" onclick=\"return validateCheckBoxesConfirmDelete('Please select a record to delete','job');\"");
					strHTML += jobDelete.getTxtHTML();
					if (user.hasPermission(User.Permission.EDITJOB)) {
						jobEdit.setEnabled(true);
					}
					jobEdit.setOnClick(" onclick=\"return validateCheckBoxes('Please choose an item to edit');\"");
					strHTML += jobEdit.getTxtHTML();
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
		// Finally add the logout button at the end
		ActionButton logout = new ActionButton("logout","log Out", "logout.gif");
		logout.setEnabled(true);
		strHTML += logout.getTxtHTML();
		strHTML += "<input type=hidden name=Action value=1></input>";
		strHTML += "<input type=hidden name=scrollPos id=scrollPos value=0></input>";
		strHTML += "</div>";
		strHTML += "</td></tr></table>";
		strHTML += "</div>";
		return strHTML;
	}
}


