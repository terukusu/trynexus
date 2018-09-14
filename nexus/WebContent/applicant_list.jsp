<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>



<div id="applicant_list">
  <h2>求職者情報一覧</h2>
   <div class="search_container">
            <form action="./reserve.html" method="post">


                            <input type="text" class="id_form" name="name1" required />
                            <input type="text" class="name_form" name="name2" required />

                            <select class="select_form" name="tantoustaffname" required>
                                        <option value="">田中さん</option>
                                        <option value="25">てるてる</option>
                                        <option value="26">あっち兄さん</option>
                                        <option value="27" selected></option>
                                        <option value="28"></option>
                                        <option value="29"></option>
                                        <option value="30"></option>
                            </select>


                <input type="submit" class="search_b" name="send" value="検索">
	        </form>
    </div>

        <form action="./reserve.html" method="post">
            <input type="submit" class="main_b main_b_applilist" name="send" value="新規登録">
        </form>


        <table class="list_table">
		<tr>
			<th></th>
			<th>求職者ID</th>
			<th>氏名</th>
            <th>年齢</th>
			<th>性別</th>
            <th>希望業種</th>
			<th>希望職種</th>
            <th>希望勤務地</th>
            <th>担当職業紹介者</th>
		</tr>
		<c:forEach var="jobseeker" items="${ list }">
        <tr>
			<td><button class="mini_b mini_b_applilist">詳細</button><c:out value="${ applicantregist.jsp }" /></td>
			<td><c:out value="${ jobseeker.id }" /></td>
			<td><c:out value="${ jobseeker.js_name }" /></td>
            <td><c:out value="${ jobseeker.age }" /></td>
			<td><c:out value="${ jobseeker.sex }" /></td>
			<td><c:out value="${ jobseeker.hopejobcategory }" /></td>
            <td><c:out value="${ jobseeker.hopejob1 }" /></td>
			<td><c:out value="${ jobseeker.hopeworkplace }" /></td>
			<td><c:out value="${ jobseeker.st_name }" /></td>
		</tr>
		</c:forEach>
	</table>
</div>
</body>
</html>
