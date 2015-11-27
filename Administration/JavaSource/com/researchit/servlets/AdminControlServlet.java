/**
 * Version:
 *     $Id$
 *
 * Revisions:
 *     $Log$
 *     Revision 1.8  2008/12/14 22:50:48  troy.sadkowsky
 *     new keyphrase function
 *
 *     Revision 1.7  2008/09/03 07:34:20  troy.sadkowsky
 *     tidy code and ensure connections close
 *
 *     Revision 1.6  2008/08/25 01:36:01  ray.welburn
 *     Updates to use single dbobject and participant status table
 *
 *     Revision 1.5  2008/08/13 04:18:03  troy.sadkowsky
 *     new misc function to fix up jsm field in rules table
 *
 *     Revision 1.4  2008/08/12 04:04:47  ray.welburn
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
 *     Revision 1.36  2008/08/02 06:19:21  troy.sadkowsky
 *     new rules view and functions
 *
 *     Revision 1.35  2008/07/08 11:48:18  ray.welburn
 *     Integrate login to Participant and biospecimens
 *
 *     Revision 1.34  2008/07/05 03:33:55  troy.sadkowsky
 *     fix for adding users to studies in admin section
 *
 *     Revision 1.33  2008/06/27 03:59:16  ray.welburn
 *     Remove brackets from sql statements
 *
 *     Revision 1.32  2008/06/04 00:57:46  ray.welburn
 *     Close buttons added to user/ roles locations
 *
 *     Revision 1.31  2008/06/01 09:36:35  ray.welburn
 *     Search for users and filter for lhs user menu
 *
 *     Revision 1.30  2008/05/30 01:52:43  troy.sadkowsky
 *     removed old code
 *
 *
 */
package com.researchit.servlets;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.researchit.Agent;
import com.researchit.Image;
import com.researchit.JobSpecificModule;
import com.researchit.Question;
import com.researchit.Role;
import com.researchit.User;
import com.researchit.common.DBBaseObject;
import com.researchit.common.Study;
import com.researchit.expert.ExpertFact;
import com.researchit.expert.ExpertFactRequirement;
import com.researchit.expert.ExpertRule;
import com.researchit.io.DataGenerator;
import com.researchit.io.Runner;

/**
 * Servlet implementation class for Servlet: ControllerServlet
 * 
 * @web.servlet name="ControllerServlet" display-name="ControllerServlet"
 * 
 * @web.servlet-mapping url-pattern="/ControllerServlet"
 * 
 */
public class AdminControlServlet extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet { 

	private static final long serialVersionUID = 1L;

