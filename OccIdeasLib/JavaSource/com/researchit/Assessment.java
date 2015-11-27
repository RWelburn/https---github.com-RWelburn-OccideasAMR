/**
 * Version:
 *     $Id: Assessment.java,v 1.28 2009/05/06 08:25:12 troy.sadkowsky Exp $
 *
 * Revisions:
 *     $Log: Assessment.java,v $
 *     Revision 1.28  2009/05/06 08:25:12  troy.sadkowsky
 *     occideas new version updates
 *
 *     Revision 1.27  2009/02/04 22:42:53  troy.sadkowsky
 *     removed graphplot and added assessorid
 *
 *     Revision 1.26  2008/11/15 09:08:59  troy.sadkowsky
 *     various bug fixes and code cleaning
 *
 *     Revision 1.25  2008/09/03 07:35:24  troy.sadkowsky
 *     tidy code and ensure connections close
 *
 *     Revision 1.24  2008/08/25 01:37:23  ray.welburn
 *     Updates to use single dbobject and participant status table
 *
 *     Revision 1.23  2008/07/05 03:27:00  troy.sadkowsky
 *     order fired rules
 *
 *     Revision 1.22  2008/06/27 04:01:04  ray.welburn
 *     Remove brackets from sql statements
 *
 *     Revision 1.21  2008/05/26 08:22:02  troy.sadkowsky
 *     Removed old code
 *
 *     Revision 1.20  2008/04/22 23:21:28  troy.sadkowsky
 *     new assessment requirements
 *
 *     Revision 1.19  2008/04/15 22:58:03  troy.sadkowsky
 *     melb updates
 *
 *     Revision 1.18  2007/11/09 05:16:44  troy.sadkowsky
 *     updated jh statuses
 *
 *     Revision 1.17  2007/11/08 11:40:00  troy.sadkowsky
 *     show final assessment with colours
 *
 *     Revision 1.16  2007/11/08 06:48:48  troy.sadkowsky
 *     progress bar
 *
 *     Revision 1.15  2007/10/15 05:48:24  troy.sadkowsky
 *     show frequency values on multiple rules fired
 *
 *     Revision 1.14  2007/09/24 22:58:22  troy.sadkowsky
 *     show fired rules
 *
 *     Revision 1.13  2007/09/24 05:19:06  Troy.Sadkowsky
 *     bug fix on assessment.getrules
 *
 *     Revision 1.12  2007/09/23 22:55:10  troy.sadkowsky
 *     show rules fired
 *
 *     Revision 1.11  2007/02/28 05:28:26  Troy.Sadkowsky
 *     build v1.16 updates
 *
 *     Revision 1.10  2007/02/20 02:18:42  troy
 *     bug fixes for 134 and 135
 *
 *     Revision 1.9  2007/02/18 11:07:18  troy
 *     new dynamic rule creation
 *
 *     Revision 1.8  2007/02/02 07:44:21  troy
 *     further dynamic rule implementation
 *
 *     Revision 1.7  2007/02/01 04:31:54  troy
 *     further dynamic rule implementation
 *
 *     Revision 1.6  2007/01/23 22:15:52  Administrator
 *     v1.15 updates
 *
 *     Revision 1.5  2007/01/08 12:45:49  Administrator
 *     version 14 updates
 *
 *     Revision 1.4  2006/12/19 12:25:48  admin
 *     build v1.13.1
 *
 *     Revision 1.3  2006/11/15 07:30:38  admin
 *     build v1.10
 *
 *     Revision 1.2  2006/09/27 00:22:42  admin
 *     incorporated engine into web interface
 *
 *     Revision 1.1  2006/09/25 12:45:53  admin
 *     Iteration 28 changes
 *
 *     Revision 1.2  2006/07/27 23:19:12  admin
 *     version 1.02
 *
 *     Revision 1.1  2006/06/07 07:07:27  administrator
 *     updates for rework
 *
 *     Revision 1.2  2006/05/23 23:22:13  administrator
 *     restructure progress
 *
 *     Revision 1.1  2006/05/22 06:06:01  administrator
 *     Version 2
 *
 *     Revision 1.17  2006/04/27 02:02:35  administrator
 *     Assessment linked chemical display
 *
 *     Revision 1.16  2006/03/24 06:29:02  administrator
 *     save, insert and update for chemicals
 *
 *     Revision 1.15  2006/03/21 22:18:07  administrator
 *     work on connections
 *
 *     Revision 1.14  2006/03/13 04:02:40  administrator
 *     tidied code
 *
 *     Revision 1.13  2006/03/02 23:19:34  administrator
 *     changed objects to throw excpetions not throwables
 *
 *     Revision 1.12  2006/02/24 06:28:49  administrator
 *     attempt to fix connection bug
 *
 *     Revision 1.11  2006/02/23 07:11:59  administrator
 *     attempt to fix connection bug
 *
 *     Revision 1.10  2006/02/22 02:38:09  administrator
 *     new function to get child chemical count
 *
 *     Revision 1.9  2006/02/16 22:54:02  administrator
 *     new connection pool
 *
 *     Revision 1.8  2006/02/16 22:44:06  administrator
 *     new connection pool
 *
 *     Revision 1.7  2006/02/08 00:12:58  administrator
 *     New Verion 0.23
 *
 *     Revision 1.6  2006/02/07 23:00:57  administrator
 *     reworked interface for chemical allocation
 *
 *     Revision 1.5  2006/01/31 23:15:55  administrator
 *     change display look of chemicals
 *
 *     Revision 1.4  2005/11/29 05:23:39  administrator
 *     width change of show chemicals
 *
 *     Revision 1.3  2005/11/25 06:33:18  administrator
 *     chemical full view
 *
 *     Revision 1.2  2005/11/17 22:54:40  administrator
 *     interview functionality
 *
 *     Revision 1.1  2005/11/16 05:28:39  administrator
 *     new library to share amongst mql, ims and ams
 *
 *     Revision 1.6  2005/10/11 22:11:33  administrator
 *     Floating action buttons, multiple chemicals and import function
 *
 *     Revision 1.5  2005/09/30 00:25:57  administrator
 *     unify the interface and enhancement on action buttons
 *
 *     Revision 1.4  2005/09/08 22:45:04  administrator
 *     reworked objects for job association
 *
 *     Revision 1.3  2005/08/24 03:42:08  administrator
 *     Connection is static and stays open
 *
 *     Revision 1.2  2005/08/24 01:35:57  administrator
 *     chemicals working with setting all levels
 *
 *     Revision 1.1  2005/08/23 23:34:51  administrator
 *     Chemical Associations
 *
 *     
 */
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
public class Assessment extends DBBaseObject {	

