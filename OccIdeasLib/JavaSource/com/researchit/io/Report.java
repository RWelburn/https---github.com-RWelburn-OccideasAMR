/**
 * Version:
 *     $Id: Report.java,v 1.2 2009/02/23 05:59:23 troy.sadkowsky Exp $
 *     
 */
package com.researchit.io;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.researchit.common.DBBaseObject;

public class Report extends DBBaseObject {

	public static final String JOBHISTORYREPORT = "1";

	public static final String INTERVIEWSREPORT = "2";

	public static final String ASSESSMENTSREPORT = "3";
	
	private String studyId = "";
	private String frozenJSMId;
	private String dateCreated = "";
	private String reportType = "";
	private Blob fileData;
	private String fileDataString;
	
	public String getFileDataString() {
		return fileDataString;
	}
	public void setFileDataString(String fileDataString) {
		this.fileDataString = fileDataString;
	}
	public String getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(String dateCreated) {
		this.dateCreated = dateCreated;
	}
	public Blob getFileData() {
		return fileData;
	}
	public void setFileData(Blob fileOutput) {
		this.fileData = fileOutput;
	}
	public Report() {
		super();
	}
	public Report(String dbID) throws Exception {
		super();
		if ((dbID != null) && (!(dbID.equalsIgnoreCase("")))) {
			this.setId(dbID);
			this.getPersistentObject();
		}
	}
	public void insert() throws Exception {		
		java.sql.PreparedStatement pst;
        try {
        	this.connect();    
        	byte[] fileByteData = this.getFileDataString().getBytes("UTF-8");       	
        	InputStream is = new ByteArrayInputStream(fileByteData);
            String sql = "INSERT INTO reports (filedata, reporttype,studyid,name,frozenjsmid) VALUES(?,?,?,?,?)";
            pst = this.connection.prepareStatement(sql);
            pst.setBinaryStream(1, is,(int)fileByteData.length);
    		pst.setString(2, this.getReportType());   
    		pst.setString(3,this.getStudyId());
    		pst.setString(4,this.getName());
    		pst.setString(5,this.getFrozenJSMId());
            pst.execute();
            pst.close();     
        } finally {
            closeConnection();
        }  
	}
	public void delete() throws Exception {
		String strSQL = "DELETE FROM agent WHERE id = " + this.getId();
		try {
			this.sqlExecuteUpdate(strSQL);
		} catch (SQLException e) {
			throw new Exception(e.getMessage());
		} finally {
			this.closeConnection();
		}
	}
	protected void getPersistentObject() throws Exception {
		String strSQL = "SELECT id,datecreated,filedata FROM reports WHERE id = "
				+ this.getId();
		ResultSet rs = null;
		try {
			rs = this.sqlExecuteSelect(strSQL);
			if (rs != null) {
				if (rs.next()) {
					this.setId(rs.getString("id"));
					this.setDateCreated(rs.getString("datecreated"));
					this.setFileData(rs.getBlob("filedata"));
					byte[] bdata = this.getFileData().getBytes(1, (int) this.getFileData().length());
					String textConvert = new String(bdata);
					this.setFileDataString(textConvert);
				}
				if (rs.getStatement() != null) {
					rs.getStatement().close();
				}
				rs.close();
			}
		} catch (SQLException e) {
			throw new Exception(e.getMessage());
		} finally {
			this.closeConnection();
		}
	}	
	public String getStudyId() {
		return studyId;
	}
	public void setStudyId(String studyID) {
		this.studyId = studyID;
	}
	public String getReportType() {
		return reportType;
	}
	public void setReportType(String reportType) {
		this.reportType = reportType;
	}
	public String getFrozenJSMId() {
		return frozenJSMId;
	}
	public void setFrozenJSMId(String frozenJSMId) {
		this.frozenJSMId = frozenJSMId;
	}
}