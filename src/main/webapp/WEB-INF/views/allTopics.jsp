<%@ page language="java" contentType="text/html; charset=utf8"
         pageEncoding="utf8" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
    <link type="text/css" rel="stylesheet" href="/resources/bussines.css">
    </link>
    <%--    <link type="text/css" rel="stylesheet" href="/resources/topic.css"> </link>  --%>
    <script type="text/javascript" src="/resources/topic.js"></script>
    <meta http-equiv="Content-Type" content="text/html; charset=utf8">
    <title><spring:message code="label.mainTitle"/></title>
</head>
<body>

<div id="header">
    <div>
        <ul>
            <li><a href="/index" class="on">Home</a></li>
            <li><a href="/addT">add Topic</a></li>
            <li><a href="/author">author</a></li>
        </ul>
        <h1><a href="#">My Blog</a></h1>
    </div>
</div>


<h3 id="content"><spring:message code="label.topics"/></h3>

<c:if test="${!empty topicList}">
    <table id="content" class="data">
        <tr>
            <th><spring:message code="label.text"/></th>
            <th><spring:message code="label.brief"/></th>
            <th>&nbsp;</th>
        </tr>
        <c:forEach items="${topicList}" var="topic">
            <tr>

                <td><c:out escapeXml="true" value="${topic.text}"></c:out></td>
                <td>${topic.brief}</td>
                    <%--       <td><button onclick="location.href='delete/${topic.id}'"> delete </button> </td>  --%>
                <td>
                    <li><a onclick="location.href= 'delete/${topic.id}'"> delete </a></li>
                </td>
                <td>
                    <li><a type="button" onclick="top.location.href = '/topic/eit?id=${topic.id}';"> edit </a></li>
                </td>
                <td>
                    <li><a onclick="location.href= '/topic/read?id=${topic.id}'"> read </a></li>
                </td>
            </tr>
        </c:forEach>
    </table>
</c:if>


<button id="footer" type="button" onclick="top.location.href = '/addT';"> Would you like to add a new topic?
</button>
<br>


</body>
</html>