	private String jobHistoryId;
	private String agentId;
	private String exposure;
	private String level;
	private float frequencyweeks = -1;
	private float frequencyhours = -1;
	private String dontknow;
	private String assessorusername;
	private String assessorId;
	private String comments;
	
	public String getAgentId() {
		return agentId;
	}
	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}
	public String getAssessorId() {
		return assessorId;
	}
	public void setAssessorId(String assessorId) {
		this.assessorId = assessorId;
	}
	public String getAssessorusername() {
		if(assessorusername==null){
			assessorusername = "";
		}
		return assessorusername;
	}
	public void setAssessorusername(String assessorusername) {
		this.assessorusername = assessorusername;
	}
	public String getComments() {
		if(comments==null){
			comments = "";
		}else if(comments.equalsIgnoreCase("NULL")){
			comments = "";
		}
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
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
	public String getJobHistoryId() {
		return jobHistoryId;
	}
	public void setJobHistoryId(String jobHistoryId) {
		this.jobHistoryId = jobHistoryId;
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
	public Assessment() {
		super();
	}
	public Assessment(String exposure, String agentId, String jhId, String comments) {
		super();
		this.setExposure(exposure);
		this.setComments(comments);
		this.setJobHistoryId(jhId);
		this.setAgentId(agentId);
	}
	public Assessment(String exposure, String comments) {
		super();
		this.setExposure(exposure);
		this.setComments(comments);
	}
	public Assessment(String dbID) throws Exception {
		super();
		if ((dbID != null) && (!(dbID.equalsIgnoreCase("")))) {
			this.setId(dbID);
			this.getPersistentObject();
		}
	}
	public void insert() throws Exception {
		//if (!(this.exists())) {
		String strSQL = "INSERT INTO agentassessments (jobhistoryid,agentid,exposure,level,frequencyweeks,frequencyhours,dontknow,assessorusername,comments,assessorid) VALUES("
				+ this.getJobHistoryId()
				+ ","
				+ this.getAgentId()
				+ ",'"
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
				+ this.getAssessorusername()
				+ "','"
				+ this.escapeSpecialCharacters(this.getComments())
				+ "','"
				+ this.getAssessorId()
				+ "')";
		try {
			this.setId(String.valueOf(this.sqlExecuteInsert(strSQL)));
		} catch (SQLException e) {
			throw new Exception(e.getMessage());
		} finally {
			this.closeConnection();
		}
		//}
	}
	public void update() throws Exception {
		String strSQL = "UPDATE agentassessments SET jobhistoryid = "
					+ this.getJobHistoryId()
					+ ",agentid = "
					+ this.getAgentId()
					+ ",exposure = '"
					+ this.getExposure()
					+ "',level = '"
					+ this.getLevel()
					+ "',frequencyweeks = "
					+ this.getFrequencyweeks()
					+ ",frequencyhours = "
					+ this.getFrequencyhours()
					+ ",dontknow = '"
					+ this.getDontknow()
					+ "',assessorusername = '"
					+ this.getAssessorusername()
					+ "',comments = '"
					+ this.escapeSpecialCharacters(this.getComments())
					+ "',assessorid = '"
					+ this.getAssessorId()
					+ "' WHERE id = " + this.getId();
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
		String strSQL = "SELECT id FROM agentassessments WHERE jobhistoryid = "+this.getJobHistoryId()+" AND agentid = "+this.getAgentId()+" AND assessorusername = '"
				+ this.getAssessorusername().replaceAll("'", "''") + "' ";
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
		return bRetValue;
	}
	public void delete() throws Exception {
		String strSQL = "DELETE FROM agentassessments WHERE id = " + this.getId();
		try {
			this.sqlExecuteUpdate(strSQL);
		} catch (SQLException e) {
			throw new Exception(e.getMessage());
		} finally {
			this.closeConnection();
		}
	}
	public void getPersistentObject() throws Exception {
		String strSQL = "SELECT jobhistoryid, agentid, exposure, Level, frequencyweeks, frequencyhours, dontknow, assessorusername," +
				" assessorid, comments, id FROM  agentassessments WHERE id = "
				+ this.getId();
		ResultSet rs = null;
		try {
			rs = this.sqlExecuteSelect(strSQL);
			if (rs != null) {
				if (rs.next()) {
					this.setId(rs.getString("id"));
					this.setJobHistoryId(rs.getString("jobhistoryid"));
					this.setAgentId(rs.getString("agentid"));
					this.setExposure(rs.getString("exposure"));
					this.setLevel(rs.getString("Level"));
					this.setFrequencyweeks(rs.getFloat("frequencyweeks"));
					this.setFrequencyhours(rs.getFloat("frequencyhours"));
					this.setDontknow(rs.getString("dontknow"));
					this.setAssessorusername(rs.getString("assessorusername"));
					this.setAssessorId(rs.getString("assessorid"));
					this.setComments(rs.getString("comments"));
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
	public boolean hasRule() throws Exception{
		boolean retValue = false;
		if(this.getRules().size()!=0){
			retValue = true;
		}
		return retValue;
	}
	public List<ExpertRule> getRules() throws Exception {
		List<ExpertRule> retValue = new ArrayList<ExpertRule>();
		if(!(this.getId().equalsIgnoreCase(""))){
			
			String strSQL = "SELECT ruleid, frequencyweeksvalue, frequencyhoursvalue"
					+" FROM  agentassessmentrules INNER JOIN rule ON rule.id = agentassessmentrules.ruleid WHERE (agentassessmentid = "+this.getId()+") ORDER BY rule.ruleleveltypeid";// AND rule.weight = '"+this.getExposure()+"'";
			ResultSet rs = null;
			try {
				rs = this.sqlExecuteSelect(strSQL);
				if (rs != null) {
					while (rs.next()) {
						ExpertRule er = new ExpertRule();
						er.setId(rs.getString("ruleid"));
						er.setFrequencyHoursValue(rs.getString("frequencyhoursvalue"));
						er.setFrequencyWeeksValue(rs.getString("frequencyweeksvalue"));
						retValue.add(er);
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
		for(ExpertRule rule: retValue){
			rule.getPersistentObject();
		}
		return retValue;
	}
	public void insertFiredRule(ExpertRule er) throws Exception {
	    String insertQuery = "INSERT agentassessmentrules (agentassessmentid,ruleid,frequencyweeksvalue,frequencyhoursvalue) VALUES ("+this.getId()+","+er.getId()+","+er.getFrequencyWeeksValue()+","+er.getFrequencyHoursValue()+")  ";	    			
        this.sqlExecuteUpdate(insertQuery);		
	}
	public boolean isSame(Assessment autoAssessment) {
		if(this.getAgentId()!=null){
			if(!(this.getAgentId().equalsIgnoreCase(autoAssessment.getAgentId()))){
				return false;
			}
			if(!(this.getExposure().equalsIgnoreCase(autoAssessment.getExposure()))){
				return false;
			}
			if(!(this.getExposure().equalsIgnoreCase("None"))){
				if(!(this.getLevel().equalsIgnoreCase(autoAssessment.getLevel()))){
					return false;
				}
				if((this.getFrequencyweeks()!= autoAssessment.getFrequencyweeks())){
					return false;
				}
				if((this.getFrequencyhours()!= autoAssessment.getFrequencyhours())){
					return false;
				}	
			}
		}		
		return true;
	}
	public void removeFiredRules() throws Exception {
		String strSQL = "DELETE FROM agentassessmentrules WHERE agentassessmentid = " + this.getId();
		try {
			this.sqlExecuteUpdate(strSQL);
		} catch (SQLException e) {
			throw new Exception(e.getMessage());
		} finally {
			this.closeConnection();
		}
	}
	public String getOutCome() throws Exception {
		String retValue = "";
		if(!(this.getId().equalsIgnoreCase(""))){
			if(this.getExposure().equalsIgnoreCase("Probable")){
				if (this.getLevel().equalsIgnoreCase("High")) {
					retValue = ExpertRule.RuleOutcome.PROBABLEHIGH.toString();
				} else if (this.getLevel().equalsIgnoreCase("Medium")) {
					retValue = ExpertRule.RuleOutcome.PROBABLEMEDIUM.toString();
				} else if (this.getLevel().equalsIgnoreCase("Low")) {
					retValue = ExpertRule.RuleOutcome.PROBABLELOW.toString();
				} else if (this.getLevel().equalsIgnoreCase("Unknown")) {
					retValue = ExpertRule.RuleOutcome.PROBABLEUNKNOWN.toString();
				} 
			}else if(this.getExposure().equalsIgnoreCase("Possible")){
				if (this.getLevel().equalsIgnoreCase("High")) {
					retValue = ExpertRule.RuleOutcome.POSSIBLEHIGH.toString();
				} else if (this.getLevel().equalsIgnoreCase("Medium")) {
					retValue = ExpertRule.RuleOutcome.POSSIBLEMEDIUM.toString();
				} else if (this.getLevel().equalsIgnoreCase("Low")) {
					retValue = ExpertRule.RuleOutcome.POSSIBLELOW.toString();
				} else if (this.getLevel().equalsIgnoreCase("Unknown")) {
					retValue = ExpertRule.RuleOutcome.POSSIBLEUNKNOWN.toString();
				}
			} else {
				retValue = "NONE";
			}
		}
		return retValue;
	}
	public boolean hasManualAssessment() throws Exception {
		boolean bRetValue = false;
		String strSQL = "SELECT id FROM agentassessments WHERE jobhistoryid = "+this.getJobHistoryId()+" AND agentid = "+this.getAgentId()+" AND assessorusername <> 'OccIDEAS' ";
		ResultSet rs = null;
		try {
			rs = this.sqlExecuteSelect(strSQL);
			if (rs != null) {
				if (rs.next()) {
					//this.setId(rs.getString("id"));
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
	public ArrayList<QuestionAssessment> getRootQuestionAssessments() throws Exception{
		ArrayList<QuestionAssessment> questionAssessments = new ArrayList<QuestionAssessment>();
		String strSQL = "SELECT * FROM questionassessments WHERE agentassessmentid = " + this.getId();
		ResultSet rs = null;
		try {
			rs = this.sqlExecuteSelect(strSQL);
			if (rs != null) {
				while (rs.next()) {
					QuestionAssessment questionAssessment = new QuestionAssessment();
					questionAssessment.setAgentassessmentid(rs.getString("agentassessmentid"));
					questionAssessment.setExposure(rs.getString("exposure"));
					questionAssessment.setLevel(rs.getString("Level"));
					questionAssessment.setFrequencyweeks(rs.getFloat("frequencyweeks"));
					questionAssessment.setFrequencyhours(rs.getFloat("frequencyhours"));
					questionAssessment.setDontknow(rs.getString("dontknow"));
					questionAssessment.setJsmquestionstructureid(rs.getString("jsmquestionstructureid"));
					
					questionAssessments.add(questionAssessment);
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
		return questionAssessments;
	}
}