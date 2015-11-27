package com.researchit.servlets;

import java.io.BufferedReader;
import java.io.IOException;
import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONArray;

import com.researchit.Agent;
import com.researchit.AgentGroup;
import com.researchit.FrozenJobSpecificModule;
import com.researchit.JobSpecificModule;
import com.researchit.PossibleAnswer;
import com.researchit.Question;
import com.researchit.User;
import com.researchit.common.Study;
import com.researchit.expert.ExpertAgent;
import com.researchit.html.InterviewManagementSystem;
import com.researchit.html.MasterQuestionList;

/**
 * Servlet implementation class for Servlet: StudyUpdate
 *
 */
public class StudyWiz extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#HttpServlet()
	 */
	public StudyWiz() {
		super();
	}   	

	/* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}  	

	/* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action;
		String responseXmlString = "";
		StringBuffer jb = new StringBuffer();
		String line = null;
		JSONObject jsonObject = null;
		JSONArray jsonArray = null;
		try {
			BufferedReader reader = request.getReader();
			while ((line = reader.readLine()) != null)
				jb.append(line);
		} catch (IOException e) { //report an error 
			//System.err.print("IO Exception reading http header");
		}
		if (!jb.toString().equals("")){
			try {
				jsonObject = new JSONObject(jb.toString());
			} catch (JSONException je) {
				try{
					jsonArray = new JSONArray(jb.toString());
					jsonObject = new JSONObject();
					jsonObject.put("array", jsonArray);
				}catch(JSONException je2){;
				//System.err.print("Error parsing JSON request string");
				}
			}
		}
		// Work with the data using methods like...
		// int someInt = jsonObject.getInt("intParamName");

		// JSONObject nestedObj = jsonObject.getJSONObject("nestedObjName");
		// JSONArray arr = jsonObject.getJSONArray("arrayParamName");
		// etc...
		//;

		if (request.getParameter("action") != null){
			action = request.getParameter("action");
			if (action.equalsIgnoreCase("save")){
				responseXmlString = this.saveStep(request, jsonObject);
			}else if (action.equalsIgnoreCase("next")){
				responseXmlString = this.nextStep(request);
			}else if (action.equalsIgnoreCase("back")){
				responseXmlString = this.backStep(request);
			}else if (action.equalsIgnoreCase("finish")){
				responseXmlString = this.finishStep(request);
			}else if (action.equalsIgnoreCase("editStudyJsm")) {
				responseXmlString = this.editStudyJsm(request);
			}else if (action.equalsIgnoreCase("editQuestion")) {
				responseXmlString = this.editQuestion(request);
			}else if (action.equalsIgnoreCase("addProbQuestion")) {
				responseXmlString = this.addProbQuestion(request);
			}else if (action.equalsIgnoreCase("addFreqQuestion")) {
				responseXmlString = this.addFreqQuestion(request);
			}else if (action.equalsIgnoreCase("moveUp")) {
				responseXmlString = this.moveUp(request);
			}else if (action.equalsIgnoreCase("moveDown")) {
				responseXmlString = this.moveDown(request);
			}else if (action.equalsIgnoreCase("deleteqora")) {
				responseXmlString = this.deleteQora(request);
			}else if (action.equalsIgnoreCase("linkAjsm")) {
				responseXmlString = this.linkAjsm(request);
			}else if (action.equalsIgnoreCase("importAjsmToAnswer")) {
				responseXmlString = this.importAjsmToAnswer(request);
			}else if (action.equalsIgnoreCase("reviewfjsm")) {
				responseXmlString = this.reviewFjsm(request);
			}else if (action.equalsIgnoreCase("closeWindow")) {
				responseXmlString = this.closeWindow(request);
			}


//			Write XML to response.
			response.setContentType("text/xml");
			response.setHeader("Cache-Control", "no-cache");
			response.getWriter().write(responseXmlString);
		}
	}

	private String saveStep(HttpServletRequest request, JSONObject jsonObject) {
		String step = "";
		String responseXmlString = "";
		String statusMessage = "";
		String userMessage = "";
		Study study = null;
		User user = null;

		if (request.getParameter("step") != null){
			step = request.getParameter("step");
		}
		if (request.getSession().getAttribute("UserObject") != null) {
			user = ((User)request.getSession().getAttribute("UserObject"));
		}
		if (request.getSession().getAttribute("Study") != null) {
			study = (Study)request.getSession().getAttribute("Study");
		}else {
			study = new Study();
			step = "1";
		}

		switch (Integer.parseInt(step)){
		case 1: 
			try{
				String studyName = jsonObject.getString("name");
				if (study.findStudy(studyName).getId().equalsIgnoreCase("")) {
					statusMessage = "valid";
					userMessage = "The name " + studyName + " is valid";
					study = new Study();
					study.setName(studyName);
					study.insert();
					user.addStudy(study.getId());
					request.getSession().setAttribute("Study", study);
				}else{
					statusMessage = "invalid";
					userMessage = "Name already in use";
				}
			}catch(Exception e){
				userMessage = "Exception in 'Find Study'";
			}
			responseXmlString = getXmlSaveResponse(statusMessage, userMessage);
			break;
		case 2:
			try{
				String description = jsonObject.getString("description");
				study.setDescription(description);
				study.update();
				request.getSession().setAttribute("Study", study);
				statusMessage = "valid";
				userMessage = "Save Description Successful";
			}catch(Exception e) {
				statusMessage = "invalid";
				userMessage = "Exception saving study description";
			}
			responseXmlString = getXmlSaveResponse(statusMessage, userMessage);
			break;
		case 3:
			try{
				for (Agent agent : this.getAgents(jsonObject)){
					study.addAgent(agent);
				}
				request.getSession().setAttribute("Study", study);
				statusMessage = "valid";
				userMessage = "Save Agents Successful";
			}catch(Exception e){
				statusMessage = "invalid";
				userMessage = "Exception saving study agents";
			}
			responseXmlString = getXmlSaveResponse(statusMessage, userMessage);
			break;
		case 4:
			String userId = user.getId();
			try{
				for (JobSpecificModule jsm : this.getSSJsms(jsonObject)){
					study.linkJSM(jsm.getId(), userId);
				}
				request.getSession().setAttribute("Study", study);
				statusMessage = "valid";
				userMessage = "Save SSJSM's Successful";
			}catch(Exception e){
				statusMessage = "invalid";
				userMessage = "Exception saving study SSJSM's";
			}
			responseXmlString = getXmlSaveResponse(statusMessage, userMessage);
			break;
		case 5:
			try{

//				Edit SSJSM's

				//request.getSession().setAttribute("Study", study);
				statusMessage = "valid";
				userMessage = "Save SSJSM Successful";
			}catch(Exception e){
				statusMessage = "invalid";
				userMessage = "Exception saving SSJSM";
			}
			responseXmlString = getXmlSaveResponse(statusMessage, userMessage);
			break;
		case 6:
			try{
//				Freeze SSJSM's
				ArrayList<JobSpecificModule> jsms = this.getSSJsms(jsonObject);
				for(JobSpecificModule jsm: jsms){
					jsm.freeze(study);
				}
				statusMessage = "valid";
				userMessage = "Freeze SSJSM Successful";
			}catch(Exception e){
				statusMessage = "invalid";
				userMessage = "Exception freezing SSJSM";
			}
			responseXmlString = getXmlSaveResponse(statusMessage, userMessage, encodeHtml(getFreezeSSJsmsScreen(study, user.getId())));
			break;
		}
		return responseXmlString;
	}

	private String editStudyJsm(HttpServletRequest request) {
		String responseXmlString = "";
		JobSpecificModule jsm = null;
		try{
			if (request.getParameter("jsmId") != null) {
				jsm = new JobSpecificModule(request.getParameter("jsmId").toString());
				request.getSession().setAttribute("jsm", jsm);
				responseXmlString = getXmlResponseEditJsm(jsm);
			}
		}catch(Exception e){
			//System.err.println("Error displaying JSM structure");
		}
		return responseXmlString;
	}

	private String editQuestion(HttpServletRequest request){
		String responseXmlString = "";
		String questionNo = request.getParameter("questionNo");
		try {
			User user = ((User)request.getSession().getAttribute("UserObject"));
			responseXmlString = getXmlResponseEditQuestion(questionNo, user);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return responseXmlString;
	}

	private String addProbQuestion(HttpServletRequest request){
		String responseXmlString = "";
		String questionNo = request.getParameter("questionNo");
		try {
			User user = ((User)request.getSession().getAttribute("UserObject"));
			PossibleAnswer pa = new PossibleAnswer("", questionNo);
			Question parentQ = new Question("", pa.getJsmQuestionStructureID());
			JobSpecificModule jsm = new JobSpecificModule(parentQ.getJsmID());
			responseXmlString = getXmlResponseAddProbQuestion(pa, user, jsm);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return responseXmlString;
	}

	private String addFreqQuestion(HttpServletRequest request){
		String responseXmlString = "";
		String questionNo = request.getParameter("questionNo");
		try {
			User user = ((User)request.getSession().getAttribute("UserObject"));
			responseXmlString = getXmlResponseAddFreqQuestion(questionNo, user);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return responseXmlString;
	}

	private String moveUp(HttpServletRequest request){
		String responseXmlString = "";
		String qoraNo = request.getParameter("qoraNo");
		String qoraType = request.getParameter("qoraType");
		JobSpecificModule jsm = (JobSpecificModule)request.getSession().getAttribute("jsm");

		try {
			if (qoraType.equals("question")) {
				Question q = new Question("", qoraNo);
				q.moveUp();
			}else{
				PossibleAnswer pa = new PossibleAnswer("", qoraNo);
				pa.moveUp();
			}
			JobSpecificModule updatedJsm = new JobSpecificModule(jsm.getId());
			responseXmlString = getXmlResponseEditJsm(updatedJsm);
			request.getSession().setAttribute("jsm", updatedJsm);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return responseXmlString;
	}

	private String moveDown(HttpServletRequest request){
		String responseXmlString = "";
		String qoraNo = request.getParameter("qoraNo");
		String qoraType = request.getParameter("qoraType");
		JobSpecificModule jsm = (JobSpecificModule)request.getSession().getAttribute("jsm");

		try {
			if (qoraType.equals("question")) {
				Question q = new Question("", qoraNo);
				q.moveDown();
			}else{
				PossibleAnswer pa = new PossibleAnswer("", qoraNo);
				pa.moveDown();
			}
			JobSpecificModule updatedJsm = new JobSpecificModule(jsm.getId());
			responseXmlString = getXmlResponseEditJsm(updatedJsm);
			request.getSession().setAttribute("jsm", updatedJsm);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return responseXmlString;
	}

	private String deleteQora(HttpServletRequest request){
		String responseXmlString = "";
		String qoraNo = request.getParameter("qoraNo");
		String qoraType = request.getParameter("qoraType");
		JobSpecificModule jsm = (JobSpecificModule)request.getSession().getAttribute("jsm");

		try {
			if (qoraType.equals("question")) {
				Question q = new Question("", qoraNo);
				this.removeFromStructure(q, jsm);
			}else{
				PossibleAnswer pa = new PossibleAnswer("", qoraNo);
				this.removeFromStructure(pa, jsm);
			}
			JobSpecificModule updatedJsm = new JobSpecificModule(jsm.getId());
			responseXmlString = getXmlResponseEditJsm(updatedJsm);
			request.getSession().setAttribute("jsm", updatedJsm);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return responseXmlString;
	}

	private String linkAjsm(HttpServletRequest request){
		String responseXmlString = "";
		String paId = request.getParameter("possanswerNo");
		try {
			User user = ((User)request.getSession().getAttribute("UserObject"));
			PossibleAnswer pa = new PossibleAnswer("", paId);
			request.getSession().setAttribute("possibleanswer", pa);
			Question parentQ = new Question("", pa.getJsmQuestionStructureID());
			JobSpecificModule jsm = new JobSpecificModule(parentQ.getJsmID());
			responseXmlString = getXmlResponseLinkAjsm(pa, user, jsm);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return responseXmlString;
	}

	private String importAjsmToAnswer(HttpServletRequest request){
		String responseXmlString = "";
		PossibleAnswer pa = (PossibleAnswer)request.getSession().getAttribute("possibleanswer");
		request.getSession().removeAttribute("possibleanswer");
		String ajsmId = request.getParameter("ajsmId");
		try {
			Question parentQ = new Question("", pa.getJsmQuestionStructureID());
			JobSpecificModule jsm = new JobSpecificModule(parentQ.getJsmID());
			JobSpecificModule ajsm = new JobSpecificModule(ajsmId);
			importAJSMToAnswer(ajsm, pa);
			responseXmlString = getXmlResponseEditJsm(jsm);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return responseXmlString;
	}

	private String reviewFjsm(HttpServletRequest request){
		String responseXmlString = "";
		String fjsmId = request.getParameter("fjsmId");
		Study study = (Study)request.getSession().getAttribute("Study");
		try {
			FrozenJobSpecificModule fjsm = new FrozenJobSpecificModule(fjsmId);
			responseXmlString = getXmlResponseReviewFjsm(fjsm, study);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return responseXmlString;
	}

	private String closeWindow(HttpServletRequest request){
		String responseXmlString = "";
		String window = request.getParameter("window");
		//Study study = (Study)request.getSession().getAttribute("Study");
		try {
			if (window.equalsIgnoreCase("reviewfjsm")) {
				responseXmlString = getXmlResponseStep(request, "7");
			}else if (window.equalsIgnoreCase("editjsm")){
				request.getSession().removeAttribute("jsm");
				responseXmlString = getXmlResponseStep(request, "5");
			}else if (window.equalsIgnoreCase("linkjsm")){
				JobSpecificModule jsm = (JobSpecificModule)request.getSession().getAttribute("jsm");
				responseXmlString = getXmlResponseEditJsm(jsm);
			}else if (window.equalsIgnoreCase("editQuestion")){
				JobSpecificModule jsm = (JobSpecificModule)request.getSession().getAttribute("jsm");
				responseXmlString = getXmlResponseEditJsm(jsm);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return responseXmlString;
	}

	private String nextStep(HttpServletRequest request) {
		String responseXmlString = "";
		String step = "";
		String nextStep = "";
		if (request.getParameter("step") != null) {
			step = request.getParameter("step");
			nextStep = String.valueOf((Integer.parseInt(step) + 1));
		}
		responseXmlString = getXmlResponseStep(request, nextStep);
		return responseXmlString;
	}

	private String backStep(HttpServletRequest request) {
		String responseXmlString = "";
		String step = "";
		String nextStep = "";
		if (request.getParameter("step") != null) {
			step = request.getParameter("step");
			nextStep = String.valueOf((Integer.parseInt(step) - 1));
		}
		responseXmlString = getXmlResponseStep(request, nextStep);
		return responseXmlString;
	}

	private String finishStep(HttpServletRequest request) {
		String responseXmlString = "";
		request.getSession().removeAttribute("Study");
		request.removeAttribute("runWizard");
		request.removeAttribute("wizardStep");

		return responseXmlString;
	}

	private String getXmlSaveResponse(String statusMessage, String userMessage){
		return getXmlSaveResponse(statusMessage, userMessage, "");
	}

	private String getXmlSaveResponse(String statusMessage, String userMessage, String updateHtml){
		String responseXml = "<?xml version=\"1.0\"?>\n";
		responseXml += "<result status=\"" + statusMessage + "\" message=\"" + userMessage + "\" updatehtml=\"" + updateHtml + "\" >\n";
		responseXml += "</result>";
		return responseXml;
	}

	private String getXmlResponseStep(HttpServletRequest request, String nextStep){
		String responseHtml = "";
		String userMsg = "";
		Study study = null;
		String userId = ((User)request.getSession().getAttribute("UserObject")).getId();

		if (request.getSession().getAttribute("Study") != null) {
			study = (Study)request.getSession().getAttribute("Study");
		}else {
			nextStep = "1";
		}
		int stepNo = Integer.parseInt(nextStep);

		switch (stepNo) {
		case 1: 
			userMsg = "Add a short study name";
			responseHtml = encodeHtml("<table><tr><td>Study Name</td></tr><tr><td><input type=text id='studyName' autocomplete='off'/></td></tr></table>");
			break;
		case 2: 
			userMsg = "Add a description";
			responseHtml = encodeHtml("<table><tr><td>Study Description</td></tr><tr><td><textarea id='studyDesc' cols='20' rows='4'></textarea></td></tr></table>");
			break;
		case 3: 
			userMsg = "Add Agents";
			responseHtml = encodeHtml(this.getAgentsScreen());
			break;
		case 4: 
			userMsg = "Add SSJSMs";
			responseHtml = encodeHtml(this.getSSJsmsScreen(study, true));
			break;
		case 5: 
			userMsg = "Select SSJSM to Edit";
			responseHtml = encodeHtml(this.getSavedSSJsmsScreen(study, userId));
			break;
		case 6:
			userMsg = "Select SSJSMs to freeze";
			responseHtml = encodeHtml(this.getFreezeSSJsmsScreen(study, userId));
			break;
		case 7:
			userMsg = "Click edit to review frozen JSM";
			responseHtml = encodeHtml(this.showFrozenJSMsReviewList(study));
			break;
		}

		String responseXml = "<?xml version=\"1.0\"?>\n";
		responseXml += "<result message=\"" + userMsg + "\" step=\"" + nextStep + "\" stepHtml=\"" + responseHtml + "\">\n";
		responseXml += "</result>";
		return responseXml;
	}

	private String getXmlResponseEditJsm(JobSpecificModule jsm)throws Exception{
		String responseHtml = "<div id='editjsms'>";
		String userMsg = "Edit JSM then press save";
		int nextStep = 5;
		//Show jsm structure but replace close button
		responseHtml += new InterviewManagementSystem().showStructuredJSM(jsm).replace("<td style=\"text-align: right;\"><input type=image src='ImageStream?ImageName=close.gif' name=closeEdit title='Close Edit Mode' height=12 width=12/>", "<td style=\"text-align: right;\"><input type=image src='ImageStream?ImageName=close.gif' name=closeEdit title='Close Edit Mode' height=12 width=12 onclick=closeWindow('editjsm')></input>");
		responseHtml += "</div>";
		responseHtml += this.addActionButtons();
		responseHtml = encodeHtml(responseHtml);

		String responseXml = "<?xml version=\"1.0\"?>\n";
		responseXml += "<result message=\"" + userMsg + "\" step=\"" + nextStep + "\" stepHtml=\"" + responseHtml + "\">\n";
		responseXml += "</result>";
		return responseXml;
	}

	private String getXmlResponseReviewFjsm(FrozenJobSpecificModule fjsm, Study study)throws Exception{
		String responseHtml = "<div id='reviewfsms'>";
		String userMsg = "Review frozen JSM";
		int nextStep = 7;
		//Show jsm structure but remove close button
		responseHtml += "<table class=EditView cellpadding=0 cellspacing=0>";
		responseHtml += "<tr class=windowTop><td colspan=2 align=center>Structured Frozen JSM</td><td style=\"text-align: right;\"><input type=image src='ImageStream?ImageName=close.gif' name=closeEdit title='Close Edit Mode' height=12 width=12 onclick=closeWindow('reviewfjsm')></input></td></tr>";			
		responseHtml +="<tr>";
		responseHtml +="<td>";
		responseHtml +="<table width=100%>";       	
		responseHtml +="<tr>";
		responseHtml +="<td valign=top>";
		responseHtml += new InterviewManagementSystem().showFrozenJSM(fjsm);
		responseHtml +="</td>";
		responseHtml +="</tr>";
		responseHtml +="</table>";
		responseHtml +="</td>";
		responseHtml +="</tr>"; 
		responseHtml += "</table>";
		//responseHtml += new InterviewManagementSystem().showStructuredJSM(fjsm, study);//.replace("<td style=\"text-align: right;\"><input type=image src='ImageStream?ImageName=close.gif' name=closeEdit title='Close Edit Mode' height=12 width=12/>", "<td>");
		responseHtml += "</div>";
		responseHtml = encodeHtml(responseHtml);
		String responseXml = "<?xml version=\"1.0\"?>\n";
		responseXml += "<result message=\"" + userMsg + "\" step=\"" + nextStep + "\" stepHtml=\"" + responseHtml + "\">\n";
		responseXml += "</result>";
		return responseXml;
	}

	private String getXmlResponseEditQuestion(String questionNo, User user)throws Exception{
		String responseHtml = "<div id='editQuestion'>";
		String userMsg = "Edit Question then press save";
		int nextStep = 5;
		//Show jsm structure but remove close button
		responseHtml += new MasterQuestionList().showEditQuestions(questionNo, user).replace("<td style=\"text-align: right;\"><input type=image src='ImageStream?ImageName=close.gif' name=closeEdit title='Close Edit Mode' height=12 width=12/>", "<td style=\"text-align: right;\"><input type=image src='ImageStream?ImageName=close.gif' name=closeEdit title='Close Edit Mode' height=12 width=12 onclick=closeWindow('editQuestion')></input>");
		responseHtml = responseHtml.replace("EditView", "editView");
		responseHtml += "</div>";
		responseHtml += this.addActionButtons();
		responseHtml = encodeHtml(responseHtml);

		String responseXml = "<?xml version=\"1.0\"?>\n";
		responseXml += "<result message=\"" + userMsg + "\" step=\"" + nextStep + "\" stepHtml=\"" + responseHtml + "\">\n";
		responseXml += "</result>";
		return responseXml;
	}

	private String getXmlResponseAddProbQuestion(PossibleAnswer pa, User user, JobSpecificModule jsm)throws Exception{
		String responseHtml = "<div id='addProbQuestion'>";
		String userMsg = "Add Question then press save";
		int nextStep = 5;
		//Show jsm structure but remove close button
		responseHtml += this.addQuestion(pa, user, jsm, Question.PROBABILITY);//new MasterQuestionList().showEditQuestions(questionNo, user).replace("<td style=\"text-align: right;\"><input type=image src='ImageStream?ImageName=close.gif' name=closeEdit title='Close Edit Mode' height=12 width=12/>", "<td>");
		responseHtml += "</div>";
		responseHtml += this.addActionButtons();
		responseHtml = encodeHtml(responseHtml);

		String responseXml = "<?xml version=\"1.0\"?>\n";
		responseXml += "<result message=\"" + userMsg + "\" step=\"" + nextStep + "\" stepHtml=\"" + responseHtml + "\">\n";
		responseXml += "</result>";
		return responseXml;
	}

	private String getXmlResponseAddFreqQuestion(String questionNo, User user)throws Exception{
		String responseHtml = "<div id='addFreqQuestion'>";
		String userMsg = "Add Question then press save";
		int nextStep = 5;
		//Show jsm structure but remove close button
		//responseHtml += new MasterQuestionList().showEditQuestions(questionNo, user).replace("<td style=\"text-align: right;\"><input type=image src='ImageStream?ImageName=close.gif' name=closeEdit title='Close Edit Mode' height=12 width=12/>", "<td>");
		responseHtml += "</div>";
		responseHtml += this.addActionButtons();
		responseHtml = encodeHtml(responseHtml);

		String responseXml = "<?xml version=\"1.0\"?>\n";
		responseXml += "<result message=\"" + userMsg + "\" step=\"" + nextStep + "\" stepHtml=\"" + responseHtml + "\">\n";
		responseXml += "</result>";
		return responseXml;
	}

	private String getXmlResponseLinkAjsm(PossibleAnswer pa, User user, JobSpecificModule jsm)throws Exception{
		String responseHtml = "<div id='linkAjsm'>";
		String userMsg = "Select AJSM to link";
		int nextStep = 5;
		//Show jsm structure but remove close button
		responseHtml += this.showLinkAJSM(pa, user.getId(),jsm.getId());
		responseHtml += "</div>";
		//responseHtml += this.addActionButtons();
		responseHtml = encodeHtml(responseHtml);

		String responseXml = "<?xml version=\"1.0\"?>\n";
		responseXml += "<result message=\"" + userMsg + "\" step=\"" + nextStep + "\" stepHtml=\"" + responseHtml + "\">\n";
		responseXml += "</result>";
		return responseXml;
	}

	public static String encodeHtml(String aText){
		final StringBuilder result = new StringBuilder();
		final StringCharacterIterator iterator = new StringCharacterIterator(aText);
		char character =  iterator.current();
		while (character != CharacterIterator.DONE ){
			if (character == '<') {
				result.append("&lt;");
			}
			else if (character == '>') {
				result.append("&gt;");
			}
			else if (character == '\"') {
				result.append("&quot;");
			}
			else if (character == '\'') {
				result.append("&#039;");
			}
			else if (character == '&') {
				result.append("&amp;");
			}
			else {
				//the char is not a special one
				//add it to the result as is
				result.append(character);
			}
			character = iterator.next();
		}
		return result.toString();
	}

	private String getAgentsScreen() {
		String htmlScreen = "<div id='agents'><table><tr><th>Agents</th></tr>";
		try{
			AgentGroup ag = new AgentGroup();
			for (AgentGroup group :ag.getAgentGroups())  {
				htmlScreen += "<tr><td>" + group.getName() + "</td></tr>";
				for (Agent agent : group.getAgents()) {
					htmlScreen += "<tr><td><input type='checkbox' checked='checked' id='" + agent.getId() + "' /></td><td>" + agent.getName() + "</td></tr>";
				}
			}
		}catch(Exception e){
			//System.err.print("Could not access agents or groups");
		}

		htmlScreen += "</table></div>";
		return htmlScreen;
	}

	private String getSSJsmsScreen(Study study, boolean bPreviewMode) {
		String retValue = "";
		retValue += "<div id='ssjsms'><table class=EditView>";
		retValue += "<tr class=windowTop><td align=center>Study Agents</td><td></td></tr>";			
		if(bPreviewMode){
			try{
				ArrayList<JobSpecificModule> studyJSMs = study.getStudySpecificJsmsPreview();
				retValue += "<tr><td>";
				retValue += "<table class=ContentList>";
				retValue += "<tr class=ListHeader><td>Study Specific JSMs</td><td align=center>Full Question Count</td><td align=center>Max time to generate</td></tr>";
				retValue += "<tr><td valign=top><input type=checkbox checked='checked' name=checkAll onclick=toggleAllCheckboxes('jsms')></input></td></tr>";
				for(JobSpecificModule jsm: studyJSMs){
					retValue += "<tr>";
					int qCount = jsm.getQuestionCount();
					long estTime = Math.round(((double)qCount/(double)60)*(double)10);
					retValue += "<td valign=top><input id='"
						+ jsm.getId()+"' type=checkbox checked='checked' name=jsmsCheckBox_"
						+ jsm.getId()
						+ "></input>"+jsm.getName()+"</td><td align=center>"+qCount+"</td><td align=center>"+estTime+" seconds</td>";
					retValue += "</tr>";					
				}
				retValue += "</table></div>";
			}catch(Exception e){
				//System.err.print("Problem creating SSJSM's Screen");
			}
		}
		return retValue;
	}

	private String getSavedSSJsmsScreen(Study study, String userId) {
		String retValue = "";
		retValue += "<div id='savedssjsms'><table class=EditView>";
		retValue += "<tr class=windowTop><td align=center>Saved Study JSM's</td><td></td></tr>";			
		try{
			ArrayList<JobSpecificModule> studySpecificJSMs = study.getStudySpecificJsms();
			retValue += "<tr><td>";
			retValue += "<table class=ContentList>";
			retValue += "<tr class=ListHeader><td>Study Specific JSMs</td><td align=center>Description</td></tr>";
			for(JobSpecificModule jsm: studySpecificJSMs){
				retValue += "<tr>";
				retValue += "<td valign=top><input id='"
					+ jsm.getId()+"' type=button name=jsmsCheckBox_"
					+ jsm.getId()
					+ " onclick='editStudyJsm(" + jsm.getId() + ")'></input>"+jsm.getName()+"</td><td align=center>"+jsm.getDescription()+"</td>";
				retValue += "</tr>";					
			}
			retValue += "</table></div>";
		}catch(Exception e){
			//System.err.print("Problem creating saved SSJSM's Screen");
		}
		return retValue;
	}

	private String getFreezeSSJsmsScreen(Study study, String userId) {
		String retValue = "";
		try{
			retValue += "<div id='freezessjsms'>";//<table class=EditView>";
			retValue += new InterviewManagementSystem().showStudyJsms(study);
			retValue += "</div>";
		}catch(Exception e){
			//System.err.print("Problem creating freeze SSJSM's Screen");
		}
		return retValue;
	}

	private ArrayList<Agent> getAgents(JSONObject jsonObject) {
		ArrayList<Agent> agents = new ArrayList<Agent>();
		try{
			for (int i = 0;i<jsonObject.getJSONArray("array").getJSONObject(0).length();i++){
				Agent agent = new Agent(jsonObject.getJSONArray("array").getJSONObject(0).get(String.valueOf(i)).toString());
				agents.add(agent);
			}
		}catch (Exception e){
			//System.err.println("Error reading array of agents");
		}
		return agents;
	}

	private ArrayList<JobSpecificModule> getSSJsms(JSONObject jsonObject) {
		ArrayList<JobSpecificModule> ssjsms = new ArrayList<JobSpecificModule>();
		try{
			for (int i = 0;i<jsonObject.getJSONArray("array").getJSONObject(0).length();i++){
				JobSpecificModule jsm = new JobSpecificModule(jsonObject.getJSONArray("array").getJSONObject(0).get(String.valueOf(i)).toString());
				ssjsms.add(jsm);
			}
		}catch (Exception e){
			//System.err.println("Error reading array of SSJSM's");
		}
		return ssjsms;
	}

	private String addActionButtons() {
		String html = "<div class='actionButtonsBar' id='divWizActionButtonsBar'>";
		html += "<input height='32' width='32' type='image' onclick='return editQuestion();' alt='Edit Selected' title='Edit Selected' name='editSelectedQuestion' src='ImageStream?ImageName=editquestion.gif' style='padding-left: 5px;'>";
		html += "<input height='32' width='32' type='image' onclick='return addProbQuestion();' alt='Add a Prob Question' title='Add a Prob Question' name='addProbabilityQuestion' src='ImageStream?ImageName=addprobquestion.gif' style='padding-left: 5px;'>";
		html += "<input height='32' width='32' type='image' onclick='return addFreqQuestion();' name='addFreqQuestion' src='ImageStream?ImageName=addfrequencyquestion.gif' style='padding-left: 5px;'>";
		html += "<input height='32' width='32' type='image' onclick='return moveUp();' alt='Move up in sequence' title='Move up in sequence' name='moveUp' src='ImageStream?ImageName=moveup.gif' style='padding-left: 5px;'>";
		html += "<input height='32' width='32' type='image' onclick='return moveDown();' alt='Move down in sequence' title='Move down in sequence' name='moveDown' src='ImageStream?ImageName=movedown.gif' style='padding-left: 5px;'>";
		html += "<input height='32' width='32' type='image' onclick='return deleteQuestion();' alt='Remove' title='Remove' name='structureRemove' src='ImageStream?ImageName=remove.gif' style='padding-left: 5px;'>";
		html += "<input height='32' width='32' type='image' onclick='return linkAjsm();' alt='Link AJSM' title='Link AJSM' name='linkAJSM' src='ImageStream?ImageName=linkajsm.gif' style='padding-left: 5px;'>";
		html += "</div>";

		return html;
	}

	private String addQuestion(Object o, User user, JobSpecificModule jsm, String qTypeId) throws Exception {
		String questionHTML = "";
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
		String qid = "";

		if (o instanceof PossibleAnswer) {
			PossibleAnswer pa = (PossibleAnswer)o;
			q.setDescription(strText);
			q.setTypeID(qTypeId);
			if(!(q.exists())){
				q.insert();
			}
			q.linkToPossibleAnswer(pa.getId(), pa.getJsmQuestionPossibleAnswerStructureID());
			q.resetSequences();
		} else {//its a question
			if (!((Question)o).getId().equals("")){
				qid = ((Question)o).getId();
			}
			//its a root question
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
			q.linkToJSM(jsm.getId());
			if (iSequence != -1) {
				q.setSequence(iSequence);
				q.updateSequence();
				q.resetSequences();
			}
		}
		questionHTML = new MasterQuestionList().showEditQuestions(q.getId(), user);
		return questionHTML;
	}

	private void importAJSMToAnswer(JobSpecificModule ajsm, PossibleAnswer pa) throws Exception {
		ajsm.importToPossibleAnswer(pa);
	}

	public String showLinkAJSM(PossibleAnswer pa,String userID,String jsmId) throws Exception {
		String strRetValue = "<table class=EditView cellpadding=0 cellspacing=0>";		
		strRetValue += "<tr class=windowTop><td align=center>Manage A-JSMs</td><td><input type=image src='ImageStream?ImageName=close.gif' name=closeEdit title='Close Edit Mode' height=12 width=12 onclick=closeWindow('linkjsm')></input></td></tr>";						
		strRetValue += "<tr>";
		strRetValue += "<td align=center>";
		strRetValue += "<table >";
		strRetValue += "<tr>";
		if(pa.getId().equalsIgnoreCase("")){
			strRetValue += "<td >At End of JSM</td><td>";			
		}else{
			Question q = new Question("",pa.getJsmQuestionStructureID());
			strRetValue += "<td class=questions>"+q.getDescription()+"</td><td class=possibleanswers>"+pa.getName()+"</td>";			
		}	
		strRetValue += "</tr>";	
		strRetValue += "<tr><td></td>";	
		strRetValue += "<td>";	
		strRetValue += this.showEditAJSM(pa,userID,jsmId);
		strRetValue += "</td>";	
		strRetValue += "</tr>";
		strRetValue += "</table>";
		strRetValue += "</td>";			
		strRetValue += "</tr>";
		strRetValue += "</table>";
		return strRetValue;
	}

	public String showEditAJSM(PossibleAnswer pa,String userId,String jsmId) throws Exception {									
		String retVal = "";
		retVal += "<table cellpadding=0 cellspacing=0>";
		retVal += "<tr><td> ";	
		retVal += "</td> ";						
		retVal += "<td> ";						
		retVal += this.showUnlinkedAJSMs(userId);	 
		retVal += "</td> ";		
		retVal += "</tr>";						
		retVal += "</table>";						

		return retVal;		
	}

	private String showUnlinkedAJSMs(String userId) throws Exception {	
		String retVal = "";
		for (JobSpecificModule jsm: new JobSpecificModule().getTemplateAJSMs()){								
			retVal += " <input type='button' name='" 
				+ jsm.getId() 
				+  "' value='" 
				+ jsm.getName()
				+  "' onclick='importAjsm(\"" + jsm.getId() + "\")'></input>";
		}
		return retVal;							
	}

	private String showFrozenJSMsReviewList(Study study){
		String retVal = "";
		try {
			ArrayList<JobSpecificModule> studyJSMs = study.getStudySpecificJsms();
			retVal += "<table class=ContentList>";
			retVal +="<tr class=ListHeader><td>Study Specific JSMs</td><td align=center>Time Stamp</td><td align=center>Usage Count</td></tr>";

			String dateUpdated = "";

			for(JobSpecificModule jsm: studyJSMs){
				dateUpdated = jsm.getDateUpdated();
				retVal += "<tr>";
				retVal += "<td>"+jsm.getName()+"</td><td align=center>"+dateUpdated+"</td><td></td>";
				retVal += "</tr>";			
				int i=1;
				String dateCreated = "";
				for(FrozenJobSpecificModule fjsm: jsm.getFrozenJSMs(study.getId())){
					String outOfDate = "";
					dateCreated = fjsm.getDateCreated();
					if(dateUpdated.compareTo(dateCreated)>0){
						outOfDate = "<image src='ImageStream?ImageName=warning.gif' alt='Out of date' title='Out of date' border=0 />";
					}
					retVal += "<tr><td style='padding-left:10px'><input id="
						+ fjsm.getId()+" type=button value='Review' name=fjsmreview onclick='reviewfjsm(\""+ fjsm.getId()+"\")'></input></td><td>Frozen Version "+i+" of "+jsm.getName()+"</td><td align=center>"+fjsm.getDateCreated()+outOfDate+"</td><td align=center>"+fjsm.getInterviews(study.getId()).size()+"</td></tr>";
					i++;
				}		
			}
			retVal += "</table>";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return retVal;
	}

	private void removeFromStructure(Object o, JobSpecificModule jsm) {
		try {
			ExpertAgent ex = new ExpertAgent( );
			if (o instanceof Question) {
				Question q = (Question)o;
				if (q.getChildQuestions().size() > 0 ) {
					//String strScript = "alert('Question " + q.getName().toString() + " has child questions attached! Please delete them first.');";
				} else {
					boolean hasRules = false;
					//String strScript = "";
					for(PossibleAnswer pa: q.getPossibleAnswers()){
						if(ex.hasRule(q.getId(),pa.getId(),jsm.getId())){
							//strScript += "alert(\"Answer " + pa.getName().toString() + " has Assessment Rules attached! These may be invalidated if this answer is removed.\"); ";					
							//request.setAttribute("script", strScript);
							hasRules = true;
						}
					}
					if(!(hasRules)){
						q.unLink();
					}
				} 			
			}else if (o instanceof PossibleAnswer){
				PossibleAnswer pa = (PossibleAnswer)o;			
				if(!(pa.getId().equalsIgnoreCase(""))){
					if (pa.getChildQuestions().size() > 0) {
						//String strScript = "alert(\"Answer " + pa.getName().toString() + " has a Possible Question attached! Please delete it first.\");";
						//request.setAttribute("script", strScript);
					} else {
						Question pq = new Question("",pa.getJsmQuestionStructureID());
						if(ex.hasRule(pq.getId(),pa.getId(),jsm.getId())){
							//String strScript = "alert(\"Answer " + pa.getName().toString() + " has Assessment Rules attached! These may be invalidated if this answer is removed.\");";					
							//request.setAttribute("script", strScript);
						}else {
							pa.unLinkFromParentQuestion();
							//JobSpecificModule jsm = new JobSpecificModule(request.getSession().getAttribute("JSMID").toString());
							//jsm.updateTimeStamp();
						}
					} 
				}				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}