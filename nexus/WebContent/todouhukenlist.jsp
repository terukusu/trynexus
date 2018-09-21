<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix ="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>都道府県一覧</title>
</head>
<body>
<select name="cd">
			<c:forEach var="todouhuken" items="${ list }">
				<option value="${ todouhuken.cd }">${ todouhuken.name }</option>
			</c:forEach>
</select>
</body>
</html>
<!--   "<c:out value='${ todouhuken.cd }' />"><c:out value="${ todouhuken.name }" />-->