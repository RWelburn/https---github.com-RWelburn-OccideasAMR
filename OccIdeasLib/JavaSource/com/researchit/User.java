/**
 * Version:
 *     $Id: User.java,v 1.78 2008/10/10 05:52:50 troy.sadkowsky Exp $
 *
 * Revisions:
 *     $Log: User.java,v $
 *     Revision 1.78  2008/10/10 05:52:50  troy.sadkowsky
 *     new permissions
 *
 *     Revision 1.77  2008/09/24 12:17:00  troy.sadkowsky
 *     demo ready
 *
 *     Revision 1.76  2008/09/15 03:07:42  troy.sadkowsky
 *     new filter capabiities
 *
 *     Revision 1.75  2008/09/12 02:40:17  troy.sadkowsky
 *     ASsessment report updates
 *
 *     Revision 1.74  2008/09/03 07:35:24  troy.sadkowsky
 *     tidy code and ensure connections close
 *
 *     Revision 1.73  2008/08/25 01:37:20  ray.welburn
 *     Updates to use single dbobject and participant status table
 *
 *     Revision 1.72  2008/08/11 01:50:49  ray.welburn
 *     move study object to common package
 *
 *     Revision 1.71  2008/08/03 00:12:30  ray.welburn
 *     add participant tracking required field
 *
 *     Revision 1.70  2008/07/31 01:56:58  ray.welburn
 *     MainDB removed
 *
 *     Revision 1.69  2008/07/23 05:07:43  ray.welburn
 *     Allow add studymgrlogin to user/role
 *
 *     Revision 1.68  2008/07/23 03:57:31  ray.welburn
 *     New Study manager login permission
 *
 *     Revision 1.67  2008/07/22 06:54:44  ray.welburn
 *     integration changes for new interface
 *
 *     Revision 1.66  2008/07/08 11:46:48  ray.welburn
 *     Rolepermissions update causes database corruption
 *
 *     Revision 1.65  2008/07/05 03:29:09  troy.sadkowsky
 *     removed square brackets
 *
 *     Revision 1.64  2008/06/01 09:37:01  ray.welburn
 *     Search for users and filter for lhs user menu
 *
 *     Revision 1.63  2008/05/26 08:22:05  troy.sadkowsky
 *     Removed old code
 *
 *     Revision 1.62  2008/03/12 07:41:57  troy.sadkowsky
 *     added is admin function
 *
 *     Revision 1.61  2008/03/11 06:43:35  troy.sadkowsky
 *     removed thread string on log in
 *
 *     Revision 1.60  2008/02/15 08:49:23  troy.sadkowsky
 *     copy jsms function
 *
 *     Revision 1.59  2007/11/25 22:30:04  troy.sadkowsky
 *     read only rules
 *
 *     Revision 1.58  2007/10/25 03:47:12  troy.sadkowsky
 *     added date print for logins
 *
 *     Revision 1.57  2007/10/11 23:08:01  ray.welburn
 *     Remove redundant permissions
 *
 *     Revision 1.56  2007/10/09 23:46:44  ray.welburn
 *     System prints commented out
 *
 *     Revision 1.55  2007/10/09 07:20:08  troy.sadkowsky
 *     new images
 *
 *     Revision 1.54  2007/10/04 03:24:56  troy.sadkowsky
 *     logging logon
 *
 *     Revision 1.53  2007/09/29 02:22:45  ray.welburn
 *     Add new images to OccIDEASHome
 *
 *     Revision 1.52  2007/09/28 07:31:31  ray.welburn
 *     Updating new images
 *
 *     Revision 1.51  2007/09/27 07:07:04  ray.welburn
 *     Reorganise roles and permissions & remove redundant code
 *
 *     Revision 1.50  2007/09/25 02:47:55  ray.welburn
 *     Interviews project changed to Studies
 *
 *     Revision 1.49  2007/09/24 07:50:22  ray.welburn
 *     Role permissions now grouped and now show icon for permission
 *
 *     Revision 1.48  2007/09/10 00:00:25  troy.sadkowsky
 *     login redirect from home project
 *
 *     Revision 1.47  2007/08/23 23:38:17  ray.welburn
 *     Modified for add new user
 *
 *     Revision 1.46  2007/08/08 23:53:48  troy.sadkowsky
 *     db and objects for share jsms feature
 *
 *     Revision 1.45  2007/08/02 09:09:01  troy.sadkowsky
 *     separate rule creation from viewing mjsm
 *
 *     Revision 1.44  2007/07/24 22:44:32  troy.sadkowsky
 *     participant update fix
 *
 *     Revision 1.43  2007/07/10 22:38:08  troy.sadkowsky
 *     self admin changes
 *
 *     Revision 1.42  2007/06/03 23:19:44  Troy.Sadkowsky
 *     build 1.30 updates
 *
 *     Revision 1.41  2007/05/27 23:21:05  Troy.Sadkowsky
 *     restructured rule types
 *
 *     Revision 1.40  2007/05/19 02:01:47  jeff.keys
 *     online user manual
 *
 *     Revision 1.39  2007/05/03 13:52:46  Troy.Sadkowsky
 *     dynamic rule creation
 *
 *     Revision 1.38  2007/05/01 23:42:28  Troy.Sadkowsky
 *     changed agents view, add and edit
 *
 *     Revision 1.37  2007/04/30 07:10:57  jeff.keys
 *     module specific permissions
 *
 *     Revision 1.36  2007/04/29 22:37:24  jeff.keys
 *     module specific permissions
 *
 *     Revision 1.35  2007/04/18 02:46:20  jeff.keys
 *     Role associations and edit role permissions
 *
 *     Revision 1.34  2007/04/16 00:26:14  Troy.Sadkowsky
 *     reset passwords
 *
 *     Revision 1.33  2007/04/15 12:27:17  Troy.Sadkowsky
 *     bug fix for user update
 *
 *     Revision 1.32  2007/04/15 12:25:08  Troy.Sadkowsky
 *     bug fix for user update
 *
 *     Revision 1.31  2007/04/15 11:45:24  jeff.keys
 *     encrypt password
 *
 *     Revision 1.30  2007/04/15 10:55:47  jeff.keys
 *     create/edit/remove user
 *
 *     Revision 1.29  2007/04/12 11:07:08  jeff.keys
 *     role bug
 *
 *     Revision 1.28  2007/04/02 11:28:55  jeff.keys
 *     Assessment Permissions
 *
 *     Revision 1.27  2007/03/30 04:54:54  Troy.Sadkowsky
 *     mods for user-study relationships
 *
 *     Revision 1.26  2007/03/21 13:46:06  Troy.Sadkowsky
 *     bug fix on copy template, datetime field, new add permission code, print view
 *
 *     Revision 1.25  2007/03/20 07:54:47  jeff.keys
 *     New Interview Permissions
 *
 *     Revision 1.24  2007/03/20 02:05:14  jeff.keys
 *     Questionnaire-->JSM: Permissions
 *
 *     Revision 1.23  2007/03/19 11:16:16  jeff.keys
 *     Interview-->Study Permissions
 *
 *     Revision 1.22  2007/03/18 13:40:40  troy.sadkowsky
 *     new copy template jsm feature
 *
 *     Revision 1.21  2007/03/15 13:46:50  jeff.keys
 *     Questionnaire Roles Tab
 *
 *     Revision 1.20  2007/03/14 13:33:58  jeff.keys
 *     Questionnaire Login Permission
 *
 *     Revision 1.19  2007/03/14 02:59:52  Troy.Sadkowsky
 *     modifications for showing user roles and setting a user a roleid
 *
 *     Revision 1.18  2007/03/13 14:57:56  jeff.keys
 *     Questionnaire User Roles
 *
 *     Revision 1.17  2007/03/12 02:44:41  Troy.Sadkowsky
 *     update save permission
 *
 *     Revision 1.16  2007/03/11 07:37:34  jeff.keys
 *     Questionnaire User Roles
 *
 *     Revision 1.15  2007/03/09 06:43:25  jeff.keys
 *     Questionnaire User Roles
 *
 *     Revision 1.14  2007/03/08 23:23:15  jeff.keys
 *     User Permission Admin Form
 *
 *     Revision 1.13  2007/03/06 04:41:53  troy.sadkowsky
 *     user permissions
 *
 *     Revision 1.12  2007/02/28 13:06:07  Troy.Sadkowsky
 *     new admin import template jsms function
 *
 *     Revision 1.11  2007/02/28 12:04:00  Troy.Sadkowsky
 *     first phase of roles and permissions
 *
 *     Revision 1.10  2007/02/28 05:28:26  Troy.Sadkowsky
 *     build v1.16 updates
 *
 *     Revision 1.9  2007/02/28 00:31:02  troy.sadkowsky
 *     rett syndrom requirements of new login
 *
 *     Revision 1.8  2007/02/25 23:15:25  troy.sadkowsky
 *     rules are now study specific
 *
 *     Revision 1.7  2007/02/18 11:07:16  troy
 *     new dynamic rule creation
 *
 *     Revision 1.6  2007/01/29 07:40:20  Jeff
 *     Removing commented out code
 *
 *     Revision 1.5  2006/11/03 07:24:54  admin
 *     changed question types
 *
 *     Revision 1.4  2006/10/31 21:09:27  admin
 *     build v1.08
 *
 *     Revision 1.3  2006/06/28 08:30:31  administrator
 *     updates for rework
 *
 *     Revision 1.2  2006/06/12 04:10:02  administrator
 *     restructure progress
 *
 *     Revision 1.1  2006/06/07 07:07:27  administrator
 *     updates for rework
 *
 *     Revision 1.2  2006/05/26 06:57:37  administrator
 *     updates for rework
 *
 *     Revision 1.1  2006/05/22 06:06:01  administrator
 *     Version 2
 *
 *     Revision 1.7  2006/03/29 02:25:53  administrator
 *     updates for exposure assessment
 *
 *     Revision 1.6  2006/03/02 23:19:34  administrator
 *     changed objects to throw excpetions not throwables
 *
 *     Revision 1.5  2006/02/24 06:28:49  administrator
 *     attempt to fix connection bug
 *
 *     Revision 1.4  2006/02/23 07:11:59  administrator
 *     attempt to fix connection bug
 *
 *     Revision 1.3  2006/02/16 22:44:06  administrator
 *     new connection pool
 *
 *     Revision 1.2  2005/12/13 23:42:15  administrator
 *     updates for jobhistory import
 *
 *     Revision 1.1  2005/11/16 05:28:39  administrator
 *     new library to share amongst mql, ims and ams
 *
 *     Revision 1.4  2005/10/21 07:00:25  administrator
 *     tidy up code and new servlet to act as main controller
 *
 *     Revision 1.3  2005/10/21 03:58:17  administrator
 *     user logins and permissions
 *
 *     Revision 1.2  2005/10/20 05:48:54  administrator
 *     Login functions
 *
 *     Revision 1.1  2005/08/04 23:52:26  administrator
 *     Rules
 *
 *     
 */
