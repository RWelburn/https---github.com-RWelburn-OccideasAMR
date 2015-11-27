/**
 * Version:
 *     $Id: Exporter.java,v 1.29 2009/05/01 02:23:54 troy.sadkowsky Exp $
 *
 * Revisions:
 *     $Log: Exporter.java,v $
 *     Revision 1.29  2009/05/01 02:23:54  troy.sadkowsky
 *     updates for more error handles on export and import
 *
 *     Revision 1.28  2009/04/02 04:33:19  ray.welburn
 *     import and export of controls from excel
 *
 *     Revision 1.27  2009/03/28 02:06:26  ray.welburn
 *     import and export of controls from excel
 *
 *     Revision 1.26  2009/03/11 08:21:42  ray.welburn
 *     remove unused code
 *
 *     Revision 1.25  2009/02/15 06:04:59  ray.welburn
 *     Add export XML
 *
 *     Revision 1.24  2008/10/20 05:27:36  Troy.Sadkowsky
 *     fix conncetion close
 *
 *     Revision 1.23  2008/09/02 23:30:43  Troy.Sadkowsky
 *     removed old code and enhanced jsm exporter
 *
 *     Revision 1.22  2008/08/13 04:32:50  troy.sadkowsky
 *     cleaned up insert update functions
 *
 *     Revision 1.21  2008/08/02 06:16:56  troy.sadkowsky
 *     removed jess and reworked rules and ajsms
 *
 *     Revision 1.20  2008/06/29 23:26:35  troy.sadkowsky
 *     fixed sequencing on export
 *
 *     Revision 1.19  2008/06/11 00:38:03  troy.sadkowsky
 *     refactor insert and updates
 *
 *     Revision 1.18  2008/05/10 07:40:25  troy.sadkowsky
 *     updates for export JSMs
 *
 *     Revision 1.17  2008/04/22 23:22:23  troy.sadkowsky
 *     don't export invalid rules
 *
 *     Revision 1.16  2008/04/15 22:58:41  troy.sadkowsky
 *     only export valid rules
 *
 *     Revision 1.15  2008/03/24 23:21:03  troy.sadkowsky
 *     no crossed facts
 *
 *     Revision 1.14  2008/02/25 04:21:48  troy.sadkowsky
 *     new export function
 *
 *     Revision 1.13  2008/01/15 12:15:29  troy.sadkowsky
 *     fix ajsm ids
 *
 *     Revision 1.12  2007/11/23 06:31:34  troy.sadkowsky
 *     functions for generating testing data
 *
 *     Revision 1.11  2007/11/12 03:05:51  Troy.Sadkowsky
 *     fixed missing keywords
 *
 *     Revision 1.10  2007/10/25 23:57:57  troy.sadkowsky
 *     removed old code and removed share conn on updates and selects
 *
 *     Revision 1.9  2007/10/25 03:49:32  troy.sadkowsky
 *     update for transfer rule functino
 *
 *     Revision 1.8  2007/10/22 04:06:01  troy.sadkowsky
 *     export rules functions
 *
 *     Revision 1.7  2007/10/18 23:10:24  troy.sadkowsky
 *     new import functions
 *
 *     Revision 1.6  2007/07/19 22:21:31  troy.sadkowsky
 *     rmeoved references to windows c path so app will work on linux os
 *
 *     Revision 1.5  2007/05/11 04:17:15  jeff.keys
 *     export JSMs
 *
 *     Revision 1.4  2007/05/10 13:53:40  jeff.keys
 *     export JSMs
 *
 *     Revision 1.3  2007/05/08 01:20:19  jeff.keys
 *     Display export jsm
 *
 *     Revision 1.2  2006/11/24 23:03:51  admin
 *     updates before demo
 *
 *     Revision 1.1  2006/06/30 05:55:14  administrator
 *     updates for rework
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
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.researchit.Agent;
import com.researchit.JobHistory;
import com.researchit.JobSpecificModule;
//import com.researchit.JobTitle;
//import com.researchit.Keyword;
import com.researchit.PossibleAnswer;
import com.researchit.Question;
import com.researchit.common.Address;
import com.researchit.common.Participant;
import com.researchit.common.Study;
//import com.researchit.common.Study;
import com.researchit.expert.ExpertAgent;
import com.researchit.expert.ExpertFact;
import com.researchit.expert.ExpertFactRequirement;
import com.researchit.expert.ExpertRule;
//import com.researchit.html.MasterQuestionList;
import com.researchit.reports.ParticipantContactReport;
import com.researchit.reports.ParticipantDonationsReport;
import com.researchit.reports.ParticipantDonationsXMLExport;
import com.researchit.reports.ParticipantXMLExport;
import com.thoughtworks.xstream.XStream;

/**
 * @author troyS
 * 
 */
public class Exporter {

