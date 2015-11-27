package com.researchit.reports;

import com.researchit.common.Address;
import com.researchit.common.Participant;
import com.researchit.common.Study;

public class ParticipantXMLExport {
	private String participantNumber = "";
	private String firstName = "";
	private String secondName = "";
	private String lastName;
	private String phone = "";
	private String address = "";
	private String suburb = "";
	private String postcode = "";
	private String state = "";
	private String email = "";
	private String studyId = "";
	private String studyName = "";
	private String participantProgressId = "";
	private String errors = "";
	private String pClass = "";
	//private String cancerRegistryNumber = "";
	private String stage = "";

/*	public String getCancerRegistryNumber() {
		return cancerRegistryNumber;
	}

	public void setCancerRegistryNumber(String cancerRegistryNumber) {
		this.cancerRegistryNumber = cancerRegistryNumber;
	}*/

	public String getErrors() {
		if (errors == null){errors = "";}
		return errors;
	}

	public void setErrors(String errors) {
		this.errors = errors;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getParticipantProgressId() {
		return participantProgressId;
	}

	public void setParticipantProgressId(String participantProgressId) {
		this.participantProgressId = participantProgressId;
	}

	public ParticipantXMLExport(Participant p) throws Exception{
		String preferedContact ="";
		this.setParticipantNumber(p.getParticipantRefnum());
		this.setFirstName(p.getFirstName());
		this.setSecondName(p.getMiddleName());
		this.setLastName(p.getLastName());
		//this.setPhone(p.getOccContactNo());
		this.setStudyId(p.getStudyId());
		this.setStudyName(new Study(p.getStudyId()).getName());
		
		for (Address addr : p.getAddresses()){
			if (addr.getType() != null){
				String contactPref = (addr.getPreferredNumber() != null)?addr.getPreferredNumber():"";
				if (!contactPref.equals("")) {
					if (contactPref.equals("Home")){preferedContact = addr.getHomePhone();}
					if (contactPref.equals("Work")){preferedContact = addr.getWorkPhone();}
					if (contactPref.equals("Mobile")){preferedContact = addr.getMobilePhone();}
					if (contactPref.equals("Email")){preferedContact = addr.getEmail();}
				}else{
 					preferedContact = (addr.getHomePhone() != null)?addr.getHomePhone():"";
				}
				if (addr.getType().equalsIgnoreCase("RES")){//if there is a residential address then set it to that otherwise blank
					this.setPhone(preferedContact);
					this.setAddress((addr.getAddress() != null)?addr.getAddress():"");
					this.setSuburb((addr.getSuburb() != null)?addr.getSuburb():"");
					this.setPostCode((addr.getPostCode() != null)?addr.getPostCode():"");
					this.setState((addr.getState() != null)?addr.getState():"");
					this.setEmail((addr.getEmail() != null)?addr.getEmail():"");
				}
			}
		}
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPostCode() {
		return postcode;
	}

	public void setPostCode(String postcode) {
		this.postcode = postcode;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getSuburb() {
		return suburb;
	}

	public void setSuburb(String suburb) {
		this.suburb = suburb;
	}
	
	public int saveParticipantInformation(int iCount) {
		Participant p = new Participant();
		Address address = new Address();
		
		p.setParticipantRefnum(this.getParticipantNumber());
		p.setStudyId(this.getStudyId());
		
		p.setFirstName(this.getFirstName());
		p.setMiddleName(this.getSecondName());
		p.setLastName(this.getLastName());
		
		//p.setParticipantProgressId(this.getParticipantProgressId());
		//p.setClassId(this.getPClass());
		try {
			if(p.uniqueReferenceNumber()){
				p.save();
				iCount++;
			}else{
				String errors = this.getErrors();
				this.setErrors(errors+"Problem with count:"+iCount+" Ref number:"+p.getReferenceNumber()+" already exists");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			String errors = this.getErrors();
			this.setErrors(errors+"Problem with count:"+iCount+e.getMessage().substring(0, 20));
		}
		
		address.setAddress(this.getAddress());
		address.setSuburb(this.getSuburb());
		address.setPostCode(this.getPostCode());
		address.setState(this.getState());
		address.setHomePhone(this.getPhone());
		address.setEmail(this.getEmail());
		address.setType("RES");
		try {
			p.getAddresses().add(address);
			p.save();
		} catch (Exception e) {
			e.printStackTrace();
			String errors = this.getErrors();
			this.setErrors(errors+"Problem with Address count:"+iCount+e.getMessage().substring(0, 20));
		}
		return iCount;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPClass() {
		return pClass;
	}

	public void setPClass(String class1) {
		pClass = class1;
	}

	public String getStage() {
		return stage;
	}

	public void setStage(String stage) {
		this.stage = stage;
	}

	public String getStudyName() {
		return studyName;
	}

	public void setStudyName(String studyName) {
		this.studyName = studyName;
	}
}
