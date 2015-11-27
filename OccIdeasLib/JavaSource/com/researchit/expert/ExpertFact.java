/**
 * Version:
 *     $Id: ExpertFact.java,v 1.16 2008/08/25 01:37:31 ray.welburn Exp $
 *
 * Revisions:
 *     $Log: ExpertFact.java,v $
 *     Revision 1.16  2008/08/25 01:37:31  ray.welburn
 *     Updates to use single dbobject and participant status table
 *
 *     Revision 1.15  2008/05/26 08:22:31  troy.sadkowsky
 *     Removed old code
 *
 */
package com.researchit.expert;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.researchit.Question;
import com.researchit.common.DBBaseObject;

public class ExpertFact extends DBBaseObject {

	private List<ExpertFactRequirement> factRequirements;
	private Integer type;
	private String ruleId;
		
	public String getRuleId() {
		return ruleId;
	}
	public void setRuleId(String ruleId) {
		this.ruleId = ruleId;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public ExpertFact() {
		super();
		
	}
	public ExpertFact(String dbID) throws Exception {
		super();
		if ((dbID != null) && (!(dbID.equalsIgnoreCase("")))) {
			this.setId(dbID);
			this.getPersistentObject();
		}
	}
	public void insert() throws Exception {		
		this.insert(null);	
	}
	public void insert(Connection conn) throws Exception {		
		String strSQL = "INSERT INTO fact (name,description) VALUES('"+this.escapeSpecialCharacters(this.getName())+"','"+this.escapeSpecialCharacters(this.getDescription())+"')";
		try {
			this.setId(String.valueOf(this.sqlExecuteInsert(strSQL,conn)));
		} catch (SQLException e) {
			throw new Exception(e.getMessage());
		} finally {
			this.closeConnection();
		}		
	}
	public void update() throws Exception {
		String strSQL = "UPDATE fact SET name = '"+this.escapeSpecialCharacters(this.getName())+"',description = '"+this.escapeSpecialCharacters(this.getDescription())+"' WHERE id = " + this.getId();
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
		} else {
            String strSQL = "SELECT fact.id FROM fact";
            if(this.getRuleId()!=null){
            	strSQL += " INNER JOIN rulefacts ON fact.id = rulefacts.factid ";
            }
            strSQL += " WHERE fact.name LIKE '"
                + this.escapeSpecialCharacters(getAttributeName())
                + "-%'";
            if(this.getRuleId()!=null){
            	strSQL += " AND rulefacts.ruleid ="+this.getRuleId();
            }
	        ResultSet rs = null;
	        try {
	            rs = this.sqlExecuteSelect(strSQL);
	            if (rs != null) {
	                if (rs.next()) {
	                    bRetValue = true;
	                    this.setId(rs.getString("id"));
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
		return bRetValue;
	}
	private String getAttributeName() throws Exception {
		String retValue = "";
		if(this.getName().contains("-")){
			retValue = this.getName().substring(0,this.getName().indexOf("-"));		
		}	
		return retValue;
	}
	public void delete() throws Exception {
		String strSQL = "DELETE FROM fact WHERE id = " + this.getId();
		try {
			this.sqlExecuteUpdate(strSQL);
		} catch (SQLException e) {
			throw new Exception(e.getMessage());
		} finally {
			this.closeConnection();
		}
	}
	public void getPersistentObject() throws Exception {
		String strSQL = "SELECT id,name,description FROM fact WHERE id = "
				+ this.getId();
		ResultSet rs = null;
		try {
			rs = this.sqlExecuteSelect(strSQL);
			if (rs != null) {
				if (rs.next()) {
					this.setId(rs.getString("id"));
					this.setName(rs.getString("name"));
					this.setDescription(rs.getString("description"));
					//this.setType(rs.getInt("type"));
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
	public List<ExpertFactRequirement> getFactRequirements() throws Exception {
		if(this.factRequirements==null){
			this.getPersistentFactRequirements();
		}
		return factRequirements;
	}
	private void getPersistentFactRequirements() throws Exception {
		this.factRequirements = new ArrayList<ExpertFactRequirement>();
		ResultSet rs = null;
		try {
			if (!(this.getId().equalsIgnoreCase(""))) {
				String strSQL = "SELECT id FROM factrequirements WHERE factid = "	+ this.getId();
				rs = this.sqlExecuteSelect(strSQL);
				if (rs != null) {
					while (rs.next()) {
						ExpertFactRequirement efr = new ExpertFactRequirement();
						efr.setId(rs.getString("id"));
						this.factRequirements.add(efr);
					}
					if (rs.getStatement() != null) {
						rs.getStatement().close();
					}
					rs.close();
				}
			}
		} catch (SQLException e) {
			throw new Exception(e.getMessage());
		}finally {
			this.closeConnection();
		}
		for(ExpertFactRequirement efr:this.factRequirements){
			efr.getPersistentObject();
		}
	}
	public void setFactRequirements(List<ExpertFactRequirement> factRequirements) {
		this.factRequirements = factRequirements;
	}
	public void removeFromRule(ExpertRule er) throws Exception {
		this.removeFromRule(er.getId());
	}
	public void removeFromRule(String ruleId) throws Exception {
		String strSQL = "DELETE FROM rulefacts WHERE factid = " + this.getId()+" AND ruleid = "+ruleId;
		try {
			this.sqlExecuteUpdate(strSQL);
		} catch (SQLException e) {
			throw new Exception(e.getMessage());
		} finally {
			this.closeConnection();
		}
	}
	public boolean isJobHistoryFact() throws Exception {
		boolean retValue = false;
		for(ExpertFactRequirement fr:this.getFactRequirements()){
			if(fr.getType().equalsIgnoreCase("JH")){
				retValue = true;
				break;
			}
		}
		return retValue;
	}
	public String getAttribute() throws Exception {
		String retValue = "";
		for(ExpertFactRequirement fr:this.getFactRequirements()){
			if(fr.getType().equalsIgnoreCase("JH")){
				retValue = fr.getJobHistoryAttribute();
				break;
			}
		}
		return retValue;
	}
	public String getValue() throws Exception {
		String retValue = "";
		for(ExpertFactRequirement fr:this.getFactRequirements()){
			if(fr.getType().equalsIgnoreCase("JH")){
				retValue = fr.getJobHistoryValue();
				break;
			}
		}
		return retValue;
	}
	public String getCondition() throws Exception {
		String retValue = "";
		for(ExpertFactRequirement fr:this.getFactRequirements()){
			if(fr.getType().equalsIgnoreCase("JH")){
				retValue = fr.getCondition();
				break;
			}
		}
		return retValue;
	}
	public String getFactRequirementId() throws Exception {
		String retValue = "";
		for(ExpertFactRequirement fr:this.getFactRequirements()){
			if(fr.getType().equalsIgnoreCase("JH")){
				retValue = fr.getId();
				break;
			}
		}
		return retValue;
	}
	public String getConditionOperator() throws Exception {
		String retValue = "";
		String cond = this.getCondition();
		if(cond.equalsIgnoreCase("Before")){
			retValue = "<=";
		}else if(cond.equalsIgnoreCase("Equals")){
			retValue = "=";
		}else if(cond.equalsIgnoreCase("After")){
			retValue = ">";
		}
		return retValue;
	}
	public boolean containsQuestion(Question q) throws Exception {
		boolean retValue = false;
		for(ExpertFactRequirement efr: this.getFactRequirements()){
			if(efr.getQuestionId().equalsIgnoreCase(q.getId())){
				retValue = true;
				break;
			}
		}
		return retValue;
	}
	
	public boolean equals(Object obj) {
		return this.getName().equalsIgnoreCase(((ExpertFact)obj).getName());
	}
	public void export(Connection conn) throws Exception {
		String strSQL = "INSERT INTO fact (name,description) VALUES('"+this.escapeSpecialCharacters(this.getName())+"','"+this.escapeSpecialCharacters(this.getDescription())+"')";
		this.setId(String.valueOf(this.sqlExecuteInsertExport(strSQL,conn)));			
	}	
}
