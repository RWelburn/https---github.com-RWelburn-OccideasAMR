package com.researchit.common;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


import com.researchit.FrozenJobSpecificModule;
import com.researchit.Interview;
//import com.researchit.InterviewAnswer;
import com.researchit.JobHistory;
import com.researchit.JobHistoryStatus;
//import com.researchit.JobHistoryTask;
import com.researchit.JobSpecificModule;
//import com.researchit.ParticipantInfo;
//import com.researchit.ParticipantProgress;
import com.researchit.ParticipantStatus;
//import com.researchit.PossibleAnswer;
//import com.researchit.Question;

import com.researchit.util.Utility;

public class Participant extends Person {
	public final static String VERSION = "$Id: Participant.java,v 1.31 2009/05/30 06:02:49 ray.welburn Exp $";

	private Long participantId;
	private String personId;
	@SuppressWarnings("unused")
	private String initials;
	private String referenceNumber;
	private Date dateOfBirth;
	private String studyId;
//	private Date ctcSought;
//	private Date ctcGiven;
//	private Date respondedOn;
//	private Date invitedOn;
//	private Date identifiedOn;
//	private String consented; 
//	private boolean eligible;
	private String gender;
	private String alias;
	private String maidenName;
	private String classId = "1";
//	private String sourceId = "1";
	//private Source source;
//	private String sourceOther;
	//private String stageId;
	//private Stage stage;
	private String statusId;
	//private String participantStatusId;
	//private Status status;
	//private Status participantStatus;
	private String nextContactDateTime;   
	//private String contactId;
	//private Contact contact;
	//private String doctorId;
	//private Doctor doctor;
	//private List<StatusChange> statusChanges;
	//private List<Document> documents;
	//private List<Treatment> treatments;
	//private List<Collection> collections;
	//private List<Biospecimen> biospecimens;
//	private String ctcOutcome;
//	private String invitedType;
//	private String consentBlood;
//	private String consentTissue;
//	private String consentMedical;
//	private String consentGenetic;
//	private String contactImplications;
//	private String consentFamily;
	private String comments;
//	private Class clss;
	@SuppressWarnings("unused")
	private String dobDay;
	@SuppressWarnings("unused")
	private String dobMonth;
	@SuppressWarnings("unused")
	private String dobYear;
	private String lastUpdated;
	private String occContactNo;
	protected String emailAddress; 
	private Integer jobHistoriesCount;
	private String errorMessage = "";
	private String amrRefId = "";
	private boolean transcriptSent = false;
//	private String participantProgressId = "";
//	private boolean newsletter;
//	private boolean dnaResults;
//	private String rec_type = "";
//	private String root = "";
//	private String lpnot = "";
//	private String cecupn = "";
//	private List<ParticipantInfo> participantInfo;
	//boolean hasFfJobHistory;
	

	public String getAmrRefId() {		
		return amrRefId;
	}

	public void setAmrRefId(String amrRefId) {
		this.amrRefId = amrRefId;
	}

	final static String REASONOTHER = "11";
//	//ANECS Attribute
//	private int aCDBloodTubeCount;
//	private int plainBloodTubeCount;
//	private int rNALaterTubeCount;
//	private int freshFrozenTubeCount;
//	private int blockTissueCount;
//	private int slideTissueCount;
//
//	private CollectionBlood collectionBlood;
//	private CollectionRNALater collectionRnaLater;
//	private CollectionFreshTissue collectionFreshTissue;
//	private CollectionSlide collectionSlide;
//	private CollectionBlockTissue collectionBlockTissue;
//	
//	private Histology histology;
//	
//	public Histology getHistology() throws Exception{
//		histology = this.getPersistentHistology();
//		return histology;
//	}
//	
//	private Histology getPersistentHistology() throws Exception{
//		return new Histology(this.getParticipantId());
//	}
//
//	public void setHistology(Histology histology) {
//		this.histology = histology;
//	}

	public Participant() {
		super();
		//status = new Status();
		//status.setName("Waiting for Eligibility");
		//doctor = new Doctor();
		//contact = new Contact();
	}

	public String getId(){
		return super.getId();
	}
	public Participant(String refnum) throws Exception {
		super();
		this.setParticipantRefnum(refnum);
		loadIdFromRefnum();
		this.getPersistantObject();
	}

	public Participant(Long id) throws Exception {
		super();
		this.setParticipantId(id);
		this.getPersistantObject();
	}

	public void getPersistantObject() throws Exception {
		String query = "SELECT * FROM participant WHERE id ="
			+ this.getParticipantId();
		try {
			this.connect();
			this.getStatement();
			resultSet = this.executeQuery(query);
			if (resultSet != null && resultSet.next()) {
				this.setId(resultSet.getString("person_id"));
				this.setParticipantId(resultSet.getLong("id"));
				this.setPersonId(resultSet.getString("person_id"));
				this.setParticipantRefnum(resultSet.getString("referencenumber"));
				this.setDateOfBirth(resultSet.getDate("dob"));
				this.setGender(resultSet.getString("gender"));
				this.setAlias(resultSet.getString("alias"));
				this.setClassId(resultSet.getString("class_id"));
				//this.setSourceId(resultSet.getString("source_id"));
				//this.setSourceOther(resultSet.getString("source_other"));
				//this.setStageId(resultSet.getString("stage_id"));
				this.setStatusId(resultSet.getString("participantstatusid"));
				//this.setParticipantStatusId(resultSet.getString("participantparticipantstatusid"));
				//this.setParticipantProgressId(resultSet.getString("participantprogressid"));
//				this.setContactId(resultSet.getString("contact_id"));
//				this.setDoctorId(resultSet.getString("doctor_id"));
//				this.setCtcSought(resultSet.getDate("ctc_sought"));
//				this.setCtcGiven(resultSet.getDate("ctc_given"));
				//this.setCtcOutcome(resultSet.getString("ctc_outcome"));
//				this.setConsented(resultSet.getString("consented"));
//				this.setRespondedOn(resultSet.getDate("responded_on"));
//				this.setInvitedOn(resultSet.getDate("invited_on"));
//				this.setIdentifiedOn(resultSet.getDate("identified_on"));
				this.setMaidenName(resultSet.getString("maiden_name"));
//				this.setInvitedType(resultSet.getString("invited_type"));
//				this.setConsentBlood(resultSet.getString("consent_blood"));
//				this.setConsentTissue(resultSet.getString("consent_tissue"));
//				this.setConsentMedical(resultSet.getString("consent_medical"));
//				this.setConsentGenetic(resultSet.getString("consent_genetic"));
//				this.setContactImplications(resultSet.getString("contact_implications"));
//				this.setConsentFamily(resultSet.getString("consent_family"));
				this.setComments(resultSet.getString("comments"));
//				this.setNurse(resultSet.getString("nurse"));
//				this.setNoTissueReason(resultSet.getString("notissue_reason"));
				this.setOccContactNo(resultSet.getString("phonenumber"));
				this.setStudyId(resultSet.getString("studyid"));
				this.setLastUpdated(resultSet.getString("lastupdated"));
				this.setNextContactDateTime(resultSet.getString("nextcontactdatetime"));
				this.setAmrRefId(resultSet.getString("amr_ref_id"));
				this.setTranscriptSent(resultSet.getString("transcript_sent").equalsIgnoreCase("Yes")?true:false);
				//this.setNewsletter(resultSet.getBoolean("newsletter"));
				//this.setDnaResults(resultSet.getBoolean("dnaresults"));
				//this.setRec_type(resultSet.getString("rec_type"));
				//this.setRoot(resultSet.getString("root"));
				//this.setLpnot(resultSet.getString("lpnot"));

//				if(this.getDoctorId()!=null){
//					setDoctor(new Doctor(doctorId));
//				}
//				if(this.getContactId()!=null){
//					setContact(new Contact(contactId));
//				}
				Person person = new Person(this.getPersonId());
				String fn = "";
				String mn = "";
				String ln = "";
				if (!person.getFirstName().equals("")){
					fn = person.getFirstName().substring(0, 1);
				}
				if (!person.getMiddleName().equals("")){
					mn = person.getMiddleName().substring(0, 1);
				}
				if (!person.getLastName().equals("")){
					ln = person.getLastName().substring(0, 1);
				}
				this.initials = (fn + mn + ln).toUpperCase();
			}
			closeStatement();
		} finally {
			closeConnection();
		}
		if (exists()) {
//			loadDocuments();
//			loadTreatments();
//			loadCollections();

			super.getPersistantObject();
		}
	}

	public void delete() throws Exception {
		String sql = "";
		try {
			this.connect(); 
			//sql = "INSERT INTO changelog (changed_on, changed_by, SQLText) VALUES(?,?,?)";
			//PreparedStatement pst = getConnection().prepareStatement(sql);
			//pst.setDate(1, Utility.dateToSQL(new Date()));
			//pst.setString(2, this.getNurse());
			//pst.setString(2, "");
			//pst.setString(3, "Attempt to delete Participant "+this.getParticipantRefnum());
			//pst.execute();
			//pst.close();
//			if(this.getCollections().size()>0){
//				this.getWarnings().put("Delete Participant: "+this.getParticipantRefnum(),"Cannot delete participant without removing collections first");
//			}else{
				try {            	
					this.connection.setAutoCommit(false) ;
					sql = "DELETE FROM addresses WHERE person_id=" + this.getPersonId();
					PreparedStatement pst = getConnection().prepareStatement(sql);
					pst.execute();
//					sql = "DELETE FROM documents WHERE participant_id=" + this.getParticipantId();
//					pst = getConnection().prepareStatement(sql);
//					pst.execute();
//					sql = "DELETE FROM statuschanges WHERE participant_id=" + this.getParticipantId();
//					pst = getConnection().prepareStatement(sql);
//					pst.execute();
//					sql = "DELETE FROM treatments WHERE participant_id=" + this.getParticipantId();
//					pst = getConnection().prepareStatement(sql);
//					pst.execute();
					sql = "DELETE FROM participant WHERE id=" + this.getParticipantId();
					pst = getConnection().prepareStatement(sql);
					pst.execute();
					sql = "DELETE FROM people WHERE id=" + this.getPersonId();
					pst = getConnection().prepareStatement(sql);
					pst.execute();       

					this.connection.commit() ;
					pst.close();

					this.connection.setAutoCommit(true) ;

				}catch(SQLException ex) {            	 
					this.getWarnings().put("Could not delete: ", "Participant "+this.getParticipantRefnum()) ;
					this.getWarnings().put("SQLException: ", ex.getMessage()) ;
					this.connection.rollback();
					this.connection.setAutoCommit(true);
				}
				//remove other contact
				//this.getContact().delete();
				//remove doxtor
				//this.getDoctor().delete();
			//}
			//sql = "INSERT INTO changelog (changed_on, changed_by, SQLText) VALUES(?,?,?)";
			//pst = getConnection().prepareStatement(sql);
			//pst.setDate(1, Utility.dateToSQL(new Date()));
			//pst.setString(2, this.getNurse());
			//pst.setString(3, "Deleted Participant "+this.getParticipantRefnum());
			//pst.execute();
			//pst.close();
		} finally {
			this.closeConnection();
		}
	}

	public boolean exists() throws Exception {
		if (getParticipantId() != null && getParticipantId() != 0) {
			return true;
		} else {
			return false;
		}
	}

