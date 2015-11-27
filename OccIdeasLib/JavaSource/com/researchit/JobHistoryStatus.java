/**
 * Version:
 *     $Id: JobHistoryStatus.java,v 1.14 2008/09/11 02:47:21 troy.sadkowsky Exp $
 *
 * Revisions:
 *     $Log: JobHistoryStatus.java,v $
 *     Revision 1.14  2008/09/11 02:47:21  troy.sadkowsky
 *     only show jhs that are ready for assessments
 *
 *     Revision 1.13  2008/08/25 01:37:20  ray.welburn
 *     Updates to use single dbobject and participant status table
 *
 *     Revision 1.12  2008/07/05 03:29:32  troy.sadkowsky
 *     minor update
 *
 *     Revision 1.11  2008/05/26 08:22:04  troy.sadkowsky
 *     Removed old code
 *
 *     Revision 1.10  2008/04/15 22:58:03  troy.sadkowsky
 *     melb updates
 *
 *     Revision 1.9  2007/11/15 04:09:45  troy.sadkowsky
 *     jh statuses
 *
 *     Revision 1.8  2007/11/14 08:12:14  troy.sadkowsky
 *     jh statuses
 *
 *     Revision 1.7  2007/11/14 05:14:15  troy.sadkowsky
 *     jh statuses
 *
 *     Revision 1.6  2007/11/09 05:16:45  troy.sadkowsky
 *     updated jh statuses
 *
 *     Revision 1.5  2007/10/09 07:20:18  troy.sadkowsky
 *     new statuses for job history
 *
 *     Revision 1.4  2006/08/27 10:48:31  admin
 *     update status of assessments
 *
 *     Revision 1.3  2006/07/22 04:56:38  admin
 *     new jobhistory changes
 *
 *     Revision 1.2  2006/06/29 05:49:00  administrator
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

public class JobHistoryStatus extends DBBaseObject {

	public static final String TOBEREVIEWED = "1";
	public static final String TOBEINTERVIEWED = "2";
	public static final String NOTTOBEINTERVIEWEDTIME = "3";
	public static final String NOTTOBEINTERVIEWEDSCOPE = "4";
	public static final String NOTTOBEINTERVIEWEDNOJSM = "5";
	public static final String UNEXPOSEDJOB = "6";
	public static final String INTERVIEWED = "7";

	public JobHistoryStatus() {
		super();
	}
	public JobHistoryStatus(String id) throws Exception {
		super();
		this.setId(id);
		this.getPersistantObject();
	}
	protected void getPersistantObject() throws Exception {
		String query = "SELECT id, name, description FROM jobhistorystatus WHERE id ="
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
	public List<JobHistoryStatus> getAssessmentJobHistoryStatuses() throws Exception {
		return this.getJobHistoryStatuses("WHERE id IN (3,4,5,6,7)");
	}
	public List<JobHistoryStatus> getJobHistoryStatuses() throws Exception {
		return this.getJobHistoryStatuses("");
	}
	public List<JobHistoryStatus> getJobHistoryStatuses(String filter) throws Exception {
		List<JobHistoryStatus> statuses = new ArrayList<JobHistoryStatus>();
		String strSQL = "";
		ResultSet rs = null;
		try {
			strSQL = "SELECT id,name,description FROM jobhistorystatus "+filter;
			rs = this.sqlExecuteSelect(strSQL);
			if (rs != null) {
				while (rs.next()) {
					JobHistoryStatus status = new JobHistoryStatus();
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
	
	public String getName() {
        String retValue = "";
        if (this.getId() != null) {
            if (this.getId().equalsIgnoreCase(JobHistoryStatus.TOBEREVIEWED)) {
                retValue = "To Be Reviewed";
            } else if (this.getId().equalsIgnoreCase(JobHistoryStatus.TOBEINTERVIEWED)) {
                retValue = "Need JSM";
            } else if (this.getId().equalsIgnoreCase(JobHistoryStatus.NOTTOBEINTERVIEWEDTIME)) {
                retValue = "No Time For This JSM";
            } else if (this.getId().equalsIgnoreCase(JobHistoryStatus.NOTTOBEINTERVIEWEDSCOPE)) {
                retValue = "Job Is Not In Scope";
            } else if (this.getId().equalsIgnoreCase(JobHistoryStatus.NOTTOBEINTERVIEWEDNOJSM)) {
                retValue = "No Appropriate JSM";
            } else if (this.getId().equalsIgnoreCase(JobHistoryStatus.UNEXPOSEDJOB)) {
                retValue = "Unexposed Job";
            } else if (this.getId().equalsIgnoreCase(JobHistoryStatus.INTERVIEWED)) {
                retValue = "JSM Complete";
            } else {
                retValue = this.getId();
            }
        } else {
            retValue = "no ID";
        }
        return retValue;
    }
	
    public void save() throws Exception {
    }
}
