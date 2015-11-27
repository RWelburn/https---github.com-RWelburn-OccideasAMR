/**
 * Version:
 *     $Id: Importer.java,v 1.57 2009/05/12 04:11:39 troy.sadkowsky Exp $
 *
 * Revisions:
 *     $Log: Importer.java,v $
 *     Revision 1.57  2009/05/12 04:11:39  troy.sadkowsky
 *     more error handling
 *
 *     Revision 1.56  2009/05/11 03:31:48  ray.welburn
 *     break on empty row
 *
 *     Revision 1.55  2009/05/11 02:28:15  ray.welburn
 *     Various fixes for participant progress
 *
 *     Revision 1.54  2009/05/08 05:49:49  ray.welburn
 *     upload from excel error trapping
 *
 *     Revision 1.53  2009/05/05 03:09:16  troy.sadkowsky
 *     updates for more error handles on export and import
 *
 *     Revision 1.52  2009/05/01 02:23:54  troy.sadkowsky
 *     updates for more error handles on export and import
 *
 *     Revision 1.51  2009/04/06 04:00:15  troy.sadkowsky
 *     updates for progress
 *
 *     Revision 1.50  2009/04/02 04:34:28  ray.welburn
 *     import and export of controls from excel
 *
 *     Revision 1.49  2009/03/28 02:06:22  ray.welburn
 *     import and export of controls from excel
 *
 *     Revision 1.48  2009/02/23 05:58:52  troy.sadkowsky
 *     default value to stop exceptions
 *
 *     Revision 1.47  2009/02/18 20:24:39  ray.welburn
 *     Now imports frequency questions correctly from XML
 *
 *     Revision 1.46  2009/02/16 02:00:37  troy.sadkowsky
 *     bug fix for duplicate fact rquirements
 *
 *     Revision 1.45  2009/02/15 06:04:58  ray.welburn
 *     Add export XML
 *
 *     Revision 1.44  2008/12/17 06:39:16  ray.welburn
 *     Change study note import to just upload the file to database
 *
 *     Revision 1.43  2008/08/25 01:37:30  ray.welburn
 *     Updates to use single dbobject and participant status table
 *
 *     Revision 1.42  2008/08/13 04:32:50  troy.sadkowsky
 *     cleaned up insert update functions
 *
 *     Revision 1.41  2008/08/11 01:51:15  ray.welburn
 *     move study object to common package
 *
 *     Revision 1.40  2008/06/11 00:38:03  troy.sadkowsky
 *     refactor insert and updates
 *
 *     Revision 1.39  2008/05/29 04:12:11  ray.welburn
 *     participant last updated applied to all participant changes
 *
 *     Revision 1.38  2007/10/25 23:57:57  troy.sadkowsky
 *     removed old code and removed share conn on updates and selects
 *
 *     Revision 1.37  2007/09/03 00:39:32  troy.sadkowsky
 *     updates for aug 24th meeting
 *
 *     Revision 1.36  2007/08/02 09:10:08  troy.sadkowsky
 *     import rett participants
 *
 *     Revision 1.35  2007/08/02 00:36:02  ray.welburn
 *     Remove spaces from import filename
 *
 *     Revision 1.34  2007/07/24 22:43:27  troy.sadkowsky
 *     error on import jsm with a-jsm link
 *
 *     Revision 1.33  2007/07/19 22:21:30  troy.sadkowsky
 *     rmeoved references to windows c path so app will work on linux os
 *
 *     Revision 1.32  2007/07/19 05:25:50  troy.sadkowsky
 *     tidy up code removed warnings
 *
 *     Revision 1.31  2007/06/17 03:48:00  Jeff.Keys
 *     clean up
 *
 *     Revision 1.30  2007/06/03 23:45:25  Troy.Sadkowsky
 *     conflict fixes
 *
 *     Revision 1.29  2007/06/03 23:19:51  Troy.Sadkowsky
 *     build 1.30 updates
 *
 *     Revision 1.28  2007/05/30 04:18:07  Jeff.Keys
 *     upload user manual
 *
 *     Revision 1.27  2007/05/22 08:52:45  Jeff.Keys
 *     clean up
 *
 *     Revision 1.26  2007/05/22 07:43:35  Troy.Sadkowsky
 *     update to be backwards compatible
 *
 *     Revision 1.25  2007/05/20 01:40:46  jeff.keys
 *     online user manual
 *
 *     Revision 1.24  2007/05/19 02:05:15  jeff.keys
 *     online user manual
 *
 *     Revision 1.23  2007/04/25 21:56:26  Troy.Sadkowsky
 *     made dbobject sortable and removed old objects and functions
 *
 *     Revision 1.22  2007/04/23 14:36:25  troy.sadkowsky
 *     minor fixes
 *
 *     Revision 1.21  2007/04/10 13:06:04  Troy.Sadkowsky
 *     attached files
 *
 *     Revision 1.20  2007/04/09 07:35:45  jeff.keys
 *     Study Notes
 *
 *     Revision 1.19  2007/04/08 13:57:53  jeff.keys
 *     Study Notes
 *
 *     Revision 1.18  2007/04/08 09:20:02  jeff.keys
 *     Study Notes
 *
 *     Revision 1.17  2007/03/12 12:50:20  Troy.Sadkowsky
 *     reduced import size to 5
 *
 *     Revision 1.16  2007/02/28 13:06:08  Troy.Sadkowsky
 *     new admin import template jsms function
 *
 *     Revision 1.15  2007/02/28 05:28:28  Troy.Sadkowsky
 *     build v1.16 updates
 *
 *     Revision 1.14  2007/02/20 03:13:39  troy
 *     importer will now generate values for the missing weeks per year
 *
 *     Revision 1.13  2007/02/19 21:52:43  troy
 *     Decision tree view
 *
 *     Revision 1.12  2007/02/07 23:21:27  troy
 *     further development on level rules
 *
 *     Revision 1.11  2007/01/08 12:45:45  Administrator
 *     version 14 updates
 *
 *     Revision 1.10  2006/12/12 13:44:34  admin
 *     build v1.13
 *
 *     Revision 1.9  2006/11/24 23:03:51  admin
 *     updates before demo
 *
 *     Revision 1.8  2006/11/03 07:23:23  admin
 *     changed question types
 *
 *     Revision 1.7  2006/08/23 22:35:27  admin
 *     last study import
 *
 *     Revision 1.6  2006/07/27 23:20:05  admin
 *     version 1.02
 *
 *     Revision 1.5  2006/07/25 05:29:05  admin
 *     new import functions
 *
 *     Revision 1.4  2006/07/22 04:56:36  admin
 *     new jobhistory changes
 *
 *     Revision 1.3  2006/06/15 05:16:23  administrator
 *     restructure progress
 *
 *     Revision 1.2  2006/06/14 06:59:09  administrator
 *     updates for rework
 *
 *     Revision 1.1  2006/06/07 07:07:27  administrator
 *     updates for rework
 *
 *     Revision 1.6  2006/06/05 02:22:08  administrator
 *     restructure progress
 *
 *     Revision 1.5  2006/05/30 23:45:44  administrator
 *     restructure progress
 *
 *     Revision 1.4  2006/05/26 06:57:37  administrator
 *     updates for rework
 *
 *     Revision 1.3  2006/05/24 06:01:22  administrator
 *     updates for rework
 *
 *     Revision 1.2  2006/05/23 23:22:13  administrator
 *     restructure progress
 *
 *     Revision 1.1  2006/05/22 06:06:01  administrator
 *     Version 2
 *
 *     
 */
