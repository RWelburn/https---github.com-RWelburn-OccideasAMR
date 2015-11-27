package com.researchit.reports;

import java.sql.ResultSet;
import java.util.ArrayList;

import com.researchit.common.DBBaseObject;

public class ParticipantDonationsReport{
	private ArrayList<ParticipantDonationsXMLExport> participants = new ArrayList<ParticipantDonationsXMLExport>();
	private String invitedOnFrom;
	private String invitedOnTo;
	
	public String getInvitedOnFrom() {
		return invitedOnFrom;
	}

	public void setInvitedOnFrom(String invitedOnFrom) {
		this.invitedOnFrom = invitedOnFrom;
	}

	public String getInvitedOnTo() {
		return invitedOnTo;
	}

	public void setInvitedOnTo(String invitedOnTo) {
		this.invitedOnTo = invitedOnTo;
	}

	public ArrayList<ParticipantDonationsXMLExport> getParticipants() {
		return participants;
	}

	public void setParticipants(ArrayList<ParticipantDonationsXMLExport> participants) {
		this.participants = participants;
	}
	
	@SuppressWarnings("unused")
	public void loadDonationInformation(){
		participants = new ArrayList<ParticipantDonationsXMLExport>();
		ResultSet rs = null;
		DBBaseObject db = new DBBaseObject();
		 try {
			 db.connect();
			 db.getStatement();
			 rs = db.executeQuery("SELECT id, referencenumber, invited_on, responded_on, DATEDIFF(responded_on,invited_on) AS days_between FROM participant WHERE studyid = 10 AND (class_id=3) AND responded_on IS NOT NULL AND invited_on BETWEEN '" + this.getInvitedOnFrom() + "' AND '" + this.getInvitedOnTo() + "' AND participantparticipantstatusid = 11");
	            if (rs != null) {
	                while (rs.next()) {
	                	ParticipantDonationsXMLExport exp = new ParticipantDonationsXMLExport();
	                	exp.setParticipantNumber(rs.getString("referencenumber"));
	                    exp.setInvitedOn(rs.getDate("invited_on"));
	                    exp.setRespondedOn(rs.getDate("responded_on"));
	                    exp.setDaysBetween(rs.getInt("days_between"));
	                    exp.setDonation((exp.getDaysBetween() < 31)?"yes":"no");
	                    participants.add(exp);
	                }
	                if (rs.getStatement() != null) {
	                    rs.getStatement().close();
	                }
	                rs.close();
	            }
	        } catch (Exception e) {
	            //System.err.println(e.getMessage());
	        } finally {
	            db.closeConnection();
	        }
	}
}
