/**
 * Version:
 *     $Id: Study.java,v 1.35 2009/05/27 02:00:44 troy.sadkowsky Exp $
 *
 * Revisions:
 *     $Log: Study.java,v $
 *     Revision 1.35  2009/05/27 02:00:44  troy.sadkowsky
 *     bug fix 814 3cat frequency hours
 *
 *     Revision 1.34  2009/04/23 09:24:34  troy.sadkowsky
 *     participant contact updates
 *
 *     Revision 1.33  2009/04/20 10:25:25  ray.welburn
 *     New paes for progress updates
 *
 *     Revision 1.32  2009/03/11 08:20:17  ray.welburn
 *     Participant progress status
 *
 *     Revision 1.31  2009/03/06 01:11:30  troy.sadkowsky
 *     participant tracking updates
 *
 *     Revision 1.30  2009/02/23 06:02:33  troy.sadkowsky
 *     some reports will have a frozen jsm id
 *
 *     Revision 1.29  2009/02/19 03:37:36  troy.sadkowsky
 *     archive report functions
 *
 *     Revision 1.28  2009/02/04 22:44:52  troy.sadkowsky
 *     New report functions
 *
 *     Revision 1.27  2009/01/06 07:40:51  troy.sadkowsky
 *     v2 updates
 *
 *     Revision 1.26  2008/12/30 00:11:38  troy.sadkowsky
 *     paging and speed enhancements
 *
 *     Revision 1.25  2008/12/29 02:44:05  troy.sadkowsky
 *     increased speed of participant lists
 *
 *     Revision 1.24  2008/12/23 10:32:25  troy.sadkowsky
 *     speed enhancements, linked jsms, progress bar
 *
 *     Revision 1.23  2008/12/22 05:30:46  troy.sadkowsky
 *     fix summary counts
 *
 *     Revision 1.22  2008/12/20 02:07:08  troy.sadkowsky
 *     v2 updates
 *
 *     Revision 1.21  2008/12/17 06:39:02  ray.welburn
 *     Change study note import to just upload the file to database
 *
 *     Revision 1.20  2008/12/14 22:35:50  troy.sadkowsky
 *     attempt to enhance speed
 *
 *     Revision 1.19  2008/12/13 04:43:44  ray.welburn
 *     add alert when study name is duplicate
 *
 *     Revision 1.18  2008/11/05 06:15:45  ray.welburn
 *     Study acronym now study name
 *
 *     Revision 1.17  2008/10/30 10:31:47  ray.welburn
 *     Change to allow multiple study statuses
 *
 *     Revision 1.16  2008/10/20 05:26:55  Troy.Sadkowsky
 *     validation updates speed enhancement
 *
 *     Revision 1.15  2008/10/20 00:37:50  troy.sadkowsky
 *     to excel show rules
 *
 *     Revision 1.14  2008/10/10 06:08:15  Troy.Sadkowsky
 *     minor updates
 *
 *     Revision 1.13  2008/10/03 02:57:30  troy.sadkowsky
 *     assessment updates
 *
 *     Revision 1.12  2008/09/24 12:17:00  troy.sadkowsky
 *     demo ready
 *
 *     Revision 1.11  2008/09/24 05:16:30  ray.welburn
 *     new project page
 *
 *     Revision 1.10  2008/09/21 06:54:30  ray.welburn
 *     method to get calendar source
 *
 *     Revision 1.9  2008/09/20 08:59:30  troy.sadkowsky
 *     new assessment updates
 *
 *     Revision 1.8  2008/09/12 02:40:17  troy.sadkowsky
 *     ASsessment report updates
 *
 *     Revision 1.7  2008/09/11 02:47:21  troy.sadkowsky
 *     only show jhs that are ready for assessments
 *
 *     Revision 1.6  2008/09/10 09:11:35  troy.sadkowsky
 *     ASsessment updates
 *
 *     Revision 1.5  2008/09/03 07:35:24  troy.sadkowsky
 *     tidy code and ensure connections close
 *
 *     Revision 1.4  2008/09/03 04:58:57  ray.welburn
 *     Add PT statuses
 *
 *     Revision 1.3  2008/08/25 01:37:29  ray.welburn
 *     Updates to use single dbobject and participant status table
 *
 *     Revision 1.2  2008/08/11 03:02:54  ray.welburn
 *     move study object to common package
 *
 *     Revision 1.1  2008/08/11 01:49:20  ray.welburn
 *     new package for common objects
 *
 *     Revision 1.75  2008/08/02 06:16:56  troy.sadkowsky
 *     removed jess and reworked rules and ajsms
 *
 *     Revision 1.74  2008/07/31 01:56:57  ray.welburn
 *     MainDB removed
 *
 *     Revision 1.73  2008/07/31 00:47:40  ray.welburn
 *     Change db name
 *
 *     Revision 1.72  2008/07/29 01:42:49  ray.welburn
 *     populationsite db changed to researchitcommon
 *
 *     Revision 1.71  2008/07/24 12:06:50  ray.welburn
 *     Studies now selected where study option useoccideas set
 *
 *     Revision 1.70  2008/07/23 00:14:40  troy.sadkowsky
 *     flat file frozen jsm
 *
 *     Revision 1.69  2008/07/22 06:54:44  ray.welburn
 *     integration changes for new interface
 *
 *     Revision 1.68  2008/06/29 23:22:05  troy.sadkowsky
 *     enhanced export function
 *
 *     Revision 1.67  2008/05/26 08:22:00  troy.sadkowsky
 *     Removed old code
 *
 *     Revision 1.66  2008/05/18 12:18:37  troy.sadkowsky
 *     ordered studies
 *
 *     Revision 1.65  2008/05/11 11:42:57  troy.sadkowsky
 *     update study summary report
 *
 *     Revision 1.64  2008/04/22 10:29:13  ray.welburn
 *     Changes to copying and pasting q's and a's
 *
 *     Revision 1.63  2008/04/01 14:41:46  troy.sadkowsky
 *     new report on studies page and new filter by jsm
 *
 *     Revision 1.62  2008/03/18 10:41:36  ray.welburn
 *     Add ability to view and create studies project info for home page
 *
 *     Revision 1.61  2008/03/18 01:29:13  ray.welburn
 *     Study projects option added
 *
 *     Revision 1.60  2008/03/12 07:40:37  troy.sadkowsky
 *     record last updated for JSM mods
 *
 *     Revision 1.59  2008/02/08 07:36:46  troy.sadkowsky
 *     build v1.71 updates
 *
 *     Revision 1.58  2007/12/08 01:57:43  ray.welburn
 *     Status Filter now works with timebased and text searches
 *
 *     Revision 1.57  2007/12/06 22:34:15  troy.sadkowsky
 *     fixed ordering of jsms
 *
 *     Revision 1.56  2007/11/26 12:07:08  troy.sadkowsky
 *     fixed search bug
 *
 *     Revision 1.55  2007/11/24 03:58:52  troy.sadkowsky
 *     filter by participant status
 *
 *     Revision 1.54  2007/11/21 01:55:12  ray.welburn
 *     Change default description to <not set>
 *
 *     Revision 1.53  2007/11/18 02:25:35  troy.sadkowsky
 *     bug fix for interview and new search participant function
 *
 *     Revision 1.52  2007/11/14 05:14:11  troy.sadkowsky
 *     jh statuses
 *
 *     Revision 1.51  2007/11/09 05:16:41  troy.sadkowsky
 *     updated jh statuses
 *
 *     Revision 1.50  2007/10/25 03:46:24  troy.sadkowsky
 *     moved prefix to suffix
 *
 *     Revision 1.49  2007/10/16 02:48:10  troy.sadkowsky
 *     reports and single rules
 *
 *     Revision 1.48  2007/10/15 05:53:08  troy.sadkowsky
 *     only remove jsms if not being used
 *
 *     Revision 1.47  2007/10/09 07:21:03  troy.sadkowsky
 *     auto create study specific jsms
 *
 *     Revision 1.46  2007/10/08 07:20:52  troy.sadkowsky
 *     rule management
 *
 *     Revision 1.45  2007/09/25 00:27:53  troy.sadkowsky
 *     order by referencenumber
 *
 *     Revision 1.44  2007/09/24 22:58:21  troy.sadkowsky
 *     show fired rules
 *
 *     Revision 1.43  2007/09/23 23:38:40  Troy.Sadkowsky
 *     bug fix for start study
 *
 *     Revision 1.42  2007/09/22 03:20:40  troy.sadkowsky
 *     participant and job history statuses
 *
 *     Revision 1.41  2007/09/15 05:38:46  ray.welburn
 *     Selection button added to disallow autogeneration of participant numbers
 *
 *     Revision 1.40  2007/09/15 02:03:44  ray.welburn
 *     Selection button added to disallow autogeneration of participant numbers
 *
 *     Revision 1.39  2007/09/11 23:04:24  troy.sadkowsky
 *     changes for sharing jsms
 *
 *     Revision 1.38  2007/08/19 13:05:40  troy.sadkowsky
 *     share study with users
 *
 *     Revision 1.37  2007/08/13 00:19:45  troy.sadkowsky
 *     new jobhistory field requirements and sharing ability
 *
 *     Revision 1.36  2007/08/11 03:25:59  troy.sadkowsky
 *     duplicate study name and log out on error
 *
 *     Revision 1.35  2007/08/08 23:53:49  troy.sadkowsky
 *     db and objects for share jsms feature
 *
 *     Revision 1.34  2007/07/19 22:21:26  troy.sadkowsky
 *     rmeoved references to windows c path so app will work on linux os
 *
 *     Revision 1.33  2007/06/29 04:47:52  troy.sadkowsky
 *     mysql updates
 *
 *     Revision 1.32  2007/06/03 23:19:45  Troy.Sadkowsky
 *     build 1.30 updates
 *
 *     Revision 1.31  2007/05/30 04:16:42  Jeff.Keys
 *     upload user manual
 *
 *     Revision 1.30  2007/05/22 11:18:58  Troy.Sadkowsky
 *     study options
 *
 *     Revision 1.29  2007/04/22 11:56:03  Troy.Sadkowsky
 *     build v1.24
 *
 *     Revision 1.28  2007/04/10 13:06:03  Troy.Sadkowsky
 *     attached files
 *
 *     Revision 1.27  2007/04/09 07:34:19  jeff.keys
 *     Study Notes
 *
 *     Revision 1.26  2007/04/04 12:01:59  Troy.Sadkowsky
 *     linking jobs through template jsms
 *
 *     Revision 1.25  2007/03/30 04:54:55  Troy.Sadkowsky
 *     mods for user-study relationships
 *
 *     Revision 1.24  2007/03/18 22:16:38  Troy.Sadkowsky
 *     fixed bug with deleting rules
 *
 *     Revision 1.23  2007/03/05 05:34:42  Troy.Sadkowsky
 *     new copy template rules functions
 *
 *     Revision 1.22  2007/02/28 12:04:00  Troy.Sadkowsky
 *     first phase of roles and permissions
 *
 *     Revision 1.21  2007/02/28 05:28:26  Troy.Sadkowsky
 *     build v1.16 updates
 *
 *     Revision 1.20  2007/02/28 00:37:29  troy.sadkowsky
 *     currently the default is that all rules are added to the template study
 *
 *     Revision 1.19  2007/02/25 23:15:27  troy.sadkowsky
 *     rules are now study specific
 *
 *     Revision 1.18  2007/02/01 12:18:59  troy
 *     more changes for dynamic rules
 *
 *     Revision 1.17  2007/01/31 02:03:38  Jeff
 *     fix for new study and jobhistory
 *
 *     Revision 1.16  2007/01/23 22:15:53  Administrator
 *     v1.15 updates
 *
 *     Revision 1.15  2007/01/08 12:45:51  Administrator
 *     version 14 updates
 *
 *     Revision 1.14  2006/12/19 12:25:49  admin
 *     build v1.13.1
 *
 *     Revision 1.13  2006/12/12 13:43:28  admin
 *     build v1.13
 *
 *     Revision 1.12  2006/10/31 21:09:28  admin
 *     build v1.08
 *
 *     Revision 1.11  2006/10/10 23:52:54  admin
 *     worked on jobs
 *
 *     Revision 1.10  2006/10/03 22:38:54  admin
 *     enhancements to expert system
 *
 *     Revision 1.9  2006/08/24 10:40:41  admin
 *     status updates
 *
 *     Revision 1.8  2006/07/27 23:19:12  admin
 *     version 1.02
 *
 *     Revision 1.7  2006/07/25 05:32:28  admin
 *     assessment updates
 *
 *     Revision 1.6  2006/06/29 05:49:00  administrator
 *     updates for rework
 *
 *     Revision 1.5  2006/06/28 08:30:31  administrator
 *     updates for rework
 *
 *     Revision 1.4  2006/06/16 02:10:21  administrator
 *     updates for rework
 *
 *     Revision 1.3  2006/06/14 06:59:08  administrator
 *     updates for rework
 *
 *     Revision 1.2  2006/06/12 04:10:02  administrator
 *     restructure progress
 *
 *     Revision 1.1  2006/06/07 07:07:27  administrator
 *     updates for rework
 *
 *     Revision 1.1  2006/06/06 23:58:12  administrator
 *     restructure progress
 *
 *     Revision 1.20  2006/04/27 02:04:40  administrator
 *     show chemicals in hierarchy
 *
 *     Revision 1.19  2006/04/13 01:58:20  administrator
 *     changed active chemical display to the top
 *
 *     Revision 1.18  2006/04/12 21:45:38  administrator
 *     correct filter on assessment participants
 *
 *     Revision 1.17  2006/04/04 02:14:11  administrator
 *     new function to show interview participants
 *
 *     Revision 1.16  2006/03/27 07:13:49  administrator
 *     bug fix for showing participants
 *
 *     Revision 1.15  2006/03/27 04:34:27  administrator
 *     reworked get participants
 *
 *     Revision 1.14  2006/03/24 06:30:27  administrator
 *     fixed iterators
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
 *     Revision 1.10  2006/02/22 09:09:36  administrator
 *     converted throwable to exception
 *
 *     Revision 1.9  2006/02/22 02:39:04  administrator
 *     new fields for study
 *
 *     Revision 1.8  2006/02/16 22:44:06  administrator
 *     new connection pool
 *
 *     Revision 1.7  2006/02/01 06:49:58  administrator
 *     fixed scrolling through questions applying rules
 *
 *     Revision 1.6  2006/01/31 23:18:17  administrator
 *     change display look
 *
 *     Revision 1.5  2005/12/13 23:42:15  administrator
 *     updates for jobhistory import
 *
 *     Revision 1.4  2005/11/29 05:25:15  administrator
 *     view jsm doesn't show A-JSMs
 *
 *     Revision 1.3  2005/11/18 05:57:03  administrator
 *     iteration 8
 *
 *     Revision 1.2  2005/11/17 22:54:39  administrator
 *     interview functionality
 *
 *     Revision 1.1  2005/11/16 05:28:39  administrator
 *     new library to share amongst mql, ims and ams
 *
 *
 *     
 */
