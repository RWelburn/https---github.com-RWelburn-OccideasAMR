/**
 * Version:
 *     $Id: ImportJSMServlet.java,v 1.8 2009/02/15 06:06:48 ray.welburn Exp $
 *
 * Revisions:
 *     $Log: ImportJSMServlet.java,v $
 *     Revision 1.8  2009/02/15 06:06:48  ray.welburn
 *     Add export XML
 *
 *     Revision 1.7  2008/06/11 00:33:38  troy.sadkowsky
 *     formatting update
 *
 *     Revision 1.6  2008/05/30 01:52:08  troy.sadkowsky
 *     removed old code
 *
 *
 */
package com.researchit.servlets;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.DiskFileUpload;
import org.apache.commons.fileupload.FileItem;

import com.researchit.io.Importer;

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
 public class ImportJSMServlet extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet {

	private static final long serialVersionUID = 1L;

	/* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#HttpServlet()
	 */
	public ImportJSMServlet() {
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
			request.setAttribute("Import",true);
        	this.uploadFile(request);
	      	
			RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
			dis.forward(request, response);
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
		fu.setSizeMax(10000000);
		// maximum size that will be stored in memory
		fu.setSizeThreshold(4096);
		// the location for saving data that is larger than getSizeThreshold()

		List fileItems = fu.parseRequest(request);
		for (Iterator it = fileItems.iterator(); it.hasNext();) {
			FileItem fi = (FileItem)it.next();
			if(fi.getFieldName().equalsIgnoreCase("logout.x")){
				this.logOut(request);
				break;
			}else if(fi.getFieldName().equalsIgnoreCase("closeEdit.x")){
				request.removeAttribute("Import");
				break;
			}else if(fi.getFieldName().equalsIgnoreCase("jsmFilename")){
				InputStream is = fi.getInputStream();
				String strFilname = fi.getName();
				if(!(strFilname.equalsIgnoreCase(""))){
					Importer impt = new Importer();
					if (strFilname.toLowerCase().contains(".xml")) {
						impt.importXMLJSMFile(is,strFilname);
					}else{
						impt.importTextJSMFile(is,strFilname);
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