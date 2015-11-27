package com.researchit.reports;

import java.sql.Date;

public class ParticipantDonationsXMLExport {
	private String participantNumber = "";
	private Date invitedOn;
	private Date respondedOn;
	private int daysBetween;
	private String donation = "";
	private String errors = "";


	public String getErrors() {
		if (errors == null){errors = "";}
		return errors;
	}

	public void setErrors(String errors) {
		this.errors = errors;
	}

	public int getDaysBetween() {
		return daysBetween;
	}

	public void setDaysBetween(int daysBetween) {
		this.daysBetween = daysBetween;
	}

	public String getDonation() {
		return donation;
	}

	public void setDonation(String donation) {
		this.donation = donation;
	}

	public Date getInvitedOn() {
		return invitedOn;
	}

	public void setInvitedOn(Date invitedOn) {
		this.invitedOn = invitedOn;
	}

	public String getParticipantNumber() {
		return participantNumber;
	}

	public void setParticipantNumber(String participantNumber) {
		this.participantNumber = participantNumber;
	}

	public Date getRespondedOn() {
		return respondedOn;
	}

	public void setRespondedOn(Date respondedOn) {
		this.respondedOn = respondedOn;
	}

	public ParticipantDonationsXMLExport(){

	}


}