package com.researchit.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
//import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Random;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import com.researchit.Agent;
import com.researchit.JobHistory;
//import com.researchit.JobHistoryTask;
import com.researchit.JobSpecificModule;
//import com.researchit.JobTitle;
//import com.researchit.Keyword;
import com.researchit.ParticipantStatus;
import com.researchit.PossibleAnswer;
import com.researchit.Question;
import com.researchit.common.Participant;
import com.researchit.expert.ExpertFact;
import com.researchit.expert.ExpertFactRequirement;
import com.researchit.expert.ExpertRule;
import com.researchit.html.OccCalendar;
import com.researchit.util.Utility;
import com.thoughtworks.xstream.XStream;

/**
 * @author troyS
 * 
 */
public class Importer {

	ArrayList<Question> iDMapQuestions;
	ArrayList<Question> questionsList;
	public ArrayList<Question> getQuestionsList() {
		if(questionsList==null){
			questionsList = new ArrayList<Question>();
		}
		return questionsList;
	}

	public void setQuestionsList(ArrayList<Question> questionsList) {
		this.questionsList = questionsList;
	}

	public ArrayList<Question> getIDMapQuestions() {
		if(iDMapQuestions==null){
			iDMapQuestions = new ArrayList<Question>();
		}
		return iDMapQuestions;
	}

	public void setIDMapQuestions(ArrayList<Question> mapQuestions) {
		iDMapQuestions = mapQuestions;
	}

	/**
	 * 
	 */
	public Importer() {
		super();
	}
	
	public FileInputStream importParticipantsFromExcel(FileInputStream excelFis,int rowStart, int rowFinish, String participantType) throws Exception{
		FileInputStream xmlFis = null;
		File xmlFile = null;
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document document = builder.newDocument();
		Element reportElement = document.createElement("report");
		document.appendChild(reportElement);
		Element pElement = document.createElement("participants");
		reportElement.appendChild(pElement);
		
		HSSFWorkbook workbook = new HSSFWorkbook(excelFis);
		HSSFSheet spreadsheet = workbook.getSheetAt(0);
		
		//Create the xml elements and assign values by row from the spreadsheet
		Element participant = null;
		Element participantNumber;
		//Element cancerRegistryNumber;
		Element firstName;
		Element secondName;
		Element lastName;
		//Element phone;
		Element address;
		Element suburb;
		//Element postcode;
		//Element stage;
		
		Element errors = null;
		HSSFRow row;
		int iRowStart = 1;
		if(rowStart!=0){
			iRowStart = rowStart-1;
		}
		int iRowFinish = 0;
		if(rowFinish!=0){
			iRowFinish = rowFinish;
		}
		for (int i = iRowStart; i <= spreadsheet.getLastRowNum(); i++) {
			if(i==iRowFinish){
				break;
			}
			String errorText = "";
			//int emptyDataCells = 0;
			try{				
				row = spreadsheet.getRow(i);
				//Check to see if here is any data in the row and stop if not
				if(row.getCell(0).getRichStringCellValue().getString().equalsIgnoreCase("")){
					/*for (int n=1;n<10;n++){
						if(row.getCell(n).getRichStringCellValue().getString().equalsIgnoreCase("")){
							emptyDataCells ++;
						}
					}
					if (emptyDataCells == 9){break;}*/
					break;
				}				
				participant = document.createElement("participant");
				pElement.appendChild(participant);
				participantNumber = document.createElement("participantNumber");
				participant.appendChild(participantNumber);
				if(row.getCell(0)!=null){
					participantNumber.appendChild(document.createTextNode(row.getCell(0).getRichStringCellValue().getString()));
				}
				firstName = document.createElement("firstName");
				participant.appendChild(firstName);
				if(row.getCell(1)!=null){
				firstName.appendChild(document.createTextNode(row.getCell(1).getRichStringCellValue().getString()));
				}
				secondName = document.createElement("secondName");
				participant.appendChild(secondName);
				if(row.getCell(2)!=null){
				secondName.appendChild(document.createTextNode(row.getCell(2).getRichStringCellValue().getString()));
				}
				lastName = document.createElement("lastName");
				participant.appendChild(lastName);
				if(row.getCell(3)!=null){
				lastName.appendChild(document.createTextNode(row.getCell(3).getRichStringCellValue().getString()));
				}

//				phone = document.createElement("phone");
//				participant.appendChild(phone);
//				if(row.getCell(4)!=null){
//				phone.appendChild(document.createTextNode(row.getCell(4).getRichStringCellValue().getString()));
//				}			
				address = document.createElement("address");
				participant.appendChild(address);
				if(row.getCell(4)!=null){
				address.appendChild(document.createTextNode(row.getCell(4).getRichStringCellValue().getString()));
				}				
				suburb = document.createElement("suburb");
				participant.appendChild(suburb);
				if(row.getCell(5)!=null){
				suburb.appendChild(document.createTextNode(row.getCell(5).getRichStringCellValue().getString()));
				}				
/*				postcode = document.createElement("postcode");
				participant.appendChild(postcode);
				if(row.getCell(6)!=null){
				postcode.appendChild(document.createTextNode(row.getCell(6).getRichStringCellValue().getString()));
				}	*/		
//				stage = document.createElement("stage");
//				participant.appendChild(stage);
//				if(row.getCell(10)!=null){
//				stage.appendChild(document.createTextNode(row.getCell(10).getRichStringCellValue().getString()));
//				}
				
			}catch(Exception e){
				errorText = e.getMessage() + " - Line " + i;
			}
			errors = document.createElement("errors");
			participant.appendChild(errors);
			errors.appendChild(document.createTextNode(errorText));
		}
		//fix for jdk 1.5 and tomcat 5.0
		System.setProperty("javax.xml.transform.TransformerFactory", "com.sun.org.apache.xalan.internal.xsltc.trax.TransformerFactoryImpl");

		TransformerFactory tFactory = TransformerFactory.newInstance();
		Transformer transformer = tFactory.newTransformer();
		//Add indentation to output
		transformer.setOutputProperty(OutputKeys.INDENT, "yes");
		transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
		String tempPath = Utility.getTempPath();		
		xmlFile = new File(tempPath);				
		FileOutputStream fos = new FileOutputStream(xmlFile);
		DOMSource source = new DOMSource(document);
		StreamResult result = new StreamResult(fos);
		transformer.transform(source, result);	
		xmlFis = new FileInputStream(xmlFile);

		return xmlFis;
	}
	
