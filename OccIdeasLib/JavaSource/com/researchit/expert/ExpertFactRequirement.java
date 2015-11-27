/**
 * Version:
 *     $Id$
 *
 * Revisions:
 *     $Log$
 *     Revision 1.14  2008/08/25 01:37:31  ray.welburn
 *     Updates to use single dbobject and participant status table
 *
 *     Revision 1.13  2008/05/26 08:22:30  troy.sadkowsky
 *     Removed old code
 *
 */
package com.researchit.expert;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.researchit.JobSpecificModule;
import com.researchit.common.DBBaseObject;

public class ExpertFactRequirement extends DBBaseObject {

	private String factId;
	private String questionId;
	private String answerId;
	private String type;
	private String jobHistoryAttribute;
	private String jobHistoryValue;
	private String condition;
	
	public String getCondition() {
		if(condition==null){
			this.condition = "";
		}
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}
	public String getJobHistoryAttribute() {
		if(jobHistoryAttribute==null){
			this.jobHistoryAttribute = "";
		}
		return jobHistoryAttribute;
	}
	public void setJobHistoryAttribute(String jobHistoryAttribute) {
		this.jobHistoryAttribute = jobHistoryAttribute;
	}
	public String getJobHistoryValue() {
		if(jobHistoryValue==null){
			this.jobHistoryValue = "";
		}
		return jobHistoryValue;
	}
	public void setJobHistoryValue(String jobHistoryValue) {
		this.jobHistoryValue = jobHistoryValue;
	}
	public String getType() {
		if(type==null){
			type = "";
		}
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public ExpertFactRequirement() {
		super();
		
	}
	public ExpertFactRequirement(String dbID) throws Exception {
		super();
		if ((dbID != null) && (!(dbID.equalsIgnoreCase("")))) {
			this.setId(dbID);
			this.getPersistentObject();
		}
	}
	public void insert() throws Exception{
		this.insert(null);
	}
	public void insert(Connection conn) throws Exception {
		String strSQL = "INSERT INTO factrequirements (factid,facttype,questionid,answerid,jobhistoryattribute,jobhistoryvalue,factcondition) VALUES("
			+this.getFactId()+",'"
			+this.getType()+"',"
			+this.escapeSpecialCharacters(getQuestionId())+","
			+this.escapeSpecialCharacters(getAnswerId())+",'"
			+this.escapeSpecialCharacters(getJobHistoryAttribute())+"','"
			+this.escapeSpecialCharacters(getJobHistoryValue())+"','"
			+this.escapeSpecialCharacters(getCondition())+"')";
		try {
			this.setId(String.valueOf(this.sqlExecuteInsert(strSQL,conn)));
		} catch (SQLException e) {
			throw new Exception(e.getMessage());
		} finally {
			this.closeConnection();
		}	
	}
	public void update() throws Exception {
		String strSQL = "UPDATE factrequirements SET facttype='"+this.escapeSpecialCharacters(this.getType())+"', questionid = "+getQuestionId()+", answerid = "+getAnswerId()+", jobhistoryattribute = '"+this.escapeSpecialCharacters(getJobHistoryAttribute())+"', jobhistoryvalue = '"+this.escapeSpecialCharacters(getJobHistoryValue())+"', factcondition = '"+this.getCondition()+"' WHERE id = " + this.getId();
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
		if(!(this.getId().equalsIgnoreCase(""))){
			bRetValue = true;		
		}
		return bRetValue;
	}
	public void delete() throws Exception {
		String strSQL = "DELETE FROM factrequirements WHERE id = " + this.getId();
		try {
			this.sqlExecuteUpdate(strSQL);
		} catch (SQLException e) {
			throw new Exception(e.getMessage());
		} finally {
			this.closeConnection();
		}
	}
	public void getPersistentObject() throws Exception {
		String strSQL = "SELECT id,facttype,factid, questionid,answerid,jobhistoryattribute,jobhistoryvalue,factcondition FROM factrequirements WHERE id = "
				+ this.getId();
		ResultSet rs = null;
		try {
			rs = this.sqlExecuteSelect(strSQL);
			if (rs != null) {
				if (rs.next()) {
					this.setId(rs.getString("id"));
					this.setType(rs.getString("facttype"));
					this.setFactId(rs.getString("factid"));
					this.setQuestionId(rs.getString("questionid"));
					this.setAnswerId(rs.getString("answerid"));
					this.setJobHistoryAttribute(rs.getString("jobhistoryattribute"));
					this.setJobHistoryValue(rs.getString("jobhistoryvalue"));
					this.setCondition(rs.getString("factcondition"));
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
	public String getQuestionId() {
		if(questionId==null){
			this.questionId = "NULL";
		}
		return questionId;
	}
	public void setQuestionId(String typeId) {
		this.questionId = typeId;
	}	
	public String getAnswerId() {
		if(answerId==null){
			this.answerId = "NULL";
		}
		return answerId;
	}
	public void setAnswerId(String answerId) {
		this.answerId = answerId;
	}
	public String getFactId() {
		return factId;
	}
	public void setFactId(String factId) {
		this.factId = factId;
	}
	
	public boolean equals(Object obj) {
		boolean isEqual = false;
        if (obj != null) {
            if (obj.getClass() == this.getClass()) {
            	ExpertFactRequirement efr = (ExpertFactRequirement) obj;
                if (efr.getFactId().equalsIgnoreCase(this.getFactId())) {
                	if (efr.getQuestionId().equalsIgnoreCase(this.getQuestionId())) {
                		if (efr.getAnswerId().equalsIgnoreCase(this.getAnswerId())) {
                			isEqual = true;
                		}
                	}                  
                }
            }
        }
        return isEqual;
	}
	
	public int hashCode() {
		return super.hashCode();
	}
	public boolean isValid(JobSpecificModule jsm) throws Exception {
		boolean strRetValue = false;
		if(this.getType().equalsIgnoreCase("JH")){
			strRetValue = true;
		}else{
			String jsmId = jsm.getId();
			String sql = "SELECT jsmquestionpossibleanswerstructure.id AS paid, jsmquestionstructure.jsmid," +
					" jsmquestionpossibleanswerstructure.jsmquestionstructureid AS qid" +
					" FROM         jsmquestionstructure" +
					" INNER JOIN jsmquestionpossibleanswerstructure ON jsmquestionstructure.id = jsmquestionpossibleanswerstructure.jsmquestionstructureid" +
					" WHERE     (jsmquestionstructure.jsmid = "+jsmId+") AND (jsmquestionpossibleanswerstructure.possibleanswerid = "+this.getAnswerId()+") AND (jsmquestionstructure.questionid = "+this.getQuestionId()+")";
			ResultSet rs = null;
			try {
				rs = this.sqlExecuteSelect(sql);
				if (rs != null) {
					if (rs.next()) {
						strRetValue = true;
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
        return strRetValue;
	}
	public void export(Connection conn) throws Exception {
		String strSQL = "INSERT INTO factrequirements (factid,facttype,questionid,answerid,jobhistoryattribute,jobhistoryvalue,factcondition) VALUES("
			+this.getFactId()+",'"
			+this.getType()+"',"
			+this.escapeSpecialCharacters(getQuestionId())+","
			+this.escapeSpecialCharacters(getAnswerId())+",'"
			+this.escapeSpecialCharacters(getJobHistoryAttribute())+"','"
			+this.escapeSpecialCharacters(getJobHistoryValue())+"','"
			+this.escapeSpecialCharacters(getCondition())+"')";
		this.setId(String.valueOf(this.sqlExecuteInsertExport(strSQL,conn)));
	}	
}