	/*
	 * (non-Java-doc)
	 * 
	 * @see javax.servlet.http.HttpServlet#HttpServlet()
	 */
	public AdminControlServlet() {
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
		String strScrollPos = "0";
		try {
			if (request.getSession().getAttribute("UserObject") != null) {
				request.getSession().removeAttribute("stringCheckedIDsList");
				if (request.getParameter("scrollPos") != null) {
					strScrollPos = request.getParameter("scrollPos");
					request.setAttribute("scrollPos", strScrollPos);
				}
				if (request.getParameter("Action") != null) {
					if (request.getParameter("logout.x") != null) {
						this.logOut(request, response);
					
					} else if (request.getParameter("Clear") != null) {
						this.clearSearchString(request, response);
					} else if (request.getParameter("removeUser.x") != null) {
						this.removeUser(request, response);
					} else if (request.getParameter("addUser.x") != null) {
						this.addUser(request, response);
					} else if (request.getParameter("closeEdit.x") != null) {
						this.closeEditMode(request, response);
					} else if (request.getParameter("saveUser.x") != null) {
						this.saveUser(request);
						this.savePermissions(request, response);
					} else if (request.getParameter("saveRolePermissions.x") != null) {
						this.saveRolePermissions(request, response);
					} else if (request.getParameter("saveStudyUsers.x") != null) {
						this.saveStudyUsers(request, response);
					} else if (request.getParameter("userSearchString") != null && !request.getParameter("userSearchString").equals("")) {
						this.forwardSearchString(request, response);
					} else if (request.getParameter("keyPhraseSearchString") != null && !request.getParameter("keyPhraseSearchString").equals("")) {
						this.forwardSearchStringKeyPhrase(request, response);
						
							
						 
					} else if (request.getParameter("saveJSMUsers.x") != null) {
						this.saveJSMUsers(request, response);
					} else if (request.getParameter("userRoles") != null) {
						this.saveUser(request);
						this.saveUserRole(request, response);
//					} else if (request.getParameter("removeRule.x") != null) {
//						this.removeRules(request, response);
					} else if (request.getParameter("deleteRule.x") != null) {
						this.deleteRules(request, response);
					} else if (request.getParameter("deleteSC.x") != null) {	                	
	                	this.deleteSanityCheck(request, response);
	                } else if (request.getParameter("saveRuleJSM.x") != null) {	                	
	                	this.saveRuleJSM(request, response);
	                } else if (request.getParameter("copyRuleJSM.x") != null) {	                	
	                	this.copyRuleJSM(request, response);
	                } else if (request.getParameter("Action").equalsIgnoreCase("RunMisc")) {	                	
	                	this.runMisc(request, response);
	                } else if (request.getParameter("Action").equalsIgnoreCase("AutoGen")) {	                	
	                	this.autoGenerateTestData(request, response);
	                } else if (request.getParameter("Action").equalsIgnoreCase("AutoGenRettInt")) {	                	
	                	this.autoGenerateRettData(request, response);
	                } else if (request.getParameter("Action").equalsIgnoreCase("AutoSetAJSMsAndRules")) {	                	
	                	this.autoSetAJSMsAndRules(request, response);
	                } else if (request.getParameter("Action").equalsIgnoreCase("RefreshImages")) {	                	
	                	this.refreshImages(request, response);
	                } else if (request.getParameter("pagesize") != null) {
						request.getSession().setAttribute("PageSize", request.getParameter("pagesize"));
						RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
						dis.forward(request, response);
	                } else {
						throw new Exception("OccIDEAS Exception 'No Action'");
					}
				} else{
					if(request.getParameter("cleanDatabase")!=null){
						this.doDatabaseClean(request, response);
					}else{
						this.logOut(request, response);
					}
				}
			}	
		} catch (Throwable e) {
			e.printStackTrace();
			request.setAttribute("errorMessage", e.getMessage());
			RequestDispatcher dis = request.getRequestDispatcher("errorpage.jsp");
			dis.forward(request, response);
		}
	}	
	private void renameKeyPhrase(HttpServletRequest request) throws Exception {
		java.util.Enumeration postedvalues = request.getParameterNames();
        while (postedvalues.hasMoreElements()) {
            String strPost = postedvalues.nextElement().toString();
            if (strPost.contains("questionsCheckBox")) {
                //String id = strPost.substring(strPost.indexOf("_") + 1);
                //Question q = new Question("",id);    
                String qLinkedID = strPost.substring(strPost.indexOf("_") + 1);
				String strDescription = request.getParameter("keyPhraseRenameString");
				Question q = new Question("", qLinkedID);
				String oldQId = q.getId();
				//String strText = "New Question";
				q.setName(strDescription);
			//	int i = 1;
			//	while (q.exists()) {
			//		q.setId("");
			//		q.setName(strText + i);
			//		if (i == 30) {
			//			throw new Exception("Add Question Failed: Max default exceeded");
			//		}
			//		i++;
			//	}
			//	q.setDescription(strDescription);												
				q.insert();
				JobSpecificModule jsm = new JobSpecificModule(q.getJsmID());
				jsm.updateTimeStamp();
				q.relink();
				//update all rules that use this question
				for(Agent agent : jsm.getAgents()){
					boolean bUpdateRule = false;
					for(ExpertRule er: jsm.getRules(agent)){
						for(ExpertFact ef: er.getFacts()){
							for(ExpertFactRequirement efr: ef.getFactRequirements()){
								if(efr.getQuestionId().equalsIgnoreCase(oldQId)){
									efr.setQuestionId(q.getId());
									efr.save();
									bUpdateRule = true;
								}
							}
						}
						if(bUpdateRule){
							er.save();
							bUpdateRule = false;
						}
					}
				}			         
            }
        }	
	}

