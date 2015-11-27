package com.researchit;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.researchit.common.Study;
import com.researchit.expert.ExpertAgent;

public class FrozenJobSpecificModule extends JobSpecificModule {

    private String interviewId;
    private String studyId;
    private String originalJsmId;   
    private String dateCreated;
    private ArrayList<Interview> interviews;

    public ArrayList<Interview> getInterviews() {
		return interviews;
	}
	public void setInterviews(ArrayList<Interview> interviews) {
		this.interviews = interviews;
	}
	public String getInterviewId() {
		if(interviewId==null){
			interviewId = "";
		}
        return interviewId;
    }
    public void setInterviewId(String interviewId) {
        this.interviewId = interviewId;
    }
    public FrozenJobSpecificModule() {
        super();
    }
    public FrozenJobSpecificModule(String jsmID) throws Exception {
        this.setId(jsmID);
        this.getPersistentObject();
    }
    public FrozenJobSpecificModule(String jsmID, String interviewID) throws Exception {
        this.setId(jsmID);
        this.setInterviewId(interviewID);
    }
    public boolean exists() throws Exception {
        boolean bRetValue = false;
        return bRetValue;
    }
    public void save() throws Exception {
        String strSQL = "";
        if (this.exists()) {
            strSQL = "UPDATE frozenjsm SET name='"
                    + this.escapeSpecialCharacters(this.getName())
                    + "',description='"
                    + this.escapeSpecialCharacters(this.getDescription())
                    + "',interviewstartnote='"
                    + this.escapeSpecialCharacters(this.getInterviewStartNote())
                    + "',interviewendnote='"
                    + this.escapeSpecialCharacters(this.getInterviewEndNote())
                    + "',originaljsmid="+this.getStudySpecificJsmId()+",studyid="
                    + this.getStudyId()
                    + ",datecreated=GETDATE() WHERE id = "
                    + this.getId();
            try {
                this.sqlExecuteUpdate(strSQL);
            } catch (SQLException e) {
                throw new Exception(e.getMessage());
            }
        } else {
            strSQL = "INSERT INTO frozenjsm (name,description,interviewstartnote,interviewendnote,originaljsmid,studyid,iscurrent,datecreated) VALUES('"
                    + this.escapeSpecialCharacters(this.getName())
                    + "','"
                    + this.escapeSpecialCharacters(this.getDescription())
                    + "','"
                    + this.escapeSpecialCharacters(this.getInterviewStartNote())
                    + "','"
                    + this.escapeSpecialCharacters(this.getInterviewEndNote())
                    + "',"
                    +this.getStudySpecificJsmId()
                    +","
                    + this.getStudyId()
                    + ",1,GETDATE())";
            try {
                String id = String.valueOf(this.sqlExecuteInsert(strSQL));
                this.setId(id);
            } catch (SQLException e) {
                throw new Exception(e.getMessage());
            }
        }
    }
    public String getStudyId() {
        return studyId;
    }
    public void setStudyId(String studyId) {
        this.studyId = studyId;
    }
    public String getStudySpecificJsmId() {
        return originalJsmId;
    }
    public void setOriginalJsmId(String originalJsmId) {
        this.originalJsmId = originalJsmId;
    }
    public Question getNextQuestion(String questionId) throws Exception {
        Question qNext = null;
        if(questionId.equalsIgnoreCase("")){
        	qNext = this.getQuestions().get(0);            
        }else{
            Question qCurrent = new Question(questionId);
            String qNextId = qCurrent.getNextInterviewQuestionID();
            qNext = new Question(qNextId);
        }
        return qNext;
    }
    public Question getNextInterviewQuestion(FrozenQA fqa,Interview interview) throws Exception {
        Question qNext = null;
        if(fqa == null){
        	qNext = this.getFrozenQuestions().get(0);                
        }else{
        	for(Question q:this.getFrozenQuestions()){
        		if(q.getFrozenQuestion().getDisplayOrder()>fqa.getDisplayOrder()){
        			if(!(q.isViewWithParent())){
        				if(q.isNext(interview)){
            				qNext = q;
            				break;
            			}
        			}       			
        		}
        	}
        }
        return qNext;
    }
    public void getPersistentObject() throws Exception {
        String strSQL = "SELECT id,name,description,interviewstartnote,interviewendnote,originaljsmid,studyid,datecreated FROM frozenjsm WHERE id = "
                + this.getId();
        ResultSet rs = null;
        try {
            rs = this.sqlExecuteSelect(strSQL);
            if (rs != null) {
                if (rs.next()) {
                    this.setId(rs.getString("id"));
                    this.setDescription(rs.getString("description"));
                    this.setName(rs.getString("name"));
                    this.setInterviewStartNote(rs.getString("interviewstartnote"));
                    this.setInterviewEndNote(rs.getString("interviewendnote"));
                    this.setOriginalJsmId(rs.getString("originaljsmid"));
                    this.setStudyId(rs.getString("studyid"));
                    this.setDateCreated(rs.getString("datecreated"));
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
    private void getPersistentAgents() throws Exception {
        ResultSet rs = null;
        try {
            this.agents = new ArrayList<Agent>();
            String strSQL = "SELECT DISTINCT agent.id, agent.name, agent.agenttypeid, agent.parentagentid"
                    + " FROM frozenjsm INNER JOIN"
                    + " jsmquestionstructure ON frozenjsm.originaljsmid = jsmquestionstructure.jsmid INNER JOIN"
                    + " jsmquestionstructureagent ON jsmquestionstructure.id = jsmquestionstructureagent.jsmquestionstructureid INNER JOIN"
                    + " agent ON jsmquestionstructureagent.agentid = agent.id "
                    + " WHERE (frozenjsm.id = "
                    + this.getId()
                    + ") ORDER BY agent.parentagentid, agent.name";
            rs = this.sqlExecuteSelect(strSQL);
            if (rs != null) {
                while (rs.next()) {
                    String id = rs.getString("id");
                    Agent agent = new Agent();
                    agent.setId(id);
                    agent.setName(rs.getString("name"));
                    agent.setTypeID(rs.getString("agenttypeid"));
                    this.agents.add(agent);
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
    public ArrayList<Agent> getAgents() throws Exception {
        if (this.agents == null) {
            this.getPersistentAgents();
        }
        return agents;
    }
    public boolean hasAgent(String agentID) throws Exception {
        boolean retValue = false;
        for (Agent agent : this.getAgents()) {
            if (agent.getId().equalsIgnoreCase(agentID)) {
                retValue = true;
                break;
            }
        }
        return retValue;
    }
    public void delete() throws Exception {
        String strSQL = "";
        try {
            strSQL = "DELETE FROM jsmquestionstructure WHERE jsmid = " + this.getId();
            this.sqlExecuteUpdate(strSQL);
            strSQL = "DELETE FROM frozenjsm WHERE id = " + this.getId();
            this.sqlExecuteUpdate(strSQL);
        } catch (SQLException e) {
            throw new Exception(e.getMessage());
        }
    }
	public void archive() throws Exception {
		String strSQL = "UPDATE frozenjsm SET iscurrent=0 WHERE id = "
                + this.getId();
        try {
            this.sqlExecuteUpdate(strSQL);
        } catch (SQLException e) {
            throw new Exception(e.getMessage());
        }       
	}
	public ArrayList<Interview> getInterviews(String studyId) throws Exception {
		if (this.interviews == null) {
            this.getPersistentInterviews(studyId);
        }
		return interviews;
	}
	private void getPersistentInterviews(String studyId) throws Exception {
		ResultSet rs = null;
        try {
            this.interviews = new ArrayList<Interview>();
            //String strSQL = "SELECT jsminterview.id FROM jsminterview WHERE (jsminterview.frozenjsmid = "+this.getId()+") ORDER BY jsminterview.id DESC";
            String strSQL = "SELECT jsminterview.id, participant.referencenumber AS prn, participant.amr_ref_id AS arn, jobhistory.referencenumber AS jrn FROM (jsminterview INNER JOIN jobhistory ON jsminterview.jobhistoryid = jobhistory.id) INNER JOIN participant ON jsminterview.participantid = participant.id WHERE (((jsminterview.frozenjsmid)="+this.getId()+")) ORDER BY jsminterview.id DESC;";
            rs = this.sqlExecuteSelect(strSQL);
            if (rs != null) {
                while (rs.next()) {
                    String id = rs.getString("id");
                    Interview interview = new Interview();
                    interview.setId(id);
                    interview.setAmrRefId(rs.getString("arn"));
                    interview.setParticipantReferenceNumber(rs.getString("prn"));
                    interview.setJobHistoryReferenceNumber(rs.getString("jrn"));
                    this.interviews.add(interview);
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
        for(Interview interview: this.interviews){
        	interview.getPersistentObject();
        }
	}
	public String getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(String dateCreated) {
		this.dateCreated = dateCreated;
	}
	public String getCountAssessmentsRequired(String studyid, ArrayList<ExpertAgent> agents) throws Exception {
		String retValue = "0";
		String sqlAgentsFilter = "IN (";
		int iSize = agents.size();
		int i = 0;
		for(ExpertAgent agent: agents){
			sqlAgentsFilter += agent.getId();
			i++;
			if(i!=iSize){
				sqlAgentsFilter += ",";
			}else{
				sqlAgentsFilter += ")";
			}
		}
		ResultSet rs = null;		
		String strSQL = "SELECT Count(agentassessments.id) AS CountOfid"
			+" FROM (jsminterview INNER JOIN (agent INNER JOIN agentassessments ON agent.id = agentassessments.agentid) ON jsminterview.jobhistoryid = agentassessments.jobhistoryid) INNER JOIN frozenjsm ON jsminterview.frozenjsmid = frozenjsm.id"
			+" WHERE ((agent.id) "+sqlAgentsFilter+")"
			+" GROUP BY agentassessments.assessorusername, jsminterview.frozenjsmid, frozenjsm.studyid" 
			+" HAVING (((agentassessments.assessorusername)='OccIDEAS') AND ((jsminterview.frozenjsmid)="+this.getId()+") AND ((frozenjsm.studyid)="+studyid+"))";					
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
	public String getCountAssessmentsDone(String studyid, ArrayList<ExpertAgent> agents) throws Exception {
		String retValue = "0";
		String sqlAgentsFilter = "IN (";
		int iSize = agents.size();
		int i = 0;
		for(ExpertAgent agent: agents){
			sqlAgentsFilter += agent.getId();
			i++;
			if(i!=iSize){
				sqlAgentsFilter += ",";
			}else{
				sqlAgentsFilter += ")";
			}
		}
		ResultSet rs = null;		
		String strSQL = "SELECT Count(agentassessments.id) AS CountOfid"
			+" FROM (jsminterview INNER JOIN (agent INNER JOIN agentassessments ON agent.id = agentassessments.agentid) ON jsminterview.jobhistoryid = agentassessments.jobhistoryid) INNER JOIN frozenjsm ON jsminterview.frozenjsmid = frozenjsm.id"
			+" WHERE ((agent.id) "+sqlAgentsFilter+")"
			+" GROUP BY agentassessments.assessorusername, jsminterview.frozenjsmid, frozenjsm.studyid" 
			+" HAVING (((agentassessments.assessorusername)<>'OccIDEAS') AND ((jsminterview.frozenjsmid)="+this.getId()+") AND ((frozenjsm.studyid)="+studyid+"))";					
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
	public ArrayList<Question> getFrozenQuestions() throws Exception {
		ArrayList<Question> questions = new ArrayList<Question>();		
		ResultSet rs = null;		
		String strSQL = "SELECT id, questionid,jsmquestionstructureid FROM frozenjsmquestionsandpossibleanswers WHERE (questionid IS NOT NULL) AND frozenjsmid = "+this.getId()+" ORDER BY displayorder";					
		rs = this.sqlExecuteSelect(strSQL);
		if (rs != null) {
			while (rs.next()) {
				Question question = new Question();
				question.setId(rs.getString("questionid"));
				question.setJsmStructureQuestionID(rs.getString("jsmquestionstructureid"));
				FrozenQA frozenQA = new FrozenQA();
				frozenQA.setId(rs.getString("id"));
				question.setFrozenQuestion(frozenQA);
				
				questions.add(question);
			}
			if (rs.getStatement() != null) {
				rs.getStatement().close();
			}
			rs.close();
		}
		this.closeConnection();
		for(Question question:questions){
			question.getPersistentStructureObject();
			question.getFrozenQuestion().getPersistentObject();
		}
		return questions;
	}
	public ArrayList<Question> getFrozenQuestions(Agent agent) throws Exception {
		ArrayList<Question> questions = new ArrayList<Question>();		
		ResultSet rs = null;		
		String strSQL = "SELECT id, questionid,jsmquestionstructureid FROM frozenjsmquestionsandpossibleanswers WHERE (questionid IS NOT NULL) AND frozenjsmid = "+this.getId()+" ORDER BY displayorder";					
		rs = this.sqlExecuteSelect(strSQL);
		if (rs != null) {
			while (rs.next()) {
				Question question = new Question();
				question.setId(rs.getString("questionid"));
				question.setJsmStructureQuestionID(rs.getString("jsmquestionstructureid"));
				FrozenQA frozenQA = new FrozenQA();
				frozenQA.setId(rs.getString("id"));
				question.setFrozenQuestion(frozenQA);
				
				questions.add(question);
			}
			if (rs.getStatement() != null) {
				rs.getStatement().close();
			}
			rs.close();
		}
		this.closeConnection();
		for(Question question:questions){
			question.getPersistentStructureObject();
			question.getFrozenQuestion().getPersistentObject();
		}
		return questions;
	}
	public ArrayList<FrozenQA> getFrozenQuestionsAndAnswers() throws Exception {
		ArrayList<FrozenQA> questions = new ArrayList<FrozenQA>();		
		ResultSet rs = null;		
		String strSQL = "SELECT id FROM frozenjsmquestionsandpossibleanswers WHERE frozenjsmid = "+this.getId()+" order by displayorder";					
		rs = this.sqlExecuteSelect(strSQL);
		if (rs != null) {
			while (rs.next()) {
				FrozenQA frozenQA = new FrozenQA();
				frozenQA.setId(rs.getString("id"));
				questions.add(frozenQA);
			}
			if (rs.getStatement() != null) {
				rs.getStatement().close();
			}
			rs.close();
		}
		this.closeConnection();
		for(FrozenQA frozenQA:questions){
			frozenQA.getPersistentObject();
		}
		return questions;
	}
//	public String getCountAtInterview() throws Exception {
//		String retValue = "0";
//		ResultSet rs = null;		
//		String strSQL = "SELECT Count(jobhistory.id) AS CountOfid, participant.participantstatusid FROM jobhistory INNER JOIN participant ON jobhistory.participantid = participant.id GROUP BY jobhistory.finaljsmid, participant.participantstatusid HAVING (((jobhistory.finaljsmid)="+this.getStudySpecificJsmId()+") AND ((participant.participantstatusid)<4))";					
//		rs = this.sqlExecuteSelect(strSQL);
//		if (rs != null) {
//			if (rs.next()) {
//				retValue = rs.getString("CountOfid");
//			}
//			if (rs.getStatement() != null) {
//				rs.getStatement().close();
//			}
//			rs.close();
//		}
//		this.closeConnection();
//		return retValue;
//	}
//	public String getCountAssessmentToDo() throws Exception {
//		String retValue = "0";
//		ResultSet rs = null;		
//		String strSQL = "SELECT Count(agentassessments.id) AS CountOfid" +
//		" FROM (participant INNER JOIN jobhistory ON participant.id = jobhistory.participantid) INNER JOIN agentassessments ON jobhistory.id = agentassessments.jobhistoryid" +
//		" GROUP BY participant.studyid, agentassessments.assessorusername, jobhistory.finaljsmid" +
//		" HAVING (((participant.studyid)="+this.getStudyId()+") AND ((agentassessments.assessorusername)=\"OccIDEAS\") AND ((jobhistory.finaljsmid)="+this.getStudySpecificJsmId()+"));";					
//		rs = this.sqlExecuteSelect(strSQL);
//		if (rs != null) {
//			if (rs.next()) {
//				retValue = rs.getString("CountOfid");
//			}
//			if (rs.getStatement() != null) {
//				rs.getStatement().close();
//			}
//			rs.close();
//		}
//		this.closeConnection();
//		return retValue;
//	}
	public String getCountAssessmentReadyAutoAssessed() throws Exception {
		String retValue = "0";
		ResultSet rs = null;		
		String strSQL = "SELECT Count(agentassessments.id) AS CountOfid" +
				" FROM (participant INNER JOIN jobhistory ON participant.id = jobhistory.participantid) INNER JOIN agentassessments ON jobhistory.id = agentassessments.jobhistoryid" +
				" GROUP BY participant.studyid, agentassessments.assessorusername, jobhistory.finaljsmid" +
				" HAVING (((participant.studyid)="+this.getStudyId()+") AND ((agentassessments.assessorusername)=\"OccIDEAS\") AND ((jobhistory.finaljsmid)="+this.getStudySpecificJsmId()+"));";					
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
	public int getJobHistoryCount() throws Exception {
		int jobHistoryCount = 0;
		ResultSet rs = null;		
		String strSQL = "SELECT Count(jobhistory.id) AS CountOfid " +
				" FROM jobhistory INNER JOIN participant ON jobhistory.participantid = participant.id " +
				" WHERE participant.participantstatusid IN (4,5,6) " +
				" GROUP BY jobhistory.finaljsmid " +
				" HAVING jobhistory.finaljsmid="+this.getStudySpecificJsmId()+";";					
		rs = this.sqlExecuteSelect(strSQL);
		if (rs != null) {
			if (rs.next()) {
				jobHistoryCount = rs.getInt("CountOfid");
			}
			if (rs.getStatement() != null) {
				rs.getStatement().close();
			}
			rs.close();
		}
		this.closeConnection();
		return jobHistoryCount;
	}
	public String getCountAssessmentReadyAutoAssessed(Agent agent) throws Exception {
		String retValue = "0";
		ResultSet rs = null;		
		String strSQL = "SELECT Count(agentassessments.id) AS CountOfid" +
				" FROM (participant INNER JOIN jobhistory ON participant.id = jobhistory.participantid) INNER JOIN agentassessments ON jobhistory.id = agentassessments.jobhistoryid" +
				" GROUP BY participant.studyid, agentassessments.assessorusername, jobhistory.finaljsmid,agentassessments.agentid" +
				" HAVING (((participant.studyid)="+this.getStudyId()+") AND ((agentassessments.assessorusername)=\"OccIDEAS\") AND ((agentassessments.agentid)="+agent.getId()+") AND ((jobhistory.finaljsmid)="+this.getStudySpecificJsmId()+"));";					
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
	public String getCountAssessmentManualDone() throws Exception {
		String retValue = "0";
		ResultSet rs = null;		
		String strSQL = "SELECT Count(agentassessments.id) AS CountOfid" +
		" FROM (participant INNER JOIN jobhistory ON participant.id = jobhistory.participantid) INNER JOIN agentassessments ON jobhistory.id = agentassessments.jobhistoryid" +
		" GROUP BY participant.studyid, agentassessments.assessorusername, jobhistory.finaljsmid" +
		" HAVING (((participant.studyid)="+this.getStudyId()+") AND ((agentassessments.assessorusername)<>\"OccIDEAS\") AND ((jobhistory.finaljsmid)="+this.getStudySpecificJsmId()+"));";					
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
	public String getCountAssessmentManualDone(Agent agent) throws Exception {
		String retValue = "0";
		ResultSet rs = null;		
		String strSQL = "SELECT Count(agentassessments.id) AS CountOfid" +
		" FROM (participant INNER JOIN jobhistory ON participant.id = jobhistory.participantid) INNER JOIN agentassessments ON jobhistory.id = agentassessments.jobhistoryid" +
		" GROUP BY participant.studyid, agentassessments.assessorusername, jobhistory.finaljsmid,agentassessments.agentid" +
		" HAVING (((participant.studyid)="+this.getStudyId()+") AND ((agentassessments.assessorusername)<>\"OccIDEAS\") AND ((agentassessments.agentid)="+agent.getId()+") AND ((jobhistory.finaljsmid)="+this.getStudySpecificJsmId()+"));";					
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
	public FrozenQA getFrozenQA(Question saveQ) throws Exception {
		FrozenQA retValue = null;
		for(FrozenQA fqa:this.getFrozenQuestionsAndAnswers()){
			if(fqa.getQuestionId()!=null){
				if(fqa.getJsmQuestionStructureId().equalsIgnoreCase(saveQ.getJsmQuestionStructureID())){
					retValue = fqa;
					break;
				}
			}						
		}
		return retValue;		
	}
	public boolean hasFiredRules() throws Exception {
		boolean retValue = false;
		Study study = new Study(this.getStudyId());
		for(Agent agent: study.getAgents()){
			ExpertAgent es = new ExpertAgent(agent.getId());
			if(es.getCountFiredRules(study,this.getStudySpecificJsmId())!=0){
				retValue = true;
				break;
			}			
		}		
		return retValue;
	}
}
