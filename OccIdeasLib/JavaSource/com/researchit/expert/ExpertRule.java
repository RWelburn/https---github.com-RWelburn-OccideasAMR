/**
 * Version:
 *     $Id: ExpertRule.java,v 1.54 2009/05/05 03:07:47 troy.sadkowsky Exp $
 *
 * Revisions:
 *     $Log: ExpertRule.java,v $
 *     Revision 1.54  2009/05/05 03:07:47  troy.sadkowsky
 *     added code to delete child rules on delete rule
 *
 *     Revision 1.53  2009/05/01 02:23:54  troy.sadkowsky
 *     updates for more error handles on export and import
 *
 *     Revision 1.52  2008/12/10 11:36:50  ray.welburn
 *     Updates to view rule
 *
 *     Revision 1.51  2008/10/13 00:31:29  Troy.Sadkowsky
 *     fix for rules with no jsm
 *
 *     Revision 1.50  2008/10/10 06:08:15  Troy.Sadkowsky
 *     minor updates
 *
 *     Revision 1.49  2008/09/20 08:59:30  troy.sadkowsky
 *     new assessment updates
 *
 *     Revision 1.48  2008/09/10 09:11:35  troy.sadkowsky
 *     ASsessment updates
 *
 *     Revision 1.47  2008/09/02 23:30:43  Troy.Sadkowsky
 *     removed old code and enhanced jsm exporter
 *
 *     Revision 1.46  2008/08/25 01:37:31  ray.welburn
 *     Updates to use single dbobject and participant status table
 *
 *     Revision 1.45  2008/08/20 03:36:35  troy.sadkowsky
 *     assessment updates
 *
 *     Revision 1.44  2008/08/13 04:29:48  troy.sadkowsky
 *     removed jess
 *
 *     Revision 1.43  2008/08/02 06:16:57  troy.sadkowsky
 *     removed jess and reworked rules and ajsms
 *
 *     Revision 1.42  2008/07/23 00:15:29  troy.sadkowsky
 *     link rule to jsm
 *
 *     Revision 1.41  2008/06/29 23:23:27  troy.sadkowsky
 *     enhance validation of rules
 *
 *     Revision 1.40  2008/06/27 04:01:54  ray.welburn
 *     Remove brackets from sql statements
 *
 *     Revision 1.39  2008/05/26 08:22:31  troy.sadkowsky
 *     Removed old code
 *
 */
package com.researchit.expert;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import com.researchit.JobSpecificModule;
import com.researchit.PossibleAnswer;
import com.researchit.Question;
import com.researchit.common.DBBaseObject;

public class ExpertRule extends DBBaseObject {

	public static final String TYPEPROBABILITY = "1";
	public static final String TYPELEVEL = "2";
	public static final String TYPEFREQUENCYWEEKS = "3";
	public static final String TYPEFREQUENCYHOURS = "4";
			
	public static final String  LEVELPROBABLE = "1";
	public static final String  LEVELPOSSIBLE = "2";
	public static final String  LEVELHIGH = "3";
	public static final String  LEVELMEDIUM = "4";
	public static final String  LEVELLOW = "5";
	public static final String	LEVELUNKNOWN = "6";
	public static final String	PROBABLEHIGH = "7";
	public static final String	PROBABLEMEDIUM = "8";
	public static final String	PROBABLELOW = "9";
	public static final String	PROBABLEUNKNOWN = "10";
	public static final String	POSSIBLEUNKNOWN = "11";
	public static final String	INVALID = "12";
	
	public enum RuleOutcome {
		PROBABLEHIGH,
		PROBABLEMEDIUM,
		PROBABLELOW,
		PROBABLEUNKNOWN,
		POSSIBLEHIGH,
		POSSIBLEMEDIUM,
		POSSIBLELOW,
		POSSIBLEUNKNOWN,
		INVALID
	}
	
	private String typeId;
	private String levelTypeId;
	private Integer weight;
	private ArrayList<ExpertFact> facts;
	private String agentId;
	private String jsmId;
	private String frequencyWeeksQId;
	private String frequencyHoursQId;
	private String frequencyWeeksValue;
	private String frequencyHoursValue;
	private String parentId;
	private ArrayList<ExpertRule> childRules;
	private Integer sequence;

