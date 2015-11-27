/**
 * Version:
 *     $Id: ImportStudyNotesServlet.java,v 1.11 2008/12/17 06:39:30 ray.welburn Exp $
 *
 * Revisions:
 *     $Log: ImportStudyNotesServlet.java,v $
 *     Revision 1.11  2008/12/17 06:39:30  ray.welburn
 *     Change study note import to just upload the file to database
 *
 *     Revision 1.10  2008/08/25 01:36:15  ray.welburn
 *     Updates to use single dbobject and participant status table
 *
 *     Revision 1.9  2008/08/11 01:56:57  ray.welburn
 *     move study object to common package
 *
 *     Revision 1.8  2008/05/30 01:52:29  troy.sadkowsky
 *     removed old code
 *
 *
 */
package com.researchit.servlets;

import java.io.IOException;
import java.io.InputStream;
import java.sql.ResultSet;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.DiskFileUpload;
import org.apache.commons.fileupload.FileItem;

import com.researchit.common.Study;

/**
 * Servlet implementation class for Servlet: ImportJSMServlet
 *
 * @web.servlet
 *   name="ImportJSMServlet"
 *   display-name="ImportJSMServlet" 
 *
 * @web.servlet-mapping
 *   url-pattern="/ImportJSMServlet"
 *  
 */
 public class ImportStudyNotesServlet extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet {
 
	private static final long serialVersionUID = 1L;

	/* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#HttpServlet()
	 */
	public ImportStudyNotesServlet() {
		super();
	}   	
	
	/* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#doGet(HttpServletRequest arg0, HttpServletResponse arg1)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request,response);
	}  	
	
	/* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#doPost(HttpServletRequest arg0, HttpServletResponse arg1)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {	
			if(request.getParameter("sNoteID")!=null){		
				String sNoteId = request.getParameter("sNoteID").toString();
				if(request.getSession().getAttribute("StudyID")!=null){
					String studyId = request.getSession().getAttribute("StudyID").toString(); 
					Study study = new Study(studyId);					 
					java.sql.PreparedStatement pst;
					InputStream is = null;
			        try {
			            study.connect();           
			            String sql = "SELECT name,studynote FROM studynotes WHERE studyid = ? AND id = ?";
			            pst = study.connection.prepareStatement(sql);
			            pst.setString(1, study.getId());
			            pst.setString(2, sNoteId);
			            ResultSet rs = pst.executeQuery();
			            String name = "";
			            if(rs.next()){
			            	name = rs.getString("name");
			            	is = rs.getBinaryStream("studynote");             	
			            }
			            response.setHeader("Content-disposition","attachment;filename=\""+name+"\"");
			            int nextByte; 
						while ((nextByte = is.read()) != -1)
				        {
				            response.getOutputStream().write(nextByte);
				        }     	             	       	
			            pst.close(); 
			        } catch(Exception e){
			        	throw new Exception(e.getMessage());
			        } finally {
			        	study.closeConnection();
			        }  								
				}
				
			}else{
				this.uploadFile(request);	        	
				request.setAttribute("editStudyNote",true);
				RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
				dis.forward(request, response);
			}
        	
		} catch (Exception e) {
			e.printStackTrace();
            request.setAttribute("errorMessage",e.getMessage());
            RequestDispatcher dis = request.getRequestDispatcher("errorpage.jsp");
            dis.forward(request, response);
		}
	}  
	private void uploadFile(HttpServletRequest request) throws Exception {
		DiskFileUpload fu = new DiskFileUpload();
		// maximum size before a FileUploadException will be thrown
		fu.setSizeMax(3145728);
		// maximum size that will be stored in memory
		fu.setSizeThreshold(4096);
		// the location for saving data that is larger than getSizeThreshold()

		List fileItems = fu.parseRequest(request);
		for (Iterator it = fileItems.iterator(); it.hasNext();) {
			FileItem fi = (FileItem)it.next();
			if(fi.getFieldName().equalsIgnoreCase("logout.x")){
				this.logOut(request);
				break;
			}else if(fi.getFieldName().equalsIgnoreCase("StudyNotesFileName")){
				String strFileName = fi.getName();								
				if(!(strFileName.equalsIgnoreCase(""))){
					if (request.getSession().getAttribute("StudyID") != null) {
						Study study = new Study(request.getSession().getAttribute("StudyID").toString());
						study.loadFile(fi.getInputStream(), (int)fi.getSize(), fi.getName());
					}
				}	
			}			
		}
	}	
	private void logOut(HttpServletRequest request) throws IOException {
        Enumeration sessionNames = request.getSession().getAttributeNames();
        while (sessionNames.hasMoreElements()) {
            request.getSession().removeAttribute(
                    sessionNames.nextElement().toString());
        }
    }
}