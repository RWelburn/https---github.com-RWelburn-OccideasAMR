/*
 * Revisions:
 *     $Log: Question.java,v $
 *     Revision 1.86  2008/12/14 22:35:23  troy.sadkowsky
 *     removed redundant code, new admin keyphrase function
 *
 *     Revision 1.85  2008/11/25 23:29:06  troy.sadkowsky
 *     speed enhancements
 *
 *     Revision 1.84  2008/11/03 10:55:31  ray.welburn
 *     Allow reuse of unused key phrases
 *
 *     Revision 1.83  2008/10/22 01:25:19  troy.sadkowsky
 *     updates for excel report
 *
 *     Revision 1.82  2008/10/20 00:37:50  troy.sadkowsky
 *     to excel show rules
 *
 *     Revision 1.81  2008/09/03 07:35:24  troy.sadkowsky
 *     tidy code and ensure connections close
 *
 *     Revision 1.80  2008/09/02 23:30:44  Troy.Sadkowsky
 *     removed old code and enhanced jsm exporter
 *
 *     Revision 1.79  2008/08/25 01:37:19  ray.welburn
 *     Updates to use single dbobject and participant status table
 *
 *     Revision 1.78  2008/08/11 01:50:49  ray.welburn
 *     move study object to common package
 *
 *     Revision 1.77  2008/08/02 06:16:56  troy.sadkowsky
 *     removed jess and reworked rules and ajsms
 *
 *     Revision 1.76  2008/07/23 00:14:40  troy.sadkowsky
 *     flat file frozen jsm
 *
 *     Revision 1.75  2008/07/22 06:54:44  ray.welburn
 *     integration changes for new interface
 *
 *     Revision 1.74  2008/07/18 06:06:02  troy.sadkowsky
 *     new flat frozen jsm
 *
 *     Revision 1.73  2008/06/29 23:22:06  troy.sadkowsky
 *     enhanced export function
 *
 *     Revision 1.72  2008/06/11 00:37:24  troy.sadkowsky
 *     refactor insert and updates
 *
 *     Revision 1.71  2008/05/26 08:21:58  troy.sadkowsky
 *     Removed old code
 *
 *     Revision 1.70  2008/05/25 23:48:04  ray.welburn
 *     Add paging and user search for studies user management
 *
 *     Revision 1.69  2008/05/10 07:40:22  troy.sadkowsky
 *     updates for export JSMs
 *
 *     Revision 1.68  2008/04/22 23:21:24  troy.sadkowsky
 *     new assessment requirements
 *
 *     Revision 1.67  2008/04/22 10:29:09  ray.welburn
 *     Changes to copying and pasting q's and a's
 *
 *     Revision 1.66  2008/04/15 22:58:00  troy.sadkowsky
 *     melb updates
 *
 *     Revision 1.65  2008/03/17 03:28:46  troy.sadkowsky
 *     fix to show questions associated by agents through aJSMs
 *
 *     Revision 1.64  2008/03/01 04:25:17  troy.sadkowsky
 *     no crossed facts
 *
 *     Revision 1.63  2008/02/25 04:21:49  troy.sadkowsky
 *     new export function
 *
 *     Revision 1.62  2008/02/15 08:49:21  troy.sadkowsky
 *     copy jsms function
 *
 *     Revision 1.61  2008/02/12 15:03:00  troy.sadkowsky
 *     shared questions and answers
 *
 *     Revision 1.60  2008/01/24 03:59:08  troy.sadkowsky
 *     review interveiw
 *
 *     Revision 1.59  2008/01/21 23:01:25  Troy.Sadkowsky
 *     new export function
 *
 *     Revision 1.58  2008/01/21 14:01:52  troy.sadkowsky
 *     bug fix for updated keyphrase
 *
 *     Revision 1.57  2008/01/15 12:14:45  troy.sadkowsky
 *     speed up rule view
 *
 *     Revision 1.56  2008/01/11 04:04:10  troy.sadkowsky
 *     show with parent
 *
 *     Revision 1.55  2007/12/17 10:55:17  troy.sadkowsky
 *     bug fix for cyclic questionnaire
 *
 *     Revision 1.54  2007/12/16 22:47:52  troy.sadkowsky
 *     fix for notes and dates
 *
 *     Revision 1.53  2007/12/11 14:08:03  troy.sadkowsky
 *     new view with parent option at interview
 *
 *     Revision 1.52  2007/12/04 01:42:00  troy.sadkowsky
 *     removed old code
 *
 *     Revision 1.51  2007/11/18 02:25:36  troy.sadkowsky
 *     bug fix for interview and new search participant function
 *
 *     Revision 1.50  2007/11/02 01:38:07  troy.sadkowsky
 *     searches and showing participant lists
 *
 *     Revision 1.49  2007/10/25 23:57:58  troy.sadkowsky
 *     removed old code and removed share conn on updates and selects
 *
 *     Revision 1.48  2007/10/18 23:10:13  troy.sadkowsky
 *     new import functions
 *
 *     Revision 1.47  2007/10/09 07:21:05  troy.sadkowsky
 *     auto create study specific jsms
 *
 *     Revision 1.46  2007/09/26 01:45:57  ray.welburn
 *     changing the name of an aJSM now changes the name globally
 *
 *     Revision 1.45  2007/09/03 00:39:33  troy.sadkowsky
 *     updates for aug 24th meeting
 *
 *     Revision 1.44  2007/08/19 03:40:56  troy.sadkowsky
 *     check if roles exists and an ismysql function
 *
 *     Revision 1.43  2007/08/16 23:43:57  ray.welburn
 *     Added flag for if chid answers should be shown
 *
 *     Revision 1.42  2007/07/28 01:32:48  troy.sadkowsky
 *     agent description updates and clean mql
 *
 *     Revision 1.41  2007/07/27 05:43:27  Troy.Sadkowsky
 *     bugfix 284
 *
 *     Revision 1.40  2007/07/08 23:21:29  Jeff.Keys
 *     ordered jsm searches
 *
 *     Revision 1.39  2007/06/29 04:47:54  troy.sadkowsky
 *     mysql updates
 *
 *     Revision 1.38  2007/06/17 03:46:58  Jeff.Keys
 *     questionnaire searches -agents
 *
 *     Revision 1.37  2007/06/12 05:17:42  Troy.Sadkowsky
 *     restructured and enhancements of rules
 *
 *     Revision 1.36  2007/06/09 01:30:04  Jeff.Keys
 *     Include jsm.userid in jsm searches
 *     SQL clean up
 *
 *     Revision 1.35  2007/06/03 23:19:47  Troy.Sadkowsky
 *     build 1.30 updates
 *
 *     Revision 1.34  2007/06/03 02:48:16  Jeff.Keys
 *     JSM search
 *
 *     Revision 1.33  2007/05/30 00:58:29  Troy.Sadkowsky
 *     my JSMs will only show those that the current logged in user has created
 *
 *     Revision 1.32  2007/05/22 11:19:00  Troy.Sadkowsky
 *     study options
 *
 *     Revision 1.31  2007/05/20 22:05:04  Troy.Sadkowsky
 *     keep correct order of questions in edit mode
 *
 *     Revision 1.30  2007/05/12 14:10:18  jeff.keys
 *     Q->Structure->Search on keyphrase/Clear search
 *
 *     Revision 1.29  2007/05/03 13:52:48  Troy.Sadkowsky
 *     dynamic rule creation
 *
 *     Revision 1.28  2007/04/25 21:56:22  Troy.Sadkowsky
 *     made dbobject sortable and removed old objects and functions
 *
 *     Revision 1.27  2007/03/21 13:46:07  Troy.Sadkowsky
 *     bug fix on copy template, datetime field, new add permission code, print view
 *
 *     Revision 1.26  2007/03/20 07:33:51  Troy.Sadkowsky
 *     attempt to fix bug 88
 *
 *     Revision 1.25  2007/03/11 11:12:35  troy.sadkowsky
 *     changed method of add and edit studies to not use popups
 *
 *     Revision 1.24  2007/02/18 11:07:16  troy
 *     new dynamic rule creation
 *
 *     
*/
package com.researchit;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;

import com.researchit.common.DBBaseObject;
import com.researchit.common.Study;

public class Question extends DBBaseObject implements Comparable<Question> {

	private Integer count;	
	//private Integer indentLevel;	
	//private Integer displayOrder;	
	private String jsmID = "";	
	private String ajsmId = "";
	private String sequence = "";
	private ArrayList<PossibleAnswer> possibleAnswers;
	private ArrayList<PossibleAnswer> answers;
	private ArrayList<Agent> agents;
	private String parentID = "";
	private String interviewID = "";
	private String jsmStructureQuestionID = "";
	//private String frozenQuestionID = "";
	//private String frozenJSMID = "";
	private String warning = "";
	private boolean multiple;
	private boolean minimised;
	private String notes = "";
	private String typeID = "";	
	private String oldQuestionID = "";
	private String jsmName = "";		
	private String errorMessage = "";	
	private boolean viewWithParent;
	private FrozenQA frozenQuestion;

	static public final String ASSOCIATEJSMLINK = "4";
	public static final String ROOTPARENTID = "100";
	public static final String PROBABILITY = "1";
	public static final String LEVEL = "2";
	public static final String FREQUENCY = "3";

