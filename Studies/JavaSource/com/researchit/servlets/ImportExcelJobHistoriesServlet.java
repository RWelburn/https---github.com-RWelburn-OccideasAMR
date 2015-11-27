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


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;


//import org.apache.commons.fileupload.DiskFileUpload;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import com.researchit.io.Importer;
import com.researchit.reports.JHImport;
import com.researchit.reports.JHImportParticipant;
import com.researchit.reports.JHParticipantsReport;


import com.thoughtworks.xstream.XStream;

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
public class ImportExcelJobHistoriesServlet extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet {

	private static final long serialVersionUID = 1L;

	/* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#HttpServlet()
	 */
	public ImportExcelJobHistoriesServlet() {
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
			//request.getSession().removeAttribute("importJHs");
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
		if (request.getSession().getAttribute("StudyID").toString() != null) {
			try{
				//DiskFileUpload fu = new DiskFileUpload();
				// maximum size before a FileUploadException will be thrown
				//fu.setSizeMax(3145728);
				// maximum size that will be stored in memory
				//fu.setSizeThreshold(4096);
				// the location for saving data that is larger than getSizeThreshold()
				if (ServletFileUpload.isMultipartContent(request)){
					ServletFileUpload servletFileUpload = new ServletFileUpload( new DiskFileItemFactory ());
					List fileItems = servletFileUpload.parseRequest(request);
					//List fileItems = fu.parseRequest(request);

                    for (Object fileItem : fileItems) {
                        FileItem item = (FileItem) fileItem;

                        if (item.isFormField()) {
                            if (item.getFieldName().equalsIgnoreCase("logout.x")) {
                                this.logOut(request);
                                break;
                            } else {
                                if (item.getFieldName().equalsIgnoreCase("closeEdit.x")) {
                                    request.getSession().removeAttribute("ImportResult");
                                    request.getSession().removeAttribute("importJHs");
                                }
                            }
                        } else {
                            if (item.getFieldName().equalsIgnoreCase("jHFileName")) {
                                File uploadedFile = new File(item.getName());
                                item.write(uploadedFile);
                                FileInputStream excelFis = new FileInputStream(uploadedFile);
                                Importer importer = new Importer();
                                FileInputStream xmlFis = importer.importJobHistoriesFromExcel(excelFis);
                                XStream xstream = new XStream();
                                xstream.alias("report", JHParticipantsReport.class);
                                xstream.alias("participant", JHImportParticipant.class);
                                xstream.alias("job", JHImport.class);

/*								JHParticipantsReport  reportExport = new JHParticipantsReport();
								JHImportParticipant p = new JHImportParticipant();
								p.setParticipantNumber("BC1234");
								JHImport jh = new JHImport();
								jh.setJobTitle("Cleaner");
								p.getJobHistory().add(jh);
								reportExport.getParticipants().add(p);
*/


                                JHParticipantsReport report = (JHParticipantsReport) xstream.fromXML(xmlFis);
                                String errors = "";
                                for (JHImportParticipant jhiParticipant : report.getParticipants()) {
                                    jhiParticipant.setStudyId(request.getSession().getAttribute("StudyID").toString());
                                    jhiParticipant.save();
                                    errors += "<br/>" + jhiParticipant.getErrors();
                                }
                                String results = "Job Histories found " + report.getParticipants().size();
                                results += "<br/>" + errors;
                                request.getSession().setAttribute("ImportResult", results);
                            }
                        }
                    }
				}
			}catch(Exception e){
//				To Do deal with e.toString());
			}
		}
	}
	
	public void logOut(HttpServletRequest request) throws IOException {
		Enumeration sessionNames = request.getSession().getAttributeNames();
		while (sessionNames.hasMoreElements()) {
			request.getSession().removeAttribute(
					sessionNames.nextElement().toString());
		}
	}
}