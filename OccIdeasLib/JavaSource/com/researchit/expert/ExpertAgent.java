/**
 * Version:
 *     $Id: ExpertAgent.java,v 1.50 2008/12/20 02:07:08 troy.sadkowsky Exp $
 *
 * Revisions:
 *     $Log: ExpertAgent.java,v $
 *     Revision 1.50  2008/12/20 02:07:08  troy.sadkowsky
 *     v2 updates
 *
 *     Revision 1.49  2008/12/14 22:36:23  troy.sadkowsky
 *     new function to show rules on a question
 *
 *     Revision 1.48  2008/11/15 09:08:59  troy.sadkowsky
 *     various bug fixes and code cleaning
 *
 *     Revision 1.47  2008/09/20 08:59:30  troy.sadkowsky
 *     new assessment updates
 *
 *     Revision 1.46  2008/09/10 09:11:35  troy.sadkowsky
 *     ASsessment updates
 *
 *     Revision 1.45  2008/09/03 07:35:47  troy.sadkowsky
 *     tidy code and ensure connections close
 *
 *     Revision 1.44  2008/08/20 03:36:35  troy.sadkowsky
 *     assessment updates
 *
 *     Revision 1.43  2008/08/11 00:46:19  troy.sadkowsky
 *     rule conversion from ajsms
 *
 *     Revision 1.42  2008/08/06 01:08:30  troy.sadkowsky
 *     assessment updates
 *
 *     Revision 1.41  2008/08/02 06:16:57  troy.sadkowsky
 *     removed jess and reworked rules and ajsms
 *
 *     Revision 1.40  2008/06/27 04:01:54  ray.welburn
 *     Remove brackets from sql statements
 *
 *     Revision 1.39  2008/05/26 08:22:31  troy.sadkowsky
 *     Removed old code
 *
 */
package com.researchit.expert;

import java.io.File;
import java.io.FileReader;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.researchit.Agent;
import com.researchit.PossibleAnswer;
import com.researchit.Question;
import com.researchit.common.Study;
import com.researchit.expert.ExpertRule.RuleOutcome;

public class ExpertAgent extends Agent {
	
