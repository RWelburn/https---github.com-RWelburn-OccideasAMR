/**
 * Version:
 *     $Id$
 *
 * Revisions:
 *     $Log$
 *     Revision 1.8  2008/12/14 22:50:48  troy.sadkowsky
 *     new keyphrase function
 *
 *     Revision 1.7  2008/12/11 15:32:11  ray.welburn
 *     Add cookies for login
 *
 *     Revision 1.6  2008/09/24 12:15:40  troy.sadkowsky
 *     demo ready
 *
 *     Revision 1.5  2008/09/03 07:34:20  troy.sadkowsky
 *     tidy code and ensure connections close
 *
 *     Revision 1.4  2008/08/12 04:04:46  ray.welburn
 *     Change index.jsp to main.jsp
 *
 *     Revision 1.3  2008/08/11 01:45:58  ray.welburn
 *     move study object to common package
 *
 *     Revision 1.2  2008/08/11 00:44:50  troy.sadkowsky
 *     rule conversion from ajsms
 *
 *     Revision 1.1  2008/08/06 01:10:29  troy.sadkowsky
 *     applied new updates to administration system
 *
 *     Revision 1.81  2008/08/02 06:19:21  troy.sadkowsky
 *     new rules view and functions
 *
 *     Revision 1.80  2008/07/24 12:07:27  ray.welburn
 *     Studies now selected where study option useoccideas set
 *
 *     Revision 1.79  2008/07/08 11:16:45  Troy.Sadkowsky
 *     updated bugzilla link
 *
 *     Revision 1.78  2008/07/05 03:33:53  troy.sadkowsky
 *     fix for adding users to studies in admin section
 *
 *     Revision 1.77  2008/06/29 23:53:26  troy.sadkowsky
 *     new archive link
 *
 *     Revision 1.76  2008/06/29 23:27:47  troy.sadkowsky
 *     new front page images
 *
 *     Revision 1.75  2008/06/27 03:59:47  ray.welburn
 *     add wiki style editing for hrefs
 *
 *     Revision 1.74  2008/06/04 01:03:15  ray.welburn
 *     Various fixes for admin pages
 *
 *     Revision 1.73  2008/06/04 00:50:26  troy.sadkowsky
 *     small fix for multiple log in
 *
 *     Revision 1.72  2008/06/01 09:36:34  ray.welburn
 *     Search for users and filter for lhs user menu
 *
 *     Revision 1.71  2008/05/31 00:31:27  ray.welburn
 *     Fix flash problem and studies add users page style
 *
 *     Revision 1.70  2008/05/30 01:52:41  troy.sadkowsky
 *     removed old code
 *
 *
 */
package com.researchit.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.researchit.JobSpecificModule;
import com.researchit.PossibleAnswer;
import com.researchit.Question;
import com.researchit.Role;
import com.researchit.User;
import com.researchit.common.Study;
import com.researchit.expert.ExpertAgent;
import com.researchit.expert.ExpertRule;
import com.researchit.html.ActionButton;
import com.researchit.html.AssessmentSystem;
import com.researchit.html.HTMLObject;
import com.researchit.html.InterviewManagementSystem;
import com.researchit.html.MasterQuestionList;

/**
 * Servlet Hello implementation class for Servlet: ControllerServlet
 * 
 * @web.servlet name="ControllerServlet" display-name="ControllerServlet"
 * 
 * @web.servlet-mapping url-pattern="/ControllerServlet"
 * 
 */
public class AdminServlet extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet {

	private static final long serialVersionUID = 1L;

