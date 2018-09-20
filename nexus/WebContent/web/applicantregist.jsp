<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="UTF-8">
<script src="build/kalendae.standalone.js"type="text/javascript" charset="utf-8"></script>
<link rel="stylesheet" href="css/kalendae.css" type="text/css" />
<link href="https://use.fontawesome.com/releases/v5.0.6/css/all.css" rel="stylesheet" type="text/css" />
<link href="https://fonts.googleapis.com/css?family=M+PLUS+1p" rel="stylesheet" type="text/css" />
<link href="../css/bootstrap-reboot.css" rel="stylesheet" type="text/css" />
<link href="../css/common.css" rel="stylesheet" type="text/css" />
<link href="../css/header.css" rel="stylesheet" type="text/css" />
<link href="../css/footer.css" rel="stylesheet" type="text/css" />
<link href="../css/job_seeker.css" rel="stylesheet" type="text/css" />
<title>求職者情報登録</title>
</head>
<body><!-- ヘッダー　-->
<header>
  <section>
    <h1 class="logo"><a href="#">LOGO</a></h1>
    <nav>
      <ul class="mainnavi">
        <li><a href="#"><i class="fas fa-home"></i>検索</a></li>
        <li> <a href="#"><i class="fas fa-search"></i>登録&amp;閲覧</a>
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
<h2>求職者情報登録</h2>
<div id="job_seeker">
	<ul>
	<c:forEach var="message" items="${ messages }">
		<li><c:out value="${ message }" /></li>
	</c:forEach>
	</ul>

	<form method="post" action="./regist">
		<table width="" border="0">
		<tr>
			<th width="20%">ID</th>
			<td>
			  <input type="text" name="id" value="<c:out value="${ seeker.id }" />">
				<input type="hidden" name="hiddenid" value="<c:out value="${ seeker.id }" />">
			</td>
		</tr>
		<tr>
			<th>名前</th>
			<td><input type="text" name="name" value="<c:out value="${ seeker.name }" />"></td>
		</tr>
		<tr>
			<th>ふりがな</th>
			<td><input type="text" name="kana" value="<c:out value="${ seeker.kana }" />"></td>
		</tr>
		<tr>
			<th>生年月日</th>
			<td><input type="text" name="birthdt" value="<c:out value="${ seeker.birthdt }" />"></td>
		</tr>
		<tr>
			<th>性別</th>
			<td><input type="text" name="sex" value="<c:out value="${ seeker.sex }" />"></td>
		</tr>
		<tr>
			<th>年齢</th>
			<td><input type="text" name="age" value="<c:out value="${ seeker.age }" />"></td>
		</tr>
		<tr>
			<th>郵便番号</th>
			<td><input type="text" name="postal" value="<c:out value="${ seeker.postal }" />"></td>
		</tr>
		<tr>
			<th>住所</th>
			<td><input type="text" name="address" value="<c:out value="${ seeker.address }" />"></td>
		</tr>
		<tr>
			<th>最寄り駅</th>
			<td><input type="text" name="nearstation" value="<c:out value="${ seeker.nearstation }" />"></td>
		</tr>
		<tr>
			<th>自宅電話番号</th>
			<td><input type="text" name="phone" value="<c:out value="${ seeker.phone }" />"></td>
		</tr>
		<tr>
			<th>携帯電話番号</th>
			<td><input type="text" name="mobile" value="<c:out value="${ seeker.mobile }" />"></td>
		</tr>
		<tr>
			<th>配偶者</th>
			<td><input type="text" name="partner" value="<c:out value="${ seeker.partner }" />"></td>
		</tr>
		<tr>
			<th>扶養人数</th>
			<td><input type="text" name="huyou" value="<c:out value="${ seeker.huyou }" />"></td>
		</tr>
		<tr>
			<th>学歴</th>
			<td><input type="text" name="education" value="<c:out value="${ seeker.education }" />"></td>
		</tr>
		<tr>
			<th>希望職種1</th>
			<td><input type="text" name="hopejob1" value="<c:out value="${ seeker.hopejob1 }" />"></td>
		</tr>
		<tr>
			<th>希望職種2</th>
			<td><input type="text" name="hopejob2" value="<c:out value="${ seeker.hopejob2 }" />"></td>
		</tr>
		<tr>
			<th>希望職種3</th>
			<td><input type="text" name="hopejob3" value="<c:out value="${ seeker.hopejob3 }" />"></td>
		</tr>
		<tr>
			<th>希望業種</th>
			<td><input type="text" name="hopejobcategory" value="<c:out value="${ seeker.hopejobcategory }" />"></td>
		</tr>
		<tr>
			<th>希望勤務地</th>
			<td><input type="text" name="hopeworkplace" value="<c:out value="${ seeker.hopeworkplace }" />"></td>
		</tr>
		<tr>
			<th>希望雇用形態</th>
			<td><input type="text" name="hopekoyoukeitai" value="<c:out value="${ seeker.hopekoyoukeitai }" />"></td>
		</tr>
		<tr>
			<th>希望勤務日時</th>
			<td><input type="text" name="hopeworkingdate" value="<c:out value="${ seeker.hopeworkingDate }" />"></td>
		</tr>
		<tr>
			<th>希望勤務時間(開始)</th>
			<td><input type="text" name="hopebegintime" value="<c:out value="${ seeker.hopebegintime }" />"></td>
		</tr>
		<tr>
			<th>希望勤務時間(終了)</th>
			<td><input type="text" name="hopeendtime" value="<c:out value="${ seeker.hopeendtime }" />"></td>
		</tr>
		<tr>
			<th>希望月給</th>
			<td><input type="text" name="hopesalary" value="<c:out value="${ seeker.hopesalary }" />"></td>
		</tr>
		<tr>
			<th>希望時間給</th>
			<td><input type="text" name="hopejikyu" value="<c:out value="${ seeker.hopejikyu }" />"></td>
		</tr>
		<tr>
			<th>その他希望</th>
			<td><input type="text" name="hopeetc" value="<c:out value="${ seeker.hopeetc }" />"></td>
		</tr>
		<tr>
			<th>自動車免許</th>
			<td><input type="text" name="driverlicense" value="<c:out value="${ seeker.driverlicense }" />"></td>
		</tr>
		<tr>
			<th>その他免許</th>
			<td><input type="text" name="licenseetc" value="<c:out value="${ seeker.licenseetc }" />"></td>
		</tr>
		<tr>
			<th>パソコンスキル</th>
			<td><input type="text" name="pasokonskill" value="<c:out value="${ seeker.pasokonskill }" />"></td>
		</tr>
		<tr>
			<th>留意点</th>
			<td><input type="text" name="caution" value="<c:out value="${ seeker.caution }" />"></td>
		</tr>
		<tr>
			<th>担当職業者紹介者ID</th>
			<td><input type="text" name="tantoustaffid" value="<c:out value="${ seeker.tantoustaffid }" />"></td>
		</tr>
		<tr>
			<th>パスワード</th>
			<td><input type="text" name="password" value="<c:out value="${ seeker.password }" />"></td>
		</tr>
	</table>
		<input class="main-b" type="submit" value="登録">
	</form>
	<form action="../JobSeekerServlet" method="get">
            <input type="submit" class="main-b" name="send" value="一覧に戻る">
        </form>
    </div>
    </main>
	<!-- フッター　-->
<footer> <small>Copyright(C) 2009有限責任事業組合 大阪職業教育協働機構(A'ワーク創造館)　All Rights Reserved.</small> </footer>
</body>
</html>