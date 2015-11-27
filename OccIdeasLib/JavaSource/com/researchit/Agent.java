/**
 * Version:
 *     $Id: Agent.java,v 1.34 2009/05/05 03:08:32 troy.sadkowsky Exp $
 *
 * Revisions:
 *     $Log: Agent.java,v $
 *     Revision 1.34  2009/05/05 03:08:32  troy.sadkowsky
 *     made where clause case sensitive
 *
 *     Revision 1.33  2009/03/09 06:57:21  troy.sadkowsky
 *     bug fixes from demo testing
 *
 *     Revision 1.32  2009/02/04 22:41:37  troy.sadkowsky
 *     New report functions
 *
 *     Revision 1.31  2008/08/25 01:37:22  ray.welburn
 *     Updates to use single dbobject and participant status table
 *
 *     Revision 1.30  2008/08/13 04:35:06  ray.welburn
 *     modifications to add/edit agentexamples
 *
 *     Revision 1.29  2008/05/26 08:22:01  troy.sadkowsky
 *     Removed old code
 *
 *     Revision 1.28  2008/04/22 23:21:27  troy.sadkowsky
 *     new assessment requirements
 *
 *     Revision 1.27  2008/04/01 14:42:01  troy.sadkowsky
 *     new report on studies page and new filter by jsm
 *
 *     Revision 1.26  2007/12/18 00:21:10  troy.sadkowsky
 *     fix for new agent
 *
 *     Revision 1.25  2007/12/04 01:41:28  troy.sadkowsky
 *     minor restructure
 *
 *     Revision 1.24  2007/11/27 03:50:24  ray.welburn
 *     Created new agentexamples object
 *
 *     Revision 1.23  2007/11/08 06:48:47  troy.sadkowsky
 *     progress bar
 *
 *     Revision 1.22  2007/10/25 23:58:01  troy.sadkowsky
 *     removed old code and removed share conn on updates and selects
 *
 *     Revision 1.21  2007/10/16 02:48:12  troy.sadkowsky
 *     reports and single rules
 *
 *     Revision 1.20  2007/10/08 11:45:51  troy.sadkowsky
 *     small style update and fix for showing template jsms only
 *
 *     Revision 1.19  2007/09/23 22:53:50  troy.sadkowsky
 *     organized imports to remove warning
 *
 *     Revision 1.18  2007/09/21 00:21:50  troy.sadkowsky
 *     rule db transfer [incomplete]
 *
 *     Revision 1.17  2007/07/15 23:09:08  troy.sadkowsky
 *     organised imports
 *
 *     Revision 1.16  2007/06/03 23:19:43  Troy.Sadkowsky
 *     build 1.30 updates
 *
 *     Revision 1.15  2007/05/27 23:21:06  Troy.Sadkowsky
 *     restructured rule types
 *
 *     Revision 1.14  2007/05/03 13:52:47  Troy.Sadkowsky
 *     dynamic rule creation
 *
 *     Revision 1.13  2007/05/01 23:42:28  Troy.Sadkowsky
 *     changed agents view, add and edit
 *
 *     Revision 1.12  2007/04/12 13:27:00  Troy.Sadkowsky
 *     dynamic rule creation
 *
 *     Revision 1.11  2007/03/12 12:47:43  Troy.Sadkowsky
 *     removed frames
 *
 *     Revision 1.10  2007/02/28 00:37:29  troy.sadkowsky
 *     currently the default is that all rules are added to the template study
 *
 *     Revision 1.9  2007/02/25 23:15:26  troy.sadkowsky
 *     rules are now study specific
 *
 *     Revision 1.8  2007/02/20 03:14:49  troy
 *     set values for frequency
 *
 *     Revision 1.7  2007/01/23 22:15:52  Administrator
 *     v1.15 updates
 *
 *     Revision 1.6  2007/01/09 23:51:44  Administrator
 *     new assessment rules interface
 *
 *     Revision 1.5  2006/12/19 12:25:48  admin
 *     build v1.13.1
 *
 *     Revision 1.4  2006/11/15 07:30:38  admin
 *     build v1.10
 *
 *     Revision 1.3  2006/10/03 22:38:53  admin
 *     enhancements to expert system
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

import com.researchit.common.DBBaseObject;

public class Agent extends DBBaseObject {

	private String parentID = "";

	private String typeID = "";

	private String questionAgentID = "";

	private String studyId = "";
	private ArrayList<AgentExample> examples = null;
	private ArrayList<Question> questions;

	public Agent() {
		super();
	}
	public Agent(String dbID) throws Exception {
		super();
		if ((dbID != null) && (!(dbID.equalsIgnoreCase("")))) {
			this.setId(dbID);
			this.getPersistentObject();
		}
	}
	public void insert() throws Exception {
		if (!(this.exists())) {
			String strSQL = "INSERT INTO agent (name,description,parentagentid,agenttypeid) VALUES('"
					+ this.getName().replaceAll("'", "''")
					+ "','"
					+ this.getDescription().replaceAll("'", "''")
					+ "',"
					+ this.getParentID() + ","+this.getTypeID()+")";
			try {
				this.setId(String.valueOf(this.sqlExecuteInsert(strSQL)));
			} catch (SQLException e) {
				throw new Exception(e.getMessage());
			} finally {
				this.closeConnection();
			}
		}
	}
	public void update() throws Exception {
		String strSQL = "UPDATE agent SET description = '"
				+ this.escapeSpecialCharacters(this.getDescription()) + "',name = '"
				+ this.escapeSpecialCharacters(this.getName()) + "',parentagentid = "
				+ this.getParentID() + ", agenttypeid = " + this.getTypeID()
				+" WHERE id = " + this.getId();
		
		try {
			this.sqlExecuteUpdate(strSQL);
			//update the examples	
			for(AgentExample ae : this.getExamples()) {
				ae.saveObject();
				}
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
		if(this.getId().equalsIgnoreCase("")){
			String strSQL = "SELECT id FROM agent WHERE BINARY name = '"
				+ this.escapeSpecialCharacters(this.getName()) + "'";
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
		}else{
			bRetValue = true;
		}		
		return bRetValue;
	}
	public void delete() throws Exception {
		String strSQL = "DELETE FROM agent WHERE id = " + this.getId();
		try {
			this.sqlExecuteUpdate(strSQL);
		} catch (SQLException e) {
			throw new Exception(e.getMessage());
		} finally {
			this.closeConnection();
		}
	}
	protected void getPersistentObject() throws Exception {
		String strSQL = "SELECT id,parentagentid, description, name FROM agent WHERE id = "
				+ this.getId();
		ResultSet rs = null;
		try {
			rs = this.sqlExecuteSelect(strSQL);
			if (rs != null) {
				if (rs.next()) {
					this.setId(rs.getString("id"));
					this.setDescription(rs.getString("description"));
					this.setName(rs.getString("name"));
					this.setParentID(rs.getString("parentagentid"));
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
	public String getParentID() {
		if (this.parentID == null) {
			this.parentID = "NULL";
		}
		if (this.parentID.equalsIgnoreCase("")) {
			this.parentID = "NULL";
		}
		return parentID;
	}
	public void setParentID(String parentID) {
		this.parentID = parentID;
	}
	public ArrayList<Question> getQuestions() throws Exception {
		if (this.questions == null) {
			this.getPersistentQuestions();
		}
		return questions;
	}
	public ArrayList<Question> getProbLevelQuestions(String jsmId) throws Exception {				
		ArrayList<Question> retValue = new ArrayList<Question>();
		JobSpecificModule jsm = new JobSpecificModule(jsmId);
		ArrayList<Question> allQs = jsm.getMjsmsQuestionsList(this.getId());
		for(Question q : allQs){
			if(!(q.getTypeID().equalsIgnoreCase(Question.FREQUENCY))){				
				retValue.add(q);									
			}
		}
		return retValue;
	}
	public ArrayList<Question> getFreqQuestions(String jsmId) throws Exception {				
		ArrayList<Question> retValue = new ArrayList<Question>();
		JobSpecificModule jsm = new JobSpecificModule(jsmId);
		ArrayList<Question> allQs = jsm.getMjsmsQuestionsList(this.getId());
		for(Question q : allQs){
			if(q.getTypeID().equalsIgnoreCase(Question.FREQUENCY)){				
				retValue.add(q);									
			}
		}
		return retValue;
	}
	private void getPersistentQuestions() throws Exception {
		ResultSet rs = null;	
		ArrayList<Question> qs = new ArrayList<Question>();
		String strSQL = "SELECT id, jsmquestionstructureid, agentid FROM  jsmquestionstructureagent WHERE agentid = " + this.getId();
		rs = this.sqlExecuteSelect(strSQL);
		if (rs != null) {
			while (rs.next()) {
				String qid = rs.getString("jsmquestionstructureid");
				Question q = new Question();
				q.setJsmStructureQuestionID(qid);
				qs.add(q);
			}
			if (rs.getStatement() != null) {
				rs.getStatement().close();
			}
			rs.close();
		}
		this.setQuestions(qs);	
		this.closeConnection();
		for(Question q:qs){
			q.getPersistentStructureObject();
		}
	}
	public void setQuestions(ArrayList<Question> questions) {
		this.questions = questions;
	}
	public String getQuestionAgentID() {
		return questionAgentID;
	}
	public void setQuestionAgentID(String questionAgentID) {
		this.questionAgentID = questionAgentID;
	}
	public String getStudyId() {
		return studyId;
	}
	public void setStudyId(String studyID) {
		this.studyId = studyID;
	}

	public String getTypeID() {
		if (this.typeID == null) {
			this.typeID = "NULL";
		}
		if (this.typeID.equalsIgnoreCase("")) {
			this.typeID = "NULL";
		}
		return typeID;
	}

	public void setTypeID(String typeID) {
		this.typeID = typeID;
	}

	public Assessment getAssessment(JobHistory jh) throws Exception {
		Assessment retValue = new Assessment();
		
		String strSQL = "SELECT id FROM agentassessments " +
        " WHERE (jobhistoryid = " + jh.getId()+ ") AND (agentid = "+this.getId()+") AND (NOT(assessorusername='OccIDEAS'))";
        ResultSet rs = null;
       
        try {
            rs = this.sqlExecuteSelect(strSQL);
            if (rs != null) {
                if (rs.next()) {
                    retValue.setId(rs.getString("id"));  
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
        if(!(retValue.getId().equalsIgnoreCase(""))){
        	retValue.getPersistentObject();
        }
        if(retValue.getId().equalsIgnoreCase("")){
        	//JobHistory jh = new JobHistory(id);
        	retValue.setFrequencyweeks(jh.getWeeksPerYear());
        	retValue.setFrequencyhours(jh.getHoursPerWeek());
        }
        retValue.setAgentId(this.getId());
        retValue.setJobHistoryId(jh.getId());
        return retValue;
	}
	public Assessment getAutoAssessment(JobHistory jh) throws Exception {
		Assessment retValue = new Assessment();
		String strSQL = "SELECT id FROM agentassessments " +
        " WHERE (jobhistoryid = " + jh.getId()+ ") AND (agentid = "+this.getId()+") AND (assessorusername='OccIDEAS')";
        ResultSet rs = null;
       
        try {
            rs = this.sqlExecuteSelect(strSQL);
            if (rs != null) {
                if (rs.next()) {
                    retValue.setId(rs.getString("id"));              
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
        if(!(retValue.getId().equalsIgnoreCase(""))){
        	retValue.getPersistentObject();
        }
        return retValue;
	}

	public ArrayList<AgentExample> getExamples() throws Exception {
		if(examples==null){
			this.getPersistentExamples();
		}
		return examples;
	}

	private void getPersistentExamples() throws Exception {
		if(!(this.getId().equalsIgnoreCase(""))){
			String strSQL = "SELECT * FROM agentexamples WHERE agentid = "
				+ this.getId();
			ResultSet rs = null;
			try {
				ArrayList<AgentExample> examples = new ArrayList<AgentExample>();
				rs = this.sqlExecuteSelect(strSQL);
	
				while (rs.next()) {
					AgentExample example = new AgentExample(rs.getString("id"), Integer.parseInt(this.getId()));
					example.setExamplename(rs.getString("examplename"));
					example.setTlvHigh(rs.getString("tlvhigh"));
					example.setTlvMed(rs.getString("tlvmed"));
					example.setTlvLow(rs.getString("tlvlow"));
					examples.add(example);
				}
				rs.close();
				this.setExamples(examples);
			} catch (SQLException e) {
				throw new Exception(e.getMessage());
			} finally {
				this.closeConnection();
			}
		}				
	}

	public void setExamples(ArrayList<AgentExample> examples) {
		this.examples = examples;
	}
	
	public void deleteExample(AgentExample ae) throws Exception{
		if (this.getExamples().contains(ae)) {
			this.getExamples().remove(ae);
			this.save();
		}
	}
	public ArrayList<JobSpecificModule> getJSMs() throws Exception {
		return this.getJSMs("");
	}
	public ArrayList<JobSpecificModule> getJSMs(String studyid) throws Exception {
		ArrayList<JobSpecificModule> jsms = new ArrayList<JobSpecificModule>();       
        String strSQL = "";
        
        if(studyid.equalsIgnoreCase("")){
        	strSQL = "SELECT DISTINCT jsm.id, jsm.name, jsm.description, jsm.isassociate"
                + " FROM jsm INNER JOIN"
                + " jsmquestionstructure ON jsm.id = jsmquestionstructure.jsmid INNER JOIN"
                + " jsmquestionstructureagent ON jsmquestionstructure.id = jsmquestionstructureagent.jsmquestionstructureid"
                + " WHERE (jsmquestionstructureagent.agentid = "
                + this.getId()
                + ") AND jsm.jsmtypeid = 0 ORDER BY jsm.name";
        }else{
        	strSQL = "SELECT DISTINCT jsm.id, jsm.name, jsm.description, jsm.isassociate"
                + " FROM jsm INNER JOIN"
                + " jsmquestionstructure ON jsm.id = jsmquestionstructure.jsmid INNER JOIN"
                + " jsmquestionstructureagent ON jsmquestionstructure.id = jsmquestionstructureagent.jsmquestionstructureid"
                + " WHERE (jsmquestionstructureagent.agentid = "
                + this.getId()
                + ") AND jsm.jsmtypeid = 0 ORDER BY jsm.name";
        }
        ResultSet rs = null;
        try {
            rs = this.sqlExecuteSelect(strSQL);
            if (rs != null) {
                while (rs.next()) {
                    JobSpecificModule jsm = new JobSpecificModule();
                    jsm.setId(rs.getString("id"));
                    jsm.setName(rs.getString("name"));
                    jsm.setDescription(rs.getString("description"));
                    jsm.setAssociateModule(rs.getBoolean("isassociate"));
                    jsms.add(jsm);
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
        return jsms;
	}

	public ArrayList<Agent> getAllAgents() throws Exception {
		ArrayList<Agent> agents = new ArrayList<Agent>();
		String strSQL = "";
        ResultSet rs = null;
        try {           
            strSQL = "SELECT agent.id, agent.name, agent.parentagentid, agent.description"
                    + " FROM agent WHERE (agent.parentagentid IS NOT NULL) ";
            rs = this.sqlExecuteSelect(strSQL);
            if (rs != null) {
                while (rs.next()) {
                    Agent agent = new Agent();
                    agent.setId(rs.getString("id"));
                    agent.setName(rs.getString("name"));
                    agent.setDescription(rs.getString("description"));
                    agent.setParentID(rs.getString("parentagentid"));
                    agents.add(agent);
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
        return agents;
	}
}