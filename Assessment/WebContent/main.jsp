<%@ page import="com.researchit.html.HTMLObject" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%	
	String strScrollPos = "0";
	String strOnLoadScript = "";
    String strScript = "";
    String strVersion = HTMLObject.getSystemVersion()+"";
    StringBuffer pageURL = request.getRequestURL();
	String lockStatus = "LockOff";
	session.setAttribute("PageURL", pageURL.toString());
	if(request.getParameter("Location") != null){		
		session.removeAttribute("RuleExpLevel");
		session.removeAttribute("RuleLevel");
	   	session.removeAttribute("ProbRuleId");
	   	session.removeAttribute("LevelRuleId");
	   	session.removeAttribute("AnswerId");
	    session.removeAttribute("InterviewID");
	    session.removeAttribute("ExposureFilter");
	    session.removeAttribute("AssessmentFilter");
	    session.removeAttribute("AssessmentType");
		String strLocation = request.getParameter("Location");
		if(!(strLocation.equalsIgnoreCase("Job_Histories"))){
			session.removeAttribute("AgentID");
		}
		if(strLocation.equalsIgnoreCase("Studies")){
			session.removeAttribute("StudyID");
			session.removeAttribute("JSMID");
			session.removeAttribute("ParticipantID");
			session.removeAttribute("JobHistoryID");
		}else if(strLocation.equalsIgnoreCase("Participants")){
			if (request.getParameter("participantID") != null) {
				session.removeAttribute("JSMID");
			}
			session.removeAttribute("ParticipantID");
			session.removeAttribute("JobHistoryID");
			
					
		}else if(strLocation.equalsIgnoreCase("Job_Histories")){
			if(request.getParameter("answerReport")==null){
				session.removeAttribute("JobHistoryID");
			}
			session.setAttribute("AssessmentFilter","False");
		}
	    session.setAttribute("Location",request.getParameter("Location"));
	}
	if(request.getParameter("ClearFilters") != null){		
	    session.removeAttribute("StatusFilter");
		session.removeAttribute("ExposureFilter");
		session.removeAttribute("AssessmentFilter");
		session.removeAttribute("AssessmentType");
		if(session.getAttribute("Location").toString().equalsIgnoreCase("Agents")){
			session.removeAttribute("JSMID");
			session.removeAttribute("JSMFilter");
			session.setAttribute("StatusFilter","None");
		}
	}   	

	if(request.getParameter("studyID") != null){
	    session.setAttribute("StudyID",request.getParameter("studyID"));       	    
	    session.removeAttribute("ParticipantID");
	    session.removeAttribute("JobHistoryID");
	    session.removeAttribute("participantPage");
	    session.removeAttribute("StatusFilter");
	    if(request.getParameter("keepJSM") == null){
	    	session.removeAttribute("JSMID");
	    }	    
	}   	
    if (request.getParameter("jsmID") != null) {
        session.setAttribute("JSMID", request.getParameter("jsmID"));
        session.setAttribute("JSMFilter",request.getParameter("jsmID"));
        session.removeAttribute("ParticipantID");
        session.removeAttribute("JobHistoryID");
        session.removeAttribute("OutPut");
	    session.removeAttribute("InterviewID");
	    session.removeAttribute("StatusFilter");   
    }
    if (request.getParameter("participantID") != null) {
        session.setAttribute("ParticipantID", request.getParameter("participantID"));
        session.removeAttribute("AgentID");
        session.removeAttribute("JobHistoryID");
        session.removeAttribute("AnswerId");
	    session.removeAttribute("InterviewID");
    }
    if(request.getParameter("jobhistoryID") != null){
        session.setAttribute("JobHistoryID",request.getParameter("jobhistoryID"));
        session.removeAttribute("Search");
        session.removeAttribute("AnswerId");
        session.removeAttribute("RuleID");
	    session.removeAttribute("InterviewID");
	    session.removeAttribute("PreviousIDs");
    }
    if (request.getParameter("search") != null) {
        session.setAttribute("Search", request.getParameter("search"));
    }
    if (request.getParameter("participantPage") != null) {
        session.setAttribute("participantPage", request.getParameter("participantPage"));
    }    
    if (request.getParameter("questionId") != null) {
        session.setAttribute("QuestionID", request.getParameter("questionId"));
    }
    if (request.getParameter("answerDescription") != null) {
        session.setAttribute("AnswerDescription", request.getParameter("answerDescription"));   
    }
    if (request.getParameter("exposure") != null) {
        session.setAttribute("Exposure", request.getParameter("exposure"));
    }
    if (request.getParameter("showdetails") != null) {
        session.setAttribute("showdetails", request.getParameter("showdetails"));
    }
    if(request.getParameter("agentID") != null){
	    session.setAttribute("AgentID",request.getParameter("agentID"));  
	    session.removeAttribute("AnswerID");
	    session.removeAttribute("RuleID");
	    session.removeAttribute("OutPut");
	    session.removeAttribute("InterviewID");
	}
    if (request.getParameter("answerId") != null) {
        session.setAttribute("AnswerID", request.getParameter("answerId"));
    }else{
    	session.removeAttribute("AnswerID");
    }
    if(request.getParameter("probRuleId") != null){
	    session.setAttribute("ProbRuleId",request.getParameter("probRuleId")); 
	    session.removeAttribute("LevelRuleId");
	}
    if(request.getParameter("levelRuleId") != null){
	    session.setAttribute("LevelRuleId",request.getParameter("levelRuleId"));  
	}   
    if(request.getParameter("ruleExpLevel") != null){
    	String ruleType = request.getParameter("ruleExpLevel");
    	if(ruleType.equalsIgnoreCase("Possible")){
    		session.setAttribute("RuleExpLevel",com.researchit.expert.ExpertRule.LEVELPOSSIBLE); 
    	}else if(ruleType.equalsIgnoreCase("Probable")){
    		session.setAttribute("RuleExpLevel",com.researchit.expert.ExpertRule.LEVELPROBABLE); 
    	}else if(ruleType.equalsIgnoreCase("low")){
    		session.setAttribute("RuleExpLevel",com.researchit.expert.ExpertRule.LEVELLOW); 
    	}else if(ruleType.equalsIgnoreCase("medium")){
    		session.setAttribute("RuleExpLevel",com.researchit.expert.ExpertRule.LEVELMEDIUM); 
    	}else if(ruleType.equalsIgnoreCase("high")){
    		session.setAttribute("RuleExpLevel",com.researchit.expert.ExpertRule.LEVELHIGH); 
    	}else if(ruleType.equalsIgnoreCase("unknown")){
    		session.setAttribute("RuleExpLevel",com.researchit.expert.ExpertRule.LEVELUNKNOWN); 
    	}
    	session.removeAttribute("RuleLevel");
       	session.removeAttribute("ProbRuleId");
       	session.removeAttribute("LevelRuleId");
	}       
    if(request.getAttribute("script")!=null){
        strScript = request.getAttribute("script").toString();
    }	 
    if(request.getParameter("script")!=null){
        strScript = request.getParameter("script").toString();
    }	   
