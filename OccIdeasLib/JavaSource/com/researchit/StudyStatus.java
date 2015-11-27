/**
 * Version:
 *     $Id: StudyStatus.java,v 1.7 2008/10/30 10:31:47 ray.welburn Exp $
 *
 * Revisions:
 *     $Log: StudyStatus.java,v $
 *     Revision 1.7  2008/10/30 10:31:47  ray.welburn
 *     Change to allow multiple study statuses
 *
 *     Revision 1.6  2008/09/03 04:55:37  ray.welburn
 *     Add PT statuses
 *
 *     Revision 1.5  2008/08/25 01:37:20  ray.welburn
 *     Updates to use single dbobject and participant status table
 *
 *     Revision 1.4  2008/05/26 08:22:06  troy.sadkowsky
 *     Removed old code
 *
 *     Revision 1.3  2007/05/22 11:18:58  Troy.Sadkowsky
 *     study options
 *
 *     Revision 1.2  2006/08/24 10:40:41  admin
 *     status updates
 *
 *     Revision 1.1  2006/06/29 05:49:00  administrator
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

public class StudyStatus extends DBBaseObject {

    public static final String INITIALPHASE = "3";
    public static final String INPROGRESS = "1";
    public static final String COMPLETE = "2";
    public static final String PTSTATUS1 = "11";
    public static final String PTSTATUS2 = "12";
    
    public StudyStatus() {
		super();
	}
	public StudyStatus(String id) throws Exception {
		super();
		this.setId(id);
		this.getPersistantObject();
	}
	protected void getPersistantObject() throws Exception {
		String query = "SELECT id, name, description FROM studystatus WHERE id ="
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
	public List<StudyStatus> getStudyStatuses(String type) throws Exception {
		List<StudyStatus> statuses = new ArrayList<StudyStatus>();
		String strSQL = "";
		String sqltype = "<10";
		if (type.equalsIgnoreCase("pt")){sqltype = ">10";}
		ResultSet rs = null;
		try {
			strSQL = "SELECT id,name,description FROM studystatus where id " + sqltype;
			rs = this.sqlExecuteSelect(strSQL);
			if (rs != null) {
				while (rs.next()) {
					StudyStatus status = new StudyStatus();
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