	public void save() throws Exception {
		boolean updating = exists();
		super.save();
		personId = super.getId();
		//this.saveContact();
		//this.saveDoctor();
		String sql;
		PreparedStatement pst;
		try {
			connect();
			if (updating) {
				sql = "UPDATE participant SET person_id=?"
						+ ",referencenumber=?" + ",dob=?" + ",gender=?"
						+ ",alias=?" 
						+ ",class_id=?"
						//+ ",source_id=?" + ",source_other=?"
						//+ ",stage_id=?" 
						+ ",participantstatusid=?" 
						//+ ",participantparticipantstatusid=?" 
						//+ ",participantprogressid=?" 
						//+ ",contact_id=?"
						//+ ",doctor_id=?" + ",ctc_sought=?" + ",ctc_given=?"
						//+ ",consented=?" + ",responded_on=?" + ",invited_on=?" + ",identified_on=?"
						+ ",maiden_name=?" 
						//+ ",ctc_outcome=? ,invited_type=?,consent_blood=?"
						//+ ",consent_tissue=?,consent_medical=?,consent_genetic=?"
						//+ ",contact_implications=?,consent_family=?" 
						+ ",comments=?" 
						//+ ",nurse=?,notissue_reason=?" 
						+ ",phonenumber=?,studyid=?,lastupdated=?,nextcontactdatetime=?" 
						+ ",amr_ref_id=?" 
						+ ",transcript_sent=?" 
						//+ ",newsletter=?,dnaresults=?,rec_type=?,root=?,lpnot=?,cecupn=?" 
						+ " WHERE id=?";
				pst = getConnection().prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
				pst.setLong(16, getParticipantId());
			} else {
				sql = "INSERT INTO participant (person_id"
					+ ",referencenumber "
					+ ",dob"
					+ ",gender"
					+ ",alias"
					+ ",class_id"
//					+ ",source_id"
//					+ ",source_other"
//					+ ",stage_id"
					+ ",participantstatusid"
//					+ ",participantparticipantstatusid"
//					+ ",participantprogressid"
//					+ ",contact_id"
//					+ ",doctor_id"
//					+ ",ctc_sought"
//					+ ",ctc_given"
//					+ ",consented"
//					+ ",responded_on"
//					+ ",invited_on"
//					+ ",identified_on"
					+ ",maiden_name"
//					+ ",ctc_outcome"
//					+ ",invited_type"
//					+ ",consent_blood"
//					+ ",consent_tissue"
//					+ ",consent_medical"
//					+ ",consent_genetic"
//					+ ",contact_implications"
//					+ ",consent_family"
					+ ",comments"
//					+ ",nurse"
//					+ ",notissue_reason"
					+ ",phonenumber"
					+ ",studyid"
					+ ",lastupdated"
					+ ",nextcontactdatetime"
					+ ",amr_ref_id"
					+ ",transcript_sent"
//					+ ",newsletter"
//					+ ",dnaresults"
//					+ ",rec_type"
//					+ ",root"
//					+ ",lpnot"
//					+ ",cecupn"
					+ ") VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?)";//, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
				pst = getConnection().prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
			}

			pst.setInt(1, Integer.parseInt(getPersonId()));
			pst.setString(2, getParticipantRefnum());
			pst.setDate(3, Utility.dateToSQL(this.getDateOfBirth()));
			pst.setString(4, this.getGender());
			pst.setString(5, this.getAlias());
			pst.setString(6, this.getClassId());
			//pst.setString(7, this.getSourceId());
			//pst.setString(8, this.getSourceOther());
			//pst.setString(9, this.getStageId());
			pst.setString(7, this.getStatusId());
			//pst.setString(11, this.getParticipantStatusId());
			//pst.setString(12, this.getParticipantProgressId());
			//pst.setString(13, this.getContactId());
			//pst.setString(14, this.getDoctorId());
			//pst.setDate(15, Utility.dateToSQL(this.getCtcSought()));
			//pst.setDate(16, Utility.dateToSQL(this.getCtcGiven()));
			//pst.setString(17, this.getConsented());
			//pst.setDate(18, Utility.dateToSQL(this.getRespondedOn()));
			//pst.setDate(19, Utility.dateToSQL(this.getInvitedOn()));
			//pst.setDate(20, Utility.dateToSQL(this.getIdentifiedOn()));
			pst.setString(8, this.getMaidenName());
//			pst.setString(22, this.getCtcOutcome());
//			pst.setString(23, this.getInvitedType());
//			pst.setString(24, this.getConsentBlood());
//			pst.setString(25, this.getConsentTissue());
//			pst.setString(26, this.getConsentMedical());
//			pst.setString(27, this.getConsentGenetic());
//			pst.setString(28, this.getContactImplications());
//			pst.setString(29, this.getConsentFamily());
			pst.setString(9, this.getComments());
//			pst.setString(31, this.getNurse());
//			pst.setString(32, this.getNoTissueReason());
			pst.setString(10, this.occContactNo);
			pst.setString(11, this.getStudyId());
			pst.setString(12, this.getLastUpdated());
			pst.setString(13, this.getNextContactDateTime());
			pst.setString(14, this.getAmrRefId());
			pst.setString(15, this.isTranscriptSent() == false?"No":"Yes");
			//pst.setBoolean(37, this.getNewsletter());
//			pst.setBoolean(38, this.getDnaResults());
//			pst.setString(39, this.getRec_type());
//			pst.setString(40, this.getRoot());
//			pst.setString(41, this.getLpnot());
//			pst.setString(42, this.getCecupn());
			pst.executeUpdate();
			if (!updating) {
				java.sql.ResultSet rs = pst.getGeneratedKeys();
				if (rs != null && rs.next()) {
					this.setParticipantId(rs.getLong(1));
				} else {
					// TODO deal with error
					throw new Exception("Couldn't get generated ID");
				}
			}
			pst.close();
			//update changelog
			//sql = "INSERT INTO changelog (changed_on, changed_by, SQLText) VALUES(?,?,?)";
			//pst = getConnection().prepareStatement(sql);
//			pst.setDate(1, Utility.dateToSQL(new Date()));
//			pst.setString(2, this.getUsername()); 
//			pst.setString(3,pstString);
//			pst.execute();
//			pst.close();
		} finally {
			closeConnection();
		}
		//this.saveDocuments();
		//this.saveTreatments();

	}

/*	private void saveDocuments() throws Exception {
		for (Document document : this.getDocuments()) {
			document.setParticipantId(this.getParticipantId().toString());
			document.save();
		}
	}

	private void saveTreatments() throws Exception {
		for (Treatment treatment : this.getTreatments()) {
			treatment.setParticipantId(this.getParticipantId().toString());
			treatment.save();
		}
	}

	private void saveContact() throws Exception {
		if (this.contact != null) {
			this.contact.setContactId(this.contactId);
			this.contact.save();
			this.contactId = contact.getContactId();
		}
	}

	private void saveDoctor() throws Exception {
		if (this.doctor != null) {
			this.doctor.setDoctorId(this.getDoctorId());
			this.doctor.save();
			this.doctorId = doctor.getDoctorId();
		}
	}*/

	private void loadIdFromRefnum() {
		try {
			PreparedStatement pst = connect().prepareStatement("SELECT id FROM participant WHERE referencenumber = ?");
			pst.setString(1, getParticipantRefnum());
			resultSet = pst.executeQuery();
			if (resultSet.next()) {
				setParticipantId(resultSet.getLong(1));
			}
		} catch(Exception e) {
			//ToDo deal with db exception
		} finally {
			closeConnection();
		}
	}


/*	private void loadDocuments() throws Exception {
		if (participantId!=null && (participantId != 0)){
			documents = new ArrayList<Document>();
			String query = "SELECT id FROM documents WHERE participant_id=" + participantId;
			try {
				this.connect();
				this.getStatement();
				resultSet = this.executeQuery(query);
				while (resultSet != null && resultSet.next()) {
					documents.add(new Document(resultSet.getString("id")));
				}
			} finally {
				closeConnection();
			}
		}
	}

	private void loadTreatments() throws Exception {
		if (participantId!=null && !(participantId.equals(""))){
			treatments = new ArrayList<Treatment>();
			String query = "SELECT id FROM treatments WHERE participant_id=" + participantId;
			try {
				this.connect();
				this.getStatement();
				resultSet = this.executeQuery(query);
				while (resultSet != null && resultSet.next()) {
					treatments.add(new Treatment(resultSet.getString("id")));
				}
			} finally {
				closeConnection();
			}
		}
	}
	public void loadCollections() throws Exception {
		if (!"".equals(referenceNumber)) {
			collections = new Collection().getCollectionsByParticipant(referenceNumber);
		}
	}
*/
	public String getPersonId() {
		return personId;
	}