	/*
	 * (non-Java-doc)
	 * 
	 * @see javax.servlet.http.HttpServlet#HttpServlet()
	 */
	public AdminServlet() {
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
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		try{
			int iLocation = this.getLocationInt(request);
			if (request.getSession().getAttribute("UserObject") != null) {
				User user = (User)request.getSession().getAttribute("UserObject");
			
				if (user.isAdministrator()){
					//Set session for admin tasks
					request.getSession().setAttribute("Admin", true);
				}else {
					//go to appropriate module
					request.getSession().removeAttribute("Admin");
				}
			}
			if (request.getSession().getAttribute("PageSize") == null) {
				request.getSession().setAttribute("PageSize", 15);
			}
			if (request.getParameter("LoginRequest") != null) {
				iLocation = 3;//Login
			}
			if (request.getSession().getAttribute("UserObject") != null) {
				User user = (User)request.getSession().getAttribute("UserObject");
				if(user.isAdministrator()){
					response.getWriter().println("<form action=AdminControlServlet method=post id=controllerpost>");										
				}
			}
			//if (request.getSession().getAttribute("Admin")!=null) {
			//	if (request.getSession().getAttribute("BlueTabLocation")!=null && request.getSession().getAttribute("BlueTabLocation").equals("Admin")){
			//	}
			//}
			response.getWriter().println(" <table cellpadding=0 cellspacing=0 class=MainPage id=MainPage>");
			response.getWriter().println(" <tr>");
			response.getWriter().println(" <td align=center valign=top>");
			response.getWriter().println(" <table cellpadding=0 cellspacing=0 class=MainTable >");
			response.getWriter().println(" <tr height=80px> <!-- fixed height to stop resize -->");
			response.getWriter().println(" <td colspan=3 valign=top> ");
			response.getWriter().println(" <!-- Header -->");
			//show the top blue module tabs
			this.showTopMenu(request,response);
			//Show yellow page tabs
			this.showHeaderMenu(request, response, iLocation);
			response.getWriter().println(" </td>");
			response.getWriter().println(" </tr>");
			response.getWriter().println(" <tr>");
			response.getWriter().println("<td width=10px>&nbsp;</td>");
			response.getWriter().println("<td valign=top>");
			response.getWriter().println("<table class=Content><tr>");
			response.getWriter().println(" <td valign=top class=LHSMenu  >");
			response.getWriter().println(" <!-- Menu -->	");
			this.showLHSMenu(request, response, iLocation);											
			response.getWriter().println(" </td>");
			response.getWriter().println(" <td valign=top class=Content>");
			response.getWriter().println(" <!-- Contents -->");
			this.showMainTable(request, response, iLocation);
			response.getWriter().println(" </td>");
			response.getWriter().println(" </tr>");
			response.getWriter().println(" </table>");
			response.getWriter().println(" </td><td width=10px>&nbsp;</td>");		
			response.getWriter().println(" </tr>");
			response.getWriter().println(" </table>");
			response.getWriter().println(" </td> ");		
			response.getWriter().println(" </tr>");
			response.getWriter().println("<!-- Floating Action Button Menu -->");		
			if (request.getSession().getAttribute("UserObject") != null) {
				User user = (User)request.getSession().getAttribute("UserObject");
				if(user.isAdministrator()){
					response.getWriter().println("<tr>");
					response.getWriter().println("<td valign=top class=ContentTableActionButtons >");
					response.getWriter().println(this.showActionButtons(request,iLocation));
					response.getWriter().println("</td>");
					response.getWriter().println("</tr>");
				}				
			}
			response.getWriter().println(" </table>");
			if (request.getSession().getAttribute("UserObject") != null) {
				User user = (User)request.getSession().getAttribute("UserObject");
				if(user.isAdministrator()){
					response.getWriter().println("</form>");
				}				
			}			
		} catch (Throwable e) {
			e.printStackTrace();
			request.setAttribute("errorMessage", "DO POST FAILED: "+e.getMessage());
			RequestDispatcher dis = request.getRequestDispatcher("errorpage.jsp");
			dis.forward(request, response);
		}	
	}	
	private void showAdminLoginLocation(HttpServletRequest request, HttpServletResponse response) throws Exception, ServletException {
		HTMLObject htmlObject = new HTMLObject();
		response.getWriter().println("<table class='frontpages'>");
		response.getWriter().println("<tr>");
		response.getWriter().println("<td colspan=2>&nbsp;</td>");
		response.getWriter().println("</tr>");
		response.getWriter().println("<tr>");
		response.getWriter().println("<td valign=top align=center>");
		response.getWriter().println("<h2>Admin Login</h2>");
		response.getWriter().println("</td>");
		response.getWriter().println("</tr>");
		response.getWriter().println("<tr>");
		response.getWriter().println("<td class=homepagemain>");		
		response.getWriter().println("<form action='./AdminValidationServlet' method=post>");
		response.getWriter().println(" <table class='loginpage'>");	
		response.getWriter().println(" <tr>");
		response.getWriter().println(" <td valign=top align=center>");
		response.getWriter().println(" <!-- Contents -->");	

		String strUsername = "";
		String strPassword = "";
		String strError = "";
		if (request.getAttribute("username") != null) {
			strUsername = request.getAttribute("username").toString();
		}
		if (request.getAttribute("password") != null) {
			strPassword = request.getAttribute("password").toString();
		}
		if (request.getAttribute("error") != null) {
			strError = request.getAttribute("error").toString();
		}
		response.getWriter().println(htmlObject.showLogin(strUsername,strPassword,"",strError));					
		response.getWriter().println(" </td>");
		response.getWriter().println(" </tr>");
		response.getWriter().println(" </table>");		
		response.getWriter().println("</form>");		
		response.getWriter().println("</td>");
		response.getWriter().println("</tr>	");
		response.getWriter().println("</table>");
	}
	private void showLHSMenu(HttpServletRequest request, HttpServletResponse response, int iLocation) throws Exception {
		MasterQuestionList mql = new MasterQuestionList();
		if (request.getSession().getAttribute("UserObject") != null) {
			switch (iLocation) {
				case 0: { // Roles
					this.showLHSUsers(request,response);
					break;
				}
				case 1: { // rules
					this.showLHSJSMsWithAgents(request, response);
					break;
				}
				case 2: {
					// studies
					this.showLHSStudies(request, response);
					break;
				}
				case 3: { // Sanity Check
					this.showLHSSanityChecks(request, response);
					break;
				}
				case 4: { // Misc
					response.getWriter().println(mql.showLHSMTabs("Misc", false, null));
					this.showLHSMisc(request,response);
					break;
				}
				case 5: { // StudySpecific JSM's
					this.showLHSJSMs(request, response);
					break;
				}
				case 6: { // Keyphrases
					//this.showLHSJSMs(request, response);
					break;
				}
				default: {
					response.getWriter().print("Error: Unknown Location");
				}
			}
		}
	}
	private void showLHSSanityChecks(HttpServletRequest request, HttpServletResponse response) throws Exception {
		MasterQuestionList mql = new MasterQuestionList();
		String checkname = "";
		response.getWriter().println(mql.showLHSMTabs("Check", false, null));

		if(request.getSession().getAttribute("SanityCheck")!=null){
			checkname = request.getSession().getAttribute("SanityCheck").toString();			
		}
		response.getWriter().println(mql.showSanityCheckName(checkname));		
	}
	private void showLHSJSMsWithAgents(HttpServletRequest request, HttpServletResponse response) throws Exception {
		InterviewManagementSystem ims = new InterviewManagementSystem();
		MasterQuestionList mql = new MasterQuestionList();
		response.getWriter().println(ims.showLHSMTabs("Study", false, null));
		JobSpecificModule jsm = new JobSpecificModule();
		if(request.getSession().getAttribute("jsmID")!=null){
			jsm = new JobSpecificModule(request.getSession().getAttribute("jsmID").toString());
			String strAgentId = "";
			if(request.getSession().getAttribute("AgentID")!=null){
				strAgentId = request.getSession().getAttribute("AgentID").toString();
			}
			response.getWriter().println(mql.showJSMWithAgents(jsm, strAgentId));
		}else{
			ArrayList<JobSpecificModule> jsms = jsm.getTemplateJSMs();
			jsms.addAll(jsm.getTemplateAJSMs());
			response.getWriter().println(mql.showAllJSMs("", jsms));
		}				
	}
	private void showLHSMisc(HttpServletRequest request, HttpServletResponse response) throws Exception {
		response.getWriter().println("<table class=LHSMenuContent>");
		response.getWriter().println("<tr>");
		response.getWriter().println("<td>");
		response.getWriter().println("<div class=LHSMenu>");
		response.getWriter().println("Refresh database images");
		response.getWriter().println("<br/><br/>");
		response.getWriter().println("</div>");																						
		response.getWriter().println("</td>");
		response.getWriter().println("</tr>");
		response.getWriter().println("</table>");
	}	
	private void showLHSStudies(HttpServletRequest request, HttpServletResponse response) throws Exception {
		InterviewManagementSystem ims = new InterviewManagementSystem();
		String studyId = "";
		response.getWriter().println(ims.showLHSMTabs("Study", false, null));
		if(request.getSession().getAttribute("StudyID")!=null){
			studyId = request.getSession().getAttribute("StudyID").toString();
		}
		Study study = new Study();
		ArrayList<Study> studies = study.getStudies(Study.Option.USEOCCIDEAS);           
		response.getWriter().println(ims.showStudies(studyId,studies));
	}	
	public void showTopMenu(HttpServletRequest request,HttpServletResponse response) throws Exception {
		User user = new User();
		if (request.getSession().getAttribute("UserObject") != null) {
			user = (User)request.getSession().getAttribute("UserObject");
		}		
		response.getWriter().println("<table cellspacing=0 cellpadding=0 class=TopMenu>");
		response.getWriter().println("<tr><td>&nbsp;</td><td>&nbsp;</td><td>&nbsp;</td><td>&nbsp;</td><td>&nbsp;</td><td>&nbsp;</td><td>&nbsp;</td><td rowspan=2 class=topmenu align=right><a href=http://www.occideas.org target=_top><img src='ImageStream?ImageName=occideas.jpg' border=0 onclick=\"return showProgress()\"></img></a></td></tr>");
		response.getWriter().println("<tr>");		
		response.getWriter().println("<td width=5px>&nbsp;</td><td  valign=center background='ImageStream?ImageName=mainTabUnselected.gif' width=200px align=center ><a class=TopMenu href=../StudyMgr/ValidateServlet?sid="+request.getSession().getId()+"&u="+user.getId()+"&p="+user.getPassword()+" target=_top onclick=\"return showProgress()\">Study Manager</a></td>");
		response.getWriter().println("<td width=5px>&nbsp;</td><td  valign=center background='ImageStream?ImageName=mainTab.gif' align=center width=200px>Administration</td><td width=180px>&nbsp;</td>");		
		response.getWriter().println("</tr>");
		response.getWriter().println("</table>");
	}	
	private void showHeaderMenu(HttpServletRequest request,HttpServletResponse response, int iLocation) throws Exception {						
		response.getWriter().println("<table cellspacing=0 cellpadding=0>");
        response.getWriter().println("<tr><td height=5px></td></tr>");
        response.getWriter().println("<tr>");
        response.getWriter().println("<td width=160px >&nbsp;</td>");

		ArrayList<String> headerNames = getHeaderTabNames(request, iLocation);
		
		int i = 0;
		for (String headerName : headerNames) {
			//Set default tab status as unselected
			String strBackgroundImage = "background='ImageStream?ImageName=locationTabUnselected.gif'";
			
//			if this is the selected tab...
			if (iLocation == i) {
				strBackgroundImage = "background='ImageStream?ImageName=locationTab.gif'";
			}
			//Create the tab and href to appropriate location (show a progress bar if necessary)
			response.getWriter().println("<td class=YellowTab " + strBackgroundImage
						+ " align=center><a href=main.jsp?Location="
						+ headerName + "&BlueTabLocation=" 
						+ request.getSession().getAttribute("BlueTabLocation")
						+ " onclick=\"return showProgress()\">" + headerName.replace("_", " ")
						+ "</a>&nbsp;&nbsp;</td>");
			response.getWriter().println("<td width=2px >&nbsp;</td>");
			i++;
		}
		response.getWriter().println("</tr></table>");									
	}
	private ArrayList<String> getHeaderTabNames (HttpServletRequest request, int iLocation) throws Exception {
		ArrayList<String> headerNames = new ArrayList<String>();		
		if (request.getSession().getAttribute("UserObject") != null) {
			headerNames.add("Roles");
			headerNames.add("Rules");
			headerNames.add("Studies");
			headerNames.add("SanityCheck");
			headerNames.add("Misc");
			headerNames.add("StudyJSMs");
			headerNames.add("KeyPhrases");
		}else{
			headerNames.add("Login");
		}		
		return headerNames;
	}
	private int getLocationInt(HttpServletRequest request) throws Exception {
		String strLocation = "";
		if (request.getParameter("Location") != null) {
			strLocation = request.getParameter("Location");
			request.getSession().setAttribute("Location", strLocation);
		}else if (request.getSession().getAttribute("Location") != null) {
			strLocation = request.getSession().getAttribute("Location").toString();
		}else{
			strLocation = "default";
		}
		int iRetValue = 0;	
		if (request.getSession().getAttribute("UserObject") != null) {
			if (strLocation.equalsIgnoreCase("Roles")) {
				iRetValue = 0;
			} else if (strLocation.equalsIgnoreCase("Rules")) {
				iRetValue = 1;
			} else if (strLocation.equalsIgnoreCase("Studies")) {
				iRetValue = 2;
			} else if (strLocation.equalsIgnoreCase("SanityCheck")) {
				iRetValue = 3;
			} else if (strLocation.equalsIgnoreCase("Misc")) {
				iRetValue = 4;
			} else if (strLocation.equalsIgnoreCase("StudyJSMs")) {
				iRetValue = 5;
			} else if (strLocation.equalsIgnoreCase("KeyPhrases")) {
				iRetValue = 6;
			} else if (strLocation.equalsIgnoreCase("Default")) {
				iRetValue = 0;
				request.getSession().setAttribute("Location", "Roles");
			}
		}else{//not logged in 
			if (strLocation.equalsIgnoreCase("Login")) {
				iRetValue = 0;
			}
		}				
		return iRetValue;
	}	
	private void showLHSUsers(HttpServletRequest request,HttpServletResponse response) throws Exception {
		MasterQuestionList mql = new MasterQuestionList();
		User user = new User();
		if (request.getSession().getAttribute("userPage") == null) {
			request.getSession().setAttribute("userPage",1);
		}
		int userPage = Integer.parseInt(request.getSession().getAttribute("userPage").toString());
		
		String userTab = "";
		if (request.getSession().getAttribute("UserTab") != null) {
			userTab = request.getSession().getAttribute("UserTab").toString();
			//response.getWriter().println(mql.showJSMTabs("Roles", true));
			ArrayList<User> users = new ArrayList<User>();
			if (userTab.equalsIgnoreCase("Users")) {
				response.getWriter().println(mql.showLHSMTabs("Users", true, null));
				if (request.getSession().getAttribute("Search") != null) {
					users = user.getSearchedUsers(request.getSession().getAttribute("Search").toString());
				}else{
					users = user.getAllUsers();
				}
				response.getWriter().println(mql.showAllUsers(request.getParameter("userID"), users, userPage, Integer.parseInt(request.getSession().getAttribute("PageSize").toString())));
			} else {
				Role role = new Role();
				response.getWriter().println(mql.showLHSMTabs("Roles", true, null));
				response.getWriter().println(this.showAllRoles(request.getParameter("roleID"), role.getAllRoles()));
			}
		} else {
			response.getWriter().println(mql.showLHSMTabs("Users", true, null));
			response.getWriter().println(mql.showAllUsers(request.getParameter("userID"), user.getAllUsers(), userPage, Integer.parseInt(request.getSession().getAttribute("PageSize").toString())));
		}
	}
	private void showLHSJSMs(HttpServletRequest request, HttpServletResponse response) throws Exception {
		User user = (User) request.getSession().getAttribute("UserObject");
		MasterQuestionList mql = new MasterQuestionList();
		JobSpecificModule jsm = new JobSpecificModule();
		String jsmID = "";
		response.getWriter().println(mql.showLHSMTabs("StudyJSM", false, null));
		if (request.getSession().getAttribute("jsmID") != null) {
			jsmID = request.getSession().getAttribute("jsmID").toString();
		}
		response.getWriter().println(mql.showAllJSMs(jsmID, jsm.getStudySpecificJSMs(user.getId())));
		response.getWriter().println(mql.showAllJSMs(jsmID, jsm.getStudySpecificAJSMs(user.getId())));
	}
	private void showMainTable(HttpServletRequest request, HttpServletResponse response,int iLocation) throws Throwable {
		response.getWriter().println("<table cellspacing=0 class=ContentTable>");
		response.getWriter().println("<tr>");
		response.getWriter().println("<td valign=top class=ContentTableMain>");						
		response.getWriter().println("<div class=ProgressBar id=\"progressBar\" >Loading...</div>");
		if (request.getAttribute("errorMessage") != null) {
			response.getWriter().println("<table border=0 ><tr><td></td><td><span class=isMandatory>"
					+ request.getAttribute("errorMessage")
					+ "</span></td></tr></table>");
		}		
		response.getWriter().println("<div class=MainDiv >");
		if (request.getSession().getAttribute("UserObject") != null) {
//				show body
			switch (iLocation) {
			case 0: { // roles
				this.showRolesLocation(request,response);
				break;
			}
			case 1: { // rules
				this.showRulesLocation(request, response);
				break;
			}
			case 2: {// studies
				this.showStudiesLocation(request, response);
				break;
			}
			case 3: { // sanity check
				if(false){ //remove this until needed
					this.showSanityCheckLocation(request, response);	
				}				
				break;
			}
			case 4: { // Miscellaneous functions
				this.showMiscellaneousLocation(request, response);
				break;
			}
			case 5: { // StudyJSMs
				this.showStudySpecificJSMsLocation(request, response);
				break;
			}
			case 6: { // KeyPhrases
				this.showKeyPhrasesLocation(request, response);
				break;
			}
			default: {
				response.getWriter().print("Error: Unknown Location");
			}
			}
		}else{//if not logged in yet
			//show admin login page
			request.setAttribute("userType", "Admin");
			this.showAdminLoginLocation(request,response);
		}
		
		response.getWriter().println("</div>");
		response.getWriter().println("</td>");
		response.getWriter().println("</tr>");
		response.getWriter().println("</table>");

		String strCheckedIDsList = "";
		HttpSession ses = request.getSession();
		if (ses.getAttribute("stringCheckedIDsList") != null) {
			strCheckedIDsList = ses.getAttribute("stringCheckedIDsList").toString();
		}
		response.getWriter().println("<input type=hidden id=checkedIDsList value='"+ strCheckedIDsList + "'></input>");
	}
	private void showKeyPhrasesLocation(HttpServletRequest request, HttpServletResponse response) throws Exception {
		MasterQuestionList mql = new MasterQuestionList();
		ArrayList<Object> arrayL = new ArrayList<Object>();
		arrayL.add("Key Phrase Maintenance");
		response.getWriter().println(mql.showNavTitle(arrayL));	
		JobSpecificModule jsm = null;
		response.getWriter().println("<table class=ContentList><tr class=ListHeader><td>Key Phrase Maintenance</td></tr>");
		response.getWriter().println("<tr><td>");
		
		String strSearch = "";
		if(request.getSession().getAttribute("Search")!=null){
			strSearch = request.getSession().getAttribute("Search").toString();
		}
		response.getWriter().println(mql.showSearchBoxKeyPhrases(strSearch));
		response.getWriter().println(mql.showRenameBoxKeyPhrases());			
		//show keyphrases
		if(!(strSearch.trim().equalsIgnoreCase(""))){
			String qid = "";
			if(request.getSession().getAttribute("QuestionID")!=null){
				qid = request.getSession().getAttribute("QuestionID").toString();
			}
			response.getWriter().println(mql.showKeyPhrases(jsm,strSearch,qid));
		}
		response.getWriter().println("</td></tr></table>");
	}

