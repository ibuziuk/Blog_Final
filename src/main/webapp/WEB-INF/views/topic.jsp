<%--

<%@ page language="java" contentType="text/html; charset=utf8"
	pageEncoding="utf8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <link type="text/css" rel="stylesheet" href="/resources/bussines.css"> </link>
<%--    <link type="text/css" rel="stylesheet" href="/resources/topic.css"> </link>
    <script type="text/javascript" src="/resources/topic.js"> </script>



    <meta http-equiv="Content-Type" content="text/html; charset=utf8">
	<title>Add topic</title>
</head>
<body>


<div id="header">
  <div>
    <ul>
      <li><a href="/index" class="on">Home</a></li>
      <li><a href="/addT">add Topic</a></li>
      <li><a href="/author">author</a></li>
    </ul>
    <h1> <a href="#">Add Topic</a></h1>
  </div>
</div>



<div id="content">
<h2><spring:message code="label.mainTitle" /></h2>

<form:form method="post" action="add" commandName="topic">
	<table>
		<tr>
			<td><form:label path="title">
				<spring:message code="label.title" />
			</form:label></td>
			<td><form:input path="title" />
            <td><form:errors path="title" /></td>
		</tr>
		<tr>
			<td><form:label path="date">
				<spring:message code="label.date" />
			</form:label></td>
			<td><form:input id="date_mask" onkeydown="setMask('date_mask','9999-99-99')" path="date" />
            !!! Be careful: date format "YYYY-MM-DD" !!!</td>
		</tr>

    <%--    <tr>
			<td><form:label path="brief">
				<spring:message code="label.brief" />
			</form:label></td>
			<td><form:input path="brief" />
            You can either full fill it by yourself, or use teg (cut/> in textarea insted of it  </td>
		</tr>


        <tr>
			<td>
                <form:label path="text">
				<spring:message code="label.text" />
			    </form:label></td>
                <p id='hint'>Characters left:500</p>
			<td><form:textarea path="text" onclick="f()" onkeyup="f()" id="te" /></td>
	    </tr>

		<tr>
			<td colspan="2">
                <input type="submit" value="<spring:message code="label.addtopic"/>" />
                <button type="button" onclick="location.href='/index'">Cancel</button>
             </td>


		</tr>

  <%--      <a href="<c:url value="/next" />">
	        <spring:message code="label.logout" />
        </a>


	</table>

</form:form>

</div>

</body>
</html>         --%>