	private void saveRuleJSM(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String jsmId = request.getSession().getAttribute("jsmID").toString();
	//	JobSpecificModule jsm = new JobSpecificModule(jsmId);				
		java.util.Enumeration postedvalues = request.getParameterNames();
        while (postedvalues.hasMoreElements()) {
            String strPost = postedvalues.nextElement().toString();
            if (strPost.contains("rulesCheckBox")) {
                String id = strPost.substring(strPost.indexOf("_") + 1);
                ExpertRule rule = new ExpertRule(id);    
                if(rule.getTypeId().equalsIgnoreCase(ExpertRule.TYPEPROBABILITY)){
                	rule.setJsmId(jsmId);
        			rule.save();
        			for(ExpertRule childRule:rule.getChildRules()){
        				childRule.setParentId(rule.getId());
        				childRule.setJsmId(jsmId);
        				childRule.save();
        			}   
                }    			         
            }
        }
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}
	private void copyRuleJSM(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String jsmId = request.getSession().getAttribute("jsmID").toString();
		java.util.Enumeration postedvalues = request.getParameterNames();
        while (postedvalues.hasMoreElements()) {
            String strPost = postedvalues.nextElement().toString();
            if (strPost.contains("rulesCheckBox")) {
                String id = strPost.substring(strPost.indexOf("_") + 1);
                ExpertRule rule = new ExpertRule(id);             
                if(rule.getTypeId().equalsIgnoreCase(ExpertRule.TYPEPROBABILITY)){
        			String ruleId = rule.copy();
        			ExpertRule er = new ExpertRule(ruleId);
        			er.setJsmId(jsmId);
        			er.save();
        			for(ExpertRule childRule:rule.getChildRules()){
        				String cid = childRule.copy();
        				ExpertRule cer = new ExpertRule(cid);
        				cer.setParentId(er.getId());
        				cer.setJsmId(jsmId);
        				cer.save();
        			}
        		}             
            }
        }
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}
	private void autoSetAJSMsAndRules(HttpServletRequest request, HttpServletResponse response) throws Exception {
		DataGenerator dg = new DataGenerator();
		dg.fixRuleJSMLinks();
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}