	public String getNotes() {
		if (this.notes == null) {
			this.notes = "NULL";
		}else if(this.notes.equalsIgnoreCase("")){
			this.notes = "NULL";
		}
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public boolean isMultiple() {
		return multiple;
	}
	public String getMultiple() {
		String retValue = "";
		if (this.isMultiple()) {
			retValue = "1";
		} else {
			retValue = "0";
		}
		return retValue;
	}
	public String getViewWithParent() {
		String retValue = "";
		if (this.isViewWithParent()) {
			retValue = "1";
		} else {
			retValue = "0";
		}
		return retValue;
	}
	public void setMultiple(boolean multiple) {
		this.multiple = multiple;
	}
	public String getWarning() {
		return warning;
	}
	public void setWarning(String warning) {
		this.warning = warning;
	}
	public String getJsmQuestionStructureID() {
		return jsmStructureQuestionID;
	}
	public void setJsmStructureQuestionID(String linkedQuestionID) {
		this.jsmStructureQuestionID = linkedQuestionID;
	}
	public String getParentID() {
		if (this.parentID == null) {
			this.parentID = "";
		}
		return parentID;
	}
	public void setParentID(String parentID) {
		this.parentID = parentID;
	}
	public void moveUp() throws Exception {
		this.resetSequences();
		if (!(this.getSequence().equalsIgnoreCase("0"))) {
			int iCurrentSeq = Integer.valueOf(this.getSequence()).intValue();
			int iSeq = iCurrentSeq - 1;
			ArrayList qs = new ArrayList();
			if (this.getParentID().equalsIgnoreCase(Question.ROOTPARENTID)) {
				JobSpecificModule jsm = new JobSpecificModule(this.getJsmID());
				qs = jsm.getQuestions();
			} else {
				PossibleAnswer parentPA = new PossibleAnswer("", this
						.getParentID());
				qs = parentPA.getChildQuestions();
			}
			// set this sequence down to move up in list
			this.setSequence(String.valueOf(iSeq));
			this.updateSequence();
			// set the sequence of the one below to this q's old sequence
			Question q = (Question) qs.get(iSeq);
			q.setSequence(iCurrentSeq);
			q.updateSequence();
		} else {
			if (!(this.getParentID().equalsIgnoreCase(Question.ROOTPARENTID))) {
				Question parentQ = new Question("", this.getParentQuestionID());
				if (parentQ.getParentID().equalsIgnoreCase(
						Question.ROOTPARENTID)) {
					this.setParentID(Question.ROOTPARENTID);
					this.setSequence(parentQ.getSequence());
					this.linkToJSM(parentQ.getJsmID());
				} else {
					PossibleAnswer pa = new PossibleAnswer("", parentQ
							.getParentID());
					this.linkToPossibleAnswer(pa.getId(), pa
							.getJsmQuestionPossibleAnswerStructureID());
				}
				this.setWarning("Please validate rules are still correct");
			}
		}
	}
	public void moveDown() throws Exception {
		this.resetSequences();
		int iCurrentSeq = Integer.valueOf(this.getSequence()).intValue();
		// get current size
		ArrayList qs = new ArrayList();
		if (this.getParentID().equalsIgnoreCase(Question.ROOTPARENTID)) {
			JobSpecificModule jsm = new JobSpecificModule(this.getJsmID());
			qs = jsm.getQuestions();
		} else {
			PossibleAnswer parentPA = new PossibleAnswer("", this.getParentID());
			qs = parentPA.getChildQuestions();
		}
		int iSize = qs.size() - 1;
		if (iCurrentSeq != iSize) {
			// set this sequence down to move up in list
			int iSeq = iCurrentSeq + 1;
			this.setSequence(String.valueOf(iSeq));
			this.updateSequence();
			// set the sequence of the one below to this pa's old sequence
			Question q = (Question) qs.get(iSeq);
			q.setSequence(iCurrentSeq);
			q.updateSequence();
		}
	}
	public void updateSequence() throws Exception {
		if (this.getJsmQuestionStructureID().equalsIgnoreCase("")) {
			throw new Exception("Cannot update sequence of unlinked question");
		}
		try {
			String strSQL = "UPDATE jsmquestionstructure SET sequence = "
					+ this.getSequence() + " WHERE id = "
					+ this.getJsmQuestionStructureID();
			this.sqlExecuteUpdate(strSQL);
		} catch (SQLException e) {
			throw new Exception(e.getMessage());
		}
	}
	public boolean isRootQ() {
		boolean bRetValue = false;
		if (this.getParentID().equalsIgnoreCase(Question.ROOTPARENTID)) {
			bRetValue = true;
		}
		return bRetValue;
	}
	public Question() {
		super();
	}	
	public Question(String dbID) throws Exception {
		super();
		this.setId(dbID);
		this.getPersistentObject();
	}
	public Question(String questionId, String linkedQId) throws Exception {
		super();
		this.setId(questionId);
		this.setJsmStructureQuestionID(linkedQId);
		this.getPersistentStructureObject();
	}
	public void update() throws Exception{
		if(!(this.getId().equalsIgnoreCase(""))){
			String strSQL = "UPDATE question SET name='"
				+ this.escapeSpecialCharacters(this.getName()) + "',description='"
				+ this.escapeSpecialCharacters(this.getName()) + "', questiontypeid="+this.getTypeID()+" WHERE id = "
				+ this.getId();
			this.sqlExecuteUpdate(strSQL);
			if (!(this.getJsmQuestionStructureID().equalsIgnoreCase(""))) {
				//Update the jsmquestionstructure table
				strSQL = "UPDATE jsmquestionstructure SET Description='"
					+ this.escapeSpecialCharacters(this.getDescription())
					+ "',questionid="+this.getId()+", notes='" + this.getNotes()
					+ "', ismultiple=" + this.getMultiple()
					+ ", viewwithparent=" + this.getViewWithParent()
					+ ", ajsmid=" + this.getAjsmId()
					+ " WHERE id = " + this.getJsmQuestionStructureID()+";";
				this.sqlExecuteUpdate(strSQL); 
			}else{
				throw new Exception("Cannot update unlinked question");
			}
		}else{
			throw new Exception("Cannot update non existing question");
		}
	}
	/*
	public void insert1() throws Exception{
		if ((this.getDescription().contains("["))
				|| (this.getDescription().contains("]"))) {
			throw new Exception("Problem with Question: "
					+ this.getDescription()+" Please remove special characters");
		}
		String strSQL = "INSERT INTO question (name,description,questiontypeid) VALUES('"
				+ this.escapeSpecialCharacters(this.getName()) + "','"
				+ this.escapeSpecialCharacters(this.getName()) + "',"
				+ this.getTypeID() + ")";
		this.setId(String.valueOf(this.sqlExecuteInsert(strSQL)));	
	}
	
	public void update() throws Exception {
//		Update the question table
		String strSQL = "UPDATE question SET name='"
			+ this.getName().replaceAll("'", "''") + "', questiontypeid="+this.getTypeID()+" WHERE id = "
			+ this.getId();
		this.sqlExecuteUpdate(strSQL);
		//if this question/AJSM has been used
		if (!(this.getJsmQuestionStructureID().equalsIgnoreCase(""))) {


			//Update the jsmquestionstructure table
			strSQL = "UPDATE jsmquestionstructure SET Description='"
				+ this.getDescription().replaceAll("'", "''")
				+ "',questionid="+this.getId()+", notes='" + this.getNotes()
				+ "', ismultiple=" + this.getMultiple()
				+ ", viewwithparent=" + this.getViewWithParent()
				+ " WHERE id = " + this.getJsmQuestionStructureID()+";";
			this.sqlExecuteUpdate(strSQL); 
		}else {
			if (this.getName().toString().contains("JSM:")){
				//Update the jsmquestionstructure table
				strSQL = "UPDATE jsmquestionstructure SET name='"
					+ this.getName().replaceAll("'", "''")
					+ "',Description='"
					+ this.getDescription().replaceAll("'", "''")
					+ "' WHERE questionid = " + this.getId()+";";
				this.sqlExecuteUpdate(strSQL); 
			}
		}
	}
	
	public void update(boolean bInsertNew) throws Exception {
		if (this.getDescription().equalsIgnoreCase("")) {
			throw new Exception("Cannot have a question with no description");
		}
		if (!(this.exists())) {
			if (bInsertNew) {
				this.insert();
			} else {
				throw new Exception("Cannot update non existing question");
			}
		} else {
			//Update the question table
			String strSQL = "UPDATE question SET name='"
				+ this.getName().replaceAll("'", "''") + "', questiontypeid="+this.getTypeID()+" WHERE id = "
				+ this.getId();
			this.sqlExecuteUpdate(strSQL);
			//if this question/AJSM has been used
			if (!(this.getJsmQuestionStructureID().equalsIgnoreCase(""))) {


				//Update the jsmquestionstructure table
				strSQL = "UPDATE jsmquestionstructure SET Description='"
					+ this.getDescription().replaceAll("'", "''")
					+ "',questionid="+this.getId()+", notes='" + this.getNotes()
					+ "', ismultiple=" + this.getMultiple()
					+ ", viewwithparent=" + this.getViewWithParent()
					+ " WHERE id = " + this.getJsmQuestionStructureID()+";";
				this.sqlExecuteUpdate(strSQL); 
			}else {
				if (this.getName().toString().contains("JSM:")){
					//Update the jsmquestionstructure table
					strSQL = "UPDATE jsmquestionstructure SET name='"
						+ this.getName().replaceAll("'", "''")
						+ "',Description='"
						+ this.getDescription().replaceAll("'", "''")
						+ "' WHERE questionid = " + this.getId()+";";
					this.sqlExecuteUpdate(strSQL); 
				}
			}
		}
	}
	*/
	public void addAgent(Agent agent) throws Exception {		
		if (this.agents == null) {
			this.agents = new ArrayList<Agent>();	
			this.insertAgent(agent);
		}else{
			if(!(this.getAgents().contains(agent))){
				this.insertAgent(agent);	
			}
		}
		this.agents.add(agent);
	}
	public void insertAgent(Agent agent) throws Exception {
		String strSQL = "INSERT INTO jsmquestionstructureagent (agentid,jsmquestionstructureid) VALUES("
			+ agent.getId() + "," + this.getJsmQuestionStructureID() + ")";
		agent.setQuestionAgentID(String.valueOf(this.sqlExecuteInsert(strSQL)));
	}
	public void insertAgentExport(Agent agent,Connection conn) throws Exception {
		String strSQL = "INSERT INTO jsmquestionstructureagent (agentid,jsmquestionstructureid) VALUES("
			+ agent.getId() + "," + this.getJsmQuestionStructureID() + ")";
		agent.setQuestionAgentID(String.valueOf(this.sqlExecuteInsert(strSQL,conn)));
	}
	public void removeAgent(Agent agent) throws Exception {
		String strSQL = "DELETE FROM jsmquestionstructureagent WHERE agentid = "
				+ agent.getId() + " AND jsmquestionstructureid = "+this.getJsmQuestionStructureID();
		try {
			this.sqlExecuteInsert(strSQL);
		} catch (SQLException e) {
			throw new Exception(e.getMessage());
		}
	}
	public void removeAllAgents() throws Exception {
		ArrayList agents = this.getAgents();
		for (Iterator it = agents.iterator(); it.hasNext();) {
			Agent agent = (Agent) it.next();
			this.removeAgent(agent);
		}
		this.agents = new ArrayList<Agent>();
	}
	public void insert() throws Exception {
		this.export(null);
	}
	public void export(Connection conn) throws Exception {
		if ((this.getDescription().contains("["))
				|| (this.getDescription().contains("]"))) {
			throw new Exception("Problem with Question: "
					+ this.getDescription());
		}
		String strSQL = "INSERT INTO question (name,description,questiontypeid) VALUES('"
				+ this.escapeSpecialCharacters(this.getName()) + "','"
				+ this.escapeSpecialCharacters(this.getName()) + "',"
				+ this.getTypeID() + ")";
		try {
			this.setId(String.valueOf(this.sqlExecuteInsert(strSQL,conn)));
		} catch (SQLException e) {
			throw new Exception(e.getMessage());
		}
	}
	public boolean exists() throws Exception {		
		return this.existsAt(null);
	}	
	public boolean existsAt(Connection conn) throws Exception {
		boolean bRetValue = false;
		if (!(this.getId().equalsIgnoreCase(""))) {
			bRetValue = true;
		} else {
			String strSQL = "SELECT id, name FROM question WHERE name = '"
					+ this.escapeSpecialCharacters(this.getName()) + "'";
			ResultSet rs = null;
			try {
				rs = this.sqlExecuteSelect(strSQL,conn);
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
		}
		return bRetValue;
	}
	public boolean isNameInUse() throws Exception {
		boolean bRetValue = false;		
		String strSQL = "SELECT q.id, q.name FROM question q, jsmquestionstructure WHERE q.id = questionid AND q.name = '"
				+ this.escapeSpecialCharacters(this.getName()) + "'";
		ResultSet rs = null;
		try {
			rs = this.sqlExecuteSelect(strSQL);
			if (rs != null) {
				if (rs.next()) {
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
		String strSQL = "";
		try {
			strSQL = "DELETE FROM question WHERE id = " + this.getId();
			this.sqlExecuteUpdate(strSQL);
		} catch (SQLException e) {
			throw new Exception(e.getMessage());
		}
	}	
	public Question getQuestion(String qName) throws Exception {
		Question q = new Question();
		String SQL = "SELECT * FROM question WHERE name LIKE \'%" + qName + "\'";
		ResultSet rs = this.sqlExecuteSelect(SQL);
		if (rs != null){
			if (rs.next()) {
				q.setId(rs.getString("id"));
				q.setName(rs.getString("name"));
				q.setDescription(rs.getString("description"));
				q.setTypeID(rs.getString("questiontypeid"));
			}
			
			if (rs.getStatement() != null) {
				rs.getStatement().close();
			}
			rs.close();
		}
		return q;
	}
	private void getPersistentObject() throws Exception {
		String strSQL = "SELECT id,name,description,questiontypeid FROM question WHERE id = "
				+ this.getId();
		ResultSet rs = null;
		try {
			rs = this.sqlExecuteSelect(strSQL);
			if (rs != null) {
				if (rs.next()) {
					this.setId(rs.getString("id"));
					this.setName(rs.getString("name"));
					this.setDescription(rs.getString("description"));
					this.setTypeID(rs.getString("questiontypeid"));
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
	public void getPersistentStructureObject() throws Exception {
		String strSQL = "SELECT jsmqs.id, questionid, sequence, parentid, jsmid, q.id AS qid,"
				+ " notes, ismultiple, viewwithparent, jsmqs.description, oldquestionid, q.name, questiontypeid, ajsmid "
				+ " FROM jsmquestionstructure jsmqs INNER JOIN"
				+ " question q ON questionid = q.id "
				+ " WHERE jsmqs.id = "
				+ this.getJsmQuestionStructureID();
		ResultSet rs = null;
		try {
			rs = this.sqlExecuteSelect(strSQL);
			if (rs != null) {
				if (rs.next()) {
					String sequence = rs.getString("sequence");
					String jsmid = rs.getString("jsmid");
					String parentId = rs.getString("parentid");
					this.setId(rs.getString("questionid"));
					String strIsMultiple = rs.getString("ismultiple");
					if ("1".equalsIgnoreCase(strIsMultiple)) {
						this.setMultiple(true);
					} else {
						this.setMultiple(false);
					}
					String strViewWithParent = rs.getString("viewwithparent");
					if ("1".equalsIgnoreCase(strViewWithParent)) {
						this.setViewWithParent(true);
					} else {
						this.setViewWithParent(false);
					}
					this.setNotes(rs.getString("notes"));
                    this.setName(rs.getString("name"));
                    this.setTypeID(rs.getString("questiontypeid"));
					this.setDescription(rs.getString("description"));
					this.setOldQuestionID(rs.getString("oldquestionid"));
					this.setAjsmId(rs.getString("ajsmid"));
					this.setSequence(sequence);
					this.setJsmID(jsmid);
					this.setParentID(parentId);
					this.setId(rs.getString("qid"));
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
	private void getPersistentPossibleAnswers() throws Exception {
		String strSQL = "";
		ResultSet rs = null;
		strSQL = "SELECT jqpa.id, jqpa.possibleanswerid, jqpa.sequence"
				+ " FROM jsmquestionstructure jq INNER JOIN"
				+ " jsmquestionpossibleanswerstructure jqpa ON jq.id = jqpa.jsmquestionstructureid"
				+ " WHERE     (jq.id = "
				+ this.getJsmQuestionStructureID()
				+ ") ORDER BY jqpa.sequence";
		rs = this.sqlExecuteSelect(strSQL);
		if (rs != null) {
			this.possibleAnswers = new ArrayList<PossibleAnswer>();
			while (rs.next()) {
				String paid = rs.getString("possibleanswerid");
				String jqpaid = rs.getString("id");
				String strSeq = rs.getString("sequence");
				PossibleAnswer answer = new PossibleAnswer();
				answer.setId(paid);
				answer.setJsmQuestionPossibleAnswerStructureID(jqpaid);
				answer.setSequence(strSeq);
				possibleAnswers.add(answer);
			}
			if (rs.getStatement() != null) {
				rs.getStatement().close();
			}
			rs.close();
		}
		this.closeConnection();
		//persist
		for(PossibleAnswer pa:this.possibleAnswers){
			pa.getPersistentLinkedObject();
		}
	}	
	private void getPersistentAllPossibleAnswers()	throws Exception {
		this.connect();
		String strSQL = "";
		ResultSet rs = null;
		strSQL = " SELECT DISTINCT possibleanswer.id, jsmquestionstructure.questionid"
			+ " FROM possibleanswer INNER JOIN"
			+ " jsmquestionpossibleanswerstructure ON possibleanswer.id = jsmquestionpossibleanswerstructure.possibleanswerid INNER JOIN"
			+ " jsmquestionstructure ON jsmquestionpossibleanswerstructure.jsmquestionstructureid = jsmquestionstructure.id"
			+ " WHERE (jsmquestionstructure.questionid = "+this.getId()+")";
		rs = this.sqlExecuteSelect(strSQL);
		if (rs != null) {
			this.possibleAnswers = new ArrayList<PossibleAnswer>();
			while (rs.next()) {
				String id = rs.getString("id");
				PossibleAnswer answer = new PossibleAnswer();
				answer.setId(id);
				possibleAnswers.add(answer);
			}
			if (rs.getStatement() != null) {
				rs.getStatement().close();
			}
			rs.close();
		}
		this.closeConnection();
		for(PossibleAnswer pa:this.possibleAnswers){
			pa.getPersistentObject();
		}
	}
	public ArrayList<PossibleAnswer> getPossibleAnswers() throws Exception {
		if (this.possibleAnswers == null) {
			if ((this.getJsmQuestionStructureID() != null)
					&& (!(this.getJsmQuestionStructureID().equalsIgnoreCase("")))) {
				this.getPersistentPossibleAnswers();
			}else{
				possibleAnswers = new ArrayList<PossibleAnswer>();
			}
		}
		return possibleAnswers;
	}
	public void setPossibleAnswers(ArrayList<PossibleAnswer> answers) {
		this.possibleAnswers = answers;
	}
	public String getJsmID() {
		return jsmID;
	}
	public void setJsmID(String jsmID) {
		this.jsmID = jsmID;
	}
	public String getSequence() {
		if (this.sequence.equalsIgnoreCase("")) {
			this.sequence = "0";
		}
		return sequence;
	}
	public void setSequence(String sequence) {
		this.sequence = sequence;
	}
	public void setSequence(int i) {
		String strSeq = String.valueOf(i);
		this.sequence = strSeq;

	}
	public void linkToJSM(String jsmid) throws Exception {
		if (jsmid.equalsIgnoreCase("")) {
			throw new Exception("Cannot link non existing jsm");
		}
		try {
			String strSQL = "";
			if (this.getJsmQuestionStructureID().equalsIgnoreCase("")) {
				JobSpecificModule jsm = new JobSpecificModule(jsmid);
				int iSeq = jsm.getQuestions().size();
				this.setSequence(String.valueOf(iSeq));
				strSQL = "INSERT INTO jsmquestionstructure (questionid,sequence,parentid,jsmid,name,description,notes,ismultiple,viewwithparent,ajsmid) VALUES ("
						+ this.getId()
						+ ", "
						+ this.getSequence()
						+ ", "
						+ Question.ROOTPARENTID
						+ ", "
						+ jsmid
						+ ",'"
						+ this.escapeSpecialCharacters(this.getName())
						+ "','"
						+ this.escapeSpecialCharacters(this.getDescription())
						+ "','"
						+ this.getNotes() + "'," + this.getMultiple() + "," + this.getViewWithParent() + "," + this.getAjsmId() + ")";
				String linkedId = String.valueOf(this.sqlExecuteInsert(strSQL));
				this.setJsmStructureQuestionID(linkedId);
			} else {
				strSQL = "UPDATE jsmquestionstructure SET questionid = "
						+ this.getId() + ", sequence = " + this.getSequence()
						+ ", jsmid=" + jsmid + ", parentid="
						+ this.getParentID() + ",notes='" + this.getNotes()
						+ "', ismultiple=" + this.getMultiple()
						+ ", viewwithparent=" + this.getViewWithParent()
						+ " WHERE id = " + this.getJsmQuestionStructureID();
				this.sqlExecuteUpdate(strSQL);
			}
		} catch (SQLException e) {
			throw new Exception(e.getMessage());
		}
		this.setJsmID(jsmid);
		this.setParentID(Question.ROOTPARENTID);		
	}	
	public void linkToJSMExport(String jsmid,Connection conn) throws Exception {
		if (jsmid.equalsIgnoreCase("")) {
			throw new Exception("Cannot link non existing jsm");
		}
		try {
			String strSQL = "";
			if (this.getJsmQuestionStructureID().equalsIgnoreCase("")) {
				strSQL = "INSERT INTO jsmquestionstructure (questionid,sequence,parentid,jsmid,name,description,notes,ismultiple,viewwithparent,ajsmid) VALUES ("
						+ this.getId()
						+ ", "
						+ this.getSequence()
						+ ", "
						+ Question.ROOTPARENTID
						+ ", "
						+ jsmid
						+ ",'"
						+ this.escapeSpecialCharacters(this.getName())
						+ "','"
						+ this.escapeSpecialCharacters(this.getDescription())
						+ "','"
						+ this.getNotes() + "'," + this.getMultiple() + "," + this.getViewWithParent() + "," + this.getAjsmId() + ")";
				String linkedId = String.valueOf(this.sqlExecuteInsert(strSQL,conn));
				this.setJsmStructureQuestionID(linkedId);
			} else {
				strSQL = "UPDATE jsmquestionstructure SET questionid = "
						+ this.getId() + ", sequence = " + this.getSequence()
						+ ", jsmid=" + jsmid + ", parentid="
						+ this.getParentID() + ",notes='" + this.getNotes()
						+ "', ismultiple=" + this.getMultiple()
						+ ", viewwithparent=" + this.getViewWithParent()
						+ " WHERE id = " + this.getJsmQuestionStructureID();
				this.sqlExecuteUpdate(strSQL,conn);
			}
		} catch (SQLException e) {
			throw new Exception(e.getMessage());
		}
		this.setJsmID(jsmid);
		this.setParentID(Question.ROOTPARENTID);		
	}
	public void linkToPossibleAnswer(String paId, String jqpaId) throws Exception {
		if (jqpaId.equalsIgnoreCase("")) {
			throw new Exception("Cannot link non existing paid");
		}		
		PossibleAnswer pa = new PossibleAnswer(paId, jqpaId);
		String sequence = String.valueOf(pa.getChildQuestions().size());
		Question parentQuestion = new Question("", pa.getJsmQuestionStructureID());
		String strSQL = "";
		if (this.getJsmQuestionStructureID().equalsIgnoreCase("")) {
			strSQL = "INSERT INTO jsmquestionstructure (questionid,sequence,parentid,jsmid,name,description,notes,ismultiple,viewwithparent,ajsmid) VALUES ("
					+ this.getId()
					+ ", "
					+ sequence
					+ ", "
					+ jqpaId
					+ ", "
					+ parentQuestion.getJsmID()
					+ ",'"
					+ this.escapeSpecialCharacters(this.getName())
					+ "','"
					+ this.escapeSpecialCharacters(this.getDescription())
					+ "','"
					+ this.escapeSpecialCharacters(this.getNotes())
					+ "',"
					+ this.getMultiple() + "," + this.getViewWithParent() + "," + this.getAjsmId() + ")";
			String linkedId = String.valueOf(this.sqlExecuteInsert(strSQL));
			this.setJsmStructureQuestionID(linkedId);
		} else {
			strSQL = "UPDATE jsmquestionstructure SET questionid = "
					+ this.getId() + ", sequence = " + this.getSequence()
					+ ", jsmid=" + this.getJsmID() + ", parentid=" + jqpaId
					+ ",notes='" + this.getNotes() + "', ismultiple="
					+ this.getMultiple() + ", viewwithparent="
					+ this.getViewWithParent() + " WHERE id = "
					+ this.getJsmQuestionStructureID();
			this.sqlExecuteUpdate(strSQL);
		}
		this.setJsmID(parentQuestion.getJsmID());		
		this.setParentID(jqpaId);
	}	
	public void linkToPossibleAnswerExport(String paId, String jqpaId,String jsmId,Connection conn) throws Exception {
		if (jqpaId.equalsIgnoreCase("")) {
			throw new Exception("Cannot link non existing paid");
		}		
		//PossibleAnswer pa = new PossibleAnswer(paId, jqpaId);
		//String sequence = String.valueOf(pa.getChildQuestions().size());
		String strSQL = "";
		if (this.getJsmQuestionStructureID().equalsIgnoreCase("")) {
			strSQL = "INSERT INTO jsmquestionstructure (questionid,sequence,parentid,jsmid,name,description,notes,ismultiple,viewwithparent,ajsmid) VALUES ("
					+ this.getId()
					+ ", "
					+ this.sequence
					+ ", "
					+ jqpaId
					+ ", "
					+ jsmId
					+ ",'"
					+ this.escapeSpecialCharacters(this.getName())
					+ "','"
					+ this.escapeSpecialCharacters(this.getDescription())
					+ "','"
					+ this.escapeSpecialCharacters(this.getNotes())
					+ "',"
					+ this.getMultiple() + "," + this.getViewWithParent() + "," + this.getAjsmId() + ")";
			String linkedId = String.valueOf(this.sqlExecuteInsert(strSQL,conn));
			this.setJsmStructureQuestionID(linkedId);
		} else {
			strSQL = "UPDATE jsmquestionstructure SET questionid = "
					+ this.getId() + ", sequence = " + this.getSequence()
					+ ", jsmid=" + this.getJsmID() + ", parentid=" + jqpaId
					+ ",notes='" + this.getNotes() + "', ismultiple="
					+ this.getMultiple() + ", viewwithparent="
					+ this.getViewWithParent() + " WHERE id = "
					+ this.getJsmQuestionStructureID();
			this.sqlExecuteUpdate(strSQL,conn);
		}
		this.setJsmID(jsmId);		
		this.setParentID(jqpaId);
	}

	public void linkToInterviewPossibleAnswer(String paId, String jqpaId) throws Exception {
		if (jqpaId.equalsIgnoreCase("")) {
			throw new Exception("Cannot link non existing paid");
		}
		try {
			PossibleAnswer pa = new PossibleAnswer(paId, jqpaId);
			String sequence = String.valueOf(pa.getChildQuestions().size());
			Question parentQuestion = new Question("", pa.getJsmQuestionStructureID());
			String strSQL = "";
            strSQL = "INSERT INTO jsmquestionstructure (questionid,sequence,parentid,jsmid,name,description,notes,ismultiple,viewwithparent) VALUES ("
                + this.getId()
                + ", "
                + sequence
                + ", "
                + jqpaId
                + ", "
                + parentQuestion.getJsmID()
                + ",'"
                + this.escapeSpecialCharacters(this.getName())
                + "','"
                + this.escapeSpecialCharacters(this.getDescription()) + "','"
				+ this.escapeSpecialCharacters(this.getNotes()) + "'," 
				+ this.getMultiple() + "," 
				+ this.getViewWithParent() + ")";
			String linkedId = String.valueOf(this.sqlExecuteInsert(strSQL));
			this.setJsmStructureQuestionID(linkedId);
		} catch (SQLException e) {
			throw new Exception(e.getMessage());
		}
		this.setParentID(jqpaId);
	}
	public void unLink() throws Exception {
		if (this.getJsmQuestionStructureID().equalsIgnoreCase("")) {
			throw new Exception("Cannot link non existing jsm");
		}
		try {
            for(Question q:this.getChildQuestions()){
                q.unLink();
            }
			String strSQL = "DELETE FROM jsmquestionstructure WHERE id = "
					+ this.getJsmQuestionStructureID();
			this.sqlExecuteUpdate(strSQL);
		} catch (SQLException e) {
			throw new Exception(e.getMessage());
		}
		this.setPossibleAnswers(null);
		this.setJsmID("");
	}
	public void resetSequences() throws Exception {
		ArrayList<Question> qs = new ArrayList<Question>();
		if (this.getParentID().equalsIgnoreCase(Question.ROOTPARENTID)) {
			JobSpecificModule jsm = new JobSpecificModule(this.getJsmID());
			qs = jsm.getQuestions();
		} else {
			PossibleAnswer pa = new PossibleAnswer("", this.getParentID());
			qs = pa.getChildQuestions();
		}
		int i = 0;
		for (Iterator it = qs.iterator(); it.hasNext();) {
			Question q = (Question) it.next();
			q.setSequence(i);
			q.updateSequence();
			if (q.getJsmQuestionStructureID().equalsIgnoreCase(this.getJsmQuestionStructureID())) {
				this.setSequence(String.valueOf(i));
			}
			i++;
		}
	}
	public void removeLinkedPossibleAnswers() throws Exception {
		try {
			ArrayList pas = new ArrayList();
			pas = this.getPossibleAnswers();
			for (Iterator it = pas.iterator(); it.hasNext();) {
				PossibleAnswer pa = (PossibleAnswer) it.next();
				pa.removeChildQuestions();
				pa.unLinkFromQuestion(this.getJsmQuestionStructureID());
			}
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}
	public void unLinkFromPossibleAnswer(String jqpaid) throws Exception {
		if (jqpaid.equalsIgnoreCase("")) {
			throw new Exception("Cannot link non existing jqpaid");
		}
		try {
			String strSQL = "DELETE FROM jsmquestionstructure WHERE parentid = "
					+ jqpaid
					+ " AND sequence = "
					+ this.getSequence()
					+ " AND questionid = " + this.getId();
			this.sqlExecuteUpdate(strSQL);
		} catch (SQLException e) {
			throw new Exception(e.getMessage());
		}
	}
	public boolean isAssociateJSM() {
		boolean bRetValue = false;
		if (this.getTypeID().equalsIgnoreCase(Question.ASSOCIATEJSMLINK)) {
			bRetValue = true;
		} 
		return bRetValue;
	}
	public String getAssociateJSMID() throws Exception {
		String jsmID = "";
		String jsmName = this.getName().substring(
				this.getName().indexOf(":") + 1).trim();
		JobSpecificModule jsm = new JobSpecificModule();
		jsm.setName(jsmName);
		if (jsm.exists()) {
			jsmID = jsm.getId();
		}
		return jsmID;
	}
	public ArrayList<Agent> getAgents() throws Exception {
		if (this.agents == null) {
			this.getPersistentAgents();
		}
		return agents;
	}
	private void getPersistentAgents() throws Exception {
		ResultSet rs = null;
		this.agents = new ArrayList<Agent>();
		if (!(this.getJsmQuestionStructureID().equalsIgnoreCase(""))) {
			String strSQL = "SELECT agent.id, jsmquestionstructureagent.jsmquestionstructureid"
					+ " FROM agent INNER JOIN"
					+ " jsmquestionstructureagent ON agent.id = jsmquestionstructureagent.agentid"
					+ " WHERE (jsmquestionstructureagent.jsmquestionstructureid = "
					+ this.getJsmQuestionStructureID() + ") ORDER BY agent.parentagentid, agent.name";
			rs = this.sqlExecuteSelect(strSQL);
			if (rs != null) {
				while (rs.next()) {
					String id = rs.getString("id");
					Agent agent = new Agent();
					agent.setId(id);
					this.agents.add(agent);
				}
				if (rs.getStatement() != null) {
					rs.getStatement().close();
				}
				rs.close();
			}
			this.closeConnection();
			for(Agent agent: this.agents){
				agent.getPersistentObject();
			}
		}
	}
	public Integer createFrozenJSMQuestionsAndAnswers(String fjsmid,boolean globalDontKnow,Integer displayOrder,Integer indentLevel) throws Exception {
		if (fjsmid.equalsIgnoreCase("")) {
			throw new Exception("Cannot link non existing jsm");
		}		
		try {
			
			String strSQL = "";
			strSQL = "INSERT INTO frozenjsmquestionsandpossibleanswers (parentid, indentlevel, displayorder, questionid,jsmquestionstructureid, questionname, questiondescription,questionnotes,viewwithparent,ismultiple,frozenjsmid) VALUES ("
				+ "Null"
				+ ", "
				+ indentLevel
				+ ","
				+ displayOrder
				+ ","
				+ this.getId()
				+ ","
				+ this.getJsmQuestionStructureID()
				+ ",'"
				+ this.escapeSpecialCharacters(this.getName())
				+ "','"
				+ this.escapeSpecialCharacters(this.getDescription())
				+ "','" 
				+ this.escapeSpecialCharacters(this.getNotes())
				+ "'," 
				+ this.getViewWithParent()
				+ ", "
				+ this.getMultiple()
				+ ", "
				+ fjsmid
				+ ")";
			String frozenQId = String.valueOf(this.sqlExecuteInsert(strSQL));

			this.getFrozenQuestion().setId(frozenQId);
			this.getFrozenQuestion().setFrozenJSMId(fjsmid);
			
			displayOrder = this.createChildFrozenJSMQuestions(this,globalDontKnow,displayOrder,indentLevel);
		} catch (SQLException e) {
			throw new Exception(e.getMessage());
		}
		return displayOrder;
	}
	public void linkToFrozenJSM(String id,boolean globalDontKnow) throws Exception {
		if (id.equalsIgnoreCase("")) {
			throw new Exception("Cannot link non existing jsm");
		}
		try {
			String strSQL = "";
			JobSpecificModule jsm = new JobSpecificModule(id);
			jsm.getQuestions();
			int iSeq = jsm.getQuestions().size();
			this.setSequence(String.valueOf(iSeq));
			strSQL = "INSERT INTO jsmquestionstructure (questionid,sequence,parentid,jsmid,name,description,notes,ismultiple,viewwithparent) VALUES ("
				+ this.getId()
				+ ", "
				+ this.getSequence()
				+ ", "
				+ Question.ROOTPARENTID
				+ ", "
				+ id
				+ ",'"
				+ this.escapeSpecialCharacters(this.getName())
				+ "','"
				+ this.escapeSpecialCharacters(this.getDescription())
				+ "','"
				+ this.getNotes() + "'," + this.getMultiple() + "," + this.getViewWithParent() + ")";
			String linkedId = String.valueOf(this.sqlExecuteInsert(strSQL));

			this.setJsmStructureQuestionID(linkedId);

			this.linkChildInterviewObjects(this,globalDontKnow);
		} catch (SQLException e) {
			throw new Exception(e.getMessage());
		}
		this.setJsmID(id);
	}
	private Integer createChildFrozenJSMQuestions(Question q,boolean globalDontKnow,Integer displayOrder,Integer indentLevel) throws Exception {
		boolean bFoundDontKnow = false;		
		for (PossibleAnswer pa : q.getPossibleAnswers()) {
			displayOrder = pa.createFrozenJSMPossibleAnswers(q,displayOrder,indentLevel+1);
			for (Question cq : pa.getChildQuestions()) {
				try {
					String strSQL = "INSERT INTO frozenjsmquestionsandpossibleanswers (parentid, indentlevel, displayorder, questionid,jsmquestionstructureid, questionname, questiondescription,questionnotes,viewwithparent,ismultiple,frozenjsmid) VALUES ("
						+ pa.getFrozenPossibleAnswerID()
						+ ", "
						+ (indentLevel+1)
						+ ","
						+ displayOrder++
						+ ","
						+ cq.getId()
						+ ","
						+ cq.getJsmQuestionStructureID()
						+ ",'"
						+ cq.escapeSpecialCharacters(cq.getName())
						+ "','"
						+ cq.escapeSpecialCharacters(cq.getDescription())
						+ "','" 
						+ cq.escapeSpecialCharacters(cq.getNotes())
						+ "'," 
						+ cq.getViewWithParent()
						+ ", "
						+ cq.getMultiple()
						+ ", "
						+ q.getFrozenQuestion().getFrozenJSMId()
						+ ")";
					String frozenQId = String.valueOf(this.sqlExecuteInsert(strSQL));

					cq.getFrozenQuestion().setId(frozenQId);
					cq.getFrozenQuestion().setFrozenJSMId(q.getFrozenQuestion().getFrozenJSMId());

					displayOrder = this.createChildFrozenJSMQuestions(cq,globalDontKnow,displayOrder,indentLevel+2);
				} catch (SQLException e) {
					throw new Exception(e.getMessage());
				}
			}
			if(pa.getName().equalsIgnoreCase("Don't know")){
				bFoundDontKnow = true;
			}
		}
		if(globalDontKnow){
			if(!bFoundDontKnow){
				PossibleAnswer dontKnowPA = new PossibleAnswer();
				dontKnowPA.setName("Don't know");
				if(dontKnowPA.exists()){			
					dontKnowPA.setJsmQuestionPossibleAnswerStructureID("NULL");
					displayOrder = dontKnowPA.createFrozenJSMPossibleAnswers(q,displayOrder,indentLevel+1);
				}
			}		
		}
		return displayOrder; 
	}
	private void linkChildInterviewObjects(Question q,boolean globalDontKnow) throws Exception {
		boolean bFoundDontKnow = false;		
		for (PossibleAnswer pa : q.getPossibleAnswers()) {
			pa.linkToInterviewQuestion(q.getId(), q.getJsmQuestionStructureID());
			for (Question cq : pa.getChildQuestions()) {
				String oldID = "";
				if(cq.getTypeID().equalsIgnoreCase(Question.FREQUENCY)){
					oldID = cq.getOldQuestionID();	
				}				
				ArrayList<Agent> agents = cq.getAgents();
				cq.linkToInterviewPossibleAnswer(pa.getId(), pa.getJsmQuestionPossibleAnswerStructureID());
				if(cq.getTypeID().equalsIgnoreCase(Question.FREQUENCY)){
					cq.setOldQuestionID(oldID); 
					cq.updateOldQuestionId();
				}				
				cq.updateNotes();
				for (Agent agent : agents) {
					cq.addFrozenAgent(agent);
				}
				this.linkChildInterviewObjects(cq,globalDontKnow);
			}
			if(pa.getName().equalsIgnoreCase("Don't know")){
				bFoundDontKnow = true;
			}
		}
		if(globalDontKnow){
			if(!bFoundDontKnow){
				PossibleAnswer dontKnowPA = new PossibleAnswer();
				dontKnowPA.setName("Don't know");
				if(dontKnowPA.exists()){
					
					dontKnowPA.linkToInterviewQuestion(q.getId(), q.getJsmQuestionStructureID());
				}
			}		
		}
	}
	private String getLevelSequence(Question q) throws Exception {
		String strRetValue = (Integer.valueOf(q.getSequence()) + 1) + ".";
		if (!(q.isRootQ())) {
			Question pq = new Question("", q.getParentQuestionID());
			strRetValue = q.getLevelSequence(pq) + strRetValue;
		}
		return strRetValue;
	}
    public String getLevel() throws Exception {
        String strRetValue = this.getLevelSequence(this);
        return strRetValue;
    }
    private String insertAnswer(PossibleAnswer pa) throws Exception{
    	String retValue = "";
    	String strSQL = "INSERT INTO jsminterviewanswers (questionid,jsmquestionstructureid,possibleanswerid,jsmquestionpossibleanswerstructureid,questionname,questiondescription,answerdescription,sequence,jsminterviewid,frozenquestionid) VALUES("
			+ this.getId()
			+ ","
			+ this.getJsmQuestionStructureID()
			+ ","
			+ pa.getId()
			+ ","
			+ pa.getJsmQuestionPossibleAnswerStructureID()
			+ ",'"
			+ this.escapeSpecialCharacters(this.getName())
			+ "','"
			+ this.escapeSpecialCharacters(this.getDescription())
			+ "','"
			+ this.escapeSpecialCharacters(pa.getActualAnswer())
			+ "',"
			+ pa.getSequence() + "," + this.getInterviewID() + "," + this.getFrozenQuestion().getId() + ")";
		try {
			retValue = this.sqlExecuteInsert(strSQL).toString();
		} catch (SQLException e) {
			throw new Exception(e.getMessage());
		}
		this.answers.add(pa);
		return retValue;
    }
	public void saveAnswer(PossibleAnswer pa) throws Exception {
		String interviewAnswerId = "";
		if (this.getAnswers().contains(pa)) {
			if((pa.isFreeText())||(pa.isNumber())){
				boolean bFoundNewAnswer = false;
				if(this.getAnswers().size()>0){
					for(PossibleAnswer panswer:this.getAnswers()){
						if(!(panswer.getActualAnswer().equalsIgnoreCase(pa.getActualAnswer()))){
							bFoundNewAnswer = true;
							break;	
						}
					}
					if(bFoundNewAnswer){
						interviewAnswerId = this.insertAnswer(pa);
					}
				}
			}
		}else{
			interviewAnswerId = this.insertAnswer(pa);
		}
		if(!(interviewAnswerId.equalsIgnoreCase(""))){
			if(this.getTypeID().equalsIgnoreCase(Question.FREQUENCY)){
				InterviewAnswer ia = new InterviewAnswer(interviewAnswerId);
				ia.updateOldQuestionId(this.getOldQuestionID());
			} 
		}		
	}
	public ArrayList<PossibleAnswer> getAnswers() throws Exception {
		if (this.answers == null) {
			this.getPersistentAnswers();
		}
		return answers;
	}	
	private void getPersistentAnswers() throws Exception {
		ResultSet rs = null;		
		this.answers = new ArrayList<PossibleAnswer>();
		if(!(this.getInterviewID().equalsIgnoreCase(""))){
			if (!(this.getJsmQuestionStructureID().equalsIgnoreCase(""))) {
				String strSQL = "SELECT possibleanswerid, jsmquestionpossibleanswerstructureid, answerdescription, jsmquestionstructureid, sequence"
						+ " FROM jsminterviewanswers"
						+ " WHERE (jsmquestionstructureid = "
						+ this.getJsmQuestionStructureID()
						+ ") AND (jsminterviewid = "+this.getInterviewID()+") AND (NOT (jsmquestionpossibleanswerstructureid IS NULL)) ORDER BY sequence";
				rs = this.sqlExecuteSelect(strSQL);
				if (rs != null) {	
					while (rs.next()) {
						String id = rs.getString("possibleanswerid");
						String jsmlqpaid = rs.getString("jsmquestionpossibleanswerstructureid");
						PossibleAnswer answer = new PossibleAnswer();
						answer.setId(id);
						answer.setJsmQuestionPossibleAnswerStructureID(jsmlqpaid);
						//answer.setSequence(rs.getString("sequence"));
						answer.setActualAnswer(rs.getString("answerdescription"));
						answer.setInterviewID(this.getInterviewID());
						this.answers.add(answer);
					}
					if (rs.getStatement() != null) {
						rs.getStatement().close();
					}
					rs.close();
				}
			}
		}
		this.closeConnection();
		for(PossibleAnswer pa: this.answers){
			pa.getPersistentLinkedObject();
		}
	}
	public void setAnswers(ArrayList<PossibleAnswer> answers) {
		this.answers = answers;
	}
	public void removeAllAnswers() throws Exception {
		ArrayList<PossibleAnswer> answers = this.getAnswers();
		String strSQL = "DELETE FROM jsminterviewanswers WHERE jsminterviewid = "
				+ this.getInterviewID()
				+ " AND jsmquestionstructureID = "
				+ this.getJsmQuestionStructureID();
		try {
			this.sqlExecuteUpdate(strSQL);
			for (PossibleAnswer answer : answers) {
				for (Question q : answer.getChildQuestions()) {
					q.setInterviewID(this.getInterviewID());
					q.removeAllAnswers();
				}
			}
		} catch (SQLException e) {
			throw new Exception(e.getMessage());
		}
		this.answers = new ArrayList<PossibleAnswer>();
	}
	
	public String getParentQuestionID() throws Exception {
		String strID = "";
		if (this.getParentID().equalsIgnoreCase(Question.ROOTPARENTID)) {
			JobSpecificModule jsm = new JobSpecificModule(this.getJsmID());
			for (Question q : jsm.getQuestions()) {
				int i = Integer.valueOf(q.getSequence());
				int j = Integer.valueOf(this.getSequence());
				if (i < j) {
					strID = q.getJsmQuestionStructureID();
				}
			}
		} else {
			PossibleAnswer pa = new PossibleAnswer("", this.getParentID());
			strID = pa.getJsmQuestionStructureID();
		}
		return strID;
	}
	
	public String getNextLinkedQuestionID() throws Exception {
		String strId = "";
		if (this.getParentID().equalsIgnoreCase(Question.ROOTPARENTID)) {
			JobSpecificModule jsm = new JobSpecificModule(this.getJsmID());
			for (Question q : jsm.getQuestions()) {
				int i = Integer.valueOf(q.getSequence());
				int j = Integer.valueOf(this.getSequence());
				if (i > j) {
					strId = q.getJsmQuestionStructureID();
					break;
				}
			}
		} else {
			PossibleAnswer pa = new PossibleAnswer("", this.getParentID());
			for (Question q : pa.getChildQuestions()) {
				int i = Integer.valueOf(q.getSequence());
				int j = Integer.valueOf(this.getSequence());
				if (i > j) {
					if(!q.isViewWithParent()){
						strId = q.getJsmQuestionStructureID();
						break;
					}
				}
			}
			if (strId.equalsIgnoreCase("")) {
				Question pq = new Question("", pa.getJsmQuestionStructureID());
				pq.setInterviewID(this.getInterviewID());
				strId = pq.getNextInterviewQuestionID(pa.getSequence());
			}
		}
		return strId;
	}
	public String getNextLinkedQuestionIDAutoGen() throws Exception {
		String strId = "";
		if (this.getParentID().equalsIgnoreCase(Question.ROOTPARENTID)) {
			JobSpecificModule jsm = new JobSpecificModule(this.getJsmID());
			for (Question q : jsm.getQuestions()) {
				int i = Integer.valueOf(q.getSequence());
				int j = Integer.valueOf(this.getSequence());
				if (i > j) {
					strId = q.getJsmQuestionStructureID();
					break;
				}
			}
		} else {
			PossibleAnswer pa = new PossibleAnswer("", this.getParentID());
			for (Question q : pa.getChildQuestions()) {
				int i = Integer.valueOf(q.getSequence());
				int j = Integer.valueOf(this.getSequence());
				if (i > j) {
					//if(!q.isViewWithParent()){
						strId = q.getJsmQuestionStructureID();
						break;
					//}
				}
			}
			if (strId.equalsIgnoreCase("")) {
				Question pq = new Question("", pa.getJsmQuestionStructureID());
				pq.setInterviewID(this.getInterviewID());
				strId = pq.getNextInterviewQuestionID(pa.getSequence());
			}
		}
		return strId;
	}
	public boolean hasAgent(String strAgentIDs) throws Exception {
		boolean retValue = false;
		for (Agent agent : this.getAgents()) {
			String arrayAgentIDs[] = strAgentIDs.split(",");
			for (int i = 0; i < arrayAgentIDs.length; i++) {
				if (arrayAgentIDs[i].equalsIgnoreCase(agent.getId())) {
					retValue = true;
					break;
				}
			}
			if (retValue) {
				break;
			}
		}
		if (!(retValue)) {
			for (PossibleAnswer pa : this.getPossibleAnswers()) {
				for (Question q : pa.getChildQuestions()) {
					retValue = q.hasAgent(strAgentIDs);
					if(retValue){
						break;
					}
				}
				if(retValue){
					break;
				}
			}
		}
		return retValue;
	}
	public void copyTo(String jsmlqpaid,Study study) throws Exception {
		ArrayList<PossibleAnswer> possAnswers= this.getPossibleAnswers();
		ArrayList<Agent> agents = new ArrayList<Agent>();
		if(study!=null){
			agents = study.getAgents();
		}else{
			agents = this.getAgents();
		}
		//String oldId = this.getJsmQuestionStructureID();
		this.setJsmStructureQuestionID("");
		this.linkToPossibleAnswer("", jsmlqpaid);	
		//this.setOldQuestionID(oldId);
		//this.updateOldQuestionId();
		Question q = new Question("",this.getJsmQuestionStructureID());
		for(Agent agent : agents){
			q.addAgent(agent);
		}
		for (PossibleAnswer pa : possAnswers) {
			pa.copyTo(this.getJsmQuestionStructureID(),study);
		}
	}
	public void copyTo(String jsmlqpaid) throws Exception {		
		copyTo(jsmlqpaid,null);
	}
	public void updateNotes() throws Exception {
		String strSQL = "UPDATE jsmquestionstructure SET notes='"
				+ this.getNotes() + "', ismultiple=" + this.getMultiple()
				+ " WHERE id = " + this.getJsmQuestionStructureID();
		this.sqlExecuteUpdate(strSQL);
	}	
	public void updateOldQuestionId() throws Exception {
		String strSQL = "UPDATE jsmquestionstructure SET oldquestionid="
				+ this.getOldQuestionID() + " WHERE id = " + this.getJsmQuestionStructureID();
		this.sqlExecuteUpdate(strSQL,connection);
	}
	public String getInterviewID() {
		if(this.interviewID == null){
			this.interviewID = "";
		}
		return interviewID;
	}
	public void setInterviewID(String interviewID) {
		this.interviewID = interviewID;
	}
	public String getNextInterviewQuestionID(String sequence) throws Exception {
		String strNextLinkedQID = "";
		if (this.getAnswers().size() > 0) {
			// for each actual answer check for child questions
			for (PossibleAnswer pa : this.getAnswers()) {
				int i = Integer.valueOf(pa.getSequence());
				int j = Integer.valueOf(sequence);
				if (i > j) {
					if (pa.getChildQuestions().size() > 0) {
						// found child questions
						for (Question q : pa.getChildQuestions()) {
							if(!q.isViewWithParent()){
								strNextLinkedQID = q.getJsmQuestionStructureID();
								break;	
							}
						}
					} else {
						// no child questions found so shuffle up
						strNextLinkedQID = this.getNextLinkedQuestionID(this.getSequence());
						if (!(strNextLinkedQID.equalsIgnoreCase(""))) {
							break;
						}
					}
					break;
				}
			}
		} else {
			// no answers to this question just continue
			strNextLinkedQID = this.getNextLinkedQuestionID();

		}
		if (strNextLinkedQID.equalsIgnoreCase("")) {
			strNextLinkedQID = this.getNextLinkedQuestionID();
		}
		return strNextLinkedQID;
	}
	private String getNextLinkedQuestionID(String sequence2) throws Exception {
		String strId = "";
		if (this.getParentID().equalsIgnoreCase(Question.ROOTPARENTID)) {
			JobSpecificModule jsm = new JobSpecificModule(this.getJsmID());
			for (Question q : jsm.getQuestions()) {
				int i = Integer.valueOf(q.getSequence());
				int j = Integer.valueOf(sequence2);
				if (i > j) {
					strId = q.getJsmQuestionStructureID();
					break;
				}
			}
		} else {
			PossibleAnswer pa = new PossibleAnswer("", this.getParentID());
			for (Question q : pa.getChildQuestions()) {
				int i = Integer.valueOf(q.getSequence());
				int j = Integer.valueOf(sequence2);
				if (i > j) {
					if(!q.isViewWithParent()){
						strId = q.getJsmQuestionStructureID();
						break;
					}
				}
			}
			if (strId.equalsIgnoreCase("")) {
				Question pq = new Question("", pa.getJsmQuestionStructureID());
				pq.getNextInterviewQuestionID(this.getSequence());
			}
		}
		return strId;
	}
	public String getNextInterviewQuestionIDAutoGen() throws Exception {
		String strNextLinkedQID = "";
		if (this.getAnswers().size() > 0) {
			// for each actual answer check for child questions
			for (PossibleAnswer pa : this.getAnswers()) {
				if (!(strNextLinkedQID.equals(""))) {
					// found the next ID
					break;
				}
				if (pa.getChildQuestions().size() > 0) {
					// found child questions
					for (Question q : pa.getChildQuestions()) {						
						if (strNextLinkedQID.equalsIgnoreCase("")) {
							strNextLinkedQID = q.getJsmQuestionStructureID();
							break;
						} 												
					}
				}
			}
		} 
		if (strNextLinkedQID.equalsIgnoreCase("")) {
			strNextLinkedQID = this.getNextLinkedQuestionIDAutoGen();
		}
		return strNextLinkedQID;
	}
	public String getNextInterviewQuestionID() throws Exception {
		String strNextLinkedQID = "";
		if (this.getAnswers().size() > 0) {
			// for each actual answer check for child questions
			for (PossibleAnswer pa : this.getAnswers()) {
				if (!(strNextLinkedQID.equals(""))) {
					// found the next ID
					break;
				}
				if (pa.getChildQuestions().size() > 0) {
					// found child questions
					for (Question q : pa.getChildQuestions()) {
						if(!q.isViewWithParent()){
							if (strNextLinkedQID.equalsIgnoreCase("")) {
								strNextLinkedQID = q.getJsmQuestionStructureID();
								break;
							} 
						}						
					}
				}
			}
		} 
		if (strNextLinkedQID.equalsIgnoreCase("")) {
			strNextLinkedQID = this.getNextLinkedQuestionID();
		}
		return strNextLinkedQID;
	}
	public String getPreviousLinkedQuestionID() throws Exception {
		String strId = "";
		if (this.getParentID().equalsIgnoreCase(Question.ROOTPARENTID)) {
			int j = Integer.valueOf(this.getSequence());
			if (j == 0) {
				strId = this.getJsmQuestionStructureID();
			} else {
				JobSpecificModule jsm = new JobSpecificModule(this.getJsmID());
				for (Question q : jsm.getQuestions()) {
					int i = Integer.valueOf(q.getSequence());
					j = Integer.valueOf(this.getSequence());
					if (i == (j - 1)) {
						strId = q.getJsmQuestionStructureID();
						break;
					}
				}
			}
		} else {
			PossibleAnswer pa = new PossibleAnswer("", this.getParentID());
			for (Question q : pa.getChildQuestions()) {
				int i = Integer.valueOf(q.getSequence());
				int j = Integer.valueOf(this.getSequence());
				if (i == (j - 1)) {
					strId = q.getJsmQuestionStructureID();
					break;
				}
			}
			Question pq = new Question("", pa.getJsmQuestionStructureID());
			strId = pq.getJsmQuestionStructureID();
		}
		return strId;
	}
	public void getFullPossibleAnswers() throws Exception {
		for (PossibleAnswer pa : this.getPossibleAnswers()) {
			pa.getFullChildQuestion();
		}
	}
	public void getFullAnswers() throws Exception {
		for (PossibleAnswer pa : this.getAnswers()) {
			pa.getFullChildQuestion();
		}
	}
	public void removeAnswer(PossibleAnswer oldpa) throws Exception {
		String strSQL = "";
		if(oldpa.getDescription().equalsIgnoreCase("skipped")){
			strSQL = "DELETE FROM jsminterviewanswers WHERE jsminterviewid = "
				+ this.getInterviewID()
				+ " AND jsmquestionstructureid = "
				+ this.getJsmQuestionStructureID()
				+ " AND answerdescription = 'skipped' ";
		}else{
			strSQL = "DELETE FROM jsminterviewanswers WHERE jsminterviewid = "
				+ this.getInterviewID()
				+ " AND jsmquestionstructureid = "
				+ this.getJsmQuestionStructureID()
				+ " AND answerdescription = '"
				+ this.escapeSpecialCharacters(oldpa.getActualAnswer())
				+ "' AND jsmquestionpossibleanswerstructureid = "
				+ oldpa.getJsmQuestionPossibleAnswerStructureID();
		}
		try {
			this.sqlExecuteUpdate(strSQL);
			this.answers.remove(oldpa);
			for (Question q : oldpa.getChildQuestions()) {
				q.setInterviewID(this.getInterviewID());
				q.removeAllAnswers();
			}
		} catch (SQLException e) {
			throw new Exception(e.getMessage());
		}
	}
	public String getTypeID() {
		if(this.typeID == null){
			this.typeID = "null";
		}else{
			if(this.typeID.equalsIgnoreCase("")){
				this.typeID = "null";
			}
		}
		return typeID;
	}
	public void setTypeID(String typeID) {
		this.typeID = typeID;
	}
	public ArrayList<Question> getChildQuestions() throws Exception {
		ArrayList<Question> questions = new ArrayList<Question>();
		for (PossibleAnswer pa : this.getPossibleAnswers()) {
			questions.addAll(pa.getChildQuestions());
		}
		return questions;
	}
	public ArrayList<Question> getChildQuestionsAnswered() throws Exception {
		ArrayList<Question> questions = new ArrayList<Question>();
		for (PossibleAnswer pa : this.getAnswers()) {
			questions.addAll(pa.getChildQuestions());
		}
		return questions;
	}
	public ArrayList<Question> getQuestions(String strSQL) throws Exception {
		ResultSet rs = null;
		ArrayList<Question> questions = new ArrayList<Question>();
		rs = this.sqlExecuteSelect(strSQL);
		if (rs != null) {
			while (rs.next()) {
				String qid = rs.getString("questionid");
				String linkedqid = rs.getString("id");
				Question question = new Question();
				question.setId(qid);
				question.setJsmStructureQuestionID(linkedqid);
				question.setSequence(rs.getString("sequence"));
				question.setName(rs.getString("name"));
				questions.add(question);
			}
			if (rs.getStatement() != null) {
				rs.getStatement().close();
			}
			rs.close();
		}
		this.closeConnection();
		for(Question q:questions){
			q.getPersistentStructureObject();
		}
		return questions;
	}
	public ArrayList<Question> getStructureQuestions(String strSQL) throws Exception {
		ArrayList<Question> questions = new ArrayList<Question>();		
		ResultSet rs = null;
		try {
			rs = this.sqlExecuteSelect(strSQL);
			if (rs != null) {
				while (rs.next()) {
					String id = rs.getString("id");
					String linkedId = rs.getString("linkedid");
					String name = rs.getString("name");
					String jsmId = rs.getString("jsmid");
					Question q = new Question();
					q.setId(id);
					q.setJsmStructureQuestionID(linkedId);
					q.setName(name);
					q.setJsmID(jsmId);
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
		return questions;
	}
	public ArrayList<Question> getQuestions() throws Exception {
		return this.getQuestions("");
	}
	public ArrayList<Question> getOrphanQuestions() throws Exception {
		String strFilter = " LEFT OUTER JOIN jsmquestionstructure ON question.id = jsmquestionstructure.questionid WHERE (jsmquestionstructure.questionid IS NULL)";
		ArrayList<Question> retValue = new ArrayList<Question>();
		retValue = this.getQuestions(strFilter);
		
		return retValue;
	}
	public void relink() throws Exception {
		try {
			String strSQL = "UPDATE jsmquestionstructure SET questionid = "
					+ this.getId() + ", sequence = " + this.getSequence()
					+ ", jsmid=" + this.getJsmID() + ", parentid="
					+ this.getParentID() + ",notes='" + this.getNotes()
					+ "', ismultiple=" + this.getMultiple()
					+ ",description='"+this.escapeSpecialCharacters(this.getDescription())+"' WHERE id = " + this.getJsmQuestionStructureID();
			this.sqlExecuteUpdate(strSQL);			
		} catch (SQLException e) {
			throw new Exception(e.getMessage());
		}
	}
	public String getJsmName() {
		if(jsmName.equalsIgnoreCase("")){
			this.jsmName = "null";
		}
		return jsmName;
	}
	public void setJsmName(String jsmName) {
		this.jsmName = jsmName;
	}
    public void addFrozenAgent(Agent agent) throws Exception {
        String strSQL = "INSERT INTO jsmquestionstructureagent (agentid,jsmquestionstructureid) VALUES("
            + agent.getId() + "," + this.getJsmQuestionStructureID() + ")";
       agent.setQuestionAgentID(String.valueOf(this.sqlExecuteInsert(strSQL)));       
    }
    public void filterChildQuestionsThroughAJSMs(String strAgentIDs) throws Exception {
        for(PossibleAnswer pa: this.getPossibleAnswers()){
            ArrayList<Question> qs = new ArrayList<Question>();
            for(Question q: pa.getChildQuestions(strAgentIDs)){
            	if (q.isAssociateJSM()) {
                    String jsmID = q.getAjsmId();
                    if (!(jsmID.equalsIgnoreCase(""))) {;
                        JobSpecificModule jsm = new JobSpecificModule(jsmID);
                        if (jsm.getId() != "") {
                            qs.addAll(jsm.getMjsmsQuestions(strAgentIDs));
                        }
                    }
                }else{
                	q.filterChildQuestionsThroughAJSMs(strAgentIDs);
                    qs.add(q);
                }
            }
            pa.setChildQuestions(qs);
        }     
    }
    public void filterChildQuestionsList(String strAgentIDs) throws Exception {
        for(PossibleAnswer pa: this.getPossibleAnswers()){
            ArrayList<Question> qs = new ArrayList<Question>();
            for(Question q: pa.getChildQuestions(strAgentIDs)){
            	if (!(q.isAssociateJSM())) {
                	q.filterChildQuestionsList(strAgentIDs);
                    qs.add(q);
                }
            }
            pa.setChildQuestions(qs);
        }     
    }
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public boolean isMinimised() {
		return minimised;
	}
	public void setMinimised(boolean minimised) {
		this.minimised = minimised;
	}
	public ArrayList<PossibleAnswer> getAllPossibleAnswers() throws Exception {
		if (this.possibleAnswers == null) {
			this.getPersistentAllPossibleAnswers();
		}
		return possibleAnswers;
	}	
//	public void renameAllAJSMLinks(String oldName, String newAJSMName) throws Exception {
//		String strFilter = "WHERE question.name='JSM: "+this.escapeSpecialCharacters(oldName)+"'";
//		for(Question q: this.getQuestions(strFilter)){
//			q.setName("JSM: "+newAJSMName);			
//			q.setDescription("JSM: "+newAJSMName);			
//			q.update();
//		}
//	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public boolean isKeyPhaseUsed() throws Exception {
		boolean bRetValue = false;
		String sql = "SELECT question.id,question.questiontypeid FROM question INNER JOIN jsmquestionstructure ON question.id = jsmquestionstructure.questionid WHERE (question.id = "+this.getId()+") AND (question.questiontypeid <> 3) GROUP BY question.id, jsmquestionstructure.questionid HAVING (COUNT(jsmquestionstructure.id) > 1)";
		ResultSet rs = null;
		try {
			rs = this.sqlExecuteSelect(sql);
			if (rs != null) {
				if (rs.next()) {
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
	public int compareTo(Question o) {		
		return this.getSequence().compareTo(o.getSequence()); 
	}
	public void removeSkipped(String interviewId) throws Exception {
		String sql = "DELETE FROM jsminterviewanswers WHERE jsmquestionstructureid="+this.getJsmQuestionStructureID()+" AND jsminterviewid="+interviewId+" AND answerdescription='skipped'";
		this.sqlExecuteUpdate(sql);		
	}
	public boolean isSkipped() throws Exception {
		boolean retValue = false;
		try {
			String strSQL = "SELECT possibleanswerid, jsmquestionpossibleanswerstructureid, answerdescription, jsmquestionstructureid, sequence"
				+ " FROM jsminterviewanswers"
				+ " WHERE (jsmquestionstructureid = "
				+ this.getJsmQuestionStructureID()
				+ ") AND (jsminterviewid = "+this.getInterviewID()+") AND (answerdescription='skipped')";
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
		} catch (SQLException e) {
			throw new Exception(e.getMessage());
		} finally {
			this.closeConnection();
		}
		return retValue;
	}
	public String getOldQuestionID() {
		return oldQuestionID;
	}
	public void setOldQuestionID(String oldQuestionID) {
		this.oldQuestionID = oldQuestionID;
	}
	public boolean isViewWithParent() {
		if(this.getTypeID().equalsIgnoreCase(Question.FREQUENCY)){
    		viewWithParent = true;        	
    	}
		return viewWithParent;
	}
	public void setViewWithParent(boolean showChildren) {
		this.viewWithParent = showChildren;
	}
	public String getAjsmId() {
		if(this.ajsmId==null){
			this.ajsmId = "NULL";
		}else if(this.ajsmId.equalsIgnoreCase("")){
			this.ajsmId = "NULL";
		}
		return ajsmId;
	}
	public void setAjsmId(String ajsmId) {
		this.ajsmId = ajsmId;
	}
	public void setAgents(ArrayList<Agent> agents) {
		this.agents = agents;
	}
	public Question getChildQuestionFrequencyHours(String paId,Connection conn) throws Exception {
		Question question = new Question();
		try{
			ResultSet rs = null;
			String strSQL = "SELECT jsmquestionstructure_2.id AS id " +
					"FROM jsmquestionstructure AS jsmquestionstructure_2 " +
					"INNER JOIN (jsmquestionpossibleanswerstructure AS jsmquestionpossibleanswerstructure_1 " +
					"INNER JOIN (jsmquestionstructure AS jsmquestionstructure_1 " +
					"INNER JOIN (jsmquestionpossibleanswerstructure " +
					"INNER JOIN jsmquestionstructure ON jsmquestionpossibleanswerstructure.jsmquestionstructureid = jsmquestionstructure.id) ON jsmquestionstructure_1.parentid = jsmquestionpossibleanswerstructure.id) ON jsmquestionpossibleanswerstructure_1.jsmquestionstructureid = jsmquestionstructure_1.id) ON jsmquestionstructure_2.parentid = jsmquestionpossibleanswerstructure_1.id " +
					"WHERE (jsmquestionstructure.id="+this.getJsmQuestionStructureID()+") AND jsmquestionpossibleanswerstructure.possibleanswerid = "+paId;
			rs = this.sqlExecuteSelect(strSQL,conn);
			if (rs != null) {
				if (rs.next()) {
					String linkedqid = rs.getString("id");
					question.setJsmStructureQuestionID(linkedqid);
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
		return question;
	}	
	public Question getChildQuestionFrequencyWeeks(String paId, Connection conn) throws Exception {
		
		Question question = new Question();
		try{
			ResultSet rs = null;
			String strSQL = "SELECT jsmquestionstructure_1.id" +
			" FROM jsmquestionstructure AS jsmquestionstructure_1" +
			" INNER JOIN (jsmquestionpossibleanswerstructure" +
			" INNER JOIN jsmquestionstructure ON jsmquestionpossibleanswerstructure.jsmquestionstructureid = jsmquestionstructure.id) ON jsmquestionstructure_1.parentid = jsmquestionpossibleanswerstructure.id" +
			" INNER JOIN question ON question.id = jsmquestionstructure_1.questionid" +
			" WHERE (((jsmquestionstructure.id)="+this.getJsmQuestionStructureID()+")) AND jsmquestionpossibleanswerstructure.possibleanswerid = "+paId+" AND question.questiontypeid = 3";
			rs = this.sqlExecuteSelect(strSQL,conn);
			if (rs != null) {
				while (rs.next()) {
					String linkedqid = rs.getString("id");
					question.setJsmStructureQuestionID(linkedqid);
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
		
		return question;
	}
	public void exportRelinkAJSM(Connection conn,String aJSMId) throws Exception {
		String strSQL = "UPDATE jsmquestionstructure SET ajsmid = "+aJSMId+" WHERE id = " + this.getJsmQuestionStructureID();	
		this.sqlExecuteUpdate(strSQL,conn);
	}
//	public String getFrozenQuestionID() {
//		return frozenQuestionID;
//	}
//	public void setFrozenQuestionID(String frozenQuestionID) {
//		this.frozenQuestionID = frozenQuestionID;
//	}
//	public String getFrozenJSMID() {
//		return frozenJSMID;
//	}
//	public void setFrozenJSMID(String frozenJSMID) {
//		this.frozenJSMID = frozenJSMID;
//	}
//	public Integer getIndentLevel() {
//		return indentLevel;
//	}
//	public void setIndentLevel(Integer indentLevel) {
//		this.indentLevel = indentLevel;
//	}
//	public Integer getDisplayOrder() {
//		return displayOrder;
//	}
//	public void setDisplayOrder(Integer displayOrder) {
//		this.displayOrder = displayOrder;
//	}
	public FrozenQA getFrozenQuestion() {
		if(frozenQuestion==null){
			frozenQuestion = new FrozenQA();
		}
		return frozenQuestion;
	}
	public void setFrozenQuestion(FrozenQA frozenQuestion) {
		this.frozenQuestion = frozenQuestion;
	}
	public boolean isNext(Interview interview) throws Exception {
		boolean correctQ = false;
    	if((this.getFrozenQuestion().getParentID()==null)||this.getFrozenQuestion().getParentID().equalsIgnoreCase("")){
    		//use this q
    		correctQ = true;
    	}else{
    		FrozenQA fqa = new FrozenQA(this.getFrozenQuestion().getParentID());
    		PossibleAnswer pa = new PossibleAnswer("",fqa.getJsmQuestionPossibleAnswerStructureId());
    		if(!(pa.getJsmQuestionStructureID().equalsIgnoreCase(""))){ //question not removed   			   		
	    		Question pq = new Question("",pa.getJsmQuestionStructureID());
	    		pq.setInterviewID(interview.getId());
	    		for(PossibleAnswer pa1:pq.getAnswers()){
	    			if(pa1.getJsmQuestionPossibleAnswerStructureID().equalsIgnoreCase(this.getParentID())){
	    				//use this q
	    				correctQ = true;
	    			}
	    		}
    		}
    	}
		return correctQ;
	}
	
    public void save() throws Exception {
    }
	public String getSequenceFull() throws Exception {
		String retValue = "";
		Question question = this;
		int iSeq = Integer.parseInt(question.getSequence())+1;
		retValue = String.valueOf(iSeq);
		int i=0;
		while(!(question.getParentID().equalsIgnoreCase(Question.ROOTPARENTID))){
			question = new Question("",question.getParentQuestionID());
			int iSeqc = Integer.parseInt(question.getSequence())+1;
			retValue = iSeqc+"."+retValue;
			if(i>100){
				throw new Exception("Possible circular reference on parent question Id");
			}
			i++;
		}
		return retValue;
	}
	public ArrayList<Question> getQuestionListSearch(JobSpecificModule jsm, String search) throws Exception {
		ResultSet rs = null;
		ArrayList<Question> questions = new ArrayList<Question>();
		String sqlJSMClause = "";
		if(jsm!=null){
			sqlJSMClause = " AND smquestionstructure.jsmid = "+jsm.getId();
		}
		String sqlSearchClause = "";
		if(!(search.trim().equalsIgnoreCase(""))){
			sqlSearchClause = " AND ((question.name) Like '%"+this.escapeSpecialCharacters(search)+"%')";
		}
		String strSQL = "SELECT question.name, jsmquestionstructure.id, jsmquestionstructure.questionid, jsmquestionstructure.parentid, jsmquestionstructure.ismultiple, jsmquestionstructure.sequence" +
				" FROM jsmquestionstructure INNER JOIN question ON jsmquestionstructure.questionid = question.id " +
				" WHERE 1=1 "+sqlSearchClause+" "+sqlJSMClause +" ORDER BY question.name";
		rs = this.sqlExecuteSelect(strSQL);
		if (rs != null) {
			while (rs.next()) {
				String qid = rs.getString("questionid");
				String linkedqid = rs.getString("id");
				Question question = new Question();
				question.setId(qid);
				question.setJsmStructureQuestionID(linkedqid);
				question.setSequence(rs.getString("sequence"));
				question.setName(rs.getString("name"));
				questions.add(question);
			}
			if (rs.getStatement() != null) {
				rs.getStatement().close();
			}
			rs.close();
		}
		this.closeConnection();
		for(Question q:questions){
			q.getPersistentStructureObject();
		}
		return questions;
	}

}
