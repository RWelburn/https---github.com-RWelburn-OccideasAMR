/**
 * Version:
 *     $Id: ParticipantProgress.java,v 1.6 2009/05/30 06:02:51 ray.welburn Exp $
 *
 * Revisions:
 *     $Log: ParticipantProgress.java,v $
 *     Revision 1.6  2009/05/30 06:02:51  ray.welburn
 *     updates to progress statuses
 *
 *     Revision 1.5  2009/05/22 03:01:17  ray.welburn
 *     New categories added to report and some bug fixes
 *
 *     Revision 1.4  2009/05/05 05:31:19  ray.welburn
 *     revised progress screens
 *
 *     Revision 1.3  2009/04/23 09:24:34  troy.sadkowsky
 *     participant contact updates
 *
 *     Revision 1.2  2009/04/20 10:25:26  ray.welburn
 *     New paes for progress updates
 *
 *     Revision 1.1  2009/03/11 08:18:21  ray.welburn
 *     Participant progress status
 *
 *     Revision 1.15  2008/12/22 05:30:46  troy.sadkowsky
 *     fix summary counts
 *
 *     Revision 1.14  2008/09/20 08:59:29  troy.sadkowsky
 *     new assessment updates
 *
 *     Revision 1.13  2008/08/25 01:37:24  ray.welburn
 *     Updates to use single dbobject and participant status table
 *
 *     Revision 1.12  2008/05/26 08:22:05  troy.sadkowsky
 *     Removed old code
 *
 *     Revision 1.11  2008/04/15 22:58:00  troy.sadkowsky
 *     melb updates
 *
 *     Revision 1.10  2008/02/08 07:36:46  troy.sadkowsky
 *     build v1.71 updates
 *
 *     Revision 1.9  2007/11/24 03:58:52  troy.sadkowsky
 *     filter by participant status
 *
 *     Revision 1.8  2007/09/22 03:20:40  troy.sadkowsky
 *     participant and job history statuses
 *
 *     Revision 1.7  2006/12/12 13:43:27  admin
 *     build v1.13
 *
 *     Revision 1.6  2006/10/31 21:09:25  admin
 *     build v1.08
 *
 *     Revision 1.5  2006/08/27 10:48:30  admin
 *     update status of assessments
 *
 *     Revision 1.4  2006/06/29 05:49:00  administrator
 *     updates for rework
 *
 *     Revision 1.3  2006/06/28 08:30:31  administrator
 *     updates for rework
 *
 *     Revision 1.2  2006/06/14 06:59:08  administrator
 *     updates for rework
 *
 *     Revision 1.1  2006/06/13 23:28:52  administrator
 *     restructure progress
 *
 *     
 */
package com.researchit;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.researchit.common.DBBaseObject;

public class ParticipantProgress extends DBBaseObject {
	
	private String type;


	public enum ParticipantContactProgress {
		NEEDINVITE("1"), 
		SENTINVITE("2"), 
		NEEDINVITEREMINDERCALL("3"),
		GIVENINVITEREMINDERCALL("4"),
		NEEDINVITEREMINDERCARD("5"),
		SENTINVITEREMINDERCARD("6"),
		POSSIBLENONRESPONSETOINVITE("7"),
		NONRESPONSETOINVITE("8"),
		RESPONDEDINVITE("9"),
		RESPONDEDDNA("10"),
		NEEDDNAKIT("11"),
		SENTDNAKIT("12"),
		NEEDDNAREMINDERCALL("13"),
		GIVENDNAREMINDERCALL("14"),
		NEEDDNAREMINDERCARD("15"),
		SENTDNAREMINDERCARD("16"),
		DNAKITRETURNED("17"),
		POSSIBLENONRESPONSETODNA("18"),
		NONRESPONSETODNA("19"),
		NONRESPONSETORPQ("20"),
		STUDYCOMPLETE("21"),
		NEEDDNAASSIGNMENT("22");
		
		ParticipantContactProgress(String value) { this.value = value; }

	    private final String value;

	    public String value() { return value; }
	}

    public ParticipantProgress() {
		super();
	}
	public ParticipantProgress(String id) throws Exception {
		super();
		this.setId(id);
		this.getPersistantObject();
	}
	protected void getPersistantObject() throws Exception {
		String query = "SELECT id, name, description, type FROM participantprogress id ="
				+ this.getId();
		try {
			ResultSet rs = this.sqlExecuteSelect(query);
			if (rs != null) {
				if (rs.next()) {
					this.setId(rs.getString("id"));
					this.setName(rs.getString("name"));
					this.setDescription(rs.getString("description"));
					this.setType(rs.getString("type"));
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
	}
//	public List<ParticipantProgress> getParticipantInviteProgress() throws Exception {
//		List<ParticipantProgress> statuses = new ArrayList<ParticipantProgress>();
//		for(ParticipantProgress s: this.getParticipantStatuses()){
//			if(s.getId().equalsIgnoreCase(ParticipantProgress.INVITESENT)){
//				statuses.add(s);
//			}else if(s.getId().equalsIgnoreCase(ParticipantProgress.NEEDINVITE)){
//				statuses.add(s);
//			}else if(s.getId().equalsIgnoreCase(ParticipantProgress.NONRESPONDER)){
//				statuses.add(s);
//			}else if(s.getId().equalsIgnoreCase(ParticipantProgress.POSSIBLENONRESPONDER)){
//				statuses.add(s);
//			}
//		}
//		return statuses;
//	}
//	public List<ParticipantProgress> getParticipantStudyPackProgress() throws Exception {
//		List<ParticipantProgress> statuses = new ArrayList<ParticipantProgress>();
//		for(ParticipantProgress s: this.getParticipantStatuses()){
//			if(s.getId().equalsIgnoreCase(ParticipantProgress.STUDYPACK)){
//				statuses.add(s);
//			}
//		}
//		return statuses;
//	}
//	public List<ParticipantProgress> getParticipantResponseProgress() throws Exception {
//		List<ParticipantProgress> statuses = new ArrayList<ParticipantProgress>();
//		for(ParticipantProgress s: this.getParticipantStatuses()){
//			if(s.getId().equalsIgnoreCase(ParticipantProgress.NONRESPONDER)){
//				statuses.add(s);
//			}else if(s.getId().equalsIgnoreCase(ParticipantProgress.POSSIBLENONRESPONDER)){
//				statuses.add(s);
//			}
//		}
//		return statuses;
//	}
	public List<ParticipantProgress> getParticipantStatuses() throws Exception {
		List<ParticipantProgress> statuses = new ArrayList<ParticipantProgress>();
		String strSQL = "";
		ResultSet rs = null;
		try {
			strSQL = "SELECT id,name,description, type FROM participantprogress ORDER BY id ";
			rs = this.sqlExecuteSelect(strSQL);
			if (rs != null) {
				while (rs.next()) {
					ParticipantProgress status = new ParticipantProgress();
					status.setId(rs.getString("id"));
					status.setName(rs.getString("name"));
					status.setDescription(rs.getString("description"));
					status.setType(rs.getString("type"));
					statuses.add(status);
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
		return statuses;
	}
	
    public void save() throws Exception {
    }
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
