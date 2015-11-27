/**
 * Version:
 *     $Id: StudyNote.java,v 1.10 2008/09/03 07:35:24 troy.sadkowsky Exp $
 *
 * Revisions:
 *     $Log: StudyNote.java,v $
 *     Revision 1.10  2008/09/03 07:35:24  troy.sadkowsky
 *     tidy code and ensure connections close
 *
 *     Revision 1.9  2008/08/25 01:37:24  ray.welburn
 *     Updates to use single dbobject and participant status table
 *
 *     Revision 1.8  2008/08/11 01:50:50  ray.welburn
 *     move study object to common package
 *
 *     Revision 1.7  2008/07/31 01:56:58  ray.welburn
 *     MainDB removed
 *
 *     Revision 1.6  2008/07/22 06:54:44  ray.welburn
 *     integration changes for new interface
 *
 *     Revision 1.5  2008/05/26 08:22:05  troy.sadkowsky
 *     Removed old code
 *
 */
package com.researchit;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.researchit.common.DBBaseObject;
import com.researchit.common.Study;

public final class StudyNote extends DBBaseObject {

	private String name = "";	
	private String studyNote  = "";	
	private String studyId = "";	
	//public boolean bDontClose = false;
	public Study study;
	
	public StudyNote() {
		super();
	}	
	public StudyNote(String dbID) throws Exception {
		super();
		if ((dbID != null) && (!(dbID.equalsIgnoreCase("")))) {
			this.setId(dbID);
			this.getPersistentObject();
		}
	}	
	public Study getStudy() throws Exception {
		if(study == null && studyId != null) {
			study = new Study(studyId);
		}		
		return study;
	}	
	public String getStudyNote() {
		if(studyNote == null || studyNote == "") {
			studyNote = "NULL";
		}
		return studyNote;
	}	
	public String getStudyId() {
		if(studyId == null || studyId == "") {
			studyId = "NULL";
		}
		return studyId;
	}	
	public void insert() throws Exception {
		if (!(this.exists())) {
			String strSQL = "INSERT INTO studynotes (name,studynote,studyid) VALUES('"
					+ this.getName().replaceAll("'", "''")
					+ "','"
					+ this.getStudyNote().replaceAll("'", "''")
					+ "',"
					+ this.getStudyId() +")";
			try {
				this.setId(String.valueOf(this.sqlExecuteInsert(strSQL)));
			} catch (SQLException e) {
				throw new Exception(e.getMessage());
			} finally {
				this.closeConnection();
			}
		}
	}
	public void update() throws Exception {
		String strSQL = "UPDATE studynotes SET name = '"
				+ this.escapeSpecialCharacters(this.getName()) + "',studynote = '"
				+ this.escapeSpecialCharacters(this.getStudyNote()) + "',studyid = "
				+ this.getStudyId() 
				+ " WHERE id = " + this.getId();
		try {
			this.sqlExecuteUpdate(strSQL);
		} catch (SQLException e) {
			throw new Exception(e.getMessage());
		} finally {
			this.closeConnection();
		}
	}
	public void save() throws Exception {
		if (this.exists()) {
			this.update();
		} else {
			this.insert();
		}
	}
	public boolean exists() throws Exception {
		boolean bRetValue = false;
		if(this.getId().equalsIgnoreCase("")){
			String strSQL = "SELECT id FROM studynotes WHERE name = '"
				+ this.escapeSpecialCharacters(this.name) + "'";
			ResultSet rs = null;
			try {
				rs = this.sqlExecuteSelect(strSQL);
				if (rs != null) {
					if (rs.next()) {
						this.setId(rs.getString("id"));
						bRetValue = true;
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
		}else{
			bRetValue = true;
		}
		return bRetValue;
	}
	public void delete() throws Exception {
		String strSQL = "DELETE FROM studynotes WHERE id = " + this.getId();
		try {
			this.sqlExecuteUpdate(strSQL);
		} catch (SQLException e) {
			throw new Exception(e.getMessage());
		} finally {
			this.closeConnection();
		}
	}
	protected void getPersistentObject() throws Exception {
		String strSQL = "SELECT id,name, studynote, studyid FROM studynotes WHERE id = "
				+ this.getId();
		ResultSet rs = null;
		try {
			rs = this.sqlExecuteSelect(strSQL);
			if (rs != null) {
				if (rs.next()) {
					this.setId(rs.getString("id"));
					this.setName(rs.getString("name"));
					this.setStudyNote(rs.getString("studynote"));
					this.setStudyId(rs.getString("studyid"));
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
	public void setStudyNote(String sNote) {
		this.studyNote = sNote;
	}
	public void setStudyId(String studyId) {
		this.studyId = studyId;
	}
}