	private void clearSearchString(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getSession().removeAttribute("Search");
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
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
		request.getSession().removeAttribute("searchedusers");
		request.getSession().setAttribute("searchedusers", searchedUsers);
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}
	private void forwardSearchStringKeyPhrase(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String strSearch = request.getParameter("keyPhraseSearchString").trim();
		if (!(strSearch.equalsIgnoreCase(""))) {
			request.getSession().setAttribute("Search", strSearch);
		}else{
			request.getSession().removeAttribute("Search");
		}
		if (request.getParameter("keyPhraseRenameString") != null && !request.getParameter("keyPhraseRenameString").equals("")) {
			this.renameKeyPhrase(request);
		}
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}
	private void refreshImages(HttpServletRequest request, HttpServletResponse response) throws Exception {
		Image image = new Image();
		image.deleteAllImages();
		image.insertImagesToDB("C:\\temp\\Images");
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}
	private void runMisc(HttpServletRequest request, HttpServletResponse response) throws SQLException, Exception {
		Runner runner = new Runner();
		runner.runMisc();
        RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}
	private void autoGenerateRettData(HttpServletRequest request, HttpServletResponse response) throws Exception {
		DataGenerator dg = new DataGenerator();
        dg.generateStudyWithAllJSMs();
        RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}
	private void deleteSanityCheck(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String checkname = "";
		if(request.getSession().getAttribute("SanityCheck")!=null){
			checkname = request.getSession().getAttribute("SanityCheck").toString();			
		}
		if(checkname.equalsIgnoreCase("orphanQuestions")){
			String sql = "DELETE FROM question WHERE (id NOT IN (SELECT DISTINCT questionid FROM jsmquestionstructure))";
			DBBaseObject dbo = new DBBaseObject();
			dbo.sqlExecuteUpdate(sql);	   		
		}else if(checkname.equalsIgnoreCase("orphanPossibleAnswers")){
			String sql = "DELETE FROM possibleanswer WHERE (id NOT IN (SELECT DISTINCT possibleanswerid FROM jsmquestionpossibleanswerstructure))";
			DBBaseObject dbo = new DBBaseObject();
			dbo.sqlExecuteUpdate(sql);			
		}else if(checkname.equalsIgnoreCase("orphanStructuresPA")){
			String sql = "DELETE FROM jqpa USING jsmquestionpossibleanswerstructure jqpa LEFT OUTER JOIN jsmquestionstructure ON jqpa.jsmquestionstructureid = jsmquestionstructure.id WHERE (jsmquestionstructure.id IS NULL)";
			DBBaseObject dbo = new DBBaseObject();
			dbo.sqlExecuteUpdate(sql);			
		}else if(checkname.equalsIgnoreCase("orphanStructuresQ")){
			String sql = "DELETE FROM jq USING jsmquestionstructure jq LEFT OUTER JOIN jsmquestionpossibleanswerstructure ON jq.parentid = jsmquestionpossibleanswerstructure.id WHERE (jsmquestionpossibleanswerstructure.id IS NULL) AND (jq.parentid <> 100)";
			DBBaseObject dbo = new DBBaseObject();
			dbo.sqlExecuteUpdate(sql);			
		}else if(checkname.equalsIgnoreCase("noFactRules")){
			String sql = "DELETE FROM r USING rule r LEFT OUTER JOIN rulefacts ON r.id = rulefacts.ruleid WHERE (r.ruletypeid = 1 OR r.ruletypeid = 2) AND (rulefacts.factid IS NULL)";
			DBBaseObject dbo = new DBBaseObject();
			dbo.sqlExecuteUpdate(sql);			
		}else if(checkname.equalsIgnoreCase("emptyFacts")){
			this.deleteRules(request);		
		}else if(checkname.equalsIgnoreCase("lostStudySpecificJSMs")){
			String sql = "DELETE FROM sjsms USING jsm sjsms INNER JOIN studyjsms ON sjsms.id = studyjsms.jsmid LEFT OUTER JOIN study ON studyjsms.studyid = study.id WHERE (study.id IS NULL)";
			DBBaseObject dbo = new DBBaseObject();
			dbo.sqlExecuteUpdate(sql);	
			sql = "DELETE FROM sjsms USING studyjsms sjsms LEFT OUTER JOIN study ON sjsms.studyid = study.id WHERE (study.id IS NULL)";
			dbo.sqlExecuteUpdate(sql);			
		}
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}
	private void doDatabaseClean(HttpServletRequest request, HttpServletResponse response) throws Exception{
		String strDoId = request.getParameter("cleanDatabase");
		if(strDoId.equalsIgnoreCase("1")){
			String sql = "DELETE FROM question WHERE (id NOT IN (SELECT DISTINCT questionid FROM jsmquestionstructure))";
			DBBaseObject dbo = new DBBaseObject();
			dbo.sqlExecuteUpdate(sql);
		}
		if(strDoId.equalsIgnoreCase("2")){
			String sql = "DELETE FROM jsmquestionstructure WHERE jsmquestionstructure.id IN (SELECT jsmquestionstructure.id FROM jsmquestionstructure WHERE (jsmquestionstructure.jsmid NOT IN (SELECT id FROM jsm)) AND (jsmquestionstructure.jsmid NOT IN (SELECT id FROM frozenjsm)))";
			DBBaseObject dbo = new DBBaseObject();
			dbo.sqlExecuteUpdate(sql);
		}
		if(strDoId.equalsIgnoreCase("3")){
			String sql = "DELETE FROM jsmquestionstructure WHERE jsmquestionstructure.id IN (SELECT jsmquestionstructure.id FROM jsmquestionstructure LEFT OUTER JOIN jsmquestionpossibleanswerstructure ON jsmquestionstructure.parentid = jsmquestionpossibleanswerstructure.id WHERE (jsmquestionpossibleanswerstructure.id IS NULL))";
			DBBaseObject dbo = new DBBaseObject();
			dbo.sqlExecuteUpdate(sql);
		}
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}
	private void saveStudyUsers(HttpServletRequest request, HttpServletResponse response) throws Exception{		
		Enumeration postedvalues = request.getParameterNames();
		Study study = new Study(request.getParameter("studyID"));
		study.removeAllUsers();
		while (postedvalues.hasMoreElements()) {
			String strPost = postedvalues.nextElement().toString();
			if (strPost.contains("usersCheckBox")) {
				User user = new User(Integer.parseInt(strPost.substring(strPost.indexOf("_") + 1)));
				user.addStudy(study.getId());
			}
		}
		request.getSession().removeAttribute("searchedusers");
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}	
	private void saveJSMUsers(HttpServletRequest request, HttpServletResponse response) throws Exception{		
		Enumeration postedvalues = request.getParameterNames();
		JobSpecificModule jsm = new JobSpecificModule(request.getParameter("jsmID"));
		User owner = new User(Integer.parseInt(request.getParameter("owner")));
		jsm.removeSharedUsers();
		jsm.setUserId(owner.getId());
		jsm.save();
		while (postedvalues.hasMoreElements()) {
			String strPost = postedvalues.nextElement().toString();
			if (strPost.contains("usersCheckBox")) {
				User user = new User(Integer.parseInt(strPost.substring(strPost.indexOf("_") + 1)));
				jsm.shareWithUser(user.getId());
			}
		}
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}	
	private void saveRolePermissions(HttpServletRequest request, HttpServletResponse response) throws Exception {
		Enumeration postedvalues = request.getParameterNames();
		ArrayList<User.Permission> up = new ArrayList<User.Permission>();
		Role role = new Role(request.getSession().getAttribute("RoleID").toString());
		role.deletePermissions();
		String strPermission = "";
		while (postedvalues.hasMoreElements()) {
			String strPost = postedvalues.nextElement().toString();
			if (strPost.contains("userPermission")) {
				strPermission = strPost.substring(strPost.indexOf("_p") + "_p".length());
				User.Permission p = User.Permission.valueOf(strPermission);
				up.add(p);
				//role.savePermission(p);
			}
		}
		role.savePermissions(up);
		request.getSession().setAttribute("UserTab", "Roles");
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}
	private void saveUserRole(HttpServletRequest request, HttpServletResponse response) throws Exception {
		if (request.getSession().getAttribute("UserID") != null) {
			Role role = new Role(request.getParameter("userRoles"));
			User user = new User(Integer.parseInt(request.getSession().getAttribute("UserID").toString()));
			user.deletePermissions();
			for (User.Permission p : role.getPermissions()) {
				user.savePermission(p);
			}
			user.saveRole(request.getParameter("userRoles"));
			RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
			dis.forward(request, response);
		}
	}
	private void saveUser(HttpServletRequest request) throws Exception {
		User user = new User();
		if (request.getSession().getAttribute("UserID") != null || request.getSession().getAttribute("NewUser") != null) {
			if (!request.getParameter("userName").equalsIgnoreCase("")) {
				user.setUserName(request.getParameter("userName"));
				user.save();
			}
			if (!request.getParameter("userPassword").equalsIgnoreCase("")) {
				user.savePassword(request.getParameter("userPassword"));
			}
			user.saveRole(request.getParameter("userRoles"));
			request.getSession().removeAttribute("NewUser");
			request.getSession().setAttribute("UserID", user.getId());
		}
	}
	private void removeUser(HttpServletRequest request, HttpServletResponse response) throws Exception {
		User user;
		if (request.getSession().getAttribute("UserID") != null) {
			user = new User(Integer.parseInt(request.getSession().getAttribute("UserID").toString()));
			user.deletePermissions();
			user.delete();
			request.getSession().removeAttribute("UserID");
		}
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}
	private void addUser(HttpServletRequest request, HttpServletResponse response) throws Exception {
		User user = new User();
		request.getSession().setAttribute("NewUser", user);
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}
	private void savePermissions(HttpServletRequest request, HttpServletResponse response) throws Exception {
		Enumeration postedvalues = request.getParameterNames();
		String userId = "";
		User user;
		userId = request.getSession().getAttribute("UserID").toString();
		user = new User(Integer.valueOf(userId));
		user.deletePermissions();
		if (request.getParameter("userRoles") != null) {
			if (!user.getRoleId().equalsIgnoreCase(request.getParameter("userRoles"))) {
				String roleId = request.getParameter("userRoles");
				user.saveRole(roleId);
			}
		}
		String strPermission = "";
		while (postedvalues.hasMoreElements()) {
			String strPost = postedvalues.nextElement().toString();
			if (strPost.contains("userPermission")) {
				strPermission = strPost.substring(strPost.indexOf("_p")
						+ "_p".length());
				User.Permission p = User.Permission.valueOf(strPermission);
				user.savePermission(p);
			}
		}
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}
	private void logOut(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String redirectText = "main.jsp";
		Enumeration sessionNames = request.getSession().getAttributeNames();
		while (sessionNames.hasMoreElements()) {
			request.getSession().removeAttribute(sessionNames.nextElement().toString());
		}
		response.sendRedirect(redirectText);
	}
	private void autoGenerateTestData(HttpServletRequest request, HttpServletResponse response) throws Exception{
		DataGenerator dg = new DataGenerator();
        Agent agent = new Agent();
        dg.generateRandomStudy("Study One",agent.getAllAgents(),10);
        RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}
//	private void removeRules(HttpServletRequest request, HttpServletResponse response) throws Exception {		
//		String studyId = request.getSession().getAttribute("StudyID").toString();
//		Study study = new Study(studyId);
//		java.util.Enumeration postedvalues = request.getParameterNames();
//        while (postedvalues.hasMoreElements()) {
//            String strPost = postedvalues.nextElement().toString();
//            if (strPost.contains("rulesCheckBox")) {
//                String id = strPost.substring(strPost.indexOf("_") + 1);
//                study.removeRule(id);
//            }
//        }      
//        RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
//        dis.forward(request, response);
//	}
	private void deleteRules(HttpServletRequest request) throws Exception {
    	this.deleteRules(request,null);       
	}
	private void deleteRules(HttpServletRequest request, HttpServletResponse response) throws Exception {
    	java.util.Enumeration postedvalues = request.getParameterNames();
        while (postedvalues.hasMoreElements()) {
            String strPost = postedvalues.nextElement().toString();
            if (strPost.contains("rulesCheckBox")) {
                String id = strPost.substring(strPost.indexOf("_") + 1);
                ExpertRule rule = new ExpertRule(id);
                for(ExpertRule childrule:rule.getChildRules()){
                	childrule.delete();
                }
                rule.delete();
            }
        }
        if(response!=null){
        	RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
        	dis.forward(request, response);
        }
	}
	
	private void closeEditMode(HttpServletRequest request, HttpServletResponse response) throws Exception {
		if (request.getSession().getAttribute("UserTab").toString().equalsIgnoreCase("Users")) {
			request.getSession().removeAttribute("userName");
			request.getSession().removeAttribute("UserID");
			request.getSession().removeAttribute("Search");
		}
		if (request.getSession().getAttribute("UserTab").toString().equalsIgnoreCase("Roles")) {
			request.getSession().removeAttribute("RoleID");
		}
		request.setAttribute("scrollPos", request.getSession().getAttribute("ScrollPos"));
		request.getSession().removeAttribute("ScrollPos");
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}
}