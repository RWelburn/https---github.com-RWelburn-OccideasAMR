/**
 * Version:
 *     $Id: Engine.java,v 1.50 2009/05/27 02:00:44 troy.sadkowsky Exp $
 *
 * Revisions:
 *     $Log: Engine.java,v $
 *     Revision 1.50  2009/05/27 02:00:44  troy.sadkowsky
 *     bug fix 814 3cat frequency hours
 *
 *     Revision 1.49  2009/03/09 06:57:21  troy.sadkowsky
 *     bug fixes from demo testing
 *
 *     Revision 1.48  2009/02/04 22:45:11  troy.sadkowsky
 *     ensure assessor id is set
 *
 *     Revision 1.47  2008/11/25 23:29:06  troy.sadkowsky
 *     speed enhancements
 *
 *     Revision 1.46  2008/11/15 09:08:59  troy.sadkowsky
 *     various bug fixes and code cleaning
 *
 *     Revision 1.45  2008/09/20 08:59:30  troy.sadkowsky
 *     new assessment updates
 *
 *     Revision 1.44  2008/09/12 02:40:17  troy.sadkowsky
 *     ASsessment report updates
 *
 *     Revision 1.43  2008/08/20 03:36:35  troy.sadkowsky
 *     assessment updates
 *
 *     Revision 1.42  2008/08/13 04:29:48  troy.sadkowsky
 *     removed jess
 *
 *     Revision 1.41  2008/08/11 00:46:19  troy.sadkowsky
 *     rule conversion from ajsms
 *
 *     Revision 1.40  2008/08/02 06:16:57  troy.sadkowsky
 *     removed jess and reworked rules and ajsms
 *
 *     Revision 1.39  2008/07/23 00:15:12  troy.sadkowsky
 *     remove jess dependencies
 *
 *     Revision 1.38  2008/07/14 06:15:28  troy.sadkowsky
 *     fixed bug on null freq q
 *
 *     Revision 1.37  2008/05/26 08:22:30  troy.sadkowsky
 *     Removed old code
 *
 */
package com.researchit.expert;

import java.util.ArrayList;

import com.researchit.Assessment;
import com.researchit.Interview;
import com.researchit.JobHistory;
import com.researchit.JobHistoryStatus;
import com.researchit.JobSpecificModule;
import com.researchit.PossibleAnswer;
import com.researchit.Question;
import com.researchit.QuestionAssessment;
import com.researchit.common.Participant;
import com.researchit.common.Study;