package com.researchit;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.researchit.common.DBBaseObject;
import com.researchit.common.Participant;
import com.researchit.common.Study;
import com.researchit.html.ActionButton;
import com.researchit.html.HTMLObject;

public class User extends DBBaseObject {

	public enum Permission {
		QUESTIONNAIRELOGIN,
		PARTICIPANTLOGIN,
		BIOSPECIMENLOGIN,
		STUDYADMINMGRLOGIN,
		STUDYMGRLOGIN,
		DELETESTUDY,
		EDITKEYPHRASE,
		DELETEPARTICIPANT,
		IMPORTJSM,
		ADDJSMQUESTIONANSWER,		
		EDITJSMQUESTIONANSWER,
		DELETEJSMQUESTIONANSWER,
		ADDAGENT,
		EDITAGENT,
		DELETEAGENT,
		ADDJOB,
		EDITJOB,
		DELETEJOB,
		STUDIESLOGIN,
		ASSESSMENTLOGIN, 
		ADDSTUDY,
		EDITSTUDY,
		EDITJSM,
		ADDJSM,
		DELETEJSM,
		EXPORTJSM,
		SAVEINTERVIEW,
		ADDJOBHISTORY,
		EDITJOBHISTORY,
		DELETEJOBHISTORY,
		MAPJOB,
		LINKAJSM,
		VIEWRULES, 
		EDITRULES, 
		COPYJSMS, 
		RANDOMSTUDY, 
		VIEWTEMPLATEJSMS, 
		RUNASSESSMENT,
		PARTICIPANTUPDATES;
				
