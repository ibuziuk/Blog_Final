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
        <h1><a href="#">For Exadel</a></h1>
    </div>
</div>

</body>
</html>