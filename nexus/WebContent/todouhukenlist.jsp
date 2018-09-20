<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>都道府県一覧</title>
</head>
<body>
<body>
	<table>
	    <tr>
			<th>コード</th>
			<th>都道府県名</th>

		</tr>
		<c:forEach var="todouhuken" todouhuken="${ list }">
		<tr>
			<td><c:out value="${ todouhuken.cd }" /></td>
			<td><c:out value="${ todouhuken.name }" /></td>

		</tr>
		</c:forEach>
	</table>

</body>
</html>