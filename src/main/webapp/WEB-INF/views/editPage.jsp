<%--
<%@ page language="java" contentType="text/html; charset=utf8"
	pageEncoding="utf8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
&lt;%&ndash; <link type="text/css" rel="stylesheet" href="/resources/topic.css"> </link>  &ndash;%&gt;
 <link type="text/css" rel="stylesheet" href="/resources/bussines.css"> </link>
 <script type="text/javascript" src="/resources/topic.js"> </script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<div id="header">
  <div>
    <ul>
      <li><a href="/index" class="on">Home</a></li>
      <li><a href="/addT">add Topic</a></li>
      <li><a href="/author">author</a></li>
    </ul>
    <h1> <a href="#">Edit Topic</a></h1>
  </div>
</div>


<div id="content">
<h1>Edit Topic</h1>

<c:url var="saveUrl" value="/topic/edit?id=${topicAttribute.id}" />
<form:form modelAttribute="topicAttribute" method="post" action="${saveUrl}">
<table>


		<tr>
			<td><form:label path="Title">Title</form:label></td>
			<td><form:input path="Title"/></td>
            <td><form:errors path="title"/></td>
		</tr>

        <tr>
            <td><form:label path="Date">Date</form:label></td>
            <td><form:input id="date_mask" onkeydown="setMask('date_mask','9999-99-99')" path="date"/>
                !!! Be careful: date format "YYYY-MM-DD" !!!</td>
        </tr>

      &lt;%&ndash;
		<tr>
			<td><form:label path="Brief">Brief</form:label></td>
			<td><form:input path="Brief"/></td>
		</tr>    &ndash;%&gt;

		<tr>
			<td><form:label path="Text">Text</form:label></td>
            <p id='hint'>Characters left:500</p>
		    <td><form:textarea path="text" onclick="f()" onkeyup="f()" id="te" /></td>
		</tr>

	</table>

    <input type="submit" value="Save" />
    <button type="button" onclick="location.href='/index'">Cancel</button>
</form:form>

</div>

</body>
</html>
 &lt;%&ndash;
<table>
		<tr>
			<td><form:label path="title">
				<spring:message code="label.title" />
			</form:label></td>
			<td><form:input path="title" /></td>
		</tr>
		<tr>
			<td><form:label path="date">
				<spring:message code="label.date" />
			</form:label></td>
			<td><form:input path="date" /></td>
		</tr>

        <tr>
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
     &ndash;%&gt;--%>
