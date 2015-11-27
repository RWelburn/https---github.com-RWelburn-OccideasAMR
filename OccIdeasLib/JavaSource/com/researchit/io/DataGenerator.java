package com.researchit.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import com.researchit.Agent;
import com.researchit.AgentExample;
import com.researchit.FrozenJobSpecificModule;
import com.researchit.Interview;
import com.researchit.JobHistory;
import com.researchit.JobHistoryStatus;
import com.researchit.JobSpecificModule;
//import com.researchit.JobTitle;
import com.researchit.common.Address;
import com.researchit.common.Participant;
import com.researchit.ParticipantStatus;
import com.researchit.PossibleAnswer;
import com.researchit.Question;
import com.researchit.StudyStatus;
import com.researchit.User;
import com.researchit.common.Study;
import com.researchit.expert.ExpertAgent;
import com.researchit.expert.ExpertRule;
import com.researchit.html.OccCalendar;

public class DataGenerator {
	public DataGenerator() {

    }
	/*
	public void fixFrequencyQuestionAgents(String jsmId,Connection conn) throws Exception{		
		Question q = new Question();
		String sql = "SELECT     jsmquestionstructure.questionid AS id, jsmquestionstructure.id AS linkedid, jsmquestionstructure.name, jsmquestionstructure.jsmid";
			sql +=" FROM         jsmquestionstructure INNER JOIN";
			sql +=" question ON jsmquestionstructure.questionid = question.id";
			sql +=" WHERE     (question.questiontypeid = 3) AND (jsmquestionstructure.jsmid = "+jsmId+")";
		for(Question tempQ: q.getStructureQuestions(sql,conn)){
			Question linkedQ = new Question(tempQ.getId(),tempQ.getJsmQuestionStructureID(),conn);
			Question pq = new Question("",linkedQ.getParentQuestionID(),conn);
			if(pq.getTypeID().equalsIgnoreCase(Question.FREQUENCY)){
				Question ppq = new Question("",pq.getParentQuestionID(),conn);
				for(Agent agent: ppq.getAgents()){
					linkedQ.addAgent(agent);
				}
			}else{
				for(Agent agent: pq.getAgents()){
					linkedQ.addAgent(agent);
				}
			}
		}		
	}
	*/
	public void fixRettAgents() throws Exception{
		Study study = new Study("2");
		for(JobSpecificModule jsm:study.getStudySpecificJsms()){
			Question qAll = new Question();
			String sql = "SELECT questionid as id, id AS linkedid,name, jsmid FROM  jsmquestionstructure WHERE (jsmid = "+jsm.getId()+")";
			for(Question question:qAll.getStructureQuestions(sql)){
				question.removeAllAgents();
				for(Agent agent:study.getAgents()){
					//if(!question.getAgents().contains(agent)){
						question.addAgent(agent);	
					//}					
				}
			}
		}
	}
	public void fixAgentExamples() throws Exception{
		Agent agentAll = new Agent();
		for(Agent agent:agentAll.getAllAgents()){
			String description = agent.getDescription();
			
			if(description.contains("High")){
				String examplesString = description.substring(description.lastIndexOf("High\r\n")+6);
				//examplesString = examplesString.substring(examplesString.lastIndexOf("\r\n"));
				String[] lines = examplesString.split("\n");
				for(String line:lines){
					String replacedDblTabs = line.replaceAll("\t\t","\t");
					String[] example = replacedDblTabs.split("\t");					
					try{
						String s0 = example[0];
						String s1 = example[1];
						String s2 = example[2];
						String s3 = example[3];
						AgentExample agentExample = new AgentExample(s0,Integer.parseInt(agent.getId()));	
						if(!(agentExample.getId().equalsIgnoreCase(""))){
							agentExample.delete();
						}
						
						if(!(s0.equalsIgnoreCase(""))){
							agentExample.saveObject();
							agentExample.setTlvLow(s1);
							agentExample.setTlvMed(s2);
							agentExample.setTlvHigh(s3);
							agentExample.saveObject();
						}					
					}catch(Exception e){
						
					}					
				}
			}
		}
	}
	public void fixAjsmIds() throws Exception{
		String sql = "SELECT name, id AS linkedid, questionid AS id, jsmid" +
				" FROM jsmquestionstructure WHERE (name LIKE '%JSM:%')";
		Question allqs = new Question();
		for(Question q: allqs.getStructureQuestions(sql)){
			q.setAjsmId(q.getAssociateJSMID());
			q.setTypeID(Question.ASSOCIATEJSMLINK);
			q.setDescription(q.getName());
			q.update();
		}
	}
	public void removeDuplicateRules() throws Exception{
		java.util.Date now = new java.util.Date();
		//System.out.println(now);
		ExpertAgent eaAll = new ExpertAgent();
		for(Agent a1:eaAll.getAllAgents()){
			ExpertAgent ea1 = new ExpertAgent(a1.getId());
			ArrayList<ExpertRule> array1 = ea1.getRules();
			ArrayList<ExpertRule> array2 = ea1.getRules();
			int iSize = array1.size();
			int iCount = 0;
			for(ExpertRule er1:array1){
				for(ExpertRule er2: array2){
					if(!(er1.equals(er2))){
						if(er2.sameAs(er1)){							
							//System.out.println(er1.getFullDescription());
							//System.out.println(er2.getFullDescription());
							er1.delete();
							break;
						}
					}				
				}
				iCount++;
				//System.out.println(iCount+" of "+iSize);
			}
		}
		//System.out.println(now);
	}
	public void removeDuplicateAgents() throws Exception{
		java.util.Date now = new java.util.Date();
		//System.out.println(now);
		Question qAll = new Question();
		int iQuestionCount = 0;
		ArrayList<Question> qs = qAll.getStructureQuestions("SELECT questionid as id, id as linkedid, name, jsmid FROM jsmquestionstructure");
		int iQuestionSize = qs.size();
		for(Question q:qs){
			ArrayList<Agent> agents1 = q.getAgents();
			ArrayList<Agent> agents2 = q.getAgents();
			int iSize = agents1.size();
			int iCount = 0;
			for(Agent a1:agents1){
				int iFound = 0;
				for(Agent a2: agents2){
					if(a1.equals(a2)){
						iFound++;
						if(iFound>1){
							JobSpecificModule jsm = new JobSpecificModule(q.getJsmID());
							if(!(jsm.getName().equalsIgnoreCase(""))){
								q = new Question(q.getId(),q.getJsmQuestionStructureID());
								//System.out.println(jsm.getName());
								if(!(q.getParentID().equalsIgnoreCase(""))){
									if(!(q.getParentID().equalsIgnoreCase("100"))){
										PossibleAnswer pa = new PossibleAnswer("",q.getParentID());
										//System.out.println(pa.getName());
									}
									
								}
								
								//System.out.println(q.getName());
								//System.out.println(a1.getName());
								
								q.removeAgent(a1);
							}
							
						}
					}				
				}
				
				iCount++;
				//System.out.println(iCount+" of "+iSize);
				
			}
			iQuestionCount++;
			//System.out.println(iQuestionCount+" of "+iQuestionSize);
		}
		//System.out.println(now);
	}
	public void fixRuleSequences() throws Exception{
		ExpertAgent eaAll = new ExpertAgent();
		JobSpecificModule jsmAll = new JobSpecificModule();
		String sql = "SELECT id FROM jsm WHERE jsmtypeid = 0";
		
			for(Agent a:eaAll.getAllAgents()){
				ExpertAgent ea = new ExpertAgent(a.getId());
				for(JobSpecificModule jsm:jsmAll.getJobSpecificModules(sql)){
					int iProbHigh = 1;
					int iProbMed = 1;
					int iProbLow = 1;
					int iProbUnknown = 1;
					int iPossUnknown = 1;
					for(ExpertRule er:ea.getJSMRules(jsm.getId())){
						if(er.getLevelTypeId().equalsIgnoreCase(ExpertRule.PROBABLEHIGH)){
							er.setSequence(iProbHigh);
							iProbHigh++;
						}else if(er.getLevelTypeId().equalsIgnoreCase(ExpertRule.PROBABLEMEDIUM)){
							er.setSequence(iProbMed);
							iProbMed++;
						}else if(er.getLevelTypeId().equalsIgnoreCase(ExpertRule.PROBABLELOW)){
							er.setSequence(iProbLow);
							iProbLow++;
						}else if(er.getLevelTypeId().equalsIgnoreCase(ExpertRule.PROBABLEUNKNOWN)){
							er.setSequence(iProbUnknown);
							iProbUnknown++;
						}else if(er.getLevelTypeId().equalsIgnoreCase(ExpertRule.POSSIBLEUNKNOWN)){
							er.setSequence(iPossUnknown);
							iPossUnknown++;
						}else{
							continue;
						}
						er.save();
					}
				}
			}	
	}
	public void fixAssociateModules() throws Exception{
		JobSpecificModule jsm = new JobSpecificModule();
		for(JobSpecificModule jsm1:jsm.getTemplateJSMs()){
			for(Question q:jsm1.getQuestions()){
				if(q.isAssociateJSM()){
					q.setId("");
					q.setName(q.getDescription());
					if(q.exists()){
	                    q.update();
	                }else{
	                    q.insert();
	                    q.relink();
	                }
				}
			}
		}
	}
	public void generateInterviews(Study study,int iParticipants) throws Exception{
		ArrayList<String> names = this.getRandomNames();
		int i=0;
		//iParticipants = 100;
		for(i=0;i<iParticipants;i++){
			//Thread.sleep(1000);
			Random r = new Random();
			Participant p = new Participant();
			p.setAutoRefNumber(study.getId());
			p.setStudyId(study.getId());						
			int iFirstname = r.nextInt(100);
			int iLastname = r.nextInt(100);
			p.setFirstName(names.get(iFirstname));
			p.setLastName(names.get(iLastname));
			//p.setSourceId("1");
			//p.setClassId("1");
			ArrayList<Address> addresses = new ArrayList<Address>();
			Address address = new Address();
			address.setHomePhone("(+11)1-1111-1111");
			p.setOccContactNo("(+11)1-1111-1111");
			addresses.add(address);
			p.setAddresses(addresses);
			p.setStatusId(ParticipantStatus.READYFORINTERVIEW);
			int iYearStarted = r.nextInt(100)+1900;
			p.setDateOfBirth(r.nextInt(28)+"/"+r.nextInt(12)+"/"+iYearStarted);
			String[] gender = new String[2];
			gender[0] = "Male";
			gender[1] = "Female";
			int iGender = r.nextInt(2);
			p.setGender(gender[iGender]);
			p.save();
			int iJHs = r.nextInt(10);
//			int iJHs = r.nextInt(1);
			String lastJSM = "";
			boolean bToBeReviewed = false;
			//if(false){							
			for(int j=0;j<(iJHs+1);j++){
	//			if(true){
	//				break;
	//			}
				
				JobHistory jh = new JobHistory();
	            jh.setParticipantId(String.valueOf(p.getParticipantId()));
	            jh.setReferenceNumber("RNDM"+(j+1));
	            jh.setAge(r.nextInt(50)+15);	            
	            jh.setYearStarted(iYearStarted+20);
	            jh.setHoursPerWeek(r.nextInt(40));
	            jh.setWeeksPerYear(r.nextInt(52));
	            //randomly choose next status
	            String statusId = JobHistoryStatus.TOBEINTERVIEWED;
	            if(j==0){
            		statusId = JobHistoryStatus.TOBEINTERVIEWED;
            	}else{
		            int iRandomStatus = r.nextInt(100);
		            if(iRandomStatus < 40){
		            	statusId = JobHistoryStatus.TOBEINTERVIEWED;
		            }else if(iRandomStatus > 40 && iRandomStatus < 50){
		            	statusId = JobHistoryStatus.NOTTOBEINTERVIEWEDSCOPE; 
		            	jh.setJobDescription("Out of scope");	   
		            }else if(iRandomStatus > 50 && iRandomStatus < 60){
		            	statusId = JobHistoryStatus.NOTTOBEINTERVIEWEDNOJSM; 
		            	jh.setJobDescription("In scope - no valid jsm");
		            }else if(iRandomStatus > 60 && iRandomStatus < 70){
		            	statusId = JobHistoryStatus.UNEXPOSEDJOB; 
		            	jh.setJobDescription("Unexposed");
		            }else if(iRandomStatus > 70 && iRandomStatus < 90){
		            	statusId = JobHistoryStatus.NOTTOBEINTERVIEWEDTIME; 
		            	jh.setJobDescription("In scope - valid jsm, but no interview to save time");
		            }else if(iRandomStatus > 90 && iRandomStatus < 100){
		            	statusId = JobHistoryStatus.TOBEREVIEWED; 
		            	
		            }   
            	}
	            jh.setStatusId(statusId);
	            if(jh.getStatusId().equalsIgnoreCase(JobHistoryStatus.TOBEINTERVIEWED)){	            	
//	            	set final jsm
		            study.setJsms(null);
		            int iJSMSize = study.getStudySpecificJsms().size();
		            int iJSM = r.nextInt(iJSMSize);
		            JobSpecificModule jsm = study.getStudySpecificJsms().get(iJSM);
		            //int iJobs = jsm.getJobs().size();
		            /*if(iJobs>0){
		            	int iJt = r.nextInt(iJobs-1);
		            	JobTitle jt = jsm.getJobs().get(iJt);
		            	jh.setJobDescription(jt.getName());	            	
		            }else{*/
		            	jh.setJobDescription(jsm.getName());	    
		            //}		            
		            jh.setFinalJSMId(jsm.getId());
		            lastJSM = jsm.getId();
		            jh.setParticipantId(String.valueOf(p.getParticipantId()));
		            jh.setPriority(j+1);
		            jh.update();
		            //interview		            
			        FrozenJobSpecificModule fjsm = jsm.getFrozenJSM(study.getId());
			        if(fjsm == null){
			            fjsm = jsm.freeze(study);
			        }
			        Interview interview = new Interview();
			        interview.setFrozenJsmId(fjsm.getId());
			        interview.setStatus(Interview.STARTED);
			        interview.setParticipantId(String.valueOf(p.getParticipantId()));
			        interview.setJobHistoryId(jh.getId());
			        interview.save(); 

			        
			        for(Question q:fjsm.getFrozenQuestions()){	
			        	
			        	if(q.isNext(interview)){
			        		q.setInterviewID(interview.getId());
			        		int iAnswer = q.getPossibleAnswers().size();
				    		int iRandom = 0;
				    		if(iAnswer!=0){
				    			iRandom = r.nextInt(iAnswer);
				    			if(iRandom>=iAnswer){
				    				iRandom = iAnswer-1;
				    			}			
				    			this.saveAnswer(q,iRandom);
				    			
				    			if(q.isMultiple()){
				    				int iMore = r.nextInt(iAnswer);
				    				for(int j1=0;j1<iMore;j1++){
				    					iRandom = r.nextInt(iAnswer);
				    					this.saveAnswer(q,iRandom);
				    				}				
				    			}	
				    		}else{
				    			//System.out.println(q.getDescription());
				    		}
			        	}			        	
			        }	
			        jh.setStatusId(JobHistoryStatus.INTERVIEWED);
			        jh.update();
			        r.setSeed(r.nextLong());			        
	            } else if(jh.getStatusId().equalsIgnoreCase(JobHistoryStatus.TOBEREVIEWED)){
	            	//set jsm not in this study
	            	bToBeReviewed = true;
	            	study.setJsms(null);
		            int iJSMSize = study.getStudySpecificJsms().size();
		            int iJSM = r.nextInt(iJSMSize);
		            JobSpecificModule jsm = study.getStudySpecificJsms().get(iJSM);
		            //int iJobs = jsm.getJobs().size();
		            /*if(iJobs>0){
		            	int iJt = r.nextInt(iJobs);
		            	JobTitle jt = jsm.getJobs().get(iJt);
		            	jh.setJobDescription(jt.getName());	            	
		            }else{*/
		            	jh.setJobDescription(jsm.getName());	    
		            //}		            
		            jh.setFinalJSMId(jsm.getId());
		            jh.setParticipantId(String.valueOf(p.getParticipantId()));
		            jh.setPriority(j+1);
	            } else if(jh.getStatusId().equalsIgnoreCase(JobHistoryStatus.NOTTOBEINTERVIEWEDSCOPE)){
	            	//set jsm not in this study
	            	JobSpecificModule jsmAll = new JobSpecificModule();
	            	ArrayList<JobSpecificModule> jsms = jsmAll.getJobSpecificModules("SELECT id FROM jsm WHERE isassociate = 0 AND jsmtypeid = 0");
	            	int iJSMSize = jsms.size();
		            int iJSM = r.nextInt(iJSMSize);
		            JobSpecificModule jsm = jsms.get(iJSM);
		            //int iJobs = jsm.getJobs().size();
		            /*if(iJobs>0){
		            	int iJt = r.nextInt(iJobs);
		            	JobTitle jt = jsm.getJobs().get(iJt);
		            	jh.setJobDescription(jt.getName());	            	
		            }else{*/
		            	jh.setJobDescription(jsm.getName());	    
		            //}		            
		            jh.setFinalJSMId(jsm.getId());
		            jh.setParticipantId(String.valueOf(p.getParticipantId()));
		            jh.setPriority(j+1);
	            } else if(jh.getStatusId().equalsIgnoreCase(JobHistoryStatus.NOTTOBEINTERVIEWEDTIME)){
//	            	set final jsm		            
		            JobSpecificModule jsm = new JobSpecificModule(lastJSM);
		            //int iJobs = jsm.getJobs().size();
		            /*if(iJobs>0){
		            	int iJt = r.nextInt(iJobs);
		            	JobTitle jt = jsm.getJobs().get(iJt);
		            	jh.setJobDescription(jt.getName());	            	
		            }else{*/
		            	jh.setJobDescription(jsm.getName());	    
		           // }		            
		            jh.setFinalJSMId(jsm.getId());
		            lastJSM = jsm.getId();
		            jh.setParticipantId(String.valueOf(p.getParticipantId()));
		            jh.setPriority(j+1);
		            jh.update();		            			        
	            }  
	        	jh.update();
			}
			//}
			if(bToBeReviewed){
				p.setStatusId(ParticipantStatus.TOBEREVIEWED);
			}else{
				p.setStatusId(ParticipantStatus.READYFORASSESSMENT);
			}
			if(p.getJobHistories(JobHistoryStatus.TOBEREVIEWED,"").size()>0){
        		//warning = "<td><span class=warning>Warning: One or more Job Histories are still to be reviewed</span></td>";
        		p.setStatusId(ParticipantStatus.TOBEREVIEWED);
        		
        	}else if(p.getJobHistories(JobHistoryStatus.TOBEINTERVIEWED,"").size()>0){
        		//warning = "<td><span class=warning>Warning: One or more Job Histories are still to be interviewed</span></td>";
        		p.setStatusId(ParticipantStatus.TOBEREVIEWED);
        	}
			p.save();	  
		}
	}
	private void allCombination(Question q,ArrayList<Question> combinations) throws Exception{
		int i = q.getPossibleAnswers().size();
		if(i!=0){
			Question currentQ = null;
			for(Question qestComb: combinations){
				if(q.getJsmQuestionStructureID().equalsIgnoreCase(qestComb.getJsmQuestionStructureID())){
					currentQ = qestComb;
					break;
				}
			}
			PossibleAnswer pa = null;
			for(PossibleAnswer paTemp: q.getPossibleAnswers()){
				if(!(currentQ.getAnswers().contains(paTemp))){
					pa = paTemp;
					currentQ.getAnswers().add(paTemp);
					break;
				}
			}
			this.saveAnswer(q,pa);	
			q.setAnswers(null);			
			String nextQId = q.getNextInterviewQuestionID();
			if(!(nextQId.equalsIgnoreCase(""))){
				Question nextQ = new Question("",nextQId);
				nextQ.setInterviewID(q.getInterviewID());
				this.allCombination(nextQ,combinations);
			}
		}else{
			//System.out.println(q.getDescription());
		}
	}
//	private void generateAnswer(Question q,Random r) throws Exception {
//	
//		int i = q.getPossibleAnswers().size();
//		int iRandom = 0;
//		if(i!=0){
//			iRandom = r.nextInt(i);
//			if(iRandom>=i){
//				iRandom = i-1;
//			}			
//			this.saveAnswer(q,iRandom);
//			
//			if(q.isMultiple()){
//				int iMore = r.nextInt(i);
//				for(int j=0;j<iMore;j++){
//					iRandom = r.nextInt(i);
//					this.saveAnswer(q,iRandom);
//				}				
//			}	
//			q.setAnswers(null);
//			String nextQId = q.getNextInterviewQuestionIDAutoGen();
//			if(!(nextQId.equalsIgnoreCase(""))){
//				Question nextQ = new Question("",nextQId);
//				nextQ.setInterviewID(q.getInterviewID());
//				this.generateAnswer(nextQ,r);
//			}
//		}else{
//			System.out.println(q.getDescription());
//		}
//	}
	private void saveAnswer(Question q,PossibleAnswer pa) throws Exception{
		String strAnswerDescription = pa.getDescription();
		pa.setActualAnswer(strAnswerDescription);	
		if(strAnswerDescription.toUpperCase().contains("[FREE TEXT]")){		
			pa.setActualAnswer("Some random free text");			
		}else if(pa.getDescription().toUpperCase().contains("[NUMBER")){
			//int i1 = strAnswerDescription.toUpperCase().lastIndexOf("[NUMBER ") + 8;
            //int i2 = strAnswerDescription.lastIndexOf("-");
            //i1 = i2 + 1;
            //i2 = strAnswerDescription.lastIndexOf("]");
            //String strJ = strAnswerDescription.substring(i1, i2);
            //int j = Integer.valueOf(strJ);
            int index = new Random().nextInt(40);
            //iRandom = j/2;
			pa.setDescription(String.valueOf(index));
		}
		q.saveAnswer(pa);
	}
	private void saveAnswer(Question q,int index) throws Exception{
		PossibleAnswer pa = q.getPossibleAnswers().get(index);
		String strAnswerDescription = pa.getDescription();
		pa.setActualAnswer(strAnswerDescription);	
		if(strAnswerDescription.toUpperCase().contains("[FREE TEXT]")){		
			pa.setActualAnswer("Some random free text");			
		}else if(pa.getDescription().toUpperCase().contains("[NUMBER")){
			//int i1 = strAnswerDescription.toUpperCase().lastIndexOf("[NUMBER ") + 8;
            //int i2 = strAnswerDescription.lastIndexOf("-");
            //i1 = i2 + 1;
            //i2 = strAnswerDescription.lastIndexOf("]");
            //String strJ = strAnswerDescription.substring(i1, i2);
            //int j = Integer.valueOf(strJ);
            index = new Random().nextInt(40);
            //iRandom = j/2;
			pa.setActualAnswer(String.valueOf(index));
		}
		q.saveAnswer(pa);
	}
	public void generateRandomStudy(String name,ArrayList<Agent> agents,int iParticipants) throws Exception{
		Study study = new Study();
		this.initializeStudy(study,agents);
		
		//Thread.sleep(5000);
		this.generateInterviews(study,iParticipants);
		
		
	}
	public void generateAllCombinationStudy(JobSpecificModule jsm) throws Exception{
		Study study = new Study("4");
//		study.setName(jsm.getName());
//		study.insert();
//		study.setStatusId(StudyStatus.INPROGRESS);
//		study.update();
//		User user = new User();
//		user.setId("1");
//		user.addStudy(study.getId());
//		for(Agent a:new Agent().getAllAgents()){
//			study.addAgent(a);
//		}		
//		study.linkJSM(jsm.getId(),"1");	
		Participant p = new Participant();
		p.setReferenceNumber("TestInt1");
		p.setStudyId(study.getId());							
		OccCalendar now = new OccCalendar();
		p.setLastUpdated(now.getDatabaseFormatDateTime());
		p.save();
		JobHistory jh = new JobHistory();
        jh.setParticipantId(String.valueOf(p.getParticipantId()));
        jh.setReferenceNumber("RNDM1");
        jh.setStatusId(JobHistoryStatus.TOBEINTERVIEWED);	
        jh.setFinalJSMId(jsm.getId());
        jh.setParticipantId(String.valueOf(p.getParticipantId()));
        jh.setPriority(1);
        jh.update();
        FrozenJobSpecificModule fjsm = jsm.getFrozenJSM(study.getId());
        if(fjsm == null){
            fjsm = jsm.freeze(study);
        }
        Interview interview = new Interview();
        interview.setFrozenJsmId(fjsm.getId());
        interview.setStatus(Interview.STARTED);
        interview.setParticipantId(String.valueOf(p.getParticipantId()));
        interview.setJobHistoryId(jh.getId());
        interview.save(); 
        fjsm.getFullQuestions();
        Question q = fjsm.getQuestions().get(0);
        q.setInterviewID(interview.getId());	
        
        ArrayList<Question> combinations = jsm.getQuestionList();
        for(Question qComb: combinations){
        	qComb.setAnswers(new ArrayList<PossibleAnswer>());
        }
        this.allCombination(q,combinations);      
	}
	public void generateStudyWithAllJSMs() throws Exception{
		Study study = new Study("2");
		ArrayList<String> names = this.getRandomNames();
		int i=0;
		int iParticipants = study.getStudySpecificJsms().size();
		for(i=0;i<iParticipants;i++){
			Thread.sleep(2000);
			Random r = new Random();
			Participant p = new Participant();
			p.setReferenceNumber("TestInt"+(i+48));
			p.setStudyId(study.getId());						
			int iFirstname = r.nextInt(100);
			int iLastname = r.nextInt(100);
			p.setFirstName(names.get(iFirstname));
			p.setLastName(names.get(iLastname));	
			OccCalendar now = new OccCalendar();
			p.setLastUpdated(now.getDatabaseFormatDateTime());
			p.save();
			int iJHs = 3;
			boolean bToBeReviewed = false;
			for(int j=0;j<iJHs;j++){
				JobHistory jh = new JobHistory();
	            jh.setParticipantId(String.valueOf(p.getParticipantId()));
	            jh.setReferenceNumber("RNDM"+(j+1));
	            jh.setAge(r.nextInt(50)+15);
	            int iYearStarted = r.nextInt(100)+1900;
	            jh.setYearStarted(iYearStarted);
	            jh.setHoursPerWeek(r.nextInt(40));
	            jh.setWeeksPerYear(r.nextInt(52));
	            //randomly choose next status
	            String statusId = JobHistoryStatus.TOBEINTERVIEWED;
	            jh.setStatusId(statusId);
	            if(jh.getStatusId().equalsIgnoreCase(JobHistoryStatus.TOBEINTERVIEWED)){	            	
//	            	set final jsm
		            study.setJsms(null);		            
		            JobSpecificModule jsm = study.getStudySpecificJsms().get(i);
		            //int iJobs = jsm.getJobs().size();
		            /*if(iJobs>1){
		            	int iJt = r.nextInt(iJobs-1);
		            	JobTitle jt = jsm.getJobs().get(iJt);
		            	jh.setJobDescription(jt.getName());	            	
		            }else{*/
		            	jh.setJobDescription(jsm.getName());	    
		            //}		            
		            jh.setFinalJSMId(jsm.getId());
		            jh.setParticipantId(String.valueOf(p.getParticipantId()));
		            jh.setPriority(j+1);
		            jh.update();			        
	            } 
			}
			if(bToBeReviewed){
				p.setStatusId(ParticipantStatus.TOBEREVIEWED);
			}else{
				p.setStatusId(ParticipantStatus.READYFORINTERVIEW);
			}
			p.save();	  
		}	
	}
	@SuppressWarnings("unused")
	private void initializeStudy(Study study, ArrayList<Agent> agents) throws Exception {
		study.setName("STUDY01");
		if(study.exists()){
			study.delete();
		}
		study.insert();
		study.setStatusId(StudyStatus.INPROGRESS);
		study.update();
		study.saveOption(Study.Option.USEOCCIDEAS);
		User user = new User();
		user.setId("1");
		user.addStudy(study.getId());
		Agent agent1 = new Agent("126");
		Agent agent2 = new Agent("127");
		Agent agent3 = new Agent("128");
		Agent agent4 = new Agent("129");
		Agent agent5 = new Agent("119");
		agents = new ArrayList<Agent>();
		agents.add(agent1);
		//agents.add(agent2);
		//agents.add(agent3);
		//agents.add(agent4);
		//agents.add(agent5);
		for(Agent a:agents){
			study.addAgent(a);
		}
		study.removeAllJSMs();
		for(JobSpecificModule jsm: study.getStudySpecificJsmsPreview()){
			if(!(study.getStudySpecificJsms().contains(jsm))){
				study.linkJSM(jsm.getId(),"1");	
				Thread.sleep(5000);
				break;
			}
		}
	}
	private ArrayList<String> getRandomNames() throws Exception{
		ArrayList<String> retValue = new ArrayList<String>();
		FileReader input = null;
		try {
			input = new FileReader("/home/occideas/Documents/workspace/OccIdeasLib/Notes/randomNames.txt"); 
//			input = new FileReader("/home/troy/workspace/OccIdeasLib/Notes/randomNames.txt"); 
//			input = new FileReader("/cust/researchit/home/private-cgi-bin/randomNames.txt"); 
		}catch (IOException e){
			input = new FileReader("randomNames.txt");      
		}
		try {		  
			BufferedReader bufRead = new BufferedReader(input);	      
		    String line;    
		    int count = 0; 			              
		   
		    line = bufRead.readLine();
		    count++;			              
		    
		    while (line != null){	          
		        line = bufRead.readLine();
		        retValue.add(line);
		        count++;
		    }
		    bufRead.close();  
		}catch(IOException e1){
			  e1.printStackTrace();
		      throw new Exception(new File (".").getCanonicalPath()+" No file "+e1.getMessage());
		}
		return retValue;
	}
	public void fixFrequencyRules(JobSpecificModule jsm) throws Exception{
		//JobSpecificModule allJSMs = new JobSpecificModule();
		//String sql = "SELECT id FROM jsm WHERE jsmtypeid = 0 AND name='Aluminium'";
		//for(JobSpecificModule jsm:allJSMs.getJobSpecificModules(sql)){
		//	Study study = new Study("8"); 
		for(Agent agent: jsm.getAgents()){
			ExpertAgent ea = new ExpertAgent(agent.getId());
			for(ExpertRule er:ea.getJSMRules(jsm.getId())){
				er.removeChildRules(ExpertRule.TYPEFREQUENCYWEEKS);
        		er.removeChildRules(ExpertRule.TYPEFREQUENCYHOURS);
				String freqWksQId = "";
				String freqHrsQId = "";					
				boolean bWksFound = false;
				boolean bHrsFound = false;
		        for (Question q: ea.getFreqQuestions(jsm.getId())) {  		        	     	
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
					erf.setJsmId(jsm.getId());
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
					erf.setJsmId(jsm.getId());
					erf.save();
		    	}
		       
			}						
		}		
	}
	public void fixRuleJSMLinks() throws Exception {
		JobSpecificModule jsmAll = new JobSpecificModule();
		ArrayList<JobSpecificModule> allJSMs = jsmAll.getTemplateJSMs();
		allJSMs.addAll(jsmAll.getTemplateAJSMs());
		for(JobSpecificModule jsm: allJSMs){
			for(Agent agent: jsm.getAgents()){
				ExpertAgent ea = new ExpertAgent(agent.getId());
				for(ExpertRule rule: ea.getJSMRules(jsm.getId())){
					if((rule.getJsmId()==null)||(rule.getJsmId().equalsIgnoreCase(""))){
						if(rule.getJSMs().size()>1){
							String ruleId = rule.copy();
		        			ExpertRule er = new ExpertRule(ruleId);
		        			er.setJsmId(jsm.getId());
		        			er.save();
		        			for(ExpertRule childRule:rule.getChildRules()){
		        				String cid = childRule.copy();
		        				ExpertRule cer = new ExpertRule(cid);
		        				cer.setParentId(er.getId());
		        				cer.setJsmId(jsm.getId());
		        				cer.save();
		        			}
						}else{
							rule.setJsmId(jsm.getId());
		        			rule.save();
		        			for(ExpertRule childRule:rule.getChildRules()){
		        				childRule.setParentId(rule.getId());
		        				childRule.setJsmId(jsm.getId());
		        				childRule.save();
		        			} 
						}
					}
				}
			}
		}
		
	}
}
