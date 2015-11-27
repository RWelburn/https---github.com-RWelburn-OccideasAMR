/**
 * Version:
 *     $Id: PossibleAnswer.java,v 1.44 2009/05/27 02:00:44 troy.sadkowsky Exp $
 *
 * Revisions:
 *     $Log: PossibleAnswer.java,v $
 *     Revision 1.44  2009/05/27 02:00:44  troy.sadkowsky
 *     bug fix 814 3cat frequency hours
 *
 *     Revision 1.43  2008/08/25 01:37:20  ray.welburn
 *     Updates to use single dbobject and participant status table
 *
 *     Revision 1.42  2008/08/11 01:50:48  ray.welburn
 *     move study object to common package
 *
 *     Revision 1.41  2008/07/23 00:14:40  troy.sadkowsky
 *     flat file frozen jsm
 *
 *     Revision 1.40  2008/07/22 06:54:44  ray.welburn
 *     integration changes for new interface
 *
 *     Revision 1.39  2008/07/18 06:06:02  troy.sadkowsky
 *     new flat frozen jsm
 *
 *     Revision 1.38  2008/06/29 23:22:08  troy.sadkowsky
 *     enhanced export function
 *
 *     Revision 1.37  2008/06/27 04:00:29  ray.welburn
 *     Remove brackets from sql statements
 *
 *     Revision 1.36  2008/06/11 00:37:25  troy.sadkowsky
 *     refactor insert and updates
 *
 *     Revision 1.35  2008/06/04 00:51:29  troy.sadkowsky
 *     removed jsmid pa attribute
 *
 *     Revision 1.34  2008/05/26 08:21:59  troy.sadkowsky
 *     Removed old code
 *
 *     Revision 1.33  2008/04/22 23:21:26  troy.sadkowsky
 *     new assessment requirements
 *
 *     Revision 1.32  2008/04/22 10:29:12  ray.welburn
 *     Changes to copying and pasting q's and a's
 *
 *     Revision 1.31  2008/03/24 23:23:21  troy.sadkowsky
 *     remove the ability to update strucutre links, the system requires removal and insert to accomplish a move
 *
 *     Revision 1.30  2008/02/12 15:03:02  troy.sadkowsky
 *     shared questions and answers
 *
 *     Revision 1.29  2008/02/08 07:36:48  troy.sadkowsky
 *     build v1.71 updates
 *
 *     Revision 1.28  2008/01/24 11:20:11  troy.sadkowsky
 *     rett participant interview status
 *
 *     Revision 1.27  2008/01/15 13:50:17  troy.sadkowsky
 *     connection problem and ajsm links
 *
 *     Revision 1.26  2008/01/15 12:14:47  troy.sadkowsky
 *     speed up rule view
 *
 *     Revision 1.25  2008/01/11 04:04:11  troy.sadkowsky
 *     show with parent
 *
 *     Revision 1.24  2007/12/11 14:08:05  troy.sadkowsky
 *     new view with parent option at interview
 *
 *     Revision 1.23  2007/11/04 12:06:27  troy.sadkowsky
 *     assessment report
 *
 *     Revision 1.22  2007/11/02 01:38:08  troy.sadkowsky
 *     searches and showing participant lists
 *
 *     Revision 1.21  2007/10/25 23:58:00  troy.sadkowsky
 *     removed old code and removed share conn on updates and selects
 *
 *     Revision 1.20  2007/10/18 23:10:15  troy.sadkowsky
 *     new import functions
 *
 *     Revision 1.19  2007/10/15 05:52:32  troy.sadkowsky
 *     new function isInRule
 *
 *     Revision 1.18  2007/10/09 07:21:08  troy.sadkowsky
 *     auto create study specific jsms
 *
 *     Revision 1.17  2007/08/16 23:44:30  ray.welburn
 *     Added flag for if child questions should be shown
 *
 *     Revision 1.16  2007/07/28 01:32:46  troy.sadkowsky
 *     agent description updates and clean mql
 *
 *     Revision 1.15  2007/07/17 23:59:40  troy.sadkowsky
 *     new hasfrequencyand getfrequencyquestion functions
 *
 *     Revision 1.14  2007/07/15 23:11:11  troy.sadkowsky
 *     bug fix for oder of possible answers
 *
 *     Revision 1.13  2007/06/03 02:46:32  Jeff.Keys
 *     JSM search
 *
 *     Revision 1.12  2007/05/03 13:52:45  Troy.Sadkowsky
 *     dynamic rule creation
 *
 *     Revision 1.11  2007/04/25 21:56:21  Troy.Sadkowsky
 *     made dbobject sortable and removed old objects and functions
 *
 *     Revision 1.10  2006/11/24 23:02:29  admin
 *     updates before demo
 *
 *     Revision 1.9  2006/11/15 07:30:39  admin
 *     build v1.10
 *
 *     Revision 1.8  2006/10/31 21:09:27  admin
 *     build v1.08
 *
 *     Revision 1.7  2006/09/25 12:45:53  admin
 *     Iteration 28 changes
 *
 *     Revision 1.6  2006/08/09 04:19:30  admin
 *     new feature, ability to update answers at assesment level
 *
 *     Revision 1.5  2006/07/27 23:19:11  admin
 *     version 1.02
 *
 *     Revision 1.4  2006/07/19 00:43:44  admin
 *     fixed search and associate jsm link
 *
 *     Revision 1.3  2006/06/30 05:55:14  administrator
 *     updates for rework
 *
 *     Revision 1.2  2006/06/29 05:49:00  administrator
 *     updates for rework
 *
 *     Revision 1.1  2006/06/07 07:07:27  administrator
 *     updates for rework
 *
 *     Revision 1.4  2006/06/05 02:22:08  administrator
 *     restructure progress
 *
 *     Revision 1.3  2006/05/31 07:15:34  administrator
 *     updates for rework
 *
 *     Revision 1.2  2006/05/23 23:22:13  administrator
 *     restructure progress
 *
 *     Revision 1.1  2006/05/22 06:06:01  administrator
 *     Version 2
 *
 *     Revision 1.22  2006/04/27 02:03:18  administrator
 *     override equals
 *
 *     Revision 1.21  2006/04/04 02:13:15  administrator
 *     cleaned show all questions function
 *
 *     Revision 1.20  2006/03/29 02:25:53  administrator
 *     updates for exposure assessment
 *
 *     Revision 1.19  2006/03/21 22:18:07  administrator
 *     work on connections
 *
 *     Revision 1.18  2006/03/21 22:10:08  administrator
 *     autocheck on dropdown for interview display
 *
 *     Revision 1.17  2006/03/13 04:02:40  administrator
 *     tidied code
 *
 *     Revision 1.16  2006/03/03 07:10:40  administrator
 *     get next question with rules
 *
 *     Revision 1.15  2006/03/02 23:19:34  administrator
 *     changed objects to throw excpetions not throwables
 *
 *     Revision 1.14  2006/02/24 06:28:49  administrator
 *     attempt to fix connection bug
 *
 *     Revision 1.13  2006/02/24 04:44:14  administrator
 *     work on connection problem
 *
 *     Revision 1.12  2006/02/23 07:11:59  administrator
 *     attempt to fix connection bug
 *
 *     Revision 1.11  2006/02/23 04:04:26  administrator
 *     altered display of questions
 *
 *     Revision 1.10  2006/02/17 06:37:39  administrator
 *     new fields for notes and multiple answer questions
 *
 *     Revision 1.9  2006/02/16 22:44:06  administrator
 *     new connection pool
 *
 *     Revision 1.8  2006/02/06 22:27:59  administrator
 *     increased size for description short
 *
 *     Revision 1.7  2006/02/02 08:50:26  administrator
 *     bug fix for linking questions
 *
 *     Revision 1.6  2006/02/01 06:49:58  administrator
 *     fixed scrolling through questions applying rules
 *
 *     Revision 1.5  2006/01/30 06:32:33  administrator
 *     move up to parent functions
 *
 *     Revision 1.4  2006/01/17 23:53:18  administrator
 *     new functions for saving interview answers
 *
 *     Revision 1.3  2006/01/11 10:15:37  administrator
 *     more error checking on import
 *
 *     Revision 1.2  2005/11/29 05:24:45  administrator
 *     green rules
 *
 *     Revision 1.1  2005/11/16 05:28:39  administrator
 *     new library to share amongst mql, ims and ams
 *
 *     Revision 1.30  2005/11/04 07:26:42  administrator
 *     jsm upload and import
 *
 *     Revision 1.29  2005/11/04 01:13:53  administrator
 *     change made for sequencing bug
 *
 *     Revision 1.28  2005/11/02 02:41:44  administrator
 *     Implemented Toggle feature for chemicals and rules
 *
 *     Revision 1.27  2005/11/01 22:42:44  administrator
 *     prep for M1
 *
 *     Revision 1.26  2005/10/20 05:48:11  administrator
 *     ability to delete JSM
 *
 *     Revision 1.25  2005/10/11 22:11:33  administrator
 *     Floating action buttons, multiple chemicals and import function
 *
 *     Revision 1.24  2005/10/10 07:10:21  administrator
 *     implemented sequence change functionality
 *
 *     Revision 1.23  2005/09/30 00:25:59  administrator
 *     unify the interface and enhancement on action buttons
 *
 *     Revision 1.22  2005/09/14 04:29:13  administrator
 *     feature for creating rules
 *
 *     Revision 1.21  2005/09/13 23:20:32  administrator
 *     main action buttons
 *
 *     Revision 1.20  2005/09/09 07:09:36  administrator
 *     Tidy up interface
 *
 *     Revision 1.19  2005/09/08 22:45:04  administrator
 *     reworked objects for job association
 *
 *     Revision 1.18  2005/09/02 07:15:55  administrator
 *     have way through new relationships restructure
 *
 *     Revision 1.17  2005/08/29 04:44:39  administrator
 *     fixed structure functions
 *
 *     Revision 1.16  2005/08/24 03:42:08  administrator
 *     Connection is static and stays open
 *
 *     Revision 1.15  2005/08/24 03:04:14  administrator
 *     tidy up before conn bug fix
 *
 *     Revision 1.14  2005/08/24 01:35:57  administrator
 *     chemicals working with setting all levels
 *
 *     Revision 1.13  2005/08/23 23:34:51  administrator
 *     Chemical Associations
 *
 *     Revision 1.12  2005/08/22 10:11:34  administrator
 *     fixed child parent relationships
 *
 *     Revision 1.11  2005/08/22 05:55:53  administrator
 *     reworked connection method to close on overridden finalize
 *
 *     Revision 1.10  2005/08/22 03:55:25  administrator
 *     importer and furhter restructure with frames
 *
 *     Revision 1.9  2005/08/12 06:54:25  administrator
 *     import function
 *
 *     Revision 1.8  2005/08/12 00:58:22  administrator
 *     show all answers and questions
 *
 *     Revision 1.7  2005/08/05 03:27:32  administrator
 *     M1
 *
 *     Revision 1.6  2005/08/04 23:52:26  administrator
 *     Rules
 *
 *     Revision 1.5  2005/08/04 07:13:09  administrator
 *     structure removing
 *
 *     Revision 1.4  2005/08/04 04:22:56  administrator
 *     half implemented tab feature
 *
 *     Revision 1.3  2005/07/29 02:20:23  administrator
 *     fixed tree closing bug
 *
 *     Revision 1.2  2005/07/29 01:10:13  administrator
 *     table format of questions and answers
 *
 *     Revision 1.1  2005/07/21 23:48:21  administrator
 *     new answer object and database structure change
 *
 *     
 */