public class Engine {
	public Engine() {

	}
	public ArrayList<ExpertRule> Evaluate11(ExpertAgent agent, JobHistory jh,Study study) throws Exception {
		ArrayList<ExpertRule> retValue = new ArrayList<ExpertRule>();		
		jh.getPersistentObject();
		Interview interview = jh.getCurrentInterview();
		Assessment assessment = new Assessment();		
		if (interview != null) {
			JobSpecificModule jsm = new JobSpecificModule(jh.getFinalJSMId());
				//do usual assessment
				retValue = interview.findFiredRules(jsm.getRules(agent));	
				if(retValue.size()>0){
					ArrayList<ExpertRule> highestFiredRules = interview.getHigestFiredRules();
					assessment = this.makeAssessment(highestFiredRules,interview,study);
					assessment.save();
				}else{
					assessment.setExposure("None");
					assessment.setLevel("None");
					assessment.setAgentId(agent.getId());
					assessment.setAssessorusername("OccIDEAS");
					assessment.setAssessorId("-1");
					assessment.setJobHistoryId(jh.getId());
					assessment.save();
				}
				//if this is environmental asbestos JSM
				if (jsm.isEnvironmentalAsbestosModule()) {
					//Grab the assessment id from the full assessment
					String assessmentid = assessment.getId();
					System.out.println("jsm: " + jsm.getName());
					//Get list of root questions
					ArrayList<Question> rootQuestions = jsm.getRootQuestions();
					//and for each root question...
					for (Question rootQuestion :rootQuestions) {
						QuestionAssessment questionAssessment = new QuestionAssessment();	
						//Do root question assessment
						System.out.println("Root Question= " + rootQuestion.getJsmQuestionStructureID());
						retValue = interview.findFiredRulesByRootQuestion(jsm.getRules(agent), rootQuestion);	
						if(retValue.size()>0){
							ArrayList<ExpertRule> highestFiredRules = interview.getHigestFiredRulesByRootQuestion(retValue);
							assessment = this.makeAssessment(highestFiredRules,interview,study);
							questionAssessment.setJsmquestionstructureid(rootQuestion.getJsmQuestionStructureID());
							questionAssessment.setAgentassessmentid(assessmentid);
							questionAssessment.setExposure(assessment.getExposure());
							questionAssessment.setLevel(assessment.getLevel());
							questionAssessment.save();
							
							
							
						}else{
							questionAssessment.setAgentassessmentid(assessmentid);
							questionAssessment.setExposure("None");
							questionAssessment.setLevel("None");
							questionAssessment.setJsmquestionstructureid(rootQuestion.getJsmQuestionStructureID());
							questionAssessment.save();
						}
						
						
					}
					
					
				}
		}else{
			if(jh.getStatusId().equalsIgnoreCase(JobHistoryStatus.NOTTOBEINTERVIEWEDTIME)){
				Participant p = new Participant(Long.valueOf(jh.getParticipantId()));
				boolean bFound = false;
				for(JobHistory jh1: p.getJobHistoriesReady()){
					if(!(jh1.getId().equalsIgnoreCase(jh.getId()))){
						if(jh1.getFinalJSMId().equalsIgnoreCase(jh.getFinalJSMId())){
							Assessment previousAssessment = jh1.getAutoAssessment(agent.getId());
							assessment.setExposure(previousAssessment.getExposure());
							assessment.setLevel(previousAssessment.getLevel());
							assessment.setAgentId(agent.getId());
							assessment.setAssessorusername("OccIDEAS");
							assessment.setAssessorId("-1");
							assessment.setJobHistoryId(jh.getId());
							assessment.setFrequencyhours(previousAssessment.getFrequencyhours());
							assessment.setFrequencyweeks(previousAssessment.getFrequencyweeks());	
							bFound = true;
							break;
						}
					}
				}
				if(bFound){
					assessment.save();
				}else{
					assessment.setExposure("Possible");
					assessment.setLevel("Unknown");
					assessment.setAgentId(agent.getId());
					assessment.setAssessorusername("OccIDEAS");
					assessment.setAssessorId("-1");
					assessment.setJobHistoryId(jh.getId());
					assessment.save();
				}
			}else if(jh.getStatusId().equalsIgnoreCase(JobHistoryStatus.NOTTOBEINTERVIEWEDSCOPE)){
				assessment.setExposure("Not Assessed");
				assessment.setLevel("Not Assessed");
				assessment.setAgentId(agent.getId());
				assessment.setAssessorusername("OccIDEAS");
				assessment.setAssessorId("-1");
				assessment.setJobHistoryId(jh.getId());
				assessment.save();
			} else{
				assessment.setExposure("None");
				assessment.setLevel("None");
				assessment.setAgentId(agent.getId());
				assessment.setAssessorusername("OccIDEAS");
				assessment.setAssessorId("-1");
				assessment.setJobHistoryId(jh.getId());
				assessment.save();
			}			
		}	
		if(!(assessment.getId().equalsIgnoreCase(""))){
			assessment.removeFiredRules();
			for(ExpertRule firedRule:retValue){
				assessment.insertFiredRule(firedRule);
			}
		}		
		return retValue;
	}
	private Assessment makeAssessment(ArrayList<ExpertRule> firedRules,Interview interview,Study study) throws Exception {
		Assessment retValue = new Assessment();
		Integer freqValue = -1;
		Integer freqMaxValueWeeks = -1;
		Integer freqFinalValue = -1;
		for(ExpertRule er: firedRules){			
			ExpertRule fWeeksRule = er.getFrequencyWeeksRule();
			if(!(fWeeksRule.getFrequencyWeeksQId().equalsIgnoreCase("0"))){
				PossibleAnswer pa = interview.getAnswerToFrequencyQuestion(fWeeksRule.getFrequencyWeeksQId());
				if(!(pa.getActualAnswer().equalsIgnoreCase("skipped"))){
					if(!(pa.getActualAnswer().equalsIgnoreCase(""))){
						freqValue = Integer.parseInt(pa.getActualAnswer());														
						er.setFrequencyWeeksValue(freqValue.toString());	
					}													
					if(freqValue>freqMaxValueWeeks){
						freqMaxValueWeeks = freqValue;
					}
				}
			}else{
				if(freqMaxValueWeeks==-1){
					JobHistory jh = new JobHistory(interview.getJobHistoryId());
					freqMaxValueWeeks = (int)jh.getWeeksPerYear();
					er.setFrequencyWeeksValue(freqMaxValueWeeks.toString());
				}				
			}					
		}			
		for(ExpertRule er: firedRules){	
			ExpertRule fHoursRule = er.getFrequencyHoursRule();
			if(!(fHoursRule.getFrequencyHoursQId().equalsIgnoreCase("0"))){
				PossibleAnswer paHours = interview.getAnswerToFrequencyQuestion(fHoursRule.getFrequencyHoursQId());
				if(!(paHours.getActualAnswer().equalsIgnoreCase("skipped"))){
					if(!(paHours.getActualAnswer().equalsIgnoreCase(""))){						
						if(study.hasOption(Study.Option.CAT3FREQ)){
							try{
								Integer freqFiredValue = Integer.parseInt(paHours.getActualAnswer());	
								if(er.getFrequencyHoursValue()!=null){
									if(freqFiredValue>Integer.parseInt(er.getFrequencyHoursValue())){
										er.setFrequencyHoursValue(freqFiredValue.toString());
									}
								}else{
									er.setFrequencyHoursValue(freqFiredValue.toString());
								}
								er.setFrequencyHoursValue(freqFiredValue.toString());

							}catch(Exception e){
								//System.out.println("ERROR: Converting integer -"+paHours.getActualAnswer());
							}

						}else{
							try{
								Integer freqFiredValue = Integer.parseInt(paHours.getActualAnswer());														
								er.setFrequencyHoursValue(freqFiredValue.toString());
								if(er.getFrequencyWeeksValue()!=null){
									float firedWeeks = Float.parseFloat(er.getFrequencyWeeksValue());
									float frequencyWeeks = freqMaxValueWeeks;
									freqFinalValue += (int)(firedWeeks/frequencyWeeks)*freqFiredValue;
								}
							}catch(Exception e){
								//System.out.println("ERROR: Converting integer -"+paHours.getActualAnswer());
							}
						}												
					}						
				}
			}else{
				if(freqFinalValue==-1){
					JobHistory jh = new JobHistory(interview.getJobHistoryId());
					er.setFrequencyHoursValue(String.valueOf((int)jh.getHoursPerWeek()));
				}	
			}
			try{

				freqFinalValue = Integer.valueOf(er.getFrequencyHoursValue());
			}catch(Exception e){
				//To Do deal with "Error: RuleID"+er.getId()+" has frequency hours value of "+er.getFrequencyHoursValue()+" msg:"+e.getMessage());
			}			
		}	
		if(firedRules.size()>0){
			ExpertRule rule = firedRules.get(0);
			ExpertRule.RuleOutcome outcome = rule.getOutCome();
			if(outcome == ExpertRule.RuleOutcome.POSSIBLEUNKNOWN){
				retValue.setExposure("Possible");
				retValue.setLevel("Unknown");
			}else if(outcome == ExpertRule.RuleOutcome.PROBABLEUNKNOWN){
				retValue.setExposure("Probable");
				retValue.setLevel("Unknown");
			}else if(outcome == ExpertRule.RuleOutcome.PROBABLELOW){
				retValue.setExposure("Probable");
				retValue.setLevel("Low");
			}else if(outcome == ExpertRule.RuleOutcome.PROBABLEMEDIUM){
				retValue.setExposure("Probable");
				retValue.setLevel("Medium");
			}else if(outcome == ExpertRule.RuleOutcome.PROBABLEHIGH){
				retValue.setExposure("Probable");
				retValue.setLevel("High");
			}
			retValue.setAgentId(rule.getAgentId());
			retValue.setAssessorusername("OccIDEAS");
			retValue.setAssessorId("-1");
			retValue.setJobHistoryId(interview.getJobHistoryId());
			retValue.setFrequencyhours(freqFinalValue);
			retValue.setFrequencyweeks(freqMaxValueWeeks);
			//retValue.save();
		}															
		return retValue;
	}
	//	public ArrayList<ExpertRule> Evaluate10(ExpertAgent agent, JobHistory jh) throws Exception {
	//		
	//		boolean bHigh = false;
	//		boolean bMedium = false;
	//		boolean bLow = false;
	//		boolean bUnknown = false;
	//		boolean bPosUnknown = false;
	//		String comments = "";
	//		ArrayList<ExpertRule> retValue = new ArrayList<ExpertRule>();
	//
	//		Interview interview = jh.getCurrentInterview();
	//		if (interview != null) {
	//			List<InterviewAnswer> ias = interview.getInterviewAnswers();
	//			if(ias.size()!=0){
	//				Rete r = new Rete();							
	//				r.addAll(ias);
	//				r.add(jh);
	//				r.eval("( deftemplate expertFact (slot name) )");
	//				r.eval("( deftemplate expertProbability (slot name) )");
	//				r.eval("( deftemplate expertLevel (slot name) )");
	//				
	//				// set the facts
	//				String gFacts = "";	
	//				int i=1;
	//				for(ExpertRule er: agent.getJSMRules(jh.getFinalJSMId())){	
	//					//initialise the Probability rules
	//					for(ExpertFact ef:er.getFacts()){
	//						if(ef.isJobHistoryFact()){
	//							gFacts = "(defrule r"+ef.getId()+"_"+i;
	//							gFacts+= "(MAIN::JobHistory {"+ef.getAttribute()+" "+ef.getConditionOperator()+" "+ef.getValue()+"}) => (assert (expertFact (name "+ef.getId()+") ) )";
	//							gFacts+= ")";
	//							r.eval(gFacts);	 
	//						}else{
	//							gFacts = "(defrule r"+ef.getId()+"_"+i+" (or";
	//							for(ExpertFactRequirement efr: ef.getFactRequirements()){
	//								gFacts+= "(MAIN::InterviewAnswer (questionId \""+efr.getQuestionId()+"\") (possibleAnswerId \""+efr.getAnswerId()+"\"))	";
	//							}
	//							gFacts += ") => (assert (expertFact (name "+ef.getId()+") ) ) )";
	//							r.eval(gFacts);	
	//						}	
	//						i++;
	//					}	
	//					 
	//					//initialise the action for the firing of rule
	//					String facts = "(and ";
	//					for(ExpertFact ef:er.getFacts()){
	//						facts += "(MAIN::expertFact (name "+ef.getId()+"))";
	//					}
	//					facts += ")";
	//					
	//					String rule = "(defrule r"+er.getId()+"_"+i+" " +
	//					facts +
	//					"=> (assert (expertProbability (name "+er.getId()+"))) (add (new com.researchit.expert.ProbFuzzyWeight \""+er.getId()+"\" \"details\")))";
	//					r.eval(rule);
	//					i++;
	//					
	////					initialise the frequency rules
	//					ExpertRule fwksRule = er.getFrequencyWeeksRule();
	//					if(!(fwksRule.getId().equalsIgnoreCase(""))){
	//						String freqRule = "(defrule fr"+fwksRule.getId()+" ";
	//						freqRule+= "(and (MAIN::expertProbability (name "+er.getId()+")) (MAIN::InterviewAnswer (jsmOldQuestionStructureId \""+fwksRule.getFrequencyWeeksQId()+"\") (answerDescription ?answer)) )";					
	//						freqRule += " => (add (new com.researchit.expert.FreqWeeksFuzzyWeight \""+fwksRule.getId()+"\" ?answer)) )";
	//						r.eval(freqRule);
	//					}
	//					ExpertRule fhrsRule = er.getFrequencyHoursRule();
	//					if(!(fhrsRule.getId().equalsIgnoreCase(""))){
	//						String freqRule = "(defrule fr"+fhrsRule.getId()+" ";
	//						freqRule += "(and (MAIN::expertProbability (name "+er.getId()+")) (MAIN::InterviewAnswer (jsmOldQuestionStructureId \""+fhrsRule.getFrequencyHoursQId()+"\") (answerDescription ?answer)) )";					
	//						freqRule += " => (add (new com.researchit.expert.FreqHoursFuzzyWeight \""+fhrsRule.getId()+"\" ?answer)) )";
	//						r.eval(freqRule);
	//					}
	//				}
	//				Iterator itRules = r.listDefrules();
	//				while (itRules.hasNext()) {
	//					Defrule dr = (Defrule) itRules.next();	
	//				}
	//				r.run();
	//				Iterator itFacts = r.listFacts();
	//				while (itFacts.hasNext()) {
	//					Fact f = (Fact) itFacts.next();
	//				}
	//				// get probability
	//				String probability = "";
	//				ArrayList<ExpertRule> rulesFired = new ArrayList<ExpertRule>();
	//				Assessment assessment = new Assessment();
	//				assessment.setExposure("None");
	//				assessment.setLevel("None");
	//				Iterator it = r.getObjects(new Filter.ByClass(ProbFuzzyWeight.class));
	//				while (it.hasNext()) {
	//					ProbFuzzyWeight a = (ProbFuzzyWeight) it.next();
	//					probability = a.getWeight();
	//					ExpertRule resultExpertRule = new ExpertRule(probability);
	//					rulesFired.add(resultExpertRule);	
	//					
	//					if(resultExpertRule.getLevelTypeId().equalsIgnoreCase(ExpertRule.PROBABLEHIGH)){
	//						bHigh = true;	
	//					}else if(resultExpertRule.getLevelTypeId().equalsIgnoreCase(ExpertRule.PROBABLEMEDIUM)){
	//						bMedium = true;	
	//					}else if(resultExpertRule.getLevelTypeId().equalsIgnoreCase(ExpertRule.PROBABLELOW)){
	//						bLow = true;	
	//					}else if(resultExpertRule.getLevelTypeId().equalsIgnoreCase(ExpertRule.PROBABLEUNKNOWN)){
	//						bUnknown = true;	
	//					}else if(resultExpertRule.getLevelTypeId().equalsIgnoreCase(ExpertRule.POSSIBLEUNKNOWN)){
	//						bPosUnknown = true;	
	//					}
	//					retValue.add(resultExpertRule);
	//				}								
	//				if(bPosUnknown){
	//					assessment.setExposure("Possible");
	//					assessment.setLevel("Unknown");
	//					Iterator itFreqWeeksFW = r.getObjects(new Filter.ByClass(FreqWeeksFuzzyWeight.class));
	//					Float freqWeeks = this.evalutateFrequencyWeeks(itFreqWeeksFW,ExpertRule.POSSIBLEUNKNOWN,retValue);
	//					if(freqWeeks == 0){
	//						assessment.setFrequencyweeks(jh.getWeeksPerYear());
	//					}else{
	//						assessment.setFrequencyweeks(freqWeeks);
	//					}						
	//					Iterator itFreqHoursFW = r.getObjects(new Filter.ByClass(FreqHoursFuzzyWeight.class));
	//					Float freqHours = this.evalutateFrequencyHours(itFreqHoursFW,ExpertRule.POSSIBLEUNKNOWN,retValue,assessment.getFrequencyweeks());
	//					if(freqWeeks == 0){
	//						assessment.setFrequencyhours(jh.getHoursPerWeek());
	//					}else{
	//						assessment.setFrequencyhours(freqHours);
	//					}
	//				} 
	//				if(bUnknown){
	//					assessment.setExposure("Probable");
	//					assessment.setLevel("Unknown");
	//					Iterator itFreqWeeksFW = r.getObjects(new Filter.ByClass(FreqWeeksFuzzyWeight.class));
	//					Float freqWeeks = this.evalutateFrequencyWeeks(itFreqWeeksFW,ExpertRule.PROBABLEUNKNOWN,retValue);
	//					if(freqWeeks == 0){
	//						assessment.setFrequencyweeks(jh.getWeeksPerYear());
	//					}else{
	//						assessment.setFrequencyweeks(freqWeeks);
	//					}						
	//					Iterator itFreqHoursFW = r.getObjects(new Filter.ByClass(FreqHoursFuzzyWeight.class));
	//					Float freqHours = this.evalutateFrequencyHours(itFreqHoursFW,ExpertRule.PROBABLEUNKNOWN,retValue,assessment.getFrequencyweeks());
	//					if(freqWeeks == 0){
	//						assessment.setFrequencyhours(jh.getHoursPerWeek());
	//					}else{
	//						assessment.setFrequencyhours(freqHours);
	//					}
	//				} 
	//				if(bLow){
	//					assessment.setExposure("Probable");
	//					assessment.setLevel("Low");
	//					Iterator itFreqWeeksFW = r.getObjects(new Filter.ByClass(FreqWeeksFuzzyWeight.class));
	//					Float freqWeeks = this.evalutateFrequencyWeeks(itFreqWeeksFW,ExpertRule.PROBABLELOW,retValue);
	//					if(freqWeeks == 0){
	//						assessment.setFrequencyweeks(jh.getWeeksPerYear());
	//					}else{
	//						assessment.setFrequencyweeks(freqWeeks);
	//					}						
	//					Iterator itFreqHoursFW = r.getObjects(new Filter.ByClass(FreqHoursFuzzyWeight.class));
	//					Float freqHours = this.evalutateFrequencyHours(itFreqHoursFW,ExpertRule.PROBABLELOW,retValue,assessment.getFrequencyweeks());
	//					if(freqWeeks == 0){
	//						assessment.setFrequencyhours(jh.getHoursPerWeek());
	//					}else{
	//						assessment.setFrequencyhours(freqHours);
	//					}
	//				}   
	//				if(bMedium){
	//					assessment.setExposure("Probable");
	//					assessment.setLevel("Medium");
	//					Iterator itFreqWeeksFW = r.getObjects(new Filter.ByClass(FreqWeeksFuzzyWeight.class));
	//					Float freqWeeks = this.evalutateFrequencyWeeks(itFreqWeeksFW,ExpertRule.PROBABLEMEDIUM,retValue);
	//					if(freqWeeks == 0){
	//						assessment.setFrequencyweeks(jh.getWeeksPerYear());
	//					}else{
	//						assessment.setFrequencyweeks(freqWeeks);
	//					}						
	//					Iterator itFreqHoursFW = r.getObjects(new Filter.ByClass(FreqHoursFuzzyWeight.class));
	//					Float freqHours = this.evalutateFrequencyHours(itFreqHoursFW,ExpertRule.PROBABLEMEDIUM,retValue,assessment.getFrequencyweeks());
	//					if(freqWeeks == 0){
	//						assessment.setFrequencyhours(jh.getHoursPerWeek());
	//					}else{
	//						assessment.setFrequencyhours(freqHours);
	//					}
	//				}  
	//				if(bHigh){
	//					assessment.setExposure("Probable");
	//					assessment.setLevel("High");			
	//					Iterator itFreqWeeksFW = r.getObjects(new Filter.ByClass(FreqWeeksFuzzyWeight.class));
	//					Float freqWeeks = this.evalutateFrequencyWeeks(itFreqWeeksFW,ExpertRule.PROBABLEHIGH,retValue);
	//					if(freqWeeks == 0){
	//						assessment.setFrequencyweeks(jh.getWeeksPerYear());
	//					}else{
	//						assessment.setFrequencyweeks(freqWeeks);
	//					}					
	//					Iterator itFreqHoursFW = r.getObjects(new Filter.ByClass(FreqHoursFuzzyWeight.class));
	//					Float freqHours = this.evalutateFrequencyHours(itFreqHoursFW,ExpertRule.PROBABLEHIGH,retValue,assessment.getFrequencyweeks());
	//					if(freqWeeks == 0){
	//						assessment.setFrequencyhours(jh.getHoursPerWeek());
	//					}else{
	//						assessment.setFrequencyhours(freqHours);
	//					}					
	//				}				
	//				assessment.setAgentId(agent.getId());
	//				assessment.setAssessorusername("OccIDEAS");
	//				assessment.setComments(comments);
	//				assessment.setJobHistoryId(jh.getId());
	//				assessment.save();
	//				assessment.removeFiredRules();
	//				for(ExpertRule firedRule:retValue){
	//					assessment.insertFiredRule(firedRule);
	//				}
	//			}						
	//		}else{
	//			Assessment assessment = new Assessment();
	//			assessment.setExposure("None");
	//			assessment.setLevel("None");
	//			assessment.setAgentId(agent.getId());
	//			assessment.setAssessorusername("OccIDEAS");
	//			assessment.setJobHistoryId(jh.getId());
	//			assessment.save();
	//		}
	//		return retValue;
	//	}
	//	private Float evalutateFrequencyHours(Iterator itFreqHoursFW, String levelTypeId, ArrayList<ExpertRule> retValue, float frequencyWeeks) throws Exception {		
	//		String ruleId = "";
	//		Integer freqFiredValue = 0;
	//		
	//		Float freqFinalValue = Float.valueOf(0);
	//		while (itFreqHoursFW.hasNext()) {
	//			FreqHoursFuzzyWeight a = (FreqHoursFuzzyWeight) itFreqHoursFW.next();
	//			ruleId = a.getWeight();
	//			if(!(a.getComments().equalsIgnoreCase("skipped"))){
	//				for(ExpertRule firedRule: retValue){
	//					for(ExpertRule cer:firedRule.getChildRules()){
	//						if(cer.getId().equalsIgnoreCase(ruleId)){
	//							freqFiredValue = Integer.parseInt(a.getComments());
	//							firedRule.setFrequencyHoursValue(freqFiredValue.toString());								
	//							if(firedRule.getLevelTypeId().equalsIgnoreCase(levelTypeId)){
	//								if(firedRule.getFrequencyWeeksValue()!=null){
	//									float firedWeeks = Float.parseFloat(firedRule.getFrequencyWeeksValue());
	//									freqFinalValue += (firedWeeks/frequencyWeeks)*freqFiredValue;
	//								}								
	//							}
	//						}
	//					}
	//				}	
	//			}				
	//		}
	//		return freqFinalValue;
	//	}
	//	private Float evalutateFrequencyWeeks(Iterator itFreqWeeksFW, String ruleTypeId, ArrayList<ExpertRule> retValue) throws Exception {		
	//		String ruleId = "";
	//		Integer freqValue = 0;
	//		Integer freqMaxValue = 0;
	//		while (itFreqWeeksFW.hasNext()) {
	//			FreqWeeksFuzzyWeight a = (FreqWeeksFuzzyWeight) itFreqWeeksFW.next();
	//			ruleId = a.getWeight();		
	//			if(!(a.getComments().equalsIgnoreCase("skipped"))){
	//				for(ExpertRule firedRule: retValue){
	//					for(ExpertRule cer:firedRule.getChildRules()){
	//						if(cer.getId().equalsIgnoreCase(ruleId)){	
	//							freqValue = Integer.parseInt(a.getComments());														
	//							firedRule.setFrequencyWeeksValue(freqValue.toString());		
	//							if(firedRule.getLevelTypeId().equalsIgnoreCase(ruleTypeId)){								
	//								if(freqValue>freqMaxValue){
	//									freqMaxValue = freqValue;
	//								}
	//							}
	//						}
	//					}						
	//				}
	//			}							
	//		}
	//		return Float.valueOf(freqMaxValue);		
	//	}
}
