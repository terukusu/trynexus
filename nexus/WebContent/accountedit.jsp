<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="UTF-8">
<title>アカウント編集</title>
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
    <h1 class="logo"> <a href="#">TryNexus</a> </h1>
    <nav>
      <ul class="mainnavi">
        <li><a href="#"><i class="fas fa-home"></i>検索</a></li>
        <li><a href="#"><i class="fas fa-search"></i>登録&amp;閲覧</a>
          <ul class="drop-menu">
            <li><a href="#">求人情報<i class="fas fa-angle-right"></i></a></li>
            <li><a href="#">求職者情報<i class="fas fa-angle-right"></i></a></li>
            <li><a href="#">企業マスタ<i class="fas fa-angle-right"></i></a></li>
            <li><a href="#">マッチング履歴<i class="fas fa-angle-right"></i></a></li>
          </ul>
        </li>
        <li><a href="#"><i class="far fa-bookmark"></i>管理</a></li>
      </ul>
    </nav>
    <div class="user">
      <div class="user__wrapper">
        <!-- <div class="user__image"></div> -->
        <div class="user__name"> <a href="#">山田 太郎<i class="fas fa-ellipsis-v"></i></a>
          <ul class="drop-menu">
            <li><a href="#">サインアウト<i class="fas fa-angle-right"></i></a></li>
          </ul>
        </div>
      </div>
    </div>
  </section>
</header>
<main>
	<h2>アカウント編集</h2>
	<ul>
	<c:forEach var="message" items="${ messages }">
		<li><c:out value="${ message }" /></li>
	</c:forEach>
	</ul>
	<form action="AccountEditServlet" method="post">
		<table>
			<tr>
				<th>項目名</th>
				<th></th>
			</tr>
			<tr>
				<td>アカウントID</td>

				<td>
				<input type="hidden" name="id" value="<c:out value="${ Staff.id }" />">
				<c:out value="${ Staff.id }" />
				</td>

			</tr>
			<tr>
				<td>氏名</td>
				<td><input type="text" name="name" value="<c:out value="${ Staff.name }" />"></td>
			</tr>
			<tr>
				<td>氏名（かな）</td>
				<td><input type="text" name="kana" value="<c:out value="${ Staff.kana }" />"></td>
			</tr>
			<tr>
				<td>ユーザー権限</td>
				<td>
					<c:if test="${Staff.authority == 1}">管理者</c:if>
					<c:if test="${Staff.authority == 2}">その他</c:if>
				</td>
			</tr>
			<tr>
				<td>新しいパスワード</td>
				<td><input type="text" name="password" value="<c:out value="${Staff.password }"/>"></td>
			</tr>
		</table>
		<input class="main-b" type="button" onclick="location.href='AccountListServlet'" value="戻る">
		<input class="main-b" type="submit" value="削除">
	</form>
		<form method="post" action="AccountEditCompletionServlet">
					<input type="hidden" name="id" value="${ Staff.id }">
					<input type="hidden" name="name" value="${ Staff.name }">
					<input type="hidden" name="kana" value="${ Staff.kana }">
					<input type="hidden" name="authority" value="${ Staff.authority }">
					<input type="hidden" name="password" value="${ Staff.password }">
					<input class="main-b" type="submit" value="更新">
				</form>
</main>
<footer> <small>Copyright(C) 2009有限責任事業組合 大阪職業教育協働機構(A'ワーク創造館) All Rights Reserved.</small> </footer>
</body>
</html>