		//To make this process dynamic replace the switch structure in these methods 
		// with a database query 
		public boolean isQuestionnairePermission() {
			boolean retVal = false;
			
			switch (this) {
			case EDITJSM:
			case ADDJSM:
			case DELETEJSM:
			case IMPORTJSM:
			case EXPORTJSM:
			case EDITJSMQUESTIONANSWER:
			case ADDJSMQUESTIONANSWER:
			case DELETEJSMQUESTIONANSWER:
			case LINKAJSM:
			case EDITAGENT:
			case ADDAGENT:
			case DELETEAGENT:
			case EDITJOB:
			case ADDJOB:
			case DELETEJOB:
			case QUESTIONNAIRELOGIN:
			case EDITKEYPHRASE:
			case EDITRULES:
			case VIEWRULES:
			case COPYJSMS:
			case VIEWTEMPLATEJSMS:
				retVal = true;
				break;
		}
			return retVal;
		}
		
		public boolean isInterviewPermission() {
			boolean retVal = false;
			
			switch (this) {
			case DELETEPARTICIPANT:
			case EDITSTUDY:
			case ADDSTUDY:
			case DELETESTUDY:
			case ADDJOBHISTORY:
			case DELETEJOBHISTORY:
			case EDITJOBHISTORY:
			case MAPJOB:
			case SAVEINTERVIEW:
			case STUDIESLOGIN:
			case RANDOMSTUDY:
				retVal = true;
				break;
		}
			return retVal;
		}
		
