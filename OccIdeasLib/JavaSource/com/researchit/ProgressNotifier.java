/**
 * Version:
 *     $Id$
 *
 * Revisions:
 *     $Log$
 *     Revision 1.3  2008/08/25 01:37:23  ray.welburn
 *     Updates to use single dbobject and participant status table
 *
 *     Revision 1.2  2008/05/26 08:22:05  troy.sadkowsky
 *     Removed old code
 *
 */
package com.researchit;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.researchit.common.DBBaseObject;

public class ProgressNotifier extends DBBaseObject {

	long percentComplete;
	int size;
	int currentPos;
	String userId;
	String sessionId;
	
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getSessionId() {
		return sessionId;
	}
	public String getUserId() {
		return userId;
	}
	public long getCurrentPercentComplete() throws Exception {
		ResultSet rs = null;	
		String strSQL = "SELECT percentcomplete FROM progress WHERE id = "+this.getId();
		rs = this.sqlExecuteSelect(strSQL);
		if (rs != null) {
			if (rs.next()) {
				percentComplete = rs.getLong("percentcomplete");
			}
			if (rs.getStatement() != null) {
				rs.getStatement().close();
			}
			rs.close();
		}	
		this.closeConnection();
		return percentComplete;
	}
	public ProgressNotifier() {
		super();
	}
	public ProgressNotifier(String id) {
		super();
		this.setId(id);
	}
	public void save() throws Exception {
		if (this.exists()) {
			this.update();
		} else {
			this.insert();
		}
	}
	public void setPercentComplete(int percentComplete) {
		this.percentComplete = percentComplete;
	}
	public boolean exists() throws Exception {
		boolean bRetValue = false;
		if(this.getId().equalsIgnoreCase("")){
			bRetValue = false;
		}else{
			bRetValue = true;
		}
		
		return bRetValue;
	}
	public void update() throws Exception {
		String strSQL = "UPDATE progress SET percentcomplete = "
				+ this.getPercentComplete() + " WHERE id = "+this.getId();
		try {
			this.sqlExecuteUpdate(strSQL);
		} catch (SQLException e) {
			throw new Exception(e.getMessage());
		} finally {
			this.closeConnection();
		}
	}
	public void insert() throws Exception {
		if (!(this.exists())) {
			String strSQL = "INSERT INTO progress (percentcomplete) VALUES(1)";
			try {
				this.setId(String.valueOf(this.sqlExecuteInsert(strSQL)));
			} catch (SQLException e) {
				throw new Exception(e.getMessage());
			} finally {
				this.closeConnection();
			}
		}
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getCurrentPos() {
		return currentPos;
	}
	public void setCurrentPos(int currentPos) {
		this.currentPos = currentPos;
	}
	public long getPercentComplete() {
		double value = ((double)((double)currentPos/(double)size))*100;
		percentComplete = Math.round(value);
		return percentComplete;
	}
}
