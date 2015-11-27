package com.researchit;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.researchit.common.DBBaseObject;
import com.researchit.expert.ExpertFact;
import com.researchit.expert.ExpertFactRequirement;
import com.researchit.expert.ExpertRule;
import com.researchit.expert.ExpertRule.RuleOutcome;

public class Interview extends DBBaseObject {

	String description;
	String jobHistoryId;   
	String amrRefId;   
	String jobHistoryReferenceNumber;   
	String participantId;
	String participantReferenceNumber;
	String status;
	String note;
	String frozenJsmId;
	ArrayList<ExpertRule> firedRules;
	List<InterviewAnswer> interviewAnswers;

	static public final String STARTED = "1";
	public static final String RESUMED = "2";
	public static final String SUSPENDED = "3";
	public static final String COMPLETED = "4";
	public static final String HALTED = "5";

	public Interview() {
		super();
	}
	public Interview(String id, Connection connection) throws Exception {
		this.connection = connection;
		if ((id != null) && (!(id.equalsIgnoreCase("")))) {
			this.setId(id);
			this.getPersistentObject();
		}
	}

	public Interview(String interviewId) throws Exception {
		this.setId(interviewId);
		this.getPersistentObject();
	}

	boolean exists() throws Exception {
		boolean bRetValue = false;
		if (!(this.getId().equalsIgnoreCase(""))) {
			bRetValue = true;
		} 
		return bRetValue;
	}