		public boolean isAssessmentPermission() {
			boolean retVal = false;
			
			switch (this) {
			case ASSESSMENTLOGIN:
			case RUNASSESSMENT:
				retVal = true;
				break;
		}
			return retVal;
		}
		public boolean isParticipantPermission() {
			boolean retVal = false;
			
			switch (this) {
			case PARTICIPANTLOGIN:
			case PARTICIPANTUPDATES:
				retVal = true;
				break;
		}
			return retVal;
		}
		public boolean isBiospecimenPermission() {
			boolean retVal = false;
			
			switch (this) {
			case BIOSPECIMENLOGIN:
				retVal = true;
				break;
		}
			return retVal;
		}
		public boolean isStudymgrPermission() {
			boolean retVal = false;
			
			switch (this) {
			case STUDYADMINMGRLOGIN:
			case STUDYMGRLOGIN:
				retVal = true;
				break;
		}
			return retVal;
		}
		//associates an action button with a permission
		public ActionButton getAssociateActionButton() {
				ActionButton ab = new ActionButton();		
			switch (this) {
			case EDITJSM:
				ab = new ActionButton("","", "editjsm.gif");
				break;
			case ADDJSM:
				ab = new ActionButton("","", "add.gif");
				break;
			case DELETEJSM:
				ab = new ActionButton("","", "deletejsm.gif");
				break;
			case IMPORTJSM:
				ab = new ActionButton("","", "import.gif");
				break;
			case EXPORTJSM:
				ab = new ActionButton("","", "export.gif");
				break;
			case EDITJSMQUESTIONANSWER:
				ab = new ActionButton("","", "edit.gif");
				break;
			case ADDJSMQUESTIONANSWER:
				ab = new ActionButton("","", "add.gif");
				break;
			case DELETEJSMQUESTIONANSWER:
				ab = new ActionButton("","", "delete.gif");
				break;
			case LINKAJSM:
				ab = new ActionButton("","", "linkajsm.gif");
				break;
			case EDITAGENT:
				ab = new ActionButton("","", "edit.gif");
				break;
			case ADDAGENT:
				ab = new ActionButton("","", "add.gif");
				break;
			case DELETEAGENT:
				ab = new ActionButton("","", "delete.gif");
				break;
			case EDITJOB:
				ab = new ActionButton("","", "edit.gif");
				break;
			case ADDJOB:
				ab = new ActionButton("","", "add.gif");
				break;
			case DELETEJOB:
				ab = new ActionButton("","", "delete.gif");
				break;
			case QUESTIONNAIRELOGIN:
				ab = new ActionButton("","", "questionnaire.gif");
				break;
			case ASSESSMENTLOGIN:
				ab = new ActionButton("","", "none.gif");
				break;
			case PARTICIPANTLOGIN:
				ab = new ActionButton("","", "none.gif");
				break;
			case BIOSPECIMENLOGIN:
				ab = new ActionButton("","", "none.gif");
				break;
			case STUDYMGRLOGIN:
				ab = new ActionButton("","", "none.gif");
				break;
			case STUDYADMINMGRLOGIN:
				ab = new ActionButton("","", "none.gif");
				break;
			case EDITKEYPHRASE:
				ab = new ActionButton("","", "edit.gif");
				break;
			case VIEWRULES:
				ab = new ActionButton("","", "viewrules.gif");
				break;
			case DELETEPARTICIPANT:
				ab = new ActionButton("","", "delete.gif");
				break;
			case EDITSTUDY:
				ab = new ActionButton("","", "edit.gif");
				break;
			case ADDSTUDY:
				ab = new ActionButton("","", "add.gif");
				break;
			case DELETESTUDY:
				ab = new ActionButton("","", "delete.gif");
				break;
			case ADDJOBHISTORY:
				ab = new ActionButton("","", "add.gif");
				break;
			case DELETEJOBHISTORY:
				ab = new ActionButton("","", "delete.gif");
				break;
			case EDITJOBHISTORY:
				ab = new ActionButton("","", "edit.gif");
				break;
			case MAPJOB:
				ab = new ActionButton("","", "map.gif");
				break;
			case SAVEINTERVIEW:
				ab = new ActionButton("","", "save.gif");
				break;
			case STUDIESLOGIN:
				ab = new ActionButton("","", "none.gif");
				break;
			case EDITRULES:
				ab = new ActionButton("","", "addrule.gif");
				break;
			case COPYJSMS:
				ab = new ActionButton("","", "copy.gif");
				break;
			}				
			return ab;
		}										
	};
	
