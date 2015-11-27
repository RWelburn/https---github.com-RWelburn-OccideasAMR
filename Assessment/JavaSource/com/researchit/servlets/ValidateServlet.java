/**
 * Version:
 *     $Id: ValidateServlet.java,v 1.12 2008/12/11 15:32:27 ray.welburn Exp $
 *
 * Revisions:
 *     $Log: ValidateServlet.java,v $
 *     Revision 1.12  2008/12/11 15:32:27  ray.welburn
 *     Add cookies for login
 *
 *     Revision 1.11  2008/09/12 02:38:30  troy.sadkowsky
 *     ASsessment report updates
 *
 *     Revision 1.10  2008/08/11 00:45:22  troy.sadkowsky
 *     rearrange assessment yellow tabs
 *
 *     Revision 1.9  2008/05/30 01:52:52  troy.sadkowsky
 *     removed old code
 *
 *
 */
package com.researchit.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.researchit.User;
import com.researchit.UserActionLogger;
import com.researchit.Util;

/**
 * Servlet implementation class for Servlet: ValidateServlet
 * 
 * @web.servlet name="ValidateServlet" display-name="ValidateServlet"
 * 
 * @web.servlet-mapping url-pattern="/ValidateServlet"
 * 
 */
public class ValidateServlet extends javax.servlet.http.HttpServlet implements
		javax.servlet.Servlet {
	/**
	 * 
	 */
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
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// get username and password
		String strUsername = "";
		String strPassword = "";
		final int SECONDS_PER_YEAR = 60*60*24*365;
		if (request.getParameter("username") != null) {
			strUsername = request.getParameter("username");
			if (request.getParameter("password") != null) {
				strPassword = request.getParameter("password");
				
				try {
					User theUser = new User(strUsername, strPassword);
					if (theUser.hasPermission(User.Permission.ASSESSMENTLOGIN)) {
						try {
							ArrayList<String> action = new ArrayList<String>();
							action.add("Login");
							UserActionLogger ual;
							ual = new UserActionLogger(Integer.parseInt(theUser.getId()), action);
							ual.saveActionLog();
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						if(theUser.getStudies().size() == 1){
							String defaultStudyId = theUser.getStudies().get(0).getId();
							request.getSession().setAttribute("StudyID",defaultStudyId); 
						}
						//If the rememberme checkbox is ticked then create the user and password cookies
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
						// set the user in the session
						request.getSession().setAttribute("UserObject", theUser);
						request.getSession().setAttribute("UserTab","Users");
						response.sendRedirect("main.jsp?Location=Home");
					} else {
						request.setAttribute("username", theUser.getName());
						request.setAttribute("password", strPassword);
						request.setAttribute("error", "User name and password not valid. Please try again or contact the systems administrator.");

						//request.setAttribute("error", theUser.getErrorMessage());
						RequestDispatcher dis = request
								.getRequestDispatcher("main.jsp");
						dis.forward(request, response);
					}
				} catch (Throwable e) {
					e.printStackTrace();
					request.setAttribute("errorMessage", e.getMessage());
					response.sendRedirect("errorpage.jsp");
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