	private String expertRuleFilePath;
	private String expertRuleBatch;
	private ArrayList<ExpertRule> rules;
	private ArrayList<ExpertRule> invalidRules;
//	private ArrayList<ExpertFact> facts;
	
//	public ArrayList<ExpertFact> getFacts() throws Exception {
//		if (this.facts == null) {
//			this.getPersistentFacts();
//		}
//		return facts;
//	}
//	private void getPersistentFacts() throws Exception {
//		ResultSet rs = null;
//		try {
//			ArrayList<ExpertFact> facts = new ArrayList<ExpertFact>();
//			String strSQL = "SELECT id FROM fact";
//			rs = this.sqlExecuteSelect(strSQL);
//			if (rs != null) {
//				while (rs.next()) {
//					String id = rs.getString("id");
//					ExpertFact er = new ExpertFact(id);
//					facts.add(er);
//				}
//				if (rs.getStatement() != null) {
//					rs.getStatement().close();
//				}
//				rs.close();
//			}
//			this.setFacts(facts);
//		} catch (SQLException e) {
//			throw new Exception(e.getMessage());
//		} finally {
//			this.closeConnection();
//		}
//	}
//	public void setFacts(ArrayList<ExpertFact> facts) {
//		this.facts = facts;
//	}
	public void setRules(ArrayList<ExpertRule> rules) {
		this.rules = rules;
	}
	public String getExpertRuleBatch() {
		return expertRuleBatch;
	}
	public void setExpertRuleBatch(String expertRuleBatch) {
		this.expertRuleBatch = expertRuleBatch;
	}
	public String getExpertRuleFilePath() {
		return expertRuleFilePath;
	}
	public void setExpertRuleFilePath(String expertRuleFilePath) {
		this.expertRuleFilePath = expertRuleFilePath;
	}
	public ExpertAgent() {
		super();
	}
	public ExpertAgent(String dbID) throws Exception {
		super(dbID);
		if ((dbID != null) && (!(dbID.equalsIgnoreCase("")))) {
			this.setId(dbID);
			this.getPersistentObject();
		}
	}
	public void save() throws Exception {
		File f = new File(this.getExpertRuleFilePath());
		FileReader is = new FileReader(f);
		String ruleBatch = "";
		int c;
		while((c = is.read()) != -1){
			ruleBatch += String.valueOf((char)c);
		}
		this.setExpertRuleBatch(ruleBatch);
		String strSQL = "UPDATE agent SET expertrulefilepath = '"+this.getExpertRuleFilePath()+"',expertrulebatch = '"+this.getExpertRuleBatch()+"' WHERE id = " + this.getId();
		try {
			this.sqlExecuteUpdate(strSQL);
		} catch (SQLException e) {
			throw new Exception(e.getMessage());
		} finally {
			this.closeConnection();
		}
	}
	public ArrayList<ExpertRule> getRules() throws Exception {
		if (this.rules == null) {
			this.getPersistentRules();
		}
		return rules;
	}
	public ArrayList<ExpertRule> getJSMRules(String jsmId) throws Exception {	
		ArrayList<ExpertRule> rules = new ArrayList<ExpertRule>();
		ResultSet rs = null;
		try {			
			String strSQL = "SELECT DISTINCT rule.id";
			strSQL += " FROM rule WHERE (rule.ruletypeid = 1) AND (rule.agentid = "+this.getId()+") AND (rule.jsmid = "+jsmId+") ORDER BY rule.ruletypeid, rule.ruleleveltypeid,rule.id";
			rs = this.sqlExecuteSelect(strSQL);
			if (rs != null) {
				while (rs.next()) {
					String id = rs.getString("id");
					ExpertRule er = new ExpertRule();
					er.setId(id);
					rules.add(er);
				}
				if (rs.getStatement() != null) {
					rs.getStatement().close();
				}
				rs.close();
			}
			this.setRules(rules);
		} catch (SQLException e) {
			throw new Exception(e.getMessage());
		} finally {
			this.closeConnection();
		}
		for(ExpertRule er:rules){
			er.getPersistentObject();
		}
		return rules;
	}
	private void getPersistentRules() throws Exception {
		ResultSet rs = null;
		ArrayList<ExpertRule> rules = new ArrayList<ExpertRule>();
		try {			
			String strSQL = "";
			if(!(this.getStudyId().equalsIgnoreCase(""))){
				strSQL = "SELECT rule.id" +
				" FROM  studyrules INNER JOIN rule ON studyrules.ruleid = rule.id INNER JOIN" +
				" agent ON rule.agentid = agent.id" +
				" WHERE (rule.ruletypeid = 1) AND (agent.id = "+this.getId()+") AND (studyrules.studyid = "+this.getStudyId()+") ORDER BY rule.ruletypeid, rule.ruleleveltypeid,rule.sequence";
			}else{
				strSQL = "SELECT rule.id" +
				" FROM rule INNER JOIN" +
				" agent ON rule.agentid = agent.id WHERE (rule.ruletypeid = 1) AND (agent.id = "+this.getId()+") ORDER BY rule.ruletypeid, rule.ruleleveltypeid,rule.sequence";
			}		
			rs = this.sqlExecuteSelect(strSQL);
			if (rs != null) {
				while (rs.next()) {
					String id = rs.getString("id");
					ExpertRule er = new ExpertRule();
					er.setId(id);
					rules.add(er);
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
		for(ExpertRule rule: rules){
			rule.getPersistentObject();
		}
		this.setRules(rules);
	}	
//	public ArrayList<ExpertRule> getRulesOfType(String ruleTypeId,String jsmid) throws Exception {
//		ArrayList<ExpertRule> retValue = new ArrayList<ExpertRule>();
//		if(ruleTypeId.equalsIgnoreCase(ExpertRule.INVALID)){
//			retValue.addAll(this.getInvalidRules(jsmid));
//		}else{
//			for(ExpertRule er:this.getValidRules(jsmid)){
//				if(er.getLevelTypeId().equalsIgnoreCase(ruleTypeId)){
//					if(!(retValue.contains(er))){
//						retValue.add(er);
//					}								
//				}			
//			}
//		}
//		return retValue;
//	}
	public boolean hasRule(String questionId, String possibleAnswerId, String jsmId) throws Exception {
		boolean retValue = false;				
		try {
			String strSQL = "SELECT agent.id, jsm.id, factrequirements.questionid, factrequirements.answerid " +
					" FROM ((jsm INNER JOIN (agent INNER JOIN rule ON agent.id = rule.agentid) ON jsm.id = rule.jsmid) " +
					" INNER JOIN rulefacts ON rule.id = rulefacts.ruleid) " +
					" INNER JOIN factrequirements ON rulefacts.factid = factrequirements.factid " +
					" WHERE ( ((jsm.id)="+jsmId+") AND ((factrequirements.questionid)="+questionId+") AND ((factrequirements.answerid)="+possibleAnswerId+"));";

			ResultSet rs = this.sqlExecuteSelect(strSQL);
			if (rs != null) {
				if (rs.next()) {
					retValue = true;
				}
				if (rs.getStatement() != null) {
					rs.getStatement().close();
				}
				rs.close();
			}
			return retValue;
		} catch (SQLException e) {
			throw new Exception(e.getMessage());
		} finally {
			this.closeConnection();
		}			
	}	
	public ArrayList<ExpertRule> getRulesWithQuestion(Question q) throws Exception {
		ResultSet rs = null;		
		ArrayList<ExpertRule> rules = new ArrayList<ExpertRule>();
		String strSQL = "";			
		strSQL = "SELECT rule.id, factrequirements.questionid, question.name" +
		" FROM agent INNER JOIN" +
		" rule ON agent.id = rule.agentid INNER JOIN" +
		" rulefacts ON rule.id = rulefacts.ruleid INNER JOIN" +
		" fact ON rulefacts.factid = fact.id INNER JOIN" +
		" factrequirements ON fact.id = factrequirements.factid INNER JOIN" +
		" question ON factrequirements.questionid = question.id" +
		" WHERE (rule.jsmid = "+q.getJsmID()+") AND (agent.id = "+this.getId()+") AND (factrequirements.questionid = "+q.getId()+")  ORDER BY rule.ruleleveltypeid, rule.sequence";			
		rs = this.sqlExecuteSelect(strSQL);
		if (rs != null) {
			while (rs.next()) {
				String id = rs.getString("id");
				ExpertRule er = new ExpertRule();
				er.setId(id);
				rules.add(er);
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
	public ArrayList<ExpertRule> getRulesWithQuestionAndPossibleAnswer(Question q,PossibleAnswer pa) throws Exception {
		ResultSet rs = null;		
		ArrayList<ExpertRule> rules = new ArrayList<ExpertRule>();
		String strSQL = "";			
		strSQL = "SELECT rule.id, factrequirements.questionid, question.name" +
		" FROM agent INNER JOIN" +
		" rule ON agent.id = rule.agentid INNER JOIN" +
		" rulefacts ON rule.id = rulefacts.ruleid INNER JOIN" +
		" fact ON rulefacts.factid = fact.id INNER JOIN" +
		" factrequirements ON fact.id = factrequirements.factid INNER JOIN" +
		" question ON factrequirements.questionid = question.id" +
		" WHERE (rule.jsmid = "+q.getJsmID()+") AND (agent.id = "+this.getId()+") AND (factrequirements.questionid = "+q.getId()+")  AND (factrequirements.answerid = "+pa.getId()+") ORDER BY rule.ruleleveltypeid, rule.sequence";			
		rs = this.sqlExecuteSelect(strSQL);
		if (rs != null) {
			while (rs.next()) {
				String id = rs.getString("id");
				ExpertRule er = new ExpertRule();
				er.setId(id);
				rules.add(er);
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
	public boolean hasInvalideRules(String jsmId) throws Exception {
		boolean retValue = false;
		if(this.getInvalidRules(jsmId).size()>0){
			retValue = true;
		}
		return retValue;
	}
	public ArrayList<ExpertRule> getInvalidRules(String jsmId) throws Exception {
		if(this.invalidRules==null){
			ArrayList<ExpertRule> retValue = new ArrayList<ExpertRule>();
			//JobSpecificModule jsm = new JobSpecificModule(jsmId);
			for(ExpertRule er: this.getJSMRules(jsmId)){
				if(!(er.isValid())){
					retValue.add(er);
				}
			}
			invalidRules = retValue;
		}
		return invalidRules;
	}
	public String getCountAssessmentsRequired(String studyid, String jsmid) throws Exception {
		String retValue = "0";
		ResultSet rs = null;		
		String strSQL = "SELECT Count(agentassessments.id) AS CountOfid"
			+" FROM (jsminterview INNER JOIN (agent INNER JOIN agentassessments ON agent.id = agentassessments.agentid) ON jsminterview.jobhistoryid = agentassessments.jobhistoryid) INNER JOIN frozenjsm ON jsminterview.frozenjsmid = frozenjsm.id"
			+" GROUP BY agent.id, agentassessments.assessorusername, jsminterview.frozenjsmid, frozenjsm.studyid"
			+" HAVING (((agent.id)="+this.getId()+") AND ((agentassessments.assessorusername)='OccIDEAS')" 
			+" AND ((jsminterview.frozenjsmid)="+jsmid+") AND ((frozenjsm.studyid)="+studyid+"))";					
		rs = this.sqlExecuteSelect(strSQL);
		if (rs != null) {
			if (rs.next()) {
				retValue = rs.getString("CountOfid");
			}
			if (rs.getStatement() != null) {
				rs.getStatement().close();
			}
			rs.close();
		}
		this.closeConnection();
		return retValue;
	}
	public String getCountAssessmentsDone(String studyid, String jsmid) throws Exception {
		String retValue = "0";
		ResultSet rs = null;		
		String strSQL = "SELECT Count(agentassessments.id) AS CountOfid"
			+" FROM (jsminterview INNER JOIN (agent INNER JOIN agentassessments ON agent.id = agentassessments.agentid) ON jsminterview.jobhistoryid = agentassessments.jobhistoryid) INNER JOIN frozenjsm ON jsminterview.frozenjsmid = frozenjsm.id"
			+" GROUP BY agent.id, agentassessments.assessorusername, jsminterview.frozenjsmid, frozenjsm.studyid"
			+" HAVING (((agent.id)="+this.getId()+") AND ((agentassessments.assessorusername)<>'OccIDEAS')" 
			+" AND ((jsminterview.frozenjsmid)="+jsmid+") AND ((frozenjsm.studyid)="+studyid+"))";					
		rs = this.sqlExecuteSelect(strSQL);
		if (rs != null) {
			if (rs.next()) {
				retValue = rs.getString("CountOfid");
			}
			if (rs.getStatement() != null) {
				rs.getStatement().close();
			}
			rs.close();
		}
		this.closeConnection();
		return retValue;
	}
	public ArrayList<ExpertRule> getValidRules() throws Exception {
		ArrayList<ExpertRule> retValue = new ArrayList<ExpertRule>();
		ArrayList<ExpertRule> rules = new ArrayList<ExpertRule>();
		ResultSet rs = null;
		try {			
			String strSQL = "";			
			strSQL = "SELECT rule.id" +
			" FROM rule INNER JOIN" +
			" agent ON rule.agentid = agent.id WHERE (rule.ruletypeid = 1) AND (agent.id = "+this.getId()+") ORDER BY rule.ruletypeid, rule.ruleleveltypeid,rule.sequence";
					
			rs = this.sqlExecuteSelect(strSQL);
			if (rs != null) {
				while (rs.next()) {
					String id = rs.getString("id");
					ExpertRule er = new ExpertRule();
					er.setId(id);
					rules.add(er);
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
		for(ExpertRule er: rules){
			er.getPersistentObject();
			if(er.isValid()){
				retValue.add(er);
			}
		}
		return retValue;
	}
	public ArrayList<ExpertRule> getValidRules(String jsmid) throws Exception {
		ArrayList<ExpertRule> retValue = new ArrayList<ExpertRule>();
		ArrayList<ExpertRule> rules = new ArrayList<ExpertRule>();
		ResultSet rs = null;
		try {			
			String strSQL = "";			
			strSQL = "SELECT rule.id" +
			" FROM rule INNER JOIN" +
			" agent ON rule.agentid = agent.id WHERE (rule.jsmid = "+jsmid+") AND (rule.ruletypeid = 1) AND (agent.id = "+this.getId()+") ORDER BY rule.ruletypeid, rule.ruleleveltypeid,rule.sequence";
					
			rs = this.sqlExecuteSelect(strSQL);
			if (rs != null) {
				while (rs.next()) {
					String id = rs.getString("id");
					ExpertRule er = new ExpertRule();
					er.setId(id);
					rules.add(er);
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
		for(ExpertRule er: rules){
			er.getPersistentObject();
			if(er.isValid()){
				retValue.add(er);
			}
		}
		return retValue;
	}
	
	public ArrayList<ExpertRule> getValidRules(RuleOutcome outcome, String jsmId) throws Exception {
		ArrayList<ExpertRule> retValue = new ArrayList<ExpertRule>();
		for(ExpertRule er: this.getJSMRules(jsmId)){
			if(er.getJsmId().equalsIgnoreCase(jsmId)){
				if(er.getOutCome() == outcome){
					retValue.add(er);
				}
			}
		}
		return retValue;
	}
	public int getCountFiredRules(Study study, String jsmId) throws Exception {		
		return this.getCountFiredRules(study,jsmId,null);
	}	
	public int getCountFiredRules(Study study, String jsmId, String ruleLevelTypeId) throws Exception {
		int retValue = 0;
		ResultSet rs = null;
		try {			
			String strSQL = "SELECT Count(rule.id) AS CountOfid" +
					" FROM ((((agent INNER JOIN agentassessments ON agent.id = agentassessments.agentid) INNER JOIN agentassessmentrules ON agentassessments.id = agentassessmentrules.agentassessmentid) INNER JOIN rule ON agentassessmentrules.ruleid = rule.id) INNER JOIN " +
			" jobhistory ON agentassessments.jobhistoryid = jobhistory.id) INNER JOIN participant ON jobhistory.participantid = participant.id" +
			" GROUP BY agent.id, rule.ruleleveltypeid, rule.ruletypeid, participant.studyid, jobhistory.finaljsmid";
				
			if(ruleLevelTypeId==null){
				strSQL += " HAVING (((agent.id)="+this.getId()+") AND ((rule.ruletypeid)=1) AND ((participant.studyid)="+study.getId()+") AND ((jobhistory.finaljsmid)="+jsmId+"));";
			}else{
				strSQL += " HAVING (((agent.id)="+this.getId()+") AND ((rule.ruleleveltypeid)="+ruleLevelTypeId+") AND ((rule.ruletypeid)=1) AND ((participant.studyid)="+study.getId()+") AND ((jobhistory.finaljsmid)="+jsmId+"));";
			}
			rs = this.sqlExecuteSelect(strSQL);
			if (rs != null) {
				if (rs.next()) {
					retValue = rs.getInt("CountOfid");
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
		return retValue;
	}	
}
