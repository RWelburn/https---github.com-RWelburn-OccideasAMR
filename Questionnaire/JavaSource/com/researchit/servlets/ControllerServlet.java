/**
 * Revisions:
 *     $Log: ControllerServlet.java,v $
 *     Revision 1.180  2009/02/19 03:34:01  troy.sadkowsky
 *     increased buffer for new questions without renaming
 *
 *     Revision 1.179  2009/02/15 06:06:48  ray.welburn
 *     Add export XML
 *
 *     Revision 1.178  2009/02/04 22:37:46  troy.sadkowsky
 *     fixed wiki page for shared keyphrase
 *
 *     Revision 1.177  2009/01/21 08:42:39  troy.sadkowsky
 *     show and hide action bar
 *
 *     Revision 1.176  2009/01/06 07:41:47  troy.sadkowsky
 *     v2 updates
 *
 *     Revision 1.175  2009/01/05 09:05:52  troy.sadkowsky
 *     nav back to readonly rule display
 *
 *     Revision 1.174  2008/12/20 02:07:13  troy.sadkowsky
 *     v2 updates
 *
 *     Revision 1.173  2008/12/17 03:50:27  ray.welburn
 *     New title bars and coles buttons added
 *
 *     Revision 1.172  2008/12/14 22:41:27  troy.sadkowsky
 *     removed old code
 *
 *     Revision 1.171  2008/11/25 23:28:26  troy.sadkowsky
 *     update  rules on keyphrase update
 *
 *     Revision 1.170  2008/11/25 22:58:33  ray.welburn
 *     add edit view to rules
 *
 *     Revision 1.169  2008/11/14 09:14:54  troy.sadkowsky
 *     usability updates
 *
 *     Revision 1.168  2008/11/07 05:01:59  ray.welburn
 *     Add close button to view/edit rules and remove from view rules
 *
 *     Revision 1.167  2008/11/06 00:39:48  ray.welburn
 *     Add close button to view rules page
 *
 *     Revision 1.166  2008/10/20 00:37:44  troy.sadkowsky
 *     to excel show rules
 *
 *     Revision 1.165  2008/10/08 01:45:29  troy.sadkowsky
 *     fix frequency rules
 *
 *     Revision 1.164  2008/09/24 12:16:54  troy.sadkowsky
 *     demo ready
 *
 *     Revision 1.163  2008/09/20 09:00:31  troy.sadkowsky
 *     fixed rule bugs
 *
 *     Revision 1.162  2008/09/03 07:36:48  troy.sadkowsky
 *     tidy code and ensure connections close
 *
 *     Revision 1.161  2008/08/13 04:39:37  troy.sadkowsky
 *     fix for adding jobs
 *
 *     Revision 1.160  2008/08/13 04:34:56  ray.welburn
 *     modifications to add/edit agentexamples
 *
 *     Revision 1.159  2008/08/02 06:22:35  troy.sadkowsky
 *     fix for exceptions on removing more than one at a time
 *
 *     Revision 1.158  2008/07/23 00:16:50  troy.sadkowsky
 *     link rule to jsm
 *
 *     Revision 1.157  2008/06/11 00:34:32  troy.sadkowsky
 *     refactor insert and updates
 *
 *     Revision 1.156  2008/06/04 00:52:39  troy.sadkowsky
 *     changed updatetimestamps to use session jsmid
 *
 *     Revision 1.155  2008/06/01 09:37:09  ray.welburn
 *     Search for users and filter for lhs user menu
 *
 *     Revision 1.154  2008/05/30 01:52:08  troy.sadkowsky
 *     removed old code
 *
 *     Revision 1.153  2008/05/29 03:20:58  ray.welburn
 *     Speach marks substituted for apostrophe in answer removal alert to avoid breaking alert message
 *
 *     Revision 1.152  2008/05/22 02:12:44  ray.welburn
 *     Add timestamp for all jsm changes
 *
 *     Revision 1.151  2008/05/13 23:36:22  ray.welburn
 *     remoing a question now deletes attached answers
 *
 *     Revision 1.150  2008/04/22 10:26:55  ray.welburn
 *     Changes to copying and pasting q's and a's
 *
 *     Revision 1.149  2008/03/16 03:49:44  ray.welburn
 *     Add Global min max button
 *
 *     Revision 1.148  2008/03/12 07:49:41  troy.sadkowsky
 *     record last updated for JSM mods
 *
 *     Revision 1.147  2008/03/11 06:45:42  troy.sadkowsky
 *     modification to action logger to include session values as well as names
 *
 *     Revision 1.146  2008/03/10 03:25:31  troy.sadkowsky
 *     fix for linking aJSMs
 *
 *     Revision 1.145  2008/03/06 03:07:39  ray.welburn
 *     Additions to Action logger to log user actions
 *
 *     Revision 1.144  2008/03/05 05:04:33  troy.sadkowsky
 *     import aJSMs
 *
 *     Revision 1.143  2008/03/03 06:38:53  ray.welburn
 *     Action logger to log user actions
 *
 *     Revision 1.142  2008/03/02 23:35:38  ray.welburn
 *     Logout goes back to home page
 *
 *     Revision 1.141  2008/03/01 04:24:42  troy.sadkowsky
 *     no crossed facts
 *
 *     Revision 1.140  2008/02/28 04:26:23  ray.welburn
 *     Modify alerts when q's and a's deleted
 *
 *     Revision 1.139  2008/02/25 04:24:42  troy.sadkowsky
 *     new export function
 *
 *     Revision 1.138  2008/02/24 05:15:44  ray.welburn
 *     add Min Max button to rhs when adding agents
 *
 *     Revision 1.137  2008/02/15 08:39:25  troy.sadkowsky
 *     copy jsms function
 *
 *     Revision 1.136  2008/02/14 06:55:59  ray.welburn
 *     Logout now goes to home page
 *
 *     Revision 1.135  2008/02/13 02:30:28  ray.welburn
 *     Remove User manual references
 *
 *     Revision 1.134  2008/02/12 15:03:55  troy.sadkowsky
 *     shared questions and answers
 *
 *     Revision 1.133  2008/02/08 07:39:31  troy.sadkowsky
 *     build v1.71 updates
 *
 *     Revision 1.132  2008/01/24 04:00:55  troy.sadkowsky
 *     bug fix for new agent display
 *
 *     Revision 1.131  2008/01/23 07:28:11  troy.sadkowsky
 *     updated rest rule sequence and placed under rule save
 *
 *     Revision 1.130  2008/01/21 14:14:04  troy.sadkowsky
 *     bug fix prob unknown new
 *
 *     Revision 1.129  2008/01/21 14:00:18  troy.sadkowsky
 *     clean old code and bug fix for copy rules
 *
 *     Revision 1.128  2008/01/14 12:55:39  troy.sadkowsky
 *     set sequence on delete and add rule
 *
 *     Revision 1.127  2007/12/17 01:35:51  troy.sadkowsky
 *     frequency rules bug
 *
 *     Revision 1.126  2007/12/16 22:45:28  troy.sadkowsky
 *     bug fix for 418
 *
 *     Revision 1.125  2007/12/11 14:10:15  troy.sadkowsky
 *     new view with parent option at interview
 *
 *     Revision 1.124  2007/12/06 22:32:32  troy.sadkowsky
 *     ability to change frequency rules
 *
 *     Revision 1.123  2007/12/04 01:45:36  troy.sadkowsky
 *     changed logout redirect
 *
 *     Revision 1.122  2007/11/27 03:45:09  ray.welburn
 *     Modified for new agentexamples object
 *
 *     Revision 1.121  2007/11/14 05:12:38  troy.sadkowsky
 *     on log out take user to login page
 *
 *     Revision 1.120  2007/10/25 03:51:14  troy.sadkowsky
 *     fix frequency rules
 *
 *     Revision 1.119  2007/10/22 04:07:10  troy.sadkowsky
 *     enhancement for auto setting frequency rules
 *
 *     Revision 1.118  2007/10/17 01:33:51  ray.welburn
 *     removing answer in structure view now checks for rules
 *
 *     Revision 1.117  2007/10/16 02:55:14  troy.sadkowsky
 *     single rules
 *
 *     Revision 1.116  2007/10/15 05:59:17  troy.sadkowsky
 *     copy paste rules
 *
 *     Revision 1.115  2007/10/09 07:17:18  troy.sadkowsky
 *     removed old code
 *
 *     Revision 1.114  2007/10/05 06:05:57  ray.welburn
 *     Updating rules - now saves changes when adding new conditions
 *
 *     Revision 1.113  2007/10/04 02:03:32  Troy.Sadkowsky
 *     go home on log out
 *
 *     Revision 1.112  2007/09/27 13:27:58  ray.welburn
 *     Reorganise roles and permissions & remove redundant code
 *
 *     Revision 1.111  2007/09/26 01:54:29  ray.welburn
 *     tidying code
 *
 *     Revision 1.110  2007/09/21 11:05:18  ray.welburn
 *     JSM structure view now prevents q's & a's being deleted if they have child items
 *
 *     Revision 1.109  2007/09/12 06:22:59  ray.welburn
 *     logout goes to Occideashome now
 *
 *     Revision 1.108  2007/09/11 23:03:12  troy.sadkowsky
 *     incorporate top menu with permissions
 *
 *     Revision 1.107  2007/09/03 00:43:52  troy.sadkowsky
 *     updates for aug 24th meeting
 *
 *     Revision 1.106  2007/08/29 12:14:22  ray.welburn
 *     Remove redundant code
 *
 *     Revision 1.105  2007/08/29 06:57:54  ray.welburn
 *     Modified maxmin to always scroll to correct position
 *
 *     Revision 1.104  2007/08/25 01:16:18  ray.welburn
 *     added todo message
 *
 *     Revision 1.103  2007/08/23 23:38:57  ray.welburn
 *     Modified for add new user
 *
 *     Revision 1.102  2007/08/20 11:53:34  troy.sadkowsky
 *     show agent rules fix
 *
 *     Revision 1.101  2007/08/14 23:16:44  troy.sadkowsky
 *     bug fix for agent updates
 *
 *     Revision 1.100  2007/08/13 00:20:57  troy.sadkowsky
 *     share jsms
 *
 *     Revision 1.99  2007/08/09 03:03:18  ray.welburn
 *     Corrected spelling mistake in questionsave that could cause problems in future
 *
 *     Revision 1.98  2007/08/08 23:55:07  troy.sadkowsky
 *     views for share jsms feature
 *
 *     Revision 1.97  2007/08/08 02:38:54  ray.welburn
 *     Correct error preventing Update Agents Action button working - modifies updateAgents to updateAgents.x
 *
 *     Revision 1.96  2007/08/06 21:55:10  troy.sadkowsky
 *     minor updates for isLInkedAJSM
 *
 *     Revision 1.95  2007/08/06 02:07:53  troy.sadkowsky
 *     removed tobtitle descriptions
 *
 *     Revision 1.94  2007/08/04 03:12:23  troy.sadkowsky
 *     removed old code and show rules view
 *
 *     Revision 1.93  2007/08/02 09:08:41  troy.sadkowsky
 *     separate rule creation from viewing mjsm
 *
 *     Revision 1.92  2007/08/02 06:19:47  ray.welburn
 *     Modified deleteJSM to check if an AJSM has associated JSM and give message that it cannot be deleted if so
 *
 *     Revision 1.91  2007/07/28 01:34:46  troy.sadkowsky
 *     agent description updates and clean mql
 *
 *     Revision 1.90  2007/07/28 01:28:44  ray.welburn
 *     Fix problem of jsm's with control characters in name not saving to file on export
 *
 *     Revision 1.89  2007/07/19 22:21:10  troy.sadkowsky
 *     rmeoved references to windows c path so app will work on linux os
 *
 *     Revision 1.88  2007/07/19 05:26:53  troy.sadkowsky
 *     remove factrequirement code
 *
 *     Revision 1.87  2007/07/18 00:01:19  troy.sadkowsky
 *     auto setting of frequency question rules
 *
 *     Revision 1.86  2007/07/04 01:38:24  Jeff.Keys
 *     jen's suggestions for delete agent text
 *
 *     Revision 1.85  2007/07/01 02:34:23  Jeff.Keys
 *     jsm comments field
 *
 *     Revision 1.84  2007/06/30 08:12:33  Jeff.Keys
 *     delete agents
 *
 *     Revision 1.83  2007/06/21 09:01:29  Troy.Sadkowsky
 *     bug fix with new job
 *
 */
package com.researchit.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.researchit.Agent;
import com.researchit.AgentExample;
import com.researchit.AgentGroup;
import com.researchit.FrozenJobSpecificModule;
import com.researchit.FrozenQA;
import com.researchit.Interview;
import com.researchit.JobHistory;
import com.researchit.JobHistoryStatus;
import com.researchit.JobSpecificModule;
import com.researchit.PossibleAnswer;
import com.researchit.Question;
import com.researchit.User;
import com.researchit.UserActionLogger;
import com.researchit.common.Participant;
import com.researchit.common.Study;
import com.researchit.expert.ExpertAgent;
import com.researchit.expert.ExpertFact;
import com.researchit.expert.ExpertFactRequirement;
import com.researchit.expert.ExpertRule;
import com.researchit.html.MasterQuestionList;
import com.researchit.io.DataGenerator;
import com.researchit.io.Exporter;

/**
 * Servlet implementation class for Servlet: ControllerServlet
 * 
 * @web.servlet name="ControllerServlet" display-name="ControllerServlet"
 * 
 * @web.servlet-mapping url-pattern="/ControllerServlet"
 * 
 */
public class ControllerServlet extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet {

	private static final long serialVersionUID = 1L;

	/*
	 * (non-Java-doc)
	 * 
	 * @see javax.servlet.http.HttpServlet#HttpServlet()
	 */
	public ControllerServlet() {
		super();
	}

