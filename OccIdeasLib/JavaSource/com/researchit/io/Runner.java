/**
 * Version:
 *     $Id: Runner.java,v 1.23 2009/01/21 08:45:52 troy.sadkowsky Exp $
 *
 * Revisions:
 *     $Log: Runner.java,v $
 *     Revision 1.23  2009/01/21 08:45:52  troy.sadkowsky
 *     remove misc functions
 *
 *     Revision 1.22  2008/09/02 23:30:43  Troy.Sadkowsky
 *     removed old code and enhanced jsm exporter
 *
 *     Revision 1.21  2008/06/29 23:27:24  troy.sadkowsky
 *     all combinations study
 *
 *     Revision 1.20  2008/03/13 03:27:59  troy.sadkowsky
 *     insert batch images
 *
 *     Revision 1.19  2008/02/15 04:00:22  troy.sadkowsky
 *     removed olf code, added data cleaning functions and ui updates
 *
 *     Revision 1.18  2008/01/15 12:15:30  troy.sadkowsky
 *     fix ajsm ids
 *
 *     Revision 1.17  2007/12/21 01:24:25  troy.sadkowsky
 *     fix for rule numbers
 *
 *     Revision 1.16  2007/12/04 01:43:23  troy.sadkowsky
 *     updates for rett jsms
 *
 *     Revision 1.15  2007/11/23 06:31:34  troy.sadkowsky
 *     functions for generating testing data
 *
 *     Revision 1.14  2007/10/25 03:49:54  troy.sadkowsky
 *     fix frequency rules
 *
 *     Revision 1.13  2007/10/22 04:06:02  troy.sadkowsky
 *     export rules functions
 *
 *     Revision 1.12  2007/10/18 23:10:24  troy.sadkowsky
 *     new import functions
 *
 *     Revision 1.11  2007/10/16 02:48:35  troy.sadkowsky
 *     test auto gen
 *
 *     Revision 1.10  2007/09/03 00:39:33  troy.sadkowsky
 *     updates for aug 24th meeting
 *
 *     Revision 1.9  2007/08/02 09:10:09  troy.sadkowsky
 *     import rett participants
 *
 *     Revision 1.8  2007/06/03 23:20:31  Troy.Sadkowsky
 *     agent auto associate with frequency qs
 *
 *     Revision 1.7  2007/01/08 12:45:45  Administrator
 *     version 14 updates
 *
 *     Revision 1.6  2006/10/10 23:53:19  admin
 *     fix for ajsms
 *
 *     Revision 1.5  2006/09/25 12:45:52  admin
 *     Iteration 28 changes
 *
 *     Revision 1.4  2006/07/28 04:30:20  admin
 *     fixed action buttons
 *
 *     Revision 1.3  2006/07/27 23:20:05  admin
 *     version 1.02
 *
 *     Revision 1.2  2006/07/25 05:29:05  admin
 *     new import functions
 *
 *     Revision 1.1  2006/07/22 04:56:36  admin
 *     new jobhistory changes
 *
 */

package com.researchit.io;

import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;

import javax.naming.NamingException;

import com.javaranch.unittest.helper.sql.pool.JNDIUnitTestHelper;
import com.researchit.Agent;
import com.researchit.JobSpecificModule;
import com.researchit.common.Participant;
import com.researchit.common.Study;

public class Runner {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NamingException 
	 */
	public static void main(String[] args) {
        try {
    		if(JNDIUnitTestHelper.notInitialized()){           
    			//JNDIUnitTestHelper.init("C:\\Storage\\Development\\OccIDEAS\\workspace\\OccIdeasV2\\JavaSource\\com\\researchit\\io\\occideasv0_27db.properties");
    			JNDIUnitTestHelper.init("C:\\Storage\\Development\\OccIDEAS\\workspace\\OccIdeas\\JavaSource\\com\\researchit\\io\\occideasalpha.properties");

    			//Context initCtx = new InitialContext();
                //DataSource ds = (DataSource) initCtx.lookup("java:comp/env/jdbc/OccIDEASV0_27DB");
                //Connection conn = ds.getConnection();               

                
                //Importer imp = new Importer();
                //imp.importParticipants(conn,"23");
                //imp.importParticipantsFromExcel("ParticipantsFromExcel","2");
                DataGenerator dg = new DataGenerator();
                Agent agent = new Agent();
                dg.generateRandomStudy("5test",agent.getAllAgents(),10);
                //dg.fixFrequencyRules();
    			//Exporter export = new Exporter();
    			//export.exportJSM("jdbc:mysql://localhost/troysadkowsky","user","root");
    			//export.exportRules("jdbc:mysql://localhost/troysadkowsky","user","root");
    			//export.exportJobTitles("jdbc:mysql://localhost/troysadkowsky","user","root");
    		}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Runner(){
		
	}
	public void fixAssociateModules() throws Exception{
		JobSpecificModule jsmObject = new JobSpecificModule();
		for(JobSpecificModule jsm: jsmObject.getJobSpecificModules("SELECT id FROM jsm")){
			if(jsm.getName().startsWith("A-")){
				jsm.setAssociateModule(true);
				jsm.save();
			}
		}
	}

	public void runMisc() throws SQLException, Exception {
		
		Importer importer = new Importer();
		String strFolder = "/home/occideas/Documents/workspaceMeso/OccIdeasLib/JSMs";
		importer.importXMLJSMFiles(strFolder);
		//Exporter exporter = new Exporter();
		//exporter.exportAllJSMs();
		
		/*
		Study study = new Study("10");
		String sql = "SELECT id, referencenumber, participantstatusid FROM participantnamesview WHERE referencenumber LIKE 'T%'";
		for(Participant p: study.listParticipantsFromParticipantNamesView(sql)){
			for(JobHistory jh: p.getJobHistories()){
				for(Assessment assessment: jh.getAssessments()){
					assessment.delete();
				}
//				for(Interview interview: jh.getInterviews()){
//					interview.
//				}
				jh.delete();
			}
			p.delete();
		}
		*/
	}
	public void autoSetConsentAndRespondDates(String studyId, String startDate) throws Exception{
		Study study = new Study(studyId);
		for(Participant p: study.filterParticipants("None")){
			String dt = startDate;  // Start date
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			c.setTime(sdf.parse(dt));
			Random random = new Random(); 
			int rdm = random.nextInt(20);
			c.add(Calendar.DATE, rdm);  // number of days to add
			dt = sdf.format(c.getTime());  // dt is now the new date
			Participant p1 = new Participant(p.getParticipantId());
			//p1.setRespondedOn(c.getTime());
			//p1.setConsented("yes");
			p1.save();
			
		}
	}
}
