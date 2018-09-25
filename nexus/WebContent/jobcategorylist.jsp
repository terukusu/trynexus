<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix ="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>業種一覧</title>
</head>
<body>
<select name="largecd">
			<c:forEach var="jobcategory" items="${ Largelist }">
				<option value="${ jobcategory.largecd }">${ jobcategory.name }</option>
			</c:forEach>
</select>

<select name="smallcd">
			<c:forEach var="jobcategory" items="${ Smalllist }">
				<option value="${ jobcategory.smallcd }">${ jobcategory.name }</option>
			</c:forEach>
</select>



</body>
</html>