    public static final String ADMIN = "ADMIN";

    private String errorMessage = "";
    private String userName = "";
    private String password = "";
    private Participant participant;
    private String roleId = "";
    private ArrayList<Study> studies;
    private String refNumStartingNumber;
    
    public ArrayList<Study> getStudies() throws Exception {
    	if (!(this.getId().equalsIgnoreCase(""))) {       	
        	this.getPersistentStudyObjects();
    	}
		return studies;
	}
	public void setStudies(ArrayList<Study> studies) {
		this.studies = studies;
	}	
	public void save() throws Exception {
		if (this.exists()) {
			this.update();
		} else {
			this.insert();
		}
	}	
	public void insert() throws Exception {
		// insert new user
		String strSQL = "INSERT INTO users (username) VALUES('" + this.getUserName().replaceAll("'", "''") + "')";
		try {
			this.setId(String.valueOf(this.sqlExecuteInsert(strSQL)));
		} catch (SQLException e) {
			throw new Exception(e.getMessage());
		} finally {
			this.closeConnection();
		}
	}	
	public void update() throws Exception {		
		String strSQL = "UPDATE users "
				+ " SET username = '" + this.getUserName()
				+ "' WHERE id = " + this.getId();
		try {
			this.sqlExecuteUpdate(strSQL);
		} catch (SQLException e) {
			throw new Exception(e.getMessage());
		} finally {
			this.closeConnection();
		}		
	}	
	public boolean exists() throws Exception {
		boolean bRetValue = false;
		if(this.getId().equalsIgnoreCase("")){
			String strSQL = "SELECT id FROM users WHERE username = '"
				+ this.escapeSpecialCharacters(this.getUserName()) + "'";
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
	private void getPersistentStudyObjects() throws Exception {
        String strSQL = "";
        ResultSet rs = null;
        ArrayList<Study> studies = new ArrayList<Study>();
        try {           
            strSQL = "SELECT     study.id, userstudies.userid"
            	+ " FROM         study INNER JOIN"
            	+ " userstudies ON study.id = userstudies.studyid"
            	+ " WHERE     (userstudies.userid = "+this.getId()+")";
            rs = this.sqlExecuteSelect(strSQL);
            if (rs != null) {
                while (rs.next()) {
                	Study study = new Study();
                    study.setId(rs.getString("id"));
                	studies.add(study);
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
        for(Study study: studies){
        	study.getPersistentObject();
        }
        this.setStudies(studies);
    }	
	public String getRoleId() throws Exception {
   		String strSQL = "";
		String strKey = "";

		if(exists()) {
    		strSQL = "SELECT roleid FROM users " +
    			"WHERE id="+this.getId();
    		strKey = "roleid";
		}else {
    		strSQL = "SELECT id FROM roles " +
    				" WHERE name='New User'";
    		strKey = "id";
		}
		ResultSet rs = null;
		try {
			rs = this.sqlExecuteSelect(strSQL);
			if (rs != null) {
				if (rs.next()) { 					
					this.setRoleId(rs.getString(strKey));
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
		return roleId;
	}
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	public Participant getParticipant(String username,String password,String studyId) throws Exception {
    	if(participant==null){
    		this.participant = this.findByRefNumber(username,password,studyId);
    	}   	
		return participant;
	}
	public void setParticipant(Participant participant) {
		this.participant = participant;
	}
    public User() {
        super();
    }
    public User(int userId) {
        super();
        this.setId(Integer.toString(userId));
    }   
    public User(String strUsername, String strPassword) throws Exception {
        super();
        this.setUserName(strUsername);
        this.getPersistentObject(PasswordService.getInstance().encrypt(strPassword));
    }
    public String getErrorMessage() {
        return errorMessage;
    }
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
    public String getUserName() throws Exception {
    	if(!this.getId().equalsIgnoreCase("") ){
    		String strSQL = "SELECT username FROM users WHERE id="+this.getId();
    		ResultSet rs = null;
    		try {
    			rs = this.sqlExecuteSelect(strSQL);
    			if (rs != null) {
    				if (rs.next()) { 					
    					this.setUserName(rs.getString("username"));
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
        return userName;
    }   
    public String getPassword() throws Exception {
    	if(password.equalsIgnoreCase("") && ! getId().equalsIgnoreCase("")) {
	    	String strSQL = "SELECT password FROM users WHERE id="+this.getId();
	    	ResultSet rs = null;
	    	try {
    			rs = this.sqlExecuteSelect(strSQL);
    			if (rs != null) {
    				if (rs.next()) { 					
    					this.password = (rs.getString("password"));
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
    	return password;
    }
    public void setUserName(String name) {
        this.userName = name;
    }  
    public void setPassword(String pw) throws Exception {
    	password  = pw;
    }    
    public void delete()throws Exception {
    	String deleteQuery = "DELETE FROM users WHERE id = " + getId();
    	try {
	        sqlExecuteUpdate(deleteQuery);
	    }
	        
	    catch (Exception e) {
	        throw new Exception(e.getMessage());
	    } finally {
	          closeConnection();
	    }   	
   }   
   public void deletePermissions()throws Exception {
    	if(permissionCount() > 0) {
   		
    		String deleteQuery = "DELETE FROM userpermissions WHERE userid = " + getId();
    
    		try {
    			sqlExecuteUpdate(deleteQuery);
    		}
	        
		    catch (Exception e) {
		        throw new Exception(e.getMessage());
		    } finally {
		          closeConnection();
		    }   	
    	}
   }  
   public void deleteQuestionnairePermissions()throws Exception {
	   if(permissionCount() > 0) {
		   String deleteQuery = "";
   			for(User.Permission p: User.Permission.values()) {
   				if(p.isQuestionnairePermission()) {
   					deleteQuery = "DELETE FROM userpermissions WHERE userid = " + getId()
   						+ " AND permissionid IN " 
   						+ " (SELECT p.id " 
   						+ " FROM permissions p " 
   						+ " WHERE p.name IN ('" + p.name() + "'))";
	  				try {
	  					sqlExecuteUpdate(deleteQuery);
	  				}catch (Exception e) {
	  					throw new Exception(e.getMessage());
	  				}finally {
			          closeConnection();
	  				}
   				}
   			}
   		}
   }  
   public void deleteAssessmentPermissions()throws Exception {
	   if(permissionCount() > 0) {
		   String deleteQuery = "";
   			for(User.Permission p: User.Permission.values()) {
   				if(p.isAssessmentPermission()) {
   					deleteQuery = "DELETE FROM userpermissions WHERE userid = " + getId()
   						+ " AND permissionid IN " 
   						+ " (SELECT p.id " 
   						+ " FROM permissions p " 
   						+ " WHERE p.name IN ('" + p.name() + "'))";
	  				try {
	  					sqlExecuteUpdate(deleteQuery);
	  				}catch (Exception e) {
	  					throw new Exception(e.getMessage());
	  				}finally {
			          closeConnection();
	  				}
   				}
   			}
   		}
   } 
   public void deleteInterviewPermissions()throws Exception {
	   if(permissionCount() > 0) {
		   String deleteQuery = "";
   			for(User.Permission p: User.Permission.values()) {
   				if(p.isInterviewPermission()) {
   					deleteQuery = "DELETE FROM userpermissions WHERE userid = " + getId()
   						+ " AND permissionid IN " 
   						+ " (SELECT p.id " 
   						+ " FROM permissions p " 
   						+ " WHERE p.name IN ('" + p.name() + "'))";
	  				try {
	  					sqlExecuteUpdate(deleteQuery);
	  				}catch (Exception e) {
	  					throw new Exception(e.getMessage());
	  				}finally {
			          closeConnection();
	  				}
   				}
   			}
   		}
   } 
   public int permissionCount() throws Exception {
	   int returnVal = 0;
	   
		String sql = "SELECT COUNT(*)AS _count FROM userpermissions WHERE userid = " + getId();
	    
		try {
			ResultSet rs = sqlExecuteSelect(sql);
			if(rs != null) {
				if (rs.next()) {
					returnVal = Integer.parseInt(rs.getString("_count").toString());
				}
			}
		}
	    catch (Exception e) {
	        throw new Exception(e.getMessage());
	    } finally {
	          closeConnection();
	    }   	
	    return returnVal;
    } 
    public void savePermission(Permission p) throws Exception {
    	if(!this.permissionExists(p)){
    		this.insertPermission(p);
    	}
	    String insertQuery = "INSERT userpermissions (userId, permissionId)  SELECT users.id,permissions.id FROM permissions INNER JOIN users ON users.id = "+this.getId()+" AND name = '"+p.toString()+"'  ";	    			
    	try {        	
	        this.sqlExecuteUpdate(insertQuery);
	    } catch (Exception e) {
	        throw new Exception(e.getMessage());
	    } finally {
	          this.closeConnection();
	    }   	
    }
    private void insertPermission(Permission p) throws Exception {
	    String insertQuery = "INSERT permissions (name) VALUES ('"+p.toString()+"')  ";	    			
        this.sqlExecuteUpdate(insertQuery);		
	}
	private boolean permissionExists(Permission permission) throws Exception {
    	boolean bRetValue = false;
        try {
            String strSQL = "SELECT id " +
            		" FROM permissions WHERE (permissions.name = '"+permission.toString()+"')";
            ResultSet rs = this.sqlExecuteSelect(strSQL);
            if (rs != null) {
                if (rs.next()) {                    
                    bRetValue = true;
                }
                if(rs.getStatement()!=null){ 
					rs.getStatement().close(); 
				} 
				rs.close();
            }           
        } catch (Exception ex) {
			throw new Exception(ex.getMessage());
        }finally{
			this.closeConnection();
        }
        return bRetValue;
	}
	public void saveRole(String roleId) throws Exception {
	    String updateQuery = "UPDATE users SET roleid="+roleId+"  WHERE id="+this.getId();	    			
    	try {        	
	        this.sqlExecuteUpdate(updateQuery);
	    } catch (Exception e) {
	        throw new Exception(e.getMessage());
	    } finally {
	          this.closeConnection();
	    }   	
    }
	public void savePassword(String password) throws Exception {
		password  = PasswordService.getInstance().encrypt(password);
	    String updateQuery = "UPDATE users SET password='"+password+"'  WHERE id="+this.getId();	    			
    	try {        	
	        this.sqlExecuteUpdate(updateQuery);
	    } catch (Exception e) {
	        throw new Exception(e.getMessage());
	    } finally {
	          this.closeConnection();
	    }   	
    }
	public boolean isParticipant(String username,String password,String studyId) throws Exception {
		boolean retValue = false;
		if(this.getUserName().equalsIgnoreCase(username)){
			Participant p = this.findByRefNumber(username,password,studyId);
			if(!(p.getId().equalsIgnoreCase(""))){
				retValue = true;
			}else{
				this.setErrorMessage("Could not locate this reference number. Please try again.");
			}
		}		
		return retValue;
	}
	public Participant findByRefNumber(String refNumber,String dob, String studyId) throws Exception {
		Participant retValue = new Participant();
		String query = "SELECT id FROM participant" +
				" WHERE referencenumber ='" + this.escapeSpecialCharacters(refNumber)+"'" +
				" AND dob = '"+this.escapeSpecialCharacters(dob)+"'" +
				" AND studyid = "+studyId;
		String id = "";
	    try {
	        ResultSet rs = this.sqlExecuteSelect(query);
	        if (rs != null) {
	            if (rs.next()) {
	                id = rs.getString("id");
	                
	            }
	            if (rs.getStatement() != null) {
	                rs.getStatement().close();
	            }
	            rs.close();
	        }
	    } catch (Exception e) {
	        throw new Exception(e.getMessage());
	    } finally {
	          this.closeConnection();
	    }
	    if(!(id.equalsIgnoreCase(""))){
	    	retValue = new Participant(Long.valueOf(id));
	    }
		return retValue;
	}
	public boolean hasPermission(Permission permission) throws Exception {
		boolean bRetValue = false;
		if (!this.getId().equalsIgnoreCase("")) {
			try {
	            String strSQL = "SELECT userpermissions.permissionid " +
	            		" FROM permissions INNER JOIN" +
	            		" userpermissions ON permissions.id = userpermissions.permissionid" +
	            		" WHERE permissions.name = '"+permission.toString()+"' AND userpermissions.userid = "+this.getId();
	            ResultSet rs = this.sqlExecuteSelect(strSQL);
	            if (rs != null) {
	                if (rs.next()) {                    
	                    bRetValue = true;
	                }
	                if(rs.getStatement()!=null){ 
						rs.getStatement().close(); 
					} 
					rs.close();
	            }           
	        } catch (Exception ex) {
				throw new Exception(ex.getMessage());
	        }finally{
				this.closeConnection();
	        }
		}
        return bRetValue;
	}   
	protected void getPersistentObject(String password) throws Exception {
		String strSQL = "SELECT id FROM users WHERE username = '" + this.escapeSpecialCharacters(this.getUserName())+"' AND password = '"+password+"'";
		ResultSet rs = null;
		try {
			rs = this.sqlExecuteSelect(strSQL);
			if (rs != null) {
				if (rs.next()) {
					this.setId(rs.getString("id"));					
				}else{
					this.setId("0");
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
	protected void getPersistentObject(int userId) throws Exception {
		String strSQL = "SELECT id FROM users WHERE userId = " + this.getId();
		ResultSet rs = null;
		try {
			rs = this.sqlExecuteSelect(strSQL);
			if (rs != null) {
				if (rs.next()) {
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
	public ArrayList<User> getAllUsers() throws Exception {
		ArrayList<User> retValue = new ArrayList<User>();
		String strSQL = "SELECT id,username FROM users ";
		ResultSet rs = null;
		try {
			rs = this.sqlExecuteSelect(strSQL);
			if (rs != null) {
				while (rs.next()) {
					User u = new User();
					u.setId(rs.getString("id"));
					u.setUserName(rs.getString("username"));
					retValue.add(u);
				}
				if (rs.getStatement() != null) {
					rs.getStatement().close();
				}
				rs.close();
			}
		} catch (SQLException e) {
			new Exception(e.getMessage());
		} finally {
			this.closeConnection();
		}
		return retValue;
	}	
	public void addStudy(String studyId) throws Exception {
		String strSQL = "INSERT INTO userstudies (userid,studyid) VALUES(" + this.getId() + "," + studyId + ")";
        try {
            this.sqlExecuteInsert(strSQL);                        
        } catch (SQLException e) {
            throw new Exception(e.getMessage());
        }
	}
	public void removeStudy(String studyId) throws Exception {
		String strSQL = "DELETE FROM userstudies WHERE studyid = " + studyId + " AND userid = " + this.getId();
        try {
            this.sqlExecuteInsert(strSQL);
        } catch (SQLException e) {
            throw new Exception(e.getMessage());
        }
	}
	public boolean isAdministrator() throws Exception {
		boolean retValue = false;
		if(this.getRoleId().equalsIgnoreCase("1")){
			retValue = true;
		}
		return retValue;
	}	
	public ArrayList<User> getSearchedUsers(String search) throws Exception {
		ArrayList<User> searchedUsers = new ArrayList<User>();
		for (User u : this.getAllUsers()) {
			if (u.getUserName().toLowerCase().contains(search.toLowerCase())) {
				searchedUsers.add(u);
			}
		}
		return searchedUsers;
	}
	public String getRefNumStartingNumber() {
		return refNumStartingNumber;
	}
	public void setRefNumStartingNumber(String refNumStartingNumber) {
		this.refNumStartingNumber = refNumStartingNumber;
	}
	public String getEncryptedId() {
		String retValue = Util.encrypt(this.getId());//
		return retValue;
	}	
	public String getSystemVersion(){
		return HTMLObject.getSystemVersion();
	}
}
