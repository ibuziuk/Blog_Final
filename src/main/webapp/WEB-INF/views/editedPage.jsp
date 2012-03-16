<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.Date" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <link type="text/css" rel="stylesheet" href="/resources/bussines.css">
    </link>
    <script type="text/javascript" src="/resources/topic.js"></script>
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
        <h1><a href="#">Well done!!!</a></h1>
    </div>
</div>

<div id="content">

    <h1>Topics</h1>

    <p>You have edited a topic with id ${id} at <%= new java.util.Date() %>
    </p>

    <c:url var="mainUrl" value="/index"/>
    <p>Return to <a href="${mainUrl}">Topic List</a></p>

</div>
</body>
</html>