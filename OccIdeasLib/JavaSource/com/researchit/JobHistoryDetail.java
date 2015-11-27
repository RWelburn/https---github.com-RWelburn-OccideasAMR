package com.researchit;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.researchit.common.DBBaseObject;

public class JobHistoryDetail extends DBBaseObject{
	private String name;
	private String value;
	private long jobHistoryId;
	
	public JobHistoryDetail() {
		super();
	}
	
	public JobHistoryDetail(String id) throws Exception{
		super();
		this.setId(id);
		this.getPersistentObject();
	}

	public void getPersistentObject() throws Exception {
		String strSQL = "SELECT id,name,value,jobhistory_id FROM jobhistory_info WHERE id = "
				+ this.getId();
		ResultSet rs = null;
		try {
			rs = this.sqlExecuteSelect(strSQL);
			if (rs != null) {
				if (rs.next()) {
					this.setId(rs.getString("id"));
					this.setName(rs.getString("name"));
					this.setValue(rs.getString("value"));
					this.setJobHistoryId(rs.getLong("jobhistory_id"));
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
	
	public void saveUpdate() throws Exception{
		boolean updating = this.exists();
		String sql;
		this.connect();
		if (updating) {
			sql = "UPDATE jobhistory_info SET name='"+this.escapeSpecialCharacters(this.getName())+"', value='"+this.escapeSpecialCharacters(this.getValue())+"', jobhistory_id="+this.getJobHistoryId()
					+ " WHERE id="+this.getId();
			this.sqlExecuteUpdate(sql);
		} else {
			sql = "INSERT INTO jobhistory_info (name, value, jobhistory_id) "
					+ "VALUES ('"+this.escapeSpecialCharacters(this.getName())+"', '"+this.escapeSpecialCharacters(this.getValue())+"', "+this.getJobHistoryId()+")";
			this.setId(this.sqlExecuteInsert(sql).toString());
		}
		this.closeConnection();
}

public boolean exists() throws Exception {
	boolean bRetValue = false;
	if (!(this.getId().equalsIgnoreCase(""))) {
		bRetValue = true;
	} 
	return bRetValue;
}
	
	public long getJobHistoryId() {
		return jobHistoryId;
	}
	public void setJobHistoryId(long jobHistoryId) {
		this.jobHistoryId = jobHistoryId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
}
