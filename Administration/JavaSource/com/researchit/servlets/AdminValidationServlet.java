/**
 * Version:
 *     $Id$
 *
 * Revisions:
 *     $Log$
 *     Revision 1.2  2008/08/12 04:04:47  ray.welburn
 *     Change index.jsp to main.jsp
 *
 *     Revision 1.1  2008/08/06 01:10:29  troy.sadkowsky
 *     applied new updates to administration system
 *
 *     Revision 1.4  2008/05/30 01:52:43  troy.sadkowsky
 *     removed old code
 *
 *
 */
package com.researchit.servlets;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.researchit.User;

/**
 * Servlet implementation class for Servlet: ValidateServlet
 * 
 * @web.servlet name="ValidateServlet" display-name="ValidateServlet"
 * 
 * @web.servlet-mapping url-pattern="/ValidateServlet"
 * 
 */
public class AdminValidationServlet extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet {

	private static final long serialVersionUID = 1L;

	/*
	 * (non-Java-doc)
	 * 
	 * @see javax.servlet.http.HttpServlet#HttpServlet()
	 */
	public AdminValidationServlet() {
		super();
	}

	/*
	 * (non-Java-doc)
	 * 
	 * @see javax.servlet.http.HttpServlet#doGet(HttpServletRequest arg0,
	 *      HttpServletResponse arg1)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/*
	 * (non-Java-doc)
	 * 
	 * @see javax.servlet.http.HttpServlet#doPost(HttpServletRequest arg0,
	 *      HttpServletResponse arg1)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// get username and password
		String strUsername = "";
		String strPassword = "";
		
			if (request.getParameter("username") != null) {
				strUsername = request.getParameter("username");
				if (request.getParameter("password") != null) {
					strPassword = request.getParameter("password");
					try {
						User theUser = new User(strUsername, strPassword);
						if (theUser.exists()) {
							if (theUser.isAdministrator()) {						
								request.getSession().setAttribute("UserObject",theUser);
								RequestDispatcher dis = request.getRequestDispatcher("main.jsp?BlueTabLocation=Admin");
								dis.forward(request, response);
							}else{
								request.setAttribute("error", "You are not authorised to log into the admin section");
								RequestDispatcher dis = request.getRequestDispatcher("main.jsp?Location=Logout");
								dis.forward(request, response);
							}
						}else{
							request.setAttribute("error", "Not a valid username/password");
							RequestDispatcher dis = request.getRequestDispatcher("main.jsp?Location=Logout");
							dis.forward(request, response);
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
							User user = new User();
							user.setId(uid);
							try{
								if(user.isAdministrator()){
//									 set the user in the session
									request.getSession().setAttribute("UserObject", user);
									RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
									dis.forward(request, response);
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
