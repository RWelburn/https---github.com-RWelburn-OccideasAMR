package com.researchit;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Enumeration;

import com.researchit.common.DBBaseObject;

public class UserActionLogger  extends DBBaseObject {

	private int logID;
	private int userID;
	private Timestamp dateTime = null;
	private String action = "";
	private String attribute = "";
	private String sessionAttribute = "";
	
	public UserActionLogger() {
		super();
	}
	public UserActionLogger(int userID, ArrayList<String> action) throws Exception {
		super();
		this.setUserID(userID);
		this.setAction(action);
	}	
	protected void getPersistentObject() throws Exception {
		String strSQL = "SELECT userid, datetime, action, attribute, sessionattribute FROM actionlogger WHERE logid = "
				+ this.getLogID();
		ResultSet rs = null;
		try {
			rs = this.sqlExecuteSelect(strSQL);
			if (rs != null) {
				if (rs.next()) {
					this.setUserID(rs.getInt("Userid"));
					this.setDateTime(rs.getTimestamp("datetime"));
					this.setAction(rs.getString("action"));
					this.setAction(rs.getString("attribute"));
					this.setAction(rs.getString("sessionattribute"));
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
	public void saveActionLog() {
		String strSQL = "INSERT INTO actionlogger (userid, action, attribute, sessionattribute) VALUES ("
				+ this.getUserID() + ", '"
				+ this.getAction() + "', '" + this.getAttribute() + "', '" + this.getSessionAttribute()
				+ "')";
		try {			
			this.setId(String.valueOf(this.sqlExecuteInsert(strSQL)));
		} catch (Exception e) {
//			To Do deal with e.getMessage());
			//report but do not throw, this is a minor problem
		} finally {
			this.closeConnection();
		}
	}
	public String getAction() {
		if(action.length()>3000){
			action = action.substring(0,3000);
		}
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}	
	public void setAction(ArrayList<String> actions) {
		String userActions = "";
		String id = "";
		String str = "";
		for(String strPost:actions){
			if (!strPost.contains(".y") && !strPost.toLowerCase().contains("minmax") && !strPost.contains("possibleAnswersCheckBox") && !strPost.contains("questionsCheckBox")){			
				if (strPost.contains("_")){
					id = strPost.substring(strPost.indexOf("_") + 1);
					strPost = strPost.substring(0, strPost.indexOf("_"));
					try{
						int num = Integer.parseInt(id);
						id = String.valueOf(num);
					}catch (Exception e) {
						str = id;
						id = "";
					}
				}
				userActions += strPost + "-";
			}
		}
		userActions = userActions.replace("scrollPos-", "");
		userActions = userActions.replace("Action-", "");
		userActions = userActions.replace("searchString-", "");
		userActions = userActions.replace("PageURL-", "");
		userActions = userActions.replace("JSMType-", "");
		userActions = userActions.replace("ScrollPos-", "");
		userActions = userActions.replace(".x", "");
		userActions = userActions + id + "-" + str;
		this.setAction(userActions);
	}
	public Timestamp getDateTime() {
		return dateTime;
	}
	public void setDateTime(Timestamp dateTime) {
		this.dateTime = dateTime;
	}
	public int getLogID() {
		return logID;
	}
	public void setLogID(int logID) {
		this.logID = logID;
	}
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public String getAttribute() {
		return attribute;
	}
	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}	
	public void setAttribute(Enumeration attribute) {
		String userActions = "";
		while (attribute.hasMoreElements()) {
			String strPost = attribute.nextElement().toString();
			userActions += strPost + "-";
		}
		this.setAttribute(userActions);
	}
	public String getSessionAttribute() {
		return sessionAttribute;
	}
	public void setSessionAttribute(String sessionAttribute) {
		this.sessionAttribute = sessionAttribute;
	}
	public void setSessionAttribute(Enumeration sessionAttribute) {
		String userActions = "";
		while (sessionAttribute.hasMoreElements()) {
			String strPost = sessionAttribute.nextElement().toString();			
			userActions += strPost + "-";
		}
		userActions = userActions.replace("ScrollPos-", "");
		userActions = userActions.replace("PageURL-", "");
		this.setSessionAttribute(userActions);
	}
	
    public void save() throws Exception {
    }
}
