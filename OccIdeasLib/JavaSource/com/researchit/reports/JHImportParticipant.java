package com.researchit.reports;

import java.util.ArrayList;

import com.researchit.JobHistory;
import com.researchit.common.Participant;


public class JHImportParticipant {
	private String participantNumber = "";
	private String studyId = "";
	private ArrayList<JHImport> jobHistory = new ArrayList<JHImport>();
	private String errors = "";

	public String getErrors() {
		if (errors == null){errors = "";}
		return errors;
	}

	public void setErrors(String errors) {
		this.errors = errors;
	}

	public void save()throws Exception{
		//Takes the participant information from the object created from the 
		//imported xml file and saves it as a new participant/Control
		Participant p = new Participant(this.getParticipantNumber());
		if(!(p.getId().equalsIgnoreCase(""))){
			for (JHImport jhImport : this.getJobHistory()) {
				JobHistory jh = new JobHistory();
				jh.setJobDescription(jhImport.getJobTitle());
				jh.setParticipantId(p.getParticipantId().toString());
				jh.update();				
			}
		}else{
			String errors = this.getErrors();
			errors += "\nProblem with " + this.getParticipantNumber();
			this.setErrors(errors);
		}		
	}
		

	public ArrayList<JHImport> getJobHistory() {
		return jobHistory;
	}

	public void setJobHistory(ArrayList<JHImport> jobHistory) {
		this.jobHistory = jobHistory;
	}

	public String getParticipantNumber() {
		return participantNumber;
	}

	public void setParticipantNumber(String participantNumber) {
		this.participantNumber = participantNumber;
	}

	public String getStudyId() {
		return studyId;
	}

	public void setStudyId(String studyId) {
		this.studyId = studyId;
	}
}
