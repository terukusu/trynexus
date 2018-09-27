<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ja">

<head>

<meta charset="UTF-8">

<title>マッチング結果登録</title>
<link href="https://use.fontawesome.com/releases/v5.0.6/css/all.css" rel="stylesheet" >
<link href="https://fonts.googleapis.com/css?family=M+PLUS+1p" rel="stylesheet">
<link href="../css/bootstrap-reboot.css" rel="stylesheet">
<link href="../css/common.css" rel="stylesheet">
<link href="../css/header.css" rel="stylesheet">
<link href="../css/footer.css" rel="stylesheet">
<link rel="stylesheet" href="../css/default.css">
<link rel="stylesheet" href="../css/default.date.css">
<!-- <link href="css/ootuka.css" rel="stylesheet"> -->
<link href="../css/matchingregist.css" rel="stylesheet">

<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/jqueryui/1.12.1/themes/base/jquery-ui.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
<script src="http://ajax.googleapis.com/ajax/libs/jqueryui/1/jquery-ui.min.js"></script>
<script src="http://ajax.googleapis.com/ajax/libs/jqueryui/1/i18n/jquery.ui.datepicker-ja.min.js"></script>
<link rel="stylesheet" href="http://ajax.googleapis.com/ajax/libs/jqueryui/1/themes/Base/jquery-ui.css" >
<script src="https://ajax.googleapis.com/ajax/libs/jqueryui/1/i18n/jquery.ui.datepicker-ja.min.js"></script>
<script type="text/javascript" src="../js/common.js"></script>
</head>

<body>

<header>
  <section>
    <h1 class="logo"><a href="/nexus/web/staff-top">LOGO</a></h1>
    <nav>
      <ul class="mainnavi">
        <li><a href="/nexus/web/job-search"><i class="fas fa-home"></i>検索</a></li>
        <li>
          <a href="/nexus/web/jobseeker-list"><i class="fas fa-search"></i>登録&amp;閲覧</a>
          <ul class="drop-menu">
            <li><a href="/nexus/web/kyujin-disp">求人情報<i class="fas fa-angle-right"></i></a></li>
            <li><a href="/nexus/web/jobseeker-list">求職者情報<i class="fas fa-angle-right"></i></a></li>
            <li><a href="/nexus/web/match-disp">マッチング登録<i class="fas fa-angle-right"></i></a></li>
          </ul>
        </li>
        <li><a href="/nexus/web/account-list"><i class="far fa-bookmark"></i>管理</a></li>
      </ul>
    </nav>
    <div class="user">
      <div class="user__wrapper">
        <div class="user__name">
          <a href="#"><c:out value="${ Staff.name }" /><i class="fas fa-ellipsis-v"></i></a>
          <ul class="drop-menu">
            <li><a href="/nexus/web/logout">ログアウト<i class="fas fa-angle-right"></i></a></li>
          </ul>
        </div>
      </div>
    </div>
  </section>
</header>
<main>

<!-- body部分　-->

<h2>マッチング結果登録</h2>

　　　　<ul>
	<c:forEach var="message" items="${ messages }">
		<li><font color=#F00 size=7"><c:out value="${ message }" /></font></li>
	</c:forEach>
	</ul>


<form method="post" action="/nexus/web/match-regist">



<!--　　 　テーブル部分　-->


<table border="0">

		<tr>
			<th><font size="5">項目名</font></th>
			<th><font size="5">結果</font></th>

			</tr>
			<tr>
				<td><font size="5">求人No</font></td>
				<td>
				<input type="text" name="kyujinno" size="14">
				<input type="button" value="求人No一覧" onclick="window.open('http://localhost:8080/nexus/web/job-search')"></td>

			</tr>
			<tr>
				<td><font size="5">求職者No</font></td>
				<td><input type="text" name="jobseekerid" size="8">
				<input type="button" value="求職者一覧" onclick="window.open('http://localhost:8080/nexus/web/jobseeker-list')"></td>

			</tr>
			<tr>
				<td><font size="5">入社日</font></td>
				<td><input type="text" class="datepicker" name="enterdt"></td>

			</tr>
			<tr>
				<td><font size="5">評価</font></td>
				<td>
						<input name="assessment" type="radio" value="1"> 成功 <input
							name="assessment" type="radio" value="2"> 失敗 <input name="assessment"
							type="radio" value="3" checked="checked"> 確認中
					</td>

			</tr>
			<tr>
				<td><font size="5">面接日</font></td>

				<td><input type="text" class="datepicker" name="interviewdt" >
</td>

			</tr>
			<tr>
				<td><font size="5">職業紹介者ID</font></td>
				<td><input type="text" name="staffid" size="4" value="<c:out value="${ Staff.id }" />"></td>

			</tr>
			<tr>
				<td><font size="5">備考欄</font></td>
				<td><textarea name="note" rows="7" cols="30"></textarea></td>

			</tr>

		</table>
			<font size="5"><input class="main-b" type="submit" value="登録"></font>
		</form>





	</main>


<!-- フッター　-->
<footer>
  <small>Copyright(C) 2009有限責任事業組合 大阪職業教育協働機構(A'ワーク創造館)　All Rights Reserved.</small>
</footer>

</body>
</html>