	public FileInputStream importJobHistoriesFromExcel(FileInputStream excelFis) throws Exception{

		FileInputStream xmlFis = null;
		File xmlFile = null;
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document document = builder.newDocument();
		Element reportElement = document.createElement("report");
		document.appendChild(reportElement);
		Element participants = document.createElement("participants");
		reportElement.appendChild(participants);
		
		HSSFWorkbook workbook = new HSSFWorkbook(excelFis);
		HSSFSheet spreadsheet = workbook.getSheetAt(0);
		
		//Create the xml elements and assign values by row from the spreadsheet
		Element participant = null;
		Element job = null;
		Element participantNumber;
		Element jobHistory = null;
		Element jobTitle = null;
		Element errors = null;
		HSSFRow row;
		String currentParticipant = "";
		
		for (int i = 1; i <= spreadsheet.getLastRowNum(); i++) {
			String errorText = "";
			int emptyDataCells = 0;
			try{
				
			row = spreadsheet.getRow(i);
				if(row.getCell(0).getRichStringCellValue().getString().equalsIgnoreCase("")){
					for (int n=1;n<3;n++){
						if(row.getCell(n).getRichStringCellValue().getString().equalsIgnoreCase("")){
							emptyDataCells ++;
						}
					}
					if (emptyDataCells == 2){break;}
				}
			
				if (!currentParticipant.equals(row.getCell(0).getRichStringCellValue().getString())){
					currentParticipant = row.getCell(0).getRichStringCellValue().getString();

					participant = document.createElement("participant");
					participants.appendChild(participant);

					participantNumber = document.createElement("participantNumber");
					participant.appendChild(participantNumber);

					participantNumber.appendChild(document.createTextNode(currentParticipant));

					jobHistory = document.createElement("jobHistory");
					participant.appendChild(jobHistory);
					
					errors = document.createElement("errors");
					participant.appendChild(errors);

				}
				job = document.createElement("job");
				jobHistory.appendChild(job);

				jobTitle = document.createElement("jobTitle");
				job.appendChild(jobTitle);
				jobTitle.appendChild(document.createTextNode(row.getCell(1).getRichStringCellValue().getString()));


			}catch(Exception e){
				errorText = e.getMessage() + " - Line " + i;
			}
			
			errors.appendChild(document.createTextNode(errorText));
		}
		//fix for jdk 1.5 and tomcat 5.0
		System.setProperty("javax.xml.transform.TransformerFactory", "com.sun.org.apache.xalan.internal.xsltc.trax.TransformerFactoryImpl");

		TransformerFactory tFactory = TransformerFactory.newInstance();
		Transformer transformer = tFactory.newTransformer();
		//Add indentation to output
		transformer.setOutputProperty(OutputKeys.INDENT, "yes");
		transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");

		if(Utility.getOsName().equalsIgnoreCase("windows")){
			xmlFile = new File("C:\\xmlFile.xml");
		}else if(Utility.getOsName().equalsIgnoreCase("linux")){
			xmlFile = new File("/usr/share/tomcat5/temp/xmlFile.xml");
		} else {
			throw new Exception("Error getting OS name for finding correct temp path to put temp xml file");
		}
		
		FileOutputStream fos = new FileOutputStream(xmlFile);
		DOMSource source = new DOMSource(document);
		StreamResult result = new StreamResult(fos);
		transformer.transform(source, result);
	

		xmlFis = new FileInputStream(xmlFile);

		return xmlFis;
	}
	