package com.researchit.common;

import java.io.InputStream;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.researchit.Agent;
import com.researchit.Assessment;
import com.researchit.FrozenJobSpecificModule;
import com.researchit.Interview;
import com.researchit.JobHistory;
import com.researchit.JobHistoryStatus;
import com.researchit.JobSpecificModule;
import com.researchit.ParticipantStatus;
import com.researchit.StudyNote;
import com.researchit.StudyStatus;
import com.researchit.User;
import com.researchit.ParticipantProgress.ParticipantContactProgress;
import com.researchit.html.OccCalendar;
import com.researchit.io.Report;

public class Study extends DBBaseObject {

    //private int participantSize = 0; 
    private String description = "";
    private String name = "";
    private String startNote = "";
    private String endNote = "";
    private ArrayList<Agent> agents;   
    private ArrayList<User> users;   
 //   private ArrayList<ExpertRule> rules;
    private ArrayList<JobSpecificModule> jsms;
    private List<Participant> participants;  
    private List<Participant> fullParticipants; 
	private ArrayList<StudyNote> studyNotes;    
    private String statusId = "1";
    private String userId;    
    protected ArrayList<Study> pTStudies;
    ArrayList<FrozenJobSpecificModule> frozenJSMs;
    private String parentStudyId = "";

       
    public enum Option {
		GLOBALDONTKNOW,
		PARENTQWITHFREQQS,
		AUTOGENERATEID,
		EDITPUBLISHEDPAGE,
		USEOCCIDEAS,
		USEPARTICIPANT,
		USEBIOSPECIMENS,
		STARTNOTE,
		ENDNOTE, CAT3FREQ;
	};
 
