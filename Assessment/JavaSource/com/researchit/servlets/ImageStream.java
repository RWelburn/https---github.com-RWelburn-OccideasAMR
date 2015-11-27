/**
 * Version:
 *     $Id: ImageStream.java,v 1.3 2008/05/30 01:52:52 troy.sadkowsky Exp $
 *
 * Revisions:
 *     $Log: ImageStream.java,v $
 *     Revision 1.3  2008/05/30 01:52:52  troy.sadkowsky
 *     removed old code
 *
 *
 */
package com.researchit.servlets;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.researchit.Image;

/**
 * Servlet implementation class for Servlet: ImageStream
 *
 */
 public class ImageStream extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet {
 
	private static final long serialVersionUID = 1L;

	/* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#HttpServlet()
	 */
	public ImageStream() {
		super();
	}   	
	
	/* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		//Get the image name and type from the parameter and set the response type accordingly
		String imageName = request.getParameter("ImageName");
		imageName = imageName.replace(".", ":");
		String[] s = imageName.split(":");
		imageName = s[0];
		String imageType = s[1];
		response.setContentType("image/" + imageType);
//Get the image from the datebase
		try{
			Image image = new Image(imageName, imageType);
			InputStream is = image.getImageData().getBinaryStream();
			OutputStream out = response.getOutputStream();
			int imageByte = 0;
			do{
				imageByte = is.read();
				if (imageByte != -1) {
					//print images bytes to output stream
					out.write(imageByte);
				}
			}while (imageByte != -1);
			out.close();
			is.close();
		} catch(Exception e) {
			//To Do
		}
	}  	
	
	/* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}   	  	    
}