	public void importParticipantsFromExcel(String excelODBCLink,String studyId){
		OccCalendar now = new OccCalendar();
		Connection conn;
		Statement s;
		try {
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			conn = DriverManager.getConnection("jdbc:odbc:"+excelODBCLink,"","");
			s = conn.createStatement();
			ResultSet rs = s.executeQuery("SELECT * from [Sheet2$] WHERE [username_mother] is not null");

			while (rs.next()) {
				String refnumber = rs.getString(String.valueOf("username_mother"));
				String dob = rs.getString(String.valueOf("child_DOB"));
				Participant p = new Participant();
				if(refnumber.contains("F")){
					p.setGender("Female");
				}else{
					p.setGender("Male");
				}
				p.setReferenceNumber(refnumber);
				p.setDateOfBirth(dob);
				p.setStatusId("NULL");
				p.setStudyId(studyId);
				p.setLastUpdated(now.getDatabaseFormatDateTime());
				p.save();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	public void importParticipants(Connection conn,String studyId) throws Exception{
		ResultSet rs = null;
		String sql = "USE OccIDEASV0_27; SELECT TOP 50 * FROM participant";
		try {
			Statement stmt = (Statement) conn.createStatement();
			if (stmt.execute(sql)) {
				rs = (ResultSet) stmt.getResultSet();
			}
			if (rs != null) {
				while (rs.next()) {
					Participant participant = new Participant();

					participant.setAutoRefNumber(studyId);
					participant.setFirstName(rs.getString("firstname"));
					participant.setMiddleName(rs.getString("middlename"));
					participant.setLastName(rs.getString("lastname"));
					participant.setGender(rs.getString("gender"));
					// participant.setReferenceNumber(rs.getString("referencenumber"));
					participant.setStudyId(studyId);

					participant.setComments(rs.getString("comments"));
					participant.setDateOfBirth(rs.getString("dob"));
					participant.setStatusId(ParticipantStatus.READYFORINTERVIEW);
					participant.save();
					//get job histories
					this.importJobHistories(String.valueOf(participant.getParticipantId()),rs.getString("id"),conn);

				}
				if (rs.getStatement() != null) {
					rs.getStatement().close();
				}
				rs.close();
			}
			stmt = (Statement) conn.createStatement();
			stmt.execute("USE OccIDEAS");
			stmt.close();
		} catch (SQLException e) {
			throw new Exception(e.getMessage());
		} finally {
			conn.close();
		}
	}

	private void importJobHistories(String newId, String id, Connection conn) throws Exception {
		OccCalendar now = new OccCalendar();
		ResultSet rs = null;
		String sql = "USE OccIDEASV0_27; SELECT * FROM jobhistoryView WHERE ParticipantID = "+id;

		Statement stmt = (Statement) conn.createStatement();
		if (stmt.execute(sql)) {
			rs = (ResultSet) stmt.getResultSet();
		}
		if (rs != null) {
			if (rs.next()) {
				JobHistory jh = new JobHistory();
				jh.setAge(rs.getInt("age"));
				jh.setPriority(rs.getInt("priority"));
				jh.setYearStarted(rs.getInt("yearstarted"));
				jh.setDurationYears(rs.getFloat("durationyears"));
				jh.setEmployer(rs.getString("employer"));
				jh.setParticipantId(newId);
				String jsmName = "Driver-New";
				JobSpecificModule jsm = new JobSpecificModule();
				jsm.setName(jsmName);
				if(jsm.exists()){
					jh.setFinalJSMId(jsm.getId());
				}else{
					Participant p = new Participant(Long.valueOf(newId));
					p.setStatusId(ParticipantStatus.TOBEREVIEWED);
					p.setLastUpdated(now.getDatabaseFormatDateTime());
					p.save();
				}


				jh.setHoursPerWeek(rs.getFloat("hoursperweek"));
				Random r = new Random();
				jh.setWeeksPerYear(r.nextInt(20)+30);
				jh.setSuburb(rs.getString("suburb"));
				jh.setState(rs.getString("state"));
				jh.setCountry("Australia");
				jh.setDescription(rs.getString("description"));
				jh.setComments(rs.getString("comments"));
				jh.setJobDescription(rs.getString("jobdescription"));

				jh.setReferenceNumber(rs.getString("occhisrefid"));         
				jh.update();
				//get job histories tasks
				//this.importJobHistoryTasks(jh.getId(),rs.getString("id"),conn);    
			}
			if (rs.getStatement() != null) {
				rs.getStatement().close();
			}
			rs.close();
		}
	}
/*	private void importJobHistoryTasks(String newId, String id, Connection conn) throws Exception {
		ResultSet rs = null;
		String sql = "USE OccIDEASV0_27; SELECT * FROM jobhistorytasks WHERE jobHistoryID = "+id;

		Statement stmt = (Statement) conn.createStatement();
		if (stmt.execute(sql)) {
			rs = (ResultSet) stmt.getResultSet();
		}
		if (rs != null) {
			while (rs.next()) {
				JobHistoryTask jt = new JobHistoryTask();
				jt.setName(rs.getString("name"));
				jt.setDescription(rs.getString("description"));
				jt.setJobHistoryId(newId);
				jt.update();
			}
			if (rs.getStatement() != null) {
				rs.getStatement().close();
			}
			rs.close();
		}
	}*/
//	public void importStudies(Connection conn) throws Exception{
//	ResultSet rs = null;
//	String sql = "USE OccIDEASV0_27; SELECT JobDescription,JsmDescription FROM JobTitleJSMView";
//	try {
//	Statement stmt = (Statement) conn.createStatement();
//	if (stmt.execute(sql)) {
//	rs = (ResultSet) stmt.getResultSet();
//	}
//	if (rs != null) {
//	while (rs.next()) {
//	JobTitle jt = new JobTitle();
//	jt.setName(rs.getString("JobDescription"));
//	JobSpecificModule jsm = new JobSpecificModule();
//	jsm.setName(rs.getString("JSMDescription"));
//	if(!(jsm.exists())){
//	jsm.save();
//	}
//	jt.setJsmId(jsm.getId());
//	jt.update(true);
//	}
//	if (rs.getStatement() != null) {
//	rs.getStatement().close();
//	}
//	rs.close();
//	}
//	} catch (SQLException e) {
//	throw new Exception(e.getMessage());
//	} finally {
//	conn.close();
//	}
//	}
	public void importXMLJSMFile(String filename) throws Exception {
		FileInputStream fs = new FileInputStream(filename);
		this.importXMLJSMFile(fs, filename);
		fs.close();
	}

	public void importXMLJSMFile(InputStream fis, String strFileName) throws Exception {
		XStream xstream = new XStream();
		JobSpecificModule jsm = new JobSpecificModule();
		xstream.alias("jsm", JobSpecificModule.class);

		JobSpecificModule jsmxml = (JobSpecificModule)xstream.fromXML(fis);
		jsm.setName("BLANK");
		jsm.save();
		jsmxml.setId(jsm.getId());
		jsmxml.save();
//		Process agents
		for (Agent agentxml : jsmxml.getAgents()){
			Agent agent = new Agent();
			agent.setName(agentxml.getName());
			agent.setDescription(agentxml.getDescription());
			agent.setParentID(agentxml.getParentID());
			if (!agent.exists()){
				agent.insert();
			}
		}
		
		
		ArrayList<Question> questions = jsmxml.getQuestions();
		ArrayList<PossibleAnswer> possibleanswers = jsmxml.getPossibleAnswers();
		for (Question qXML : questions){
			this.getQuestionsList().add(qXML);
			Question q = new Question();
			q.setName(qXML.getName());
			q.setDescription(qXML.getDescription());
			q.setTypeID(qXML.getTypeID());
			if (!q.exists()){
				q.insert();				
			}
			q.setOldQuestionID(qXML.getJsmQuestionStructureID());
			this.getIDMapQuestions().add(q);
			//q.setJsmID(jsm.getId());
			//q.setSequence(qXML.getSequence());
			q.setNotes(qXML.getNotes());
			q.setMultiple(qXML.isMultiple());
			q.setViewWithParent(qXML.isViewWithParent());
			//q.setAjsmId(qXML.getAjsmId());
			q.linkToJSM(jsm.getId());
			if (qXML.getPossibleAnswers().size() != 0){
				linkPossibleAnswers(qXML, q, q.getJsmID());
			}
			for (Agent eaXML : qXML.getAgents()){
    			Agent agent = new Agent();
    			agent.setName(eaXML.getName());
    			agent.setDescription(eaXML.getDescription());
    			agent.setParentID(eaXML.getParentID());
    			if (!agent.exists()){
    				agent.insert();
    			}
    			q.insertAgent(agent);
    		}
		}
		
		//Process rules
		Integer[][] iDMap = new Integer[2][1000];
		int count = 0;
//		ArrayList<Question> copyOfQuestionsList = this.getQuestionsList();
		for(ExpertRule erXML: jsmxml.getRules()){
			boolean bRuleOk = true;
			ExpertRule er = new ExpertRule();
			er.setName(erXML.getName());
			//er.setDescription(erXML.getDescription());
			String agentId = this.lookupAgentId(jsmxml, erXML.getAgentId());
			if(agentId.equalsIgnoreCase("")){
				continue;
			}
			er.setAgentId(agentId);
			
			er.setJsmId(jsm.getId());
			er.setLevelTypeId(erXML.getLevelTypeId());
			er.setTypeId(erXML.getTypeId());
			er.setWeight(erXML.getWeight());
			er.setSequence(erXML.getSequence());
			er.insert(null);
			//Create a mapping of oldID too newID
			iDMap[0][count] = Integer.valueOf(er.getId());
			iDMap[1][count] = Integer.valueOf(erXML.getId());
			count ++;
			for (ExpertFact efXML : erXML.getFacts()){
				ExpertFact ef = new ExpertFact();
				ef.setName(efXML.getName());
				ef.setDescription(efXML.getDescription());
				ef.insert();
				er.insertFact(ef, null);
				for (ExpertFactRequirement efrXML : efXML.getFactRequirements()){
					ExpertFactRequirement efr = new ExpertFactRequirement();
					efr.setFactId(ef.getId());
					efr.setType(efrXML.getType());
					efr.setJobHistoryAttribute(efrXML.getJobHistoryAttribute());
					efr.setJobHistoryValue(efrXML.getJobHistoryValue());
					efr.setCondition(efrXML.getCondition());
					if(!(efr.getType().equalsIgnoreCase("JH"))){
//							find the question
						Question qXML = new Question();
						for(Question q: this.getQuestionsList()){				
							if(q.getId().equalsIgnoreCase(efrXML.getQuestionId())){
								qXML.setName(q.getName());
								qXML.setDescription(q.getDescription());
								qXML.setMultiple(q.isMultiple());
								qXML.setNotes(q.getNotes());
								qXML.setSequence(q.getSequence());
								qXML.setTypeID(q.getTypeID());
								qXML.setViewWithParent(q.isViewWithParent());
								if(!(qXML.exists())){
									qXML.insert();
									bRuleOk = false;
								}
								break;
							}
						}	
						if(qXML.getId().equalsIgnoreCase("")){
							bRuleOk = false;
						}
						efr.setQuestionId(qXML.getId());//Set the id to the question in the new database that has the same name as the question in the XML database.															
						//find the possible answer
						PossibleAnswer paXML = new PossibleAnswer();
						for(PossibleAnswer pa: possibleanswers){
							if(pa.getId().equalsIgnoreCase(efrXML.getAnswerId())){
								paXML.setName(pa.getName());
								paXML.setDescription(pa.getDescription());
								paXML.setSequence(pa.getSequence());
								if(!(paXML.exists())){
									qXML.insert();
									bRuleOk = false;
								}
								break;
							}
						}
						if(paXML.getId().equalsIgnoreCase("")){
							bRuleOk = false;
						}
						efr.setAnswerId(paXML.getId());							
					}
					efr.insert();					
				}
			}
			if((!bRuleOk)){
			}
		}
		for(ExpertRule erXML: jsmxml.getRules()){//Add in parent ids to rules
			String ruleId = "";
			String parentId ="";
			if (erXML.getParentId() != null){
				for (int x=0; x<1000;x++){
					if(String.valueOf(iDMap[1][x]).equals(erXML.getId())){
						ruleId = String.valueOf(iDMap[0][x]);
					}
					if(String.valueOf(iDMap[1][x]).equals(erXML.getParentId())){
						parentId = String.valueOf(iDMap[0][x]);
					}
				}
				ExpertRule er = new ExpertRule(ruleId);
				er.setParentId(parentId);
				//add frequency values
				for(Question q: this.getIDMapQuestions()){
					if(q.getOldQuestionID().equalsIgnoreCase(erXML.getFrequencyHoursQId())){
						String fhoursQId = q.getJsmQuestionStructureID();
						er.setFrequencyHoursQId(fhoursQId);
						break;
					}
				}
				for(Question q: this.getIDMapQuestions()){
					if(q.getOldQuestionID().equalsIgnoreCase(erXML.getFrequencyWeeksQId())){
						String fweeksQId = q.getJsmQuestionStructureID();
						er.setFrequencyWeeksQId(fweeksQId);
						break;
					}
				}
				try{
					er.save();
				}catch(Exception e){
					//To Do deal with ERROR: Problem with this rule:"+er.getDescription());
//					To Do deal with ERROR: Old ID:"+erXML.getId());
				}				
			}
		}

//		for(ExpertRule erXML: jsmxml.getRules()){//Add in Frequency Rules to rules	
//			String ruleId = "";
//			if(!(erXML.getFrequencyHoursQId().equalsIgnoreCase("0"))){
//				for (int x=0; x<1000;x++){
//					if(String.valueOf(iDMap[1][x]).equals(erXML.getId())){
//						ruleId = String.valueOf(iDMap[0][x]);
//					}
//				}
//				ExpertRule er = new ExpertRule(ruleId);
//				String hoursQId = getFrequencyHoursQuestionId(erXML, jsm , er);
//				er.setFrequencyHoursQId(hoursQId);
//				er.save();
//			}
//			if(!(erXML.getFrequencyWeeksQId().equalsIgnoreCase("0"))){
//				for (int x=0; x<1000;x++){
//					if(String.valueOf(iDMap[1][x]).equals(erXML.getId())){
//						ruleId = String.valueOf(iDMap[0][x]);
//					}
//				}
//				ExpertRule er = new ExpertRule(ruleId);
//				er.setFrequencyWeeksQId(getFrequencyWeeksQuestionId(erXML, jsm , er));
//				er.save();
//			}
//		}

/*		for (JobTitle jobxml : jsmxml.getJobs()){
			JobTitle job = new JobTitle();
			job.setName(jobxml.getName());
			job.setDescription(jobxml.getDescription());
			job.setJsmId(jsm.getId());
			if (!job.exists()){
				job.insert();
			}
		}*/
	}

	public void linkPossibleAnswers(Question qXML, Question q, String jsmId) throws Exception {
		for (PossibleAnswer paXML : qXML.getPossibleAnswers()){
			PossibleAnswer pa = new PossibleAnswer();
			pa.setName(paXML.getName());
			pa.setDescription(paXML.getDescription());
			if (!pa.exists()){
				pa.insert();
			}
			pa.linkToQuestion(q.getId(), q.getJsmQuestionStructureID());
			if (paXML.getChildQuestions().size() != 0){
				linkQuestions(paXML, pa, jsmId);
			}
		}
	}

	public void linkQuestions(PossibleAnswer paXML, PossibleAnswer pa, String jsmId) throws Exception {
		for (Question qXML : paXML.getChildQuestions()){
			this.getQuestionsList().add(qXML);
			Question q = new Question();
			q.setName(qXML.getName());
			q.setDescription(qXML.getDescription());
			q.setTypeID(qXML.getTypeID());
			if (!q.exists()){
				q.insert();				
			}
			q.setOldQuestionID(qXML.getJsmQuestionStructureID());
			this.getIDMapQuestions().add(q);
			//q.setJsmID(jsm.getId());
			q.setSequence(qXML.getSequence());
			q.setNotes(qXML.getNotes());
			q.setMultiple(qXML.isMultiple());
			q.setViewWithParent(qXML.isViewWithParent());
			q.setAjsmId(qXML.getAjsmId());
			q.linkToPossibleAnswer(pa.getId(), pa.getJsmQuestionPossibleAnswerStructureID());
			
			//q.linkToJSM(jsmId);
			if (qXML.getPossibleAnswers().size() != 0){
				linkPossibleAnswers(qXML, q, jsmId);
			}
			for (Agent eaXML : qXML.getAgents()){
    			Agent agent = new Agent();
    			agent.setName(eaXML.getName());
    			agent.setDescription(eaXML.getDescription());
    			agent.setParentID(eaXML.getParentID());
    			if (!agent.exists()){
    			agent.insert();
    			}
    			q.insertAgent(agent);
/*    			for(ExpertRule erXML: eaXML.getRules()){
    				processRules(jsm, erXML);

    			}
*/
    		}
		}
	}


	public void importTextJSMFiles(String strFolder) throws Exception {
		String filename = "";
		try {
			File directory = new File(strFolder);
			String[] files = directory.list();
			if (files != null) {
				for (int i = 0; i < files.length; i++) {
					// Get filename of file or directory
					filename = files[i];
					File file = new File(strFolder + "\\" + filename);
					if (file.exists()) {
						if (file.canRead()) {
							FileInputStream fs = new FileInputStream(file);
							this.importTextJSMFile(fs, file.getName());
						}
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
//			To Do deal with Error on import for file: " + filename + e.getMessage());
			throw e;
		}
	}
	public void importXMLJSMFiles(String strFolder) throws Exception {
		String filename = "";
		try {
			File directory = new File(strFolder);
			String[] files = directory.list();
			if (files != null) {
				for (int i = 0; i < files.length; i++) {
					// Get filename of file or directory
					filename = files[i];
					if(filename.contains(".xml")){
						File file = new File(strFolder + "/" + filename);
						if (file.exists()) {
							if (file.canRead()) {
								FileInputStream fs = new FileInputStream(file);
								this.importXMLJSMFile(fs, file.getName());
							}
						}
					}				
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
//			To Do deal with Error on import for file: " + filename + e.getMessage());
			throw e;
		}
	}

	public void importTextJSMFile(String filename) throws Exception {
		FileInputStream fs = new FileInputStream(filename);
		this.importTextJSMFile(fs, filename);
		fs.close();
	}

	public void importTextJSMFile(InputStream fis, String strFileName) throws Exception {
		String filename = strFileName;
		String strDescription = "";
		String line = "";
		int lineNumber = 0;
		try {
			int iCurrentLevel = 2;
			strFileName = strFileName.substring(strFileName.lastIndexOf("\\") + 1);
			String strJSMName = "BLANK";
			//if (strFileName.contains(" ")) {
			strFileName.replace(" ", "_");
			//strJSMName = strFileName.substring(0, strFileName.indexOf("_"));
			//} else {
			strJSMName = strFileName.substring(0, strFileName.indexOf("."));
			//}
			JobSpecificModule jsm = new JobSpecificModule();
			jsm.setName(strJSMName);
			// check if an associate module
			if (strJSMName.startsWith("A-")) {
				jsm.setAssociateModule(true);
			}
			jsm.save();
			BufferedReader dis = new BufferedReader(new InputStreamReader(fis));
			int j = 0;
			Question currentq = new Question();
			PossibleAnswer answer = new PossibleAnswer();
			int iAnswerSequence = 0;
			for (line = dis.readLine(); line != null; line = dis.readLine()) {
				if (line.trim().length() <= 1) {
					continue;
				}
				int iExtrasStart = 0;
				int iAgentRuleStart = 0;
				int iNoteStart = 0;
				int iEndOfNumRef = 0;
				int iLevel = 0;
				String lineNoExtras = "";
				String strAgents = "";
				try {
					if (line.indexOf("(") != -1) {
						iExtrasStart = line.indexOf("(");
					}                    
					if (iExtrasStart != 0) {
						lineNoExtras = line.substring(0, iExtrasStart);
					} else {
						lineNoExtras = line;
					}
					// look for agent association					
					if (line.indexOf("(agent:") != -1) {
						iAgentRuleStart = line.indexOf("(agent:");
						strAgents = line.substring(line.indexOf("agent:") + 6);
					}
					// look for notes
					if (line.indexOf("(note:") != -1) {
						iNoteStart = line.indexOf("(note:");
					}
					for (j = 0; j < lineNoExtras.length(); j++) {
						char c = lineNoExtras.charAt(j);
						if (c == '.') {
							iLevel++;
							iEndOfNumRef = j;
						}
					}
				} catch (Exception iex) {
					throw new Exception("Problem extracting description " + iex.getMessage() + " On line: " + line);
				}
				strDescription = lineNoExtras.substring(iEndOfNumRef + 1).trim();

				if (iLevel == 1) {
					String strName = "Free Text";
					if(strDescription.contains("{")){
						strName = strDescription.substring(strDescription.indexOf("{")+1,strDescription.lastIndexOf("}"));
						strDescription = strDescription.substring(strDescription.lastIndexOf("}")+1);
					}               	
					currentq = new Question();
					currentq.setName(strName);
					if(currentq.getName().contains("JSM:")){
						currentq.setTypeID(Question.ASSOCIATEJSMLINK);
						iCurrentLevel = 3;
					}else{
						currentq.setTypeID(Question.PROBABILITY);
						iCurrentLevel = 2;
					}					
					currentq.setDescription(strDescription);   
					if(!(currentq.exists())){
						currentq.insert();      
					}                                                    
					currentq.setParentID(Question.ROOTPARENTID);
					currentq.linkToJSM(jsm.getId());                   
					// check for agents
					if (iAgentRuleStart != 0) {                        
						if (strAgents.length() > 1) {
							strAgents = strAgents.substring(0, strAgents.indexOf(")"));
							for (String strAgent : strAgents.split(",")) {
								Agent agent = new Agent();
								agent.setName(strAgent.replace(")", "").trim());
								agent.setDescription(strAgent.replace(")", "").trim());
								agent.insert();
								currentq.addAgent(agent);
							}
						}
					}
					if (iNoteStart != 0) {
						String strNotes = line.substring(line.indexOf("note:") + 5);
						strNotes = strNotes.substring(0, strNotes.indexOf(")"));
						currentq.setNotes(strNotes);
						currentq.setMultiple(true);
						currentq.updateNotes();
					}
				} else {
					// if the iLevel is even this is an answer
					if ((iLevel % 2) == 0) {
						if (iCurrentLevel > (iLevel)) {
							// set currentq back one question
							int l = (iCurrentLevel - iLevel) / 2;
							for (int k = 0; k < l; k++) {
								PossibleAnswer pa = new PossibleAnswer(null, currentq.getParentID());
								currentq = new Question("", pa.getJsmQuestionStructureID());
							}
						}
						iCurrentLevel = iLevel;
						answer = new PossibleAnswer();
						answer.setName(strDescription);
						answer.setDescription(strDescription);
						//answer.setSequence(String.valueOf(iAnswerSequence));
						if(!(answer.exists())){
							answer.insert();
						}                       
						answer.linkToQuestion(currentq.getId(), currentq.getJsmQuestionStructureID());
						iAnswerSequence++;
					} else { // this is a child question
						iAnswerSequence = 0;
						if (iCurrentLevel > (iLevel)) {
							// set possible answer back one question
							int l = ((iCurrentLevel + 1) - (iLevel)) / 2;
							for (int k = 0; k < l; k++) {
								Question q = new Question("", answer.getJsmQuestionStructureID());
								answer = new PossibleAnswer("", q.getParentID());
							}
						}
						String strName = "Free Text";
						if(strDescription.contains("{")){
							strName = strDescription.substring(strDescription.indexOf("{")+1,strDescription.lastIndexOf("}"));
							strDescription = strDescription.substring(strDescription.lastIndexOf("}")+1);
						}
						currentq = new Question();
						currentq.setName(strName);
						if(strName.contains("weeks a year")){
							currentq.setTypeID(Question.FREQUENCY);
							iCurrentLevel = iLevel;
						}else if(strName.contains("hours a week")){
							currentq.setTypeID(Question.FREQUENCY);
							iCurrentLevel = iLevel;
						}else if(currentq.getName().contains("JSM:")){
							currentq.setTypeID(Question.ASSOCIATEJSMLINK);
							iCurrentLevel = iLevel+1;
						}else{
							currentq.setTypeID(Question.PROBABILITY);
							iCurrentLevel = iLevel;
						}					
						currentq.setDescription(strDescription);
						if(!(currentq.exists())){
							currentq.insert();      
						}
						currentq.linkToPossibleAnswer(answer.getId(), answer.getJsmQuestionPossibleAnswerStructureID());
						// check for agents
						if (iAgentRuleStart != 0) {
							if (strAgents.length() > 1) {
								strAgents = strAgents.substring(0, strAgents.indexOf(")"));
								for (String strAgent : strAgents.split(",")) {
									Agent agent = new Agent();
									agent.setName(strAgent.replace(")", "").trim());
									agent.setDescription(strAgent.replace(")", "").trim());
									agent.insert();
									currentq.addAgent(agent);
								}
							}
						}
						if (iNoteStart != 0) {
							String strNotes = line.substring(line.indexOf("note:") + 5);
							strNotes = strNotes.substring(0, strNotes.indexOf(")"));
							currentq.setNotes(strNotes.trim());
							currentq.setMultiple(true);
							currentq.updateNotes();
						}
					}
				}
				lineNumber++;
				//Thread.sleep(1000);
			}
			jsm.closeConnection();
		} catch (Exception e) {
			throw new Exception("Error on import for file: "
					+ filename
					+ " at line: "
					+ lineNumber
					+ " Description: "
					+ line
					+ e.getMessage());
		}
	}

/*	public void importJobList(Connection conn) throws Exception {
		ResultSet rs = null;
		String sql = "USE OccIDEASV0_27; SELECT JobDescription,JsmDescription FROM JobTitleJSMView";
		try {
			Statement stmt = (Statement) conn.createStatement();
			if (stmt.execute(sql)) {
				rs = (ResultSet) stmt.getResultSet();
			}
			if (rs != null) {
				while (rs.next()) {
					JobTitle jt = new JobTitle();
					jt.setName(rs.getString("JobDescription"));
					JobSpecificModule jsm = new JobSpecificModule();
					jsm.setName(rs.getString("JSMDescription"));
					if(!(jsm.exists())){
						jsm.save();
					}
					jt.setJsmId(jsm.getId());
					jt.insert();
				}
				if (rs.getStatement() != null) {
					rs.getStatement().close();
				}
				rs.close();
			}
		} catch (SQLException e) {
			throw new Exception(e.getMessage());
		} finally {
			conn.close();
		}
	}*/

/*	public void importTextJobFile(String strLocation) throws Exception {
		String filename = "";
		try {

			File file = new File(strLocation + "\\" + filename);
			if (file.exists()) {
				if (file.canRead()) {

					FileReader fr = new FileReader(file);
					BufferedReader in = new BufferedReader(fr);
					for (String line = in.readLine(); line != null; line = in.readLine()) {
						if (line.trim().length() == 0) {
							continue;
						}
						String[] lineValues = line.split(",");
						int i = 0;
						JobSpecificModule jsm = new JobSpecificModule();
						JobTitle job = new JobTitle();
						for (String s : lineValues) {
							if (i == 0) {
								jsm = new JobSpecificModule();
								String strJSM = s;
								jsm.setDescription(strJSM);
								if (!(jsm.exists())) {
									jsm.save();
								}
							} else if (i == 1) {
								job = new JobTitle();
								s = s.trim();
								String jobName = s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
								job.setDescription(jobName.trim());
								job.setJsmId(jsm.getId());
								job.insert();
							} else if (i == 2) {
								job.removeKeywords();
								String[] tasks = s.split("!");
								for (String task : tasks) {
									Keyword jt = new Keyword();
									jt.setJobTitleId(job.getId());
									jt.setName(task.trim());
									jt.save();
								}
							}
							i++;
						}
					}
				}
			}
		} catch (Exception e) {
			throw new Exception("Error on import " + e.getMessage());
		}
	}*/
	private String lookupAgentId(JobSpecificModule jsmxml, String xmlAgentId) throws Exception {
		String agentName = "";
		for (Agent agent :jsmxml.getAgents()) {
			if (agent.getId().equals(xmlAgentId)){
				agentName = agent.getName();//find the agent in the jsm object with the same id as the agent we want
			}
		}
		Agent agent = new Agent();
		agent.setName(agentName);
		agent.exists();//Will find the agent in the new database and get its id
		if(agent.getId().equalsIgnoreCase("")){
			//System.out.println("Error finding agent " + xmlAgentId);
		}
		return agent.getId();
	}
//	private String getFrequencyHoursQuestionId(ExpertRule erXML, JobSpecificModule jsm, ExpertRule er) throws Exception {
//		String fQId = "0";
//		Question qXML = new Question("", erXML.getFrequencyHoursQId());
//		if(!(qXML.getId().equalsIgnoreCase(""))){
//			Question pQXML = new Question("",qXML.getParentQuestionID());
//			PossibleAnswer pa = new PossibleAnswer("",pQXML.getParentID());
//			Question ppQXML = new Question("",pQXML.getParentQuestionID()); 			
//			ppQXML.setId("");
//			if(!(ppQXML.existsAt(null))){
//				throw new Exception("Problem with rule export "+er.getName());
//			}
//			pa.setId("");
//			if(!(pa.existsAt(null))){
//				pa.export(null);
//			}
//			Question qNew = jsm.getQuestion(ppQXML.getId(),null); 
//			if(!(qNew.getName().equalsIgnoreCase(ppQXML.getName()))){
//				throw new Exception("Problem with rule export "+er.getName());
//			}else{
//				Question qFreqHours = qNew.getChildQuestionFrequencyHours(pa.getId(),null);	
//				fQId = qFreqHours.getJsmQuestionStructureID();
//			}		
//		}
//		
//		return fQId;
//	}
//	private String getFrequencyWeeksQuestionId(ExpertRule erXML, JobSpecificModule jsm, ExpertRule er) throws Exception {
//		String fQId = "0";
//		Question qXML = new Question("",erXML.getFrequencyWeeksQId());
//			if(!(qXML.getId().equalsIgnoreCase(""))){
//				Question pQXML = new Question("",qXML.getParentQuestionID());
//				PossibleAnswer pa = new PossibleAnswer("",qXML.getParentID());
//				pQXML.setId("");
//				if(!(pQXML.existsAt(null))){
//					throw new Exception("Problem with rule export "+er.getName());
//				}
//				pa.setId("");
//				if(!(pa.existsAt(null))){
//					pa.export(null);
//				}
//				Question qNew = jsm.getQuestion(pQXML.getId(),null); 
//				if(!(qNew.getName().equalsIgnoreCase(pQXML.getName()))){
//					throw new Exception("Problem with rule export "+er.getName());
//  			}else{
//					Question qFreqWeeks = qNew.getChildQuestionFrequencyWeeks(pa.getId(),null);	
//					fQId = qFreqWeeks.getJsmQuestionStructureID();
//				}		
//			}
//		return fQId;
//	}
}
