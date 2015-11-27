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

import com.researchit.common.DBBaseObject;

public class ParticipantInfo extends DBBaseObject {
	private Long participantId;
	private String value;
	
	public ParticipantInfo() {
		super();
	}
	
	public ParticipantInfo(String id) throws Exception{
		super();
		this.setId(id);
		this.getPersistentObject();
	}

	public Long getParticipantId() {
		return participantId;
	}
	public void setParticipantId(Long participantId) {
		this.participantId = participantId;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
	public void getPersistentObject() throws Exception {
		String strSQL = "SELECT id,name,value,participant_id FROM participant_info WHERE id = "
				+ this.getId();
		ResultSet rs = null;
		try {
			rs = this.sqlExecuteSelect(strSQL);
			if (rs != null) {
				if (rs.next()) {
					this.setId(rs.getString("id"));
					this.setName(rs.getString("name"));
					this.setValue(rs.getString("value"));
					this.setParticipantId(rs.getLong("participant_id"));
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
	
	public void saveUpdate() throws Exception{
			boolean updating = this.exists();
			String sql;
			this.connect();
			if (updating) {
				sql = "UPDATE participant_info SET name='"+this.escapeSpecialCharacters(this.getName())+"', value='"+this.escapeSpecialCharacters(this.getValue())+"', participant_id="+this.getParticipantId()
						+ " WHERE id="+this.getId();
				this.sqlExecuteUpdate(sql);
			} else {
				sql = "INSERT INTO participant_info (name, value, participant_id) "
						+ "VALUES ('"+this.escapeSpecialCharacters(this.getName())+"', '"+this.escapeSpecialCharacters(this.getValue())+"', "+this.getParticipantId()+")";
				this.setId(this.sqlExecuteInsert(sql).toString());
			}
			this.closeConnection();
	}
	
	public boolean exists() throws Exception {
		boolean bRetValue = false;
		if (!(this.getId().equalsIgnoreCase(""))) {
			bRetValue = true;
		} 
		return bRetValue;
	}

}
