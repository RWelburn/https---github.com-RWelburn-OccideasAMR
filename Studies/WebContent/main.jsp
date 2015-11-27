<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%
	String strScrollPos = "0";
	String strScript = "";
	String strOnLoadScript = "";
	StringBuffer pageURL = request.getRequestURL();
	String lockStatus = "LockOff";
	session.setAttribute("PageURL", pageURL.toString());
	if (request.getSession().getAttribute("InterviewStatus") != null) {
		if (request.getSession().getAttribute("InterviewStatus").toString().equals("InterviewRun")) {
			lockStatus = "LockOn";
		}
	} else {
		request.getSession().setAttribute("InterviewStatus","InterviewNormal");

	}
	if (request.getAttribute("runWizard") != null) {
		lockStatus = "LockOn";
	}
	if (request.getParameter("scrollPos") != null) {
		strScrollPos = request.getParameter("scrollPos");
	}
	if (request.getAttribute("scrollPos") != null) {
		strScrollPos = request.getAttribute("scrollPos").toString();
	}
	if (request.getParameter("userTab") != null) {
		String userTab = request.getParameter("userTab");
		if (userTab.equalsIgnoreCase("Roles")) {
			session.setAttribute("UserTab", "Roles");
		} else {
			session.setAttribute("UserTab", "Users");
		}
		session.removeAttribute("UserID");
		session.removeAttribute("RoleID");
	}
	if (request.getParameter("userID") != null) {
		session.setAttribute("UserID", request.getParameter("userID"));
	}
	if (request.getParameter("roleID") != null) {
		session.setAttribute("RoleID", request.getParameter("roleID"));
	}
	if (request.getParameter("Location") != null) {
		String strLocation = request.getParameter("Location");

		session.setAttribute("Location", strLocation);
		if (session.getAttribute("userIsParticipant") == null) {
			session.removeAttribute("ParticipantID");
			session.removeAttribute("JSMID");
		}
		if (strLocation.equalsIgnoreCase("Studies")) {
			session.removeAttribute("StudyID");
		}

		if (session.getAttribute("ParticipantID") != null) {
			if (session.getAttribute("userIsParticipant") == null) {
		session.removeAttribute("ParticipantID");
			}
		}
		if (session.getAttribute("interviewId") != null) {
			session.removeAttribute("interviewId");
			//session.setAttribute("MinActionButtons", true);
		}
		session.removeAttribute("JobHistoryID");
		session.removeAttribute("NextQuestion");
	}
	if (request.getParameter("jsmID") != null) {
		session.setAttribute("JSMID", request.getParameter("jsmID"));
	}
	if (request.getParameter("jobhistoryID") != null) {
		session.setAttribute("JobHistoryID", request
		.getParameter("jobhistoryID"));
	}
	if (request.getParameter("interviewId") != null) {
		if (request.getParameter("status") != null) {
			String status = request.getParameter("status");
			if (!(status.equalsIgnoreCase("halt"))) {
		session.setAttribute("InterviewID", request
				.getParameter("interviewId"));
			}
		} else {
			session.setAttribute("InterviewID", request
			.getParameter("interviewId"));
		}
		//session.setAttribute("MinActionButtons", true);
	}
	if (request.getParameter("review") != null) {
		session.removeAttribute("NextQuestion");
		session.removeAttribute("Note");
	}
	if (request.getParameter("Clear.x") == null) {
		if (request.getParameter("searchTxt") != null && (!request.getParameter("searchTxt").equalsIgnoreCase(""))&&(!request.getParameter("searchTxt").equalsIgnoreCase("Participant Search"))) {
			request.getSession().setAttribute("searchTxt",request.getParameter("searchTxt"));
			request.getSession().setAttribute("participantPage",1);
		}
	}
	
	if (request.getParameter("search") != null) {
		session.setAttribute("Search", request.getParameter("search"));
	}
	if (request.getParameter("participantPage") != null) {
		session.setAttribute("participantPage", request
		.getParameter("participantPage"));
	}
	if (request.getAttribute("script") != null) {
		strScript = request.getAttribute("script").toString();
	}
	if (request.getParameter("script") != null) {
		strScript = request.getParameter("script").toString();
	}
	if (request.getSession().getAttribute("StudyName") != null) {
		session.removeAttribute("StudyName");
	}
	if (request.getParameter("participantID") != null) {
		session.setAttribute("ParticipantID", request.getParameter("participantID"));
		request.getSession().setAttribute("EditMode", true);
		session.removeAttribute("JobHistoryID");
		session.removeAttribute("InterviewID");
		session.removeAttribute("NextQuestion");
		session.removeAttribute("JSMID");
	}
	if (request.getParameter("studyID") != null) {
		String strStudyId = request.getParameter("studyID");
		session.setAttribute("StudyID", strStudyId);
		session.removeAttribute("Search");
		session.removeAttribute("ParticipantID");
		session.removeAttribute("participantPage");
		session.removeAttribute("JSMID");
		session.removeAttribute("StudyNoteID");
	}
	if (request.getParameter("studyNoteID") != null) {
		session.setAttribute("StudyNoteID", request
		.getParameter("studyNoteID"));
	}

	if (request.getAttribute("onLoadScript") == null) {
		request.setAttribute("onLoadScript",
		"onload=disableEnterKey();");
		if (request.getAttribute("AllowEnterKey") != null) {
			request.setAttribute("onLoadScript", "");
		}
	}
	//session.removeAttribute("Progress");
	//session.removeAttribute("ProgressTotal");
	strOnLoadScript = request.getAttribute("onLoadScript").toString();
%>
<html>
<head>
  <title>Studies Management System V2</title>
 <link rel="stylesheet" href="./Style/occideasV2Style.css" type="text/css" />  
  <link rel="stylesheet" href="./Style/wizard.css" type="text/css" />  
  <link rel="stylesheet" href="./Style/datepicker.css" type="text/css" />  
<!-- <link rel="stylesheet" href="./Style/template_css.css" type="text/css"> -->
  <script language=javascript type="text/javascript" src="./Javascript/sorttable.js" ></script>
  <script language=javascript type="text/javascript" src="./Javascript/javascript.js"></script>  
  <script type="text/javascript" src="./Javascript/animatedcollapse.js"></script>
  <script type="text/javascript" src="./Javascript/datepicker.js"></script>
  <script type="text/javascript" src="./Javascript/form-validation.js"></script>
  <script language=javascript type="text/javascript" src="./Javascript/wizard.js" >

/***********************************************
* Animated Collapsible DIV- © Dynamic Drive DHTML code library (www.dynamicdrive.com)
* This notice MUST stay intact for legal use
* Visit Dynamic Drive at http://www.dynamicdrive.com/ for this script and 100s more
***********************************************/
</script>

 </head>
<body class=NoPadding <%=strOnLoadScript %>>
<div style='z-index:1;display: block;visibility: visible;position: absolute;top: 0px;left: 0px;'></div>
<div id='skm_LockPane' class='<%=lockStatus %>'></div>

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
	<%=strScript %>
	//var collapse2=new animatedcollapse("62785", 800, true);
	//document.getElementById("62785").style.height=0;
	
</script>
</body>
</html>