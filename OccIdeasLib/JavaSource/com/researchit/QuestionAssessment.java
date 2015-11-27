
package com.researchit;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.researchit.common.DBBaseObject;
import com.researchit.expert.ExpertRule;

/**
 * @author troyS
 * 
 */
public class QuestionAssessment extends DBBaseObject {	

	private String agentassessmentid;
	private String exposure;
	private String level;
	private float frequencyweeks = -1;
	private float frequencyhours = -1;
	private String dontknow;
	private String jsmquestionstructureid;
	
	public QuestionAssessment() {
		super();
	}

	public QuestionAssessment(String dbID) throws Exception {
		super();
		if ((dbID != null) && (!(dbID.equalsIgnoreCase("")))) {
			this.setId(dbID);
			this.getPersistentObject();
		}
	}
	
	public String getDontknow() {
		if(dontknow==null){
			dontknow = "";
		}
		return dontknow;
	}
	public void setDontknow(String dontknow) {
		this.dontknow = dontknow;
	}
	public String getExposure() {
		if(exposure==null){
			exposure = "";
		}
		return exposure;
	}
	public void setExposure(String exposure) {
		this.exposure = exposure;
	}
	public float getFrequencyweeks() {		
		return frequencyweeks;
	}
	public void setFrequencyweeks(float frequencyweeks) {
		this.frequencyweeks = frequencyweeks;
	}
	public float getFrequencyhours() {	
		return frequencyhours;
	}
	public void setFrequencyhours(float frequencyhours) {
		this.frequencyhours = frequencyhours;
	}

	public String getLevel() {
		if(level==null){
			level = "";
		}
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}

	public void insert() throws Exception {

		String strSQL = "INSERT INTO questionassessments (agentassessmentid, exposure,level,frequencyweeks,frequencyhours,dontknow,jsmquestionstructureid) VALUES('"
				+ this.agentassessmentid
				+ "','"
				+ this.escapeSpecialCharacters(this.getExposure())
				+ "','"
				+ this.escapeSpecialCharacters(this.getLevel())
				+ "',"
				+ this.getFrequencyweeks()
				+ ","
				+ this.getFrequencyhours()
				+ ",'"
				+ this.escapeSpecialCharacters(this.getDontknow())
				+ "','"
				+ this.escapeSpecialCharacters(this.getJsmquestionstructureid())
				+ "')";
		try {
			this.setId(String.valueOf(this.sqlExecuteInsert(strSQL)));
		} catch (SQLException e) {
			throw new Exception(e.getMessage());
		} finally {
			this.closeConnection();
		}
	}
	public void update() throws Exception {
		String strSQL = "UPDATE questionassessments SET "
					+ "exposure = '"
					+ this.getExposure()
					+ "',level = '"
					+ this.getLevel()
					+ "',frequencyweeks = "
					+ this.getFrequencyweeks()
					+ ",frequencyhours = "
					+ this.getFrequencyhours()
					+ ",dontknow = '"
					+ this.getDontknow()
					+ "',jsmquestionstructureid = '"
					+ this.getJsmquestionstructureid()
					+ "' WHERE agentassessmentid = " + this.agentassessmentid + " AND jsmquestionstructureid = " + this.getJsmquestionstructureid();
		
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
	
	private boolean exists() throws Exception {
		boolean bRetValue = false;
		String strSQL = "SELECT * FROM questionassessments WHERE agentassessmentid = " + this.agentassessmentid + " AND jsmquestionstructureid = " + this.getJsmquestionstructureid();

		ResultSet rs = null;
		try {
			rs = this.sqlExecuteSelect(strSQL);
			if (rs != null) {
				if (rs.next()) {
					this.setAgentassessmentid(rs.getString("agentassessmentid"));
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
		return bRetValue;
	}

	public void delete() throws Exception {
		String strSQL = "DELETE FROM questionassessments WHERE agentassessmentid = " + this.agentassessmentid;
		try {
			this.sqlExecuteUpdate(strSQL);
		} catch (SQLException e) {
			throw new Exception(e.getMessage());
		} finally {
			this.closeConnection();
		}
	}
	public void getPersistentObject() throws Exception {
		String strSQL = "SELECT * FROM questionassessments WHERE agentassessmentid = " + this.agentassessmentid + " AND jsmquestionstructureid = " + this.getJsmquestionstructureid();

		ResultSet rs = null;
		try {
			rs = this.sqlExecuteSelect(strSQL);
			if (rs != null) {
				if (rs.next()) {
					this.setAgentassessmentid(rs.getString("agentassessmentid"));
					this.setExposure(rs.getString("exposure"));
					this.setLevel(rs.getString("Level"));
					this.setFrequencyweeks(rs.getFloat("frequencyweeks"));
					this.setFrequencyhours(rs.getFloat("frequencyhours"));
					this.setDontknow(rs.getString("dontknow"));
					this.setJsmquestionstructureid(rs.getString("jsmquestionstructureid"));
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
	public String getAgentassessmentid() {
		return agentassessmentid;
	}
	public void setAgentassessmentid(String agentassessmentid) {
		this.agentassessmentid = agentassessmentid;
	}

	public String getJsmquestionstructureid() {
		return jsmquestionstructureid;
	}

	public void setJsmquestionstructureid(String jsmquestionstructureid) {
		this.jsmquestionstructureid = jsmquestionstructureid;
	}
}