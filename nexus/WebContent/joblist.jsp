<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix ="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>職種一覧</title>
</head>
<body>
<select name="largecd">
			<c:forEach var="job" items="${ Largelist }">
				<option value="${ job.largecd }">${ job.name }</option>
			</c:forEach>
</select>

<select name="smallcd">
			<c:forEach var="job" items="${ Smalllist }">
				<option value="${ job.smallcd }">${ job.name }</option>
			</c:forEach>
</select>



</body>
</html>
