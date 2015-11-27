/**
 * Version:
 *     $Id: ParticipantStatus.java,v 1.15 2008/12/22 05:30:46 troy.sadkowsky Exp $
 *
 * Revisions:
 *     $Log: ParticipantStatus.java,v $
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

public class ParticipantStatus extends DBBaseObject {

	public static final String TOBEUPDATED = "7";
	public static final String TOBEREVIEWED = "1";
    public static final String READYFORINTERVIEW = "2";
    public static final String INTERVIEWINCOMPLETE = "3";
    public static final String READYFORASSESSMENT = "4";
    public static final String ASSESSMENTINCOMPLETE = "5";
    public static final String ASSESSMENTCOMPLETE = "6";	
	public static final String NONE = "None";
	public static final String NOFURTHERCONTACT = "8";
	//private static final String NOJSMREQUIRED = "8";

    public ParticipantStatus() {
		super();
	}
	public ParticipantStatus(String id) throws Exception {
		super();
		this.setId(id);
		this.getPersistantObject();
	}
	protected void getPersistantObject() throws Exception {
		String query = "SELECT id, name, description FROM participantstatus WHERE module = 'O' and id ="
				+ this.getId();
		try {
			ResultSet rs = this.sqlExecuteSelect(query);
			if (rs != null) {
				if (rs.next()) {
					this.setId(rs.getString("id"));
					this.setName(rs.getString("name"));
					this.setDescription(rs.getString("description"));
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
	public List<ParticipantStatus> getParticipantAssessmentStatuses() throws Exception {
		List<ParticipantStatus> statuses = new ArrayList<ParticipantStatus>();
		for(ParticipantStatus s: this.getParticipantStatuses()){
			if(s.getId().equalsIgnoreCase(ParticipantStatus.READYFORASSESSMENT)){
				statuses.add(s);
			}else if(s.getId().equalsIgnoreCase(ParticipantStatus.ASSESSMENTINCOMPLETE)){
				statuses.add(s);
			}else if(s.getId().equalsIgnoreCase(ParticipantStatus.ASSESSMENTCOMPLETE)){
				statuses.add(s);
			}
		}
		return statuses;
	}
	public List<ParticipantStatus> getParticipantInterviewStatuses() throws Exception {
		List<ParticipantStatus> statuses = new ArrayList<ParticipantStatus>();
		for(ParticipantStatus s: this.getParticipantStatuses()){
			if(s.getId().equalsIgnoreCase(ParticipantStatus.READYFORASSESSMENT)){
				statuses.add(s);
			}else if(s.getId().equalsIgnoreCase(ParticipantStatus.INTERVIEWINCOMPLETE)){
				statuses.add(s);
			}else if(s.getId().equalsIgnoreCase(ParticipantStatus.READYFORINTERVIEW)){
				statuses.add(s);
			}else if(s.getId().equalsIgnoreCase(ParticipantStatus.NOFURTHERCONTACT)){
				statuses.add(s);
			}
		}
		return statuses;
	}
	public List<ParticipantStatus> getParticipantJobHistoryStatuses() throws Exception {
		List<ParticipantStatus> statuses = new ArrayList<ParticipantStatus>();
		for(ParticipantStatus s: this.getParticipantStatuses()){
			if(s.getId().equalsIgnoreCase(ParticipantStatus.TOBEREVIEWED)){
				statuses.add(s);
			}else if(s.getId().equalsIgnoreCase(ParticipantStatus.READYFORINTERVIEW)){
				statuses.add(s);
			}else if(s.getId().equalsIgnoreCase(ParticipantStatus.TOBEUPDATED)){
				statuses.add(s);
			}else if(s.getId().equalsIgnoreCase(ParticipantStatus.READYFORASSESSMENT)){
				statuses.add(s);
			}else if(s.getId().equalsIgnoreCase(ParticipantStatus.NOFURTHERCONTACT)){
				statuses.add(s);
			}
		}
		return statuses;
	}
	public List<ParticipantStatus> getParticipantStatuses() throws Exception {
		List<ParticipantStatus> statuses = new ArrayList<ParticipantStatus>();
		String strSQL = "";
		ResultSet rs = null;
		try {
			strSQL = "SELECT id,name,description FROM participantstatus WHERE module = 'O' ORDER BY sequence";
			rs = this.sqlExecuteSelect(strSQL);
			if (rs != null) {
				while (rs.next()) {
					ParticipantStatus status = new ParticipantStatus();
					status.setId(rs.getString("id"));
					status.setName(rs.getString("name"));
					status.setDescription(rs.getString("description"));
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
}
