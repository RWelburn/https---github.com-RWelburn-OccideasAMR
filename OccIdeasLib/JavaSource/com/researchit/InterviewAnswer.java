/**
 * Version:
 *     $Id: InterviewAnswer.java,v 1.4 2008/08/25 01:37:20 ray.welburn Exp $
 *
 * Revisions:
 *     $Log: InterviewAnswer.java,v $
 *     Revision 1.4  2008/08/25 01:37:20  ray.welburn
 *     Updates to use single dbobject and participant status table
 *
 *     Revision 1.3  2008/05/26 08:22:04  troy.sadkowsky
 *     Removed old code
 *
 *     Revision 1.2  2007/06/12 05:17:42  Troy.Sadkowsky
 *     restructured and enhancements of rules
 *
 *     Revision 1.1  2006/09/25 12:45:55  admin
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

import com.researchit.common.DBBaseObject;

public class InterviewAnswer extends DBBaseObject {	

	private String questionId;
	private String jsmQuestionStructureId;
	private String jsmOldQuestionStructureId;
	private String possibleAnswerId;
	private String jsmQuestionPossibleAnswerStructureId;
	private String questionDescription;
	private String answerDescription;
	private String sequence;
	private String jsmInterviewId;
	
	public String getAnswerDescription() {
		return answerDescription;
	}
	public void setAnswerDescription(String answerDescription) {
		this.answerDescription = answerDescription;
	}
	public String getJsmInterviewId() {
		return jsmInterviewId;
	}
	public void setJsmInterviewId(String jsmInterviewId) {
		this.jsmInterviewId = jsmInterviewId;
	}
	public String getJsmQuestionPossibleAnswerStructureId() {
		return jsmQuestionPossibleAnswerStructureId;
	}
	public void setJsmQuestionPossibleAnswerStructureId(
			String jsmQuestionPossibleAnswerStructureId) {
		this.jsmQuestionPossibleAnswerStructureId = jsmQuestionPossibleAnswerStructureId;
	}
	public String getJsmQuestionStructureId() {
		return jsmQuestionStructureId;
	}
	public void setJsmQuestionStructureId(String jsmQuestionStructureId) {
		this.jsmQuestionStructureId = jsmQuestionStructureId;
	}
	public String getPossibleAnswerId() {
		return possibleAnswerId;
	}
	public void setPossibleAnswerId(String possibleAnswerId) {
		this.possibleAnswerId = possibleAnswerId;
	}
	public String getQuestionDescription() {
		return questionDescription;
	}
	public void setQuestionDescription(String questionDescription) {
		this.questionDescription = questionDescription;
	}
	public String getQuestionId() {
		return questionId;
	}
	public void setQuestionId(String questionId) {
		this.questionId = questionId;
	}
	public String getSequence() {
		return sequence;
	}
	public void setSequence(String sequence) {
		this.sequence = sequence;
	}
	public InterviewAnswer() {
		super();
	}
	public InterviewAnswer(String dbID) throws Exception {
		super();
		if ((dbID != null) && (!(dbID.equalsIgnoreCase("")))) {
			this.setId(dbID);
			this.getPersistentObject();
		}
	}
	public void insert() throws Exception {
		if (!(this.exists())) {
			String strSQL = "INSERT INTO jsminterviewanswers (questionid,jsmquestionstructureid,possibleanswerid,jsmquestionpossibleanswerstructureid,questiondescription,answerdescription,sequence,jsminterviewid) VALUES("
					+ this.getQuestionId()
					+ ","
					+ this.getJsmQuestionStructureId()
					+ ","
					+ this.getPossibleAnswerId()
					+ ","
					+ this.getJsmQuestionPossibleAnswerStructureId()
					+ ",'"
					+ this.escapeSpecialCharacters(this.getQuestionDescription())
					+ "','"
					+ this.escapeSpecialCharacters(this.getAnswerDescription())
					+ "',"
					+ this.getSequence()
					+ ","
					+ this.getJsmInterviewId()
					+ ")";
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
		String strSQL = "UPDATE agentassessments SET questionid = "
					+ this.getQuestionId()
					+ ",jsmquestionstructureid = "
					+ this.getJsmQuestionStructureId()
					+ ",possibleanswerid = "
					+ this.getPossibleAnswerId()
					+ ",jsmquestionpossibleanswerstructureid = "
					+ this.getJsmQuestionPossibleAnswerStructureId()
					+ ",questiondescription = '"
					+ this.escapeSpecialCharacters(this.getQuestionDescription())
					+ "',answerdescription = '"
					+ this.escapeSpecialCharacters(this.getAnswerDescription())
					+ "',sequence = "
					+ this.getSequence()
					+ ",jsminterviewid = "
					+ this.getJsmInterviewId()
					+ ") WHERE id = " + this.getId();
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
		String strSQL = "SELECT id FROM agent WHERE name = '"
				+ this.getName().replaceAll("'", "''") + "'";
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
		String strSQL = "DELETE FROM agent WHERE id = " + this.getId();
		try {
			this.sqlExecuteUpdate(strSQL);
		} catch (SQLException e) {
			throw new Exception(e.getMessage());
		} finally {
			this.closeConnection();
		}
	}
	public void getPersistentObject() throws Exception {
		String strSQL = "SELECT id, questionid, jsmquestionstructureid, jsmoldquestionstructureid, possibleanswerid," +
				" jsmquestionpossibleanswerstructureid, questiondescription, answerdescription, sequence,jsminterviewid" +
				" FROM  jsminterviewanswers WHERE id = "
				+ this.getId();
		ResultSet rs = null;
		try {
			rs = this.sqlExecuteSelect(strSQL);
			if (rs != null) {
				if (rs.next()) {
					this.setId(rs.getString("id"));
					this.setQuestionId(rs.getString("questionid"));
					this.setJsmQuestionStructureId(rs.getString("jsmquestionstructureid"));
					this.setJsmOldQuestionStructureId(rs.getString("jsmoldquestionstructureid"));
					this.setPossibleAnswerId(rs.getString("possibleanswerid"));
					this.setJsmQuestionPossibleAnswerStructureId(rs.getString("jsmquestionpossibleanswerstructureid"));
					this.setQuestionDescription(rs.getString("questiondescription"));
					this.setAnswerDescription(rs.getString("answerdescription"));
					this.setSequence(rs.getString("sequence"));
					this.setJsmInterviewId(rs.getString("jsminterviewid"));
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
	public void updateOldQuestionId(String oldQuestionID) throws Exception {
		String strSQL = "UPDATE jsminterviewanswers SET jsmoldquestionstructureid="
			+ oldQuestionID + " WHERE id = " + this.getId();
		this.sqlExecuteUpdate(strSQL);
	}
	public String getJsmOldQuestionStructureId() {
		return jsmOldQuestionStructureId;
	}
	public void setJsmOldQuestionStructureId(String jsmOldQuestionStructureId) {
		this.jsmOldQuestionStructureId = jsmOldQuestionStructureId;
	}
}