	private void showMiscellaneousLocation(HttpServletRequest request, HttpServletResponse response)  throws Exception{
		MasterQuestionList mql = new MasterQuestionList();
		ArrayList<Object> arrayL = new ArrayList<Object>();
		arrayL.add("Misc Maintenance");
		response.getWriter().println(mql.showNavTitle(arrayL));	
        response.getWriter().println("<table class=ContentList><tr class=ListHeader><td>Miscellaneous Maintenance Tasks</td></tr>");
        response.getWriter().println("<tr height=230><td align=center>");
		response.getWriter().println(HTMLObject.getSystemVersion());	
		response.getWriter().println(mql.showAdminMiscellaneous());	
		response.getWriter().println("</td></tr></table>");
	}
	private void showSanityCheckLocation(HttpServletRequest request, HttpServletResponse response) throws Exception{
        MasterQuestionList mql = new MasterQuestionList();
		ArrayList<Object> arrayL = new ArrayList<Object>();
		arrayL.add("Database Maintenance");
		response.getWriter().println(mql.showNavTitle(arrayL));	
        response.getWriter().println("<table class=ContentList><tr class=ListHeader><td>Database Maintenance</td></tr>");
        String checkname = "";
   		if(request.getSession().getAttribute("SanityCheck")!=null){
   			checkname = request.getSession().getAttribute("SanityCheck").toString();			
   			if(checkname.equalsIgnoreCase("orphanQuestions")){
   				String sql = "SELECT question.name, jsmquestionstructure.questionid, jsmquestionstructure.id, jsmquestionstructure.sequence " +
   						" FROM (question INNER JOIN jsmquestionstructure ON question.id = jsmquestionstructure.questionid) " +
   						" LEFT JOIN jsm ON jsmquestionstructure.jsmid = jsm.id" +
   						" WHERE (((jsm.id) Is Null))";
   				response.getWriter().println("<tr><td>Questions</td></tr>");
   				response.getWriter().println("<tr><td>");
   				Question q = new Question();
   				response.getWriter().println(mql.showJSMQuestions(q.getQuestions(sql),""));
   				response.getWriter().println("</td></tr>");
   			}else if(checkname.equalsIgnoreCase("orphanPossibleAnswers")){
   				String sql = " WHERE (id NOT IN (SELECT DISTINCT possibleanswerid FROM jsmquestionpossibleanswerstructure))";
   				response.getWriter().println("<tr><td>Possible Answers</td></tr>");
   				response.getWriter().println("<tr><td>");
   				PossibleAnswer pa = new PossibleAnswer();
   				response.getWriter().println(mql.showJSMPossibleAnswersList(pa.getPossibleAnswers(sql),""));
   				response.getWriter().println("</td></tr>");
   			}else if(checkname.equalsIgnoreCase("orphanStructuresPA")){
   				String sql = " WHERE (id IN (SELECT jsmquestionpossibleanswerstructure.possibleanswerid FROM jsmquestionpossibleanswerstructure LEFT OUTER JOIN jsmquestionstructure ON jsmquestionpossibleanswerstructure.jsmquestionstructureid = jsmquestionstructure.id WHERE (jsmquestionstructure.id IS NULL)))";
   				response.getWriter().println("<tr><td>Possible Answers</td></tr>");
   				response.getWriter().println("<tr><td>");
   				PossibleAnswer pa = new PossibleAnswer();
   				response.getWriter().println(mql.showJSMPossibleAnswersList(pa.getPossibleAnswers(sql),""));
   				response.getWriter().println("</td></tr>");
   			}else if(checkname.equalsIgnoreCase("orphanStructuresQ")){
   				String sql = " WHERE (id IN (SELECT jsmquestionstructure.questionid FROM jsmquestionstructure LEFT OUTER JOIN jsmquestionpossibleanswerstructure ON jsmquestionstructure.parentid = jsmquestionpossibleanswerstructure.id WHERE (jsmquestionpossibleanswerstructure.id IS NULL) AND (jsmquestionstructure.parentid <> 100)))";
   				response.getWriter().println("<tr><td>Questions</td></tr>");
   				response.getWriter().println("<tr><td>");
   				Question q = new Question();
   				response.getWriter().println(mql.showJSMQuestions(q.getQuestions(sql),""));
   				response.getWriter().println("</td></tr>");
   			}else if(checkname.equalsIgnoreCase("orphanFrozenJSMs")){
   				String sql = "SELECT frozenjsm.id FROM frozenjsm LEFT OUTER JOIN jsm ON frozenjsm.originaljsmid = jsm.id WHERE (jsm.id IS NULL)";
   				response.getWriter().println("<tr><td>JSMs</td></tr>");
   				response.getWriter().println("<tr><td>");
   				JobSpecificModule jsm = new JobSpecificModule();
   				response.getWriter().println(mql.showTable("",jsm.getJobSpecificModules(sql),true,"jsms"));
   				response.getWriter().println("</td></tr>");
   			}else if(checkname.equalsIgnoreCase("noFactRules")){
   				String sql = "SELECT rule.id FROM rule LEFT OUTER JOIN rulefacts ON rule.id = rulefacts.ruleid WHERE (rule.ruletypeid = 1 OR rule.ruletypeid = 2) AND (rulefacts.factid IS NULL)";
   				response.getWriter().println("<tr><td>Rules</td></tr>");
   				response.getWriter().println("<tr><td>");
   				ExpertRule rule = new ExpertRule();
   				AssessmentSystem assessment = new AssessmentSystem();
   				//Study study = new Study("1");
   				response.getWriter().println(assessment.showRulesDescription(rule.getRules(sql),null));
   				response.getWriter().println("</td></tr>");
   			}else if(checkname.equalsIgnoreCase("emptyFacts")){
   				String sql = "SELECT rule.id" +
   				" FROM fact" +
   				" INNER JOIN rulefacts ON fact.id = rulefacts.factid" +
   				" INNER JOIN rule ON rulefacts.ruleid = rule.id" +
   				" LEFT OUTER JOIN factrequirements ON fact.id = factrequirements.factid" +
   				" GROUP BY rule.id, fact.id" +
   				" HAVING (COUNT(factrequirements.id) = 0)";
   				response.getWriter().println("<tr><td>Rules</td></tr>");
   				response.getWriter().println("<tr><td>");
   				ExpertRule rule = new ExpertRule();
   				AssessmentSystem assessment = new AssessmentSystem();
   				//Study study = new Study("1");
   				response.getWriter().println(assessment.showRulesDescription(rule.getRules(sql),null));
   				response.getWriter().println("</td></tr>");
   			}else if(checkname.equalsIgnoreCase("lostStudySpecificJSMs")){
   				String sql ="SELECT studyjsms.jsmid AS id FROM studyjsms LEFT OUTER JOIN study ON studyjsms.studyid = study.id WHERE (study.id IS NULL)";
   				response.getWriter().println("<tr><td>JSMs</td></tr>");
   				response.getWriter().println("<tr><td>");
   				JobSpecificModule jsm = new JobSpecificModule();
   				response.getWriter().println(mql.showTable("",jsm.getJobSpecificModules(sql),true,"jsms"));
   				response.getWriter().println("</td></tr>");
   			}
   			response.getWriter().println("</table>");
   		}else{
			response.getWriter().println("<tr height=360></td><td align=center><b>Please Select an Item From the Menu</b></td></tr></table>");
   		}
   	}
	private void showStudiesLocation(HttpServletRequest request, HttpServletResponse response) throws Exception{
		InterviewManagementSystem ims = new InterviewManagementSystem();
		ArrayList<Object> arrayL = new ArrayList<Object>();
		arrayL.add("Study Maintenance");
		response.getWriter().println(ims.showNavTitle(arrayL));	
		response.getWriter().println("<table class=ContentUserList><tr class=ListHeader><td>Study Maintenance</td></tr>");
		if (request.getSession().getAttribute("StudyID") != null) {
			Study study = new Study(request.getSession().getAttribute("StudyID").toString());
			response.getWriter().println("<tr><td>");
			response.getWriter().println(ims.showStudyUserManagement(study));
			response.getWriter().println("</td></tr>");
			String strSearch = "";
			if (request.getSession().getAttribute("Search") != null) {
				strSearch = request.getSession().getAttribute("Search").toString();
			}
			response.getWriter().println("<tr class=SearchboxRow><td align=center>");
			response.getWriter().println(ims.showSearchBoxUsers(strSearch));			
			if (request.getSession().getAttribute("searchedusers") != null) {
				ArrayList searchedUsers = (ArrayList)request.getSession().getAttribute("searchedusers");
				response.getWriter().println(ims.showSearchedUsersBox(searchedUsers));
			}
			response.getWriter().println("</td></tr>");
		}else{
			response.getWriter().println("<tr height=360><td align=center><b>Please Select a Study</b></td></tr>");
		}
		response.getWriter().println("</table>");
	}
	