package com.researchit;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.researchit.common.DBBaseObject;
import com.researchit.common.Study;
import com.researchit.expert.ExpertRule;

public class PossibleAnswer extends DBBaseObject {

    private String sequence = "";
//    private String jsmID = "";
    private String jsmName = "";
    private ArrayList<Question> childQuestions;
    private String jsmQuestionPossibleAnswerStructureID = "";
    private String frozenPossibleAnswerID = "";
    private String jsmQuestionStructureID = "";
    private String interviewID = "";
    private String actualAnswer = "";   
    private boolean showChildQuestions = true;

    public ArrayList<Question> getChildQuestions() throws Exception {
        if (this.childQuestions == null) {
            if ((this.getJsmQuestionPossibleAnswerStructureID() != null)
                    && (!(this.getJsmQuestionPossibleAnswerStructureID().equalsIgnoreCase("")))) {
                this.getPersistentChildQuestions();
            } else {
                throw new Exception("Cannot get child questions from unlinked Possible Answer");
            }
        }
        return childQuestions;
    }
    public ArrayList<Question> getChildQuestions(String agentId) throws Exception {
    	ArrayList<Question> questions = new ArrayList<Question>();
        String strSQL = "SELECT DISTINCT jsmquestionstructure.id, questionid, sequence, parentid, notes, ismultiple, jsmid"
                + " FROM jsmquestionstructure LEFT OUTER JOIN jsmquestionstructureagent ON jsmquestionstructure.id = jsmquestionstructureagent.jsmquestionstructureid WHERE (parentid = "
                + this.getJsmQuestionPossibleAnswerStructureID()
                + ") AND ((jsmquestionstructureagent.agentid IN ("+agentId+")) OR (jsmquestionstructure.ajsmid IS NOT NULL) )"
                + " ORDER BY sequence";
        ResultSet rs = this.sqlExecuteSelect(strSQL);
        if (rs != null) {
            while (rs.next()) {
                String qid = rs.getString("questionid");
                String lqid = rs.getString("id");
                String sequence = rs.getString("sequence");
                Question question = new Question();
                question.setId(qid);
                question.setJsmStructureQuestionID(lqid);
                question.setSequence(sequence);
                questions.add(question);
            }
            if (rs.getStatement() != null) {
                rs.getStatement().close();
            }
            rs.close();
        }
        this.closeConnection();
        for(Question q: questions){
        	q.getPersistentStructureObject();
        }
        return questions;
    }
    public void setChildQuestions(ArrayList<Question> childQuestions) {
        this.childQuestions = childQuestions;
    }
    public PossibleAnswer() {
        super();
    }
    public PossibleAnswer(String dbID) throws Exception {
        super();
        this.setId(dbID);
        this.getPersistentObject();
    }
    public PossibleAnswer(String id, String jqpaId) throws Exception {
        super();
        this.setId(id);
        this.setJsmQuestionPossibleAnswerStructureID(jqpaId);
        this.getPersistentLinkedObject();
    }
    public void moveUp() throws Exception {
        this.resetSequences();
        if (!(this.getSequence().equalsIgnoreCase("0"))) {
            Question parentQ = new Question("", this.getJsmQuestionStructureID());
            // set this sequence down to move up in list
            int iCurrentSeq = Integer.valueOf(this.getSequence()).intValue();
            int iSeq = iCurrentSeq - 1;
            this.setSequence(String.valueOf(iSeq));           
            // set the sequence of the one below to this pa's old sequence
            PossibleAnswer pa = (PossibleAnswer) parentQ.getPossibleAnswers().get(iSeq);
            pa.setSequence(String.valueOf(iCurrentSeq));
            //update the two sequences
            this.updateSequence();
            pa.updateSequence();
        } else {
            // put it on the parent's parent
            Question parentQ = new Question("", this.getJsmQuestionStructureID());
            if (!(parentQ.isRootQ())) {
                Question ppQ = new Question("", parentQ.getParentQuestionID());
                // this.unLinkFromParentQuestion();
                this.linkToQuestion(ppQ.getId(), ppQ.getJsmQuestionStructureID());
            }
        }
    }
    public void moveDown() throws Exception {
        this.resetSequences();
        int iCurrentSeq = Integer.valueOf(this.getSequence()).intValue();
        // get current size
        Question parentQ = new Question("", this.getJsmQuestionStructureID());
        int iSize = parentQ.getPossibleAnswers().size() - 1;
        if (iCurrentSeq != iSize) {
            int iSeq = iCurrentSeq + 1;
            this.setSequence(String.valueOf(iSeq));
            this.updateSequence();
            PossibleAnswer pa = (PossibleAnswer) parentQ.getPossibleAnswers().get(iSeq);
            pa.setSequence(String.valueOf(iCurrentSeq));
            pa.updateSequence();
        }
    }
    public void getPersistentLinkedObject() throws Exception {
        String strSQL = "";
        ResultSet rs = null;
        try {
            strSQL = "SELECT jsmqps.id, sequence, jsmquestionstructureid,  possibleanswerid, pa.name, pa.description, possibleanswertypeid"
                    + " FROM jsmquestionpossibleanswerstructure jsmqps"
                    + " INNER JOIN possibleanswer pa ON possibleanswerid = pa.id "
                    + " WHERE jsmqps.id = "
                    + this.getJsmQuestionPossibleAnswerStructureID();
            rs = this.sqlExecuteSelect(strSQL);
            if (rs != null) {
                if (rs.next()) {
                    this.setId(rs.getString("possibleanswerid"));
                    String jqsId = rs.getString("jsmquestionstructureid");
                    String jqpasId = rs.getString("id");
                    this.setJsmQuestionStructureID(jqsId);
                    this.setJsmQuestionPossibleAnswerStructureID(jqpasId);
                    this.setSequence(rs.getString("sequence"));
                    this.setName(rs.getString("name"));
                    this.setDescription(rs.getString("description"));
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
    private void getPersistentChildQuestions() throws Exception {
    	ArrayList<Question> questions = new ArrayList<Question>();
        String strSQL = "SELECT id, questionid, sequence, parentid, notes, ismultiple, jsmid"
                + " FROM jsmquestionstructure WHERE (parentid = "
                + this.getJsmQuestionPossibleAnswerStructureID()
                + ")"
                + " ORDER BY sequence";
        ResultSet rs = this.sqlExecuteSelect(strSQL);
        if (rs != null) {
            while (rs.next()) {
                String qid = rs.getString("questionid");
                String lqid = rs.getString("id");
                String sequence = rs.getString("sequence");
                Question question = new Question();
                question.setId(qid);
                question.setJsmStructureQuestionID(lqid);
                question.setSequence(sequence);
                questions.add(question);
            }
            if (rs.getStatement() != null) {
                rs.getStatement().close();
            }
            rs.close();
        }
        this.closeConnection();
        for(Question q: questions){
        	q.getPersistentStructureObject();
        }       
        this.setChildQuestions(questions);
    }
    public void getPersistentObject() throws Exception {
        String strSQL = "";
        strSQL = "SELECT id, description,name" + " FROM possibleanswer" + " WHERE id = " + this.getId();
        ResultSet rs = null;
        try {
            rs = this.sqlExecuteSelect(strSQL);
            if (rs != null) {
                if (rs.next()) {
                    this.setId(rs.getString("id"));
                    this.setDescription(rs.getString("description"));
                    this.setName(rs.getString("name"));
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
    public String getSequence() {
    	if (this.sequence.equalsIgnoreCase("")) {
			this.sequence = "0";
		}
        return sequence;
    }
    public void setSequence(String sequence) {
        this.sequence = sequence;
    }
    /*
    public void update() throws Exception{
    	String strSQL = "UPDATE possibleanswer SET description='"
            + this.escapeSpecialCharacters(this.getDescription())
            + "',name='"
            + this.escapeSpecialCharacters(this.getName())
            + "' WHERE id = "
            + this.getId();
	    try {
	        this.sqlExecuteUpdate(strSQL);
	    } catch (SQLException e) {
	        throw new Exception(e.getMessage());
	    }
    } */  
    public boolean exists() throws Exception {
    	return existsAt(null);
    }
    public boolean existsAt(Connection conn) throws Exception {
        boolean bRetValue = false;
        if (!(this.getId().equalsIgnoreCase(""))) {
            bRetValue = true;
        } else {
            String strSQL = "SELECT id FROM possibleanswer WHERE name = '" + this.getName().replaceAll("'", "''") + "'";
            ResultSet rs = null;
            try {
                rs = this.sqlExecuteSelect(strSQL,conn);
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
    public void insert() throws Exception {
    	this.export(null);
    }  
    public void export(Connection conn) throws Exception {
        if (this.getDescription().contains("?")) {
            throw new Exception("Problem with answer: " + this.getDescription());
        }
        String strSQL = "INSERT INTO possibleanswer (description,name) VALUES('"
                + this.escapeSpecialCharacters(this.getDescription())
                + "','"
                + this.escapeSpecialCharacters(this.getName())
                + "')";
        try {
            String id = String.valueOf(this.sqlExecuteInsert(strSQL,conn));
            this.setId(id);
        } catch (SQLException e) {
            throw new Exception(e.getMessage());
        }
    }
    public void delete() throws Exception {
        String strSQL = "";
        try {
            strSQL = "DELETE FROM possibleanswer WHERE id = " + this.getId();
            this.sqlExecuteUpdate(strSQL);
        } catch (SQLException e) {
            throw new Exception(e.getMessage());
        }
    }
    public ArrayList<Question> getMjsmsQuestions(String strChemIDs) throws Exception {
        ArrayList<Question> questions = new ArrayList<Question>();
        for (Question q : this.getChildQuestions()) {
            if (q.hasAgent(strChemIDs)) {
                questions.add(q);
            } else {
                if (q.isAssociateJSM()) {
                    String jsmID = q.getAssociateJSMID();
                    if (!(jsmID.equalsIgnoreCase(""))) {                       
                        JobSpecificModule jsm = new JobSpecificModule(jsmID);
                        jsm.getFullQuestions();                      
                        if (jsm.getId() != "") {
                            questions.addAll(jsm.getMjsmsQuestions(strChemIDs));
                        }
                    }
                }
            }
        }
        this.setChildQuestions(questions);
        return questions;
    }
 //   public String getJsmID() {
 //       return jsmID;
 //   }
 //   public void setJsmID(String jsmID) {
 //       this.jsmID = jsmID;
 //   }
    /*
    public void update(boolean bInsertNew) throws Exception{
    	if (this.getDescription().equalsIgnoreCase("")) {
            throw new Exception("Cannot have a possible answer with no description");
        }
        if (!(this.exists())) {
            if (bInsertNew) {
                this.insert();
            } else {
                throw new Exception("Cannot update non existing answer");
            }
        } else {
            String strSQL = "UPDATE possibleanswer SET description='"
                    + this.escapeSpecialCharacters(this.getDescription())
                    + "',name='"
                    + this.escapeSpecialCharacters(this.getName())
                    + "' WHERE id = "
                    + this.getId();
            try {
                this.sqlExecuteUpdate(strSQL);
            } catch (SQLException e) {
                 throw new Exception(e.getMessage());
            }
        }
    }  */  
    public void linkToQuestion(String questionId, String linkedQID) throws Exception {
    	this.linkToQuestion(questionId,linkedQID,null);
    }   
    public void linkToQuestion(String questionId, String linkedQID,Connection conn) throws Exception {
        if (linkedQID.equalsIgnoreCase("")) {
            throw new Exception("Cannot link non-JSM-linked question");
        }
        try {
            Question parentQ = new Question(questionId, linkedQID);
            this.setJsmQuestionStructureID(linkedQID);
            String strSQL = "";
            int iSeq = parentQ.getPossibleAnswers().size();
            this.setSequence(String.valueOf(iSeq));
            strSQL = "INSERT INTO jsmquestionpossibleanswerstructure (possibleanswerid,sequence,jsmquestionstructureid) VALUES ("
                        + this.getId()
                        + ", "
                        + this.getSequence()
                        + ", "
                        + parentQ.getJsmQuestionStructureID()
                        + ")";
            String jqpaId = String.valueOf(this.sqlExecuteInsert(strSQL,conn));
            this.setJsmQuestionPossibleAnswerStructureID(jqpaId);
            this.setJsmQuestionStructureID(parentQ.getJsmQuestionStructureID());
        //    this.setJsmID(parentQ.getJsmID());
        } catch (SQLException e) {
            throw new Exception(e.getMessage());
        }
    }
    public Integer createFrozenJSMPossibleAnswers(Question q,Integer displayOrder,Integer indentLevel) throws Exception {
        try {           
        	String strSQL = "INSERT INTO frozenjsmquestionsandpossibleanswers (parentid, indentlevel, displayorder, possibleanswerid,jsmquestionpossibleanswerstructureid,answerdescription,frozenjsmid) VALUES ("
				+ q.getFrozenQuestion().getId()
				+ ", "
				+ indentLevel
				+ ","
				+ displayOrder++
				+ ","
				+ this.getId()
				+ ","
				+ this.getJsmQuestionPossibleAnswerStructureID()
				+ ",'"
				+ this.escapeSpecialCharacters(this.getName())
				+ "', "
				+ q.getFrozenQuestion().getFrozenJSMId()
				+ ")";
            String frozenId = String.valueOf(this.sqlExecuteInsert(strSQL));
            this.setFrozenPossibleAnswerID(frozenId);
        } catch (SQLException e) {
            throw new Exception(e.getMessage());
        }
        return displayOrder;
    }
    public void linkToInterviewQuestion(String questionId, String linkedQID) throws Exception {
        if (linkedQID.equalsIgnoreCase("")) {
            throw new Exception("Cannot link non-JSM-linked question");
        }
        try {
            Question parentQ = new Question(questionId, linkedQID);
            this.setJsmQuestionStructureID(linkedQID);
            String strSQL = "";
            int iSeq = parentQ.getPossibleAnswers().size();
            this.setSequence(String.valueOf(iSeq));
            strSQL = "INSERT INTO jsmquestionpossibleanswerstructure (possibleanswerid,sequence,jsmquestionstructureid) VALUES ("
                    + this.getId()
                    + ", "
                    + this.getSequence()
                    + ", "
                    + parentQ.getJsmQuestionStructureID()
                    + ")";
            String jqpaId = String.valueOf(this.sqlExecuteInsert(strSQL));
            this.setJsmQuestionPossibleAnswerStructureID(jqpaId);
        } catch (SQLException e) {
            throw new Exception(e.getMessage());
        }
    }
    public void updateSequence() throws Exception {
        if (this.getJsmQuestionPossibleAnswerStructureID().equalsIgnoreCase("")) {
            throw new Exception("Cannot update sequence of non-JSM-linked question");
        }
        try {
            String strSQL = "UPDATE jsmquestionpossibleanswerstructure SET sequence = "
                    + this.getSequence()
                    + " WHERE id = "
                    + this.getJsmQuestionPossibleAnswerStructureID();
            this.sqlExecuteUpdate(strSQL);
        } catch (SQLException e) {
            throw new Exception(e.getMessage());
        }
    }
    public void updateSequence(Connection conn) throws Exception {
        if (this.getJsmQuestionPossibleAnswerStructureID().equalsIgnoreCase("")) {
            throw new Exception("Cannot update sequence of non-JSM-linked question");
        }
        try {
            String strSQL = "UPDATE jsmquestionpossibleanswerstructure SET sequence = "
                    + this.getSequence()
                    + " WHERE id = "
                    + this.getJsmQuestionPossibleAnswerStructureID();
            this.sqlExecuteUpdate(strSQL, conn);
        } catch (SQLException e) {
            throw new Exception(e.getMessage());
        }
    }
    public void removeChildQuestions() throws Exception {
        for (Question q : this.getChildQuestions()) {           
            q.removeAllAgents();
            q.removeLinkedPossibleAnswers();
            q.unLinkFromPossibleAnswer(this.getJsmQuestionPossibleAnswerStructureID());

        }
    }
    public void unLinkFromQuestion(String linkedQuestionID2) throws Exception {
        if (linkedQuestionID2.equalsIgnoreCase("")) {
            throw new Exception("Cannot link non existing jqpaid");
        }
        try {
            String strSQL = "DELETE FROM jsmquestionpossibleanswerstructure WHERE jsmquestionstructureid = "
                    + linkedQuestionID2;
            this.sqlExecuteUpdate(strSQL);
        } catch (SQLException e) {
            throw new Exception(e.getMessage());
        }
    }
    public void unLinkFromParentQuestion() throws Exception {
        if (this.getJsmQuestionPossibleAnswerStructureID().equalsIgnoreCase("")) {
            throw new Exception("Cannot link non existing jqpaid");
        }
        try {
            String strSQL = "DELETE FROM jsmquestionpossibleanswerstructure WHERE id = "
                    + this.getJsmQuestionPossibleAnswerStructureID();
            this.sqlExecuteUpdate(strSQL);
            this.setJsmQuestionPossibleAnswerStructureID("");
        } catch (SQLException e) {
            throw new Exception(e.getMessage());
        }
    }
    private void resetSequences() throws Exception {
        // get all possible answers in this group and reset sequences
        Question parentQ = new Question("", this.getJsmQuestionStructureID());
        int i = 0;
        for (PossibleAnswer pa : parentQ.getPossibleAnswers()) {
            pa.setSequence(String.valueOf(i));
            pa.updateSequence();
            if (pa.getJsmQuestionPossibleAnswerStructureID().equalsIgnoreCase(
                this.getJsmQuestionPossibleAnswerStructureID())) {
                this.setSequence(String.valueOf(i));
            }
            i++;
        }
    }
    public void copyTo(String linkedQuestionID2,Study study) throws Exception {
        this.setJsmQuestionPossibleAnswerStructureID("");
        this.linkToQuestion("", linkedQuestionID2);
        if(study==null){
        	for (Question q : this.getChildQuestions()) {
        		q.copyTo(this.getJsmQuestionPossibleAnswerStructureID());
        	}
        }else{
        	for (Question q : this.getMjsmsQuestions(study.getAgentIDs())) {
        		q.copyTo(this.getJsmQuestionPossibleAnswerStructureID(),study);
        	}
        }        
    }
    public void copyTo(String linkedQuestionID2) throws Exception {
    	copyTo(linkedQuestionID2,null);
    }
    public boolean isFreeText() {
        boolean retValue = false;
        if (this.getName().toUpperCase().contains("[FREE TEXT]")) {
            retValue = true;
        }
        return retValue;
    }
    public boolean isNumber() {
        boolean retValue = false;
        if (this.getName().toUpperCase().contains("[NUMBER")) {
            retValue = true;
        }
        return retValue;
    }
    public void getFullChildQuestion() throws Exception {
        for (Question q : this.getChildQuestions()) {
            q.getFullPossibleAnswers();
        }
    }
    
    public boolean equals(Object obj) {
        boolean retValue = false;
        if (super.equals(obj)) {
            if (this.getClass().equals(obj.getClass())) {
                PossibleAnswer pa = (PossibleAnswer) obj;
                if (pa.getId().equalsIgnoreCase(this.getId())) {
                    retValue = true;
                }
            }
        } else {
            retValue = false;
        }
        return retValue;
    }
    
    public int hashCode() {
        return super.hashCode();
    }
    public String getJsmQuestionPossibleAnswerStructureID() {
        return jsmQuestionPossibleAnswerStructureID;
    }
    public void setJsmQuestionPossibleAnswerStructureID(String jsmQuestionPossibleAnswerStructureID) {
        this.jsmQuestionPossibleAnswerStructureID = jsmQuestionPossibleAnswerStructureID;
    }
    public String getJsmQuestionStructureID() {
        return jsmQuestionStructureID;
    }
    public void setJsmQuestionStructureID(String jsmQuestionStructureID) {
        this.jsmQuestionStructureID = jsmQuestionStructureID;
    }   
    public ArrayList<PossibleAnswer> getPossibleAnswers(String strFilter) throws Exception {
		ArrayList<PossibleAnswer> pas = new ArrayList<PossibleAnswer>();		
		String strSQL = "SELECT possibleanswer.id, possibleanswer.name, possibleanswer.description FROM possibleanswer "+strFilter+" ORDER BY possibleanswer.name";
		ResultSet rs = null;
		try {
			rs = this.sqlExecuteSelect(strSQL);
			if (rs != null) {
				while (rs.next()) {
					PossibleAnswer pa = new PossibleAnswer();
					pa.setId(rs.getString("id"));
					pa.setName(rs.getString("name"));
					pa.setDescription(rs.getString("description"));
					pas.add(pa);
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
		return pas;
	}
	public String getJsmName() {
		return jsmName;
	}
	public void setJsmName(String jsmName) {
		this.jsmName = jsmName;
	}
	public String getInterviewID() {
		return interviewID;
	}
	public void setInterviewID(String interviewID) {
		this.interviewID = interviewID;
	}
	public PossibleAnswer getSkippedPossibleAnswer() throws Exception {
		PossibleAnswer pa = new PossibleAnswer();
		pa.setName("skipped");
		pa.setDescription("skipped");
		pa.setActualAnswer("skipped");
		if(!(pa.exists())){
			pa.insert();
		}
		pa.setJsmQuestionPossibleAnswerStructureID("NULL");
		pa.setSequence("0");
		return pa;
	}
	public int compareTo(Question o) {		
		return this.getSequence().compareTo(o.getSequence()); 
	}
	public ArrayList<JobSpecificModule> getAssociateModules() throws Exception {
		ArrayList<JobSpecificModule> ajsms = new ArrayList<JobSpecificModule>();
		for(Question q: this.getChildQuestions()){
			if(q.isAssociateJSM()){
				JobSpecificModule jsm = new JobSpecificModule(q.getAssociateJSMID());
				ajsms.add(jsm);
			}
		}
		return ajsms;
	}
	public boolean hasFrequencyQuestions() throws Exception {
		boolean retValue = false;
		if(this.getChildQuestions().size()>0){
			if(this.getChildQuestions().get(0).getTypeID().equalsIgnoreCase(Question.FREQUENCY)){
				retValue = true;
			}else {
				for(Question q:this.getChildQuestions()){
					if(q.isViewWithParent()){
						retValue = true;
					}
				}
			}
		}
		return retValue;
	}
	//Assumption: Frequency weeks must be the first child question
	public Question getFrequencyWeeksQuestion() throws Exception {
		Question retValue = null;
		if(this.getChildQuestions().size()>0){
			if(this.getChildQuestions().get(0).getTypeID().equalsIgnoreCase(Question.FREQUENCY)){
				retValue = this.getChildQuestions().get(0);
			}
		}
		return retValue;
	}
	//Assumption: Frequency hours must be the second level child question
	public Question getFrequencyHoursQuestion() throws Exception {
		Question retValue = null;
		if(this.getChildQuestions().size()>0){
			if(this.getChildQuestions().get(0).getTypeID().equalsIgnoreCase(Question.FREQUENCY)){
				Question pq = this.getChildQuestions().get(0);
				if(pq.getChildQuestions().size()>0){
					if(pq.getChildQuestions().get(0).getTypeID().equalsIgnoreCase(Question.FREQUENCY)){
						retValue = pq.getChildQuestions().get(0);
					}
				}
			}
		}
		return retValue;
	}
	public boolean isShowChildQuestions() {
		return showChildQuestions;
	}
	public void setShowChildQuestions(boolean showChildQuestions) {
		this.showChildQuestions = showChildQuestions;
	}
	public boolean isInRule(ExpertRule er) throws Exception {
		boolean retValue = false;
		Question pq = new Question("",this.getJsmQuestionStructureID());
		ResultSet rs = null;		
		String strSQL = "";			
		strSQL = "SELECT rule.id, factrequirements.questionid, question.name" +
		" FROM agent INNER JOIN" +
		" rule ON agent.id = rule.agentid INNER JOIN" +
		" rulefacts ON rule.id = rulefacts.ruleid INNER JOIN" +
		" fact ON rulefacts.factid = fact.id INNER JOIN" +
		" factrequirements ON fact.id = factrequirements.factid INNER JOIN" +
		" question ON factrequirements.questionid = question.id" +
		" WHERE (agent.id = "+er.getAgentId()+") AND (factrequirements.questionid = "+pq.getId()+") AND (factrequirements.answerid = "+this.getId()+") AND (rule.id = "+er.getId()+")";			
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
		this.closeConnection();
		return retValue;
	}
	public String getActualAnswer() {
		return actualAnswer;
	}
	public void setActualAnswer(String actualAnswer) {
		this.actualAnswer = actualAnswer;
	}
	public boolean isValidFrequency() {
		boolean retValue = false;
		try {
			Integer actualValue = Integer.parseInt(this.getActualAnswer());			
			Interview interview = new Interview(this.getInterviewID());
			JobHistory jh = new JobHistory(interview.getJobHistoryId());
			Question q = new Question("",this.getJsmQuestionStructureID());
			if(q.getTypeID().equalsIgnoreCase(Question.FREQUENCY)){
				if(q.getName().contains("weeks")){
					Float jhWeeksValue = jh.getWeeksPerYear();
					if(actualValue<=jhWeeksValue){
						retValue = true;
					}
				}else if(q.getName().contains("hours")){
					Float jhHoursValue = jh.getHoursPerWeek();
					if(actualValue==1111){
						retValue = true;
					}else if(actualValue==2222){
						if(jhHoursValue<5){
							retValue = true;
						}
					}else if(actualValue==3333){
						if(jhHoursValue<30){
							retValue = true;
						}
					}else if(actualValue<=jhHoursValue){
						retValue = true;
					}
				}
			}	
		} catch (Exception e) {			
			e.printStackTrace();
		}
		return retValue;
	}
	public void update1() throws Exception {
		if (this.getDescription().equalsIgnoreCase("")) {
            throw new Exception("Cannot have a possible answer with no description");
        }        
        String strSQL = "UPDATE possibleanswer SET description='"
                + this.escapeSpecialCharacters(this.getDescription())
                + "',name='"
                + this.escapeSpecialCharacters(this.getName())
                + "' WHERE id = "
                + this.getId();
        try {
            this.sqlExecuteUpdate(strSQL);
        } catch (SQLException e) {
            throw new Exception(e.getMessage());
        }       
	}
	public boolean isShared() throws Exception {
		boolean bRetValue = false;
		String sql = "SELECT possibleanswer.id, Count(jsmquestionpossibleanswerstructure.id) AS CountOfid FROM possibleanswer INNER JOIN jsmquestionpossibleanswerstructure ON possibleanswer.id = jsmquestionpossibleanswerstructure.possibleanswerid GROUP BY possibleanswer.id HAVING (((possibleanswer.id)="+this.getId()+") AND ((Count(jsmquestionpossibleanswerstructure.id))>1))";
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
	public String getFrozenPossibleAnswerID() {
		return frozenPossibleAnswerID;
	}
	public void setFrozenPossibleAnswerID(String frozenPossibleAnswerID) {
		this.frozenPossibleAnswerID = frozenPossibleAnswerID;
	}
	
    public void save() throws Exception {
    }
	public boolean isOnFrequencyQuestion() {
		boolean retValue = false;
		try{
			Question pQ = new Question("",this.getJsmQuestionStructureID());
			if(pQ.getTypeID().equalsIgnoreCase(Question.FREQUENCY)){
				retValue = true;
			}
		}catch(Exception e){
//			To Do deal with e.getMessage());
		}
		return retValue;
	}
}
