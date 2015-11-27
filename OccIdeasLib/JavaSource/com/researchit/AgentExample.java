/**
 * Version:
 *     $Id: AgentExample.java,v 1.4 2008/08/25 01:37:18 ray.welburn Exp $
 *
 * Revisions:
 *     $Log: AgentExample.java,v $
 *     Revision 1.4  2008/08/25 01:37:18  ray.welburn
 *     Updates to use single dbobject and participant status table
 *
 *     Revision 1.3  2008/08/13 04:35:06  ray.welburn
 *     modifications to add/edit agentexamples
 *
 *     Revision 1.2  2008/05/26 08:21:59  troy.sadkowsky
 *     Removed old code
 *
 */
package com.researchit;

import java.sql.ResultSet;
import java.sql.SQLException;
import com.researchit.common.DBBaseObject;

public class AgentExample extends DBBaseObject{	
	private String id;
	private String exampleName;
	private String tlvHigh;
	private String tlvMed;
	private String tlvLow;
	private int agentID;
	
	public AgentExample() {
		super();
	}		
	public AgentExample(String id, int agentID) throws Exception{
		super();
		this.id = id;
		this.agentID = agentID;
		
		if (exists(this.id, this.agentID)){
			this.getPersistantObject();
		}
	}
	protected boolean exists(String id, int agentID) throws Exception {
		Boolean retValue = false;
		String checkSQL = "SELECT id from agentexamples WHERE id = '" + id + "' AND agentid = '" + agentID + "'";
		
		ResultSet rs = null;
		try {
			rs = this.sqlExecuteSelect(checkSQL);
			if (rs != null) {
				if (rs.next()) {
					this.setId(id);
					this.setAgentid(agentID);
					retValue = true;
				}
				if (rs.getStatement() != null) {
					rs.getStatement().close();
				}
				rs.close();
			}		
		} catch (SQLException e) {
			throw new Exception(e.getMessage());
		} finally {			
			rs.close();
			this.closeConnection();
		}
		return retValue;
	}
	protected void getPersistantObject() throws Exception {
		String objectSQL = "SELECT * from agentexamples WHERE id = '" + this.getId() + "'"; 
		ResultSet rs = null;
		try {
			rs = this.sqlExecuteSelect(objectSQL);
			if (rs != null) {
				if (rs.next()) {
					this.setId(rs.getString("id"));
					this.setTlvHigh(rs.getString("tlvhigh"));
					this.setTlvMed(rs.getString("tlvmed"));
					this.setTlvLow(rs.getString("tlvlow"));
					this.setAgentid(Integer.parseInt(rs.getString("agentid")));
				}
				if (rs.getStatement() != null) {
					rs.getStatement().close();
				}
				rs.close();
			}			
		} catch (SQLException e) {
			throw new Exception(e.getMessage());
		} finally {
			rs.close();
			this.closeConnection();
		}
	}	
	public void saveObject() throws Exception {
		if (this.exists(this.getId(), this.agentID)) {
			this.updateObject();
		} else {
			this.insertObject();
		}
	}	
	protected void updateObject() throws Exception {
		String strSQL = "UPDATE agentexamples " +
				"SET examplename ='" + this.getExamplename() +
				"', tlvhigh = '" + this.getTlvHigh() +
				"', tlvmed = '" + this.getTlvMed() +
				"', tlvlow = '" + this.getTlvLow() +
				"' WHERE id = '" + this.getId() +
				"' AND agentid = '" + agentID + "'"; 
	
		try {
			this.sqlExecuteUpdate(strSQL);
	
		} catch (SQLException e) {
			throw new Exception(e.getMessage());
		} finally {
			this.closeConnection();
		}				
	}	
	protected void insertObject() throws Exception {
		String strSQL = "INSERT INTO agentexamples (examplename, tlvhigh, tlvmed, tlvlow, agentid) VALUES ('" 
			+ this.getExamplename() + "', '" 
			+ this.getTlvHigh() + "', '" 
			+ this.getTlvMed() + "', '" 
			+ this.getTlvLow() + "', '" 
			+ this.getAgentid() + "')"; 
	
		try {
			this.sqlExecuteUpdate(strSQL);
	
		} catch (SQLException e) {
			throw new Exception(e.getMessage());
		} finally {
			this.closeConnection();
		}
	}	
	public void delete() throws Exception {
		String strSQL = "DELETE FROM agentexamples WHERE id = " + this.getId();
		try {
			this.sqlExecuteUpdate(strSQL);
		} catch (SQLException e) {
			throw new Exception(e.getMessage());
		} finally {
			this.closeConnection();
		}
	}
	public String getExamplename() {
		return exampleName;
	}
	public void setExamplename(String exampleName) {
		this.exampleName = exampleName;
	}
	public String getTlvHigh() {
		return tlvHigh;
	}
	public void setTlvHigh(String tlvHigh) {
		this.tlvHigh = tlvHigh;
	}
	public String getTlvLow() {
		return tlvLow;
	}
	public void setTlvLow(String tlvLow) {
		this.tlvLow = tlvLow;
	}
	public String getTlvMed() {
		return tlvMed;
	}
	public void setTlvMed(String tlvMed) {
		this.tlvMed = tlvMed;
	}
	public int getAgentid() {
		return agentID;
	}
	public void setAgentid(int agentID) {
		this.agentID = agentID;
	}
	public String getExampleID() {
		return id;
	}
	public void setExampleID(String id) {
		this.id = id;
	}
	/*public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}*/
	
    public void save() throws Exception {
    }
}