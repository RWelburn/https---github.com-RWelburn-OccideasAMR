package com.researchit.reports;

import java.util.ArrayList;

public class ParticipantContactReport {
	private ArrayList<ParticipantXMLExport> participants = new ArrayList<ParticipantXMLExport>();

	public ArrayList<ParticipantXMLExport> getParticipants() {
		return participants;
	}

	public void setParticipants(ArrayList<ParticipantXMLExport> participants) {
		this.participants = participants;
	}
}
