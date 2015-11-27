<%
String strErrorMessage = "";

if(request.getAttribute("errorMessage")!= null){
	strErrorMessage = request.getAttribute("errorMessage").toString();
}

%>
<html>
<head>
  <title></title>
  <link rel="stylesheet" href="./Style/occideasV2Style.css" type="text/css">
 </head>
 
<body bgcolor=#F4F1E7>
<%
	com.researchit.servlets.MainServlet ms = new com.researchit.servlets.MainServlet();
	ms.showTopMenu(request,response);

%>

	<table border=0 >
		<tr>
			<td ><b>Critical Error:</b></td>
		</tr>
		<tr>
			<td><%=strErrorMessage %></td>
		</tr>
		<tr>
			<td><br/></td>
		</tr>
		<tr>
			<td><br/></td>
		</tr>
		<tr>
		<td>Please take note of this error message and the sequence of events that caused it and enter the details of the occurence in <a href="">Bugzilla</a>. 
			<p>If you do not have a Bugzilla account please email the details of the problem to <a href="mailto:occideas.support@researchit.com.au">OccIDEAS support</a>
			<p><a href="javascript:history.back()">Click here to go Back</a>
		</td>
		</tr>
		<tr>
			<td> If this is the second time you are seing this exact same error you may need to
			<a href="ControllerServlet?Action=Logout">Log out</a> and log in again, sorry for any inconvenience.
			</td>
		</tr>
	</table>
</body>
</html>