	public String getStatusId() {
		return statusId;
	}
	public void setStatusId(String statusId) {
		this.statusId = statusId;
	}
	public ArrayList<Agent> getAgents() throws Exception {
        if (!(this.getId().equalsIgnoreCase(""))) {
        	if(this.agents==null){
        		this.getPersistentAgentObjects();
        	}
        } else {
            agents = new ArrayList<Agent>();
        }
        return agents;
    }
	public void loadFile(InputStream is, int length, String name) throws Exception {
		java.sql.PreparedStatement pst;

        try {
            connect();           
            String sql = "INSERT INTO studynotes (name,studynote,studyid) VALUES(?,?,?)";
            pst = this.connection.prepareStatement(sql);           
    		pst.setString(1, name); 
			pst.setBinaryStream(2, is, length);    		
    		pst.setString(3, this.getId());
            pst.execute();
            pst.close();     
        } finally {
            closeConnection();
        }   
		is.close();
	}	
    private void getPersistentStudyNoteObjects() throws Exception {
        String strSQL = "";
        ResultSet rs = null;
        try {
             strSQL = "SELECT sn.id, sn.name, sn.studynote, sn.studyid"
                    + " FROM study s "
                    + " INNER JOIN studynotes sn "
                    + " ON s.id = sn.studyid "
                    + " WHERE (s.id = " 
                    + this.getId() 
                    + ") ORDER BY sn.id";
            
            rs = this.sqlExecuteSelect(strSQL);
            if (rs != null) {
                while (rs.next()) {
                    StudyNote sNote = new StudyNote();
                    sNote.setId(rs.getString("id"));
                    sNote.setName(rs.getString("name"));
                    sNote.setStudyNote(rs.getString("studynote"));
                    sNote.setStudyId(rs.getString("studyid"));
                    this.studyNotes.add(sNote);
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
    private void getPersistentAgentObjects() throws Exception {
        String strSQL = "";
        ResultSet rs = null;
        try {
            ArrayList<Agent> agents = new ArrayList<Agent>();
            strSQL = "SELECT oa.id, oa.name, oa.parentagentid, oa.description"
                    + " FROM study mstudy INNER JOIN"
                    + " studyagents osa ON mstudy.id = osa.studyid INNER JOIN"
                    + " agent oa ON osa.agentid = oa.id"
                    + " WHERE (mstudy.id = "
                    + this.getId()
                    + ") ORDER BY oa.parentagentid, oa.id";
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
            this.setAgents(agents);
        } catch (SQLException e) {
            throw new Exception(e.getMessage());
        } finally {
            this.closeConnection();
        }
    }
    public void setAgents(ArrayList<Agent> agents) {
        this.agents = agents;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        if (description.equalsIgnoreCase("null")) {
            description = "&lt;not set&gt;";
        }
        this.description = description.trim();
    }
    public Study() {
        super();
        studyNotes = new ArrayList<StudyNote>();
    }
    public Study(String id) throws Exception {    	
    	studyNotes = new ArrayList<StudyNote>();
    	if ((id != null) && (!(id.equalsIgnoreCase("")))) {
            this.setId(id);
            this.getPersistentObject();
        }
    }
    public void getPersistentObject() throws Exception {
        String strSQL = "SELECT study.id, study.description, study.name, study.interviewstartnote, study.interviewendnote, study.studystatusid"
                + " FROM  study"
                + " WHERE study.id = "
                + this.getId();
        ResultSet rs = null;
        try {
            rs = this.sqlExecuteSelect(strSQL);
            if (rs != null) {
                if (rs.next()) {
                    this.setId(rs.getString("id"));
                    this.setDescription(rs.getString("description"));
                    this.setName(rs.getString("name"));
                    this.setStartNote(rs.getString("interviewstartnote"));
                    this.setEndNote(rs.getString("interviewendnote"));
                    this.setStatusId(rs.getString("studystatusid"));
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
//    public void update1(boolean bInsertNew) throws Exception {
//        if (this.getName().equalsIgnoreCase("")) {
//            throw new Exception("Cannot have a study with no name");
//        }
//        if (!(this.exists())) {
//            if (bInsertNew) {
//                this.insert();
//            } else {
//                throw new Exception("Cannot update non existing study");
//            }
//        } else {
//            String strSQL = "UPDATE study SET name='"
//                    + this.escapeSpecialCharacters(this.getName())
//                    + "', description='"
//                    + this.escapeSpecialCharacters(this.getDescription())
//                    + "',interviewstartnote='"+this.escapeSpecialCharacters(this.getStartNote())
//                    + "',interviewendnote='"+this.escapeSpecialCharacters(this.getEndNote())
//                    + "',studystatusid="+this.getStatusId()
//                    + " WHERE Id = "
//                    + this.getId();
//
//            
//            try {
//                this.sqlExecuteUpdate(strSQL);
//            } catch (SQLException e) {
//                throw new Exception(e.getMessage());
//            }
//        }
//    }
    public void update() throws Exception {
    	String statustype = "Occ";
    	if (Integer.valueOf(this.getStatusId()) >10){statustype = "pt";}
        if (this.getName().equalsIgnoreCase("")) {
            throw new Exception("Cannot have a study with no name");
        }
        if (!(this.exists())) {
            throw new Exception("Cannot update non existing study");          
        } else {
            String strSQL = "UPDATE study SET name='"
                    + this.escapeSpecialCharacters(this.getName())
                    + "', description='"
                    + this.escapeSpecialCharacters(this.getDescription())
                    + "',interviewstartnote='"+this.escapeSpecialCharacters(this.getStartNote())
                    + "',interviewendnote='"+this.escapeSpecialCharacters(this.getEndNote())
                    + "',studystatusid="+this.getStatusId()
                    + " WHERE Id = "
                    + this.getId();        
            try {
                this.sqlExecuteUpdate(strSQL);
                this.updateStudyStatus(statustype);
            } catch (SQLException e) {
                throw new Exception(e.getMessage());
            }
        }
    }
    public void insert() throws Exception {
        String strSQL = "INSERT INTO study (name,description,interviewstartnote,interviewendnote,studystatusid) VALUES('"
                + this.escapeSpecialCharacters(this.getName())
                + "','"
                + this.escapeSpecialCharacters(this.getDescription())
                + "','"
                + this.escapeSpecialCharacters(this.getStartNote())
                + "','"
                + this.escapeSpecialCharacters(this.getEndNote())
                + "',3);";
        try {
            String id = String.valueOf(this.sqlExecuteInsert(strSQL));
            this.setId(id);
            this.saveOption(Study.Option.AUTOGENERATEID);
            this.saveStatus(id);
        } catch (SQLException e) {
            throw new Exception(e.getMessage());
        }
        //this.setStudyCalendarSource();
    }

    public String getDuplicateNameId(String name) throws Exception{
    	//Study bRetValue = false;
    	String studyId = "";
    	String strSQL = "SELECT study.ID FROM study WHERE study.Name = '"
            + this.escapeSpecialCharacters(name)
            + "'";
	    ResultSet rs = null;
	    try {
	        rs = this.sqlExecuteSelect(strSQL);
	        if (rs != null) {
	            if (rs.next()) {
	                studyId = rs.getString("id");
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
    	return studyId;
    }
    public boolean exists() throws Exception {
        boolean bRetValue = false;
        if (!(this.getId().equalsIgnoreCase(""))) {
            bRetValue = true;
        } 
        return bRetValue;
    }
 //   public void update1() throws Exception {
 //       this.update(false);
 //   }
    public void delete() throws Exception {
        String strSQL = "";
        try {
            for (FrozenJobSpecificModule fjms : this.getJsmsFrozen()) {
                fjms.delete();
            }
            strSQL = "DELETE FROM frozenjsm WHERE studyid = " + this.getId();
            this.sqlExecuteUpdate(strSQL);
            strSQL = "DELETE FROM study WHERE id = " + this.getId();
            this.sqlExecuteUpdate(strSQL);
        } catch (SQLException e) {
            throw new Exception(e.getMessage());
        }
    }
    private ArrayList<FrozenJobSpecificModule> getJsmsFrozen() throws Exception {
        ArrayList<FrozenJobSpecificModule> fjsms = new ArrayList<FrozenJobSpecificModule>();
        String strSQL = "SELECT id FROM frozenjsm WHERE studyid=" + this.getId();
        ResultSet rs = null;
        try {
            rs = this.sqlExecuteSelect(strSQL);
            if (rs != null) {
                while (rs.next()) {
                    FrozenJobSpecificModule jsm = new FrozenJobSpecificModule();
                    jsm.setId(rs.getString("id"));
                    fjsms.add(jsm);
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
        return fjsms;
    }
    public ArrayList<JobSpecificModule> getAllJsms() throws Exception {
        this.jsms = new ArrayList<JobSpecificModule>();
        if (this.getAgents().size() > 0) {
            String strSQL = "SELECT DISTINCT ojsm.id, ojsm.name, ojsm.description, ojsm.isassociate"
                    + " FROM jsm ojsm INNER JOIN"
                    + " jsmquestionstructure ojsmqs ON ojsm.id = ojsmqs.jsmid INNER JOIN"
                    + " jsmquestionstructureagent ojsmqsa ON ojsmqs.id = ojsmqsa.jsmquestionstructureid"
                    + " WHERE (ojsmqsa.agentid IN ("
                    + this.getAgentIDs()
                    + ")) AND (ojsm.jsmtypeid = 0) ORDER BY ojsm.name";
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
                        this.jsms.add(jsm);
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
        return jsms;
    }
    public ArrayList<JobSpecificModule> getStudySpecificJsms() throws Exception {
        this.jsms = new ArrayList<JobSpecificModule>();
        String studyId = this.getId();
        try{
        	String parentStudyId = this.getParentStudyId();
        	if(!(parentStudyId.equalsIgnoreCase(""))){
        		studyId = parentStudyId;
        	}
        }catch(Exception e){
        }
        if (this.getAgents().size() > 0) {
            String strSQL = "SELECT DISTINCT ojsm.id, ojsm.description, ojsm.isassociate, ojsm.name, ojsm.jsmtypeid, ojsm.dateupdated"
            	+" FROM jsm ojsm INNER JOIN"
            	+" studyjsms osjsms ON ojsm.id = osjsms.jsmid"
            	+" WHERE (osjsms.studyid = "+studyId+") AND ojsm.jsmtypeid = 1 ORDER BY ojsm.name";
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
                        jsm.setJsmTypeId(rs.getInt("jsmtypeid"));
                        jsm.setDateUpdated(rs.getString("dateupdated"));            
                        this.jsms.add(jsm);
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
        return jsms;
    }
    private ArrayList<JobSpecificModule> getJsms() throws Exception {
        if (this.jsms == null) {
            this.jsms = this.getAllJsms();
        }
        ArrayList<JobSpecificModule> retJsms = new ArrayList<JobSpecificModule>();
        for (JobSpecificModule jsm : this.jsms) {
            if (!(jsm.isAssociateModule())) {
                retJsms.add(jsm);
            }
        }
        return retJsms;
    }
    public ArrayList<JobSpecificModule> getAssociateJsms() throws Exception {
        if (this.jsms == null) {
            this.jsms = this.getAllJsms();
        }
        ArrayList<JobSpecificModule> retJsms = new ArrayList<JobSpecificModule>();
        for (JobSpecificModule jsm : this.jsms) {
            if (jsm.isAssociateModule()) {
                retJsms.add(jsm);
            }
        }
        return retJsms;
    }
    @SuppressWarnings("rawtypes")
	public String getAgentIDs() throws Exception {
        String strAgentIDs = "";
        ArrayList<Agent> agents = this.getAgents();
        for (Iterator it = agents.iterator(); it.hasNext();) {
            Agent agent = (Agent) it.next();
            strAgentIDs += agent.getId() + ",";
        }
        strAgentIDs = strAgentIDs.substring(0, strAgentIDs.lastIndexOf(","));
        return strAgentIDs;
    }
    public void setJsms(ArrayList<JobSpecificModule> jsms) {
        this.jsms = jsms;
    }
    public void addAgent(Agent agent) throws Exception {
        String strSQL = "INSERT INTO studyagents (agentid,studyid) VALUES(" + agent.getId() + "," + this.getId() + ")";
        try {
            String.valueOf(this.sqlExecuteInsert(strSQL));
            if (this.agents == null) {
                this.agents = new ArrayList<Agent>();
            }
            this.agents.add(agent);
        } catch (SQLException e) {
            throw new Exception(e.getMessage());
        }
    }
    public void removeAllAgents() throws Exception {
        if (!(this.getId().equalsIgnoreCase(""))) {
            for (Agent agent : this.getAgents()) {
                this.removeAgent(agent);
            }
        }
        this.agents = new ArrayList<Agent>();
    }
    private void removeAgent(Agent agent) throws Exception {
        String strSQL = "DELETE FROM studyagents WHERE studyid = " + this.getId() + " AND agentid = " + agent.getId();
        try {
            this.sqlExecuteInsert(strSQL);
        } catch (SQLException e) {
            throw new Exception(e.getMessage());
        }
    }   
    public void removeAllUsers() throws Exception {
        if (!(this.getId().equalsIgnoreCase(""))) {
            for (User user : this.getUsers()) {
                this.removeUser(user.getId());
            }
        }
        this.users = new ArrayList<User>();
    }
    private void removeUser(String userId) throws Exception {
        String strSQL = "DELETE FROM userstudies WHERE studyid = " + this.getId() + " AND userid = " + userId;
        try {
            this.sqlExecuteInsert(strSQL);
        } catch (SQLException e) {
            throw new Exception(e.getMessage());
        }
    }
    public List<Participant> getParticipantsDuplicate() throws Exception {        
    	List<Participant> participants = new ArrayList<Participant>();
        ResultSet rs = null;
        try {
            String strSQL = "SELECT participantnamesview.referencenumber, COUNT(participantnamesview.referencenumber) AS numocc " +
            		" FROM participantnamesview WHERE participantnamesview.studyid = "+this.getId()+" GROUP BY participantnamesview.referencenumber  HAVING COUNT(participantnamesview.referencenumber) >1;";
            rs = this.sqlExecuteSelect(strSQL);
            if (rs != null) {
                while (rs.next()) {
                    String referenceNumber = rs.getString("referencenumber");
                    Participant p = new Participant();                 
                    p.setReferenceNumber(referenceNumber);
                    participants.add(p);
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
        return participants;
    }
    
//    public List<Participant> getParticipants() throws Exception {
//        if (this.participants == null) {
//            participants = new ArrayList<Participant>();
//            ResultSet rs = null;
//            try {
//                String strSQL = "SELECT id FROM participant WHERE studyID = " + this.getId() + " ORDER BY referencenumber";
//                rs = this.sqlExecuteSelect(strSQL);
//                if (rs != null) {
//                    while (rs.next()) {
//                        String id = rs.getString("id");
//                        Participant p = new Participant();
//                        p.setId(id);
//                        p.setParticipantId(Long.parseLong(id));
//                        participants.add(p);
//                    }
//                    if (rs.getStatement() != null) {
//                        rs.getStatement().close();
//                    }
//                    rs.close();
//                }
//            } catch (SQLException e) {
//                throw new Exception(e.getMessage());
//            } finally {
//                this.closeConnection();
//            }
//        }
//        for(Participant p:participants){
//        	p.getPersistantObject();
//        }
//        return participants;
//    }
    public List<Participant> filterParticipants(String status) throws Exception {
    	if(this.participants==null){
    		this.loadParticipants();
    	}
    	List<Participant> returnList = new ArrayList<Participant>();
    	if(status.equalsIgnoreCase("None")){
    		returnList = this.participants;
    	}else{
    		for (Participant p: participants) {
        		if (p.getStatusId().equalsIgnoreCase(status)) {
        			if(status.equalsIgnoreCase(ParticipantStatus.TOBEUPDATED)){
        				if(p.getJobHistoriesCount()>0){
        					returnList.add(p);
        				}
        			}else{
        				returnList.add(p);
        			}
        			
        		}
        	}
    	}   	
        return returnList;
    }
	public ArrayList<Participant> getParticipantsWithProgress(ParticipantContactProgress progress, int participantClass) throws Exception{
		ArrayList<Participant> participants = new ArrayList<Participant>();
	     ResultSet rs = null;
	        try {     
	        	String sql = "SELECT id FROM participant WHERE class_id = " + participantClass + " AND studyid = " + this.getId() + " AND participantprogressid ="
						+ Integer.parseInt(progress.value());
	            rs = this.sqlExecuteSelect(sql);
	            if (rs != null) {
	                while (rs.next()) {
	                    Participant p = new Participant(rs.getLong("id"));
	                    participants.add(p);
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
		return participants;
	}
    private void loadParticipants() throws Exception {
    	ArrayList<Participant> retValue = new ArrayList<Participant>();
        ResultSet rs = null;
        try {     
        	String sql = "SELECT id,amr_ref_id,referencenumber,first_name, middle_name, last_name, participantstatusid, lastupdated, gender, studyid, jobhistorycount, nextcontactdatetime, phonenumber FROM participantnamesview"
					+ " WHERE (studyid="+this.getId()+") ";
            rs = this.sqlExecuteSelect(sql);
            if (rs != null) {
                while (rs.next()) {
                    Participant p = new Participant();
                    p.setParticipantId(rs.getLong("id"));
                    p.setAmrRefId(rs.getString("amr_ref_id"));
                    p.setReferenceNumber(rs.getString("referencenumber"));
                    p.setFirstName(rs.getString("first_name"));
                    p.setMiddleName(rs.getString("middle_name"));
                    p.setLastName(rs.getString("last_name"));
                    p.setStatusId(rs.getString("participantstatusid"));
                    p.setStudyId(rs.getString("studyid"));
                    p.setLastUpdated(rs.getString("lastupdated"));
                    p.setJobHistoriesCount(rs.getInt("jobhistorycount"));
                    p.setNextContactDateTime(rs.getString("nextcontactdatetime"));
                    p.setOccContactNo(rs.getString("phonenumber"));
                    p.setGender(rs.getString("gender"));
                    retValue.add(p);
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
        this.participants = retValue;
    }
    
    private void getPersistantParticipants() throws Exception {
    	ArrayList<Participant> retValue = new ArrayList<Participant>();
        ResultSet rs = null;
        try {     
        	String sql = "SELECT id FROM participant"
					+ " WHERE (studyid="+this.getId()+") ";
            rs = this.sqlExecuteSelect(sql);
            if (rs != null) {
                while (rs.next()) {
                    Participant p = new Participant(rs.getLong("id"));
                    retValue.add(p);
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
        fullParticipants =  retValue;
    }
    /*
	public ArrayList<Participant> findParticipants(String status) throws Exception {
    	ArrayList<Participant> retValue = new ArrayList<Participant>();
    	String filter = "";
    	if(!(status.equalsIgnoreCase("None"))){
    		filter = "AND (participantstatusid = "+status+")";
    	}
        ResultSet rs = null;
        try {     
        	String sql = "SELECT id,referencenumber,first_name, middle_name, last_name, participantstatusid, lastupdated, studyid FROM participantnamesview"
					+ " WHERE (studyid="+this.getId()+") "+filter+" ";
            rs = this.sqlExecuteSelect(sql);
            if (rs != null) {
                while (rs.next()) {
                    Participant p = new Participant();
                    p.setParticipantId(rs.getLong("id"));
                    p.setReferenceNumber(rs.getString("referencenumber"));
                    p.setFirstName(rs.getString("first_name"));
                    p.setMiddleName(rs.getString("middle_name"));
                    p.setLastName(rs.getString("last_name"));
                    p.setStatusId(rs.getString("participantstatusid"));
                    p.setStudyId(rs.getString("studyid"));
                    p.setLastUpdated(rs.getString("lastupdated"));
                    retValue.add(p);
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
        //for(Participant p: retValue){
        //	p.getPersistantObject();
        //}
        return retValue;
    }
    */
	public List<Participant> searchParticipantsPeriod(OccCalendar fromDate,OccCalendar toDate) throws Exception {
    	ArrayList<Participant> retValue = new ArrayList<Participant>();
        ResultSet rs = null;
        try {     
        	String sql = "SELECT id,referencenumber,first_name, middle_name, last_name, participantstatusid, lastupdated, studyid,jobhistorycount FROM participantnamesview WHERE studyid = '" + this.getId() + "' AND lastupdated BETWEEN '" + fromDate.getDatabaseFormatDate() + "' AND '" + toDate.getDatabaseFormatDate() + "' ORDER BY lastupdated DESC";
    		
            rs = this.sqlExecuteSelect(sql);
            if (rs != null) {
                while (rs.next()) {
                    Participant p = new Participant();
                    p.setParticipantId(rs.getLong("id"));
                    p.setReferenceNumber(rs.getString("referencenumber"));
                    p.setFirstName(rs.getString("first_name"));
                    p.setMiddleName(rs.getString("middle_name"));
                    p.setLastName(rs.getString("last_name"));
                    p.setStatusId(rs.getString("participantstatusid"));
                    p.setStudyId(rs.getString("studyid"));
                    p.setLastUpdated(rs.getString("lastupdated"));
                    p.setJobHistoriesCount(rs.getInt("jobhistorycount"));
                    retValue.add(p);
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
        this.participants = retValue;
        return retValue;
    }
	public List<Participant> listParticipantsFromParticipantNamesView(String sql) throws Exception {
    	ArrayList<Participant> retValue = new ArrayList<Participant>();
        ResultSet rs = null;
        try {     
//        	String sql = "SELECT id,referencenumber,first_name, middle_name, last_name, participantstatusid, lastupdated, studyid,jobhistorycount FROM participantnamesview WHERE studyid = '" + this.getId() + "' AND lastupdated BETWEEN '" + fromDate.getDatabaseFormatDate() + "' AND '" + toDate.getDatabaseFormatDate() + "' ORDER BY lastupdated DESC";
    		
            rs = this.sqlExecuteSelect(sql);
            if (rs != null) {
                while (rs.next()) {
                    Participant p = new Participant();
                    p.setParticipantId(rs.getLong("id"));
                    p.setReferenceNumber(rs.getString("referencenumber"));
                    p.setStatusId(rs.getString("participantstatusid"));
                    retValue.add(p);
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
        this.participants = retValue;
        return retValue;
    }
	public List<Participant> searchParticipantsAssessment(String searchTxt) throws Exception {
    	ArrayList<Participant> retValue = new ArrayList<Participant>();
        ResultSet rs = null;
        try {     
        	String sql = "SELECT DISTINCT participantnamesview.id,participantnamesview.referencenumber,first_name, middle_name, last_name, participantstatusid, studyid, jobhistorycount FROM participantnamesview INNER JOIN jobhistory ON participantnamesview.id = jobhistory.participantid"
					+ " WHERE (studyid="+this.getId()+") AND ((jobhistory.jobdescription LIKE '%"
					+ this.escapeSpecialCharacters(searchTxt) + "%')"
					+ " OR (participantnamesview.referencenumber LIKE '%"
					+ this.escapeSpecialCharacters(searchTxt) + "%')) ";
            rs = this.sqlExecuteSelect(sql);
            if (rs != null) {
                while (rs.next()) {
                    Participant p = new Participant();
                    p.setParticipantId(rs.getLong("id"));
                    p.setReferenceNumber(rs.getString("referencenumber"));
                    //p.setFirstName(rs.getString("first_name"));
                   // p.setMiddleName(rs.getString("middle_name"));
                    //p.setLastName(rs.getString("last_name"));
                    p.setStatusId(rs.getString("participantstatusid"));
                    p.setStudyId(rs.getString("studyid"));
                    p.setJobHistoriesCount(rs.getInt("jobhistorycount"));
                    retValue.add(p);
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
        this.participants = retValue;
        return retValue;
    }
    public List<Participant> searchParticipants(String searchTxt) throws Exception {
    	List<Participant> retValue = new ArrayList<Participant>();
    	if (searchTxt.equalsIgnoreCase("transcript-on") || searchTxt.equalsIgnoreCase("transcript-off")){
    		participants = this.getParticipantsWithTranscriptInfo(searchTxt);
    		retValue = this.getParticipants();
    		return retValue;
    	}
    	if (searchTxt.equalsIgnoreCase("ff=yes")){
    		participants = this.getParticipantsWithFreqFlyerJob();
    		retValue = this.getParticipants();
    		return retValue;
    	}
    	ResultSet rs = null;
        try {     
        	String sql = "SELECT id,amr_ref_id,referencenumber,first_name, middle_name, last_name, participantstatusid, studyid, jobhistorycount FROM participantnamesview"
					+ " WHERE (studyid="+this.getId()+") AND ((first_name LIKE '%"
					+ this.escapeSpecialCharacters(searchTxt) + "%')"
					+ " OR (last_name LIKE '%"
					+ this.escapeSpecialCharacters(searchTxt) + "%')"
					+ " OR (referencenumber LIKE '%"
					+ this.escapeSpecialCharacters(searchTxt) + "%')"
					+ " OR (amr_ref_id LIKE '%"
					+ this.escapeSpecialCharacters(searchTxt) + "%')) ";
            rs = this.sqlExecuteSelect(sql);
            if (rs != null) {
                while (rs.next()) {
                    Participant p = new Participant();
                    p.setParticipantId(rs.getLong("id"));
                    p.setAmrRefId(rs.getString("amr_ref_id"));
                    p.setReferenceNumber(rs.getString("referencenumber"));
                    p.setFirstName(rs.getString("first_name"));
                    p.setMiddleName(rs.getString("middle_name"));
                    p.setLastName(rs.getString("last_name"));
                    p.setStatusId(rs.getString("participantstatusid"));
                    p.setStudyId(rs.getString("studyid"));
                    p.setJobHistoriesCount(rs.getInt("jobhistorycount"));
                    retValue.add(p);
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
        this.participants = retValue;
        return retValue;
    }
    private List<Participant> getParticipantsWithTranscriptInfo(String searchTxt) throws Exception{
			 List<Participant> retValue = new ArrayList<Participant>();
			 ResultSet rs = null;
			 String condition = searchTxt.equalsIgnoreCase("transcript-on")?"= 'yes'":"!= 'yes'";
			 try {
				 this.connect();
				 this.getStatement();
				 rs = this.executeQuery("Select * from participantnamesview p where transcript_sent " + condition + " order by p.referencenumber");
		            if (rs != null) {
		                while (rs.next()) {
		                    Participant p = new Participant();
		                    p.setParticipantId(rs.getLong("id"));
		                    p.setReferenceNumber(rs.getString("referencenumber"));
		                    p.setFirstName(rs.getString("first_name"));
		                    p.setMiddleName(rs.getString("middle_name"));
		                    p.setLastName(rs.getString("last_name"));
		                    p.setStatusId(rs.getString("participantstatusid"));
		                    p.setStudyId(rs.getString("studyid"));
		                    p.setLastUpdated(rs.getString("lastupdated"));
		                    p.setJobHistoriesCount(rs.getInt("jobhistorycount"));
		                    p.setNextContactDateTime(rs.getString("nextcontactdatetime"));
		                    p.setOccContactNo(rs.getString("phonenumber"));
		                    p.setTranscriptSent(rs.getString("transcript_sent").equalsIgnoreCase("yes")?true:false);
		                    retValue.add(p);
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
		        this.participants = retValue;
			 return retValue;
		 
	}

	public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEndNote() {
        return endNote;
    }
    public void setEndNote(String endNote) {
        this.endNote = endNote;
    }
    public String getStartNote() {
        return startNote;
    }
    public void setStartNote(String startNote) {
        this.startNote = startNote;
    }   
	public ArrayList<StudyNote> getStudyNotes() throws Exception {
        if (!(this.getId().equalsIgnoreCase(""))) {
        	if(this.studyNotes.isEmpty()){
        		this.getPersistentStudyNoteObjects();
        	}
        } 
        return studyNotes;
    } 
	/*
    public int getReadyInterviewCount() throws Exception {        
        return this.filterParticipants(ParticipantStatus.READYFORINTERVIEW).size();
    }
    public int getCompletedInterviewCount() throws Exception {      
        return this.filterParticipants(ParticipantStatus.READYFORASSESSMENT).size();
    }
    public List<Participant> getReadyParticipants() throws Exception {
        return this.filterParticipants(ParticipantStatus.READYFORINTERVIEW);
    }
    public List<Participant> getCompleteParticipants() throws Exception {
        return this.filterParticipants(ParticipantStatus.READYFORASSESSMENT);
    }
    */
    public ArrayList<Study> getStudies(Study.Option option) throws Exception {
        ArrayList<Study> studies = null;
        ResultSet rs = null;
        String whereModule = "";
        String distinct = "";
        if (option == null) {whereModule = "";distinct = " DISTINCT ";}
        else if (option.equals(Option.USEOCCIDEAS)) {whereModule = "AND studystudyoptions.studyoptionid = 5";}
        else if (option.equals(Option.USEPARTICIPANT)) {whereModule = "AND studystudyoptions.studyoptionid = 6";}
        if (option.equals(Option.USEBIOSPECIMENS)) {whereModule = "AND studystudyoptions.studyoptionid = 7";}
        
        try {
            studies = new ArrayList<Study>();
            String strSQL = "SELECT id FROM study";
            if(this.getUserId().equalsIgnoreCase("")){
            	strSQL = "SELECT id FROM study";
            }else{            	
            	strSQL = "SELECT " + distinct + "study.id, userstudies.userid"
                	+ " FROM study,userstudies, studystudyoptions"
                	+ " WHERE study.id = userstudies.studyid"
                	+ " AND study.id = studystudyoptions.studyid "
                	+ whereModule 
                	+ " AND userstudies.userid = " + this.getUserId();
            }
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
        return studies;
    }
    public ArrayList<Study> getPTStudies() throws Exception {
        ArrayList<Study> studies = null;
        ResultSet rs = null;
                
        try {
            studies = new ArrayList<Study>();
            String strSQL = "SELECT study.id"
                	+ " FROM study,userstudies, studystudyoptions"
                	+ " WHERE study.id = userstudies.studyid"
                	+ " AND study.id = studystudyoptions.studyid "
                	+ " AND (studystudyoptions.studyoptionid = 6 " 
                	+ " OR studystudyoptions.studyoptionid = 7)" 
                	+ " AND userstudies.userid = " + this.getUserId();
            
            rs = this.sqlExecuteSelect(strSQL);
            if (rs != null) {
                while (rs.next()) {
                    Study study = new Study(rs.getString("id"));
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
        return studies;
    }
    public String getOccStatusName() {
    	String retValue = "";
        if (this.getStatusId() != null) {
            if (this.getStatusId().equalsIgnoreCase(StudyStatus.COMPLETE)) {
                retValue = "Complete";
            } else if (this.getStatusId().equalsIgnoreCase(StudyStatus.INPROGRESS)) {
                retValue = "In Progress";
            } else if (this.getStatusId().equalsIgnoreCase(StudyStatus.INITIALPHASE)) {
                retValue = "Not Started";
            } else {
                retValue = this.getStatusId();
            }
        } else {
            retValue = "no ID";
        }
        return retValue;
    }
    public String getPtStatusName() {
    	String retValue = "";
        if (this.getStatusId() != null) {
            if (this.getStatusId().equalsIgnoreCase(StudyStatus.PTSTATUS1)) {
                retValue = "PTStatus1";
            } else if (this.getStatusId().equalsIgnoreCase(StudyStatus.PTSTATUS2)) {
                retValue = "PTStatus1";
            } else {
                retValue = "Status not defined";
            }
        } else {
            retValue = "no ID";
        }
        return retValue;
    }
    public int getParticipantCount(String participantStatus) throws Exception {        
        return this.filterParticipants(participantStatus).size();
    }
    public int getParticipantCount(String[] statuses) throws Exception{
    	int iRetValue = 0;
    	for(String status: statuses){
    		iRetValue += this.getParticipantCount(status);
    	}
    	return iRetValue;
    }
    /*
	public void copy() throws Exception {
		Study copyStudy = new Study();
		copyStudy.setName("Copy of "+this.getName());
		copyStudy.insert();
		for(Agent a:this.getAgents()){
			copyStudy.addAgent(a);
		}
		for(JobSpecificModule jsm: this.getJsms()){
			FrozenJobSpecificModule fjsm = jsm.getFrozenJSM(copyStudy.getId());
			if(fjsm!=null){
				fjsm.archive();
			}
			jsm.freeze(copyStudy);
		}
		copyStudy.setStatusId(StudyStatus.INPROGRESS);
		copyStudy.update();		
		for(Participant p:this.findParticipants(ParticipantStatus.NONE)){
			p.copy(copyStudy);						
		}	
	}
	*/
//	public void setParticipants(List<Participant> participants) {
//		this.participants = participants;
//	}
//	public ArrayList<ExpertRule> getRules() throws Exception {
//		if (!(this.getId().equalsIgnoreCase(""))) {
//        	if(this.rules==null){
//        		this.getPersistentRuleObjects();
//        	}
//        } else {
//        	rules = new ArrayList<ExpertRule>();
//        }
//		return rules;
//	}
//	private void getPersistentRuleObjects() throws Exception {
//		String strSQL = "";
//        ResultSet rs = null;
//        try {
//            ArrayList<ExpertRule> rules = new ArrayList<ExpertRule>();
//            strSQL = "SELECT ruleid"
//                    + " FROM studyrules WHERE (studyid = "
//                    + this.getId()
//                    + ") ";
//            rs = this.sqlExecuteSelect(strSQL);
//            if (rs != null) {
//                while (rs.next()) {
//                    ExpertRule rule = new ExpertRule(rs.getString("ruleid"));
//                    
//                    rules.add(rule);
//                }
//                if (rs.getStatement() != null) {
//                    rs.getStatement().close();
//                }
//                rs.close();
//            }
//            this.setRules(rules);
//        } catch (SQLException e) {
//            throw new Exception(e.getMessage());
//        } finally {
//            this.closeConnection();
//        }
//	}
//	public void setRules(ArrayList<ExpertRule> rules) {
//		this.rules = rules;
//	}
//	public void removeRule(String id) throws Exception {
//		String strSQLDelete = "DELETE FROM studyrules WHERE studyid = " + this.getId() + " AND ruleid = " + id ;  
//        this.sqlExecuteUpdate(strSQLDelete);         
//	}
	public ArrayList<Study> getStudies(String userId) throws Exception {
		ArrayList<Study> studies = null;
        ResultSet rs = null;
        try {
            studies = new ArrayList<Study>();
            String strSQL = "SELECT DISTINCT study.id, userstudies.userid"
            	+ " FROM study, userstudies "
            	+ " WHERE study.id = userstudies.studyid"
            	+ " AND (userstudies.userid = "+userId+") ORDER BY study.name";
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
        return studies;
	}
	public void linkJSM(String addId,String userId) throws Exception {
		JobSpecificModule jsm = new JobSpecificModule(addId);
		if(jsm.getJsmTypeId() == JobSpecificModule.TEMPLATE){
			//copy the template first
			JobSpecificModule copyJSM = jsm.copy(userId,this);
			copyJSM.setName(jsm.getName()+"_"+this.getName());
			copyJSM.save();			
			copyJSM.updateTimeStamp();
			addId = copyJSM.getId();			
//			copy jsm rules
			for(Agent agent: this.getAgents()){
				jsm.copyRulesToJSM(agent,copyJSM);			
			}
		}
		String strSQL = "INSERT INTO studyjsms (jsmid,studyid) VALUES(" + addId + "," + this.getId() + ")";
        try {
            this.sqlExecuteInsert(strSQL);                        
        } catch (SQLException e) {
            throw new Exception(e.getMessage());
        }
	}
	public void unlinkJSM(String id) throws Exception {
		String strSQL = "DELETE FROM studyjsms WHERE studyid = " + this.getId() + " AND jsmid = " + id;
        try {
            this.sqlExecuteInsert(strSQL);
        } catch (SQLException e) {
            throw new Exception(e.getMessage());
        }
	}
	public String getUserId() {
		if(this.userId == null){
			this.userId = "";
		}
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public boolean hasOption(Option option) throws Exception {
		boolean bRetValue = false;
		if (!this.getId().equalsIgnoreCase("")) {
			try {
	            String strSQL = "SELECT studystudyoptions.id " +
	            		" FROM studyoptions INNER JOIN" +
	            		" studystudyoptions ON studyoptions.id = studystudyoptions.studyoptionid" +
	            		" WHERE (studyoptions.name = '"+option.toString()+"') AND (studystudyoptions.studyid = "+this.getId()+")";
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
	public void saveOption(Option op) throws Exception {
    	if(!this.optionExists(op)){
    		this.insertOption(op);
    	}
	    String insertQuery = "INSERT studystudyoptions (studyid, studyoptionid)  SELECT study.id,studyoptions.id FROM studyoptions INNER JOIN study ON study.id = "+this.getId()+" AND studyoptions.name = '"+op.toString()+"'  ";	    			      	
	    this.sqlExecuteUpdate(insertQuery);
    }
	private boolean optionExists(Option op) throws Exception {
    	boolean bRetValue = false;
        try {
            String strSQL = "SELECT id " +
            		" FROM studyoptions WHERE (studyoptions.name = '"+op.toString()+"')";
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
	private void insertOption(Option op) throws Exception {
	    String insertQuery = "INSERT studyoptions (name) VALUES ('"+op.toString()+"')  ";	    			
        this.sqlExecuteUpdate(insertQuery);		
	}
	public void removeOptions()throws Exception {
    	String deleteQuery = "DELETE FROM studystudyoptions WHERE studystudyoptions.studyid = "+this.getId();
    	sqlExecuteUpdate(deleteQuery);
    }
	public Study findStudy(String name) throws Exception {
		Study retValue = new Study();
		String strSQL = "SELECT study.id FROM study WHERE study.name = '"
            + this.escapeSpecialCharacters(name)
            + "'";
	    ResultSet rs = null;
	    String id = "";
	    try {
	        rs = this.sqlExecuteSelect(strSQL);
	        if (rs != null) {
	            if (rs.next()) {
	            	id = rs.getString("id");
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
	    retValue = new Study(id);
		return retValue;
	}
	public ArrayList<User> getUsers() throws Exception {
		if (!(this.getId().equalsIgnoreCase(""))) {
        	if(this.users==null){
        		this.getPersistentUserObjects();
        	}
        } else {
        	users = new ArrayList<User>();
        }
		return users;
	}
	private void getPersistentUserObjects() throws Exception {
		String strSQL = "";
        ResultSet rs = null;
        try {
            ArrayList<User> users = new ArrayList<User>();
            strSQL = "SELECT users.id, users.username" +
            		" FROM users INNER JOIN userstudies ON users.id = userstudies.userid "
                    + " WHERE (userstudies.studyid = "
                    + this.getId()
                    + ") ";
            rs = this.sqlExecuteSelect(strSQL);
            if (rs != null) {
                while (rs.next()) {
                    User user = new User();
                    user.setId(rs.getString("id"));
                    user.setName(rs.getString("username"));                   
                    users.add(user);
                }
                if (rs.getStatement() != null) {
                    rs.getStatement().close();
                }
                rs.close();
            }
            this.setUsers(users);
        } catch (SQLException e) {
            throw new Exception(e.getMessage());
        } finally {
            this.closeConnection();
        }
	}
	public void setUsers(ArrayList<User> users) {
		this.users = users;
	}
	public void removeAllJSMs() throws Exception {
		for(JobSpecificModule jsm: this.getStudySpecificJsms()){
			if(jsm.getFrozenJSM(this.getId())==null){
				jsm.delete();
			}			
		}	
		this.jsms = null;
	}
//	public boolean hasRule(ExpertRule rule) throws Exception {
//		boolean retValue = false;
//		for(ExpertRule er: this.getRules()){
//			if(rule.getId().equalsIgnoreCase(er.getId())){
//				retValue = true;
//			}
//		}
//		return retValue;
//	}
//	public void removeAllRules() throws Exception {
//		for(ExpertRule er: this.getRules()){	
//			this.removeRule(er.getId());			
//		}
//	}
	public ArrayList<JobSpecificModule> getEvaluationJsms() throws Exception {
		ArrayList<JobSpecificModule> jsms = new ArrayList<JobSpecificModule>();

		String strSQL = "SELECT DISTINCT ojsm.id, ojsm.description, ojsm.isassociate, ojsm.name, ojsm.jsmtypeid"
				+ " FROM jsm ojsm INNER JOIN"
				+ " studyjsms osjsms ON ojsm.id = osjsms.jsmid"
				+ " WHERE (osjsms.studyid = "
				+ this.getId()
				+ ") AND ojsm.jsmtypeid = 3 ORDER BY ojsm.name";
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
					jsm.setJsmTypeId(rs.getInt("jsmtypeid"));
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

	public ArrayList<Interview> getInterviews() throws Exception {
		ArrayList<Interview> interviews = new ArrayList<Interview>();
		if (!(this.getId().equalsIgnoreCase(""))) {       	
			String strSQL = "";
	        ResultSet rs = null;
	        try {
	            strSQL = "SELECT ojsmi.id" +
	            		" FROM jsminterview ojsmi" +
	            		" INNER JOIN (frozenjsm ofjsm INNER JOIN study mstudy ON ofjsm.studyid = mstudy.id)" +
	            		" ON ojsmi.frozenjsmid = ofjsm.id WHERE mstudy.id = "+this.getId() +" ORDER BY ofjsm.name ";
	            rs = this.sqlExecuteSelect(strSQL);
	            if (rs != null) {
	                while (rs.next()) {
	                    Interview interview = new Interview();
	                    interview.setId(rs.getString("id"));
	                    interviews.add(interview);
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
		for(Interview interview: interviews){
			interview.getPersistentObject();
		}
        return interviews;
	}
	public ArrayList<FrozenJobSpecificModule> getFrozenJSMs() throws Exception {
		if(this.frozenJSMs==null){
			ArrayList<FrozenJobSpecificModule> fjsms = new ArrayList<FrozenJobSpecificModule>();
			if (!(this.getId().equalsIgnoreCase(""))) {       	
				String strSQL = "";
		        ResultSet rs = null;
		        try {
		            strSQL = "SELECT ofjsm.id FROM frozenjsm ofjsm INNER JOIN study mstudy ON ofjsm.studyid = mstudy.id WHERE mstudy.id="+this.getId() +" ORDER BY ofjsm.name";
		            rs = this.sqlExecuteSelect(strSQL);
		            if (rs != null) {
		                while (rs.next()) {
		                	FrozenJobSpecificModule fjsm = new FrozenJobSpecificModule();
		                    fjsm.setId(rs.getString("id"));
		                    fjsms.add(fjsm);
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
			for(FrozenJobSpecificModule fjsm: fjsms){
				fjsm.getPersistentObject();
			}
			frozenJSMs = fjsms;
		}
		
        return frozenJSMs;
	}
	public int getJobHistoryCount(String status) throws Exception {
		int retValue = 0;
		ResultSet rs = null;		
		String strSQL = "SELECT Count(jobhistory.id) AS CountOfid"
			+" FROM participant INNER JOIN jobhistory ON participant.id = jobhistory.participantid"
			+" GROUP BY participant.studyid, participant.participantstatusid,jobhistory.jobhistorystatusid" +
					" HAVING (((participant.studyid)="+this.getId()+") AND (jobhistory.jobhistorystatusid="+status+") AND ((participant.participantstatusid) IN (3,4)));";					
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
		this.closeConnection();
		return retValue;
	}
	public int getJobHistoryAssessedCount(String status) throws Exception {
		int retValue = 0;
		ResultSet rs = null;		
		String strSQL = "SELECT Count(jobhistory.id) AS CountOfid"
			+" FROM participant INNER JOIN jobhistory ON participant.id = jobhistory.participantid WHERE (jobhistory.finaljsmid IS NOT NULL)"
			+" GROUP BY participant.studyid, participant.participantstatusid,jobhistory.jobhistorystatusid" +
					" HAVING (((participant.studyid)="+this.getId()+") AND (jobhistory.jobhistorystatusid="+status+") AND ((participant.participantstatusid) IN (6)));";					
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
		this.closeConnection();
		return retValue;
	}
	public ArrayList<JobSpecificModule> getStudySpecificJsmsPreview() throws Exception {
		return this.getJsms();
	}
	public ArrayList<JobHistory> getJobHistoriesForAssessment(String statusFilter, String jsmFilter) throws Exception {
		ArrayList<JobHistory> jhs = new ArrayList<JobHistory>();
		ResultSet rs = null;		
		String sql = "SELECT jobhistory.id,jobhistory.participantid,participant.referencenumber as participantreferencenumber,jobhistory.jobhistorystatusid, jobhistory.referencenumber,jobhistory.finaljsmid"
    		+" FROM jobhistory INNER JOIN"
    		+" participant ON jobhistory.participantid = participant.id INNER JOIN"
    		+" study ON participant.studyid = study.id "
    		+" WHERE (participant.participantstatusid IN (4,5,6))" +
    				" AND (study.id = "+this.getId()+") "+statusFilter+" "+jsmFilter+" ORDER BY participant.id,jobhistory.id";					
		rs = this.sqlExecuteSelect(sql);
		if (rs != null) {
			while (rs.next()) {
				JobHistory jh = new JobHistory();
				jh.setId(rs.getString("id"));
				jh.setStatusId(rs.getString("jobhistorystatusid"));
				jh.setParticipantId(rs.getString("participantid"));
				jh.setParticipantReferenceNumber(rs.getString("participantreferencenumber"));
				jh.setReferenceNumber(rs.getString("referencenumber"));
				jh.setFinalJSMId(rs.getString("finaljsmid"));
				jhs.add(jh);
			}
			if (rs.getStatement() != null) {
				rs.getStatement().close();
			}
			rs.close();
		}
		this.closeConnection();
		//for(JobHistory jh: jhs){
		//	jh.getPersistentObject();
		//}
		return jhs;
	}
	public ArrayList<JobHistory> getJobHistories() throws Exception {
		ArrayList<JobHistory> jhs = new ArrayList<JobHistory>();
		ResultSet rs = null;		
		String strSQL = "SELECT  jobhistory.id, age, priority, yearstarted, durationyears, employer, jobtitle, "
                + " participantid, finaljsmid, ifinaljsmfrozen, weeksperyear, hoursperweek, suburb, state, country, "
                + " jobhistory.description, jobhistory.comments, jobdescription, jobhistorystatusid, jobhistory.referencenumber, nrsmokedday,participant.referencenumber as participantreferencenumber FROM jobhistory" +
				" INNER JOIN (participant INNER JOIN study ON participant.studyid = study.id)" +
				" ON jobhistory.participantid = participant.id" +
				" WHERE study.id="+this.getId()+"";					
		rs = this.sqlExecuteSelect(strSQL);
		if (rs != null) {
			while (rs.next()) {
				JobHistory jh = new JobHistory();
				jh.setId(rs.getString("id"));
				jh.setStatusId(rs.getString("jobhistorystatusid"));
				jh.setParticipantId(rs.getString("participantid"));
				jh.setParticipantReferenceNumber(rs.getString("participantreferencenumber"));
				jh.setReferenceNumber(rs.getString("referencenumber"));
				jh.setFinalJSMId(rs.getString("finaljsmid"));			
				jh.setAge(rs.getInt("age"));
				jh.setPriority(rs.getInt("priority"));
				jh.setYearStarted(rs.getInt("yearstarted"));
				jh.setDurationYears(rs.getFloat("durationyears"));
				jh.setEmployer(rs.getString("employer"));
				jh.setJobTitle(rs.getString("jobtitle"));
                jh.setParticipantId(rs.getString("participantid"));
                jh.setWeeksPerYear(rs.getFloat("weeksperyear"));
                jh.setHoursPerWeek(rs.getFloat("hoursperweek"));
                jh.setSuburb(rs.getString("suburb"));
                jh.setState(rs.getString("state"));
                jh.setCountry(rs.getString("country"));
                jh.setDescription(rs.getString("description"));
                jh.setComments(rs.getString("comments"));
                jh.setJobDescription(rs.getString("jobdescription"));
                //jh.setNrsmokedday(rs.getInt("nrsmokedday"));
                //jh.loadTasks();
				jhs.add(jh);
			}
			if (rs.getStatement() != null) {
				rs.getStatement().close();
			}
			rs.close();
		}
		this.closeConnection();
		return jhs;
	}
	public ArrayList<JobHistory> getJobHistoriesForAssessment(Integer iJobHistoryStatusId) throws Exception {
		ArrayList<JobHistory> jhs = new ArrayList<JobHistory>();
		ResultSet rs = null;		
		String strSQL = "SELECT  jobhistory.id,jobhistory.jobhistorystatusid,jobhistory.participantid,participant.referencenumber as participantreferencenumber,jobhistory.referencenumber,jobhistory.finaljsmid FROM jobhistory" +
				" INNER JOIN (participant INNER JOIN study ON participant.studyid = study.id)" +
				" ON jobhistory.participantid = participant.id " +
				" WHERE jobhistory.jobhistorystatusid = "+iJobHistoryStatusId+" AND study.id="+this.getId()+"";
		
		rs = this.sqlExecuteSelect(strSQL);
		if (rs != null) {
			while (rs.next()) {
				JobHistory jh = new JobHistory();
				jh.setId(rs.getString("id"));
				jh.setStatusId(rs.getString("jobhistorystatusid"));
				jh.setParticipantId(rs.getString("participantid"));
				jh.setParticipantReferenceNumber(rs.getString("participantreferencenumber"));
				jh.setReferenceNumber(rs.getString("referencenumber"));
				jh.setFinalJSMId(rs.getString("finaljsmid"));
				jhs.add(jh);
			}
			if (rs.getStatement() != null) {
				rs.getStatement().close();
			}
			rs.close();
		}
		this.closeConnection();
		//for(JobHistory jh: jhs){
		//	jh.getPersistentObject();
		//}
		return jhs;
	}
	public ArrayList<JobHistory> getJobHistoriesDoneAssessment(Integer iJobHistoryStatusId) throws Exception {
		ArrayList<JobHistory> jhs = new ArrayList<JobHistory>();
		ResultSet rs = null;		
		String strSQL = "SELECT  jobhistory.id,jobhistory.jobhistorystatusid,jobhistory.participantid,participant.referencenumber as participantreferencenumber,jobhistory.referencenumber,jobhistory.finaljsmid FROM jobhistory" +
				" INNER JOIN (participant INNER JOIN study ON participant.studyid = study.id)" +
				" ON jobhistory.participantid = participant.id " +
				" INNER JOIN agentassessments ON jobhistory.id = agentassessments.jobhistoryid " +
				" WHERE jobhistory.jobhistorystatusid = "+iJobHistoryStatusId+" AND ((agentassessments.assessorusername)<>'OccIDEAS') AND study.id="+this.getId()+"";
		
		rs = this.sqlExecuteSelect(strSQL);
		if (rs != null) {
			while (rs.next()) {
				JobHistory jh = new JobHistory();
				jh.setId(rs.getString("id"));
				jh.setStatusId(rs.getString("jobhistorystatusid"));
				jh.setParticipantId(rs.getString("participantid"));
				//jh.setParticipantReferenceNumber(rs.getString("participantreferencenumber"));
				jh.setReferenceNumber(rs.getString("referencenumber"));
				jh.setFinalJSMId(rs.getString("finaljsmid"));
				jhs.add(jh);
			}
			if (rs.getStatement() != null) {
				rs.getStatement().close();
			}
			rs.close();
		}
		this.closeConnection();
		//for(JobHistory jh: jhs){
		//	jh.getPersistentObject();
		//}
		return jhs;
	}
	public ArrayList<JobHistory> getJobHistoriesForAssessment(String jsmId) throws Exception {
		ArrayList<JobHistory> jhs = new ArrayList<JobHistory>();
		ResultSet rs = null;		
		String strSQL = "SELECT jobhistory.id,jobhistory.jobhistorystatusid,jobhistory.participantid,participant.referencenumber as participantreferencenumber,jobhistory.referencenumber,jobhistory.finaljsmid FROM jobhistory" +
				" INNER JOIN (participant INNER JOIN study ON participant.studyid = study.id)" +
				" ON jobhistory.participantid = participant.id" +
				" WHERE ((jobhistory.jobhistorystatusid = "+JobHistoryStatus.INTERVIEWED+") OR (jobhistory.jobhistorystatusid = "+JobHistoryStatus.NOTTOBEINTERVIEWEDTIME+")) AND participant.participantstatusid != "+ParticipantStatus.ASSESSMENTCOMPLETE+" AND study.id="+this.getId()+" AND finaljsmid="+jsmId;					
		rs = this.sqlExecuteSelect(strSQL);
		if (rs != null) {
			while (rs.next()) {
				JobHistory jh = new JobHistory();
				jh.setId(rs.getString("id"));
				jh.setStatusId(rs.getString("jobhistorystatusid"));
				jh.setParticipantId(rs.getString("participantid"));
				jh.setParticipantReferenceNumber(rs.getString("participantreferencenumber"));
				jh.setReferenceNumber(rs.getString("referencenumber"));
				jh.setFinalJSMId(rs.getString("finaljsmid"));
				jhs.add(jh);
			}
			if (rs.getStatement() != null) {
				rs.getStatement().close();
			}
			rs.close();
		}
		this.closeConnection();
		//for(JobHistory jh: jhs){
		//	jh.getPersistentObject();
		//}
		return jhs;
	}
	public ArrayList<JobHistory> getJobHistoriesWithAnswer(String answerID,String questionID,String answerDescription) throws Exception {
		ArrayList<JobHistory> jhs = new ArrayList<JobHistory>();
		ResultSet rs = null;		
		String sql = "SELECT jsminterview.jobhistoryid AS id,jobhistory.finaljsmid,participant.referencenumber as participantreferencenumber,jobhistory.participantid,jobhistory.jobhistorystatusid,jobhistory.referencenumber FROM  jsminterviewanswers" +
		" INNER JOIN jsminterview ON jsminterviewanswers.jsminterviewid = jsminterview.id" +
		" INNER JOIN jobhistory ON jsminterview.jobhistoryid = jobhistory.id" +
		" INNER JOIN participant ON jobhistory.participantid = participant.id " +
		" WHERE (participant.participantstatusid IN (4,5,6))" +
				" AND (jsminterviewanswers.jsmquestionstructureid = "+questionID+")" +
				" AND (jsminterviewanswers.possibleanswerid = "+answerID+")" +
				" AND (jsminterviewanswers.answerdescription = "+answerDescription+") AND (participant.studyid = "
				+this.getId()+")  ORDER BY jsminterview.jobhistoryid ";					
		rs = this.sqlExecuteSelect(sql);
		if (rs != null) {
			while (rs.next()) {
				JobHistory jh = new JobHistory();
				jh.setId(rs.getString("id"));
				jh.setStatusId(rs.getString("jobhistorystatusid"));
				jh.setParticipantId(rs.getString("participantid"));
				jh.setParticipantReferenceNumber(rs.getString("participantreferencenumber"));
				jh.setReferenceNumber(rs.getString("referencenumber"));
				jh.setFinalJSMId(rs.getString("finaljsmid"));
				jhs.add(jh);
			}
			if (rs.getStatement() != null) {
				rs.getStatement().close();
			}
			rs.close();
		}
		this.closeConnection();
		//for(JobHistory jh: jhs){
		//	jh.getPersistentObject();
		//}
		return jhs;
	}
    public void save() throws Exception {
    }
//	public int getJobHistoryCountMappedInScope() throws Exception {
//		int retValue = 0;
//		ResultSet rs = null;		
//		String strSQL = "SELECT Count(jobhistory.id) AS CountOfid"
//			+" FROM participant INNER JOIN jobhistory ON participant.id = jobhistory.participantid"
//			+" "
//			+" GROUP BY participant.studyid, participant.participantstatusid, jobhistory.jobhistorystatusid" +
//					" HAVING (((participant.studyid)=1) AND (jobhistory.jobhistorystatusid=7) AND ((participant.participantstatusid) In (4,5,6)));";					
//		rs = this.sqlExecuteSelect(strSQL);
//		if (rs != null) {
//			if (rs.next()) {
//				retValue = rs.getInt("CountOfid");
//			}
//			if (rs.getStatement() != null) {
//				rs.getStatement().close();
//			}
//			rs.close();
//		}
//		this.closeConnection();
//		return retValue;
//	}
//	public int getJobHistoryCountMappedNot() throws Exception {
//		int retValue = 0;
//		ResultSet rs = null;		
//		String strSQL = "SELECT Count(jobhistory.id) AS CountOfid"
//			+" FROM participant INNER JOIN jobhistory ON participant.id = jobhistory.participantid"
//			+" WHERE (((jobhistory.finaljsmid) Is Null))"
//			+" GROUP BY participant.studyid, participant.participantstatusid" +
//					" HAVING (((participant.studyid)=1) AND ((participant.participantstatusid) In (4,5,6)));";					
//		rs = this.sqlExecuteSelect(strSQL);
//		if (rs != null) {
//			if (rs.next()) {
//				retValue = rs.getInt("CountOfid");
//			}
//			if (rs.getStatement() != null) {
//				rs.getStatement().close();
//			}
//			rs.close();
//		}
//		this.closeConnection();
//		return retValue;
//	}
//	public int getJobHistoryCountMappedOutScope() throws Exception {
//		int retValue = 0;
//		ResultSet rs = null;		
//		String strSQL = "SELECT Count(jobhistory.id) AS CountOfid"
//			+" FROM participant INNER JOIN jobhistory ON participant.id = jobhistory.participantid"
//			+" WHERE (((jobhistory.finaljsmid) Is Not Null))"
//			+" GROUP BY participant.studyid, participant.participantstatusid, jobhistory.jobhistorystatusid" +
//					" HAVING (((participant.studyid)=1) AND (jobhistory.jobhistorystatusid=4) AND ((participant.participantstatusid) In (4,5,6)));";					
//		rs = this.sqlExecuteSelect(strSQL);
//		if (rs != null) {
//			if (rs.next()) {
//				retValue = rs.getInt("CountOfid");
//			}
//			if (rs.getStatement() != null) {
//				rs.getStatement().close();
//			}
//			rs.close();
//		}
//		this.closeConnection();
//		return retValue;
//	}
	public int getJobHistoryCount() throws Exception {
		int retValue = 0;
		ResultSet rs = null;		
		String strSQL = "SELECT Count(jobhistory.id) AS CountOfid"
			+" FROM participant INNER JOIN jobhistory ON participant.id = jobhistory.participantid"
			+" GROUP BY participant.studyid, participant.participantstatusid" +
					" HAVING (((participant.studyid)="+this.getId()+") AND ((participant.participantstatusid) In (4,5,6)));";					
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
		this.closeConnection();
		return retValue;
	}
	public int getJobHistoryAssessedCount() throws Exception {
		int retValue = 0;
		ResultSet rs = null;		
		String strSQL = "SELECT Count(jobhistory.id) AS CountOfid"
			+" FROM participant INNER JOIN jobhistory ON participant.id = jobhistory.participantid"
			+" GROUP BY participant.studyid, participant.participantstatusid" +
					" HAVING (((participant.studyid)="+this.getId()+") AND ((participant.participantstatusid) In (5,6)));";					
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
		this.closeConnection();
		return retValue;
	}
	public int getJobHistoryCountOtherAssessedAuto() throws Exception {
		int retValue = 0;
		ResultSet rs = null;		
		String strSQL = "SELECT Count(jobhistory.id) AS CountOfid"
			+" FROM agentassessments INNER JOIN (jobhistory INNER JOIN participant ON jobhistory.participantid = participant.id) ON agentassessments.jobhistoryid = jobhistory.id"
			+" WHERE ((jobhistory.jobhistorystatusid) In (1,4,5,6)) AND ((agentassessments.assessorusername)='OccIDEAS')" +
					" GROUP BY participant.studyid" +
					" HAVING (((participant.studyid)="+this.getId()+") );";					
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
		this.closeConnection();
		return retValue;
	}
	public int getJobHistoryCountNotInScope() throws Exception {
		int retValue = 0;
		ResultSet rs = null;		
		String strSQL = "SELECT Count(jobhistory.id) AS CountOfid " +
				" FROM jobhistory INNER JOIN participant ON jobhistory.participantid = participant.id " +
				" WHERE (participant.studyid="+this.getId()+") AND (jobhistory.jobhistorystatusid="+JobHistoryStatus.NOTTOBEINTERVIEWEDSCOPE+");";					
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
		this.closeConnection();
		return retValue;
	}
	public int getJobHistoryCountNotInScopeAssessed() throws Exception {
		int retValue = 0;
		ResultSet rs = null;		
		String strSQL = "SELECT Count(jobhistory.id) AS CountOfid " +
				" FROM jobhistory INNER JOIN participant ON jobhistory.participantid = participant.id " +
				" INNER JOIN agentassessments ON jobhistory.id =agentassessments.jobhistoryid " +
				" WHERE (participant.studyid="+this.getId()+") AND ((agentassessments.assessorusername)<>'OccIDEAS') AND (jobhistory.jobhistorystatusid="+JobHistoryStatus.NOTTOBEINTERVIEWEDSCOPE+");";					
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
		this.closeConnection();
		return retValue;
	}
	public int getJobHistoryCountNoAppropriateJSM() throws Exception {
		int retValue = 0;
		ResultSet rs = null;		
		String strSQL = "SELECT Count(jobhistory.id) AS CountOfid " +
				" FROM jobhistory INNER JOIN participant ON jobhistory.participantid = participant.id " +
				" WHERE (participant.studyid="+this.getId()+") AND (jobhistory.jobhistorystatusid="+JobHistoryStatus.NOTTOBEINTERVIEWEDNOJSM+");";					
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
		this.closeConnection();
		return retValue;
	}
	public int getJobHistoryCountNoAppropriateJSMAssessed() throws Exception {
		int retValue = 0;
		ResultSet rs = null;		
		String strSQL = "SELECT Count(jobhistory.id) AS CountOfid " +
				" FROM jobhistory INNER JOIN participant ON jobhistory.participantid = participant.id " +
				" INNER JOIN agentassessments ON jobhistory.id = agentassessments.jobhistoryid " +
				" WHERE (participant.studyid="+this.getId()+") AND ((agentassessments.assessorusername)<>'OccIDEAS') AND (jobhistory.jobhistorystatusid="+JobHistoryStatus.NOTTOBEINTERVIEWEDNOJSM+");";					
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
		this.closeConnection();
		return retValue;
	}
	public int getJobHistoryCountNoAppropriateJSMAssessedAuto() throws Exception {
		int retValue = 0;
		ResultSet rs = null;		
		String strSQL = "SELECT Count(jobhistory.id) AS CountOfid " +
				" FROM jobhistory INNER JOIN participant ON jobhistory.participantid = participant.id " +
				" INNER JOIN agentassessments ON jobhistory.id = agentassessments.jobhistoryid " +
				" WHERE (participant.studyid="+this.getId()+") AND ((agentassessments.assessorusername)='OccIDEAS') AND (jobhistory.jobhistorystatusid="+JobHistoryStatus.NOTTOBEINTERVIEWEDNOJSM+");";					
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
		this.closeConnection();
		return retValue;
	}
	public int getJobHistoryCountUnexposedJob() throws Exception {
		int retValue = 0;
		ResultSet rs = null;		
		String strSQL = "SELECT Count(jobhistory.id) AS CountOfid " +
				" FROM jobhistory INNER JOIN participant ON jobhistory.participantid = participant.id " +
				" WHERE (participant.studyid="+this.getId()+") AND (jobhistory.jobhistorystatusid="+JobHistoryStatus.UNEXPOSEDJOB+");";					
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
		this.closeConnection();
		return retValue;
	}
	public int getJobHistoryCountUnexposedJobAssessed() throws Exception {
		int retValue = 0;
		ResultSet rs = null;		
		String strSQL = "SELECT Count(jobhistory.id) AS CountOfid " +
				" FROM jobhistory INNER JOIN participant ON jobhistory.participantid = participant.id " +
				" INNER JOIN agentassessments ON jobhistory.id = agentassessments.jobhistoryid " +
				" WHERE (participant.studyid="+this.getId()+") AND ((agentassessments.assessorusername)<>'OccIDEAS') AND (jobhistory.jobhistorystatusid="+JobHistoryStatus.UNEXPOSEDJOB+");";					
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
		this.closeConnection();
		return retValue;
	}
	public int getJobHistoryCountUnexposedJobAssessedAuto() throws Exception {
		int retValue = 0;
		ResultSet rs = null;		
		String strSQL = "SELECT Count(jobhistory.id) AS CountOfid " +
				" FROM jobhistory INNER JOIN participant ON jobhistory.participantid = participant.id " +
				" INNER JOIN agentassessments ON jobhistory.id = agentassessments.jobhistoryid " +
				" WHERE (participant.studyid="+this.getId()+") AND ((agentassessments.assessorusername)='OccIDEAS') AND (jobhistory.jobhistorystatusid="+JobHistoryStatus.UNEXPOSEDJOB+");";					
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
		this.closeConnection();
		return retValue;
	}
	public int getJobHistoryCountOtherAssessed() throws Exception {
		int retValue = 0;
		ResultSet rs = null;		
		String strSQL = "SELECT Count(jobhistory.id) AS CountOfid"
			+" FROM agentassessments INNER JOIN (jobhistory INNER JOIN participant ON jobhistory.participantid = participant.id) ON agentassessments.jobhistoryid = jobhistory.id"
			+" WHERE ((jobhistory.jobhistorystatusid) In (1,4,5,6))  AND ((agentassessments.assessorusername)<>'OccIDEAS')" +
					" GROUP BY participant.studyid" +
					" HAVING (((participant.studyid)="+this.getId()+"));";					
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
		this.closeConnection();
		return retValue;
	}
	public String getStudyCalendarSource() throws Exception {
		String retValue = "";
		ResultSet rs = null;		
		String strSQL = "SELECT * FROM calendar, studycalendar WHERE calendar.id = studycalendar.calendarid AND studycalendar.studyid = " + this.getId();					
		rs = this.sqlExecuteSelect(strSQL);
		if (rs != null) {
			if (rs.next()) {
				retValue = rs.getString("source");
			}
			if (rs.getStatement() != null) {
				rs.getStatement().close();
			}
			rs.close();
		}
		this.closeConnection();
		return retValue;
	}
	public int getJobHistoryCountInterviewedAssessedAuto() throws Exception {
		int retValue = 0;
		ResultSet rs = null;		
		String strSQL = "SELECT Count(jobhistory.id) AS CountOfid " +
		" FROM jobhistory INNER JOIN participant ON jobhistory.participantid = participant.id " +
		" INNER JOIN agentassessments ON jobhistory.id = agentassessments.jobhistoryid " +
		" WHERE (participant.studyid="+this.getId()+") AND ((agentassessments.assessorusername)='OccIDEAS') AND ((jobhistory.jobhistorystatusid="+JobHistoryStatus.INTERVIEWED+"));";					
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
		this.closeConnection();
		return retValue;
	}
	public int getJobHistoryCountInterviewedAssessed() throws Exception {
		int retValue = 0;
		ResultSet rs = null;		
		String strSQL = "SELECT Count(jobhistory.id) AS CountOfid " +
		" FROM jobhistory INNER JOIN participant ON jobhistory.participantid = participant.id " +
		" INNER JOIN agentassessments ON jobhistory.id = agentassessments.jobhistoryid " +
		" WHERE (participant.studyid="+this.getId()+") AND ((agentassessments.assessorusername)<>'OccIDEAS') AND ((jobhistory.jobhistorystatusid="+JobHistoryStatus.INTERVIEWED+") );";					
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
		this.closeConnection();
		return retValue;
	}
	public int getJobHistoryCountNotTimeForInterviewedAssessed() throws Exception {
		int retValue = 0;
		ResultSet rs = null;		
		String strSQL = "SELECT Count(jobhistory.id) AS CountOfid " +
		" FROM jobhistory INNER JOIN participant ON jobhistory.participantid = participant.id " +
		" INNER JOIN agentassessments ON jobhistory.id = agentassessments.jobhistoryid " +
		" WHERE (participant.studyid="+this.getId()+") AND ((agentassessments.assessorusername)<>'OccIDEAS') AND ((jobhistory.jobhistorystatusid="+JobHistoryStatus.NOTTOBEINTERVIEWEDTIME+") );";					
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
		this.closeConnection();
		return retValue;
	}

	public void setStudyCalendarSource() throws Exception{
		int firstUnusedCalendar = 0;
		ResultSet rs = null;		
		String strSQL = "SELECT * FROM calendar LEFT OUTER JOIN studycalendar ON calendar.id = studycalendar.calendarid WHERE studycalendar.studyid IS null";					
		rs = this.sqlExecuteSelect(strSQL);

		if (rs.next()) {
			firstUnusedCalendar = rs.getInt("id");
			String insertQuery = "INSERT INTO studycalendar (studyid, calendarid) VALUES(" + this.getId() + ", " + firstUnusedCalendar + ")";	    			      	
			this.sqlExecuteUpdate(insertQuery);
		}else{//if no rows are returned
		//	throw new Exception("There are no more calendars available for use - Please call support");
			//we should just give a warning
		}
		rs.close();
		this.closeConnection();
	}
	public void saveStatus(String id) throws Exception {
        String strSQL = "INSERT INTO studystudystatus (studyid, studystatus) VALUES(" + id + ",3);";
        try {
            this.sqlExecuteInsert(strSQL);
        } catch (SQLException e) {
            throw new Exception(e.getMessage());
        }
    }
	public void updateStudyStatus(String type) throws Exception {
		String sqltype = "<10";
		if (type.equalsIgnoreCase("pt")) {sqltype = ">10";}
		String strSQL = "UPDATE studystudystatus SET studystatus="+this.getStatusId()
			+ " WHERE studyid = "
			+ this.getId() + " AND studystatus " + sqltype;        
		try {
			this.sqlExecuteUpdate(strSQL);
		} catch (SQLException e) {
			throw new Exception(e.getMessage());
		}
	}
	public int getJobHistoryCountInterviewed() throws Exception {
		int retValue = 0;
		ResultSet rs = null;		
		String strSQL = "SELECT Count(jobhistory.id) AS CountOfid " +
		" FROM jobhistory INNER JOIN participant ON jobhistory.participantid = participant.id " +
		" WHERE (participant.studyid="+this.getId()+") AND ((jobhistory.jobhistorystatusid = "+JobHistoryStatus.INTERVIEWED+"));";					
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
		this.closeConnection();
		return retValue;
	}
	public int getJobHistoryCountNoTimeForInterviewed() throws Exception {
		int retValue = 0;
		ResultSet rs = null;		
		String strSQL = "SELECT Count(jobhistory.id) AS CountOfid " +
		" FROM jobhistory INNER JOIN participant ON jobhistory.participantid = participant.id " +
		" WHERE (participant.studyid="+this.getId()+") AND ((jobhistory.jobhistorystatusid = "+JobHistoryStatus.NOTTOBEINTERVIEWEDTIME+"));";					
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
		this.closeConnection();
		return retValue;
	}

	public void setFrozenJSMs(ArrayList<FrozenJobSpecificModule> frozenJSMs) {
		this.frozenJSMs = frozenJSMs;
	}
	public List<Participant> getParticipants() throws Exception{
		return participants;
	}
	
	public List<Participant> getFullParticipants() throws Exception{
		if (fullParticipants == null) {
			this.getPersistantParticipants();
		}
		return fullParticipants;
	}
	
    public void setFullParticipants(List<Participant> fullParticipants) {
		this.fullParticipants = fullParticipants;
	}
	
	public void setParticipants(List<Participant> participants) {
		this.participants = participants;
	}
	public ArrayList<JobHistory> getJobHistoriesWithAssessments() throws Exception {
		ArrayList<JobHistory> jhs = new ArrayList<JobHistory>();
		ResultSet rs = null;		
		String strSQL = "SELECT jobhistory.id, age, priority, yearstarted, durationyears, employer, jobtitle, "
                + " participantid, finaljsmid, ifinaljsmfrozen, weeksperyear, hoursperweek, suburb, state, country, "
                + " jobhistory.description, jobhistory.comments, jobdescription, jobhistorystatusid, agentassessments.agentid, jobhistory.referencenumber," +
				" participant.referencenumber AS participantreferencenumber, agentassessments.exposure, agentassessments.level," +
				" agentassessments.frequencyweeks, agentassessments.frequencyhours," +
				" agentassessments.dontknow, agentassessments.assessorusername," +
				" agentassessments.assessorid, agentassessments.comments,agentassessments.id AS assessmentid" +
				" FROM (jobhistory LEFT JOIN agentassessments ON jobhistory.id = agentassessments.jobhistoryid)" +
				" INNER JOIN participant ON jobhistory.participantid = participant.id" +
				" WHERE (((participant.studyid)="+this.getId()+"))" +
				" ORDER BY jobhistory.id, agentassessments.agentid;";					
		rs = this.sqlExecuteSelect(strSQL);
		if (rs != null) {
			String currentId = "";
			JobHistory jh = null;
			while (rs.next()) {				
				String id = rs.getString("id");
				if(id.equalsIgnoreCase(currentId)){
					Assessment assessment = new Assessment();
					String agentId = rs.getString("assessmentid");
					if(agentId!=null){
						assessment.setId(agentId);
		                assessment.setJobHistoryId(rs.getString("id"));
		                assessment.setAgentId(rs.getString("agentid"));
		                assessment.setExposure(rs.getString("exposure"));
		                assessment.setLevel(rs.getString("Level"));
		                assessment.setFrequencyweeks(rs.getFloat("frequencyweeks"));
		                assessment.setFrequencyhours(rs.getFloat("frequencyhours"));
		                assessment.setDontknow(rs.getString("dontknow"));
						assessment.setAssessorusername(rs.getString("assessorusername"));
						assessment.setAssessorId(rs.getString("assessorid"));
						assessment.setComments(rs.getString("comments"));
					}	                
					jh.getAssessments().add(assessment);
				}else{
					currentId = id;
					jh = new JobHistory();
					jh.setId(id);
					jh.setStatusId(rs.getString("jobhistorystatusid"));
					jh.setParticipantId(rs.getString("participantid"));
					jh.setParticipantReferenceNumber(rs.getString("participantreferencenumber"));
					jh.setReferenceNumber(rs.getString("referencenumber"));
					jh.setFinalJSMId(rs.getString("finaljsmid"));			
					jh.setAge(rs.getInt("age"));
					jh.setPriority(rs.getInt("priority"));
					jh.setYearStarted(rs.getInt("yearstarted"));
					jh.setDurationYears(rs.getFloat("durationyears"));
					jh.setEmployer(rs.getString("employer"));
					jh.setJobTitle(rs.getString("jobtitle"));
	                jh.setParticipantId(rs.getString("participantid"));
	                jh.setWeeksPerYear(rs.getFloat("weeksperyear"));
	                jh.setHoursPerWeek(rs.getFloat("hoursperweek"));
	                jh.setSuburb(rs.getString("suburb"));
	                jh.setState(rs.getString("state"));
	                jh.setCountry(rs.getString("country"));
	                jh.setDescription(rs.getString("description"));
	                jh.setComments(rs.getString("comments"));
	                jh.setJobDescription(rs.getString("jobdescription"));
	                //jh.loadTasks();
	                Assessment assessment = new Assessment();
	                String agentId = rs.getString("assessmentid");
					if(agentId!=null){
						assessment.setId(agentId);
		                assessment.setJobHistoryId(rs.getString("id"));
		                assessment.setAgentId(rs.getString("agentid"));
		                assessment.setExposure(rs.getString("exposure"));
		                assessment.setLevel(rs.getString("Level"));
		                assessment.setFrequencyweeks(rs.getFloat("frequencyweeks"));
		                assessment.setFrequencyhours(rs.getFloat("frequencyhours"));
		                assessment.setDontknow(rs.getString("dontknow"));
						assessment.setAssessorusername(rs.getString("assessorusername"));
						assessment.setAssessorId(rs.getString("assessorid"));
						assessment.setComments(rs.getString("comments"));
					}	                
					jh.getAssessments().add(assessment);
					jhs.add(jh);
				}								
			}
			if (rs.getStatement() != null) {
				rs.getStatement().close();
			}
			rs.close();
		}
		this.closeConnection();
		return jhs;
	}
	public ArrayList<Report> getReportsJobHistories() throws Exception {
		ArrayList<Report> retValue = new ArrayList<Report>();
		ResultSet rs = null;		
		String strSQL = "SELECT id,datecreated FROM reports" +
				" WHERE (studyid="+this.getId()+") AND (reporttype='"+Report.JOBHISTORYREPORT+"')";					
		rs = this.sqlExecuteSelect(strSQL);
		if (rs != null) {
			while (rs.next()) {				
				String id = rs.getString("id");	
				String dateCreated = rs.getString("datecreated");	
				Report report = new Report();
				report.setId(id);
				report.setDateCreated(dateCreated);
				retValue.add(report);
			}
			if (rs.getStatement() != null) {
				rs.getStatement().close();
			}
			rs.close();
		}
		this.closeConnection();
		return retValue;
	}
	public ArrayList<Report> getReportsInterviews(FrozenJobSpecificModule fjsm) throws Exception {
		ArrayList<Report> retValue = new ArrayList<Report>();
		ResultSet rs = null;		
		String strSQL = "SELECT id,datecreated FROM reports" +
				" WHERE (studyid="+this.getId()+") AND (reporttype='"+Report.INTERVIEWSREPORT+"') AND frozenjsmid="+fjsm.getId();						
		rs = this.sqlExecuteSelect(strSQL);
		if (rs != null) {
			while (rs.next()) {				
				String id = rs.getString("id");	
				String dateCreated = rs.getString("datecreated");	
				Report report = new Report();
				report.setId(id);
				report.setDateCreated(dateCreated);
				retValue.add(report);
			}
			if (rs.getStatement() != null) {
				rs.getStatement().close();
			}
			rs.close();
		}
		this.closeConnection();
		return retValue;
	}
	public ArrayList<Report> getReportsAssessments() throws Exception {
		ArrayList<Report> retValue = new ArrayList<Report>();
		ResultSet rs = null;		
		String strSQL = "SELECT id,datecreated FROM reports" +
				" WHERE (studyid="+this.getId()+") AND (reporttype='"+Report.ASSESSMENTSREPORT+"')";						
		rs = this.sqlExecuteSelect(strSQL);
		if (rs != null) {
			while (rs.next()) {				
				String id = rs.getString("id");	
				String dateCreated = rs.getString("datecreated");	
				Report report = new Report();
				report.setId(id);
				report.setDateCreated(dateCreated);
				retValue.add(report);
			}
			if (rs.getStatement() != null) {
				rs.getStatement().close();
			}
			rs.close();
		}
		this.closeConnection();
		return retValue;
	}
	
	private List<Participant> getParticipantsWithFreqFlyerJob() throws Exception{

			 List<Participant> retValue = new ArrayList<Participant>();
			 ResultSet rs = null;
			 try {
				 this.connect();
				 this.getStatement();
				 rs = this.executeQuery("Select p.id,referencenumber,first_name, middle_name, last_name, participantstatusid, lastupdated, studyid, jobhistorycount, nextcontactdatetime, phonenumber from jhxmlcolumn j, participantnamesview p where p.referencenumber = j.reference_number and name = 'FFlyers_1' and value = 1 order by reference_number");
		            if (rs != null) {
		                while (rs.next()) {
		                    Participant p = new Participant();
		                    p.setParticipantId(rs.getLong("id"));
		                    p.setReferenceNumber(rs.getString("referencenumber"));
		                    p.setFirstName(rs.getString("first_name"));
		                    p.setMiddleName(rs.getString("middle_name"));
		                    p.setLastName(rs.getString("last_name"));
		                    p.setStatusId(rs.getString("participantstatusid"));
		                    p.setStudyId(rs.getString("studyid"));
		                    p.setLastUpdated(rs.getString("lastupdated"));
		                    p.setJobHistoriesCount(rs.getInt("jobhistorycount"));
		                    p.setNextContactDateTime(rs.getString("nextcontactdatetime"));
		                    p.setOccContactNo(rs.getString("phonenumber"));
		                    retValue.add(p);
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
		        this.participants = retValue;
			 return retValue;
		 
	}
	public String getRemainingAssessments() throws Exception {
		String retValue = "";
		ResultSet rs = null;		
		String strSQL = "SELECT DISTINCT participant.referencenumber FROM jobhistory, participant " +
				"WHERE ((jobhistory.jobhistorystatusid="+JobHistoryStatus.INTERVIEWED+") OR (jobhistory.jobhistorystatusid="+JobHistoryStatus.NOTTOBEINTERVIEWEDTIME+"))" +
				" AND jobhistory.participantid = participant.id" +
				" AND (participant.studyid="+this.getId()+");";					
		rs = this.sqlExecuteSelect(strSQL);
		ArrayList<String> referenceNumbersReady = new ArrayList<String>();
		if (rs != null) {
			while (rs.next()) {
				String referenceNr = rs.getString("referencenumber");
				referenceNumbersReady.add(referenceNr);
			}
			if (rs.getStatement() != null) {
				rs.getStatement().close();
			}
			rs.close();
		}
		rs.close();		
		strSQL = "SELECT DISTINCT participant.referencenumber " +
				" FROM participant, jobhistory, agentassessments " +
				" WHERE participant.id = jobhistory.participantid " +
				" AND jobhistory.id = agentassessments.jobhistoryid " +
				" AND participant.studyid = "+this.getId()+";";					
		rs = this.sqlExecuteSelect(strSQL);
		ArrayList<String> referenceNumbersDone = new ArrayList<String>();
		if (rs != null) {
			while (rs.next()) {
				String referenceNr = rs.getString("referencenumber");
				referenceNumbersDone.add(referenceNr);
			}
			if (rs.getStatement() != null) {
				rs.getStatement().close();
			}
			rs.close();
		}
		this.closeConnection();
		
		for(String refnr: referenceNumbersReady){
			if(referenceNumbersDone.contains(refnr)){
				continue;
			}else{
				retValue += refnr+",";
			}
		}
		return retValue;
	}
	public void setParentStudyId(String parentStudyId) {
		this.parentStudyId = parentStudyId;
	}
	public String getParentStudyId() throws Exception {
		ResultSet rs = null;
		String strSQL = "SELECT parentstudyid FROM study WHERE id = "+this.getId()+";";					
		rs = this.sqlExecuteSelect(strSQL);
		if (rs.next()) {
			parentStudyId = rs.getString("parentstudyid");			
		}
		if (rs.getStatement() != null) {
			rs.getStatement().close();
		}
		rs.close();		
		this.closeConnection();
		return parentStudyId;
	}
	public void deleteAndClean() throws Exception {
		String strSQL = "";
		try {
			for(Participant p: this.filterParticipants("None")){
				for(JobHistory jh:p.getJobHistories()){
					for(Interview interview:jh.getInterviews()){
						strSQL = "DELETE FROM jsminterview WHERE id = " + interview.getId();
						this.sqlExecuteUpdate(strSQL);
					}
					jh.delete();
				}
				p.delete();
			}
			for (FrozenJobSpecificModule fjms : this.getJsmsFrozen()) {
				fjms.delete();
			}
			strSQL = "DELETE FROM frozenjsm WHERE studyid = " + this.getId();
			this.sqlExecuteUpdate(strSQL);
			strSQL = "DELETE FROM study WHERE id = " + this.getId();
			this.sqlExecuteUpdate(strSQL);
		} catch (SQLException e) {
			throw new Exception(e.getMessage());
		}
	}
}
