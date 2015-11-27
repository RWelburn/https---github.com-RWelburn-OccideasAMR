/**
 * Version:
 *     $Id$
 *
 * Revisions:
 *     $Log$
 *     Revision 1.3  2008/09/10 09:11:35  troy.sadkowsky
 *     ASsessment updates
 *
 *     Revision 1.2  2008/08/25 01:37:18  ray.welburn
 *     Updates to use single dbobject and participant status table
 *
 *     Revision 1.1  2008/07/18 06:06:02  troy.sadkowsky
 *     new flat frozen jsm
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

import com.researchit.common.DBBaseObject;


public class FrozenQA extends DBBaseObject {

	private String parentID = "";
	private Integer indentLevel;
	private Integer displayOrder;
	private String questionId = "";
	private String jsmQuestionStructureId = "";
	private String questionName = "";
	private String questionDescription = "";
	private String possibleAnswerId = "";
	private String jsmQuestionPossibleAnswerStructureId = "";
	private String answerDescription = "";
	private String questionNotes = "";
	private boolean viewWithParent;
	private boolean multiple;
	private String frozenJSMId = "";
	
	public FrozenQA() {
		super();
	}
	public FrozenQA(String dbID) throws Exception {
		super();
		this.setId(dbID);
		this.getPersistentObject();
	}
	protected void getPersistentObject() throws Exception {
		String strSQL = "SELECT * FROM frozenjsmquestionsandpossibleanswers WHERE id = "
				+ this.getId();
		ResultSet rs = null;
		try {
			rs = this.sqlExecuteSelect(strSQL);
			if (rs != null) {
				if (rs.next()) {
					this.setId(rs.getString("id"));
					this.setParentID(rs.getString("parentid"));
					this.setIndentLevel(rs.getInt("indentlevel"));
					this.setDisplayOrder(rs.getInt("displayorder"));
					this.setQuestionId(rs.getString("questionid"));
					this.setJsmQuestionStructureId(rs.getString("jsmquestionstructureid"));
					this.setQuestionName(rs.getString("questionname"));
					this.setQuestionDescription(rs.getString("questiondescription"));
					this.setPossibleAnswerId(rs.getString("possibleanswerid"));
					this.setJsmQuestionPossibleAnswerStructureId(rs.getString("jsmquestionpossibleanswerstructureid"));
					this.setAnswerDescription(rs.getString("answerdescription"));
					this.setQuestionNotes(rs.getString("questionnotes"));
					this.setViewWithParent(rs.getBoolean("viewwithparent"));
					this.setMultiple(rs.getBoolean("ismultiple"));
					this.setFrozenJSMId(rs.getString("frozenjsmid"));
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
		return parentID;
	}
	public void setParentID(String parentID) {
		this.parentID = parentID;
	}
	public boolean isViewWithParent() {
		return viewWithParent;
	}
	public void setViewWithParent(boolean showChildren) {
		this.viewWithParent = showChildren;
	}
	public boolean isMultiple() {
		return multiple;
	}
	public String getAnswerDescription() {
		return answerDescription;
	}
	public void setAnswerDescription(String answerDescription) {
		this.answerDescription = answerDescription;
	}
	public Integer getDisplayOrder() {
		return displayOrder;
	}
	public void setDisplayOrder(Integer displayOrder) {
		this.displayOrder = displayOrder;
	}
	public String getFrozenJSMId() {
		return frozenJSMId;
	}
	public void setFrozenJSMId(String frozenJSMId) {
		this.frozenJSMId = frozenJSMId;
	}
	public Integer getIndentLevel() {
		return indentLevel;
	}
	public void setIndentLevel(Integer indentLevel) {
		this.indentLevel = indentLevel;
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
	public String getQuestionId() {
		return questionId;
	}
	public void setQuestionId(String quesitonId) {
		this.questionId = quesitonId;
	}
	public String getQuestionDescription() {
		return questionDescription;
	}
	public void setQuestionDescription(String questionDescription) {
		this.questionDescription = questionDescription;
	}
	public String getQuestionName() {
		return questionName;
	}
	public void setQuestionName(String questionName) {
		this.questionName = questionName;
	}
	public String getQuestionNotes() {
		return questionNotes;
	}
	public void setQuestionNotes(String questionNotes) {
		this.questionNotes = questionNotes;
	}
	public void setMultiple(boolean multiple) {
		this.multiple = multiple;
	}
	
    public void save() throws Exception {
    }
	public boolean isQuestion() {
		boolean retValue = false;
		if((this.getQuestionId()!=null)&&!(this.getQuestionId().equalsIgnoreCase(""))){
			retValue = true;
		}
		return retValue;
	}
	public boolean isPossibleAnswer() {
		boolean retValue = false;
		if((this.getPossibleAnswerId()!=null)&&!(this.getPossibleAnswerId().equalsIgnoreCase(""))){
			retValue = true;
		}
		return retValue;
	}
}