	public void setPersonId(String personId) {
		this.personId = personId;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

/*	public String getDateOfBirth() {   	
		try {
			if((this.dobDay!=null)&&(this.dobMonth!=null)&&(this.dobYear!=null)){
				if(!this.dobDay.equalsIgnoreCase("")&&(!this.dobMonth.equalsIgnoreCase(""))&&(!this.dobYear.equalsIgnoreCase(""))){
					//SimpleDateFormat sdf = new SimpleDateFormat("dd:MM:yyyy");
					@SuppressWarnings("unused")
					GregorianCalendar date = new GregorianCalendar(Integer.parseInt(this.dobYear),Integer.parseInt(this.dobMonth) - 1, Integer.parseInt(this.dobDay));
					dateOfBirth = this.dobDay+"/"+this.dobMonth+"/"+this.dobYear;
				}
			}else{
				dateOfBirth = "";
			}
		} catch (Exception e) {
			this.getWarnings().put("participant.dob","Could not validate date");
		}
		return dateOfBirth;
	}

	public void setDateOfBirth(String dob) throws Exception{
		String[] date = {"","",""};
		if ((dob!=null)&&(!dob.equals(""))){
			if (dob.contains("/") &&  dob.substring(dob.indexOf("/") + 1).contains("/") && dob.substring(dob.indexOf("/") + 1).contains("/") && dob.substring(dob.indexOf("/") + 1).indexOf("/") == dob.substring(dob.indexOf("/") + 1).lastIndexOf("/")){
				date = dob.split("/");
			}else if (Pattern.matches("[0-9][0-9]-[a-zA-Z][a-zA-Z][a-zA-Z]-[0-9][0-9]", dob)){
				date = dob.split("-");
			}else{
				throw new Exception("Problem with date format");
			}
			this.setDobDay(date[0]);
			this.setDobMonth(date[1]);
			this.setDobYear(date[2]);
		}
		if(!(date[0] + date[1] + date[2]).equals("")){
		this.dateOfBirth = date[0] + "/" + date[1] + "/" + date[2];
		}else{
			this.dateOfBirth = "";
		}
	}*/

	public String getGender() {
		if(gender == null){gender = "";}
		return gender;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	public void setDateOfBirth(String dateOfBirth) {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		try {
			if (dateOfBirth != null) {
				this.setDateOfBirth(df.parse(dateOfBirth));
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Long getParticipantId() {
		if (this.participantId == null) {
			this.participantId = new Long(0);
		}
		return participantId;
	}

	public void setParticipantId(Long id) {
		this.participantId = id;
	}

	public String getParticipantRefnum() {
		if (this.referenceNumber == null) {
			this.referenceNumber = "";
		}
		return referenceNumber;
	}

	public void setParticipantRefnum(String participantRefnum) {
		this.referenceNumber = participantRefnum;
	}

	public String getClassId() {
		return classId;
	}

	public void setClassId(String classId) {
		this.classId = classId;
		/*try {
			if(classId!=null){
				if(!classId.equalsIgnoreCase(Class.ENDOMETRIAL)){
					this.setNoTissueReason("Not Applicable due to not being Endometrial Cancer");
				}
			}
			this.clss = new Class(this.classId);

		} catch (Exception e) {
			//To Do deal with Error creating classexception;
		}*/
	}

/*	public String getSourceId() {
		return sourceId;
	}

	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
		try {
			this.source = new Source(this.sourceId);
		} catch (Exception e) {
			//To Do deal with Error setting source exception;
		}
	}*/

	/**
	 * @return Returns the stageId.
	 */
/*	public String getStageId() {
		return stageId;
	}

	*//**
	 * @param stageId
	 *            The stageId to set.
	 *//*
	public void setStageId(String stageId) {
		this.stageId = stageId;
	}*/

//	/**
//	 * @return Returns the doctorId.
//	 */
//	public String getDoctorId() {
//		return doctorId;
//	}
//
//	/**
//	 * @param doctorId
//	 *            The doctorId to set.
//	 */
//	public void setDoctorId(String doctorId) {
//		this.doctorId = doctorId;
//	}

	/**
	 * @return Returns the statusHistory.
	 * @throws Exception
	 */
/*	public List<StatusChange> getStatusChanges() throws Exception {
		// TODO discuss with damien whether to do this here or at get persistant
		// object
		if (this.statusChanges == null) {
			this.statusChanges = new ArrayList<StatusChange>();
			String query = "SELECT id FROM statuschanges WHERE participant_id ="
			+ this.getParticipantId();
			try {
				this.connect();
				this.getStatement();
				resultSet = this.executeQuery(query);
				while (resultSet != null && resultSet.next()) {
					StatusChange sc = new StatusChange(resultSet.getString("id"));
					this.statusChanges.add(sc);

				}
				closeStatement();
			} finally {
				closeConnection();
			}
		}
		return statusChanges;
	}*/

	/**
	 * @param statusHistory
	 *            The statusHistory to set.
	 */
/*	public void setStatusChanges(List<StatusChange> statusHistory) {
		this.statusChanges = statusHistory;
	}*/

/*	*//**
	 * @return Returns the contactId.
	 *//*
	public String getContactId() {
		return contactId;
	}

	*//**
	 * @param contactId
	 *            The contactId to set.
	 *//*
	public void setContactId(String contactId) {
		this.contactId = contactId;
	}

	public void setStatus(Status status) {
		this.setStatusId(status.getId());
	}

	*//**
	 * @return Returns the consentToContactGiven.
	 *//*
	public Date getCtcGiven() {
		return ctcGiven;
	}

	*//**
	 * @param consentToContactGiven
	 *            The consentToContactGiven to set.
	 *//*
	public void setCtcGiven(Date consentToContactGiven) {
		this.ctcGiven = consentToContactGiven;
	}

	*//**
	 * @return Returns the consentToContactSought.
	 *//*
	public Date getCtcSought() {
		return ctcSought;
	}

	*//**
	 * @param consentToContactSought
	 *            The consentToContactSought to set.
	 *//*
	public void setCtcSought(Date consentToContactSought) {
		this.ctcSought = consentToContactSought;
	}

	*//**
	 * @param consented
	 *            The consented to set.
	 *//*
	public void setConsented(String consented) {
		this.consented = consented;
	}

	*//**
	 * @return Returns the consented.
	 *//*
	public String getConsented() {
		return consented;
	}

	*//**
	 * @return Returns the consentOn.
	 *//*
	public Date getRespondedOn() {
		return respondedOn;
	}

	*//**
	 * @param consentOn
	 *            The consentOn to set.
	 *//*
	public void setRespondedOn(Date consentOn) {
		this.respondedOn = consentOn;
	}
*/
	/**
	 * @return Returns the documents.
	 */
/*	public List<Document> getDocuments() {
		if (this.documents == null) {
			this.documents = new ArrayList<Document>();
			Document doc = new Document();
            doc.setType(Document.RPQUESTIONNAIRE);          
            documents.add(doc);
			Document doc1 = new Document();
            doc1.setType(Document.DNAKIT);          
            documents.add(doc1);
			Document doc2 = new Document();
            doc2.setType(Document.CONSENTFORM);          
            documents.add(doc2);
			Document doc3 = new Document();
            doc3.setType(Document.QUESTIONNAIRE);          
            documents.add(doc3);

		}
		return documents;
	}
*/
	/**
	 * @param documents
	 *            The documents to set.
	 */
/*	public void setDocuments(List<Document> documents) {
		this.documents = documents;
	}*/

	/**
	 * @return Returns the statusId.
	 */
	public String getStatusId() {
		if(statusId == null){statusId = "7";}
		return statusId;
	}

	/**
	 * @param statusId
	 *            The statusId to set.
	 */
	public void setStatusId(String statusId) {
		this.statusId = statusId;
	}

	/**
	 * @return Returns the ParticipantstatusId.
	 */
/*	public String getParticipantStatusId() {
		if(participantStatusId == null){participantStatusId = "11";}
		return participantStatusId;
	}

	*//**
	 * @param participantStatusId
	 *            The participantStatusId to set.
	 *//*
	public void setParticipantStatusId(String participantStatusId) {
		this.participantStatusId = participantStatusId;
	}*/

/*	*//**
	 * @return Returns the contact.
	 *//*
	public Contact getContact() {
		if (contact == null) {
			contact = new Contact();
		}
		return contact;
	}

	*//**
	 * @param contact
	 *            The contact to set.
	 *//*
	public void setContact(Contact contact) {
		this.contact = contact;
		this.contactId = contact.getContactId();
	}

	*//**
	 * @return Returns the doctor.
	 * @throws Exception 
	 *//*
	public Doctor getDoctor() {
		if (doctor == null) {
			doctor = new Doctor();
		}
		return this.doctor;
	}

	*//**
	 * @param doctor
	 *            The doctor to set.
	 *//*
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	*//**
	 * @return Returns the source.
	 * @throws Exception 
	 *//*
	public Source getSource() {
		if(this.source==null){
			if(this.sourceId!=null){
				try {
					this.source = new Source(this.sourceId);
				} catch (Exception e) {
					source = new Source();
				}
			} else {
				source = new Source();
			}
		}
		return source;
	}

	*//**
	 * @param source
	 *            The source to set.
	 *//*
	public void setSource(Source source) {
		this.source = source;
		this.sourceId = source.getId();
	}

	*//**
	 * @return Returns the stage.
	 *//*
	public Stage getStage() {
		return stage;
	}

	*//**
	 * @param stage
	 *            The stage to set.
	 *//*
	public void setStage(Stage stage) {
		this.stage = stage;
		this.stageId = stage.getId();
	}

	*//**
	 * @return Returns the treatments.
	 *//*
	public List<Treatment> getTreatments() {
		if (this.treatments == null) {
			this.treatments = new ArrayList<Treatment>();
		}
		return this.treatments;
	}

	*//**
	 * @param treatments
	 *            The treatments to set.
	 *//*
	public void setTreatments(List<Treatment> treatments) {
		this.treatments = treatments;
	}

	*//**
	 * @return Returns the participantStatus.
	 * @throws Exception
	 *//*
	public Status getParticipantStatus() throws Exception {

		if (this.participantStatusId != null) {
			this.participantStatus = new Status(this.participantStatusId);
		}
		return participantStatus;
	}*/

	/**
	 * @return Returns the invitedOn.
	 */
/*	public Date getInvitedOn() {
		return invitedOn;
	}

	*//**
	 * @param invitedOn
	 *            The invitedOn to set.
	 *//*
	public void setInvitedOn(Date invitedOn) {
		this.invitedOn = invitedOn;
	}

*/	/**
	 * @return Returns the maidenName.
	 */
	public String getMaidenName() {
		return maidenName;
	}

	/**
	 * @param maidenName
	 *            The maidenName to set.
	 */
	public void setMaidenName(String maidenName) {
		this.maidenName = maidenName;
	}

	/**
	 * @return Returns the eligible.
	 */
/*	public boolean isEligible() {
		this.eligible = true;
		return eligible;
	}

	public String isDisabled() {
		String strRetValue = "false";
		if (this.eligible) {
			strRetValue = "true";
		}
		return strRetValue;
	}

	*//**
	 * @param eligible
	 *            The eligible to set.
	 *//*
	public void setEligible(boolean eligible) {
		this.eligible = eligible;
	}*/

/*	public void saveParticipantStatus(ArrayList<String> reasonIds, String reasonOther) throws SQLException, Exception {
		// TODO eventually move this to statusChange an object
		String sql;
		java.sql.PreparedStatement pst;

		sql = "INSERT INTO statuschanges (participant_id,status_name,changed_on) VALUES (?, ?, ?)";
		try {
			this.connect();
			pst = getConnection().prepareStatement(sql);

			pst.setLong(1, getParticipantId());
			if(this.participantStatus!=null){
				pst.setString(2, this.getParticipantStatus().getName());
			}else{
				pst.setString(2, "");
			}                 
			pst.setDate(3, Utility.dateToSQL(new Date()));
			pst.executeUpdate();
			java.sql.ResultSet rs = pst.getGeneratedKeys();
			if (rs != null && rs.next()) {
				String statusChangeId = rs.getString(1);
				// record the reasons for the change
				if (reasonIds != null) {
					for (String reasonId : reasonIds) {
						if (reasonId.equals(REASONOTHER)) {
							sql = "INSERT INTO statuschange_reasons (reason_id,statuschange_id,description) VALUES("
							+ reasonId + "," + statusChangeId + ",'" + reasonOther + "')";
							pst.execute(sql);
						} else {
							sql = "INSERT INTO statuschange_reasons (reason_id,statuschange_id) VALUES("
							+ reasonId + "," + statusChangeId + ")";
							pst.execute(sql);
						}
					}
				}
			} else {
				// TODO deal with error
				throw new Exception("Couldn't get generated ID");
			}
		} finally {
			closeConnection();
		}
		this.save();

	}*/
	
/*	public void saveParticipantStatus(String reasonId) throws SQLException, Exception {
		// TODO eventually move this to statusChange an object
		String sql;
		java.sql.PreparedStatement pst;

		sql = "INSERT INTO statuschanges (participant_id,status_name,changed_on) VALUES (?, ?, ?)";
		try {
			this.connect();
			pst = getConnection().prepareStatement(sql);

			pst.setLong(1, getParticipantId());
			if(this.participantStatus!=null){
				pst.setString(2, this.getParticipantStatus().getName());
			}else{
				pst.setString(2, "");
			}                 
			pst.setDate(3, Utility.dateToSQL(new Date()));
			pst.executeUpdate();
			java.sql.ResultSet rs = pst.getGeneratedKeys();
			if (rs != null && rs.next()) {
				String statusChangeId = rs.getString(1);
				// record the reasons for the change
				if (reasonId != null) {
					sql = "INSERT INTO statuschange_reasons (reason_id,statuschange_id) VALUES("
						+ reasonId + "," + statusChangeId + ")";
						pst.execute(sql);	
				}
			} else {
				// TODO deal with error
				throw new Exception("Couldn't get generated ID");
			}
		} finally {
			closeConnection();
		}
		this.save();

	}*/

	/**
	 * @return Returns the ctcOutcome.
	 */
/*	public String getCtcOutcome() {
		return ctcOutcome;
	}


	*//**
	 * @param ctcOutcome The ctcOutcome to set.
	 *//*
	public void setCtcOutcome(String ctcOutcome) {
		this.ctcOutcome = ctcOutcome;
	}


	*//**
	 * @return Returns the sourceOther.
	 *//*
	public String getSourceOther() {
		return sourceOther;
	}



	*//**
	 * @param sourceOther The sourceOther to set.
	 *//*
	public void setSourceOther(String sourceOther) {
		this.sourceOther = sourceOther;
	}


	*//**
	 * @return Returns the nurse.
	 *//*
	public String getNurse() {
		return nurse;
	}


	*//**
	 * @param nurse The nurse to set.
	 *//*
	public void setNurse(String nurse) {
		this.nurse = nurse;
	}*/


	/**
	 * @return Returns the clss.
	 * @throws Exception 
	 */
/*	public Class getClss() {
		if(this.clss==null){
			if(this.classId!=null){
				try {
					this.clss = new Class(this.classId);
				} catch (Exception e) {
					this.clss = new Class();
				}
			} else {
				this.clss = new Class();
			}
		}
		return clss;
	}*/


/*	*//**
	 * @param clss The clss to set.
	 *//*
	public void setClss(Class clss) {
		this.clss = clss;
	}

	*//**
	 * @return Returns the comments.
	 */

	public String getComments() {
		if (this.comments == null) {
			this.comments = "";
		}else if(this.comments.equalsIgnoreCase("NULL")){
			this.comments = "";
		}
		return comments;
	}

	/**
	 * @param comments The comments to set.
	 */
	public void setComments(String comments) {
		this.comments = comments;
	}



/*	*//**
	 * @return Returns the consentBlood.
	 *//*
	public String getConsentBlood() {
		return consentBlood;
	}


	*//**
	 * @param consentBlood The consentBlood to set.
	 *//*
	public void setConsentBlood(String consentBlood) {
		this.consentBlood = consentBlood;
	}


	*//**
	 * @return Returns the consentFamily.
	 *//*
	public String getConsentFamily() {
		return consentFamily;
	}


	*//**
	 * @param consentFamily The consentFamily to set.
	 *//*
	public void setConsentFamily(String consentFamily) {
		this.consentFamily = consentFamily;
	}


	*//**
	 * @return Returns the consentGenetic.
	 *//*
	public String getConsentGenetic() {
		return consentGenetic;
	}


	*//**
	 * @param consentGenetic The consentGenetic to set.
	 *//*
	public void setConsentGenetic(String consentGenetic) {
		this.consentGenetic = consentGenetic;
	}


	*//**
	 * @return Returns the consentMedical.
	 *//*
	public String getConsentMedical() {
		return consentMedical;
	}


	*//**
	 * @param consentMedical The consentMedical to set.
	 *//*
	public void setConsentMedical(String consentMedical) {
		this.consentMedical = consentMedical;
	}


	*//**
	 * @return Returns the consentTissue.
	 *//*
	public String getConsentTissue() {
		return consentTissue;
	}


	*//**
	 * @param consentTissue The consentTissue to set.
	 *//*
	public void setConsentTissue(String consentTissue) {    	
		this.consentTissue = consentTissue;
		if(consentTissue!=null){
			if(consentTissue.equalsIgnoreCase("N/A")){
				this.setNoTissueReason("Not Applicable");
			}else if(consentTissue.equalsIgnoreCase("No")){
				this.setNoTissueReason("Refused consent");
			}
		}
	}


	*//**
	 * @return Returns the contactImplications.
	 *//*
	public String getContactImplications() {
		return contactImplications;
	}


	*//**
	 * @param contactImplications The contactImplications to set.
	 *//*
	public void setContactImplications(String contactImplications) {
		this.contactImplications = contactImplications;
	}


	*//**
	 * @return Returns the invitedType.
	 *//*
	public String getInvitedType() {
		return invitedType;
	}


	*//**
	 * @param invitedType The invitedType to set.
	 *//*
	public void setInvitedType(String invitedType) {
		this.invitedType = invitedType;
	}
*/
	/**
	 * @return Returns the identifiedOn.
	 */
/*	public Date getIdentifiedOn() {
		return identifiedOn;
	}


	*//**
	 * @param identifiedOn The identifiedOn to set.
	 *//*
	public void setIdentifiedOn(Date identifiedOn) {
		this.identifiedOn = identifiedOn;
	}*/

	/**
	 * @return Returns the collections.
	 */
/*	public List<Collection> getCollections() {
		if (collections == null) {
			collections = new ArrayList<Collection>();
		}
		return collections;
	}


	*//**
	 * @param collections The collections to set.
	 *//*
	public void setCollections(List<Collection> collections) {
		this.collections = collections;
	}
*/
	/**
	 * Helper accessor for finding the first and last initial of the participants name
	 * 
	 * @return first and last initial of the participant
	 */
	public String getInitials() {
		return firstName.substring(0, 1) + lastName.substring(0,1);
	}

	/**
	 * Helper accessor to return the first Collection of bloods
	 * @return first blood collection
	 */
/*	public Collection getBloodCollection(int i) {
		Collection bloodCollection = null;
		int j=0;
		for (Collection c: collections) {
			for(Biospecimen bio: c.getBiospecimens()){
				if(Biotype.BLOOD.equalsIgnoreCase(bio.getBiotype_id())){
					if(j==i){
						bloodCollection = c;
						break;
					}
				}
			}
			j++;
		}
		return bloodCollection;
	}
	public Collection getFixedTissueCollection(int i) {
		Collection collection = null;
		int j=0;
		for (Collection c: collections) {
			for(Biospecimen bio: c.getBiospecimens()){
				if(Biotype.RNALATER.equalsIgnoreCase(bio.getBiotype_id())){
					if(j==i){
						collection = c;
						break;
					}
				}
			}
			j++;
		}
		return collection;
	}

	public ArrayList<Collection> getBloodCollections() {
		ArrayList<Collection> bloodCollections = new ArrayList<Collection>();
		for (Collection c: collections) {
			for(Biospecimen bio: c.getBiospecimens()){
				if(Biotype.BLOOD.equalsIgnoreCase(bio.getBiotype_id())){
					bloodCollections.add(c);
					break;
				}
			}
		}
		return bloodCollections;
	}
	public ArrayList<Collection> getRNALaterCollections() {
		ArrayList<Collection> colls = new ArrayList<Collection>();
		for (Collection c: collections) {
			for(Biospecimen bio: c.getBiospecimens()){
				if(Biotype.RNALATER.equalsIgnoreCase(bio.getBiotype_id())){
					colls.add(c);
					break;
				}
			}
		}
		return colls;
	}
	public ArrayList<Collection> getFreshFrozenTissueCollections() {
		ArrayList<Collection> colls = new ArrayList<Collection>();
		for (Collection c: collections) {
			for(Biospecimen bio: c.getBiospecimens()){
				if(Biotype.FROZEN.equalsIgnoreCase(bio.getBiotype_id())){
					colls.add(c);
					break;
				}
			}
		}
		return colls;
	}

	*//**
	 * Helper accessor to return the first tissue collection
	 * @return first tissue collection
	 *//*
	 public Collection getTissueCollection() {
		Collection tissueCollection = null;
		for (Collection c: collections) {
			for(Biospecimen bio: c.getBiospecimens()){
				if(Biotype.RNALATER.equalsIgnoreCase(bio.getBiotype_id()) ||
						Biotype.FROZEN.equalsIgnoreCase(bio.getBiotype_id())){
					tissueCollection = c;
					break;
				}
			}
		}
		return tissueCollection;
	 }
	 public ArrayList<Collection> getTissueCollections() {
		 ArrayList<Collection> bloodCollections = new ArrayList<Collection>();
		 for (Collection c: collections) {
			 for(Biospecimen bio: c.getBiospecimens()){
				 if(Biotype.RNALATER.equalsIgnoreCase(bio.getBiotype_id()) ||
						 Biotype.FROZEN.equalsIgnoreCase(bio.getBiotype_id())){
					 bloodCollections.add(c);
					 break;
				 }
			 }
		 }
		 return bloodCollections;
	 }

	 *//**
	  * ANECS accessor to return the ACD Blood Count from the collections
	  * @return first tissue collection
	  * @throws Exception 
	  *//*
	 public int getACDBloodTubeCount() throws Exception {
		 try{
			 this.aCDBloodTubeCount = 0;
			 for (Collection c: this.getBloodCollections()) {
				 for(Biospecimen bio: c.getBiospecimens()){
					 if(bio.getParentTable()!=null){
						 if(bio.getParentTable().equalsIgnoreCase("bloodsamples")){
							 BloodSample bloodSample = new BloodSample(bio.getParentId());
							 if(bloodSample.getAdditive().equalsIgnoreCase("ACD")){
								 aCDBloodTubeCount++;
							 }
						 }
					 }
				 }
			 }
			 //aCDBloodTubeCount = this.getACDBloodTubeCountSQL();
		 }catch(Exception ex){
			 this.getWarnings().put("Exception: ", ex.getMessage());
			 throw new Exception(ex);
		 }
		 return aCDBloodTubeCount;
	 }
	 public int getPlainBloodTubeCount() throws Exception {
		 try{
			 this.plainBloodTubeCount = 0;
			 for (Collection c: this.getBloodCollections()) {
				 for(Biospecimen bio: c.getBiospecimens()){
					 if(bio.getParentTable()!=null){
						 if(bio.getParentTable().equalsIgnoreCase("bloodsamples")){
							 BloodSample bloodSample = new BloodSample(bio.getParentId());
							 if(bloodSample.getAdditive().equalsIgnoreCase("PLAIN")){
								 plainBloodTubeCount++;
							 }
						 }
					 }
				 }
			 }
			 //plainBloodTubeCount = this.getPlainBloodTubeCountSQL();
		 }catch(Exception ex){
			 this.getWarnings().put("Exception: ", ex.getMessage());
			 throw new Exception(ex);
		 }
		 return plainBloodTubeCount;
	 }
	 *//**
	  * ANECS accessor to return the ACD Blood Count from the collections using SQL
	  * @return first tissue collection
	  * @throws Exception 
	  *//*
	 public int getACDBloodTubeCountSQL(int ibloodCollectionIndex) throws Exception{
		 String query = "SELECT Count(bloodsamples.id) AS CountOfBloodTubes"
			 +" FROM (biospecimens INNER JOIN bloodsamples ON biospecimens.parent_id = bloodsamples.id) INNER JOIN collections ON biospecimens.collection_id = collections.id"
			 +" GROUP BY biospecimens.referencenumber, biospecimens.parent_table, bloodsamples.additive, collections.collected_on, biospecimens.collection_id"
			 +" HAVING (((biospecimens.referencenumber)="+this.getParticipantRefnum()+") AND ((biospecimens.parent_table)='bloodsamples') AND ((bloodsamples.additive)='ACD')AND ((biospecimens.collection_id)="+this.getBloodCollection(ibloodCollectionIndex)+")";
		 int iRetValue = 0;
		 try {
			this.connect();
			 this.getStatement();
			 resultSet = this.executeQuery(query);
			 if (resultSet != null){
				 if(resultSet.next()) {
					 iRetValue = resultSet.getInt("CountOfBloodTubes");
				 }
			 }	            
			 closeStatement();
		 } finally {
			 closeConnection();
		 }
		 return iRetValue;
	 }
	 public int getPlainBloodTubeCountSQL(int ibloodCollectionIndex) throws Exception{
		 String query = "SELECT Count(bloodsamples.id) AS CountOfBloodTubes"
			 +" FROM (biospecimens INNER JOIN bloodsamples ON biospecimens.parent_id = bloodsamples.id) INNER JOIN collections ON biospecimens.collection_id = collections.id"
			 +" GROUP BY biospecimens.referencenumber, biospecimens.parent_table, bloodsamples.additive, collections.collected_on, biospecimens.collection_id"
			 +" HAVING (((biospecimens.referencenumber)="+this.getParticipantRefnum()+") AND ((biospecimens.parent_table)='bloodsamples') AND ((bloodsamples.additive)='PLAIN')AND ((biospecimens.collection_id)="+this.getBloodCollection(ibloodCollectionIndex)+")";
		 int iRetValue = 0;
		 try {
			 this.connect();
			 this.getStatement();
			 resultSet = this.executeQuery(query);
			 if (resultSet != null){
				 if(resultSet.next()) {
					 iRetValue = resultSet.getInt("CountOfBloodTubes");
				 }
			 }	            
			 closeStatement();
		 } finally {
			 closeConnection();
		 }
		 return iRetValue;
	 }
	 public int getRNALaterTubeCount() throws Exception{
		 String query = "SELECT biotype_id,referencenumber, Count(id) AS CountOfTubes"
			 +" FROM biospecimens"
			 +" GROUP BY biotype_id, referencenumber"
			 +" HAVING (((biotype_id)="+Biotype.RNALATER+") AND ((referencenumber)='"+this.getParticipantRefnum()+"'))";
		 this.rNALaterTubeCount = 0;
		 try {
			 this.connect();
			 this.getStatement();
			 resultSet = this.executeQuery(query);
			 if (resultSet != null){
				 if(resultSet.next()) {
					 this.rNALaterTubeCount = resultSet.getInt("CountOfTubes");
				 }
			 }            
			 closeStatement();
		 }catch(Exception ex){
			 this.getWarnings().put("Exception: ", ex.getMessage());
			 throw new Exception(ex);
		 } finally {
			 closeConnection();
		 }
		 return this.rNALaterTubeCount;
	 }
	 public int getFreshFrozenTubeCount() throws Exception{
		 String query = "SELECT biotype_id,referencenumber, Count(id) AS CountOfTubes"
			 +" FROM biospecimens"
			 +" GROUP BY biotype_id, referencenumber"
			 +" HAVING (((biotype_id)="+Biotype.FROZEN+") AND ((referencenumber)='"+this.getParticipantRefnum()+"'))";
		 this.freshFrozenTubeCount = 0;
		 try {
			 this.connect();
			 this.getStatement();
			 resultSet = this.executeQuery(query);
			 if (resultSet != null){
				 if(resultSet.next()) {
					 this.freshFrozenTubeCount = resultSet.getInt("CountOfTubes");
				 }
			 }            
			 closeStatement();
		 }catch(Exception ex){
			 this.getWarnings().put("Exception: ", ex.getMessage());
			 throw new Exception(ex);
		 } finally {
			 closeConnection();
		 }
		 return this.freshFrozenTubeCount;
	 }
	 public int getBlockTissueCountSQL() throws Exception{
		 String query = "SELECT Count(id) AS CountOfTubes"
			 +" FROM biospecimens"
			 +" GROUP BY biotype_id, referencenumber"
			 +" HAVING (((biotype_id)="+Biotype.BLOCKTISSUE+") AND ((referencenumber)="+this.getParticipantRefnum()+"))";
		 this.blockTissueCount = 0;
		 try {
			 this.connect();
			 this.getStatement();
			 resultSet = this.executeQuery(query);
			 if (resultSet != null){
				 if(resultSet.next()) {
					 this.blockTissueCount = resultSet.getInt("CountOfTubes");
				 }
			 }            
			 closeStatement();
		 } finally {
			 closeConnection();
		 }
		 return this.blockTissueCount;
	 }
	 public int getSlideTissueCountSQL() throws Exception{
		 String query = "SELECT Count(id) AS CountOfTubes"
			 +" FROM biospecimens"
			 +" GROUP BY biotype_id, referencenumber"
			 +" HAVING (((biotype_id)="+Biotype.SLIDETISSUE+") AND ((referencenumber)="+this.getParticipantRefnum()+"))";
		 this.slideTissueCount = 0;
		 try {
			 this.connect();
			 this.getStatement();
			 resultSet = this.executeQuery(query);
			 if (resultSet != null){
				 if(resultSet.next()) {
					 this.slideTissueCount = resultSet.getInt("CountOfTubes");
				 }
			 }            
			 closeStatement();
		 }catch(Exception ex){
			 this.getWarnings().put("Exception: ", ex.getMessage());
			 throw new Exception(ex);
		 } finally {
			 closeConnection();
		 }
		 return this.slideTissueCount;
	 }

	 public int getACDBloodTubeCountSQL() throws Exception{
		 String query = "SELECT biospecimens.referencenumber, biospecimens.parent_table, bloodsamples.additive, biospecimens.collection_id, Count(bloodsamples.id) AS CountOfBloodTubes"
			 +" FROM (biospecimens INNER JOIN bloodsamples ON biospecimens.parent_id = bloodsamples.id)"
			 +" GROUP BY biospecimens.referencenumber, biospecimens.parent_table, bloodsamples.additive, biospecimens.collection_id"
			 +" HAVING ((biospecimens.referencenumber='"+this.getParticipantRefnum()+"') AND (biospecimens.parent_table='bloodsamples') AND (bloodsamples.additive='ACD'))";
		 int iRetValue = 0;
		 try {
			 this.connect();
			 this.getStatement();
			 resultSet = this.executeQuery(query);
			 if (resultSet != null){
				 if(resultSet.next()) {
					 iRetValue = resultSet.getInt("CountOfBloodTubes");
				 }
			 }            
			 closeStatement();
		 } finally {
			 closeConnection();
		 }
		 return iRetValue;
	 }
	 public int getPlainBloodTubeCountSQL() throws Exception{
		 String query = "SELECT biospecimens.referencenumber, biospecimens.parent_table, bloodsamples.additive, biospecimens.collection_id, Count(bloodsamples.id) AS CountOfBloodTubes"
			 +" FROM (biospecimens INNER JOIN bloodsamples ON biospecimens.parent_id = bloodsamples.id)"
			 +" GROUP BY biospecimens.referencenumber, biospecimens.parent_table, bloodsamples.additive, biospecimens.collection_id"
			 +" HAVING ((biospecimens.referencenumber='"+this.getParticipantRefnum()+"') AND (biospecimens.parent_table='bloodsamples') AND (bloodsamples.additive='PLAIN'))";
		 int iRetValue = 0;
		 try {
			 this.connect();
			 this.getStatement();
			 resultSet = this.executeQuery(query);
			 if (resultSet != null){
				 if(resultSet.next()) {
					 iRetValue = resultSet.getInt("CountOfBloodTubes");
				 }
			 }            
			 closeStatement();
		 }catch(Exception ex){
			 this.getWarnings().put("Exception: ", ex.getMessage());
			 throw new Exception(ex);
		 } finally {
			 closeConnection();
		 }
		 return iRetValue;
	 }
	 public int getFreshTubeCountSQL(int iFreshTissueCollectionIndex) throws Exception{
		 String query = "SELECT Count(bloodsamples.id) AS CountOfACDBloodTubes"
			 +" FROM (biospecimens INNER JOIN bloodsamples ON biospecimens.parent_id = bloodsamples.id)"
			 +" GROUP BY biospecimens.referencenumber, biospecimens.parent_table, bloodsamples.additive, biospecimens.collection_id"
			 +" HAVING (((biospecimens.referencenumber)="+this.getParticipantRefnum()+") AND ((biospecimens.parent_table)='bloodsamples') AND ((bloodsamples.additive)='ACD')";
		 int iRetValue = 0;
		 try {
			 this.connect();
			 this.getStatement();
			 resultSet = this.executeQuery(query);
			 if (resultSet != null){
				 if(resultSet.next()) {
					 iRetValue = resultSet.getInt("");
				 }
			 }            
			 closeStatement();
		 } finally {
			 closeConnection();
		 }
		 return iRetValue;
	 }
*/
	 /**
	  * @return Returns the allComplete.
	  */
/*	 public boolean isAllComplete() {
		 return allComplete;
	 }

	 *//**
	  * @param allComplete The allComplete to set.
	  *//*
	 public void setAllComplete(boolean allComplete) {
		 this.allComplete = allComplete;
	 }

	 public String getNoTissueReason() {
		 return noTissueReason;
	 }

	 public void setNoTissueReason(String noTissueReason) {
		 this.noTissueReason = noTissueReason;
	 }

	 public boolean isNoTissue() {
		 if(this.noTissueReason!=null){
			 this.noTissue = true;
		 }
		 return noTissue;
	 }*/

	public String getDobDay() {
		if (this.getDateOfBirth() != null) {
		 SimpleDateFormat sdf = new SimpleDateFormat("dd");
		 return sdf.format(this.getDateOfBirth());
		}else{
			return "";
		}
	 }
	
	public int getDobDayInt() {
		if (this.getDobDay().equals("")) {
		 return 0;
		}else{
			return Integer.parseInt(this.getDobDay());
		}
	 }
	 /*public String getDobDay() {
		 if (!this.dateOfBirth.equals("")){
			 if (this.dateOfBirth.length() > 10){
				 this.dateOfBirth = this.dateOfBirth.substring(0, this.dateOfBirth.indexOf(" "));
			 }
		 String[] dob = this.dateOfBirth.split("/");
		 return dob[0];
		 }else{
			 return "";
		 }
	 }*/

	 public void setDobDay(String dobDay) {
		 this.dobDay = dobDay;
	 }

	 public String getDobMonth() {
		 if (this.getDateOfBirth() != null) {
		 SimpleDateFormat sdf = new SimpleDateFormat("MM");
		 return sdf.format(this.getDateOfBirth());
		 }else{
			 return "";
		 }
	 }
	 
	 public int getDobMonthInt() {
			if (this.getDobMonth().equals("")) {
			 return 0;
			}else{
				return Integer.parseInt(this.getDobMonth());
			}
		 }
	 /*public String getDobMonth() {
		 if (!this.dateOfBirth.equals("")){
			 if (this.dateOfBirth.length() > 10){
				 this.dateOfBirth = this.dateOfBirth.substring(0, this.dateOfBirth.indexOf(" "));
			 }
		 String[] dob = this.dateOfBirth.split("/");
		 return dob[1];
		 }else{
			 return "";
		 }
	 }*/

	 public void setDobMonth(String dobMonth) {
		 this.dobMonth = dobMonth;
	 }

	 public String getDobYear() {
		 if (this.getDateOfBirth() != null) {
		 SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
		 return sdf.format(this.getDateOfBirth());
		 }else{
			 return "";
		 }
	 }
	 
	 public int getDobYearInt() {
			if (this.getDobYear().equals("")) {
			 return 0;
			}else{
				return Integer.parseInt(this.getDobYear());
			}
		 }
/*	 public String getDobYear() {
		 if (!this.dateOfBirth.equals("")){
			 if (this.dateOfBirth.length() > 10){
				 this.dateOfBirth = this.dateOfBirth.substring(0, this.dateOfBirth.indexOf(" "));
			 }
			 String[] dob = this.dateOfBirth.split("/");
			 return dob[2];
		 }else{
			 return "";
		 }
	 }*/

	 public void setDobYear(String dobYear) {
		 this.dobYear = dobYear;
	 }
	 //ANECS function
/*	 public Treatment getInitialDiagnosis(){
		 Treatment initDiag = null;
		 String[] types = {Treatment.INITIALDIAG,Treatment.CURETTE,Treatment.HYSTEROSCOPY,Treatment.PAPSMEAR,Treatment.ENDOMETRIALBIOSPY,Treatment.HYSTERECTOMY};
		 for(Treatment treatment:this.getTreatments(types)){			
			 initDiag = treatment;
			 break;			
		 }
		 return initDiag;
	 }

	 public void setInitialDiagnosis(Treatment initDiag) {
		 String[] types = {Treatment.INITIALDIAG,Treatment.CURETTE,Treatment.HYSTEROSCOPY,Treatment.PAPSMEAR,Treatment.ENDOMETRIALBIOSPY,Treatment.HYSTERECTOMY};
		 for (Treatment treatment: this.getTreatments(types)) {
			 this.treatments.remove(treatment);
		 }
		 if (initDiag.getType() == null) {
			 initDiag.setType(Treatment.INITIALDIAG);
		 }
		 this.treatments.add(initDiag);
	 }

	 public void setSecondaryTreatment(Treatment secTreatment) {
		 String[] types = {Treatment.SECONDARYTREAT,Treatment.SURGERY,Treatment.CHEMOTHERAPY,Treatment.RADIOTHERAPY};
		 for (Treatment treatment: this.getTreatments(types)) {
			 this.treatments.remove(treatment);
		 }
		 if (secTreatment.getType() == null) {
			 secTreatment.setType(Treatment.SECONDARYTREAT);
		 }
		 this.treatments.add(secTreatment);
	 }


//	 ANECS function
	 public Treatment getSecondaryTreatment(){
		 Treatment secondary = null;
		 String[] types = {Treatment.SECONDARYTREAT,Treatment.SURGERY,Treatment.CHEMOTHERAPY,Treatment.RADIOTHERAPY};
		 for(Treatment treatment:this.getTreatments(types)){			
			 secondary = treatment;
			 break;			
		 }
		 return secondary;
	 }
	 public Treatment getTreatment(String type){
		 Treatment treat = null;
		 for(Treatment treatment:this.getTreatments()){
			 if((treatment.getType().equalsIgnoreCase(type))){
				 treat = treatment;
				 break;
			 }
		 }
		 return treat;
	 }
	 public List<Treatment> getTreatments(String[] types){
		 List<Treatment> treats = new ArrayList<Treatment>();		
		 for(String type:types){
			 Treatment treatment = this.getTreatment(type);
			 if(treatment!=null){
				 treats.add(treatment);
			 }
		 }		
		 return treats;
	 }
	 //ANECS functions
	 public Document getInformationBrochure() {
		 Document document = null;
		 document = this.getDocument(Document.INFORMBROCHURE);
		 return document;
	 }
	 public void setInformationBrochure(Document infoBrochure) {
		 this.setDocument(Document.INFORMBROCHURE, infoBrochure);
	 }

	 public Document getConsentForm(){
		 Document document = null;
		 document = this.getDocument(Document.CONSENTFORM);
		 return document;
	 }
	 public void setConsentForm(Document consentForm) {
		 this.setDocument(Document.CONSENTFORM, consentForm);
	 }
	 public Document getDnaConsentForm(){
		 Document document = null;
		 document = this.getDocument(Document.DNACONSENTFORM);
		 return document;
	 }
	 public void setDnaConsentForm(Document dnaConsentForm) {
		 this.setDocument(Document.DNACONSENTFORM, dnaConsentForm);
	 }
	 public Document getQuestionnaire(){
		 Document document = null;
		 document = this.getDocument(Document.QUESTIONNAIRE);
		 return document;
	 }
	 public void setQuestionnaire(Document studyPack) {
		 this.setDocument(Document.QUESTIONNAIRE, studyPack);
	 }
	 
	 public Document getDnaKit(){
		 Document document = null;
		 document = this.getDocument(Document.DNAKIT);
		 return document;
	 }
	 public void setDnaKit(Document dnaPack) {
		 this.setDocument(Document.DNAKIT, dnaPack);
	 }
	 
	 public Document getRPQuestionnaire(){
		 Document document = null;
		 document = this.getDocument(Document.RPQUESTIONNAIRE);
		 return document;
	 }
	 public void setRPQuestionnaire(Document rPQ) {
		 this.setDocument(Document.RPQUESTIONNAIRE, rPQ);
	 }
	 
	 public Document getDietQuestionnaire(){
		 Document document = null;
		 document = this.getDocument(Document.DIETQ);
		 return document;
	 }
	 public void setDietQuestionnaire(Document dietQ) {
		 this.setDocument(Document.DIETQ, dietQ);
	 }

	 public Document getInterviewForm(){
		 Document document = null;
		 document = this.getDocument(Document.INTERVIEW);
		 return document;
	 }
	 public void setInterviewForm(Document interviewForm) {
		 this.setDocument(Document.INTERVIEW, interviewForm);
	 }

	 public Document getCurettePathReport(){
		 Document document = null;
		 document = this.getDocument(Document.CURETTEPATHREPORT);
		 return document;
	 }
	 public void setCurettePathReport(Document curettePathReport) {
		 this.setDocument(Document.CURETTEPATHREPORT, curettePathReport);
	 }

	 public Document getSurgeryPathReport(){
		 Document document = null;
		 document = this.getDocument(Document.SURGERYPATHREPORT);
		 return document;
	 }
	 public void setSurgeryPathReport(Document surgeryPathReport) {
		 this.setDocument(Document.SURGERYPATHREPORT, surgeryPathReport);
	 }

	 public Document getBloodKit() {
		 Document document = null;
		 document = this.getDocument(Document.BLOODKIT);
		 return document;
	 }
	 public void setBloodKit(Document bloodKit) {
		 this.setDocument(Document.BLOODKIT, bloodKit);
	 }
	 public Document getClinicalData1() {
		 Document document = null;
		 document = this.getDocument(Document.CLINICALDATA1);
		 return document;
	 }
	 public void setClinicalData1(Document clinicalData1) {
		 this.setDocument(Document.CLINICALDATA1, clinicalData1);
	 }
	 public Document getClinicalData2() {
		 Document document = null;
		 document = this.getDocument(Document.CLINICALDATA2);
		 return document;
	 }
	 public void setClinicalData2(Document clinicalData2) {
		 this.setDocument(Document.CLINICALDATA2, clinicalData2);
	 }*/
	 //end ANECS functions
/*	 public Document getDocument(String type) {
		 Document document = null;
		 for(Document doc:this.getDocuments()){
			 if(type.equalsIgnoreCase(doc.getType())){
				 document = doc;
				 break;
			 }
		 }
		 return document;
	 }

	 private void setDocument(String type, Document document) {
		 Document oldDoc = this.getDocument(type);
		 if (oldDoc != null) {
			 this.documents.remove(oldDoc);
		 }
		 document.setType(type);
		 this.documents.add(document);
	 }

	 public ArrayList<FreshTissue> getTissueBiospecimens(String biotype) throws Exception {
		 ArrayList<FreshTissue> retValue = new ArrayList<FreshTissue>();
		 for(Biospecimen b:this.getBiospecimens()){
			 if(b.getBiotype().getId().equalsIgnoreCase(biotype)){
				 FreshTissue ft = new FreshTissue(b.getId());
				 retValue.add(ft);
			 }
		 }
		 return retValue;
	 }

	 private List<Biospecimen>  getBiospecimens() throws Exception {
		 if(this.biospecimens==null){
			 this.loadBiospecimens();
		 }
		 return biospecimens;
	 }

	 private void loadBiospecimens() throws Exception {
		 if (this.referenceNumber!=null && (!(referenceNumber.equalsIgnoreCase("")))){
			 biospecimens = new ArrayList<Biospecimen>();
			 String query = "SELECT id FROM biospecimens WHERE referencenumber='" + this.getParticipantRefnum()+"'";
			 try {
				 this.connect();
				 this.getStatement();
				 resultSet = this.executeQuery(query);
				 while (resultSet != null && resultSet.next()) {
					 biospecimens.add(new Biospecimen(resultSet.getString("id")));
				 }
			 } finally {
				 closeConnection();
			 }
		 }	
	 }

	 public CollectionBlockTissue getCollectionBlockTissue() throws Exception {
		 String query = "SELECT id FROM collectionsffpb WHERE referencenumber='"+this.getParticipantRefnum()+"'";
		 try {
			 this.connect();
			 this.getStatement();
			 resultSet = this.executeQuery(query);
			 if (resultSet != null){
				 if(resultSet.next()) {
					 collectionBlockTissue = new CollectionBlockTissue(resultSet.getString("id"));
				 }
			 }            
			 closeStatement();
		 } finally {
			 closeConnection();
		 }
		 return collectionBlockTissue;
	 }

	 public void setCollectionBlockTissue(CollectionBlockTissue collectionBlockTissue) {
		 this.collectionBlockTissue = collectionBlockTissue;
	 }

	 public CollectionBlood getCollectionBlood() throws Exception {
		 String query = "SELECT id FROM collectionsblood WHERE referencenumber='"+this.getParticipantRefnum()+"'";
		 try {
			 this.connect();
			 this.getStatement();
			 resultSet = this.executeQuery(query);
			 if (resultSet != null){
				 if(resultSet.next()) {
					 collectionBlood = new CollectionBlood(resultSet.getString("id"));
				 }
			 }            
			 closeStatement();
		 } finally {
			 closeConnection();
		 }
		 return collectionBlood;
	 }

	 public void setCollectionBlood(CollectionBlood collectionBlood) {
		 this.collectionBlood = collectionBlood;
	 }

	 public CollectionFreshTissue getCollectionFreshTissue() throws Exception {
		 String query = "SELECT id FROM collectionsfreshtissue WHERE referencenumber='"+this.getParticipantRefnum()+"'";
		 try {
			 this.connect();
			 this.getStatement();
			 resultSet = this.executeQuery(query);
			 if (resultSet != null){
				 if(resultSet.next()) {
					 collectionFreshTissue = new CollectionFreshTissue(resultSet.getString("id"));
				 }
			 }            
			 closeStatement();
		 } finally {
			 closeConnection();
		 }
		 return collectionFreshTissue;
	 }

	 public void setCollectionFreshTissue(CollectionFreshTissue collectionFreshTissue) {
		 this.collectionFreshTissue = collectionFreshTissue;
	 }

	 public CollectionRNALater getCollectionRnaLater() throws Exception {
		 String query = "SELECT id FROM collectionsrnalater WHERE referencenumber='"+this.getParticipantRefnum()+"'";
		 try {
			 this.connect();
			 this.getStatement();
			 resultSet = this.executeQuery(query);
			 if (resultSet != null){
				 if(resultSet.next()) {
					 collectionRnaLater = new CollectionRNALater(resultSet.getString("id"));
				 }
			 }            
			 closeStatement();
		 } finally {
			 closeConnection();
		 }
		 return collectionRnaLater;
	 }

	 public void setCollectionRnaLater(CollectionRNALater collectionRnaLater) {
		 this.collectionRnaLater = collectionRnaLater;
	 }

	 public CollectionSlide getCollectionSlide() throws Exception {
		 String query = "SELECT id FROM collectionsslide WHERE referencenumber='"+this.getParticipantRefnum()+"'";
		 try {
			 this.connect();
			 this.getStatement();
			 resultSet = this.executeQuery(query);
			 if (resultSet != null){
				 if(resultSet.next()) {
					 collectionSlide = new CollectionSlide(resultSet.getString("id"));
				 }
			 }            
			 closeStatement();
		 } finally {
			 closeConnection();
		 }
		 return collectionSlide;
	 }

	 public void setCollectionSlide(CollectionSlide collectionSlide) {
		 this.collectionSlide = collectionSlide;
	 }*/
	 public String getStudyId() {
		 return studyId;
	 }
	 public void setStudyId(String studyId) {
		 this.studyId = studyId;
	 }
	 public String getNextContactDateTime() {
		 if(this.nextContactDateTime==null){
			 this.nextContactDateTime = "1900-01-01";
		 }
		 return nextContactDateTime;
	 }
	 public void setNextContactDateTime(String nextContactDateTime) {
		 this.nextContactDateTime = nextContactDateTime;
	 }
	 public String getLastUpdated() {
		 if(lastUpdated==null){
			 lastUpdated = "1900-01-01";
		 }
		 return lastUpdated;
	 }
	 public void setLastUpdated(String lastUpdated) {
		 this.lastUpdated = lastUpdated;
	 }

	 public String getReferenceNumber() {
		 return referenceNumber;
	 }

	 public void setReferenceNumber(String referenceNumber) {
		 this.referenceNumber = referenceNumber;
	 }
	 public List<JobHistory> getJobHistories() throws Exception {
		 return this.getJobHistories("","ORDER BY age",false);
	 }
	 public List<JobHistory> getJobHistories(String orderBy) throws Exception {
		 return this.getJobHistories("",orderBy, false);
	 }
	 public List<JobHistory> getJobHistories(String orderBy, boolean showExtended) throws Exception {
		 return this.getJobHistories("",orderBy, showExtended);
	 }
	 public List<JobHistory> getJobHistories(String jobHistoryStatusId,String orderBy) throws Exception {
		 return this.getJobHistories(jobHistoryStatusId,orderBy, false);
	 }
	 public List<JobHistory> getJobHistories(String jobHistoryStatusId,String orderby, boolean showExtended) throws Exception {
		 List<JobHistory> jhs = new ArrayList<JobHistory>();
		 String filter = "";
		 if(!(jobHistoryStatusId.equalsIgnoreCase(""))){
			 filter = " AND jobhistorystatusid = "+jobHistoryStatusId +" ";
		 }
		 if (this.getParticipantId()!=null) {
			 String strSQL = "SELECT id FROM jobhistory WHERE participantid = " + this.getParticipantId() + "" + filter +" "+ orderby;
			 ResultSet rs = null;
			 try {
				 this.connect();
				 this.getStatement();
				 rs = this.executeQuery(strSQL);
				 if (rs != null) {
					 while (rs.next()) {
						 JobHistory jh = new JobHistory();
						 jh.setId(rs.getString("id"));
						 jhs.add(jh);
					 }
					 if (rs.getStatement() != null) {
						 rs.getStatement().close();
					 }
					 rs.close();
				 }else{
					 return jhs;
				 }
			 } catch (SQLException e) {
				 throw new Exception(e.getMessage());
			 } finally {
				 this.closeConnection();
			 }
		 }
		 for(JobHistory jh: jhs){
			 jh.getPersistentObject();
			 /*if (showExtended) {
				 jh.getAdditionalJHData(jhs.size());
			 }*/
		 }
		 return jhs;
	 }
	 
	 public String getStatusName() {
		 String retValue = "";
		 if (this.getStatusId() != null) {
			 if (this.getStatusId().equalsIgnoreCase(ParticipantStatus.READYFORINTERVIEW)) {
				 retValue = "Ready for interview";
			 } else if (this.getStatusId().equalsIgnoreCase(ParticipantStatus.READYFORASSESSMENT)) {
				 retValue = "Interview Complete";
			 } else if (this.getStatusId().equalsIgnoreCase(ParticipantStatus.INTERVIEWINCOMPLETE)) {
			//	 retValue = "Interview Incomplete, Next Contact Date/Time: "+Util.dateToDDMMYYYY(this.getNextContactDateTime());
				 retValue = "Interview Incomplete";
			 } else if (this.getStatusId().equalsIgnoreCase(ParticipantStatus.ASSESSMENTINCOMPLETE)) {
				 retValue = "Assessment Incomplete";
			 } else if (this.getStatusId().equalsIgnoreCase(ParticipantStatus.ASSESSMENTCOMPLETE)) {
				 retValue = "Assessment Complete";
			 } else if (this.getStatusId().equalsIgnoreCase(ParticipantStatus.TOBEREVIEWED)) {
				 retValue = "To Be Reviewed";
			 } else if (this.getStatusId().equalsIgnoreCase(ParticipantStatus.TOBEUPDATED)) {
				 retValue = "To Be Updated";
			 } else if (this.getStatusId().equalsIgnoreCase("NULL")) {
				 retValue = "To Be Updated";
			 } else if (this.getStatusId().equalsIgnoreCase(ParticipantStatus.NOFURTHERCONTACT)) {
				 retValue = "No Further Contact, please";
			 } else {
				 retValue = this.getStatusId(); 
			 }
		 } else {
			 retValue = "no ID";
		 }
		 return retValue;
	 }
	 public Integer getInterviewsToDoCount() throws Exception {
		 Integer iCount = new Integer(0);
		 iCount = this.getJobHistories(JobHistoryStatus.TOBEINTERVIEWED,"").size();		
		 return iCount;
	 }   		
//	 public Integer getInterviewsCompleteCount() throws Exception {
//		 Integer iCount = new Integer(0);		
//		 for(JobHistory jh:this.getJobHistories(JobHistoryStatus.TOBEINTERVIEWED,"")){	
//			 JobSpecificModule jsm = new JobSpecificModule(jh.getFinalJSMId());
//			 FrozenJobSpecificModule fjsm = jsm.getFrozenJSM(this.getStudyId());
//			 if(fjsm!=null){
//				 Interview interview = jh.getCurrentInterview(fjsm.getId());
//				 if(interview!=null){
//					 if(interview.getStatus().equalsIgnoreCase(Interview.COMPLETED)){
//						 iCount++;							
//					 }
//				 }				
//			 }			
//		 }
//		 return iCount;
//	 }
	 public boolean isValid() throws Exception {
		 boolean retVal = true;
		 String errorMessage = "";

		 //Test null ref#
		 if (getReferenceNumber() == null) {
			 errorMessage += " Reference Number cannot be null ";
			 retVal &= false;
		 }
		 //Test study id
		 if((getStudyId()== null) || (getStudyId().compareToIgnoreCase("")==0)) {
			 errorMessage += " Study id not set";
			 retVal &= false;
		 }
//		 Test Date of Birth
		 /*if (!this.isValidBirthDate(dateOfBirth)) {
			 errorMessage += "Not a valid date of birth";
			 retVal &= false;
		 }*/
		 if((getStudyId()== null) || (getStudyId().compareToIgnoreCase("")==0)) {
			 errorMessage += " Study id not set";
			 retVal &= false;
		 }
		 //Test Phone Number
		 /*if (this.getOccContactNo() != null) {
			 if (!isValidPhoneNumber(this.getOccContactNo())) {
				 errorMessage += " Phone number is invalid. ";
				 retVal &= false;
			 }
		 }*/
		 //Test space
		 /*if (getReferenceNumber().replace(" ","").length() == 0) {
			 errorMessage += " Reference Number cannot be only spaces ";
			 retVal &= false;
		 }*/
		 /*if (getFirstName().trim().length() == 0) {
			 errorMessage += " First Name is invalid. ";
			 retVal &= false;
		 }*/
		 /*if (getLastName().trim().length() == 0) {
			 errorMessage += " Last Name is invalid. ";
			 retVal &= false;
		 }*/
		 /*if (getGender().trim().length() == 0) {
			 errorMessage += " Gender is invalid. ";
			 retVal &= false;
		 }*/
		 if(this.getParticipantId() != 0){
			 if (this.getAddresses().size() != 0) {
				 String email = this.getAddresses().get(0).getEmail();
				 if (email.trim().length() == 0) {
					 errorMessage += " Email is invalid. ";
					 retVal &= false;
				 }
			 }
		 }
		 
		 if(!retVal) {
			 errorMessage = "Failed to save pariticipant: " + errorMessage;
		 }
		 this.setErrorMessage(errorMessage);
		 return retVal;
	 }
	 public boolean uniqueReferenceNumber() throws Exception {
		 boolean retValue = true;
		 String sql = "SELECT id " 
			 + " FROM participant "
			 + " WHERE referenceNumber = '" 
			 + this.getReferenceNumber() + "' AND studyid = "+this.getStudyId();    	
		 List<Participant> duplicateReferences = this.getParticipants(sql);
		 if (!duplicateReferences.isEmpty()) {
			 this.setErrorMessage("Reference number "+this.getReferenceNumber()+" is already in use.  Please enter a different reference number.");
			 retValue = false;
		 }
		 return retValue;
	 }
	 public void setErrorMessage(String errorMessage) {
		 this.errorMessage = errorMessage;
	 }
	 public String getErrorMessage() {
		 return errorMessage;
	 }
	 public List<Participant> getParticipants(String strSQL) throws Exception {
		 List<Participant> participants = new ArrayList<Participant>();
		 ResultSet rs = null;
		 try {
			 this.connect();
			 this.getStatement();
			 rs = this.executeQuery(strSQL);
			 if (rs != null) {
				 while (rs.next()) {
					 Participant p = new Participant();
					 p.setParticipantId(rs.getLong("id"));
					 participants.add(p);
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
		 for(Participant p: participants){
			 p.getPersistantObject();
		 }
		 return participants;
	 }

	public String getOccContactNo() {
		if (this.occContactNo == null) {
            this.occContactNo = "";
        }else if (this.occContactNo.equalsIgnoreCase("NULL")) {
            this.occContactNo = "";
        }
		if(this.occContactNo.equalsIgnoreCase("")){
			try{
				this.occContactNo = this.getParticipantTrackingPhoneNumber();
			}catch(Exception e){
				//To Do deal with Exception in getOccContactNo:"+e.getMessage());
			}
		}
		return occContactNo;
	}

	private String getParticipantTrackingPhoneNumber() throws Exception {
		String retValue = "";
		String query = "SELECT a.id FROM addresses a, participant p where a.person_id = p.person_id AND p.id = "+this.getParticipantId()+" AND a.type = 'RES'";
		String addressId = "";
        try {
            this.connect();
            this.getStatement();
            resultSet = this.executeQuery(query);
            if (resultSet != null ) {
                if(resultSet.next()){
                    addressId = resultSet.getString("id");
                }
            }
            closeStatement();
        } finally {
            closeConnection();
        }
        Address address = new Address(addressId);
        String preferredNumber = address.getPreferredNumber();
        if(preferredNumber !=null){
        	if(!(preferredNumber.equalsIgnoreCase(""))){
        		if(preferredNumber.equalsIgnoreCase("Home")){
        			retValue = address.getHomePhone();
        		} else if(preferredNumber.equalsIgnoreCase("Work")){
        			retValue = address.getWorkPhone();
        		}else if(preferredNumber.equalsIgnoreCase("Mobile")){
        			retValue = address.getMobilePhone();
        		}else if(preferredNumber.equalsIgnoreCase("Email")){
        			retValue = address.getEmail();
        		}
        	}
        }
        if(retValue.equalsIgnoreCase("")){
        	if((address.getHomePhone()!=null)){
            	if(!(address.getHomePhone().equalsIgnoreCase(""))){
            		retValue = address.getHomePhone();
            	}else{
            		if((address.getMobilePhone()!=null)){
                    	if(!(address.getMobilePhone().equalsIgnoreCase(""))){
                    		retValue = address.getMobilePhone();             	
                    	}
            		}
            	}
            }
        }     
		return retValue;
	}

	public void setOccContactNo(String occContactNo) {
		this.occContactNo = occContactNo;
	}
/*	private boolean isValidPhoneNumber(String phone){
		//if (checkInternationalPhone(phone)==false){
		//	this.setErrorMessage("Please check your phone number");
		//	return false;
		//}
		if(phone.equalsIgnoreCase("")){
			return false;						
		}else{
			if(isInteger(phone.replaceAll(" ", ""))){
				return true;
			}else{
				return false;	
			}
		}		
	}*/
	
//	private boolean checkInternationalPhone(String phone){
//		 non-digit characters which are allowed in phone numbers
//		String phoneNumberDelimiters = "()- ";
//		 characters which are allowed in international phone numbers
//		 (a leading + is OK)
//		String validWorldPhoneChars = phoneNumberDelimiters + "+";
//		 Minimum no of digits in an international phone no.
//		int minDigitsInIPhoneNumber = 10;	
		
//		String s=stripCharsInBag(phone,validWorldPhoneChars);
//		return (isInteger(s) && s.length() >= minDigitsInIPhoneNumber);
//	}
//	private String stripCharsInBag(String s, String bag) {
//		char c;
//	    String returnString = "";
	    // Search through string's characters one by one.
	    // If character is not in bag, append to returnString.
//	    for (int i = 0; i < s.length(); i++){   
//	        c = s.charAt(i);
//	        if (bag.indexOf(c) == -1) returnString += c;
//	    }
//	    return returnString;
//	}
/*	private boolean isInteger(String s) {
//		 Declaring required variables
		String digits = "0123456789";
		char c;
	    for (int i = 0; i < s.length(); i++)
	    {   
	        // Check that current character is number.
	        c = s.charAt(i);
	        if (digits.indexOf(c) == -1) return false;
	    }
	    // All characters are numbers.
	    return true;
	}*/
/*	private boolean isValidBirthDate(String dateOfBirth){
		String chars = "1234567890/";
		char[] dob = dateOfBirth.toCharArray();
		for (char s : dob) {
			if (!chars.contains(String.valueOf(s))) {
				return false;
			}
		}
		return true;
	}*/
    public List<JobHistory> getJobHistoriesReady() throws Exception {
        List<JobHistory> retValue = new ArrayList<JobHistory>();
        List<JobHistory> jhs = this.getJobHistories("ORDER BY Priority");
        for (JobHistory jh : jhs) {
            if (jh.getFinalJSMId() != null) {
                if (!(jh.getFinalJSMId().equalsIgnoreCase(""))) {
                    retValue.add(jh);
                }
            }
        }
        return retValue;
    }
    public void setAutoRefNumber(String studyId) throws Exception {
    	String count = "";
        String query = "SELECT COUNT(id)+1 AS theCount FROM participant WHERE studyid = "+studyId;
        try {
        	this.connect();
			 this.getStatement();
            ResultSet rs = this.executeQuery(query);
            if (rs != null) {
                if (rs.next()) {
                    count = rs.getString("theCount");
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
        Study study = new Study(studyId);
        String refNum = "";
        String studyName = study.getName();
        if(studyName.length()>3){
        	refNum = studyName.substring(0,1);
        }else if(studyName.length()>2){
        	refNum = studyName.substring(0,1);
        }else if(studyName.length()>1){
        	refNum = studyName.substring(1);
        }
        String filler = "";
        String strCount = count;
        if(strCount.length()==1){
        	filler = "000";
        }else if(strCount.length()==2){
        	filler = "00";
        }else if(strCount.length()==3){
        	filler = "0";
        }
        if (study.hasOption(Study.Option.AUTOGENERATEID)) {
            this.setReferenceNumber(refNum.toUpperCase()+filler+strCount);	
        }else{
            this.setReferenceNumber("");
        }
    }
	public String getNextAssessmentParticipantId(String jsmName) throws Exception {
		String strRetValue = "";
		String jsmFilter = "";
		if(!(jsmName.equalsIgnoreCase(""))){
			jsmFilter = " AND (ojsm.name = '"+jsmName+"')";
		}		
		String query = "SELECT mpart.id FROM participant mpart" +
				" INNER JOIN study mstudy ON mpart.studyid = mstudy.id" +
				" INNER JOIN jobhistory ojh ON mpart.id = ojh.participantid" +
				" INNER JOIN jsm ojsm ON ojh.finaljsmid = ojsm.id" +
				" WHERE (mpart.id > "+this.getParticipantId()+")" +
				" AND (mstudy.id = "+this.getStudyId()+")" +
				jsmFilter +
				" AND (mpart.participantstatusid IN (4, 5, 6)) LIMIT 0, 1";
	    try {
	    	this.connect();
	        ResultSet rs = this.executeQuery(query);
	        if (rs != null) {
	            if (rs.next()) {
	                strRetValue = rs.getString("id");	                
	            }
	            if (rs.getStatement() != null) {
	                rs.getStatement().close();
	            }
	            rs.close();
	        }
	        if(strRetValue.equalsIgnoreCase("")){
	        	query = "SELECT participant.id FROM participant" +
				" INNER JOIN study ON participant.studyid = study.id" +
				" WHERE (study.id = "+this.getStudyId()+") AND (participant.participantstatusid IN (4, 5, 6)) LIMIT 0, 1";
	        	rs = this.executeQuery(query);
		        if (rs != null) {
		            if (rs.next()) {
		                strRetValue = rs.getString("id");	                
		            }
		            if (rs.getStatement() != null) {
		                rs.getStatement().close();
		            }
		            rs.close();
		        }
	        }
	    } catch (Exception e) {
	        throw new Exception(e.getMessage());
	    } finally {
	        this.closeConnection();
	    }
	    return strRetValue;
	}
	
	public Interview getInterview(String fjsmId,String jhId) throws Exception {
		Interview retValue = new Interview();
    	String sql = "SELECT ojsmi.id" +
    			" FROM jsminterview ojsmi INNER JOIN jobhistory ojh" +
    			" ON ojsmi.jobhistoryid = ojh.id" +
    			" WHERE (ojh.participantid = "+this.getParticipantId()+") AND (ojsmi.frozenjsmid = "+fjsmId+") AND (ojh.id = "+jhId+")";    	
    	ResultSet rs = null;
        try {
        	this.connect();
            rs = this.executeQuery(sql);
            if (rs != null) {
                while (rs.next()) {
                	retValue = new Interview(rs.getString("id"));                    
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
		return retValue;
	}
	public boolean isFinishingAllInterviews() throws Exception {
		boolean retValue = true;		
		for(JobHistory jh:this.getJobHistories(JobHistoryStatus.TOBEINTERVIEWED,"")){	
			JobSpecificModule jsm = new JobSpecificModule(jh.getFinalJSMId());
			FrozenJobSpecificModule fjsm = jsm.getFrozenJSM(this.getStudyId());
			if(fjsm!=null){
				Interview interview = jh.getCurrentInterview(fjsm.getId());
				if(interview==null){
					retValue = false;
				}else{
					if(interview.getStatus().equalsIgnoreCase(Interview.STARTED)){
						retValue = false;								
					}
				}				
			}			
		}
		return retValue;
	}
/*	public void update() throws Exception {
        boolean updating = exists();
        String sql;
        if (updating) {
            sql = "UPDATE participant SET firstname='"
                    + this.escapeSpecialCharacters(this.getFirstName())
                    + "', middlename='"
                    + this.escapeSpecialCharacters(this.getMiddleName())
                    + "', lastname='"
                    + this.escapeSpecialCharacters(this.getLastName())
                    + "', referencenumber='"
                    + this.escapeSpecialCharacters(this.getReferenceNumber())
                    + "', studyid="
                    + this.getStudyId()
                    + ", gender='"
                    + this.escapeSpecialCharacters(this.getGender())
                    + "', participantstatusid="
                    + this.getStatusId()
                    + ", comments='"
                    + this.escapeSpecialCharacters(this.getComments())
                    + "', dob='"
                    + this.getDateOfBirth()
                    + "', nextcontactdatetime='"
                    +this.getNextContactDateTime()
                    + "', phonenumber='"
                    + this.escapeSpecialCharacters(this.getOccContactNo())
                    + "', lastupdated='"
                    + this.getLastUpdated()
                    + "' WHERE id="
                    + this.getParticipantId();
            this.sqlExecuteUpdate(sql);
        } else {
            sql = "INSERT INTO participant (firstname, middlename, lastname, referencenumber, studyid, gender, participantstatusid, comments,dob,nextcontactdatetime,phonenumber,emailaddress,lastupdated) "
                    + "VALUES ('"
                    + this.escapeSpecialCharacters(this.getFirstName())
                    + "', '"
                    + this.escapeSpecialCharacters(this.getMiddleName())
                    + "', '"
                    + this.escapeSpecialCharacters(this.getLastName())
                    + "', '"
                    + this.escapeSpecialCharacters(this.getReferenceNumber())
                    + "', "
                    + this.getStudyId()
                    + ", '"
                    + this.escapeSpecialCharacters(this.getGender())
                    + "', "
                    + this.getStatusId()
                    + ",'"
                    + this.escapeSpecialCharacters(this.getComments())
                    + "', '"
                    + this.getDateOfBirth()
                    + "', '"
                    + this.getNextContactDateTime()
                    + "', '"
                    + this.escapeSpecialCharacters(this.getOccContactNo())
                    + "', '"
                    + this.getLastUpdated()
                    + "')";
            this.setId(this.sqlExecuteInsert(sql).toString());
        }
    }*/
	@Override
	public String getName() {		
		return this.getParticipantRefnum();
	}

	public boolean isAtAssessmentStage() throws Exception {
		boolean retValue = false;
		if(this.getJobHistories(JobHistoryStatus.TOBEREVIEWED,"").size()>0){
			retValue = false;
    	}else if(this.getJobHistories(JobHistoryStatus.TOBEINTERVIEWED,"").size()>0){
    		retValue = false;
    	}else if(this.getStatusId().equalsIgnoreCase(ParticipantStatus.READYFORASSESSMENT)){
			retValue = true;
        } else if(this.getStatusId().equalsIgnoreCase(ParticipantStatus.ASSESSMENTCOMPLETE)){
        	retValue = true;
        } else if(this.getStatusId().equalsIgnoreCase(ParticipantStatus.ASSESSMENTINCOMPLETE)){
        	retValue = true;
        } 
		return retValue;
	}
/*	public String getDuplicateReferenceNumber(String referenceNumber) throws Exception{
    	String id = "";
    	String strSQL = "SELECT participantnamesview.referencenumber, COUNT(participantnamesview.referencenumber) AS numocc " +
			" FROM participantnamesview WHERE participantnamesview.studyid="+this.getStudyId()+" GROUP BY participantnamesview.referencenumber  HAVING COUNT(participantnamesview.referencenumber) >1 AND participantnamesview.referencenumber='"+referenceNumber+"'";
	    ResultSet rs = null;
	    try {
	        rs = this.sqlExecuteSelect(strSQL);
	        if (rs != null) {
	            if (rs.next()) {
	                id = rs.getString("referencenumber");
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
    	return id;
    }*/

/*	public ArrayList<Reminder> getReminders() throws Exception{
		ArrayList<Reminder> reminders = new ArrayList<Reminder>();
		if(this.getParticipantId()!=0){
			String strSQL = "SELECT id FROM reminders WHERE participantid = " + this.getParticipantId() + " ORDER BY issued_on";
			ResultSet rs = null;
			try {
				rs = this.sqlExecuteSelect(strSQL);
				if (rs != null) {
					if (rs != null) {
						while (rs.next()) {
							Reminder reminder = new Reminder();
							reminder.setId(rs.getString("id"));
							reminders.add(reminder);
						}
						if (rs.getStatement() != null) {
							rs.getStatement().close();
						}
						rs.close();
					}
				}
			} catch (SQLException e) {
				throw new Exception(e.getMessage());
			} finally {
				this.closeConnection();
			}
			for(Reminder reminder: reminders){
				reminder.getPersistantObject();
			}
		}		
		return reminders;
	}*/
/*	public void copyDeIdentifiedIntoSubStudy(Study subStudy) throws Exception {
		this.getPersistantObject();
		List<JobHistory> jhs = this.getJobHistories();
		for(JobHistory jh: jhs){
			for(Interview interview: jh.getInterviews()){
				interview.getInterviewAnswers();
			}
		}
		
		this.setFirstName("Firstname");
		this.setMiddleName("");
		this.setLastName("Lastname");
        this.setId("");
        this.setParticipantId(new Long(0));
        this.setStudyId(subStudy.getId());
        this.save();
				
		for(JobHistory jh: jhs){
			jh.setParticipantId(String.valueOf(this.getParticipantId()));
            jh.setId("");
			jh.save();
			for(Interview interview: jh.getInterviews()){
				interview.setJobHistoryId(jh.getId());
				interview.setId("");
				interview.save();
				for(InterviewAnswer answer:interview.getInterviewAnswers()){
					answer.setJsmInterviewId(interview.getId());
					answer.setId("");
					answer.save();
				}
			}   
		}		
	}*/
	
/*	public void copy(Study copyStudy) throws Exception {
		this.getPersistantObject();
		Participant copyParticipant = new Participant();

        copyParticipant.setFirstName(this.getFirstName());
        copyParticipant.setMiddleName(this.getMiddleName());
        copyParticipant.setLastName(this.getLastName());
        copyParticipant.setGender(this.getGender());
        copyParticipant.setReferenceNumber(this.getReferenceNumber());
        copyParticipant.setStudyId(copyStudy.getId());

        copyParticipant.setComments(this.getComments());
        copyParticipant.setDateOfBirth(this.getDateOfBirth());
        copyParticipant.setStatusId(ParticipantStatus.READYFORINTERVIEW);
        copyParticipant.save();
				
		for(JobHistory jh: this.getJobHistories()){
			JobHistory copyJobJistory = new JobHistory();
            copyJobJistory.setAge(jh.getAge());
            copyJobJistory.setPriority(jh.getPriority());
            copyJobJistory.setYearStarted(jh.getYearStarted());
            copyJobJistory.setDurationYears(jh.getDurationYears());
            copyJobJistory.setEmployer(jh.getEmployer());
            copyJobJistory.setParticipantId(String.valueOf(copyParticipant.getParticipantId()));
            JobSpecificModule jsm = new JobSpecificModule(jh.getFinalJSMId());
            if(jsm.exists()){
            	copyJobJistory.setFinalJSMId(jsm.getId());
            }else{
            	copyParticipant.setStatusId(ParticipantStatus.TOBEREVIEWED);
            	copyParticipant.save();
            }
           
            copyJobJistory.setHoursPerWeek(jh.getHoursPerWeek());
            copyJobJistory.setWeeksPerYear(jh.getWeeksPerYear());
            copyJobJistory.setSuburb(jh.getSuburb());
            copyJobJistory.setState(jh.getState());
            copyJobJistory.setCountry(jh.getCountry());
            copyJobJistory.setDescription(jh.getDescription());
            copyJobJistory.setComments(jh.getComments());
            copyJobJistory.setJobDescription(jh.getJobDescription());

            copyJobJistory.setReferenceNumber(jh.getReferenceNumber());         
            copyJobJistory.update();
            //get job histories tasks
            for(JobHistoryTask jht:jh.getJobHistorytasks()){
            	JobHistoryTask copyJobTask = new JobHistoryTask();
                copyJobTask.setName(jht.getName());
                copyJobTask.setDescription(jht.getDescription());
                copyJobTask.setJobHistoryId(copyJobJistory.getId());
                copyJobTask.update();
            }               

	        FrozenJobSpecificModule fjsm = jsm.getFrozenJSM(copyStudy.getId());
	        if(fjsm!=null){
	        	FrozenJobSpecificModule copyfjsm = jsm.getFrozenJSM(copyStudy.getId()); 
	        	
	        	Interview interview = new Interview();
		        interview.setJobHistoryId(copyJobJistory.getId());
		        interview.setFrozenJsmId(copyfjsm.getId());
		        interview.setStatus(Interview.STARTED);
		        interview.save();  
		        fjsm.getFullQuestions();
		        Question oldQ = fjsm.getQuestions().get(0);
		        oldQ.setInterviewID(jh.getCurrentInterview().getId());	
		        Question newQ = copyfjsm.getQuestions().get(0);
		        newQ.setInterviewID(interview.getId());
		        this.copyQuestionAnswers(newQ,oldQ);
		  
		        copyJobJistory.setStatusId(jh.getStatusId());
	        	copyJobJistory.update();
	        	copyParticipant.setStatusId(ParticipantStatus.READYFORASSESSMENT);
	        	copyParticipant.save();
	        }else{
	        	copyJobJistory.setStatusId(jh.getStatusId());
	        	copyJobJistory.update();
	        }
		}		
	}*/
	
/*	private void copyQuestionAnswers(Question newQ, Question oldQ) throws Exception {
		for(PossibleAnswer pa: oldQ.getAnswers()){
			int i = newQ.getPossibleAnswers().indexOf(pa);
			PossibleAnswer newAnswer = newQ.getPossibleAnswers().get(i);
			if(newAnswer.isNumber()){
				newAnswer.setDescription(pa.getDescription());
			}
			newQ.saveAnswer(newAnswer);
		}				
		String nextQId = newQ.getNextInterviewQuestionID();
		String nextOldQId = oldQ.getNextInterviewQuestionID();
		if((!(nextQId.equalsIgnoreCase("")))&&(!(nextOldQId.equalsIgnoreCase("")))){
			Question nextQ = new Question("",nextQId);
			nextQ.setInterviewID(newQ.getInterviewID());
			Question nextOldQ = new Question("",nextOldQId);
			nextOldQ.setInterviewID(oldQ.getInterviewID());
			this.copyQuestionAnswers(nextQ,nextOldQ);
		}
	}*/

	public Integer getJobHistoriesCount() {
		if(jobHistoriesCount==null){
			jobHistoriesCount = new Integer(0);
		}
		return jobHistoriesCount;
	}

	public void setJobHistoriesCount(Integer jobHistoriesCount) {
		this.jobHistoriesCount = jobHistoriesCount;
	}

	public void setInitials(String initials) {
		this.initials = initials;
	}

	public boolean isTranscriptSent() {
		return transcriptSent;
	}

	public void setTranscriptSent(boolean transcriptSent) {
		this.transcriptSent = transcriptSent;
	}



/*	public String getParticipantProgressId() {
		if(this.participantProgressId != null){
			if(this.participantProgressId.equalsIgnoreCase("")){
				this.participantProgressId = "1";
			}
		}			
		return participantProgressId;
	}

	public void setParticipantProgressId(String participantProgressId) {
		this.participantProgressId = participantProgressId;
	}

	public void updateParticipantProgress(ParticipantProgress.ParticipantContactProgress progressId) throws Exception {  
        String sql;
        java.sql.PreparedStatement pst;
        try {
            connect();         
            sql = "UPDATE participant SET participantprogressid= ? WHERE id=?";
            pst = getConnection().prepareStatement(sql);
            pst.setString(1, progressId.value());
            pst.setLong(2, this.getParticipantId());           
            pst.executeUpdate();
            pst.close();
        } finally {
            closeConnection();
        }
	}*/

/*	public boolean getNewsletter() {
		return newsletter;
	}

	public void setNewsletter(boolean newsletter) {
		this.newsletter = newsletter;
	}

	public boolean getDnaResults() {
		return dnaResults;
	}

	public void setDnaResults(boolean dnaResults) {
		this.dnaResults = dnaResults;
	}

	public String getLpnot() {
		return lpnot;
	}

	public void setLpnot(String lpnot) {
		this.lpnot = lpnot;
	}

	public String getRec_type() {
		return rec_type;
	}

	public void setRec_type(String rec_type) {
		this.rec_type = rec_type;
	}

	public String getRoot() {
		return root;
	}

	public void setRoot(String root) {
		this.root = root;
	}

	public List<ParticipantInfo> getParticipantInfo() {
		return participantInfo;
	}

	public void setParticipantInfo(List<ParticipantInfo> participantInfo) {
		this.participantInfo = participantInfo;
	}

	public boolean hasFfJobHistory() throws Exception{
		for (JobHistory jh : this.getJobHistories()) {
			jh.getAdditionalJHData(this.getJobHistories().size());
			if(jh.frequentFlyerStatus().equals("True")){
				return true;
			}
		}
		return false;
	}

	public String getCecupn() {
		return cecupn;
	}

	public void setCecupn(String cecupn) {
		this.cecupn = cecupn;
	}*/
}