	public Integer getSequence() {
		return sequence;
	}
	public void setSequence(Integer sequence) {
		this.sequence = sequence;
	}
	public ArrayList<ExpertRule> getChildRules() throws Exception {
		if(this.childRules==null){
			this.getPersistentRules();
		}
		return childRules;
	}
	public ArrayList<ExpertRule> getChildRules(String levelTypeId) throws Exception {
		ArrayList<ExpertRule> retValue = new ArrayList<ExpertRule>();
		for(ExpertRule er:this.getChildRules()){
			if(er.getTypeId().equalsIgnoreCase(ExpertRule.TYPELEVEL.toString())){
				if(er.getLevelTypeId().equalsIgnoreCase(levelTypeId)){
					retValue.add(er);
				}				
			}
		}
		return retValue;
	}
	public void setChildRules(ArrayList<ExpertRule> childRules) {
		this.childRules = childRules;
	}
	public String getAgentId() {
		return agentId;
	}
	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}
	public ArrayList<ExpertFact> getFacts() throws Exception {
		if(this.facts==null){
			this.getPersistentFacts();
		}
		return facts;
	}
	private void getPersistentFacts() throws Exception {
		this.facts = new ArrayList<ExpertFact>();
		ResultSet rs = null;
		try {
			if (!(this.getId().equalsIgnoreCase(""))) {
				String strSQL = "SELECT factid FROM rulefacts WHERE ruleid = " + this.getId();
				rs = this.sqlExecuteSelect(strSQL);
				if (rs != null) {
					while (rs.next()) {
						ExpertFact ef = new ExpertFact();
						ef.setId(rs.getString("factid"));
						this.facts.add(ef);
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
		for(ExpertFact ef: this.facts){
			ef.getPersistentObject();
		}
	}
	public void setFacts(ArrayList<ExpertFact> facts) {
		this.facts = facts;
	}
	public ExpertRule() {
		super();
		
	}
	public ExpertRule(String dbID) throws Exception {
		super();		
		if ((dbID != null) && (!(dbID.equalsIgnoreCase("")))) {
			this.setId(dbID);
			this.getPersistentObject();
		}			
	}	
	protected void insert() throws Exception{
		this.insert(null);
	}
	public void insert(Connection conn) throws Exception {
		if (!(this.exists())) {
			String strSQL = "INSERT INTO rule (ruletypeid,ruleleveltypeid,weight,agentid,frequencyweeksquestionid,frequencyhoursquestionid,parentruleid,sequence,jsmid) VALUES("
				+this.getTypeId()+","+this.getLevelTypeId()+","+this.getWeight()+","+this.getAgentId()+","
				+this.escapeSpecialCharacters(getFrequencyWeeksQId())+","
				+this.escapeSpecialCharacters(getFrequencyHoursQId())+","+this.getParentId()+","+this.getSequence()+","+this.getJsmId()+")";
			try {
				this.setId(String.valueOf(this.sqlExecuteInsert(strSQL,conn)));
			} catch (SQLException e) {
				throw new Exception(e.getMessage());
			} finally {
				this.closeConnection();
			}
		}
	}
	private void update() throws Exception {
		String strSQL = "UPDATE rule SET jsmid="
			+this.getJsmId()+", agentid="
			+this.getAgentId()+", weight = "
			+this.getWeight()+",ruleleveltypeid = "
			+this.getLevelTypeId()+",sequence = "
			+this.getSequence()+",parentruleid="
			+this.getParentId()+",frequencyweeksquestionid="+this.getFrequencyWeeksQId()+",frequencyhoursquestionid="+this.getFrequencyHoursQId()+" WHERE id = " + this.getId();
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
		for(ExpertRule childRule: this.getChildRules()){
			childRule.delete();
		}
		String strSQL = "DELETE FROM rule WHERE id = " + this.getId();
		try {
			this.sqlExecuteUpdate(strSQL);
			this.setId("");
		} catch (SQLException e) {
			throw new Exception(e.getMessage());
		} finally {
			this.closeConnection();
		}
	}
	public void getPersistentObject() throws Exception {
		String strSQL = "SELECT id,ruletypeid,ruleleveltypeid, weight,agentid,agentname,frequencyweeksquestionid,frequencyhoursquestionid,parentruleid,sequence,jsmid FROM rule WHERE id = "
				+ this.getId();
		ResultSet rs = null;
		try {
			rs = this.sqlExecuteSelect(strSQL);
			if (rs != null) {
				if (rs.next()) {
					this.setId(rs.getString("id"));
					this.setTypeId(rs.getString("ruletypeid"));
					this.setLevelTypeId(rs.getString("ruleleveltypeid"));
					this.setWeight(rs.getInt("weight"));
					this.setAgentId(rs.getString("agentid"));
					this.setFrequencyWeeksQId(rs.getString("frequencyweeksquestionid"));
					this.setFrequencyHoursQId(rs.getString("frequencyhoursquestionid"));
					this.setParentId(rs.getString("parentruleid"));
					this.setSequence(rs.getInt("sequence"));
					this.setJsmId(rs.getString("jsmid"));
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
	public void addFact(ExpertFact fact) throws Exception{
		this.addFact(fact,null);
	}
	public void addFact(ExpertFact fact,Connection conn) throws Exception{
		if(facts==null){
			facts = new ArrayList<ExpertFact>();
		}
		if(!(this.getFacts().contains(fact))){
			this.insertFact(fact,conn);
			
			facts.add(fact);
		}				
	}
	public void insertFact(ExpertFact fact, Connection conn) throws Exception {
		String strSQL = "INSERT INTO rulefacts (ruleid,factid) VALUES("+this.getId()+","+fact.getId()+")";
		try {
			this.sqlExecuteInsert(strSQL,conn);
		} catch (SQLException e) {
			throw new Exception(e.getMessage());
		} finally {
			this.closeConnection();
		}
	}
	public String getTypeId() {
		if(this.typeId==null){
			this.typeId = "";
		}
		return typeId;
	}
	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}	
	public Integer getWeight() {
		return weight;
	}
	public void setWeight(Integer weight) {
		this.weight = weight;
	}
	
	public String getName() {
		String retValue = "";
		if(this.getId().equalsIgnoreCase("")){
			retValue = "No Rule";
		}else{
			retValue = "id"+this.getId()+"type"+this.getTypeId()+"aid"+this.getAgentId();
		}
		return retValue;
	}
	public String getDescription()  {
		String retValue = "";
		try {
			for(ExpertFact ef: this.getFacts()){
				retValue += ef.getName()+",";
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "IF \n"+retValue +" \nTHEN ";
	}
	public String getFullDescription() throws Exception  {
		String retValue = "";
		try {
			for(ExpertFact ef: this.getFacts()){
				retValue += ef.getName()+", ";
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "IF \n"+retValue +" \nTHEN "+this.getOutCome();
	}
	public ExpertRule.RuleOutcome getOutCome() {
		ExpertRule.RuleOutcome retValue = null;
		if (this.getLevelTypeId().equalsIgnoreCase(ExpertRule.PROBABLEHIGH)) {
			retValue = ExpertRule.RuleOutcome.PROBABLEHIGH;
		} else if (this.getLevelTypeId().equalsIgnoreCase(ExpertRule.PROBABLEMEDIUM)) {
			retValue = ExpertRule.RuleOutcome.PROBABLEMEDIUM;
		} else if (this.getLevelTypeId().equalsIgnoreCase(ExpertRule.PROBABLELOW)) {
			retValue = ExpertRule.RuleOutcome.PROBABLELOW;
		} else if (this.getLevelTypeId().equalsIgnoreCase(ExpertRule.PROBABLEUNKNOWN)) {
			retValue = ExpertRule.RuleOutcome.PROBABLEUNKNOWN;
		} else if (this.getLevelTypeId().equalsIgnoreCase(ExpertRule.POSSIBLEUNKNOWN)) {
			retValue = ExpertRule.RuleOutcome.POSSIBLEUNKNOWN;
		}
		return retValue;
	}
	public String getCommonName() {
		String retValue = "";
		if (this.getLevelTypeId().equalsIgnoreCase(ExpertRule.PROBABLEHIGH)) {
			retValue = "Probable High";
		} else if (this.getLevelTypeId().equalsIgnoreCase(ExpertRule.PROBABLEMEDIUM)) {
			retValue = "Probable Medium";
		} else if (this.getLevelTypeId().equalsIgnoreCase(ExpertRule.PROBABLELOW)) {
			retValue = "Probable Low";
		} else if (this.getLevelTypeId().equalsIgnoreCase(ExpertRule.PROBABLEUNKNOWN)) {
			retValue = "Probable Unknown";
		} else if (this.getLevelTypeId().equalsIgnoreCase(ExpertRule.POSSIBLEUNKNOWN)) {
			retValue = "Possible Unknown";
		}
		return retValue;
	}
	public ExpertRule.RuleOutcome getOutComeold() throws Exception {
		ExpertRule.RuleOutcome retValue = null;
		if (this.getLevelTypeId().equalsIgnoreCase(ExpertRule.PROBABLEHIGH)) {
			retValue = ExpertRule.RuleOutcome.PROBABLEHIGH;
		} else if (this.getLevelTypeId().equalsIgnoreCase(ExpertRule.PROBABLEMEDIUM)) {
			retValue = ExpertRule.RuleOutcome.PROBABLEMEDIUM;
		} else if (this.getLevelTypeId().equalsIgnoreCase(ExpertRule.PROBABLELOW)) {
			retValue = ExpertRule.RuleOutcome.PROBABLELOW;
		} else if (this.getLevelTypeId().equalsIgnoreCase(ExpertRule.PROBABLEUNKNOWN)) {
			retValue = ExpertRule.RuleOutcome.PROBABLEUNKNOWN;
		} else if (this.getLevelTypeId().equalsIgnoreCase(ExpertRule.POSSIBLEUNKNOWN)) {
			retValue = ExpertRule.RuleOutcome.POSSIBLEUNKNOWN;
		}else if(this.getTypeId().equalsIgnoreCase(ExpertRule.TYPEPROBABILITY.toString())){
			if (this.getLevelTypeId().equalsIgnoreCase(ExpertRule.LEVELPROBABLE)) {
				if(this.getChildRules().size()>0){
					for(ExpertRule er:this.getChildRules()){
						if(er.getLevelTypeId().equalsIgnoreCase(ExpertRule.LEVELHIGH)){
							retValue = ExpertRule.RuleOutcome.PROBABLEHIGH;
						}else if(er.getLevelTypeId().equalsIgnoreCase(ExpertRule.LEVELMEDIUM)){
							retValue = ExpertRule.RuleOutcome.PROBABLEMEDIUM;
						}else if(er.getLevelTypeId().equalsIgnoreCase(ExpertRule.LEVELLOW)){
							retValue = ExpertRule.RuleOutcome.PROBABLELOW;
						}else if(er.getLevelTypeId().equalsIgnoreCase(ExpertRule.LEVELUNKNOWN)){
							retValue = ExpertRule.RuleOutcome.PROBABLEUNKNOWN;
						}
					}
				}
			} else if (this.getLevelTypeId().equalsIgnoreCase(ExpertRule.LEVELPOSSIBLE)) {
				retValue = ExpertRule.RuleOutcome.POSSIBLEUNKNOWN;
			}					
		}else if(this.getTypeId().equalsIgnoreCase(ExpertRule.TYPELEVEL.toString())){
			ExpertRule parent = new ExpertRule(this.getParentId());
			if (parent.getLevelTypeId().equalsIgnoreCase(ExpertRule.LEVELPROBABLE)) {
				if(parent.getChildRules().size()>0){
					for(ExpertRule er:parent.getChildRules()){
						if(er.getId().equalsIgnoreCase(this.getId())){
							if(er.getLevelTypeId().equalsIgnoreCase(ExpertRule.LEVELHIGH)){
								retValue = ExpertRule.RuleOutcome.PROBABLEHIGH;
							}else if(er.getLevelTypeId().equalsIgnoreCase(ExpertRule.LEVELMEDIUM)){
								retValue = ExpertRule.RuleOutcome.PROBABLEMEDIUM;
							}else if(er.getLevelTypeId().equalsIgnoreCase(ExpertRule.LEVELLOW)){
								retValue = ExpertRule.RuleOutcome.PROBABLELOW;
							}else if(er.getLevelTypeId().equalsIgnoreCase(ExpertRule.LEVELUNKNOWN)){
								retValue = ExpertRule.RuleOutcome.PROBABLEUNKNOWN;
							}
						}	
					}
				}
			} else if (parent.getLevelTypeId().equalsIgnoreCase(ExpertRule.LEVELPOSSIBLE)) {
				retValue = ExpertRule.RuleOutcome.POSSIBLEUNKNOWN;
			}
		}
		return retValue;
	}
	
	public boolean equals(Object obj) {
        if (this.getClass().equals(obj.getClass())) {
        	return this.getId().equals(((ExpertRule)obj).getId());
        }else{
        	return false;
        }
	}
	
	public int hashCode() {
		return super.hashCode();
	}
	public String getFrequencyHoursQId() {
		if(this.frequencyHoursQId==null){
			this.frequencyHoursQId = "0";
		}
		return frequencyHoursQId;
	}
	public void setFrequencyHoursQId(String frequencyHoursQId) {
		this.frequencyHoursQId = frequencyHoursQId;
	}
	public String getFrequencyWeeksQId() {
		if(this.frequencyWeeksQId==null){
			this.frequencyWeeksQId = "0";
		}
		return frequencyWeeksQId;
	}
	public void setFrequencyWeeksQId(String frequencyWeeksQId) {
		this.frequencyWeeksQId = frequencyWeeksQId;
	}
	public String getType() {
		String retValue = "";
		if(this.getTypeId().equalsIgnoreCase(ExpertRule.TYPEPROBABILITY.toString())){
			retValue = "Prob";
		}else if(this.getTypeId().equalsIgnoreCase(ExpertRule.TYPELEVEL.toString())){
			retValue = "Level";
		}else if(this.getTypeId().equalsIgnoreCase(ExpertRule.TYPEFREQUENCYWEEKS.toString())){
			retValue = "FreqWeeks";
		}else if(this.getTypeId().equalsIgnoreCase(ExpertRule.TYPEFREQUENCYHOURS.toString())){
			retValue = "FreqHours";
		}
		return retValue;
	}
	public boolean hasChildRules() throws Exception {
		boolean retValue = false;
		if(!(this.getId().equalsIgnoreCase(""))){
			if(this.getChildRules().size()>0){
				retValue = true;
			}
		}		
		return retValue;
	}
	public boolean hasChildRules(String levelTypeId) throws Exception {
		boolean retValue = false;
		if(!(this.getId().equalsIgnoreCase(""))){
			if(this.getChildRules(levelTypeId).size()>0){
				retValue = true;
			}
		}		
		return retValue;
	}
	private void getPersistentRules() throws Exception {
		ResultSet rs = null;
		try {
			ArrayList<ExpertRule> ers = new ArrayList<ExpertRule>();
			String strSQL = "SELECT id FROM rule WHERE parentruleid = " + this.getId();
			rs = this.sqlExecuteSelect(strSQL);
			if (rs != null) {
				while (rs.next()) {
					String id = rs.getString("id");
					ExpertRule er = new ExpertRule(id);
					ers.add(er);
				}
				if (rs.getStatement() != null) {
					rs.getStatement().close();
				}
				rs.close();
			}
			this.setChildRules(ers);
		} catch (SQLException e) {
			throw new Exception(e.getMessage());
		} finally {
			this.closeConnection();
		}
	}
	public String getParentId() {
		return parentId;
	}
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
	public ArrayList<Question> getQuestions() throws Exception {
		ArrayList<Question> retValue = new ArrayList<Question>();
		
		for(ExpertFact ef:this.getFacts()){
			if(!(ef.isJobHistoryFact())){
				for(ExpertFactRequirement efr: ef.getFactRequirements()){
					Question q = new Question(efr.getQuestionId());
					if(!(retValue.contains(q))){
						retValue.add(q);
					}				
				}
			}
		}
		if(this.getTypeId()!=null){
			if(this.getTypeId().equalsIgnoreCase(ExpertRule.TYPEFREQUENCYHOURS.toString())){
				Question q = new Question("",this.getFrequencyHoursQId());
				retValue.add(q);
			}
			if(this.getTypeId().equalsIgnoreCase(ExpertRule.TYPEFREQUENCYWEEKS.toString())){
				Question q = new Question("",this.getFrequencyWeeksQId());
				retValue.add(q);
			}
		}		
		return retValue;
	}
	public ArrayList<PossibleAnswer> getAnswers() throws Exception {
		ArrayList<PossibleAnswer> retValue = new ArrayList<PossibleAnswer>();
		for(ExpertFact ef:this.getFacts()){
			if(!(ef.isJobHistoryFact())){
				for(ExpertFactRequirement efr: ef.getFactRequirements()){
					PossibleAnswer pa = new PossibleAnswer(efr.getAnswerId());
					retValue.add(pa);
				}
			}	
		}
		return retValue;
	}
	public String getLevelTypeId() {
		if(this.levelTypeId==null){
			if(this.weight!=null){
				if(this.getTypeId().equalsIgnoreCase(ExpertRule.TYPELEVEL)){
					if(this.weight==100){
						this.levelTypeId = ExpertRule.LEVELHIGH;
					}else if(this.weight==50){
						this.levelTypeId = ExpertRule.LEVELMEDIUM;
					}else if(this.weight==5){
						this.levelTypeId = ExpertRule.LEVELLOW;
					}else if(this.weight==0){
						this.levelTypeId = ExpertRule.LEVELUNKNOWN;
					}
				}else if(this.getTypeId().equalsIgnoreCase(ExpertRule.TYPEPROBABILITY)){
					if(this.weight==100){
						this.levelTypeId = ExpertRule.LEVELPROBABLE;
					}else if(this.weight==50){
						this.levelTypeId = ExpertRule.LEVELPOSSIBLE;
					}else if(this.weight==50){
						this.levelTypeId = ExpertRule.LEVELPOSSIBLE;
					}
				}			
			}else{
				this.levelTypeId = ExpertRule.LEVELUNKNOWN;
			}
		}
		return levelTypeId;
	}
	public void setLevelTypeId(String levelTypeId) {
		this.levelTypeId = levelTypeId;
	}
	public ExpertRule getChildRuleFirst(String levelTypeId) throws Exception {
		ExpertRule retValue = new ExpertRule();
		retValue.setTypeId(ExpertRule.TYPELEVEL);
		if(this.hasChildRules(levelTypeId)){
			retValue = this.getChildRules(levelTypeId).get(0);
		}
		return retValue;
	}
	public ExpertRule getFrequencyWeeksRule() throws Exception {
		ExpertRule retValue = new ExpertRule();
		if(this.hasChildRules()){
			for(ExpertRule childRule: this.getChildRules()){
				if(childRule.getTypeId().equalsIgnoreCase(ExpertRule.TYPEFREQUENCYWEEKS)){
					retValue = childRule;
					break;
				}
			}			
		}
		return retValue;
	}
	public ExpertRule getFrequencyHoursRule() throws Exception {
		ExpertRule retValue = new ExpertRule();
		if(this.hasChildRules()){
			for(ExpertRule childRule: this.getChildRules()){
				if(childRule.getTypeId().equalsIgnoreCase(ExpertRule.TYPEFREQUENCYHOURS)){
					retValue = childRule;
					break;
				}
			}			
		}
		return retValue;
	}
	public String copy() throws Exception {		
		ExpertRule copyOfLevelRule = new ExpertRule();
        copyOfLevelRule.setAgentId(this.getAgentId());
        copyOfLevelRule.setLevelTypeId(this.getLevelTypeId());
        copyOfLevelRule.setParentId(this.getParentId());
        copyOfLevelRule.setTypeId(this.getTypeId());
        copyOfLevelRule.setFrequencyHoursQId(this.getFrequencyHoursQId());
        copyOfLevelRule.setFrequencyWeeksQId(this.getFrequencyWeeksQId());
        copyOfLevelRule.setSequence(this.getSequence());
        copyOfLevelRule.setJsmId(this.getJsmId());
        copyOfLevelRule.insert();
        for(ExpertFact ef: this.getFacts()){
        	ExpertFact copyEf = new ExpertFact();
        	copyEf.setRuleId(copyOfLevelRule.getId());
        	copyEf.setName(ef.getName());
        	copyEf.save();
        	copyOfLevelRule.addFact(copyEf);
        	for(ExpertFactRequirement efr: ef.getFactRequirements()){
        		ExpertFactRequirement copyEfr = new ExpertFactRequirement();
        		copyEfr.setAnswerId(efr.getAnswerId());
        		copyEfr.setCondition(efr.getCondition());
        		copyEfr.setFactId(copyEf.getId());
        		copyEfr.setJobHistoryAttribute(efr.getJobHistoryAttribute());
        		copyEfr.setJobHistoryValue(efr.getJobHistoryValue());
        		copyEfr.setQuestionId(efr.getQuestionId());
        		copyEfr.setType(efr.getType());
        		copyEfr.save();       		
        	}
        }          
        return copyOfLevelRule.getId();
	}
	public void saveToDB(Connection conn) throws Exception { 
		for(ExpertFact ef:this.getFacts()){
			String oldID = ef.getId();
			ef.insert(conn);
			String newID = this.getId();
			this.addFact(ef,conn);
			ef.setId(oldID);
			for(ExpertFactRequirement efr: ef.getFactRequirements()){
				efr.setFactId(newID);				
				efr.insert(conn);
			}
		}
		this.insert(conn);		
	}
	public boolean sameAs(ExpertRule firstChildRule) throws Exception {		
		return this.getFullDescription().equalsIgnoreCase(firstChildRule.getFullDescription());
	}
	public boolean isSingleRule() {
		boolean retValue = false;
		if(this.getLevelTypeId().equalsIgnoreCase(ExpertRule.PROBABLEHIGH)){
			retValue = true;
		}else if(this.getLevelTypeId().equalsIgnoreCase(ExpertRule.PROBABLEMEDIUM)){
			retValue = true;
		}else if(this.getLevelTypeId().equalsIgnoreCase(ExpertRule.PROBABLELOW)){
			retValue = true;
		}else if(this.getLevelTypeId().equalsIgnoreCase(ExpertRule.PROBABLEUNKNOWN)){
			retValue = true;
		}else if(this.getLevelTypeId().equalsIgnoreCase(ExpertRule.POSSIBLEUNKNOWN)){
			retValue = true;
		}
		return retValue;
	}
	public String getFrequencyHoursValue() {
		return frequencyHoursValue;
	}
	public void setFrequencyHoursValue(String frequencyHoursValue) {
		this.frequencyHoursValue = frequencyHoursValue;
	}
	public String getFrequencyWeeksValue() {
		return frequencyWeeksValue;
	}
	public void setFrequencyWeeksValue(String frequencyWeeksValue) {
		this.frequencyWeeksValue = frequencyWeeksValue;
	}
	public ArrayList<ExpertRule> getRules(String sql) throws Exception {
		ArrayList<ExpertRule> rules = new ArrayList<ExpertRule>();
		ResultSet rs = null;		
		rs = this.sqlExecuteSelect(sql);
		if (rs != null) {
			while (rs.next()) {
				String id = rs.getString("id");
				ExpertRule rule = new ExpertRule();
				rule.setId(id);
				rules.add(rule);
			}
			if (rs.getStatement() != null) {
				rs.getStatement().close();
			}
			rs.close();
		}	
		this.closeConnection();		
		for(ExpertRule er: rules){
			er.getPersistentObject();
		}
		return rules;
	}
	public ArrayList<JobSpecificModule> getJSMs() throws Exception {
		ArrayList<JobSpecificModule> jsms = new ArrayList<JobSpecificModule>();
		ResultSet rs = null;		
		String sql = "SELECT DISTINCT jsm.name, jsm.id" +
				" FROM jsm" +
				" INNER JOIN jsmquestionstructure ON jsm.id = jsmquestionstructure.jsmid" +
				" INNER JOIN factrequirements ON jsmquestionstructure.questionid = factrequirements.questionid" +
				" INNER JOIN rulefacts ON factrequirements.factid = rulefacts.factid" +
				" WHERE (rulefacts.ruleid = "+this.getId()+") AND (jsm.jsmtypeid = 0)";
		rs = this.sqlExecuteSelect(sql);
		if (rs != null) {
			while (rs.next()) {
				String id = rs.getString("id");
				String name = rs.getString("name");
				JobSpecificModule jsm = new JobSpecificModule();
				jsm.setId(id);
				jsm.setName(name);
				jsms.add(jsm);
			}
			if (rs.getStatement() != null) {
				rs.getStatement().close();
			}
			rs.close();
		}	
		this.closeConnection();				
		return jsms;
	}
	public void removeChildRules(String ruletypeid) throws Exception {
		String strSQL = "DELETE FROM rule WHERE parentruleid = " + this.getId() +" AND ruletypeid = "+ruletypeid;
		try {
			this.sqlExecuteUpdate(strSQL);
		} catch (SQLException e) {
			throw new Exception(e.getMessage());
		} finally {
			this.closeConnection();
		}
	}
	public boolean isValid(JobSpecificModule jsm) throws Exception {
		boolean retValue = true;
		if((this.getJsmId()==null)||(this.getJsmId().equalsIgnoreCase(""))){
			retValue = false;
		}else{
			if(this.getJsmId().equalsIgnoreCase(jsm.getId())){
				retValue = this.isValid();
			}else{
				retValue = false;
			}
		}			
		return retValue;
	}

	public boolean isValid() throws Exception {
		boolean retValue = true;
		if((this.getJsmId()==null)||(this.getJsmId().equalsIgnoreCase(""))){
			retValue = false;
		}else{
			JobSpecificModule jsm = new JobSpecificModule(this.getJsmId());
			if(this.getTypeId().equalsIgnoreCase(ExpertRule.TYPEFREQUENCYHOURS)){
				retValue = jsm.hasFrequencyQuestion(this.getFrequencyHoursQId());
			}else if(this.getTypeId().equalsIgnoreCase(ExpertRule.TYPEFREQUENCYWEEKS)){
				retValue = jsm.hasFrequencyQuestion(this.getFrequencyWeeksQId());
			}else{				
				for(ExpertFact ef: this.getFacts()){
					for(ExpertFactRequirement efr: ef.getFactRequirements()){
						if(!(efr.isValid(jsm))){
							retValue = false;
							break;
						}
					}
				}
				if(retValue){
					if(this.hasChildRules()){
						retValue = this.getFrequencyHoursRule().isValid();
					}
				}
				if(retValue){
					if(this.hasChildRules()){
						retValue = this.getFrequencyWeeksRule().isValid();
					}
				}
			}			
		}
			
		return retValue;
	}
	public void export(Connection conn) throws Exception {
		String strSQL = "INSERT INTO rule (ruletypeid,ruleleveltypeid,weight,agentid,frequencyweeksquestionid,frequencyhoursquestionid,parentruleid,sequence,jsmid) VALUES("
			+this.getTypeId()+","+this.getLevelTypeId()+","+this.getWeight()+","+this.getAgentId()+","
			+this.escapeSpecialCharacters(getFrequencyWeeksQId())+","
			+this.escapeSpecialCharacters(getFrequencyHoursQId())+","+this.getParentId()+","+this.getSequence()+","+this.getJsmId()+")";
		
		this.setId(String.valueOf(this.sqlExecuteInsertExport(strSQL,conn)));		
	}
	public void insertFactExport(ExpertFact ef, Connection conn) throws Exception {
		String strSQL = "INSERT INTO rulefacts (ruleid,factid) VALUES("+this.getId()+","+ef.getId()+")";
		this.sqlExecuteInsertExport(strSQL,conn);
	}
	public String getJsmId() {
		if(jsmId==null){
			jsmId = "";
		}
		return jsmId;
	}
	public void setJsmId(String jsmId) {
		this.jsmId = jsmId;
	}
}