	private void showStudySpecificJSMsLocation(HttpServletRequest request, HttpServletResponse response) throws Exception{
		MasterQuestionList mql = new MasterQuestionList();
		ArrayList<Object> arrayL = new ArrayList<Object>();
		arrayL.add("Study Specific JSM/AJSM Maintenance");
		response.getWriter().println(mql.showNavTitle(arrayL));	
		JobSpecificModule jsm = null;
		response.getWriter().println("<table class=ContentList><tr class=ListHeader><td>Study Specific JSM/AJSM Maintenance</td></tr>");
		response.getWriter().println("<tr><td>");

		if (request.getSession().getAttribute("jsmID") != null) {
			jsm = new JobSpecificModule(request.getSession().getAttribute("jsmID").toString());

			response.getWriter().println(mql.showJSMDescription(jsm));
			response.getWriter().println("<input type='hidden' name='jsmID' value='" + jsm.getId() + "'></input>");
			
		}else{
			response.getWriter().println("<b>Please Select a JSM</b>");
		}
		response.getWriter().println("</td></tr></table>");
	}	
	private void showRulesLocation(HttpServletRequest request, HttpServletResponse response) throws Exception {
		AssessmentSystem as = new AssessmentSystem();
        ArrayList<Object> arrayL = new ArrayList<Object>();
        arrayL.add("Rules Maintenance");
		response.getWriter().println(as.showNavTitle(arrayL));
//    	if (request.getSession().getAttribute("StudyID") == null) {
//			response.getWriter().println("<table class=ContentList><tr class=ListHeader><td>Rules Maintenance</td></tr>");
//			response.getWriter().println("<tr height=30><td align=center><b>Please select a User</b></td></tr>");
//			response.getWriter().println("<tr height=330><td align=center>");
//    		response.getWriter().println(as.showDBRuleTransfer());
//			response.getWriter().println("</td></tr></table>");
//    	} else {
 //           Study study = new Study();
            //arrayL.add(study);
            if(request.getSession().getAttribute("AgentID") == null) {
    			response.getWriter().println("<table class=ContentList><tr class=ListHeader><td>Rules Maintenance</td></tr>");
    			response.getWriter().println("<tr height=360><td align=center><b>Please choose an Agent to view the Rules</b></td></tr></table>");
            }else{
            	JobSpecificModule jsm = new JobSpecificModule(request.getSession().getAttribute("jsmID").toString());
            	ExpertAgent agent = new ExpertAgent(request.getSession().getAttribute("AgentID").toString());
            	if(request.getSession().getAttribute("RuleID") == null) {
        			response.getWriter().println("<table class=ContentList><tr class=ListHeader><td>Rules Maintenance</td></tr>");
        			response.getWriter().println("<tr height=330><td align=center>");
        			boolean showAll = false;
        			//if(request.getSession().getAttribute("All")!=null){
        			//	showAll = true;
        			//	response.getWriter().println("<a href=main.jsp?AllOff=true>Turn All Off</a>&nbsp;&nbsp;|&nbsp;&nbsp;");
        			//}else{
        			//	response.getWriter().println("<a href=main.jsp?AllOn=true>Turn All On</a>&nbsp;&nbsp;|&nbsp;&nbsp;");
        			//}
        			boolean justValid = false;
        			if((request.getSession().getAttribute("JustValid")!=null)){
        				justValid = true;
        				response.getWriter().println("<a href=main.jsp?justValid=false>Turn Just Valid Off</a>");
        			}else{
        				response.getWriter().println("<a href=main.jsp?justValid=true>Turn Just Valid On</a>");
        			}
                	response.getWriter().println(as.showAgentRules(agent,jsm,showAll,justValid));
        			response.getWriter().println("</td></tr></table>");
            	}else{
            		arrayL.add("Add/Edit");
            		ExpertRule er = new ExpertRule(request.getSession().getAttribute("RuleID").toString());
            		response.getWriter().println(as.showNavTitle(arrayL));
                	response.getWriter().println(as.showEditRules(er));
            	}       	
            }
       // }
	}
	private void showRolesLocation(HttpServletRequest request, HttpServletResponse response) throws Exception {		
		MasterQuestionList mql = new MasterQuestionList();
		ArrayList<Object> arrayL = new ArrayList<Object>();
		if (request.getSession().getAttribute("NewUser") == null) {
			if(request.getSession().getAttribute("UserTab")==null){
				request.getSession().setAttribute("UserTab","Users");
			}
			if (request.getSession().getAttribute("UserTab").toString().equalsIgnoreCase("Users")) {
				if (request.getSession().getAttribute("UserID") != null) {
					String userID = request.getSession().getAttribute("UserID").toString();
					User user = new User(Integer.valueOf(userID));
					arrayL.add("User Maintenance");
					response.getWriter().println(mql.showNavTitle(arrayL));
					response.getWriter().println("<table class=ContentList><tr class=ListHeader><td>User Maintenance</td><td>Close</td><td style=\"text-align: right;\">"
			+"<input type=image src='ImageStream?ImageName=close.gif' name=closeEdit title='Close Edit Mode' height=16 width=16/></td></tr></table>");
					response.getWriter().println(mql.showEditUserDetails(user));					
				} else {
					arrayL.add("User Maintenance");
					String strSearch = "";
					if (request.getSession().getAttribute("Search") != null){
					strSearch = request.getSession().getAttribute("Search").toString();
					}
					response.getWriter().println(mql.showNavTitle(arrayL));
					response.getWriter().println("<table class=ContentList><tr class=ListHeader><td>User Maintenance</td></tr>");
					response.getWriter().println("<tr height=360><td align=center><b>Please select a User</b></td></tr>");
					response.getWriter().println("<tr class=SearchboxRow><td width=300px align=center class=SearchButton>Filter users: <input type=text size=20 name=userSearchString value=\""
						+ strSearch
						+ "\"></input><input type=submit name=Search value='Filter' onclick=\"showProgress()\" ></input><input type=submit name=Clear value='Clear'></input></td></tr></table>");
					response.getWriter().println("</td></tr><table>");
				}
			} else if (request.getSession().getAttribute("UserTab").toString().equalsIgnoreCase("Roles")) {
				if (request.getSession().getAttribute("RoleID") != null) {
					String roleID = request.getSession().getAttribute("RoleID").toString();
					Role role = new Role(roleID);
					arrayL.add("Role Maintenance");
					response.getWriter().println(mql.showNavTitle(arrayL));
					response.getWriter().println("<table class=ContentList><tr class=ListHeader><td>Role Maintenance</td><td>Close</td><td style=\"text-align: right;\">"
			+"<input type=image src='ImageStream?ImageName=close.gif' name=closeEdit title='Close Edit Mode' height=16 width=16/></td></tr></table>");
					response.getWriter().println(mql.showRolePermissions(role));
				} else {
					arrayL.add("Role Maintenance");
					response.getWriter().println(mql.showNavTitle(arrayL));
					response.getWriter().println("<table class=ContentList><tr class=ListHeader><td>Role Maintenance</td></tr>");
					response.getWriter().println("<tr height=360><td align=center><b>Please select a User</b></td></tr></table>");
				}
			}
		} else {
			User newUser = (User) request.getSession().getAttribute("NewUser");
			arrayL.add("New ");
			arrayL.add(newUser);
			response.getWriter().println(mql.showEditUserDetails(newUser));
		}
	}
	private String showActionButtons(HttpServletRequest request,int iLocation) throws Exception { 
		String strHTML = "";
		if (request.getSession().getAttribute("BlueTabLocation").equals("Admin")){
			strHTML += "<div id=divActionButtons class=actionButtons>";
			strHTML += "<table width=100%><tr><td align=center>";
			strHTML += "<div id=divActionButtonsBar class=actionButtonsBar>";
			strHTML += "<span class=actionButtons>Action Buttons</span><br/>";
			if (request.getSession().getAttribute("UserObject") != null) {
				switch (iLocation) {
				case 0: { // Roles				
					ActionButton addUser = new ActionButton("addUser","Add User", "add.gif");
					ActionButton removeUser = new ActionButton("removeUser","Remove User", "remove.gif");
					ActionButton saveUser = new ActionButton("saveUser","Save User", "save.gif");
					ActionButton saveRolePermissions = new ActionButton("saveRolePermissions","Save Role", "save.gif");

					if (request.getSession().getAttribute("UserTab").toString().equalsIgnoreCase("Users")) {
						addUser.setEnabled(true);	
						strHTML += addUser.getTxtHTML();
						if (request.getSession().getAttribute("UserID") != null) {
							saveUser.setEnabled(true);	
							strHTML += saveUser.getTxtHTML();
							strHTML += ActionButton.getSelectAllTxtHTML();
							removeUser.setEnabled(true);	
							removeUser.setOnClick(" onclick=\"return confirm('Do you wish to delete this record? This action is irreversible!');\"");
							strHTML += removeUser.getTxtHTML();
						}
					}else {
						if (request.getSession().getAttribute("RoleID") != null) {
						saveRolePermissions.setEnabled(true);	
						strHTML += saveRolePermissions.getTxtHTML();
						strHTML += ActionButton.getSelectAllTxtHTML();
						}
					}
					break;
				}
				case 1: { // rules
					ActionButton addRule = new ActionButton("addRule","Add Rule", "add.gif");
					ActionButton removeRule = new ActionButton("removeRule","Remove Rule", "remove.gif");
					ActionButton saveRule = new ActionButton("saveRule","Save Rule", "save.gif");
					ActionButton copyRule = new ActionButton("copyRuleJSM","Copy Rule", "copy.gif");
					ActionButton saveRuleJSM = new ActionButton("saveRuleJSM","Save Rule", "save.gif");
					ActionButton deleteRule = new ActionButton("deleteRule","Delete Rule", "delete.gif");
					if (request.getSession().getAttribute("AgentID") != null) {
						if(request.getSession().getAttribute("RuleID")!=null){
							saveRule.setEnabled(true);	
							strHTML += saveRule.getTxtHTML();
						}else{
							addRule.setEnabled(true);	
							strHTML += addRule.getTxtHTML();
							strHTML += ActionButton.getSelectAllTxtHTML();
							removeRule.setEnabled(true);	
							removeRule.setOnClick(" onclick=\"return confirm('Do you wish to remove this rule? This action is irreversible!');\"");
							strHTML += removeRule.getTxtHTML();
							deleteRule.setEnabled(true);	
							deleteRule.setOnClick(" onclick=\"return confirm('Do you wish to delete this rule?');\"");
							strHTML += deleteRule.getTxtHTML();   
							saveRuleJSM.setEnabled(true);	
							strHTML += saveRuleJSM.getTxtHTML();
							copyRule.setEnabled(true);	
							strHTML += copyRule.getTxtHTML();
						}               
					}
					break;
				}
				case 2: {
					// studies
					if (request.getSession().getAttribute("StudyID") != null) {
						ActionButton saveStudyUsers = new ActionButton("saveStudyUsers","Save", "save.gif");
						saveStudyUsers.setEnabled(true);	
						strHTML += saveStudyUsers.getTxtHTML();
					}
					break;
				}
				case 3: { // Sanity Check
					if (request.getSession().getAttribute("SanityCheck") != null) {
						ActionButton delete = new ActionButton("deleteSC","Delete All", "delete.gif");
						delete.setEnabled(true);	
						strHTML += delete.getTxtHTML();
					}
					break;
				}
				case 4: { // Miscellaneous functions
					//no action buttons
					break;
				}
				case 5: { // Study Specific JSM's
					if (request.getSession().getAttribute("jsmID") != null) {
						ActionButton saveJSMUsers = new ActionButton("saveJSMUsers","Save", "save.gif");
						saveJSMUsers.setEnabled(true);	
						strHTML += saveJSMUsers.getTxtHTML();
					}
					break;
				}
				case 6: { // Miscellaneous functions
					//no action buttons
					break;
				}
				default: {
					strHTML += "Error: Unknown Location";
				}
				}
//				Finally add the logout button at the end
				ActionButton logout = new ActionButton("logout","log Out", "logout.gif");
				logout.setEnabled(true);
				strHTML += logout.getTxtHTML();
			}
		}
		strHTML += "<input type=hidden name=Action value=1></input>";
		strHTML += "<input type=hidden name=scrollPos id=scrollPos value=0></input>";
		strHTML += "</div>";
		strHTML += "</td></tr></table>";
		strHTML += "</div>";
		return strHTML;
	}
	private String showAllRoles(String selId, ArrayList<Role> array) throws Exception {
		String strRetValue = "<table class=LHSMenuContent>";		
		for (Role role: array) {
			String strClass = "";
			if (role.getId().equalsIgnoreCase(selId)) {
				strClass = " class=Highlight";
			} else {
				strClass = " class=LHSMenuContent";
			}		
			strRetValue += "<tr><td colspan=2 "+ strClass+ "><a href=main.jsp?BlueTabLocation=Admin&roleID=" + role.getId() + " onclick=\"return showProgress()\">" + role.getName()
			+ "</a></td></tr>";
		}
		strRetValue += "\n</table>";
		return strRetValue;
	}
	/*
	public String showJSMDescription(JobSpecificModule jsm) throws Exception {
		MasterQuestionList mql = new MasterQuestionList();
		jsm.getFullQuestions();
		String strRetValue = "<table class=EditView cellspacing=0>";
		strRetValue += "<tr>";
		strRetValue += "<td class=jobs width=200px>Name</td>";
		strRetValue += "<td class=jobs>" + jsm.getName() + "</td>";
		strRetValue += "</tr>";
		strRetValue += "<tr>";
		strRetValue += "<td class=jobs>Description</td>";
		strRetValue += "<td class=jobs>" + jsm.getDescription() + "</td>";
		strRetValue += "</tr>";
		strRetValue += "<tr>";
		strRetValue += "<td class=jobs>Credits</td>";
		strRetValue += "<td class=jobs>" + jsm.getCredits() + "</td>";
		strRetValue += "</tr>";
		strRetValue += "<tr>";
		strRetValue += "<td class=jobs>Comments</td>";
		strRetValue += "<td class=jobs>" + jsm.getComments() + "</td>";
		strRetValue += "</tr>";	
		strRetValue += "<tr>";
		strRetValue += "<td class=jobs>Associated JSMs</td>";
		strRetValue += "<td class=jobs>" + jsm.getJsmAssociates() + "</td>";
		strRetValue += "</tr>";	
		strRetValue += "<tr class=jobs>";
		strRetValue += "<td class=jobs valign=top>Agents</td>";
		strRetValue += "<td class=jobs>" + mql.showList(jsm.getAgents())+ "</td>";
		strRetValue += "</tr>";
		if(!(jsm.isAssociateModule())){
			strRetValue += "<tr class=jobs>";
			strRetValue += "<td class=jobs valign=top>Jobs</td>";
			strRetValue += "<td class=jobs>" + mql.showList(jsm.getJobs()) + "</td>";
			strRetValue += "</tr>";
		}
		if(jsm.getDuplicateQuestions().size()>0){
			strRetValue += "<tr>";
			strRetValue += "<td class=warning valign=top>Duplicate Question List</td>";
			strRetValue += "<td class=warning>" + mql.showList(jsm.getDuplicateQuestions())+ "</td>";
			strRetValue += "</tr>";
		}				
		if(jsm.getJsmTypeId() != JobSpecificModule.TEMPLATE){
			strRetValue += "<tr >";
			strRetValue += "<td class=jobs valign=top>Owner</td>";
			User owner = new User();
			owner.setId(jsm.getUserId());
			strRetValue += "<td class=jobs><select name='owner'>";
			
			for (User u : owner.getAllUsers()) {
				String selected = "";
				if (owner.getId().equals(u.getId())) {
					selected = "selected ";
				}
			strRetValue += "<option " + selected + "value='" + u.getId() + "'>" + u.getUserName() + "</option>";
			}
			strRetValue += "</select></td>";
			strRetValue += "</tr>";
			strRetValue += "<tr >";
			strRetValue += "<td class=jobs valign=top>Shared users</td>";
			strRetValue += "<td>"+ mql.showUserJSMsSelect(owner.getAllUsers(),jsm.getSharedUsers()) + "</td>";
			strRetValue += "</tr>";
		}		
		strRetValue += "</table>";
		return strRetValue;
	}
	*/
}