	private String errors = "";
	private String fromDate = "2000-01-01";
	private String toDate = "2020-01-01";
	public String getFromDate() {
		return fromDate;
	}

	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}

	public String getToDate() {
		return toDate;
	}

	public void setToDate(String toDate) {
		this.toDate = toDate;
	}

	public String getErrors() {
		return errors;
	}

	public void setErrors(String errors) {
		this.errors = errors;
	}

	/**
	 * 
	 */
	public Exporter() {
		super();
	}

	public String exportJSMAsXML(JobSpecificModule jsm, String fileLocation) throws Exception  {

		jsm.getFullQuestions();
		jsm.getAgents();
		jsm.getPossibleAnswers();
		//jsm.getJobs();
		for (Question q :jsm.getQuestions()){
			if (q.getPossibleAnswers().size() !=0){
				disconnectAnswers(q.getPossibleAnswers());
			}
			q.getAgents();
			for (Agent ea : q.getAgents()){
				ea.connection = null;
			}
			q.connection = null;
		}
		for (Agent a : jsm.getAgents()){
			a.connection = null;
		}
		ArrayList<ExpertRule> rules = jsm.getRules();
		//ArrayList<ExpertRule> filteredValidRules = new ArrayList<ExpertRule>();
		for (ExpertRule er : rules){

			for (ExpertFact ef : er.getFacts()){
				for (ExpertFactRequirement efr : ef.getFactRequirements()){
					efr.connection = null;
				}
				ef.connection = null;
			}
			er.connection = null;
			//filteredValidRules.add(er);
		}
		//jsm.setRules(rules);
/*		for (JobTitle j : jsm.getJobs()){
			j.connection = null;
		}*/
		jsm.connection = null;

		XStream xs = new XStream();
		xs.alias("jsm", JobSpecificModule.class);
		String xml = xs.toXML(jsm);

		

        
		return xml;
	}

	private void disconnectAnswers(ArrayList<PossibleAnswer> pas) throws Exception{
		for (PossibleAnswer pa : pas){
			if (pa.getChildQuestions().size() != 0){
				disconnectQuestions(pa.getChildQuestions());
			}
			pa.connection = null;
		}
	}

	private void disconnectQuestions(ArrayList<Question> qs) throws Exception{
		for (Question q : qs){
			if (q.getPossibleAnswers().size() !=0){
				disconnectAnswers(q.getPossibleAnswers());
			}
			q.getAgents();
			for (Agent agent : q.getAgents()){
				agent.connection = null;
			}
			q.connection = null;
		}
	}

	public String exportJSM(JobSpecificModule jsm, String fileLocation) throws Exception  {
		String retVal = "";   	
		PrintWriter pr = new PrintWriter(new BufferedWriter(new FileWriter(fileLocation, false)));
		jsm.connect();
		jsm.getFullQuestions();
		for (Question q : jsm.getQuestions()) {
			this.printQuestion(q, pr, "");
		}
		jsm.closeConnection();
		pr.close();
		pr = null;       
		BufferedReader br =  new BufferedReader(new FileReader(fileLocation));
		String str=null;
		while((str=br.readLine())!=null)
		{
			retVal += str + "\r\n";		
		}
		try {
			File f = new File(fileLocation);
			f.delete();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			br.close();
		}
		return retVal;
	}

	private void printQuestion(Question q, PrintWriter pr, String strDots) throws Exception {
		strDots += ". ";

		String note = "";
		if (!(q.getNotes().trim().equalsIgnoreCase(""))) {
			note = "(note: " + q.getNotes() + ")";
		}
		String strAgentList = "";
		for (Agent agent : q.getAgents()) {
			strAgentList += " " + agent.getName() + ",";
		}
		if (q.getAgents().size() != 0) {
			strAgentList = strAgentList.substring(0, strAgentList.lastIndexOf(","));
		}
		pr.println(strDots + "{"+q.getName()+"}"+q.getDescription() + " (agent:" + strAgentList + ")" + note);

		ArrayList<PossibleAnswer> pas = q.getPossibleAnswers();
		if (pas.size() > 0) {
			strDots += ". ";
			for (PossibleAnswer pa : pas) {
				pr.println(strDots + pa.getDescription());
				for (Question childQ : pa.getChildQuestions()) {
					this.printQuestion(childQ, pr, strDots);
				}
			}
		}
	}
	private void recurse(String jsmId,Question q,PossibleAnswer pa,String strConn,String username,String pword) throws Exception{
		Connection conn = DriverManager.getConnection(strConn,username,pword);
		q.setId("");
		String oldQID = q.getJsmQuestionStructureID();
		if(!(q.existsAt(conn))){
			conn = DriverManager.getConnection(strConn,username,pword);
			q.export(conn);
		}		
		conn = DriverManager.getConnection(strConn,username,pword);
		q.setJsmStructureQuestionID("");
		q.linkToPossibleAnswerExport("",pa.getJsmQuestionPossibleAnswerStructureID(),jsmId,conn);
		String newQID = q.getJsmQuestionStructureID();
		q.setJsmStructureQuestionID(oldQID);
		for(Agent agent:q.getAgents()){
			conn = DriverManager.getConnection(strConn,username,pword);
			q.setJsmStructureQuestionID(newQID);
			q.insertAgentExport(agent,conn);
		}
		q.setJsmStructureQuestionID(oldQID);
		int iSeq = 0;
		for(PossibleAnswer cpa:q.getPossibleAnswers()){
			cpa.setId("");
			conn = DriverManager.getConnection(strConn,username,pword);
			if(!(cpa.existsAt(conn))){
				conn = DriverManager.getConnection(strConn,username,pword);
				cpa.export(conn);
			} 
			String oldPAID = cpa.getJsmQuestionPossibleAnswerStructureID();
			cpa.setJsmQuestionPossibleAnswerStructureID("");
			conn = DriverManager.getConnection(strConn,username,pword);
			cpa.linkToQuestion("",newQID,conn);				
			String newPAID = cpa.getJsmQuestionPossibleAnswerStructureID();
			cpa.setJsmQuestionPossibleAnswerStructureID(oldPAID);
			for(Question cq: cpa.getChildQuestions()){
				cpa.setJsmQuestionPossibleAnswerStructureID(newPAID);
				this.recurse(jsmId,cq,cpa,strConn,username,pword);
			}
			pa.setJsmQuestionPossibleAnswerStructureID(newPAID);
			pa.setSequence(String.valueOf(iSeq));
			conn = DriverManager.getConnection(strConn,username,pword);	
			pa.updateSequence(conn);
			iSeq++;
		}
	}
	public void exportFullJSM(String strConn,String username,String pword,JobSpecificModule jsm) throws Exception{
		String oldJSMId = jsm.getId();
		String newjsmId = "";
		newjsmId = this.exportJSM(strConn, username, pword,jsm);		
		//for(JobSpecificModule ajsm: jsm.getJSMAssociatedAJSMs()){
		//	jsmIds.add(this.exportJSM(strConn, username, pword,ajsm));	
		//}
		this.exportRules(strConn, username, pword,jsm.getAgents(),oldJSMId,newjsmId);
		setErrors("");
	}

	public String exportJSM(String strConn,String username,String pword,JobSpecificModule jsm) throws Exception{
		DriverManager.registerDriver(new com.mysql.jdbc.Driver());

		String oldID = jsm.getId();
		Connection conn = DriverManager.getConnection(strConn,username,pword);		
		jsm.insert(conn);		
		String newID = jsm.getId();
		jsm.setId(oldID);
		for(Question q: jsm.getQuestions()){
			q.setId("");
			conn = DriverManager.getConnection(strConn,username,pword);
			if(!(q.existsAt(conn))){
				conn = DriverManager.getConnection(strConn,username,pword);
				q.export(conn);
			}  				
			String oldQID = q.getJsmQuestionStructureID();
			conn = DriverManager.getConnection(strConn,username,pword);
			q.setJsmStructureQuestionID("");
			q.linkToJSMExport(newID,conn);
			String newQID = q.getJsmQuestionStructureID();	
			q.setJsmStructureQuestionID(oldQID);
			ArrayList<Agent> doneAgents = new ArrayList<Agent>();
			for(Agent agent:q.getAgents()){
				if(!(doneAgents.contains(agent))){
					conn = DriverManager.getConnection(strConn,username,pword);
					q.setJsmStructureQuestionID(newQID);
					q.insertAgentExport(agent,conn);
					doneAgents.add(agent);
				}				
			}
			if(q.isAssociateJSM()){
				String jsmID = "";
				String jsmName = q.getName().substring(
						q.getName().indexOf(":") + 1).trim();
				JobSpecificModule ajsm = new JobSpecificModule();
				ajsm.setName(jsmName);
				conn = DriverManager.getConnection(strConn,username,pword);
				if (ajsm.exists(conn)) {
					jsmID = ajsm.getId();
					conn = DriverManager.getConnection(strConn,username,pword);
					q.setJsmStructureQuestionID(newQID);
					q.exportRelinkAJSM(conn, jsmID);
				}				
			}
			q.setJsmStructureQuestionID(oldQID);
			int iSeq = 0;
			for(PossibleAnswer pa:q.getPossibleAnswers()){
				pa.setId("");
				conn = DriverManager.getConnection(strConn,username,pword);
				if(!(pa.existsAt(conn))){
					conn = DriverManager.getConnection(strConn,username,pword);
					pa.export(conn);
				}   					
				String oldPAID = pa.getJsmQuestionPossibleAnswerStructureID();
				conn = DriverManager.getConnection(strConn,username,pword);
				pa.setJsmQuestionPossibleAnswerStructureID("");
				pa.linkToQuestion("",newQID,conn);								
				String newPAID = pa.getJsmQuestionPossibleAnswerStructureID();
				pa.setJsmQuestionPossibleAnswerStructureID(oldPAID);
				for(Question cq: pa.getChildQuestions()){
					pa.setJsmQuestionPossibleAnswerStructureID(newPAID);
					this.recurse(newID,cq,pa,strConn,username,pword);
				}
				pa.setJsmQuestionPossibleAnswerStructureID(newPAID);
				pa.setSequence(String.valueOf(iSeq));
				conn = DriverManager.getConnection(strConn,username,pword);
				pa.updateSequence(conn);
				iSeq++;
			}
		} 
		jsm.setId(oldID);
/*		for(JobTitle jt:jsm.getJobs()){
			String oldJID = jt.getId();
			jt.setId("");
			conn = DriverManager.getConnection(strConn,username,pword);
			if(!(jt.existsAt(conn))){
				conn = DriverManager.getConnection(strConn,username,pword);
				jt.setJsmId(newID);
				jt.export(conn);
				String newJID = jt.getId();
				jt.setId(oldJID);
				for(Keyword kw:jt.getKeywords()){
					kw.setId("");
					conn = DriverManager.getConnection(strConn,username,pword);
					kw.setJobTitleId(newJID);
					if(!(kw.exists(conn))){
						conn = DriverManager.getConnection(strConn,username,pword);
						kw.insert(conn);
					}					
				}
			} 				
		}*/
		conn = DriverManager.getConnection(strConn,username,pword);		
		jsm.updateTimeStamp(conn);
		return newID;
	}
