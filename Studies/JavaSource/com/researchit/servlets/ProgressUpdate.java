package com.researchit.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class for Servlet: StudyUpdate
 *
 */
 public class ProgressUpdate extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#HttpServlet()
	 */
	public ProgressUpdate() {
		super();
	}   	
	
	/* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}  	
	
	/* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String progress = "";
		String totalItems = "";
		String action = request.getParameter("action");
		if (action.equals("getUpdate")) {
			if (request.getSession().getAttribute("Progress") != null) {
				progress = request.getSession().getAttribute("Progress").toString();
			}else{
				progress = "0";	
			}
			if (request.getSession().getAttribute("ProgressTotal") != null) {
				totalItems = request.getSession().getAttribute("ProgressTotal").toString();
			}else{
				totalItems = "0";	
			}
			//totalItems = "20";
			String progressXml = progressToXml(progress, totalItems);
//			 Write XML to response.
			response.setContentType("application/xml");
			response.getWriter().write(progressXml);
		}
	}
	private String progressToXml(String progress, String totalItems){
		String progressXml = "<?xml version=\"1.0\"?>\n";
		progressXml += "<progress total=\"" + totalItems + "\" item=\"" + progress + "\">\n";
		progressXml += "</progress>";
		return progressXml;
	}
}