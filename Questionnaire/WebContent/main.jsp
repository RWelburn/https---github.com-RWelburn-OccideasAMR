<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%
	String strScript = "";
	String strOnLoadScript = "";
	StringBuffer pageURL = request.getRequestURL();
	session.setAttribute("PageURL", pageURL.toString()); 
	
	if (request.getParameter("Location") != null) {
		String strLocation = request.getParameter("Location");
		session.setAttribute("Location", strLocation);
		if (request.getParameter("jsmType") == null) {
			session.setAttribute("JSMType", "JSMs");
		}
		if (session.getAttribute("JSMType") != null) {
			String jsmType = session.getAttribute("JSMType").toString();
			if (jsmType.equalsIgnoreCase("Agents")) {
				session.setAttribute("JSMType", "TJSMs");
			}
		}
		if (strLocation.equalsIgnoreCase("Roles")) {
			session.setAttribute("UserTab", "Users");
		}
		session.removeAttribute("AgentID");
		session.removeAttribute("PossibleAnswerID");
		session.removeAttribute("ShowRules");
	}
	String strScrollPos = "0";
	if (request.getAttribute("scrollPos") != null) {
		strScrollPos = request.getAttribute("scrollPos").toString();
	}
	if (request.getParameter("jsmID") != null) {
		session.setAttribute("JSMID", request.getParameter("jsmID"));
		session.removeAttribute("AgentID");
		session.removeAttribute("Rule");
		session.removeAttribute("RuleID");
		session.removeAttribute("PossibleAnswerID");
		session.removeAttribute("QuestionIDs");
		session.removeAttribute("ShowRules");
	}
	if (request.getParameter("agentID") != null) {
		session.removeAttribute("Outcome");
		//session.removeAttribute("RuleChildLevelTypeId");
		session.removeAttribute("RuleID");
		session.setAttribute("AgentID", request.getParameter("agentID"));
	}
	if (request.getParameter("outcome") != null) {
		session.removeAttribute("RuleID");
		session.setAttribute("Outcome", request.getParameter("outcome"));
		//if (request.getParameter("ruleChildLevelTypeId") != null) {
		//	session.setAttribute("RuleChildLevelTypeId", request.getParameter("ruleChildLevelTypeId"));
		//}
	}
	//if (request.getParameter("ruleChildLevelTypeId") != null) {
	//	session.removeAttribute("LevelRuleID");
	//	session.setAttribute("RuleChildLevelTypeId", request.getParameter("ruleChildLevelTypeId"));
	//}
	if (request.getParameter("ruleId") != null) {
		session.setAttribute("RuleID", request.getParameter("ruleId"));
		session.removeAttribute("LevelRuleID");
	}
	if (request.getParameter("levelRuleId") != null) {
		session.setAttribute("LevelRuleID", request.getParameter("levelRuleId"));
	}
	if (request.getParameter("jobHistoryId") != null) {
		session.setAttribute("JobHistoryId", request.getParameter("jobHistoryId"));
	}
	if (request.getParameter("userID") != null) {
		session.setAttribute("UserID", request.getParameter("userID"));
	}
	if (request.getParameter("roleID") != null) {
		session.setAttribute("RoleID", request.getParameter("roleID"));
	}

	if (request.getParameter("search") != null) {
		session.setAttribute("Search", request.getParameter("search").trim());
	}
	if (request.getAttribute("script") != null) {
		strScript = request.getAttribute("script").toString();
	}
	if (request.getParameter("removeexample") != null) {
		request.setAttribute("EditMode","ON");
		session.setAttribute("AgentID", request.getParameter("removeexample"));
		request.setAttribute("ExampleId",request.getParameter("exampleid"));
	}
	if (request.getParameter("addexample") != null) {
		request.setAttribute("EditMode","ON");
		request.setAttribute("AddExample", "True");
	}
	if (request.getAttribute("onLoadScript") == null) {
		request.setAttribute("onLoadScript", "onload=disableEnterKey();");
	}
	strOnLoadScript = request.getAttribute("onLoadScript").toString();
	if (request.getParameter("jsmType") != null) {
		String jsmType = request.getParameter("jsmType");
		if (jsmType.equalsIgnoreCase("TJSMs")) {
			session.setAttribute("JSMType", "TJSMs");
		} else if (jsmType.equalsIgnoreCase("TAJSMs")) {
			session.setAttribute("JSMType", "TAJSMs");
		} else if (jsmType.equalsIgnoreCase("JSMs")) {
			session.setAttribute("JSMType", "JSMs");
		} else if (jsmType.equalsIgnoreCase("AJSMs")) {
			session.setAttribute("JSMType", "AJSMs");
		} else if (jsmType.equalsIgnoreCase("Agents")) {
			session.setAttribute("JSMType", "Agents");
		}
		//If user clicks on location tab don't remove the JSMID attribute
		if (request.getParameter("Location") == null) {
			session.removeAttribute("JSMID");
		}
		session.removeAttribute("AgentID");

	}
	if (request.getParameter("userTab") != null) {
		String userTab = request.getParameter("userTab");
		if (userTab.equalsIgnoreCase("Roles")) {
			session.setAttribute("UserTab", "Roles");
		} else if (userTab.equalsIgnoreCase("Users")) {
			session.setAttribute("UserTab", "Users");
		}
	} else if (request.getParameter("userID") != null) {
		session.setAttribute("UserTab", "Users");
		session.setAttribute("UserID", request.getParameter("userID"));
		session.removeAttribute("RoleID");
	} else if (request.getParameter("roleID") != null) {
		session.setAttribute("UserTab", "Roles");
		session.setAttribute("RoleID", request.getParameter("roleID"));
		session.removeAttribute("UserID");
	}
	if (request.getParameter("closeEditMode") != null) {
		session.removeAttribute("QuestionIDs");
	}
%>
<html>
<head>
<title>Questionnaire Management System V2</title>
 <link rel="stylesheet" href="./Style/occideasV2Style.css" type="text/css" />  
<!-- <link rel="stylesheet" href="./Style/template_css.css" type="text/css"> -->
<script language=javascript type="text/javascript"	src="./Javascript/sorttable.js"></script>
<script language=javascript type="text/javascript"	src="./Javascript/javascript.js"></script>
<script type="text/javascript" src="./Javascript/animatedcollapse.js"></script>
</head>
<body class=NoPadding <%=strOnLoadScript %>>
<table border=0 cellpadding=0 cellspacing=0 width=100%>
	<tr>
		<td align=center valign=top>
		<jsp:include page="/MainServlet"></jsp:include>
		</td>
	</tr>
</table>
<script language=javascript type="text/javascript">
	setPosition();
	moveToSetPosition(<%=strScrollPos %>);
	checkCheckBoxes();
	<%=strScript %>
</script>
</body>
</html>
