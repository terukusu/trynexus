<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="UTF-8">
<title>アカウント登録</title>
<link href="https://use.fontawesome.com/releases/v5.0.6/css/all.css" rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=M+PLUS+1p" rel="stylesheet">
<link href="css/bootstrap-reboot.css" rel="stylesheet">
<link href="css/common.css" rel="stylesheet">
<link href="css/header.css" rel="stylesheet">
<link href="css/footer.css" rel="stylesheet">
</head>
<body>
<header>
  <section>
    <h1 class="logo"><a href="./stafftop.jsp">LOGO</a></h1>
    <nav>
      <ul class="mainnavi">
        <li><a href="./jobsearch"><i class="fas fa-home"></i>検索</a></li>
        <li>
          <a href="./jobseekerservlet"><i class="fas fa-search"></i>登録&amp;閲覧</a>
          <ul class="drop-menu">
            <li><a href="./detail">求人情報<i class="fas fa-angle-right"></i></a></li>
            <li><a href="./jobseekerservlet">求職者情報<i class="fas fa-angle-right"></i></a></li>
            <li><a href="./matchingdisservlet">マッチング登録<i class="fas fa-angle-right"></i></a></li>
          </ul>
        </li>
        <li><a href="./AccountListServlet"><i class="far fa-bookmark"></i>管理</a></li>
      </ul>
    </nav>
    <div class="user">
      <div class="user__wrapper">
        <div class="user__name">
          <a href="#"><c:out value="${ Staff.name }" /><i class="fas fa-ellipsis-v"></i></a>
          <ul class="drop-menu">
            <li><a href="./logoutservlet">ログアウト<i class="fas fa-angle-right"></i></a></li>
          </ul>
        </div>
      </div>
    </div>
  </section>
</header>
<main>
	<h2>アカウント登録</h2>
	<ul>
	<c:forEach var="message" items="${ messages }">
		<li><c:out value="${ message }" /></li>
	</c:forEach>
	</ul>
	<form action="accountregistservlet" method="post">
		<table>
			<tr>
				<th>項目名</th>
				<th></th>
			</tr>
			<tr>
				<td>アカウントID</td>
				<td><input type="hidden" name="hiddenid" value="<c:out value="${ staff.id }" />"></td>
			</tr>
			<tr>
				<td>氏名</td>
				<td><input type="text" name="name" value="<c:out value="${ staff.name }" />"></td>
			</tr>
			<tr>
				<td>氏名（かな）</td>
				<td><input type="text" name="kana" value="<c:out value="${ staff.kana }" />"></td>
			</tr>
			<tr>
				<td>ユーザー権限</td>
				<td>
					<input type="radio" name="kengen" value="1">管理者
					<input type="radio" name="kengen" value="2">その他
				</td>
			</tr>
			<tr>
				<td>パスワード</td>
				<td><input type="password" name="password"></td>
			</tr>
		</table>
		<input class="main-b" type="button" onclick="location.href='AccountListServlet'" value="戻る">
		<input class="main-b" type="submit" value="登録">
	</form>
</main>
<footer> <small>Copyright(C) 2009有限責任事業組合 大阪職業教育協働機構(A'ワーク創造館) All Rights Reserved.</small> </footer>
</body>
</html>