	public void getPersistentObject() throws Exception {
		String strSQL = "SELECT id, description, status, jobhistoryid, notes, frozenjsmid,participantid FROM jsminterview WHERE iscurrent=1 AND id = "
				+ this.getId();
		ResultSet rs = null;
		try {
			rs = this.sqlExecuteSelect(strSQL);
			if (rs != null) {
				if (rs.next()) {
					this.setId(rs.getString("id"));
					this.setDescription(rs.getString("description"));
					this.setStatus(rs.getString("status"));
					this.setJobHistoryId(rs.getString("jobhistoryid"));
					this.setNote(rs.getString("notes"));
					this.setFrozenJsmId(rs.getString("frozenjsmid"));
					this.setParticipantId(rs.getString("participantid"));
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

	public void save() throws Exception {
		if (this.exists()) {
			this.update();
		} else {
			this.insert();
		}
	}

	private void update() throws Exception {
		String strSQL = "UPDATE jsminterview SET description='"
				+ this.getDescription().replaceAll("'", "''")
				+ "',frozenjsmid="
				+ this.getFrozenJsmId()
				+ ", status="
				+ this.getStatus()
				+ ", jobhistoryid="
				+ this.getJobHistoryId()
				+ ", participantid="
				+ this.getParticipantId()
				+ ", notes='"
				+ this.getNote().replaceAll("'", "''")
				+ "' WHERE id = "
				+ this.getId();
		try {
			this.sqlExecuteUpdate(strSQL);
		} catch (SQLException e) {
			throw new Exception(e.getMessage());
		}

	}

	private void insert() throws Exception {
		String strSQL = "INSERT INTO jsminterview (description,status,jobhistoryid,notes,frozenjsmid,iscurrent,participantid) VALUES('"
				+ this.getDescription().replaceAll("'", "''")
				+ "',"
				+ this.getStatus()
				+ ","
				+ this.getJobHistoryId()
				+ ",'"
				+ this.getNote()
				+ "',"
				+ this.getFrozenJsmId()
				+ ",1,"
				+ this.getParticipantId()
				+ ")";
		try {
			String id = String.valueOf(this.sqlExecuteInsert(strSQL));
			this.setId(id);
			// TODO create status history
			// strSQL = "INSERT INTO statusHistory (ChangedTo,interviewID)
			// VALUES ('Started',"+this.getId()+")";
			// this.sqlExecuteInsert(strSQL);
		} catch (SQLException e) {
			throw new Exception(e.getMessage());
		}
	}

	public String getDescription() {
		if (this.description == null) {
			this.description = "";
		}
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getJobHistoryId() {
		if (this.jobHistoryId == null)  {
			this.jobHistoryId = "NULL";
		}
		if (this.jobHistoryId.equalsIgnoreCase(""))  {
			this.jobHistoryId = "NULL";
		}
		return jobHistoryId;
	}

	public void setJobHistoryId(String jobHistoryId) {
		this.jobHistoryId = jobHistoryId;
	}

	public String getStatus() {

		if (status == null) {
			this.status = Interview.STARTED;
		}
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getNote() {
		if (this.note == null) {
			this.note = "";
		}
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getStatusName() {
		String retValue = "";
		if (this.getStatus().equalsIgnoreCase(Interview.STARTED)) {
			retValue = "Interview Started";
		} else if (this.getStatus().equalsIgnoreCase(Interview.COMPLETED)) {
			retValue = "Interview Complete";
		} else if (this.getStatus().equalsIgnoreCase(Interview.HALTED)) {
			retValue = "Interview Halted";
		} else if (this.getStatus().equalsIgnoreCase(Interview.RESUMED)) {
			retValue = "Interview Resumed";
		} else if (this.getStatus().equalsIgnoreCase(Interview.SUSPENDED)) {
			retValue = "Interview Suspended";
		}
		return retValue;
	}

	public String getFrozenJsmId() {

		return frozenJsmId;
	}

	public void setFrozenJsmId(String jsmId) {
		this.frozenJsmId = jsmId;
	}

	public String getJsmName() {
		String jsmName = "";
		return jsmName;
	}

	public void updateStatus(String status) throws Exception {

		String strSQL = "INSERT INTO statusHistory (ChangedTo,interviewID) VALUES ('"
				+ status
				+ "',"
				+ this.getId()
				+ ")";
		try {
			//this.sqlExecuteInsert(strSQL);

			if (status.equalsIgnoreCase("resume")) {
				this.setStatus(Interview.RESUMED);
			} else if (status.equalsIgnoreCase("suspend")) {
				this.setStatus(Interview.SUSPENDED);
			} else if (status.equalsIgnoreCase("complete")) {
				this.setStatus(Interview.COMPLETED);
			} else if (status.equalsIgnoreCase("halt")) {
				this.setStatus(Interview.HALTED);
			}
			strSQL = "UPDATE jsminterview SET status=" + this.getStatus() + " WHERE Id = " + this.getId();
			this.sqlExecuteUpdate(strSQL);
		} catch (SQLException e) {
			throw new Exception(e.getMessage());
		}
	}

	public int getQuestionCountComplete() throws Exception {
		int iCount = 0;
		String strSQL = "SELECT COUNT(DISTINCT interviewjsm_linkedquestionID) AS CompleteQuestionsCount, interviewid"
				+ " FROM  interview_answer"
				+ " GROUP BY interviewid "
				+ " HAVING interviewid = "
				+ this.getId();

		ResultSet rs = null;
		try {
			rs = this.sqlExecuteSelect(strSQL);
			if (rs != null) {
				if (rs.next()) {
					iCount = rs.getInt("CompleteQuestionsCount");
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
		return iCount;
	}
	/* 
    public List<Question> getQuestions() throws Exception {
        List<Question> questions = new ArrayList<Question>();
        String strSQL = "SELECT jsmquestionstructure.id"
                + " FROM  jsminterview INNER JOIN"
                + " frozenjsm ON jsminterview.frozenjsmid = frozenjsm.id INNER JOIN"
                + " jsmquestionstructure ON frozenjsm.id = jsmquestionstructure.jsmid"
                + " WHERE parentid = "
                + Question.ROOTPARENTID
                + " AND jsminterview.id = "
                + this.getId();

        ResultSet rs = null;
        try {
            rs = this.sqlExecuteSelect(strSQL);
            if (rs != null) {
                while (rs.next()) {
                    String id = rs.getString("id");
                    Question q = new Question("", id, this.conn);
                    q.setInterviewID(this.getId());                 
                    questions.add(q);
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
        for(Question q: questions){
        	q.getFullPossibleAnswers(this.conn);
            q.getFullAnswers(this.conn);
        }
        return questions;
    }

    public List<Question> getFullQuestionList() throws Exception {
        List<Question> questions = new ArrayList<Question>();
        String strSQL = "SELECT jsmquestionstructure.id"
                + " FROM  jsminterview INNER JOIN"
                + " frozenjsm ON jsminterview.frozenjsmid = frozenjsm.id INNER JOIN"
                + " jsmquestionstructure ON frozenjsm.id = jsmquestionstructure.jsmid"
                + " WHERE jsminterview.id = "
                + this.getId();

        ResultSet rs = null;
        try {
            rs = this.sqlExecuteSelect(strSQL);
            if (rs != null) {
                while (rs.next()) {
                    String id = rs.getString("id");
                    Question q = new Question("", id, this.conn);
                    q.setInterviewID(this.getId());                 
                    questions.add(q);
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
        for(Question q: questions){
        	q.getFullPossibleAnswers(this.conn);
            q.getFullAnswers(this.conn);
        }
        return questions;
    }
	 */
	public int getQuestionCountInComplete() throws Exception {
		int iCount = 0;
		//        String strSQL = "SELECT answerdescription, jsminterviewid, COUNT(id) AS Incomplete"
		//            + " FROM jsminterviewanswers"
		//            + " GROUP BY answerdescription, jsminterviewid"
		//            + " HAVING (jsminterviewid = "+this.getId()+") AND (answerdescription = 'skipped')";
		String strSQL = "SELECT answerdescription, jsminterviewid"
				+ " FROM jsminterviewanswers"
				+ " WHERE (jsminterviewid = "+this.getId()+") AND (answerdescription = 'skipped') LIMIT 0,1";
		ResultSet rs = null;
		try {
			rs = this.sqlExecuteSelect(strSQL);
			if (rs != null) {
				if (rs.next()) {
					iCount = 1;
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
		return iCount;
	}
	/*
	public List<Question> getAnsweredQuestionsList(String agentId) throws Exception {
		List<Question> retValue = new ArrayList<Question>();
		ResultSet rs = null;
        try {
            String strSQL = "SELECT jsminterviewanswers.jsmquestionstructureid, jsminterviewanswers.jsminterviewid, jsmquestionstructureagent.agentid"
            			+" FROM  jsminterviewanswers INNER JOIN"
            			+" jsmquestionstructureagent ON "
            			+" jsminterviewanswers.jsmquestionstructureid = jsmquestionstructureagent.jsmquestionstructureid"
            			+" WHERE (jsminterviewanswers.jsminterviewid = "+this.getId()+") AND (jsmquestionstructureagent.agentid = "+agentId+") ORDER BY jsminterviewanswers.id";
            rs = this.sqlExecuteSelect(strSQL);
            if (rs != null) {
                while (rs.next()) {
                    String id = rs.getString("jsmquestionstructureid");
                    Question question = new Question("",id,this.conn);
                    retValue.add(question);
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
	 */
	public List<InterviewAnswer> getInterviewAnswers() throws Exception {
		if (this.interviewAnswers == null) {
			List<InterviewAnswer> ias = new ArrayList<InterviewAnswer>();
			String strSQL = "SELECT jsminterviewanswers.id"
					+" FROM  jsminterviewanswers WHERE (jsminterviewanswers.jsminterviewid = "+this.getId()+")";
			ResultSet rs = null;
			try {
				rs = this.sqlExecuteSelect(strSQL);
				if (rs != null) {
					while (rs.next()) {
						InterviewAnswer ia = new InterviewAnswer();
						ia.setId(rs.getString("id"));
						ias.add(ia);
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
			for(InterviewAnswer inta:ias){
				inta.getPersistentObject();
			}
			this.interviewAnswers = ias;
			return this.interviewAnswers;
		}else{
			return this.interviewAnswers;
		}

	}
	public PossibleAnswer getAnswer(String jsmQuestionStructureID) throws Exception {
		PossibleAnswer pa = new PossibleAnswer();
		String answerDescription = "";
		String strSQL = "SELECT answerdescription,possibleanswerid,jsmquestionstructureid" +
				" FROM  jsminterviewanswers" +
				" WHERE (jsminterviewid = "+this.getId()+") AND (jsmquestionstructureid  = "+jsmQuestionStructureID+")";
		ResultSet rs = null;
		try {
			rs = this.sqlExecuteSelect(strSQL);
			if (rs != null) {
				while (rs.next()) {
					answerDescription += rs.getString("answerdescription")+"|";
					pa.setId(rs.getString("possibleanswerid"));
					pa.setJsmQuestionStructureID(rs.getString("jsmquestionstructureid"));
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
		if(answerDescription.contains("|")){
			answerDescription = answerDescription.substring(0,answerDescription.lastIndexOf("|"));
		}
		pa.setDescription(answerDescription);
		return pa;
	}

	public PossibleAnswer getAnswerToFrequencyQuestion(String jsmQuestionStructureID) throws Exception {
		PossibleAnswer pa = new PossibleAnswer();
		String answerDescription = "";
		String strSQL = "SELECT answerdescription,possibleanswerid,jsmquestionstructureid" +
				" FROM  jsminterviewanswers" +
				" WHERE (jsminterviewid = "+this.getId()+") AND (jsmquestionstructureid  = "+jsmQuestionStructureID+")";
		ResultSet rs = null;
		try {
			rs = this.sqlExecuteSelect(strSQL);
			if (rs != null) {
				if (rs.next()) {
					answerDescription += rs.getString("answerdescription");
					pa.setId(rs.getString("possibleanswerid"));
					pa.setJsmQuestionStructureID(rs.getString("jsmquestionstructureid"));
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

		pa.setActualAnswer(answerDescription);
		return pa;
	}
	public Integer skipppedCount() throws Exception {
		Integer retValue = this.getQuestionCountInComplete();
		return retValue;
	}
	public ArrayList<InterviewAnswer> invalidFrequencyAnswers() throws Exception {
		ArrayList<InterviewAnswer> invalidPAs = new ArrayList<InterviewAnswer>();
		JobHistory jh = new JobHistory(	this.getJobHistoryId());		
		for(InterviewAnswer ia: this.getInterviewAnswers()){
			Question q = new Question(ia.getQuestionId());
			if (q.getTypeID().equalsIgnoreCase(Question.FREQUENCY)) {
				if(q.getName().contains("weeks")){			
					Float jhWeeksValue = jh.getWeeksPerYear();
					if((!(ia.getAnswerDescription().equalsIgnoreCase("skipped"))&&(!(ia.getAnswerDescription().equalsIgnoreCase("NULL"))))){
						if(Integer.parseInt(ia.getAnswerDescription())>jhWeeksValue){
							invalidPAs.add(ia);
						}
					}   					
				}else if(q.getName().contains("hours")){
					Float jhHoursValue = jh.getHoursPerWeek();
					if((!(ia.getAnswerDescription().equalsIgnoreCase("skipped"))&&(!(ia.getAnswerDescription().equalsIgnoreCase("NULL"))))){
						if(Integer.parseInt(ia.getAnswerDescription())>jhHoursValue){
							invalidPAs.add(ia);
						}   						
					}
				}
			}
		}
		return invalidPAs;
	}	
	public String getParticipantId() {
		if (this.participantId == null)  {
			this.participantId = "NULL";
		}
		if (this.participantId.equalsIgnoreCase(""))  {
			this.participantId = "NULL";
		}
		return participantId;
	}

	public void setParticipantId(String participantId) {
		this.participantId = participantId;
	}

	public ArrayList<PossibleAnswer> getAnswers(FrozenQA fqa) throws Exception {
		ArrayList<PossibleAnswer> retValue = new ArrayList<PossibleAnswer>();		
		String strSQL = "SELECT answerdescription,possibleanswerid,jsmquestionstructureid" +
				" FROM  jsminterviewanswers" +
				" WHERE (frozenquestionid = "+fqa.getId()+") AND (jsminterviewid = "+this.getId()+") ";
		ResultSet rs = null;
		try {
			rs = this.sqlExecuteSelect(strSQL);
			if (rs != null) {
				while (rs.next()) {
					PossibleAnswer pa = new PossibleAnswer();
					pa.setId(rs.getString("possibleanswerid"));
					pa.setJsmQuestionStructureID(rs.getString("jsmquestionstructureid"));
					pa.setActualAnswer(rs.getString("answerdescription"));
					retValue.add(pa);
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
	public ArrayList<PossibleAnswer> getAnswers(String jsmQuestionStructureID) throws Exception {
		ArrayList<PossibleAnswer> retValue = new ArrayList<PossibleAnswer>();		
		String strSQL = "SELECT answerdescription,possibleanswerid,jsmquestionstructureid" +
				" FROM  jsminterviewanswers" +
				" WHERE (jsminterviewid = "+this.getId()+") AND (jsmquestionstructureid  = "+jsmQuestionStructureID+")";
		ResultSet rs = null;
		try {
			rs = this.sqlExecuteSelect(strSQL);
			if (rs != null) {
				while (rs.next()) {
					PossibleAnswer pa = new PossibleAnswer();
					pa.setId(rs.getString("possibleanswerid"));
					pa.setJsmQuestionStructureID(rs.getString("jsmquestionstructureid"));
					pa.setDescription(rs.getString("answerdescription"));
					retValue.add(pa);
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
	public ArrayList<ExpertRule> findFiredRules(ArrayList<ExpertRule> rules) throws Exception {
		ArrayList<ExpertRule> firedRules = new ArrayList<ExpertRule>();
		for(ExpertRule er: rules){
			boolean allFactsTrue = false;
			for(ExpertFact ef: er.getFacts()){ //this is the *and* case
				boolean thisFactTrue = false;
				boolean allRequirementsTrue = false;
				if(ef.isJobHistoryFact()){

					if(this.hasRequirementJH(ef)){
						allRequirementsTrue = true;  //make this fact true
					}
				}else{
					for(ExpertFactRequirement efr: ef.getFactRequirements()){	//this is the *or* case				
						if(this.hasRequirement(efr)){
							allRequirementsTrue = true;  //if at least one true
						}
					}
				}
				if(allRequirementsTrue){
					thisFactTrue = true;
				}
				if(!(thisFactTrue)){
					allFactsTrue = false;
					break;
				}else{
					allFactsTrue = true;
				}
			}
			if(allFactsTrue){
				firedRules.add(er);
			}
		}
		this.setFiredRules(firedRules);
		return firedRules;
	}
	public ArrayList<ExpertRule> findFiredRulesByRootQuestion(ArrayList<ExpertRule> rules, Question rootQuestion) throws Exception {
		ArrayList<ExpertRule> firedRules = new ArrayList<ExpertRule>();
		for(ExpertRule er: rules){
			boolean allFactsTrue = false;
			for(ExpertFact ef: er.getFacts()){ //this is the *and* case
				boolean thisFactTrue = false;
				boolean allRequirementsTrue = false;
				if(ef.isJobHistoryFact()){
					if(this.hasRequirementJH(ef)){
						allRequirementsTrue = true;  //make this fact true
					}
				}else{
					for(ExpertFactRequirement efr: ef.getFactRequirements()){	//this is the *or* case				
						if(this.hasRequirementWithinThisRootQuestion(efr, rootQuestion)){
							allRequirementsTrue = true;  //if at least one true
						}
					}
				}
				if(allRequirementsTrue){
					thisFactTrue = true;
				}
				if(!(thisFactTrue)){
					allFactsTrue = false;
					break;
				}else{
					allFactsTrue = true;
				}
			}
			if(allFactsTrue){
				firedRules.add(er);
			}
		}
		this.setFiredRules(firedRules);
		return firedRules;
	}
	private boolean hasRequirementJH(ExpertFact ef) throws Exception {
		boolean retValue = false;
		String att = ef.getAttribute();
		String condop = ef.getConditionOperator();
		String val = ef.getValue();
		String strSQL = "SELECT id FROM jobhistory WHERE id="+this.getJobHistoryId()+" AND "+att+" "+condop+" "+val;
		ResultSet rs = null;
		try {
			rs = this.sqlExecuteSelect(strSQL);
			if (rs != null) {
				if (rs.next()) {
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
			this.closeConnection();
		}
		return retValue;
	}
	private boolean hasRequirement(ExpertFactRequirement efr) throws Exception {
		boolean retValue = false;
		Question q = new Question(efr.getQuestionId());
		PossibleAnswer pa = new PossibleAnswer(efr.getAnswerId());
		String strSQL = "SELECT id FROM jsminterviewanswers WHERE jsminterviewid="+this.getId()+" AND questionid = "+q.getId()+" AND possibleanswerid = "+pa.getId();
		ResultSet rs = null;
		try {
			rs = this.sqlExecuteSelect(strSQL);
			if (rs != null) {
				if (rs.next()) {
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
			this.closeConnection();
		}
		return retValue;
	}
	private boolean hasRequirementWithinThisRootQuestion(ExpertFactRequirement efr, Question rootQuestion) throws Exception {
		boolean retValue = false;
		Question q = new Question(efr.getQuestionId());
		PossibleAnswer pa = new PossibleAnswer(efr.getAnswerId());
		String strSQL = "SELECT * FROM jsminterviewanswers WHERE jsminterviewid="+this.getId()+" AND questionid = "+q.getId()+" AND possibleanswerid = "+pa.getId();
		ResultSet rs = null;
		String jsmQuestionStructureId = "";

		try {
			rs = this.sqlExecuteSelect(strSQL);
			if (rs != null) {
				while (rs.next()) {
					//Get the structure  id for the question
					jsmQuestionStructureId = rs.getString("jsmquestionstructureid");
				}
			}
		} catch (SQLException e) {
			throw new Exception(e.getMessage());
		} finally {
			this.closeConnection();
		}
		if (jsmQuestionStructureId != "") {
			q.setJsmStructureQuestionID(jsmQuestionStructureId);
			q.getPersistentStructureObject();
			//If the root question of our question is the one we want..
			if (JsmQuestionStructure.getRootQuestion(q).getId().equals(rootQuestion.getId())) {
				retValue = true;
			}
		}
		return retValue;
	}
	public ArrayList<ExpertRule> getFiredRules(RuleOutcome possibleunknown) {
		ArrayList<ExpertRule> rules = new ArrayList<ExpertRule>();
		for(ExpertRule er: this.getFiredRules()){
			if(er.getOutCome() == possibleunknown){
				rules.add(er);
			}
		}		
		return rules;
	}
	public ArrayList<ExpertRule> getFiredRules() {
		if(firedRules==null){
			firedRules = new ArrayList<ExpertRule>();
		}
		return firedRules;
	}
	public void setFiredRules(ArrayList<ExpertRule> firedRules) {
		this.firedRules = firedRules;
	}
	public ArrayList<ExpertRule> getHigestFiredRules() {
		ArrayList<ExpertRule> retValue = new ArrayList<ExpertRule>();
		if(this.getFiredRules(ExpertRule.RuleOutcome.POSSIBLEUNKNOWN).size()>0){
			retValue = this.getFiredRules(ExpertRule.RuleOutcome.POSSIBLEUNKNOWN);
		}
		if(this.getFiredRules(ExpertRule.RuleOutcome.PROBABLEUNKNOWN).size()>0){
			retValue = this.getFiredRules(ExpertRule.RuleOutcome.PROBABLEUNKNOWN);
		}
		if(this.getFiredRules(ExpertRule.RuleOutcome.PROBABLELOW).size()>0){
			retValue = this.getFiredRules(ExpertRule.RuleOutcome.PROBABLELOW);
		}
		if(this.getFiredRules(ExpertRule.RuleOutcome.PROBABLEMEDIUM).size()>0){
			retValue = this.getFiredRules(ExpertRule.RuleOutcome.PROBABLEMEDIUM);
		}
		if(this.getFiredRules(ExpertRule.RuleOutcome.PROBABLEHIGH).size()>0){
			retValue = this.getFiredRules(ExpertRule.RuleOutcome.PROBABLEHIGH);
		}
		return retValue;
	}
	public ArrayList<ExpertRule> getHigestFiredRulesByRootQuestion(ArrayList<ExpertRule> firedRules) {
		this.setFiredRules(firedRules);
		ArrayList<ExpertRule> retValue = new ArrayList<ExpertRule>();
		if(this.getFiredRules(ExpertRule.RuleOutcome.POSSIBLEUNKNOWN).size()>0){
			retValue = this.getFiredRules(ExpertRule.RuleOutcome.POSSIBLEUNKNOWN);
		}
		if(this.getFiredRules(ExpertRule.RuleOutcome.PROBABLEUNKNOWN).size()>0){
			retValue = this.getFiredRules(ExpertRule.RuleOutcome.PROBABLEUNKNOWN);
		}
		if(this.getFiredRules(ExpertRule.RuleOutcome.PROBABLELOW).size()>0){
			retValue = this.getFiredRules(ExpertRule.RuleOutcome.PROBABLELOW);
		}
		if(this.getFiredRules(ExpertRule.RuleOutcome.PROBABLEMEDIUM).size()>0){
			retValue = this.getFiredRules(ExpertRule.RuleOutcome.PROBABLEMEDIUM);
		}
		if(this.getFiredRules(ExpertRule.RuleOutcome.PROBABLEHIGH).size()>0){
			retValue = this.getFiredRules(ExpertRule.RuleOutcome.PROBABLEHIGH);
		}
		return retValue;
	}
	public String getJobHistoryReferenceNumber() {
		return jobHistoryReferenceNumber;
	}
	public void setJobHistoryReferenceNumber(String jobHistoryReferenceNumber) {
		this.jobHistoryReferenceNumber = jobHistoryReferenceNumber;
	}
	public String getParticipantReferenceNumber() {
		return participantReferenceNumber;
	}
	public void setParticipantReferenceNumber(String participantReferenceNumber) {
		this.participantReferenceNumber = participantReferenceNumber;
	}
	public String getAmrRefId() {
		return amrRefId;
	}
	public void setAmrRefId(String amrRefId) {
		this.amrRefId = amrRefId;
	}
}