/*	public void exportJobTitles(String strConn,String username,String pword) throws SQLException, Exception {
		DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		JobTitle jtAll = new JobTitle();
		String sql = "SELECT id,name,description,jsmid FROM jobtitle ORDER BY name";
		for(JobTitle jt:jtAll.getJobTitlesWithJSMs(sql)){
			String oldJID = jt.getId();
			jt.setId("");
			String newJID = "";
			Connection conn = DriverManager.getConnection(strConn,username,pword);
			if(!(jt.existsAt(conn))){
				conn = DriverManager.getConnection(strConn,username,pword);
				//jt.setJsmId(newID);
				jt.export(conn);								
			} 
			newJID = jt.getId();
			jt.setId(oldJID);
			for(Keyword kw:jt.getKeywords()){
				kw.setId("");
				conn = DriverManager.getConnection(strConn,username,pword);
				kw.setJobTitleId(newJID);
				if(!(kw.exists(conn))){
					conn = DriverManager.getConnection(strConn,username,pword);
					kw.insert(conn);
				}					
			}
		}
	}*/

	public void exportRules(String strConn,String username,String pword,ArrayList<Agent> agents,String oldJSMId,String newJSMId) throws Exception{   	
		for(Agent a: agents){
			ExpertAgent ea = new ExpertAgent(a.getId());
			ArrayList<ExpertRule> rules = ea.getJSMRules(oldJSMId);
			//JobSpecificModule jsm = new JobSpecificModule(oldJSMId);
			//int i = 0;
			for(ExpertRule er:rules){ 		
				ArrayList<ExpertFact> newFacts = new ArrayList<ExpertFact>();
				int iType = Integer.parseInt(er.getLevelTypeId());
				if(iType<7){
					throw new Exception("Wrong rule: "+er.getFullDescription());
				}else{
					JobSpecificModule jsm = new JobSpecificModule(oldJSMId);
					if(er.isValid(jsm)){
						this.exportRule(er,strConn, username, pword,newFacts,newJSMId);
					}
					newFacts = new ArrayList<ExpertFact>();
				}
				//Thread.sleep(1000);	    		
				//i++;
			}
			//Thread.sleep(10000);
		}
	}
	/*
	public void fixFrequencyRules(String strConn,String username,String pword,String jsmId) throws Exception{
		Connection conn = DriverManager.getConnection(strConn,username,pword);
		JobSpecificModule jsm = new JobSpecificModule(jsmId,conn);
		//String sql = "SELECT id FROM jsm WHERE id = "+jsmId;
		//for(JobSpecificModule jsm:allJSMs.getJobSpecificModules(sql)){
			//Study study = new Study("5"); 
			for(Agent agent:jsm.getAgents()){
				ExpertAgent ea = new ExpertAgent(agent.getId());
		    	ArrayList<ExpertRule> rules = ea.getJSMRules(jsm.getId());
				for(ExpertRule er:rules){
					String freqWksQId = "";
					String freqHrsQId = "";					
					boolean bWksFound = false;
					boolean bHrsFound = false;
			        for (Question q: agent.getFreqQuestions(jsm.getId())) {  		        	     	
			        	if(q.getName().contains("weeks")){
			        		if(!(q.getParentQuestionID().equalsIgnoreCase(""))){
			    				//Question pq = new Question("",q.getParentQuestionID());	
			    				PossibleAnswer pa = new PossibleAnswer("",q.getParentID());
			    				for(PossibleAnswer rpa:er.getAnswers()){
			    					if(pa.getId().equalsIgnoreCase(rpa.getId())){
			    						//strName = pq.getName()+"="+pa.getName()+"_Weeks";
			    						freqWksQId = q.getJsmQuestionStructureID();
			    						bWksFound = true;
			    						break;
			    					}
			    				}  				
			    			}		        		
			        	} else if(q.getName().contains("hours")){
			        		if(!(q.getParentQuestionID().equalsIgnoreCase(""))){
			    				//Question pq = new Question("",q.getParentQuestionID());	
			    				PossibleAnswer pa = new PossibleAnswer("",q.getParentID());
			    				Question pq = new Question("",pa.getJsmQuestionStructureID());
			    				pa = new PossibleAnswer("",pq.getParentID());
			    				for(PossibleAnswer rpa:er.getAnswers()){
			    					if(pa.getId().equalsIgnoreCase(rpa.getId())){
			    						//strName = pq.getName()+"="+pa.getName()+"_Weeks";
			    						freqHrsQId = q.getJsmQuestionStructureID();
			    						bHrsFound = true;
			    						break;
			    					}
			    				}  				
			    			}		        		
			        	}
			        	if((bWksFound)&&(bHrsFound)){
			        		break;
			        	}
			        }
			        if(bWksFound){
			        	ExpertRule erf = er.getFrequencyWeeksRule();
						if (!(erf.getId().equalsIgnoreCase(""))) {
							erf.delete();
						}
						erf.setId("");
						erf.setTypeId(ExpertRule.TYPEFREQUENCYWEEKS);
						erf.setFrequencyWeeksQId(freqWksQId);
						erf.setAgentId(er.getAgentId());
						erf.setParentId(er.getId());
						erf.save();
			    	}
			        if(bHrsFound){
			        	ExpertRule erf = er.getFrequencyWeeksRule();
						if (!(erf.getId().equalsIgnoreCase(""))) {
							erf.delete();
						}
						erf.setId("");
						erf.setTypeId(ExpertRule.TYPEFREQUENCYHOURS);
						erf.setFrequencyHoursQId(freqHrsQId);
						erf.setAgentId(er.getAgentId());
						erf.setParentId(er.getId());
						erf.save();
			    	}
				}
			}			
		//}

	}
	 */