//    if (request.getParameter("userTab") != null) {
//    	String userTab = request.getParameter("userTab");
//		if(userTab.equalsIgnoreCase("Roles")){
//    		session.setAttribute("UserTab", "Roles");
//    	}else {
//    		session.setAttribute("UserTab", "Users");
//    	}  	
//        session.removeAttribute("UserID");
//        session.removeAttribute("RoleID");
//    }    
//    if(request.getParameter("userID") != null){
//	    session.setAttribute("UserID",request.getParameter("userID"));  
//	}
//    if(request.getParameter("roleID") != null){
//	    session.setAttribute("RoleID",request.getParameter("roleID"));  
//	}   
	if (request.getParameter("ruleId") != null) {
		session.setAttribute("RuleID", request.getParameter("ruleId"));
		session.removeAttribute("LevelRuleID");
	}
	if (request.getParameter("levelRuleId") != null) {
		session.setAttribute("LevelRuleID", request.getParameter("levelRuleId"));
	}
	if (request.getParameter("interviewId") != null) {
		session.setAttribute("InterviewID", request.getParameter("interviewId"));
	}
	if (request.getParameter("jhJSM") != null) {
		String jhJSMId = request.getParameter("jhJSM").toString();
		session.setAttribute("JSMFilter",jhJSMId);
		session.setAttribute("JSMID", jhJSMId);
	}
	if (request.getParameter("jhStatus") != null) {
		String jhStatusId = request.getParameter("jhStatus").toString();
		if((jhStatusId.equalsIgnoreCase("4"))){ 
			session.removeAttribute("JSMID");
			session.removeAttribute("JSMFilter");
		}else if((jhStatusId.equalsIgnoreCase("5"))){ 
			session.removeAttribute("JSMID");
			session.removeAttribute("JSMFilter");
		}else if((jhStatusId.equalsIgnoreCase("6"))){ 
			session.removeAttribute("JSMID");
			session.removeAttribute("JSMFilter");
		}
		session.setAttribute("StatusFilter",jhStatusId);
	}
	if (request.getParameter("showAssessmentDetail") != null) {
		String showAssessmentDetail = request.getParameter("showAssessmentDetail").toString();
		session.setAttribute("ShowAssessmentDetail",showAssessmentDetail);
	}
	if (request.getParameter("exposureFilter") != null) {
		String exposureFilter = request.getParameter("exposureFilter").toString();
		session.setAttribute("ExposureFilter",exposureFilter);
	}
	if (request.getParameter("assessmentFilter") != null) {
		String exposureFilter = request.getParameter("assessmentFilter").toString();
		session.setAttribute("AssessmentFilter",exposureFilter);
	}
	if (request.getParameter("assessmentType") != null) {
		String exposureFilter = request.getParameter("assessmentType").toString();
		session.setAttribute("AssessmentType",exposureFilter);
	}
	if (request.getAttribute("onLoadScript") == null) {
		request.setAttribute("onLoadScript", "onload=disableEnterKey();");
	}
	strOnLoadScript = request.getAttribute("onLoadScript").toString();
%>
<html>
<head>
  <title>Assessment Management System Build [<%=strVersion %>]</title> 
 <link rel="stylesheet" href="./Style/occideasV2Style.css" type="text/css" />  
<!-- <link rel="stylesheet" href="./Style/template_css.css" type="text/css"> -->
  <script language="javascript" type="text/javascript" src="./Javascript/sorttable.js" ></script>
  <script language="javascript" type="text/javascript" src="./Javascript/javascript.js"></script>  
 </head>
<body class="NoPadding" <%=strOnLoadScript %>>
<div id="skm_LockPane" class="LockOff"></div>
<table border="0" cellpadding="0" cellspacing="0" width="100%">
	<tr>
		<td align="center" valign="top">
		<jsp:include page="/MainServlet"></jsp:include>
		</td>
	</tr>
</table>
<script language="javascript" type="text/javascript">
	setPosition();
	moveToSetPosition(<%=strScrollPos %>);
	<%=strScript %>
</script>
</body>
</html>