	/*
	 * (non-Java-doc)
	 * 
	 * @see javax.servlet.http.HttpServlet#doGet(HttpServletRequest arg0,
	 *      HttpServletResponse arg1)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	/*
	 * (non-Java-doc)
	 * 
	 * @see javax.servlet.http.HttpServlet#doPost(HttpServletRequest arg0,
	 *      HttpServletResponse arg1)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String strScrollPos = "0";
		try {
			if (request.getSession().getAttribute("UserObject") != null) {
				User user = (User) request.getSession().getAttribute("UserObject");
				request.getSession().removeAttribute("stringCheckedIDsList");
				if (request.getParameter("scrollPos") != null) {
					strScrollPos = request.getParameter("scrollPos");
					request.setAttribute("scrollPos", strScrollPos);
				}
				if (request.getParameter("Action") != null) {
					UserActionLogger ual = new UserActionLogger(Integer.parseInt(user.getId()), this.getAction(request));
					if (!ual.getAction().equals("-")) {
						ual.saveActionLog();
					}
					this.separateIdFromNames(request);
					if (request.getParameter("logout.x") != null) {
						this.logOut(request, response);
					} else if (request.getParameter("switchToViewMode.x") != null) {
						this.switchToViewMode(request, response);
					} else if (request.getParameter("switchToListMode.x") != null) {
						this.switchToListMode(request, response);
					} else if (request.getParameter("switchToAgents.x") != null) {
						this.switchToAgents(request, response);
					} else if (request.getParameter("switchToStructure.x") != null) {
						this.switchToStructure(request, response);
					} else if (request.getParameter("previewInterview.x") != null) {
						this.previewInterview(request, response);
					} else if (request.getParameter("studyManager.x") != null) {
						this.studyManager(request, response);
					} else if (request.getParameter("minMax.x") != null) {
						this.minMaxQA(request, response);
					} else if (request.getParameter("GlobalMinMaximise.x") != null) {
						this.globalMinMax(request, response);
					} else if (request.getAttribute("newPossibleAnswer.x") != null) {
						this.newPossibleAnswer(request, response);
					} else if (request.getParameter("newKeyPhrase.x") != null) {
						this.newKeyPhrase(request, response);
					} else if (request.getParameter("deleteRule.x") != null) {
						this.deleteRule(request, response);
					} else if (request.getParameter("editRule.x") != null) {
						this.editRule(request, response);
					} else if (request.getParameter("removeDuplicateRules.x") != null) {
						this.removeDupliacteRules(request, response);
					} else if (request.getParameter("validateRules.x") != null) {
						this.validateRules(request, response);
					} else if (request.getParameter("defaultFrequencyRules.x") != null) {
						this.defaultFrequencyRules(request, response);
					} else if (request.getParameter("updateRule.x") != null) {
						this.updateRule(request);
						request.setAttribute("script","flashSaveSuccessful();");
						RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
						dis.forward(request, response);
					} else if (request.getAttribute("addORRequirementL1.x") != null) {
						if (this.updateRule(request)){						
						this.addORRequirementL1(request, response);
						}
					} else if (request.getParameter("addORRequirementL2.x") != null) {
						if (this.updateRule(request)){						
						this.addORRequirementL2(request, response);
						}
					} else if (request.getParameter("addANDFactL1.x") != null) {
						if (this.updateRule(request)) {
							this.addANDFactL1(request, response);
						}
					} else if (request.getParameter("addANDFactL2.x") != null) {
						if (this.updateRule(request)) {
							this.addANDFactL2(request, response);
						}
					} else if (request.getParameter("addLevelRule") != null) {
						this.copyRule(request, response);
					} else if (request.getParameter("removeFact") != null) {
						this.removeFact(request, response);
					} else if (request.getParameter("removeFactRequirement") != null) {
						this.removeFactRequirement(request, response);
					} else if (request.getParameter("addANDJHFactL1.x") != null) {
						if (this.updateRule(request)){
							this.addANDJHFactL1(request, response);
						}
					} else if (request.getParameter("addANDJHFactL2.x") != null) {
						if (this.updateRule(request)){
							this.addANDJHFactL2(request, response);
						}
					} else if (request.getParameter("closeEdit.x") != null) {
						this.closeEditMode(request, response);
					} else if (request.getParameter("updateRule") != null) {
						this.updateRule(request);
						RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
						dis.forward(request, response);
					}  else if (request.getAttribute("addNumberedAnswer") != null) {
						this.questionSaveText(request);
						this.addNumberAnswer(request, response);
					} else if (request.getAttribute("addFreeTextAnswer") != null) {
						this.questionSaveText(request);
						this.addFreeTextAnswer(request, response);
					} else if (request.getAttribute("addPossibleAnswer") != null) {
						this.questionSaveText(request);
						this.addPossibleAnswer(request, response);
					} else if (request.getAttribute("addYesNoPossibleAnswers") != null) {
						this.questionSaveText(request);
						this.addYesNoPossibleAnswers(request, response);
					} else if (request.getParameter("linkAJSM.x") != null) {
						this.linkAJSM(request, response);
					} else if (request.getParameter("minimise.x") != null) {
						this.minimiseActionButtons(request, response);
					} else if (request.getParameter("maximise.x") != null) {
						this.maximiseActionButtons(request, response);
					} else if (request.getParameter("printView.x") != null) {
						this.printView(request, response);
					} else if (request.getParameter("shareJSMs.x") != null) {
						this.shareJSMsView(request, response);
					} else if (request.getParameter("saveSharedJSMs.x") != null) {
						this.shareJSMs(request, response);
					} else if (request.getParameter("importJSM.x") != null) {
						this.openImportJSMWindow(request, response);
					} else if (request.getParameter("exportJSM.x") != null) {
						this.exportJSM(request, response);
					} else if (request.getParameter("deleteJSM.x") != null) {
						this.deleteJSM(request, response);
					} else if (request.getParameter("copyJSMs.x") != null) {
						this.copyJSMs(request, response);
					} else if (request.getParameter("editJSMs.x") != null) {
						this.newOrEditJSMs(request, response);
					} else if (request.getParameter("addJSM.x") != null) {
						this.newOrEditJSMs(request, response);
					} else if (request.getParameter("questionDelete.x") != null) {
						this.deleteQuestions(request, response);
					} else if (request.getParameter("toggleAgents.x") != null) {
						this.toggleAgents(request, response);
					} else if (request.getParameter("editSelectedQuestion.x") != null) {
						this.editSelectedMode(request, response);
					} else if (request.getParameter("addFreqQuestion.x") != null) {
						this.addFreqQuestion(request, response);
					} else if (request.getParameter("addProbabilityQuestion.x") != null) {
						this.addProbabilityQuestion(request, response);
					} else if (request.getParameter("structureRemove.x") != null) {
						this.structureRemoveQsPAs(request, response);
					} else if (request.getParameter("moveUp.x") != null) {
						this.moveQsPAsUp(request, response);
					} else if (request.getParameter("moveDown.x") != null) {
						this.moveQsPAsDown(request, response);
					} else if (request.getParameter("copy.x") != null) {
						this.copy(request, response);
					} else if (request.getParameter("paste.x") != null) {
						this.paste(request, response);
					}  else if (request.getParameter("agentNew.x") != null) {
						this.addAgent(request, response);
					} else if (request.getParameter("agentEdit.x") != null) {
						this.editAgent(request, response);
					} else if (request.getParameter("deleteAgents.x") != null) {
						this.deleteAgents(request, response);
					} else if (request.getParameter("saveAgent.x") != null) {
						this.saveAgent(request, response);
					} else if (request.getParameter("viewRules.x") != null) {
                        this.showRules(request, response);
                    } else if (request.getParameter("toExcel.x") != null) {
						this.toExcel(request, response);
					} else if (request.getParameter("simpleHigh.x") != null) {
						this.simpleHigh(request, response);
					} else if (request.getParameter("simpleMedium.x") != null) {
						this.simpleMedium(request, response);
					} else if (request.getParameter("simpleLow.x") != null) {
						this.simpleLow(request, response);
					} else if (request.getParameter("simpleUnknown.x") != null) {
						this.simpleUnknown(request, response);
					} else if (request.getParameter("simplePossible.x") != null) {
						this.simplePossible(request, response);
					} else if (request.getParameter("removeAgentGroup") != null) {
						this.removeAgentGroup(request, response);
					} else if (request.getParameter("saveJSM.x") != null) {
						this.saveJSMs(request, response);
					} else if (request.getParameter("copyRules.x") != null) {
						this.copyRules(request, response);
					} else if (request.getParameter("pasteRules.x") != null) {
						this.pasteRules(request, response);
					} else if (request.getParameter("updateAgents.x") != null) {
						this.updateAgents(request, response);
					} else if (request.getParameter("saveQuestions.x") != null) {
						this.questionSaveText(request, response);
					} else if (request.getAttribute("removePossibleAnswer") != null) {
						this.questionSaveText(request);
						this.removePossibleAnswer(request, response);
					} else if (request.getAttribute("linkAJSMToJSM") != null) {
						this.linkOrImportAJSMToJSM(request, response);
					} else if (request.getAttribute("removeAJSMFromJSM") != null) {
						this.removeAJSM(request, response);
					} else if (request.getAttribute("linkAJSMToAnswer") != null) {
						this.linkOrImportAJSMToAnswer(request, response);
					} else if (request.getAttribute("removeAJSMFromAnswer") != null) {
						this.removeAJSMFromAnswer(request, response);
					} else if (request.getParameter("Clear.x") != null) {
						this.clearSearchString(request, response);
					} else if (request.getAttribute("MinMax.x") != null) {
						this.minimizeMaximise(request, response);
					} else if (request.getParameter("userSearchString") != null && !request.getParameter("userSearchString").equals("")) {
						this.forwardUserSearchString(request, response);
					} else if ((request.getParameter("searchString") != null)&&(!request.getParameter("searchString").equalsIgnoreCase("Word Search"))) {
						this.forwardSearchString(request, response);
					} else {
						String action = request.getParameter("Action");
						if (action.equalsIgnoreCase("MinMax")) {
							this.minimizeMaximise(request, response);
						} else if (action.equalsIgnoreCase("interviewSaveAnswer")) {										
							this.saveInterviewAnswerAndFindNextQuestion(request, response);					
						} else {
							throw new Exception("OccIDEAS Exception 'No Action Type'");
						}
					}
				} else {
					throw new Exception("OccIDEAS Exception 'No Action'");
				}
			} else {
				this.logOut(request, response);
			}

		} catch (Throwable e) {
			e.printStackTrace();
			request.setAttribute("errorMessage", e.getMessage());
			RequestDispatcher dis = request.getRequestDispatcher("errorpage.jsp");
			dis.forward(request, response);
		}
	}
	private void switchToViewMode(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getSession().setAttribute("ViewMode","true");
		request.getSession().removeAttribute("ListMode");
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}
	private void switchToListMode(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getSession().setAttribute("ListMode","true");
		request.getSession().removeAttribute("ViewMode");
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}

	private void switchToAgents(HttpServletRequest request, HttpServletResponse response) throws Exception {
		this.setQuestionIdsInSession(request,response);
		request.getSession().setAttribute("Location","Agents");
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}
	private void switchToStructure(HttpServletRequest request, HttpServletResponse response) throws Exception {
		this.setQuestionIdsInSession(request,response);
		request.getSession().setAttribute("Location","Structure");
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}
	@SuppressWarnings("rawtypes")
	private void setQuestionIdsInSession(HttpServletRequest request, HttpServletResponse response) throws Exception{
		Enumeration postedvalues = request.getParameterNames();
		ArrayList<Question> qs = new ArrayList<Question>();
		ArrayList<PossibleAnswer> pas = new ArrayList<PossibleAnswer>();

		String stringQuestionIDs = "";
		String stringAllIDs = "";
		while (postedvalues.hasMoreElements()) {
			String strPost = postedvalues.nextElement().toString();
			if (strPost.contains("questionsCheckBox")) {
				String lqID = strPost.substring(strPost.indexOf("_") + 1);
				Question q = new Question("", lqID);
				q.resetSequences();
				if(!(qs.contains(q))){
					qs.add(q);
				}				
				stringAllIDs += lqID + ",";
			}
			if (strPost.contains("possibleAnswersCheckBox")) {
				String jsmlqpaID = strPost.substring(strPost.indexOf("_") + 1);
				PossibleAnswer pa = new PossibleAnswer("", jsmlqpaID);
				if(!(pas.contains(pa))){
					pas.add(pa);
				}				
				stringAllIDs += jsmlqpaID + ",";
			}
		}
		if (pas.size() > 0) {
			for (PossibleAnswer pa : pas) {
				Question q = new Question("", pa.getJsmQuestionStructureID());
				if(!(qs.contains(q))){
					qs.add(q);
				}			
			}
		}
		if (qs.size() > 0) {
			Collections.sort(qs);
			for (Question q : qs) {
				stringQuestionIDs += q.getJsmQuestionStructureID() + ",";
			}
			request.getSession().setAttribute("QuestionIDs", stringQuestionIDs);
		}
		String scrollPos = request.getAttribute("scrollPos").toString();
		request.getSession().setAttribute("ScrollPos", scrollPos);
		request.setAttribute("scrollPos", "0");
		request.getSession().setAttribute("stringCheckedIDsList", stringAllIDs);
	}
	private void toExcel(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		JobSpecificModule jsm = new JobSpecificModule(request.getSession().getAttribute("JSMID").toString());
		response.setContentType("application/xls");
		response.setHeader("Content-disposition","attachment;filename=\""+jsm.getName()+".csv\"");
		MasterQuestionList mql = new MasterQuestionList();
		response.getOutputStream().print(mql.showRulesReportExcel(jsm));

		
	}

	private void defaultFrequencyRules(HttpServletRequest request, HttpServletResponse response) throws Exception {
		JobSpecificModule jsm = new JobSpecificModule(request.getSession().getAttribute("JSMID").toString());
		DataGenerator dg = new DataGenerator();
		dg.fixFrequencyRules(jsm);
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}

	private void studyManager(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.sendRedirect("../StudyMgr/ValidateServlet");
	}

	private void validateRules(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("ValidateMode", true);
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}
	private void removeDupliacteRules(HttpServletRequest request, HttpServletResponse response) throws Exception {
		JobSpecificModule jsm = new JobSpecificModule(request.getSession().getAttribute("JSMID").toString());
		ExpertAgent ea1 = new ExpertAgent(request.getSession().getAttribute("AgentID").toString());
		ArrayList<ExpertRule> array1 = ea1.getJSMRules(jsm.getId());
		ArrayList<ExpertRule> array2 = ea1.getJSMRules(jsm.getId());
		//int iSize = array1.size();
		int iCount = 0;
		for(ExpertRule er1:array1){
			for(ExpertRule er2: array2){
				if(!(er1.equals(er2))){
					if(er2.sameAs(er1)){							
						er1.delete();
						break;
					}
				}				
			}
			iCount++;
		}	
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}
	private void globalMinMax(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.getSession().setAttribute("GlobalMinMax", request.getParameter("GlobalMinMaxState"));
		JobSpecificModule jsm = new JobSpecificModule(request.getSession().getAttribute("JSMID").toString());
		if (request.getSession().getAttribute("GlobalMinMax").toString().equals("minimise")) {
			//minimise all Qs and As in jsm
			request.getSession().setAttribute("minimisedQuestionIds",jsm.getJsmQuestionsAnswersIDList());
		}else{
			request.getSession().setAttribute("minimisedQuestionIds", null);
		}			
		String scrollPos = request.getAttribute("scrollPos").toString();
		request.getSession().setAttribute("ScrollPos", scrollPos);
		request.setAttribute("scrollPos", "0");
		
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}	
	@SuppressWarnings("rawtypes")
	private void minMaxQA(HttpServletRequest request, HttpServletResponse response) throws Exception{
		Enumeration postedvalues = request.getParameterNames();
		ArrayList<String> stringAllIDs = new ArrayList<String>();
		while (postedvalues.hasMoreElements()) {
			String strPost = postedvalues.nextElement().toString();
			if (strPost.contains("questionsCheckBox")) {
				String lqID = strPost.substring(strPost.indexOf("_") + 1);
				stringAllIDs.add(lqID);
			}
			if (strPost.contains("possibleAnswersCheckBox")) {
				String jsmlqpaID = strPost.substring(strPost.indexOf("_") + 1);
				stringAllIDs.add(jsmlqpaID);
			}
		}
		//update the list of minimised questions for each ticked box
		for (String str : stringAllIDs) {
			request.setAttribute("questionId", str);
			updateMinimisedQuestionList(request);
		}
		String scrollPos = request.getAttribute("scrollPos").toString();
		request.getSession().setAttribute("ScrollPos", scrollPos);
		request.setAttribute("scrollPos", "0");
		
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}	
	@SuppressWarnings("rawtypes")
	private void copyJSMs(HttpServletRequest request, HttpServletResponse response) throws Exception {
		if (request.getSession().getAttribute("JSMID") != null) {
			JobSpecificModule jsm = new JobSpecificModule(request.getSession().getAttribute("JSMID").toString());
			jsm.copy();
			request.getSession().setAttribute("JSMID",jsm.getId());
		} else {
			Enumeration postedvalues = request.getParameterNames();
			while (postedvalues.hasMoreElements()) {
				String strPost = postedvalues.nextElement().toString();
				if (strPost.contains("jsmsCheckBox")) {
					String jsmID = strPost.substring(strPost.indexOf("_") + 1);
					JobSpecificModule jsm = new JobSpecificModule(jsmID);
					jsm.copy();
				}
			}
		}
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}
	private void newPossibleAnswer(HttpServletRequest request, HttpServletResponse response) throws Exception {
		this.questionSaveText(request);
		String paId = request.getAttribute("newPossibleAnswer").toString();
		PossibleAnswer pa = new PossibleAnswer("", paId);

		String strText = "New Possible Answer";
		pa.setName(strText);
		int i = 1;
		while (pa.exists()) {
			pa.setId("");
			pa.setName(strText + i);
			if (i == 30) {
				throw new Exception("Add Possible Answer Failed: Max default exceeded");
			}
			i++;
		}	
		pa.setDescription(pa.getName());
		pa.unLinkFromParentQuestion();
		pa.insert();
		pa.linkToQuestion("", pa.getJsmQuestionStructureID());
		JobSpecificModule jsm = new JobSpecificModule(request.getSession().getAttribute("JSMID").toString());
		jsm.updateTimeStamp();
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}
	@SuppressWarnings("rawtypes")
	private void newKeyPhrase(HttpServletRequest request, HttpServletResponse response) throws Exception {
		Question q = new Question();
		Enumeration postedvalues = request.getParameterNames();
		while (postedvalues.hasMoreElements()) {
			String strPost = postedvalues.nextElement().toString();
			if (strPost.contains("paName")) {
				String paId = strPost.substring(strPost.indexOf("_") + 1);
				String strName = request.getParameter(strPost);
				if (!(paId.equalsIgnoreCase(""))) {
					PossibleAnswer pa = new PossibleAnswer("", paId);
					if(strName.trim().equalsIgnoreCase("")){
						pa.unLinkFromParentQuestion();
					}else{
						pa.setName(strName);
						pa.setDescription(strName);
						pa.update1();
						JobSpecificModule jsm = new JobSpecificModule(request.getSession().getAttribute("JSMID").toString());
						jsm.updateTimeStamp();
					}
				}
			}
			if (strPost.contains("qDescription")) {
				String qLinkedID = strPost.substring(strPost.indexOf("_") + 1);
				String strDescription = request.getParameter(strPost);

				String strType = request.getParameter("qType_" + qLinkedID);
				String strNotes = request.getParameter("qNotes_" + qLinkedID);
				String strIsMultiple = request.getParameter("qIsMultiple"
						+ qLinkedID);
				boolean bIsMultiple = false;
				if (strIsMultiple != null) {
					bIsMultiple = true;
				}
				String strViewWithParent = request.getParameter("viewWithParent"
						+ qLinkedID);
				boolean bviewWithParent = false;
				if (strViewWithParent != null) {
					bviewWithParent = true;
				}
				q = new Question("", qLinkedID);
				String oldQId = q.getId();
				String strText = "New Question";
				q.setName(strText);
				int i = 1;
				while (q.exists()) {
					q.setId("");
					q.setName(strText + i);
					if (i == 1000) {
						throw new Exception("Add Question Failed: Max default exceeded");
					}
					i++;
				}
				q.setDescription(strDescription);
				q.setTypeID(strType);
				q.setNotes(strNotes);
				q.setMultiple(bIsMultiple);
				q.setViewWithParent(bviewWithParent);								
				q.insert();
				JobSpecificModule jsm = new JobSpecificModule(q.getJsmID());
				jsm.updateTimeStamp();
				q.relink();
				//update all rules that use this question
				for(Agent agent : jsm.getAgents()){
					boolean bUpdateRule = false;
					for(ExpertRule er: jsm.getRules(agent)){
						for(ExpertFact ef: er.getFacts()){
							for(ExpertFactRequirement efr: ef.getFactRequirements()){
								if(efr.getQuestionId().equalsIgnoreCase(oldQId)){
									efr.setQuestionId(q.getId());
									efr.save();
									bUpdateRule = true;
								}
							}
						}
						if(bUpdateRule){
							er.save();
							bUpdateRule = false;
						}
					}
				}
			}
		}		
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}
	private void pasteRules(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String copyRulesAgentId = request.getSession().getAttribute("CopyRulesAgentID").toString();
		String agentID = request.getSession().getAttribute("AgentID").toString();
		String jsmID = request.getSession().getAttribute("JSMID").toString();
		ExpertAgent copyAgent = new ExpertAgent(copyRulesAgentId);
		for(ExpertRule er:copyAgent.getRules()){
			String id = er.copy();
			ExpertRule copyRule = new ExpertRule(id);
			copyRule.setAgentId(agentID);
			copyRule.setJsmId(jsmID);
			copyRule.save();
		}
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}
	private void copyRules(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String agentID = request.getSession().getAttribute("AgentID").toString();
		request.getSession().setAttribute("CopyRulesAgentID", agentID);
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}
	@SuppressWarnings("rawtypes")
	private void shareJSMs(HttpServletRequest request, HttpServletResponse response) throws Exception {
		Enumeration postedvalues = request.getParameterNames();
		String jsmId = request.getSession().getAttribute("JSMID").toString();
		JobSpecificModule jsm = new JobSpecificModule(jsmId);
		jsm.removeSharedUsers();
		while (postedvalues.hasMoreElements()) {
			String strPost = postedvalues.nextElement().toString();
			if (strPost.contains("usersCheckBox")) {
				String id = strPost.substring(strPost.indexOf("_") + 1);
				jsm.shareWithUser(id);				
			}
		}
		request.getSession().removeAttribute("searchedusers");
		request.getSession().setAttribute("ShareJSMs", true);
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}
	@SuppressWarnings("rawtypes")
	private void shareJSMsView(HttpServletRequest request, HttpServletResponse response) throws Exception {
		Enumeration postedvalues = request.getParameterNames();
		String strJSMIds = "";
		while (postedvalues.hasMoreElements()) {
			String strPost = postedvalues.nextElement().toString();
			if (strPost.contains("jsmsCheckBox")) {
				String jsmID = strPost.substring(strPost.indexOf("_") + 1);
				strJSMIds += jsmID+",";				
			}
		}
		if(request.getSession().getAttribute("JSMID")!=null){
			String jsmID = request.getSession().getAttribute("JSMID").toString();
			strJSMIds += jsmID+",";	
		}
		request.getSession().setAttribute("ShareJSMs", true);
		request.getSession().setAttribute("JSMIDs", strJSMIds);
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}
	private void copyRule(HttpServletRequest request,HttpServletResponse response) throws Exception {
		String levelRuleId = request.getParameter("addLevelRule");
		
		ExpertRule levelRule = new ExpertRule(levelRuleId);
		String id = levelRule.copy();		
		this.resetRuleSequences(levelRule,request);
		
		request.getSession().setAttribute("RuleID", id);
		request.getSession().removeAttribute("LevelRuleID");
		
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}
	private void removeFact(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String factId = request.getParameter("removeFact");
		String ruleId = request.getParameter("removeFromRuleId");
		ExpertFact ef = new ExpertFact(factId);
		ef.removeFromRule(ruleId);
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}
	private void removeFactRequirement(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String factRequirementId = request.getParameter("removeFactRequirement");
		String factId = request.getParameter("removeFromFactId");
		ExpertFactRequirement efr = new ExpertFactRequirement(factRequirementId);
		efr.delete();

		String qid = efr.getQuestionId();
		Question q = new Question(qid);
		String factName = q.getName().replace(" ", "_");
		factName += "-";
		ExpertFact fact = new ExpertFact(factId);
		fact.setName(factName);

		for (ExpertFactRequirement tempEfr : fact.getFactRequirements()) {
			PossibleAnswer pa = new PossibleAnswer(tempEfr.getAnswerId());
			factName += pa.getName().replace(" ", "_") + ",";
		}
		factName = factName.substring(0, factName.lastIndexOf(","));
		fact.setName(factName);
		fact.save();

		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}
	private void deleteRule(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String id = request.getSession().getAttribute("RuleID").toString();
		ExpertRule rule = new ExpertRule(id);
		rule.delete();
		//reset all sequences
		this.resetRuleSequences(rule,request);
		
		request.getSession().removeAttribute("RuleID");
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}
	private void editRule(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.getSession().setAttribute("editRuleMode", true);
		
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}
	private void resetRuleSequences(ExpertRule rule, HttpServletRequest request) throws Exception {
		int iCount = 1;
		String jsmId = request.getSession().getAttribute("JSMID").toString();
		//JobSpecificModule jsm = new JobSpecificModule(jsmId);
		String agentId = request.getSession().getAttribute("AgentID").toString();
		ExpertAgent ea = new ExpertAgent(agentId);
		for(ExpertRule er:ea.getJSMRules(jsmId)){
			if(er.getJsmId().equalsIgnoreCase(jsmId)){
				if(er.getLevelTypeId().equalsIgnoreCase(rule.getLevelTypeId())){
					er.setSequence(iCount);
					iCount++;
				}
				er.save();
			}
		}
	}
	private void simpleUnknown(HttpServletRequest request, HttpServletResponse response) throws Exception {
		this.simpleRule(request, response, ExpertRule.PROBABLEUNKNOWN);
	}
	private void simpleLow(HttpServletRequest request, HttpServletResponse response) throws Exception {
		this.simpleRule(request, response, ExpertRule.PROBABLELOW);
	}
	private void simpleMedium(HttpServletRequest request, HttpServletResponse response) throws Exception {
		this.simpleRule(request, response, ExpertRule.PROBABLEMEDIUM);
	}
	private void simpleHigh(HttpServletRequest request, HttpServletResponse response) throws Exception {
		this.simpleRule(request, response, ExpertRule.PROBABLEHIGH);
	}
	private void simplePossible(HttpServletRequest request, HttpServletResponse response) throws Exception {
		this.simpleRule(request, response, ExpertRule.POSSIBLEUNKNOWN);
	}
	@SuppressWarnings("rawtypes")
	private void simpleRule(HttpServletRequest request, HttpServletResponse response, String ruleLevelId) throws Exception {
		Enumeration postedvalues = request.getParameterNames();
		String agentId = request.getSession().getAttribute("AgentID").toString();
		ExpertAgent ea = new ExpertAgent(agentId);
		String jsmId = request.getSession().getAttribute("JSMID").toString();
		JobSpecificModule jsm = new JobSpecificModule(jsmId);
		jsm.updateTimeStamp();
		int iCount = 1;
		for(ExpertRule er:ea.getJSMRules(jsm.getId())){
			if(er.getLevelTypeId().equalsIgnoreCase(ruleLevelId)){
				iCount++;
			}
		}
		while (postedvalues.hasMoreElements()) {
			String strPost = postedvalues.nextElement().toString();
			if (strPost.contains("possibleAnswersCheckBox")) {
				String id = strPost.substring(strPost.indexOf("_") + 1);
				PossibleAnswer pa = new PossibleAnswer("", id);
				
				ExpertRule erProbable = new ExpertRule();
				erProbable.setTypeId(ExpertRule.TYPEPROBABILITY.toString());
				erProbable.setLevelTypeId(ruleLevelId);
				ExpertFact fact = new ExpertFact();
				Question q = new Question("", pa.getJsmQuestionStructureID());
				String factName = q.getName().replace(" ", "_");
				factName += "-";
				factName += pa.getName().replace(" ", "_");
				fact.setName(factName);
				fact.insert();

				ExpertFactRequirement efr = new ExpertFactRequirement();
				efr.setAnswerId(pa.getId());
				efr.setQuestionId(q.getId());
				efr.setFactId(fact.getId());
				efr.save();

				erProbable.setAgentId(agentId);
				erProbable.setJsmId(jsmId);
				erProbable.setSequence(iCount);
				erProbable.save();
				erProbable.addFact(fact);
				
//				 attempt to auto set freq
				if (pa.hasFrequencyQuestions()) {
					Question qFreqWks = pa.getFrequencyWeeksQuestion();
					if (qFreqWks != null) {
						ExpertRule erf = new ExpertRule();
						erf.setTypeId(ExpertRule.TYPEFREQUENCYWEEKS);
						erf.setFrequencyWeeksQId(qFreqWks
								.getJsmQuestionStructureID());
						erf.setAgentId(agentId);
						erf.setJsmId(jsmId);
						erf.setParentId(erProbable.getId());
						erf.save();
					}
					Question qFreqHours = pa.getFrequencyHoursQuestion();
					if (qFreqHours != null) {
						ExpertRule erf = new ExpertRule();
						erf.setTypeId(ExpertRule.TYPEFREQUENCYHOURS);
						erf.setFrequencyHoursQId(qFreqHours
								.getJsmQuestionStructureID());
						erf.setAgentId(agentId);
						erf.setJsmId(jsmId);
						erf.setParentId(erProbable.getId());
						erf.save();
					}
				}
				break;
			}
		}
		request.setAttribute("showRules", true);
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}
	private void showRules(HttpServletRequest request, HttpServletResponse response) throws Exception {   
		//minimise all frequency ques
		//String id = request.getSession().getAttribute("JSMID").toString();
		//JobSpecificModule jsm = new JobSpecificModule(id);
		//ArrayList<String> minimisedQuestions = new ArrayList<String>();
		//if (request.getSession().getAttribute("minimisedQuestionIds") != null) {
		//	ArrayList array = (ArrayList) request.getSession().getAttribute("minimisedQuestionIds");
		//	for (Iterator it = array.iterator(); it.hasNext();) {
		//		minimisedQuestions.add(it.next().toString());
		//	}
		//}
		//for(PossibleAnswer pa:jsm.getPossibleAnswersList()){
		//	if(pa.hasFrequencyQuestions()){
		//		minimisedQuestions.add(pa.getJsmQuestionPossibleAnswerStructureID());
		//	}
		//}
		//request.getSession().setAttribute("minimisedQuestionIds",minimisedQuestions);
    	request.getSession().setAttribute("ShowRules", true);         
        RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
        dis.forward(request, response);
    }
	private void addANDJHFactL1(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String ruleId = request.getParameter("ruleid");
		addANDJHFact(request,response,ruleId);
	}
	private void addANDJHFactL2(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String ruleId = request.getParameter("childruleid");
		addANDJHFact(request,response, ruleId);
	}
	private void addANDJHFact(HttpServletRequest request, HttpServletResponse response, String ruleId) throws Exception {
		ExpertRule er = new ExpertRule(ruleId);

		String factName = "temp";
		ExpertFact fact = new ExpertFact();
		fact.setName(factName);
		fact.insert();

		String jha = "yearStarted";
		String condition = "Before";
		String jhv = "1950";
		factName = jha.replace(" ", "_");
		ExpertFactRequirement efr = new ExpertFactRequirement();

		efr.setFactId(fact.getId());
		efr.setType("JH");
		efr.setJobHistoryAttribute(jha);

		efr.setCondition(condition);
		efr.setJobHistoryValue(jhv);
		efr.save();
		factName += "_" + condition + "-" + jhv.replace(" ", "_");

		fact.setName(factName);
		fact.save();

		er.addFact(fact);

		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}
	private void addANDFactL1(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String ruleId = request.getParameter("ruleid");
		addANDFact(request,response,ruleId);
	}
	private void addANDFactL2(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String ruleId = request.getParameter("childruleid");
		addANDFact(request,response, ruleId);
	}
	private void addANDFact(HttpServletRequest request, HttpServletResponse response, String ruleId) throws Exception {
		ExpertRule er = new ExpertRule(ruleId);
		String agentId = request.getSession().getAttribute("AgentID").toString();

		String jsmId = request.getSession().getAttribute("JSMID").toString();
		JobSpecificModule jsm = new JobSpecificModule(jsmId);
		Question q = jsm.getMjsmsQuestions(agentId).get(0);

		PossibleAnswer pa = q.getPossibleAnswers().get(0);

		ExpertFact fact = new ExpertFact();
		String factName = q.getName().replace(" ", "_");
		factName += "-";
		fact.setName(factName);
		fact.setRuleId(er.getId());
		fact.insert();
		ExpertFactRequirement efr = new ExpertFactRequirement();
		efr.setAnswerId(pa.getId());
		efr.setQuestionId(q.getId());
		efr.setFactId(fact.getId());
		if (!(fact.getFactRequirements().contains(efr))) {
			factName += pa.getName().replace(" ", "_") + ",";
			fact.setName(factName);
			efr.save();
		}
		fact.save();
		er.addFact(fact);

		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}
	private void addORRequirementL2(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String factId = request.getParameter("l2efid");
		addORRequirement(request, response, factId);
	}
	private void addORRequirementL1(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String factId = request.getAttribute("efid").toString();
		addORRequirement(request, response, factId);
	}
	private void addORRequirement(HttpServletRequest request, HttpServletResponse response, String factId) throws Exception {
		ExpertFact fact = new ExpertFact(factId);
		String jsmId = request.getSession().getAttribute("JSMID").toString();
		JobSpecificModule jsm = new JobSpecificModule(jsmId);
		String agentId = request.getSession().getAttribute("AgentID").toString();
		Question q = jsm.getMjsmsQuestions(agentId).get(0);

		PossibleAnswer pa = q.getPossibleAnswers().get(0);

		ExpertFactRequirement efr = new ExpertFactRequirement();
		efr.setAnswerId(pa.getId());
		efr.setQuestionId(q.getId());
		efr.setFactId(fact.getId());

		efr.save();
		String factName = fact.getName() + "_OR_";
		if (!(fact.containsQuestion(q))) {
			factName += q.getName().replace(" ", "_");
		}
		factName += pa.getName().replace(" ", "_");

		fact.setName(factName);
		fact.save();

		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}
	private boolean updateRule(HttpServletRequest request) throws Exception {
		boolean retValue = false;
		String ruleId = request.getParameter("updateRule");
		ExpertRule er = new ExpertRule(ruleId);
		boolean bUpdateFreqs = true;
		if(request.getParameter("singleTypeRule")!=null){
			for (ExpertFact ef : er.getFacts()) {
				String factname = "";
				for (ExpertFactRequirement efr : ef.getFactRequirements()) {
					if (efr.getType().equalsIgnoreCase("JH")) {
						String condition = request.getParameter("condition_"
								+ efr.getId());
						String jhValue = request.getParameter("jhValue_"
								+ efr.getId());
						factname += efr.getJobHistoryAttribute() + "_" + condition
								+ "_" + jhValue;
						efr.setCondition(condition);
						efr.setJobHistoryValue(jhValue);
					} else {
						String qid = request.getParameter("frQuestion_"
								+ efr.getId());
						String aid = request.getParameter("frAnswer_" + efr.getId());
						Question q = new Question(qid);
						PossibleAnswer pa = new PossibleAnswer(aid);
						factname = q.getName().replace(" ", "_");
						factname += "-";
						factname += pa.getName().replace(" ", "_");
						efr.setQuestionId(qid);
						efr.setAnswerId(aid);						
					}
					efr.save();
				}
				ef.setName(factname);
				ef.update();
			}
			//auto set frequency rules
			if(bUpdateFreqs){
		        
				String freqWks = request.getParameter("freqQuestionWks_"
						+ er.getId());
				if (freqWks.equalsIgnoreCase("JH")) {
					ExpertRule erf = er.getFrequencyWeeksRule();
					if (!(erf.getId().equalsIgnoreCase(""))) {
						erf.delete();
					}
					er.removeChildRules(ExpertRule.TYPEFREQUENCYWEEKS);
				} else {
					ExpertRule erf = er.getFrequencyWeeksRule();
					if (!(erf.getId().equalsIgnoreCase(""))) {
						erf.delete();
					}
					erf.setId("");
					erf.setTypeId(ExpertRule.TYPEFREQUENCYWEEKS);
					erf.setFrequencyWeeksQId(freqWks);
					erf.setAgentId(er.getAgentId());
					erf.setJsmId(er.getJsmId());
					erf.setParentId(er.getId());
					erf.save();
				}
				String freqHrs = request.getParameter("freqQuestionHrs_"+ er.getId());
				if (freqHrs.equalsIgnoreCase("JH")) {
					ExpertRule erf = er.getFrequencyHoursRule();
					if (!(erf.getId().equalsIgnoreCase(""))) {
						erf.delete();
					}
					er.removeChildRules(ExpertRule.TYPEFREQUENCYHOURS);
				} else {
					ExpertRule erf = er.getFrequencyHoursRule();
					if (!(erf.getId().equalsIgnoreCase(""))) {
						erf.delete();
					}
					erf.setId("");
					erf.setTypeId(ExpertRule.TYPEFREQUENCYHOURS);
					erf.setFrequencyHoursQId(freqHrs);
					erf.setAgentId(er.getAgentId());
					erf.setJsmId(er.getJsmId());
					erf.setParentId(er.getId());
					erf.save();
				}
			}			
			String ruleLevelTypeId = request.getParameter("singleTypeRule");
			er.setLevelTypeId(ruleLevelTypeId);
			String ruleAgentId = request.getParameter("ruleagent");
			if(!(ruleAgentId.equalsIgnoreCase(er.getAgentId()))){
				request.getSession().setAttribute("AgentID", ruleAgentId);
			}
			er.setAgentId(ruleAgentId);
			String jsmId = request.getSession().getAttribute("JSMID").toString();
			er.setJsmId(jsmId);
			er.save();
			retValue = true;
		}
		if(retValue){
			this.resetRuleSequences(er,request);
		}		
		return retValue;
	}
	@SuppressWarnings("rawtypes")
	private void linkAJSM(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Enumeration postedvalues = request.getParameterNames();
		while (postedvalues.hasMoreElements()) {
			String strPost = postedvalues.nextElement().toString();
			if (strPost.contains("possibleAnswersCheckBox")) {
				String id = strPost.substring(strPost.indexOf("_") + 1);
				request.getSession().setAttribute("PossibleAnswerID", id);
			}
		}
		String scrollPos = request.getAttribute("scrollPos").toString();
		request.getSession().setAttribute("ScrollPos", scrollPos);
		request.setAttribute("scrollPos", "0");
		request.setAttribute("linkAJSM", true);
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}
	private void printView(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("printView", true);
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}
	@SuppressWarnings("rawtypes")
	private void saveAgent(HttpServletRequest request, HttpServletResponse response) throws Exception {
		Enumeration postedvalues = request.getParameterNames();
		Agent agent = null;
		String id = "";
		String strPost = "";
		while (postedvalues.hasMoreElements()) {
			strPost = postedvalues.nextElement().toString();
			if (strPost.contains("agentName")) {
				id = strPost.substring(strPost.indexOf("_") + 1);
				agent = new Agent(id);
				String name = request.getParameter("agentName_" + id);
				agent.setName(name);
				agent.setDescription(request.getParameter("description"));
				agent.save();
			}
		}
		postedvalues = request.getParameterNames();
		while (postedvalues.hasMoreElements()) {
			strPost = postedvalues.nextElement().toString();
			if (strPost.equals("exampleid")){
				AgentExample ae = new AgentExample();
				ae.setExamplename(request.getParameter("exampleid"));
				ae.setAgentid(Integer.parseInt(id));
				Enumeration postedvalues2 = request.getParameterNames();
				while (postedvalues2.hasMoreElements()) {
					String element = postedvalues2.nextElement().toString();
					if (element.contains("TLVHigh")){
						ae.setTlvHigh(request.getParameter("TLVHigh"));
					}
					if (element.contains("TLVMed")){
						ae.setTlvMed(request.getParameter("TLVMed"));
					}	
					if (element.contains("TLVLow")){
						ae.setTlvLow(request.getParameter("TLVLow"));
					}
				}
				ae.saveObject();
			}else if (strPost.contains("exampleid")) {
				AgentExample ae = new AgentExample(strPost.substring(10),Integer.parseInt(id));
				Enumeration postedvalues2 = request.getParameterNames();
				while (postedvalues2.hasMoreElements()) {
					String element = postedvalues2.nextElement().toString();
					if (element.contains("exampleid_" + ae.getId())){
						ae.setExamplename(request.getParameter("exampleid_" + ae.getId()));
					}
					if (element.contains("TLVHigh_" + ae.getId())){
						ae.setTlvHigh(request.getParameter("TLVHigh_" + ae.getId()));
					}
					if (element.contains("TLVMed_" + ae.getId())){
						ae.setTlvMed(request.getParameter("TLVMed_" + ae.getId()));
					}	
					if (element.contains("TLVLow_" + ae.getId())){
						ae.setTlvLow(request.getParameter("TLVLow_" + ae.getId()));
					}	

				}
				ae.saveObject();
			}
		}
		request.setAttribute("EditMode", true);
		request.setAttribute("script","flashSaveSuccessful();");
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}
	@SuppressWarnings("unchecked")
	private void clearSearchString(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getSession().removeAttribute("Search");
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");

		if (request.getSession().getAttribute("Location") != null) {
			if (request.getSession().getAttribute("Location").toString().equalsIgnoreCase("Structure")
					|| request.getSession().getAttribute("Location").toString().equalsIgnoreCase("JSMs")) {
				if ((request.getSession().getAttribute("JSMID") != null)) {
					request.getSession().removeAttribute("JSMID");
				}
				if ((request.getSession().getAttribute("PossibleAnswerID") != null)) {
					request.getSession().removeAttribute("PossibleAnswerID");
				}
				if ((request.getSession().getAttribute("QuestionIDs") != null)) {
					request.getSession().removeAttribute("QuestionIDs");
				}
				if (request.getSession().getAttribute("JSMSearch") != null) {
					ArrayList<JobSpecificModule> jsmArray = (ArrayList<JobSpecificModule>) request.getSession().getAttribute("JSMSearch");
					JobSpecificModule jsm = jsmArray.get(0);
					request.getSession().setAttribute("JSMID", jsm.getId());
					request.getSession().removeAttribute("JSMSearch");
				}
			}
		}
		dis.forward(request, response);
	}
	private void forwardUserSearchString(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String strSearch = request.getParameter("userSearchString").trim();
		if (!(strSearch.equalsIgnoreCase(""))) {
			request.getSession().setAttribute("Search", strSearch);
		}
		User user = new User();
		ArrayList<User> allUsers = user.getAllUsers();
		ArrayList<User> searchedUsers = new ArrayList<User>();

		for (User u : allUsers) {
			if (u.getUserName().toLowerCase().contains(strSearch.toLowerCase())) {
				searchedUsers.add(u);
			}
		}
		request.getSession().removeAttribute("Search");
		request.getSession().setAttribute("searchedusers", searchedUsers);
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}
	@SuppressWarnings("rawtypes")
	private void forwardSearchString(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String strSearch = request.getParameter("searchString").trim();

		if (!(strSearch.equalsIgnoreCase(""))) {
			request.getSession().setAttribute("Search", strSearch);
		}
		ArrayList<JobSpecificModule> jsmArray = new ArrayList<JobSpecificModule>();
		//If a single JSM has been selected add it to the array
		if (request.getSession().getAttribute("JSMID") != null) {
			JobSpecificModule jsm = new JobSpecificModule(request.getSession().getAttribute("JSMID").toString());
			jsmArray.add(jsm);
			request.getSession().setAttribute("JSMSearch", jsmArray);
		} else {
			//If multiple JSM's are selected using the checkboxes
			//add them to the array
			Enumeration postedvalues = request.getParameterNames();
			while (postedvalues.hasMoreElements()) {
				String strPost = postedvalues.nextElement().toString();
				if (strPost.contains("jsmsCheckBox")) {
					String jsmID = strPost.substring(strPost.indexOf("_") + 1);
					JobSpecificModule jsm = new JobSpecificModule(jsmID);
					jsmArray.add(jsm);
					request.getSession().setAttribute("JSMs", jsmArray);
				}
			}
		}
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}
	@SuppressWarnings("rawtypes")
	private void separateIdFromNames(HttpServletRequest request) {
		Enumeration postedvalues = request.getParameterNames();

		while (postedvalues.hasMoreElements()) {
			String strPost = postedvalues.nextElement().toString();
			if (strPost.contains("removePossibleAnswer")) {
				String id = strPost.substring(strPost.indexOf("_") + 1);
				request.setAttribute("removePossibleAnswer", id);
			} else if (strPost.contains("addPossibleAnswer")) {
				String id = strPost.substring(strPost.indexOf("_") + 1);
				request.setAttribute("addPossibleAnswer", id);
			} else if (strPost.contains("addYesNoPossibleAnswers")) {
				String id = strPost.substring(strPost.indexOf("_") + 1);
				request.setAttribute("addYesNoPossibleAnswers", id);
			} else if (strPost.contains("addNumberedAnswer")) {
				String id = strPost.substring(strPost.indexOf("_") + 1);
				request.setAttribute("addNumberedAnswer", id);
			} else if (strPost.contains("addFreeTextAnswer")) {
				String id = strPost.substring(strPost.indexOf("_") + 1);
				request.setAttribute("addFreeTextAnswer", id);
			} else if (strPost.contains("linkAJSMToJSM")) {
				String id = strPost.substring(strPost.indexOf("_") + 1);
				request.setAttribute("linkAJSMToJSM", id);
			} else if (strPost.contains("removeAJSMFromJSM")) {
				String id = strPost.substring(strPost.indexOf("_") + 1);
				request.setAttribute("removeAJSMFromJSM", id);
			} else if (strPost.contains("linkAJSMToAnswer")) {
				String id = strPost.substring(strPost.indexOf("_") + 1);
				request.setAttribute("linkAJSMToAnswer", id);
			} else if (strPost.contains("removeAJSMFromAnswer")) {
				String id = strPost.substring(strPost.indexOf("_") + 1);
				request.setAttribute("removeAJSMFromAnswer", id);
			} else if (strPost.contains("MinMax.x")) {
				String[] id = strPost.split("_");
				request.setAttribute("questionId", id[0]);
				request.setAttribute(id[1], id[1]);
			} else if (strPost.contains("addORRequirementL1.x")){
				String id = strPost.substring(0,strPost.indexOf("_"));
				request.setAttribute("efid", id);
				request.setAttribute("addORRequirementL1.x", true);
			}else if (strPost.contains("newPossibleAnswer.x")){
				String id = strPost.substring(0,strPost.indexOf("_"));
				request.setAttribute("newPossibleAnswer", id);
				request.setAttribute("newPossibleAnswer.x", true);
			}
		}
	}	
	private void minimizeMaximise(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		updateMinimisedQuestionList(request);
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}
	@SuppressWarnings("unchecked")
	private void updateMinimisedQuestionList(HttpServletRequest request) {
		if (request.getAttribute("questionId") != null) {
			String questionID = request.getAttribute("questionId").toString();
			ArrayList<String> minimisedQuestions = new ArrayList<String>();
			if (request.getSession().getAttribute("minimisedQuestionIds") != null) {
				minimisedQuestions = (ArrayList<String>)request.getSession().getAttribute("minimisedQuestionIds");
			}
			if (minimisedQuestions.contains(questionID)) {
				while(minimisedQuestions.remove(questionID));
			} else {
				minimisedQuestions.add(questionID);
			}
			request.getSession().setAttribute("minimisedQuestionIds",minimisedQuestions);
		}
	}
	@SuppressWarnings("rawtypes")
	private void addAgent(HttpServletRequest request, HttpServletResponse response) throws Exception {
		Agent agent = new Agent();
		Enumeration postedvalues = request.getParameterNames();
		while (postedvalues.hasMoreElements()) {
			String strPost = postedvalues.nextElement().toString();
			if (strPost.contains("agentsCheckBox")) {
				String id = strPost.substring(strPost.indexOf("_") + 1);
				agent = new Agent(id);
			}
		}
		if (agent.getId().equalsIgnoreCase("")) {
			if (request.getSession().getAttribute("AgentID") != null) {
				String id = request.getSession().getAttribute("AgentID").toString();
				agent.setParentID(id);
				agent.setName("_NewAgent");
				int i = 1;
				while (agent.exists()) {
					String name = "_NewAgent" + i;
					agent.setId("");
					agent.setName(name);
					i++;
					if (i > 100) {
						throw new Exception("Critical Error: creating new Agent, Max 100");
					}
				}
				agent.insert();
			} else {
				agent.setName("_NewAgent");
				int i = 1;
				while (agent.exists()) {
					String name = "_NewAgent" + i;
					agent.setId("");
					agent.setName(name);
					i++;
					if (i > 100) {
						throw new Exception("Critical Error: creating new Agent, Max 100");
					}
				}
				agent.insert();
				request.getSession().setAttribute("AgentID", agent.getId());
			}
		} else {
			agent.setParentID(agent.getId());
			agent.setId("");
			agent.setName("_NewAgent");
			int i = 1;
			while (agent.exists()) {
				String name = "_NewAgent" + i;
				agent.setId("");
				agent.setName(name);
				i++;
				if (i > 100) {
					throw new Exception("Critical Error: creating new Agent, Max 100");
				}
			}
			agent.insert();
		}
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}
	@SuppressWarnings("rawtypes")
	private void deleteAgents(HttpServletRequest request, HttpServletResponse response) throws Exception {
		Enumeration postedvalues = request.getParameterNames();
		while (postedvalues.hasMoreElements()) {
			String strPost = postedvalues.nextElement().toString();
			if (strPost.contains("agentsCheckBox")) {
				String id = strPost.substring(strPost.indexOf("_") + 1);
				AgentGroup agent = new AgentGroup(id);
				boolean bIsAgentGroup = false;
				for (Agent a : agent.getAgents()) {
					if (a.getQuestions().isEmpty()) {
						a.delete();
						bIsAgentGroup = true;
					} else {
						request.setAttribute("script","alert('This agent cannot be deleted because it is associated with a question. To identify the associated questions search for this agent in all JSMs');");
					}
				}
				if (agent.getQuestions().isEmpty()) {
					agent.delete();
				} else {
					request.setAttribute("script","alert('This agent cannot be deleted because it is associated with a question. To identify the associated questions search for this agent in all JSMs');");
				}
				if (bIsAgentGroup) {
					request.getSession().removeAttribute("AgentID");
				}
			}
		}
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}
	private void removeAgentGroup(HttpServletRequest request, HttpServletResponse response) throws Exception {
		if (request.getParameter("agentsSelect") != null) {
			String id = request.getParameter("agentsSelect");
			Agent agent = new Agent(id);
			java.util.ArrayList<Question> qs = agent.getQuestions();
			for (Question q : qs) {
				q.removeAgent(agent);
			}
			agent.delete();
		}
		request.getSession().removeAttribute("Agent");
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}
	
	
	
	@SuppressWarnings("rawtypes")
	private void logOut(HttpServletRequest request, HttpServletResponse response) throws IOException {
		Enumeration sessionNames = request.getSession().getAttributeNames();
		while (sessionNames.hasMoreElements()) {
			request.getSession().removeAttribute(sessionNames.nextElement().toString());
		}
		response.sendRedirect("/Questionnaire/");
	}
	@SuppressWarnings("rawtypes")
	private void saveJSMs(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.getSession().removeAttribute("JSMs");
		java.util.Enumeration postedvalues = request.getParameterNames();
		ArrayList<JobSpecificModule> jsms = new ArrayList<JobSpecificModule>();
		String errorMessage = "";
		while (postedvalues.hasMoreElements()) {
			String strPost = postedvalues.nextElement().toString();
			if (strPost.contains("jsmName")) {
				String id = strPost.substring(strPost.indexOf("_") + 1);
				String strName = request.getParameter("jsmName_" + id);

				String strDescription = request.getParameter("jsmDescription_"
						+ id);
				String strStartNote = request
						.getParameter("jsmStartNote_" + id);
				String strEndNote = request.getParameter("jsmEndNote_" + id);
				String strCredits = request.getParameter("jsmCredits_" + id);
				String strComments = request.getParameter("jsmComments_" + id);
				String strForumLink = request.getParameter("jsmForumLink_" + id);
				JobSpecificModule jsm = new JobSpecificModule(id);

				if (jsm.isNameValid(strName)) {
					jsm.setName(strName);
					jsm.setDescription(strDescription);
					jsm.setInterviewStartNote(strStartNote);
					jsm.setInterviewEndNote(strEndNote);
					jsm.setCredits(strCredits);
					jsm.setComments(strComments);
					jsm.setForumLink(strForumLink);
					if (request.getParameter("jsmIsAssociate") != null) {
						jsm.setAssociateModule(true);
					}
					jsm.save();
				} else {
					errorMessage += jsm.getErrorMessage() + "\n";
				}
				jsms.add(jsm);
			}
		}
		request.getSession().setAttribute("JSMs", jsms);

		if (!(errorMessage.equalsIgnoreCase(""))) {
			request.setAttribute("errorMessage", errorMessage);
		}
		request.setAttribute("EditMode", true);
		request.setAttribute("script","flashSaveSuccessful();");
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}
	@SuppressWarnings("rawtypes")
	private void newOrEditJSMs(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setAttribute("EditMode", true);
		java.util.ArrayList<JobSpecificModule> jsms = new java.util.ArrayList<JobSpecificModule>();
		if (request.getSession().getAttribute("JSMID") != null) {
			JobSpecificModule jsm = new JobSpecificModule(request.getSession().getAttribute("JSMID").toString());
			jsms.add(jsm);
		} else {
			Enumeration postedvalues = request.getParameterNames();
			while (postedvalues.hasMoreElements()) {
				String strPost = postedvalues.nextElement().toString();
				if (strPost.contains("jsmsCheckBox")) {
					String id = strPost.substring(strPost.indexOf("_") + 1);
					JobSpecificModule jsm = new JobSpecificModule(id);
					jsms.add(jsm);
				}
			}
		}
		if (jsms.size() == 0) {
			JobSpecificModule jsm = new JobSpecificModule();
			String name = "_NEWJSM";
			jsm.setName(name);
			int i = 1;
			while (jsm.exists()) {
				name = "_NEWJSM" + i;
				jsm.setId("");
				jsm.setName(name);
				i++;
				if (i > 100) {
					throw new Exception(
							"Critical Error: creating new JSM max 100");
				}
			}
			jsm.save();
			jsms.add(jsm);
			request.getSession().setAttribute("JSMID", jsm.getId());
		}
		request.getSession().setAttribute("JSMs", jsms);
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}
	private void removePossibleAnswer(HttpServletRequest request, HttpServletResponse response) throws Exception {
		if (request.getAttribute("removePossibleAnswer") != null) {
			String id = request.getAttribute("removePossibleAnswer").toString();
			PossibleAnswer pa = new PossibleAnswer("", id);
			pa.unLinkFromParentQuestion();
			JobSpecificModule jsm = new JobSpecificModule(request.getSession().getAttribute("JSMID").toString());
			jsm.updateTimeStamp();
		}
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}
	private void addProbabilityQuestion(HttpServletRequest request, HttpServletResponse response) throws Exception {
		this.addQuestion(request, response, Question.PROBABILITY);
	}
	@SuppressWarnings("rawtypes")
	private void addQuestion(HttpServletRequest request, HttpServletResponse response, String qTypeId) throws Exception {
		request.getSession().removeAttribute("SearchedQuestions");
		String strText = "";
		Question q = new Question();
		if (qTypeId.equalsIgnoreCase(Question.PROBABILITY)) {
			strText = "New Question";
			q.setName(strText);
			int i = 1;
			while (q.exists()) {
				q.setId("");
				q.setName(strText + i);
				i++;
			}
		}
		Enumeration postedvalues = request.getParameterNames();
		boolean bAddRoot = true;
		
		String qid = "";
		while (postedvalues.hasMoreElements()) {
			String strPost = postedvalues.nextElement().toString();
			if (strPost.contains("possibleAnswersCheckBox")) {
				String id = strPost.substring(strPost.indexOf("_") + 1);
				PossibleAnswer pa = new PossibleAnswer("", id);
				
				q.setDescription(strText);
				q.setTypeID(qTypeId);
				if(!(q.exists())){
					q.insert();
				}
				q.linkToPossibleAnswer(pa.getId(), pa.getJsmQuestionPossibleAnswerStructureID());
				q.resetSequences();
				JobSpecificModule jsm = new JobSpecificModule(q.getJsmID());
				jsm.updateTimeStamp();
				bAddRoot = false;
			} else if (strPost.contains("questionsCheckBox")) {
				qid = strPost.substring(strPost.indexOf("_") + 1);
			}
		}
		if (bAddRoot) {
			if (request.getSession().getAttribute("JSMID") != null) {
				String strJsmId = request.getSession().getAttribute("JSMID").toString();
				JobSpecificModule jsm = new JobSpecificModule(strJsmId);
				q.setDescription(strText);
				q.setTypeID(qTypeId);
				int iSequence = -1;
				for (Question rootQ : jsm.getQuestions()) {
					if (!(qid.equalsIgnoreCase(""))) {
						if (rootQ.getJsmQuestionStructureID().equalsIgnoreCase(
								qid)) {
							iSequence = Integer.valueOf(rootQ.getSequence());
						}
					} else {
						if (rootQ.isAssociateJSM()) {
							iSequence = Integer.valueOf(rootQ.getSequence());
							break;
						}
					}
				}
				if(!(q.exists())){
					q.insert();
				}
				q.linkToJSM(strJsmId);
				jsm.updateTimeStamp();
				if (iSequence != -1) {
					q.setSequence(iSequence);
					q.updateSequence();
					q.resetSequences();
				}
			}
		}
		String scrollPos = request.getAttribute("scrollPos").toString();
		request.getSession().setAttribute("ScrollPos", scrollPos);
		request.setAttribute("scrollPos", "0");
		request.getSession().setAttribute("QuestionIDs",q.getJsmQuestionStructureID());
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}
	@SuppressWarnings("rawtypes")
	private void updateAgents(HttpServletRequest request, HttpServletResponse response) throws Exception {
		if (request.getSession().getAttribute("QuestionIDs") != null) {
			String questionIDs = request.getSession().getAttribute("QuestionIDs").toString();
			String ids[] = questionIDs.split(",");
			for (String id : ids) {
				Question q = new Question("", id);
				q.removeAllAgents();
				// get all agents checked
				Enumeration postedvalues = request.getParameterNames();
				while (postedvalues.hasMoreElements()) {
					String strPost = postedvalues.nextElement().toString();
					if (strPost.contains("agentsCheckBox")) {
						String strID = strPost.substring(strPost.indexOf("_") + 1);
						Agent agent = new Agent(strID);
						q.addAgent(agent);
					}
				}
				if (q.getChildQuestions().size() > 0) {
					for (Question cq : q.getChildQuestions()) {
						if (cq.getTypeID().equalsIgnoreCase(Question.FREQUENCY)) {
							for (Agent agent : q.getAgents()) {
								if(!(cq.getAgents().contains(agent))){
									cq.addAgent(agent);
								}
							}
						}
						if (cq.getChildQuestions().size() > 0) {
							for (Question ccq : cq.getChildQuestions()) {
								if (ccq.getTypeID().equalsIgnoreCase(Question.FREQUENCY)) {
									for (Agent agent : cq.getAgents()) {
										if(!(ccq.getAgents().contains(agent))){
											ccq.addAgent(agent);
										}
									}
								}
							}
						}
					}
				}
			}
		}
		request.setAttribute("script","flashSaveSuccessful();");
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}
	@SuppressWarnings("rawtypes")
	private void addFreqQuestion(HttpServletRequest request, HttpServletResponse response) throws Exception {
		Enumeration postedvalues = request.getParameterNames();
		while (postedvalues.hasMoreElements()) {
			String strPost = postedvalues.nextElement().toString();
			if (strPost.contains("possibleAnswersCheckBox")) {
				String id = strPost.substring(strPost.indexOf("_") + 1);
				PossibleAnswer pa = new PossibleAnswer("", id);
				Question q = new Question();
				q.setName("weeks a year");
				q.setDescription("How many weeks a year?");
				q.setTypeID(Question.FREQUENCY);
				if(!(q.exists())){
					q.insert();
				}
				q.linkToPossibleAnswer(pa.getId(), pa.getJsmQuestionPossibleAnswerStructureID());
				// add all the agents of the parent to this frequency q
				Question pq = new Question("", q.getParentQuestionID());
				for (Agent agent : pq.getAgents()) {
					q.addAgent(agent);
				}
				PossibleAnswer pa1 = new PossibleAnswer();
				pa1.setName("[number 0-52]");
				pa1.setDescription("[number 0-52]");
				if(!(pa1.exists())){
					pa1.insert();
				}				
				pa1.linkToQuestion(q.getId(), q.getJsmQuestionStructureID());
				Question q1 = new Question();
				q1.setName("hours a week");
				q1.setDescription("On average, how many hours a week?");
				q1.setTypeID(Question.FREQUENCY);
				if(!(q1.exists())){
					q1.insert();
				}
				q1.linkToPossibleAnswer(pa1.getId(), pa1.getJsmQuestionPossibleAnswerStructureID());
				// add all the agents of the parent to this frequency q
				for (Agent agent : pq.getAgents()) {
					q1.addAgent(agent);
				}
				PossibleAnswer pa2 = new PossibleAnswer();
				pa2.setName("[number 1-100]");
				pa2.setDescription("[number 1-100]");
				if(!(pa2.exists())){
					pa2.insert();
				}
				pa2.linkToQuestion(q1.getId(), q1.getJsmQuestionStructureID());
				JobSpecificModule jsm = new JobSpecificModule(request.getSession().getAttribute("JSMID").toString());
				jsm.updateTimeStamp();
			}
		}
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}
	@SuppressWarnings("rawtypes")
	private void deleteQuestions(HttpServletRequest request, HttpServletResponse response) throws Exception {
		Enumeration postedvalues = request.getParameterNames();
		while (postedvalues.hasMoreElements()) {
			String strPost = postedvalues.nextElement().toString();
			if (strPost.contains("questionsCheckBox")) {
				String qID = strPost.substring(strPost.indexOf("_") + 1);
				Question lq = new Question(qID);
				lq.delete();
				JobSpecificModule jsm = new JobSpecificModule(lq.getJsmID());
				jsm.updateTimeStamp();
			}
		}
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}
	@SuppressWarnings("rawtypes")
	private void exportJSM(HttpServletRequest request, HttpServletResponse response) throws Exception {
		if(request.getParameter("Export")==null){
			request.setAttribute("Export", true);
			java.util.ArrayList<JobSpecificModule> jsms = new java.util.ArrayList<JobSpecificModule>();
			Enumeration postedvalues = request.getParameterNames();
			while (postedvalues.hasMoreElements()) {
				String strPost = postedvalues.nextElement().toString();
				if (strPost.contains("jsmsCheckBox")) {
					String id = strPost.substring(strPost.indexOf("_") + 1);
					JobSpecificModule jsm = new JobSpecificModule(id);
					jsms.add(jsm);
				}
			}
			request.getSession().setAttribute("JSMs", jsms);
			RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
			dis.forward(request, response);
		}else{
			request.removeAttribute("Export");
			java.util.ArrayList<JobSpecificModule> jsms = new java.util.ArrayList<JobSpecificModule>();
			java.util.Enumeration postedvalues = request.getParameterNames();
			while (postedvalues.hasMoreElements()) {
				String strPost = postedvalues.nextElement().toString();
				if (strPost.contains("JSM_")) {
					String id = strPost.substring(strPost.indexOf("_") + 1);
					JobSpecificModule jsm = new JobSpecificModule(id);
					jsms.add(jsm);
				}
			}
			Exporter exporter = new Exporter();
			String exportType = "";
			if(request.getParameter("exportType")!=null){
				exportType = request.getParameter("exportType");
			}
			for (JobSpecificModule jsm:jsms) {		
				if(exportType.equalsIgnoreCase("exportToText")){
					String jsmName = jsm.getName();
					jsmName = jsmName.replace("\"", "_");
					jsmName = jsmName.replace(".", "_");
					jsmName = jsmName.replace("/", "_");
					String path = getServletContext().getRealPath(jsmName + ".txt");
					String jsmTxt = exporter.exportJSM(jsm, path);
					response.setHeader("Content-disposition","attachment;filename=\"" + jsmName + ".txt\"");
					response.getOutputStream().println(jsmTxt);
				}else if(exportType.equalsIgnoreCase("exportToDB")){
					String connectionString = request.getParameter("constring");
					String userName = request.getParameter("username");
					String passwd = request.getParameter("password");
					exporter.exportFullJSM(connectionString,userName,passwd,jsm);
					
					RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
					dis.forward(request, response);
				}else if(exportType.equalsIgnoreCase("exportToXML")){
					String jsmName = jsm.getName();
					jsmName = jsmName.replace("\"", "_");
					jsmName = jsmName.replace(".", "_");
					jsmName = jsmName.replace("/", "_");
					String path = getServletContext().getRealPath(jsmName + ".xml");
					String jsmXML = exporter.exportJSMAsXML(jsm, path);
					response.setHeader("Content-disposition","attachment;filename=\"" + jsmName + ".xml\"");
					response.getOutputStream().println(jsmXML);
				}				
			}						
		}		
	}
	@SuppressWarnings("rawtypes")
	private void deleteJSM(HttpServletRequest request, HttpServletResponse response) throws Exception {
		if (request.getSession().getAttribute("JSMID") != null) {
			JobSpecificModule jsm = new JobSpecificModule(request.getSession().getAttribute("JSMID").toString());
			// If the jsm is associated with another JSM then don't delete
//			if (!jsm.isLinkedAJSM()) {
				jsm.delete();
//			} else {
//				request.setAttribute("script", "alert('" + jsm.getErrorMessage() + "')");
//			}
			request.getSession().removeAttribute("JSMID");
		} else {
			Enumeration postedvalues = request.getParameterNames();
			while (postedvalues.hasMoreElements()) {
				String strPost = postedvalues.nextElement().toString();
				if (strPost.contains("jsmsCheckBox")) {
					String jsmID = strPost.substring(strPost.indexOf("_") + 1);
					JobSpecificModule jsm = new JobSpecificModule(jsmID);
					// If the jsm is associated with another JSM then don't
					// delete
				//	if (!jsm.isLinkedAJSM()) {
						jsm.delete();
			//		}
			//		else {
			//			request.setAttribute("script", "alert('" + jsm.getErrorMessage() + "')");
			//		}
				}
			}
		}
		String scrollPos = request.getParameter("scrollPos");
		request.setAttribute("scrollPos", scrollPos);
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}
	private void openImportJSMWindow(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setAttribute("Import", true);
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}
	@SuppressWarnings("rawtypes")
	private void editAgent(HttpServletRequest request, HttpServletResponse response) throws Exception {
		Enumeration postedvalues = request.getParameterNames();
		while (postedvalues.hasMoreElements()) {
			String strPost = postedvalues.nextElement().toString();
			if (strPost.contains("agentsCheckBox")) {
				String id = strPost.substring(strPost.indexOf("_") + 1);
				request.getSession().setAttribute("AgentID", id);
			}
		}
		request.setAttribute("EditMode", true);
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}
	private void editSelectedMode(HttpServletRequest request, HttpServletResponse response) throws Exception {
		this.setQuestionIdsInSession(request,response);
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}
	
	@SuppressWarnings("rawtypes")
	private void toggleAgents(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String strValue = "true";
		if (request.getSession().getAttribute("toggleAgents") != null) {
			strValue = request.getSession().getAttribute("toggleAgents")
					.toString();
			if (strValue.equalsIgnoreCase("true")) {
				strValue = "false";
			} else {
				strValue = "true";
			}
		}
		Enumeration postedvalues = request.getParameterNames();
		String stringIDs = "";
		while (postedvalues.hasMoreElements()) {
			String strPost = postedvalues.nextElement().toString();
			if (strPost.contains("possibleAnswersCheckBox")) {
				String jsmlqpaID = strPost.substring(strPost.indexOf("_") + 1);
				stringIDs += jsmlqpaID + ",";
			}
			if (strPost.contains("questionsCheckBox")) {
				String lqID = strPost.substring(strPost.indexOf("_") + 1);
				stringIDs += lqID + ",";
			}
		}
		request.getSession().setAttribute("stringCheckedIDsList", stringIDs);
		request.getSession().setAttribute("toggleAgents", strValue);
		request.setAttribute("Refresh", "true");
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}
	@SuppressWarnings("rawtypes")
	private void moveQsPAsDown(HttpServletRequest request, HttpServletResponse response) throws Throwable {
		Enumeration postedvalues = request.getParameterNames();
		String stringIDs = "";
		while (postedvalues.hasMoreElements()) {
			String strPost = postedvalues.nextElement().toString();
			if (strPost.contains("possibleAnswersCheckBox")) {
				String jsmlqpaID = strPost.substring(strPost.indexOf("_") + 1);
				PossibleAnswer pa = new PossibleAnswer("", jsmlqpaID);
				pa.moveDown();
				JobSpecificModule jsm = new JobSpecificModule(request.getSession().getAttribute("JSMID").toString());
				jsm.updateTimeStamp();
				stringIDs += jsmlqpaID + ",";
			}
			if (strPost.contains("questionsCheckBox")) {
				String lqID = strPost.substring(strPost.indexOf("_") + 1);
				Question lq = new Question("", lqID);
				lq.moveDown();
				JobSpecificModule jsm = new JobSpecificModule(lq.getJsmID());
				jsm.updateTimeStamp();
				stringIDs += lqID + ",";
			}
		}
		request.getSession().setAttribute("stringCheckedIDsList", stringIDs);
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}
	@SuppressWarnings("rawtypes")
	private void copy(HttpServletRequest request, HttpServletResponse response) throws Throwable {
		Enumeration postedvalues = request.getParameterNames();
		while (postedvalues.hasMoreElements()) {
			String strPost = postedvalues.nextElement().toString();
			if (strPost.contains("possibleAnswersCheckBox")) {
				String jsmlqpaID = strPost.substring(strPost.indexOf("_") + 1);
				request.getSession().setAttribute("copyPAID", jsmlqpaID);
				break;
			}
			if (strPost.contains("questionsCheckBox")) {
				String lqID = strPost.substring(strPost.indexOf("_") + 1);
				request.getSession().setAttribute("copyQID", lqID);
				break;
			}
		}
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}
	@SuppressWarnings("rawtypes")
	private void paste(HttpServletRequest request, HttpServletResponse response) throws Throwable {
		Enumeration postedvalues = request.getParameterNames();
		boolean bDone = false;
		while (postedvalues.hasMoreElements()) {
			String strPost = postedvalues.nextElement().toString();
			if (strPost.contains("possibleAnswersCheckBox")) {
				String jsmlqpaID = strPost.substring(strPost.indexOf("_") + 1);
				if (request.getSession().getAttribute("copyQID") != null) {
					String lqid = request.getSession().getAttribute("copyQID").toString();
					Question q = new Question("", lqid);
					q.getFullPossibleAnswers();
					q.copyTo(jsmlqpaID);
				}
				if (request.getSession().getAttribute("cutQID") != null) { //old functionality
					String lqid = request.getSession().getAttribute("cutQID").toString();
					request.getSession().removeAttribute("cutQID");
					Question q = new Question("", lqid);
					q.linkToPossibleAnswer("", jsmlqpaID);
				}
				bDone = true;
			}
			if (strPost.contains("questionsCheckBox")) {
				String lqID = strPost.substring(strPost.indexOf("_") + 1);
				if (request.getSession().getAttribute("copyPAID") != null) {
					String jsmlqpaid = request.getSession().getAttribute(
							"copyPAID").toString();
					PossibleAnswer pa = new PossibleAnswer("", jsmlqpaid);
					pa.getChildQuestions();
					pa.copyTo(lqID);
				}
				if (request.getSession().getAttribute("cutPAID") != null) {
					String jsmlqpaid = request.getSession().getAttribute(
							"cutPAID").toString();
					request.getSession().removeAttribute("cutPAID");
					PossibleAnswer pa = new PossibleAnswer("", jsmlqpaid);
					pa.linkToQuestion("", lqID);
				}
				bDone = true;
			}
			if (bDone) {
				break;
			}
		}
		if (!(bDone)) {
			if (request.getSession().getAttribute("JSMID") != null) {
				String jsmId = request.getSession().getAttribute("JSMID").toString();
				if (request.getSession().getAttribute("copyQID") != null) {
					JobSpecificModule jsm = new JobSpecificModule(jsmId);
					jsm.importQuestion(request.getSession().getAttribute("copyQID").toString());				
				}
			}
		}
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}
	@SuppressWarnings("rawtypes")
	private void moveQsPAsUp(HttpServletRequest request, HttpServletResponse response) throws Throwable {
		Enumeration postedvalues = request.getParameterNames();
		String stringIDs = "";
		while (postedvalues.hasMoreElements()) {
			String strPost = postedvalues.nextElement().toString();
			if (strPost.contains("possibleAnswersCheckBox")) {
				String jsmlqpaID = strPost.substring(strPost.indexOf("_") + 1);
				com.researchit.PossibleAnswer pa = new com.researchit.PossibleAnswer(
						"", jsmlqpaID);
				pa.moveUp();
				JobSpecificModule jsm = new JobSpecificModule(request.getSession().getAttribute("JSMID").toString());
				jsm.updateTimeStamp();
				stringIDs += jsmlqpaID + ",";
			}
			if (strPost.contains("questionsCheckBox")) {
				String lqID = strPost.substring(strPost.indexOf("_") + 1);
				com.researchit.Question lq = new com.researchit.Question("",
						lqID);
				lq.moveUp();
				JobSpecificModule jsm = new JobSpecificModule(lq.getJsmID());
				jsm.updateTimeStamp();
				stringIDs += lqID + ",";
			}
		}
		request.getSession().setAttribute("stringCheckedIDsList", stringIDs);
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}
	@SuppressWarnings("rawtypes")
	private void structureRemoveQsPAs(HttpServletRequest request, HttpServletResponse response) throws Throwable {
		String jsmId = request.getSession().getAttribute("JSMID").toString();
		Enumeration postedvalues = request.getParameterNames();
		ExpertAgent ex = new ExpertAgent( );
		while (postedvalues.hasMoreElements()) {
			String strPost = postedvalues.nextElement().toString();
			if (strPost.contains("questionsCheckBox")) {
				String lqID = strPost.substring(strPost.indexOf("_") + 1);
				Question q = new Question("",lqID);				
				if (q.getChildQuestions().size() > 0 ) {
					String strScript = "alert('Question " + q.getName().toString() + " has child questions attached! Please delete them first.');";
					request.setAttribute("script", strScript);					
				} else {
					boolean hasRules = false;
					String strScript = "";
					for(PossibleAnswer pa: q.getPossibleAnswers()){
						if(ex.hasRule(q.getId(),pa.getId(),jsmId)){
							strScript += "alert(\"Answer " + pa.getName().toString() + " has Assessment Rules attached! These may be invalidated if this answer is removed.\"); ";					
							request.setAttribute("script", strScript);
							hasRules = true;
						}
					}
					if(!(hasRules)){
						q.unLink();
						JobSpecificModule jsm = new JobSpecificModule(jsmId);
						jsm.updateTimeStamp();
					}
				} 			
			}
			if (strPost.contains("possibleAnswersCheckBox")) {
				String jsmlqpaID = strPost.substring(strPost.indexOf("_") + 1);
				PossibleAnswer pa = new PossibleAnswer("", jsmlqpaID);			
				if(!(pa.getId().equalsIgnoreCase(""))){
					int iSize = pa.getChildQuestions().size();
					if (iSize > 0) {
						String strScript = "alert(\"Answer " + pa.getName().toString() + " has a Possible Question attached! Please delete it first.\");";
						request.setAttribute("script", strScript);
					} else {
						Question pq = new Question("",pa.getJsmQuestionStructureID());
						if(ex.hasRule(pq.getId(),pa.getId(),jsmId)){
							String strScript = "alert(\"Answer " + pa.getName().toString() + " has Assessment Rules attached! These may be invalidated if this answer is removed.\");";					
							request.setAttribute("script", strScript);
						}else {
							pa.unLinkFromParentQuestion();
							JobSpecificModule jsm = new JobSpecificModule(request.getSession().getAttribute("JSMID").toString());
							jsm.updateTimeStamp();
						}
					} 
				}				
			}
		}
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}
	private void addNumberAnswer(HttpServletRequest request, HttpServletResponse response) throws Throwable {
		if (request.getAttribute("addNumberedAnswer") != null) {
			String jqid = request.getAttribute("addNumberedAnswer").toString();
			Question q = new Question("", jqid);
			PossibleAnswer pa = null;
			pa = new PossibleAnswer();
			pa.setDescription("[number 1-100]");
			pa.setName("[number 1-100]");			
			pa.insert();			
			pa.linkToQuestion(q.getId(), q.getJsmQuestionStructureID());
			JobSpecificModule jsm = new JobSpecificModule(request.getSession().getAttribute("JSMID").toString());
			jsm.updateTimeStamp();
		}
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}
	private void addFreeTextAnswer(HttpServletRequest request, HttpServletResponse response) throws Throwable {
		if (request.getAttribute("addFreeTextAnswer") != null) {
			String jqid = request.getAttribute("addFreeTextAnswer").toString();
			Question q = new Question("", jqid);
			PossibleAnswer pa = null;
			pa = new PossibleAnswer();
			pa.setDescription("[free text]");
			pa.setName("[free text]");
			pa.insert();
			pa.linkToQuestion(q.getId(), q.getJsmQuestionStructureID());
			JobSpecificModule jsm = new JobSpecificModule(request.getSession().getAttribute("JSMID").toString());
			jsm.updateTimeStamp();
		}
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}
	private void addYesNoPossibleAnswers(HttpServletRequest request, HttpServletResponse response) throws Throwable {
		if (request.getAttribute("addYesNoPossibleAnswers") != null) {
			String jqid = request.getAttribute("addYesNoPossibleAnswers").toString();
			Question q = new Question("", jqid);
			PossibleAnswer pa = new PossibleAnswer();
			pa.setDescription("Yes");
			pa.setName("Yes");
			if(!(pa.exists())){
				pa.insert();
			}
			pa.linkToQuestion(q.getId(), q.getJsmQuestionStructureID());

			pa = new PossibleAnswer();
			pa.setDescription("No");
			pa.setName("No");
			if(!(pa.exists())){
				pa.insert();
			}
			pa.linkToQuestion(q.getId(), q.getJsmQuestionStructureID());

			pa = new PossibleAnswer();
			pa.setDescription("Don't know");
			pa.setName("Don't know");
			if(!(pa.exists())){
				pa.insert();
			}
			pa.linkToQuestion(q.getId(), q.getJsmQuestionStructureID());
			JobSpecificModule jsm = new JobSpecificModule(request.getSession().getAttribute("JSMID").toString());
			jsm.updateTimeStamp();
		}
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}
	private void addPossibleAnswer(HttpServletRequest request, HttpServletResponse response) throws Throwable {
		if (request.getAttribute("addPossibleAnswer") != null) {
			String jqid = request.getAttribute("addPossibleAnswer").toString();
			Question q = new Question("", jqid);
			PossibleAnswer pa = new PossibleAnswer();
			String strText = "New Possible Answer";
			pa.setName(strText);
			int i = 1;
			while (pa.exists()) {
				pa.setId("");
				pa.setName(strText + i);
				if (i == 30) {
					throw new Exception("Add Possible Answer Failed: Max default exceeded");
				}
				i++;
			}
			pa.setDescription(pa.getName());			
			pa.insert();
			pa.linkToQuestion(q.getId(), q.getJsmQuestionStructureID());
			JobSpecificModule jsm = new JobSpecificModule(request.getSession().getAttribute("JSMID").toString());
			jsm.updateTimeStamp();
		}
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}
	private void removeAJSMFromAnswer(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String[] removedAJSMIds;
		if (request.getAttribute("removeAJSMFromAnswer") != null) {
			String paID = request.getAttribute("removeAJSMFromAnswer").toString();
			PossibleAnswer pa = new PossibleAnswer("", paID);
			removedAJSMIds = request.getParameterValues("linkedAJSMs");
			if (removedAJSMIds != null) {
				if (removedAJSMIds.length > 0) {
					for (String removeId : removedAJSMIds) {
						for (Question q : pa.getChildQuestions()) {
							if (q.getAssociateJSMID().equalsIgnoreCase(removeId)) {
								q.unLink();
							}
						}
					}
				}
			}
		}
		request.setAttribute("linkAJSM", true);
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}
	private void removeAJSM(HttpServletRequest request, HttpServletResponse response) throws Exception {
		User user = (User) request.getSession().getAttribute("UserObject");
		JobSpecificModule jsm = new JobSpecificModule();
		String[] removedAJSMIds;
		if (request.getAttribute("removeAJSMFromJSM") != null) {
			String jsmId = request.getAttribute("removeAJSMFromJSM").toString();
			jsm = new JobSpecificModule(jsmId);
			ArrayList<JobSpecificModule> ajsms = jsm.getStudySpecificAJSMs(user.getId());
			if (!ajsms.isEmpty()) {
				removedAJSMIds = request.getParameterValues("linkedAJSMs");
				if (removedAJSMIds != null) {
					if (removedAJSMIds.length > 0) {
						for (String removeId : removedAJSMIds) {
							JobSpecificModule ajsm = new JobSpecificModule(removeId);
							jsm.removeQuestion(ajsm);
						}
					}
				}
			}
		}
		request.setAttribute("linkAJSM", true);
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}
	private void linkOrImportAJSMToAnswer(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String[] addAJSMIds;
		if (request.getAttribute("linkAJSMToAnswer") != null) {
			String paId = request.getAttribute("linkAJSMToAnswer").toString();
			PossibleAnswer pa = new PossibleAnswer("", paId);
			boolean bImport = false;
			if(request.getParameter("linkAJSMToAnswer_"+paId)!=null){
				if(request.getParameter("linkAJSMToAnswer_"+paId).equalsIgnoreCase("Import")){
					bImport = true;
				}
			}
			addAJSMIds = request.getParameterValues("unlinkedAJSMs");
			if (addAJSMIds != null) {
				if (addAJSMIds.length > 0) {
					for (String addId : addAJSMIds) {
						JobSpecificModule jsm = new JobSpecificModule(addId);
						if(bImport){
							jsm.importToPossibleAnswer(pa);
						}else{
							jsm.linkToPossibleAnswer(pa);
							request.setAttribute("linkAJSM", true);
						}
						
					}
				}
			}
		}
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}
	private void linkOrImportAJSMToJSM(HttpServletRequest request, HttpServletResponse response) throws Exception {		
		JobSpecificModule jsm = new JobSpecificModule();
		String[] addAJSMIds;
		if (request.getAttribute("linkAJSMToJSM") != null) {
			String jsmId = request.getAttribute("linkAJSMToJSM").toString();
			boolean bImport = false;
			if(request.getParameter("linkAJSMToJSM_"+jsmId)!=null){
				if(request.getParameter("linkAJSMToJSM_"+jsmId).equalsIgnoreCase("Import")){
					bImport = true;
				}
			}			
			jsm = new JobSpecificModule(jsmId);
			addAJSMIds = request.getParameterValues("unlinkedAJSMs");
			if (addAJSMIds != null) {
				if (addAJSMIds.length > 0) {
					for (String addId : addAJSMIds) {
						JobSpecificModule ajsm = new JobSpecificModule(addId);
						if(bImport){
							jsm.importAssociateJSM(ajsm);
						}else{
							jsm.linkAssociateJSM(ajsm);
							request.setAttribute("linkAJSM", true);
						}					
					}
				}
			}
		}		
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}
	private void questionSaveText(HttpServletRequest request) throws Exception {
		this.questionSaveText(request, null);
	}
	@SuppressWarnings("rawtypes")
	private void questionSaveText(HttpServletRequest request, HttpServletResponse response) throws Exception {
		Question q = new Question();
		Enumeration postedvalues = request.getParameterNames();
		while (postedvalues.hasMoreElements()) {
			String strPost = postedvalues.nextElement().toString();
			if (strPost.contains("paName")) {
				String paId = strPost.substring(strPost.indexOf("_") + 1);
				String strName = request.getParameter(strPost);
				if (!(paId.equalsIgnoreCase(""))) {
					PossibleAnswer pa = new PossibleAnswer("", paId);
					if(strName.trim().equalsIgnoreCase("")){
						pa.unLinkFromParentQuestion();
					}else{
						pa.setName(strName);
						//if (pa.getDescription().equalsIgnoreCase("[free text]")) {
							//pa.setDescription(pa.getDescription() + strName);
						//}else{
							pa.setDescription(strName);
						//}
						pa.update1();
					}
				}
			}
			if (strPost.contains("qDescription")) {
				String qLinkedID = strPost.substring(strPost.indexOf("_") + 1);
				String strDescription = request.getParameter(strPost);

				String strType = request.getParameter("qType_" + qLinkedID);
				String strNotes = request.getParameter("qNotes_" + qLinkedID);
				String strIsMultiple = request.getParameter("qIsMultiple"+ qLinkedID);
				boolean bIsMultiple = false;
				if (strIsMultiple != null) {
					bIsMultiple = true;
				}
				String strViewWithParent = request.getParameter("viewWithParent"
						+ qLinkedID);
				boolean bviewWithParent = false;
				if (strViewWithParent != null) {
					bviewWithParent = true;
				}
				q = new Question("", qLinkedID);
				if (request.getParameter("qName_" + qLinkedID) != null) {
					String strName = request.getParameter("qName_" + qLinkedID).trim();
					String oldName = q.getName();
					if(!(oldName.equalsIgnoreCase(strName))){
						q.setName(strName);
						if (q.isNameInUse()) {
							throw new Exception("Key phrase with this name is already in use. Please navigate back and enter a different key phrase.");
						} 
					}					
				}
				q.setDescription(strDescription);
				q.setTypeID(strType);
				q.setNotes(strNotes);
				q.setMultiple(bIsMultiple);
				q.setViewWithParent(bviewWithParent);								
				q.update();		
			}
		}
		JobSpecificModule jsm = new JobSpecificModule(request.getSession().getAttribute("JSMID").toString());
		if(jsm.getJsmTypeId()==JobSpecificModule.STUDY){
			jsm.updateTimeStamp();
		}
		if (response != null) {
			request.setAttribute("script","flashSaveSuccessful();");
			RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
			dis.forward(request, response);
		}
	}
	@SuppressWarnings("rawtypes")
	private ArrayList<String> getAction(HttpServletRequest request) {		
		ArrayList<String> actionList = new ArrayList<String>();
		actionList.add("Questionnaire Management System");
		actionList.add("Param");
		Enumeration actions = request.getParameterNames();
		while (actions.hasMoreElements()) {
			String strPost = actions.nextElement().toString();
			actionList.add(strPost);
		}
		actionList.add("Attrib");
		actions = request.getAttributeNames();
		while (actions.hasMoreElements()) {
			String strPost = actions.nextElement().toString();
			actionList.add(strPost);
		}
		actionList.add("Sess");
		actions = request.getSession().getAttributeNames();
		while (actions.hasMoreElements()) {
			String strPost = actions.nextElement().toString();
			if(strPost.equalsIgnoreCase("Location")){
				strPost += request.getSession().getAttribute(strPost).toString();
			}
			if(strPost.equalsIgnoreCase("JSMID")){
				strPost += request.getSession().getAttribute(strPost).toString();
			}
			if(strPost.equalsIgnoreCase("AgentID")){
				strPost += request.getSession().getAttribute(strPost).toString();
			}
			if(strPost.equalsIgnoreCase("RuleID")){
				strPost += request.getSession().getAttribute(strPost).toString();
			}
			actionList.add(strPost);
		}
		return actionList;
	}
	private void closeEditMode(HttpServletRequest request, HttpServletResponse response) throws Exception {
		if (request.getSession().getAttribute("QuestionIDs") != null) {
			request.getSession().removeAttribute("QuestionIDs");
		}
		if (request.getSession().getAttribute("AgentID") != null) {
			if (request.getSession().getAttribute("Outcome") != null) {				
				if(request.getSession().getAttribute("editRuleMode") != null){					
					request.getSession().removeAttribute("editRuleMode");
				}else{
					request.getSession().removeAttribute("Outcome");
					request.getSession().removeAttribute("RuleID");
				}
			}else{
				String agentID = request.getSession().getAttribute("AgentID").toString();
				Agent agent = new Agent(agentID);
				if (!(agent.getParentID().equalsIgnoreCase("NULL"))) {
					request.getSession().setAttribute("AgentID",agent.getParentID());
				}
				if (request.getSession().getAttribute("EditMode") == null && request.getSession().getAttribute("ListMode") == null)  {
					request.getSession().removeAttribute("AgentID");
				}
			}
		}
		if (request.getSession().getAttribute("jobs") != null) {
			request.getSession().removeAttribute("jobs");
			request.getSession().removeAttribute("editJob");
		}
		if (request.getSession().getAttribute("editSelectedQuestion") != null) {
			request.getSession().removeAttribute("editSelectedQuestion");
		}
		if (request.getSession().getAttribute("PossibleAnswerID") != null) {
			request.getSession().removeAttribute("PossibleAnswerID");
		}
		if (request.getSession().getAttribute("ShareJSMs") != null) {
			request.getSession().removeAttribute("ShareJSMs");
		}
		if (request.getSession().getAttribute("ListMode") != null) {
			request.getSession().removeAttribute("ListMode");
		}
		request.setAttribute("scrollPos", request.getSession().getAttribute("ScrollPos"));
		request.getSession().removeAttribute("ScrollPos");
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}
	private void maximiseActionButtons(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.getSession().removeAttribute("MinActionButtons");
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}
	private void minimiseActionButtons(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.getSession().setAttribute("MinActionButtons",true);
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}
	private void previewInterview(HttpServletRequest request, HttpServletResponse response) throws Exception {
		JobSpecificModule jsm = new JobSpecificModule(request.getSession().getAttribute("JSMID").toString());
		Study study = new Study();
		study.setName("PreviewInterview");
		study.insert();		
		for(Agent agent:jsm.getAgents()){
			study.addAgent(agent);
		}
		User user = (User) request.getSession().getAttribute("UserObject");
		user.addStudy(study.getId());
		study.linkJSM(jsm.getId(), user.getId());
		FrozenJobSpecificModule fJSM = null;
		for(JobSpecificModule ssjsm:study.getStudySpecificJsms()){
			fJSM = ssjsm.freeze(study);
		}
		Participant p = new Participant();
		p.setName("testInterview");
		p.setStudyId(study.getId());
		p.save();
		JobHistory jh = new JobHistory();
		jh.setName("test");
		jh.setFinalJSMId(fJSM.getStudySpecificJsmId());
		jh.setParticipantId(p.getParticipantId().toString());
		jh.save();
		
		Interview interview = new Interview();
		interview.setJobHistoryId(jh.getId());
        interview.setFrozenJsmId(fJSM.getId());
        interview.setStatus(Interview.STARTED);
        interview.setParticipantId(p.getParticipantId().toString());
        interview.save();  
		jh.setStatusId(JobHistoryStatus.INTERVIEWED);
	    jh.update();
	    request.getSession().setAttribute("InterviewID",interview.getId());
	    request.getSession().setAttribute("JobHistoryID",jh.getId());
	    //request.getSession().setAttribute("ParticipantID",p.getParticipantId());
	    request.getSession().setAttribute("StudyID",study.getId());
	    request.getSession().setAttribute("Note","Start");
	    
	    Question nextQuestion = fJSM.getNextInterviewQuestion(null,interview);
        request.getSession().setAttribute("NextQuestion",nextQuestion);
	    
	    RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}
	private void saveInterviewAnswerAndFindNextQuestion(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String strLinkedQID = "";
		String strNextLinkedQID = "";
		String strInterviewId = request.getSession().getAttribute("InterviewID").toString();
		if (request.getParameter("closeEditI.x") == null) {
			if (request.getParameter("linkedQID") != null) {
				strLinkedQID = request.getParameter("linkedQID");
				Question saveQ = new Question("", strLinkedQID);
				saveQ.setInterviewID(strInterviewId);
				Interview interview = new Interview(strInterviewId);
				FrozenJobSpecificModule fjsm = new FrozenJobSpecificModule(interview.getFrozenJsmId());

				FrozenQA fqa = fjsm.getFrozenQA(saveQ);
				saveQ.setFrozenQuestion(fqa);
				if (request.getParameter("updateInterviewQuestion") != null) {
					this.interviewSaveAnswerMultiple(request,response,saveQ);
					saveQ.setAnswers(null);
					interview.save();
					request.getSession().removeAttribute("NextQuestion");
					request.getSession().setAttribute("JSMID", request.getSession().getAttribute("JSMIDtmp"));

				}else if (request.getParameter("Save + Next") != null){
					this.interviewSaveAnswerMultiple(request,response,saveQ);
					saveQ.setAnswers(null);
					Question nextQuestion = fjsm.getNextInterviewQuestion(fqa,interview);
					if(nextQuestion!=null){
						strNextLinkedQID = nextQuestion.getJsmQuestionStructureID();
					}             
					if(strNextLinkedQID.equalsIgnoreCase("")){
						strNextLinkedQID = "END";					
						interview.setStatus(Interview.COMPLETED);
						interview.save();
						JobHistory jh = new JobHistory(interview.getJobHistoryId());
						jh.setStatusId(JobHistoryStatus.INTERVIEWED);
						jh.update();
						request.getSession().setAttribute("Note","End");
						request.getSession().removeAttribute("NextQuestion");
					} else {
						nextQuestion.setInterviewID(strInterviewId);
						request.getSession().setAttribute("NextQuestion", nextQuestion);
					}
				}
			} 		
			RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
			dis.forward(request, response);
		}else{
			this.closeEditMode(request, response);
		}
	}
	private void interviewSaveAnswerMultiple(HttpServletRequest request, HttpServletResponse response,Question saveQ) throws Exception {
		String strLinkedQID = saveQ.getJsmQuestionStructureID();
		String strLinkedPAID = "";
		String strInterviewId = request.getSession().getAttribute("InterviewID").toString();
		Interview interview = new Interview(strInterviewId);
		FrozenJobSpecificModule fjsm = new FrozenJobSpecificModule(interview.getFrozenJsmId());		
		FrozenQA fqa = fjsm.getFrozenQA(saveQ);
		saveQ.setFrozenQuestion(fqa);
		
		ArrayList<?> oldAnswers = (ArrayList<?>)saveQ.getAnswers().clone();
		ArrayList<PossibleAnswer> newAnswers = new ArrayList<PossibleAnswer>();
		if(saveQ.isMultiple()){
			for(Iterator<?> it = oldAnswers.iterator();it.hasNext();){
				PossibleAnswer oldpa = (PossibleAnswer)it.next();
				if(oldpa.isFreeText()){
					saveQ.removeAnswer(oldpa);
				}
			}
		}
		boolean bAtLeastOne = false;
		Enumeration<?> postedvalues = request.getParameterNames();
		while (postedvalues.hasMoreElements()) {
			String strPost = postedvalues.nextElement().toString();
			String varName = strLinkedQID+"possibleAnswer";
			if (strPost.contains(varName)) {					
                if(strPost.contains("radio"+strLinkedQID+"possibleAnswer")){
                    //this is to handle the radio button
                    strLinkedPAID = request.getParameter(strPost);
                }else{
                	strLinkedPAID = strPost.substring(strPost.indexOf("_") + 1);
                }
				PossibleAnswer pa = new PossibleAnswer("", strLinkedPAID);
				if(pa.getDescription().toUpperCase().contains("[FREE TEXT]")){
					//get extra info
					if (request.getParameter(pa.getJsmQuestionPossibleAnswerStructureID()+"_freeText_"+pa.getJsmQuestionStructureID()) != null) {
						String strFreeText = request.getParameter(pa.getJsmQuestionPossibleAnswerStructureID()+"_freeText_"+pa.getJsmQuestionStructureID());
						pa.setActualAnswer(strFreeText);
					}
				}else if(pa.getDescription().toUpperCase().contains("[NUMBER")){
                    //get extra info
                    if (request.getParameter("selectAnswer_"+pa.getJsmQuestionStructureID()) != null) {
                        String strFreeText = request.getParameter("selectAnswer_"+pa.getJsmQuestionStructureID());
                        pa.setActualAnswer(strFreeText);
                    }
                }else{
                	pa.setActualAnswer(pa.getDescription());
                }
				saveQ.removeSkipped(strInterviewId);
				saveQ.saveAnswer(pa);
				newAnswers.add(pa);
				bAtLeastOne = true;
				if(pa.hasFrequencyQuestions()){
					for(Question q:pa.getChildQuestions()){
						if(q.isViewWithParent()){
							q.setInterviewID(strInterviewId);	
							q.setFrozenQuestion(fqa);
							this.interviewSaveAnswerMultiple(request,response,q);
						}						
					}
				}
			}						
		}		
		for(Iterator<?> it = oldAnswers.iterator();it.hasNext();){
			PossibleAnswer oldpa = (PossibleAnswer)it.next();
			if(!(newAnswers.contains(oldpa))){
				saveQ.removeAnswer(oldpa);
			}else{
				if(!(saveQ.isMultiple())){
					if((oldpa.isFreeText())||(oldpa.isNumber())){
						boolean bFoundNewAnswer = false;
						if(saveQ.getAnswers().size()>0){
							for(PossibleAnswer panswer:saveQ.getAnswers()){
								if(!(panswer.getActualAnswer().equalsIgnoreCase(oldpa.getActualAnswer()))){
									bFoundNewAnswer = true;
									break;	
								}
							}
							if(bFoundNewAnswer){
								saveQ.removeAnswer(oldpa);
								break;
							}
						}												
					}
				}				
			}
		}
		if(!(bAtLeastOne)){
            PossibleAnswer pa = new PossibleAnswer();
            PossibleAnswer skippedPa = pa.getSkippedPossibleAnswer();
            skippedPa.setJsmQuestionStructureID(saveQ.getJsmQuestionStructureID());
            saveQ.removeSkipped(strInterviewId);
            saveQ.saveAnswer(skippedPa);
        }               
	}
}