//	public Connection connect() throws Exception {
//	Connection conn = null;
//	if ((conn == null) || (conn.isClosed())) {
//	Context initCtx = new InitialContext();
//	DataSource ds = (DataSource) initCtx.lookup("java:comp/env/jdbc/OccIDEASDBCOM");      
//	conn = ds.getConnection(); 
//	if (conn.isClosed()) {
//	throw new Exception("Possibly Maxed out pool");
//	}
//	}
//	return conn;
//	}
	private void exportRule(ExpertRule er, String strConn, String username, String pword,ArrayList<ExpertFact> newFacts,String newjsmId) throws Exception {
		String oldRID = er.getId();
		Connection conn = DriverManager.getConnection(strConn,username,pword);
		//Connection conn = this.connect();
		String description = er.getFullDescription();
		er.setId("");	
		er.setJsmId(newjsmId);
		er.export(conn);
		conn.close();
		String newRID = er.getId();
		er.setId(oldRID);
		ArrayList<ExpertFact> facts = er.getFacts();
		facts.addAll(newFacts);
		for(ExpertFact ef:facts){
			String oldFID = ef.getId();
			conn = DriverManager.getConnection(strConn,username,pword);
//			conn = this.connect();			
			ef.export(conn);
			conn.close();
			String newFID = ef.getId();
			er.setId(newRID);
			conn = DriverManager.getConnection(strConn,username,pword);
//			conn = this.connect();			
			er.insertFactExport(ef,conn);
			conn.close();
			ef.setId(oldFID);
			for(ExpertFactRequirement efr: ef.getFactRequirements()){
				if(!(efr.getType().equalsIgnoreCase("JH"))){
					Question q = new Question(efr.getQuestionId());
					PossibleAnswer pa = new PossibleAnswer(efr.getAnswerId());       		    				
					efr.setFactId(newFID);				       		    				
					q.setId("");
					conn = DriverManager.getConnection(strConn,username,pword);
					//   		    	conn = this.connect();			
					if(!(q.existsAt(conn))){
						conn = DriverManager.getConnection(strConn,username,pword);
						//   			    	conn = this.connect();			
						q.setDescription(q.getName());
						q.export(conn);
					}
					conn.close();
					efr.setQuestionId(q.getId());       		    				
					pa.setId("");
					conn = DriverManager.getConnection(strConn,username,pword);
					//   		    	conn = this.connect();			
					if(!(pa.existsAt(conn))){
						conn = DriverManager.getConnection(strConn,username,pword);
						//   			    	conn = this.connect();			
						pa.export(conn);
					}
					conn.close();
					efr.setAnswerId(pa.getId());
					conn = DriverManager.getConnection(strConn,username,pword);
					//   		    	conn = this.connect();			
					efr.export(conn);
				}else{
					conn = DriverManager.getConnection(strConn,username,pword);
//					conn = this.connect();			
					efr.setFactId(newFID);	
					efr.insert(conn);
					conn.close();
				}  		    				
			}
		}
		er.setId(oldRID);
		if(!(er.getFrequencyHoursRule().getId().equalsIgnoreCase(""))){
			boolean bFoundQuestion = false;
			ExpertRule erFreqHours = er.getFrequencyHoursRule();
			Question qOld = new Question("",erFreqHours.getFrequencyHoursQId());
			if(!(qOld.getId().equalsIgnoreCase(""))){
				Question pQ = new Question("",qOld.getParentQuestionID());
				PossibleAnswer pa = new PossibleAnswer("",pQ.getParentID());
				Question ppQ = new Question("",pQ.getParentQuestionID()); 

				ppQ.setId("");
				conn = DriverManager.getConnection(strConn,username,pword);
				if(!(ppQ.existsAt(conn))){
					//throw new Exception("Problem with rule export "+description);
					setErrors(getErrors() + ("\nProblem Rule:"+description+":RID:"+er.getId()+":Issue:HoursQuestionIDNotFound:"+ppQ.getId()));
					conn.close();
					return;
				}
				conn.close();


				JobSpecificModule jsm = new JobSpecificModule();
				jsm.setId(newjsmId);
				pa.setId("");
				conn = DriverManager.getConnection(strConn,username,pword);				 			
				if(!(pa.existsAt(conn))){
					conn = DriverManager.getConnection(strConn,username,pword);
					pa.export(conn);
				}
				conn.close();
				conn = DriverManager.getConnection(strConn,username,pword);	
				Question qNew = jsm.getQuestion(ppQ.getId(),conn); 
				if(!(qNew.getName().equalsIgnoreCase(ppQ.getName()))){
					conn.close();
				}else{
					conn = DriverManager.getConnection(strConn,username,pword);	
					Question qFreqHours = qNew.getChildQuestionFrequencyHours(pa.getId(),conn);	
					conn.close();
					erFreqHours.setFrequencyHoursQId(qFreqHours.getJsmQuestionStructureID());
					erFreqHours.setParentId(newRID);
					erFreqHours.setJsmId(newjsmId);
					conn = DriverManager.getConnection(strConn,username,pword);	
					erFreqHours.export(conn);	
					conn.close();
					bFoundQuestion = true;
				}		
			}
			if(!(bFoundQuestion)){
				setErrors(getErrors() + ("\nProblem Rule:"+description+":RID:"+er.getId()+":Issue:HoursQuestionIDNotFound:"+qOld.getId()+":InJSM:"+newjsmId));
				conn.close();
				return;
			}		
		}

		if(!(er.getFrequencyWeeksRule().getId().equalsIgnoreCase(""))){
			boolean bFoundQuestion = false;
			ExpertRule erFreqWeeks = er.getFrequencyWeeksRule();
			Question qOld = new Question("",erFreqWeeks.getFrequencyWeeksQId());
			if(!(qOld.getId().equalsIgnoreCase(""))){
				PossibleAnswer pa = new PossibleAnswer("",qOld.getParentID());
				Question pQ = new Question("",qOld.getParentQuestionID());		
				pQ.setId("");
				conn = DriverManager.getConnection(strConn,username,pword);	
				if(!(pQ.existsAt(conn))){
					setErrors(getErrors() + ("\nProblem Rule:"+description+":RID:"+er.getId()+":Issue:WeeksQuestionIDNotFound:"+pQ.getId()+":InJSM:"+newjsmId));
					conn.close();
					return;
				}
				conn.close();
				JobSpecificModule jsm = new JobSpecificModule();
				jsm.setId(newjsmId);
				pa.setId("");
				conn = DriverManager.getConnection(strConn,username,pword);				 			
				if(!(pa.existsAt(conn))){
					conn = DriverManager.getConnection(strConn,username,pword);
					pa.export(conn);
				}
				conn.close();
				conn = DriverManager.getConnection(strConn,username,pword);	
				Question qNew = jsm.getQuestion(pQ.getId(),conn);
				if(!(qNew.getName().equalsIgnoreCase(pQ.getName()))){
					conn.close();
				}else{
					conn = DriverManager.getConnection(strConn,username,pword);	
					Question qFreqWeeks = qNew.getChildQuestionFrequencyWeeks(pa.getId(),conn);	
					conn.close();
					erFreqWeeks.setFrequencyWeeksQId(qFreqWeeks.getJsmQuestionStructureID());
					erFreqWeeks.setParentId(newRID);
					erFreqWeeks.setJsmId(newjsmId);
					conn = DriverManager.getConnection(strConn,username,pword);	
					erFreqWeeks.export(conn);
					conn.close();
					bFoundQuestion = true;
				}
			}
			if(!(bFoundQuestion)){
				setErrors(getErrors() + ("\nProblem Rule:"+description+":RID:"+er.getId()+":Issue:WeeksQuestionIDNotFound:"+qOld.getId()+":InJSM:"+newjsmId));
				conn.close();
				return;
			}
		}
		conn.close();
	}

	public File exportParticipantsToExcel(List<Participant> participants) throws Exception{
		File xmlFile;
		ParticipantContactReport report = new ParticipantContactReport();
		for (Participant p : participants){
			p = new Participant(p.getReferenceNumber());
			p.getPersistantAddresses();
			report.getParticipants().add(new ParticipantXMLExport(p));
		}

		XStream xs = new XStream();
		xs.alias("report", ParticipantContactReport.class);
		xs.alias("participant", ParticipantXMLExport.class);
		//Populate the xmlFile property for use by Excel export
		xmlFile = new File("xmlExportFile.xml");
		FileOutputStream fos = new FileOutputStream(xmlFile);
		fos.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n".getBytes());
		fos.write(xs.toXML(report).getBytes());
		fos.close();
		File excelFile = convertXMLToExcel(xmlFile, false);
		return excelFile;
	}

	@SuppressWarnings("rawtypes")
	public File exportParticipantsToExcel(List<Participant> participants, boolean showDonations) throws Exception{
		File xmlFile;
		Class clazzR;
		Class clazzP;
		Object report = null;
		XStream xs = new XStream();

		if (showDonations){
			clazzR = ParticipantDonationsReport.class;
			clazzP = ParticipantDonationsXMLExport.class;
			report = new ParticipantDonationsReport();
		}else{
			clazzR = ParticipantContactReport.class;
			clazzP = ParticipantXMLExport.class;
			report = new ParticipantContactReport();
		}
		xs.alias("report", clazzR);
		xs.alias("participant", clazzP);
		//ParticipantContactReport report = new ParticipantContactReport();
		for (Participant p : participants){
			p = new Participant(p.getReferenceNumber());
			p.getPersistantAddresses();
			((ParticipantContactReport)report).getParticipants().add(new ParticipantXMLExport(p));
		}

		//Populate the xmlFile property for use by Excel export
		xmlFile = new File("xmlExportFile.xml");
		FileOutputStream fos = new FileOutputStream(xmlFile);
		fos.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n".getBytes());
		fos.write(xs.toXML(report).getBytes());
		fos.close();
		File excelFile = convertXMLToExcel(xmlFile, showDonations);
		return excelFile;
	}
	
	public File exportDonationsToXml() throws Exception {
    	File xmlFile;
    	ParticipantDonationsReport report = new ParticipantDonationsReport();
    	report.setInvitedOnFrom(this.getFromDate());
    	report.setInvitedOnTo(this.getToDate());
    	report.loadDonationInformation();
    	XStream xs = new XStream();
    	
		xs.alias("report", ParticipantDonationsReport.class);
		xs.alias("participant", ParticipantDonationsXMLExport.class);


		//Populate the xmlFile property
		xmlFile = new File("xmlExportFile.xml");
		FileOutputStream fos = new FileOutputStream(xmlFile);
		fos.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n".getBytes());
		fos.write(xs.toXML(report).getBytes());
		fos.close();
		return xmlFile;
    }

    public File exportParticipantsToXml(ArrayList<ParticipantXMLExport> participants) throws Exception {
    	File xmlFile;
    	ParticipantContactReport report = new ParticipantContactReport();
    	report.setParticipants(participants);
    	XStream xs = new XStream();
    	
    	xs.alias("report", ParticipantContactReport.class);
    	xs.alias("participant", ParticipantXMLExport.class);
    	//Populate the xmlFile
    	xmlFile = new File("xmlExportFile.xml");
    	FileOutputStream fos = new FileOutputStream(xmlFile);
    	fos.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n".getBytes());
    	fos.write(xs.toXML(report).getBytes());
    	fos.close();
    	return xmlFile;
    }

	public File convertXMLToExcel(File xmlFile, boolean showDonations) {
		File excelFile = null;
		HSSFWorkbook wb;
		try{
			if(showDonations){
				wb = donationsExport(xmlFile);
			}else{
				wb = participantExport(xmlFile);
			}
			//Output to file 
			excelFile = new File("Participants.xls");
			FileOutputStream output=new FileOutputStream(excelFile);
			wb.write(output);
			output.flush();
			output.close();

		}
		catch (IOException e) {
			//To Do deal with IOException " + e.getMessage());
		} catch (ParserConfigurationException e) {
			//To Do deal with ParserConfigurationException " + e.getMessage());
		} catch (SAXException e) {
			//To Do deal with "SAXException " + e.getMessage());
		}

		return excelFile;
	}

	private HSSFWorkbook donationsExport(File xmlFile)  throws ParserConfigurationException, SAXException, IOException {
		HSSFWorkbook wb=new HSSFWorkbook();
		HSSFSheet spreadSheet=wb.createSheet("spreadSheet");

		HSSFRow row = spreadSheet.createRow(0);
		HSSFCell cell0 = row.createCell(0);
		HSSFRichTextString col0Title = new HSSFRichTextString("BCEES Number");
		cell0.setCellValue(col0Title);

		HSSFCell cell1 = row.createCell(1);
		HSSFRichTextString col1Title = new HSSFRichTextString("Invite Sent");
		cell1.setCellValue(col1Title);

		HSSFCell cell2 = row.createCell(2);
		HSSFRichTextString col2Title = new HSSFRichTextString("Consent Returned");
		cell2.setCellValue(col2Title);

		HSSFCell cell3 = row.createCell(3);
		HSSFRichTextString col3Title = new HSSFRichTextString("Days Between");
		cell3.setCellValue(col3Title);

		HSSFCell cell4 = row.createCell(4);
		HSSFRichTextString col4Title = new HSSFRichTextString("Donation (<31 days)");
		cell4.setCellValue(col4Title);


		DocumentBuilderFactory factory =DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document document = builder.parse(xmlFile);
		document.normalizeDocument();
		NodeList nodeList = document.getElementsByTagName("participant");
		HSSFRow dataRow = null;
		HSSFCell cell = null;
		Node node = null;
		for (int i = 0; i < nodeList.getLength(); i++) {
			dataRow = spreadSheet.createRow(i + 1);
			cell = dataRow.createCell(0);
			node = ((Element)(nodeList.item(i))).getElementsByTagName("participantNumber").item(0).getFirstChild();
			if (node != null){
				cell.setCellValue(new HSSFRichTextString(node.getNodeValue()));
			}

			cell = dataRow.createCell(1);
			node = ((Element)(nodeList.item(i))).getElementsByTagName("invitedOn").item(0).getFirstChild();
			if (node != null){
				cell.setCellValue(new HSSFRichTextString(node.getNodeValue()));
			}

			cell = dataRow.createCell(2);
			node = ((Element)(nodeList.item(i))).getElementsByTagName("respondedOn").item(0).getFirstChild();
			if (node != null){
				cell.setCellValue(new HSSFRichTextString(node.getNodeValue()));
			}

			cell = dataRow.createCell(3);
			node = ((Element)(nodeList.item(i))).getElementsByTagName("daysBetween").item(0).getFirstChild();
			if (node != null){
				cell.setCellValue(new HSSFRichTextString(node.getNodeValue()));
			}

			cell = dataRow.createCell(4);
			node = ((Element)(nodeList.item(i))).getElementsByTagName("donation").item(0).getFirstChild();
			if (node != null){
				cell.setCellValue(new HSSFRichTextString(node.getNodeValue()));
			}
		}


		return wb;
	}


	private HSSFWorkbook participantExport(File xmlFile) throws ParserConfigurationException, SAXException, IOException {
		HSSFWorkbook wb=new HSSFWorkbook();
		HSSFSheet spreadSheet=wb.createSheet("spreadSheet");

		HSSFCellStyle cellStyle=wb.createCellStyle();
		cellStyle.setBorderRight(HSSFCellStyle.BORDER_MEDIUM);
		cellStyle.setBorderTop(HSSFCellStyle.BORDER_MEDIUM);
		cellStyle.setBorderLeft(HSSFCellStyle.BORDER_MEDIUM);
		cellStyle.setBorderBottom(HSSFCellStyle.BORDER_MEDIUM);

		short blue= HSSFColor.BLUE.index;
		cellStyle.setRightBorderColor(blue);
//		Create header row
		HSSFRow row = spreadSheet.createRow(0);
		HSSFCell cell0 = row.createCell(0);
		HSSFRichTextString col0Title = new HSSFRichTextString("Participant Number");
		cell0.setCellValue(col0Title);

		HSSFCell cell1 = row.createCell(1);
		HSSFRichTextString col1Title = new HSSFRichTextString("First Name");
		cell1.setCellValue(col1Title);

		HSSFCell cell2 = row.createCell(2);
		HSSFRichTextString col2Title = new HSSFRichTextString("Second Name");
		cell2.setCellValue(col2Title);

		HSSFCell cell3 = row.createCell(3);
		HSSFRichTextString col3Title = new HSSFRichTextString("Last Name");
		cell3.setCellValue(col3Title);

		HSSFCell cell4 = row.createCell(4);
		HSSFRichTextString col4Title = new HSSFRichTextString("Phone");
		cell4.setCellValue(col4Title);

		HSSFCell cell5 = row.createCell(5);
		HSSFRichTextString col5Title = new HSSFRichTextString("Address");
		cell5.setCellValue(col5Title);

		HSSFCell cell6 = row.createCell(6);
		HSSFRichTextString col6Title = new HSSFRichTextString("Suburb");
		cell6.setCellValue(col6Title);

		HSSFCell cell7 = row.createCell(7);
		HSSFRichTextString col7Title = new HSSFRichTextString("Postcode");
		cell7.setCellValue(col7Title);

		HSSFCell cell8 = row.createCell(8);
		HSSFRichTextString col8Title = new HSSFRichTextString("State");
		cell8.setCellValue(col8Title);

		HSSFCell cell9 = row.createCell(9);
		HSSFRichTextString col9Title = new HSSFRichTextString("Study");
		cell9.setCellValue(col9Title);

		DocumentBuilderFactory factory =DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document document = builder.parse(xmlFile);
		document.normalizeDocument();
		NodeList nodeList = document.getElementsByTagName("participant");
		HSSFRow dataRow = null;
		HSSFCell cell = null;
		Node node = null;
		for (int i = 0; i < nodeList.getLength(); i++) {
			dataRow = spreadSheet.createRow(i + 1);
			cell = dataRow.createCell(0);
			node = ((Element)(nodeList.item(i))).getElementsByTagName("participantNumber").item(0).getFirstChild();
			if (node != null){
				cell.setCellValue(new HSSFRichTextString(node.getNodeValue()));
			}

			cell = dataRow.createCell(1);
			node = ((Element)(nodeList.item(i))).getElementsByTagName("firstName").item(0).getFirstChild();
			if (node != null){
				cell.setCellValue(new HSSFRichTextString(node.getNodeValue()));
			}

			cell = dataRow.createCell(2);
			node = ((Element)(nodeList.item(i))).getElementsByTagName("secondName").item(0).getFirstChild();
			if (node != null){
				cell.setCellValue(new HSSFRichTextString(node.getNodeValue()));
			}

			cell = dataRow.createCell(3);
			node = ((Element)(nodeList.item(i))).getElementsByTagName("lastName").item(0).getFirstChild();
			if (node != null){
				cell.setCellValue(new HSSFRichTextString(node.getNodeValue()));
			}

			cell = dataRow.createCell(4);
			node = ((Element)(nodeList.item(i))).getElementsByTagName("phone").item(0).getFirstChild();
			if (node != null){
				cell.setCellValue(new HSSFRichTextString(node.getNodeValue()));
			}

			cell = dataRow.createCell(5);
			node = ((Element)(nodeList.item(i))).getElementsByTagName("address").item(0).getFirstChild();
			if (node != null){
				cell.setCellValue(new HSSFRichTextString(node.getNodeValue()));
			}

			cell = dataRow.createCell(6);
			node = ((Element)(nodeList.item(i))).getElementsByTagName("suburb").item(0).getFirstChild();
			if (node != null){
				cell.setCellValue(new HSSFRichTextString(node.getNodeValue()));
			}

			cell = dataRow.createCell(7);
			node = ((Element)(nodeList.item(i))).getElementsByTagName("postcode").item(0).getFirstChild();
			if (node != null){
				cell.setCellValue(new HSSFRichTextString(node.getNodeValue()));
			}

			cell = dataRow.createCell(8);
			node = ((Element)(nodeList.item(i))).getElementsByTagName("state").item(0).getFirstChild();
			if (node != null){
				cell.setCellValue(new HSSFRichTextString(node.getNodeValue()));
			}

			cell = dataRow.createCell(9);
			node = ((Element)(nodeList.item(i))).getElementsByTagName("studyName").item(0).getFirstChild();
			if (node != null){
				cell.setCellValue(new HSSFRichTextString(node.getNodeValue()));
			}
		}
		return wb;
	}

	public void exportAllJSMs() throws Exception {
		JobSpecificModule jsms = new JobSpecificModule();
		for(JobSpecificModule jsm: jsms.getTemplateJSMs()){
			String jsmName = jsm.getName();
			jsmName = jsmName.replace("\"", "_");
			jsmName = jsmName.replace(".", "_");
			jsmName = jsmName.replace("/", "_");
			String path = "/home/occideas/Documents/workspaceMeso/OccIdeasLib/JSMs/";
			String xml = this.exportJSMAsXML(jsm, path);
			File outFile = new File(jsmName+".xml");
	        FileWriter out = new FileWriter(path+outFile);
	        out.write(xml);
	        out.close();
		}
		for(JobSpecificModule jsm: jsms.getTemplateAJSMs()){
			String jsmName = jsm.getName();
			jsmName = jsmName.replace("\"", "_");
			jsmName = jsmName.replace(".", "_");
			jsmName = jsmName.replace("/", "_");
			String path = "/home/occideas/Documents/workspaceMeso/OccIdeasLib/JSMs/";
			String xml = this.exportJSMAsXML(jsm, path);
			File outFile = new File(jsmName+".xml");
	        FileWriter out = new FileWriter(path+outFile);
	        out.write(xml);
	        out.close();
		}
	}
	
	public void exportAllParticipantHistoriesAsXML(Study study, String type) throws Exception{
		File exportFile = new File("/home/administrator/participantData.xml");
		if(exportFile.exists()){
			exportFile.delete();
		}
		FileWriter fileWriter = new FileWriter(exportFile);
		List<Participant> participants = study.getFullParticipants();
		String theFileContents = allParticipantsHistoryFormattedAsXml(participants, type);
		
		fileWriter.write(theFileContents);
		fileWriter.close();
	}
	
	public void exportParticipantHistory(Participant participant, String type) throws Exception{
		File exportFile = new File("/tmp/participantData.xml");
		if(exportFile.exists()){
			exportFile.delete();
		}
		FileWriter fileWriter = new FileWriter(exportFile);
		fileWriter.write(participantHistoryFormattedAsXml(participant, type));
		fileWriter.close();
	}
	
	private String allParticipantsHistoryFormattedAsXml(List<Participant> participants, String type) throws Exception{
		String formattedString = "";
		String newLine = "\n";
		formattedString += "<participants>";
		for (Participant participant : participants) {
			formattedString += participantHistoryFormattedAsXml(participant, type);
		}
		formattedString += newLine + "</participants> ";
		return formattedString;
	}
	
	private String jobHistoryFormattedAsXml(Participant participant) throws Exception{
		String formattedString = "";
		for (JobHistory job : participant.getJobHistories()) {
			formattedString += jobFormattedAsXml(job);
		}
		return formattedString;
	}
	
	private String jobFormattedAsXml(JobHistory jobHistory) {
		String formattedString = "";
		String newLine = "\n";
		formattedString +=  newLine + "<jobhistory>" + newLine;
		formattedString += "<refid>" + escapeSpecialCharacters(jobHistory.getReferenceNumber()) + "</refid>" + newLine;
		formattedString += "<from>" + escapeSpecialCharacters(jobHistory.getStartMonth() + "/" + jobHistory.getStartYear()) + "</from>" + newLine;
		formattedString += "<until>" + escapeSpecialCharacters(jobHistory.getFinishMonth() + "/" + jobHistory.getFinishYear()) + "</until>" + newLine;
		formattedString += "<employer>" + escapeSpecialCharacters(jobHistory.getEmployer()) + "</employer>" + newLine;
		formattedString += "<street>" + escapeSpecialCharacters(jobHistory.getStreet()) + "</street>" + newLine;
		formattedString += "<suburb>" + escapeSpecialCharacters(jobHistory.getSuburb()) + "</suburb>" + newLine;
		formattedString += "<state>" + escapeSpecialCharacters(jobHistory.getState()) + "</state>" + newLine;
		formattedString += "<country>" + escapeSpecialCharacters(jobHistory.getCountry()) + "</country>" + newLine;
		formattedString += "<title>" + escapeSpecialCharacters(jobHistory.getJobDescription()) + "</title>" + newLine;
		formattedString += "<mainproduct>" + escapeSpecialCharacters(jobHistory.getJobTitle()) + "</mainproduct>" + newLine;
		formattedString += "<hoursperweek>" + escapeSpecialCharacters(jobHistory.getHoursPerWeek()) + "</hoursperweek>" + newLine;
		formattedString += "</jobhistory>";
		return formattedString;
	}
	
	private String participantHistoryFormattedAsXml(Participant participant, String type) throws Exception{
		String formattedString = "";
		String newLine = "\n";
		formattedString +=  newLine + "<participant>" + newLine;
		formattedString += "<AMR_Ref_id>" + participant.getAmrRefId() + "</AMR_Ref_id>" + newLine;
		formattedString += "<referenceNumber>" + participant.getReferenceNumber() + "</referenceNumber>";
		formattedString += (type == "residential" || type == "both")?addressesFormattedAsXml(participant):"";
		formattedString += (type == "jobhistory" || type == "both")?jobHistoryFormattedAsXml(participant):"";
		formattedString += newLine + "</participant>";
		return formattedString;
	}
	
	private String addressesFormattedAsXml(Participant participant) throws Exception {
		String formattedString = "";
		String newLine = "\n";
		formattedString = newLine + "<addresses>";
		for (Address address : participant.getAddresses()) {
			formattedString += addressFormattedAsXml(address);
		}
		formattedString += "</addresses>";
		return formattedString;
	}
	
	
	private String addressFormattedAsXml(Address address) {
		
		String formattedString = "";
		String newLine = "\n";
		formattedString += newLine + "<address>" + newLine;
		formattedString += "<refid>" + escapeSpecialCharacters(address.getArea()) + "</refid>" + newLine;
		formattedString += "<country>" + escapeSpecialCharacters(address.getCountry()) + "</country>" + newLine;
		formattedString += "<street>" + escapeSpecialCharacters(address.getAddress()) + "</street>" + newLine;
		formattedString += "<suburb>" + escapeSpecialCharacters(address.getSuburb()) + "</suburb>" + newLine;
		formattedString += "<state>" + escapeSpecialCharacters(address.getState()) + "</state>" + newLine;
		formattedString += "<postcode>" + escapeSpecialCharacters(address.getPostCode()) + "</postcode>" + newLine;
		formattedString += "<from>" + escapeSpecialCharacters(address.getFromMonth() + "/" + address.getFromYear()) + "</from>" + newLine;
		formattedString += "<until>" + escapeSpecialCharacters(address.getToMonth() + "/" + address.getToYear()) + "</until>" + newLine;
		formattedString += "</address>";
		return formattedString;
	}
	protected String escapeSpecialCharacters(Object value) {
		String retValue = "";
		if(value==null){
			retValue = "NULL";
		} else if(value.getClass()==String.class){
			if((value==null)||(((String)value).equalsIgnoreCase(""))){
				retValue = "NULL";
			}else{
				retValue = ((String)value).replace("&","&amp;");
				retValue = retValue.replace("'","&apos;");
				retValue = retValue.replace("\"","&quot;");
				retValue = retValue.replace("<","&lt;");
				retValue = retValue.replace(">","&gt;");
			}		
		} else {
			retValue = String.valueOf(value);
		}
		
		return retValue;
	}
}



















