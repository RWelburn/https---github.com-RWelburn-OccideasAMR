/**
 * Version:
 *     $Id: ValidateServlet.java,v 1.25 2008/12/11 15:32:17 ray.welburn Exp $
 *
 * Revisions:
 *     $Log: ValidateServlet.java,v $
 *     Revision 1.25  2008/12/11 15:32:17  ray.welburn
 *     Add cookies for login
 *
 *     Revision 1.24  2008/09/12 02:41:34  troy.sadkowsky
 *     encrypt user id
 *
 *     Revision 1.23  2008/08/25 01:36:16  ray.welburn
 *     Updates to use single dbobject and participant status table
 *
 *     Revision 1.22  2008/08/11 01:56:59  ray.welburn
 *     move study object to common package
 *
 *     Revision 1.21  2008/05/30 01:52:29  troy.sadkowsky
 *     removed old code
 *
 *
 */
package com.researchit.servlets;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.researchit.common.Participant;
import com.researchit.ParticipantStatus;
import com.researchit.User;
import com.researchit.Util;
import com.researchit.common.Study;

/**
 * Servlet implementation class for Servlet: ValidateServlet
 * 
 * @web.servlet name="ValidateServlet" display-name="ValidateServlet"
 * 
 * @web.servlet-mapping url-pattern="/ValidateServlet"
 * 
 */
public class ValidateServlet extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet {

	private static final long serialVersionUID = 1L;

	/*
	 * (non-Java-doc)
	 * 
	 * @see javax.servlet.http.HttpServlet#HttpServlet()
	 */
	public ValidateServlet() {
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
		doPost(request, response);
	}

	/*
	 * (non-Java-doc)
	 * 
	 * @see javax.servlet.http.HttpServlet#doPost(HttpServletRequest arg0,
	 *      HttpServletResponse arg1)
	 */
	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		// get username and password
		String strUsername = "";
		String strPassword = "";
		final int SECONDS_PER_YEAR = 60*60*24*365;
		if (request.getParameter("username") != null) {
			strUsername = request.getParameter("username");
			if (request.getParameter("password") != null) {
				strPassword = request.getParameter("password");
				
				boolean bValid = false;
				try {
					User theUser = new User(strUsername, strPassword);
					if(request.getSession().getAttribute("StudyName")!=null){
						Study study = new Study();
						study = study.findStudy(request.getSession().getAttribute("StudyName").toString());	
						if(study.exists()){
							request.getSession().setAttribute("StudyID",study.getId());
							if(request.getParameter("isParticipant")!=null){
								bValid = theUser.isParticipant(strUsername,strPassword,study.getId());
								if (bValid) {
									// set the user and participant in the session
									request.getSession().setAttribute("UserObject", theUser);
									Long pid = theUser.getParticipant(strUsername,strPassword,study.getId()).getParticipantId();
									request.getSession().setAttribute("ParticipantID", pid);
									request.getSession().setAttribute("userIsParticipant", "true");	
									Participant p = new Participant(pid);
									String page = "";
									if(p.getStatusId().equalsIgnoreCase(ParticipantStatus.READYFORINTERVIEW)){
										page = "selfadminpage5.jsp";
				                	}else{
				                		page = "selfadminpage1.jsp";
				                	}
									RequestDispatcher dis = request.getRequestDispatcher(page);
									dis.forward(request, response);											
								} else {
									request.setAttribute("username", theUser.getName());
									request.setAttribute("password", strPassword);
									request.setAttribute("error", theUser.getErrorMessage());
									RequestDispatcher dis = request.getRequestDispatcher("participantLogin.jsp");
									dis.forward(request, response);
								}
							}else{
								Enumeration sessionNames = request.getSession().getAttributeNames();
					            while (sessionNames.hasMoreElements()) {
					                request.getSession().removeAttribute(sessionNames.nextElement().toString());
					            }
								response.sendRedirect("main.jsp?Location=Logout");
							}
						}else {
							request.setAttribute("username", theUser.getName());
							request.setAttribute("password", strPassword);
							request.setAttribute("error", "This study has not been established yet.");
							RequestDispatcher dis = request.getRequestDispatcher("participantLogin.jsp");
							dis.forward(request, response);
						}
					}else{
						if (theUser.hasPermission(User.Permission.STUDIESLOGIN)) {
//							If the rememberme checkbox is ticked then create the user and password cookies
							Cookie ucookie = new Cookie("user", strUsername);
							Cookie pcookie = new Cookie("password", strPassword);
							if (request.getParameter("rememberme") != null) {
								request.setAttribute("rememberme", "checked");
								ucookie.setMaxAge(SECONDS_PER_YEAR);
								pcookie.setMaxAge(SECONDS_PER_YEAR);
								response.addCookie(ucookie);
								response.addCookie(pcookie);
								//Otherwise remove them
							}else{
								ucookie.setMaxAge(0);
								pcookie.setMaxAge(0);
								response.addCookie(ucookie);
								response.addCookie(pcookie);
							}
							String location = "main.jsp?Location=Home";
							// set the user in the session
							request.getSession().setAttribute("UserObject", theUser);
							if(theUser.getStudies().size() == 1){
								String defaultStudyId = theUser.getStudies().get(0).getId();
								request.getSession().setAttribute("StudyID",defaultStudyId); 
								if(theUser.getRoleId().equalsIgnoreCase("4")){
									location = "main.jsp?Location=Interviews";
									request.getSession().setAttribute("StatusFilter","2");
								}
							}
							response.sendRedirect(location);
						} else {
							if(theUser.getUserName().startsWith("IRSA")){ //this is a rett participant
								request.setAttribute("username", theUser.getUserName());
								request.setAttribute("password", strPassword);
								request.setAttribute("error", theUser.getErrorMessage());
								RequestDispatcher dis = request.getRequestDispatcher("participantLogin.jsp");
								dis.forward(request, response);
							}else{
								request.setAttribute("username", theUser.getUserName());
								request.setAttribute("password", strPassword);
								request.setAttribute("error", "User name and password not valid. Please try again or contact the systems administrator.");
								RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
								dis.forward(request, response);
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
		}else if (request.getParameter("u") != null) {
			if(request.getParameter("sid") != null){
				if(request.getSession().getId().length()==request.getParameter("sid").length()){
					if (request.getParameter("p") != null) {
						String uid = request.getParameter("u");				
						String decryptedUId = Util.decrypt(uid);
						User user = new User();
						user.setId(decryptedUId);
						try{
							if(user.hasPermission(User.Permission.STUDIESLOGIN)){
//								 set the user in the session
								request.getSession().setAttribute("UserObject", user);
								if(user.getStudies().size() == 1){
									String defaultStudyId = user.getStudies().get(0).getId();
									request.getSession().setAttribute("StudyID",defaultStudyId); 
								}
								response.sendRedirect("main.jsp?Location=Home");
							}else{												
								request.setAttribute("error", "You do not have permission.");
								RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
								dis.forward(request, response);
							}
						}catch (Throwable e){
							e.printStackTrace();
							request.setAttribute("errorMessage", e.getMessage());
							RequestDispatcher dis = request.getRequestDispatcher("errorpage.jsp");
				            dis.forward(request, response);
						}				
					}
				}
			}		
		}
		if (request.getParameter("reset") != null) {
            Enumeration sessionNames = request.getSession().getAttributeNames();
            while (sessionNames.hasMoreElements()) {
                request.getSession().removeAttribute(sessionNames.nextElement().toString());
            }
			response.sendRedirect("main.jsp?Location=Logout");
		}
	}
}