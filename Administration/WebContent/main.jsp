<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%
String strScrollPos = "0";
String strScript = "";
StringBuffer pageURL = request.getRequestURL();
session.setAttribute("PageURL", pageURL.toString());
if(request.getParameter("Location") != null){
	session.removeAttribute("LoginRequest");
	session.removeAttribute("StudyID");
	session.removeAttribute("AgentID");
	session.removeAttribute("jsmID");
}
if(request.getParameter("AllOn") != null){
	session.setAttribute("All", true);
}
if(request.getParameter("AllOff") != null){
	session.removeAttribute("All");
}
if(request.getParameter("justValid") != null){
	if(request.getParameter("justValid").toString().equalsIgnoreCase("True")){
		session.setAttribute("JustValid", true);
	}else{
		session.removeAttribute("JustValid");
	}	
}
if(request.getParameter("FlashOn") != null){
	session.setAttribute("FlashOn", true);
}
if (request.getParameter("pagesize") != null) {
	request.getSession().setAttribute("PageSize", request.getParameter("pagesize"));
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
	
}else if (request.getParameter("userPage") != null) {
        session.setAttribute("userPage", request.getParameter("userPage"));
} else if (request.getParameter("questionID") != null) {
	session.setAttribute("QuestionID", request.getParameter("questionID"));
} else if (request.getParameter("studyID") != null) {
	session.setAttribute("StudyID", request.getParameter("studyID"));
} else if (request.getParameter("jsmID") != null) {
	session.setAttribute("jsmID", request.getParameter("jsmID"));
} else if (request.getParameter("sanitycheck") != null) {
	session.setAttribute("SanityCheck", request.getParameter("sanitycheck"));
} else if (request.getParameter("LoginRequest") != null) {
	session.setAttribute("LoginRequest", request.getParameter("LoginRequest"));
} else{
	if(session.getAttribute("UserTab") == null) {
		session.setAttribute("UserTab", "Users");
	}
}

if(request.getParameter("agentID") != null){
    session.setAttribute("AgentID",request.getParameter("agentID"));  
}
if(request.getParameter("BlueTabLocation") != null){
	session.removeAttribute("LoginRequest");
	String location = request.getParameter("BlueTabLocation").toString();
	if(session.getAttribute("BlueTabLocation")!=null){
		if (!session.getAttribute("BlueTabLocation").equals(request.getParameter("BlueTabLocation"))){
			session.setAttribute("Location","");
			session.removeAttribute("UserTab");
		}
	}	
	session.setAttribute("BlueTabLocation",location); 
	if(!(location.equalsIgnoreCase("Admin"))){
		session.removeAttribute("Admin");
		session.removeAttribute("UserObject");
	}		
}else{
	if(session.getAttribute("BlueTabLocation") == null) {
		session.setAttribute("BlueTabLocation","Home");
		session.removeAttribute("Admin");
		session.removeAttribute("UserObject");
	}
}
%>
<html>
<head>
    <title>OccIDEAS Administration</title>
    <script language=javascript type="text/javascript" src="./Javascript/javascript.js"></script>
    <script language=javascript type="text/javascript" src="./Javascript/roundcorners.js"></script> 
    <link rel="stylesheet" href="./Style/occideasV2Style.css" type="text/css" /> 
</head>
<body  class=NoPadding>
<table border=0 cellpadding=0 cellspacing=0 width=100% height=100% >
	<tr>
		<td align=center valign=top>
		<jsp:include page="AdminServlet"></jsp:include>
		</td>
	</tr>
</table>
<script language=javascript type="text/javascript">
	setPosition();
	moveToSetPosition(<%=strScrollPos %>);
	<%=strScript %>
</script>
</body>
</html>
