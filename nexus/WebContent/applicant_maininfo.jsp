<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="UTF-8">
<script src="build/kalendae.standalone.js" type="text/javascript"
	charset="utf-8"></script>
<link rel="stylesheet" href="css/kalendae.css" type="text/css" />
<link href="https://use.fontawesome.com/releases/v5.0.6/css/all.css"
	rel="stylesheet" type="text/css" />
<link href="https://fonts.googleapis.com/css?family=M+PLUS+1p"
	rel="stylesheet" type="text/css" />
<link href="css/bootstrap-reboot.css" rel="stylesheet" type="text/css" />
<link href="css/common.css" rel="stylesheet" type="text/css" />
<link href="css/header.css" rel="stylesheet" type="text/css" />
<link href="css/footer.css" rel="stylesheet" type="text/css" />
<link href="css/job_seeker.css" rel="stylesheet" type="text/css" />
<style>
#job_seeker {
	width: 980px;
	margin-top: 0;
	margin-bottom: 50px;
	margin-right: auto;
	margin-left: auto;
	clear: both;
}

#job_seeker table th {
	letter-spacing: 0.3em;
}

#job_seeker table td {
	text-align: left;
}
</style>
<title>求職者詳細情報</title>
</head>
<body>
	<!-- ヘッダー　-->
	<header>
		<section>
			<h1 class="logo">
				<a href="#">TryNexus</a>
			</h1>
			<nav>
				<ul class="mainnavi">
					<li><a href="#"><i class="fas fa-home"></i>検索</a></li>
					<li><a href="#"><i class="fas fa-search"></i>登録&amp;閲覧</a>
						<ul class="drop-menu">
							<li><a href="#">求人情報<i class="fas fa-angle-right"></i></a></li>
							<li><a href="#">求職者情報<i class="fas fa-angle-right"></i></a></li>
							<li><a href="#">企業マスタ<i class="fas fa-angle-right"></i></a></li>
							<li><a href="#">マッチング履歴<i class="fas fa-angle-right"></i></a></li>
						</ul></li>
					<li><a href="#"><i class="far fa-bookmark"></i>管理</a></li>
				</ul>
			</nav>
			<div class="user">
				<div class="user__wrapper">
					<!-- <div class="user__image"></div> -->
					<div class="user__name">
						<a href="#">山田 太郎<i class="fas fa-ellipsis-v"></i></a>
						<ul class="drop-menu">
							<li><a href="#">サインアウト<i class="fas fa-angle-right"></i></a></li>
						</ul>
					</div>
				</div>
			</div>
		</section>
	</header>

	<h2>求職者詳細情報</h2>

	<div id="job_seeker">

		<table border="0">

			<tr>
				<th width="20%">ID</th>
				<td><c:out value="${ info.id }" /></td>
			</tr>
			<tr>
				<th>名前</th>
				<td><c:out value="${ info.name }" /></td>
			</tr>
			<tr>
				<th>ふりがな</th>
				<td><c:out value="${ info.kana }" /></td>
			</tr>
			<tr>
				<th>性別</th>
				<td><c:out value="${ info.sex }" /></td>
			</tr>
			<tr>
				<th>生年月日</th>
				<td><c:out value="${ info.birthdt }" /></td>
			</tr>
			<tr>
				<th>年齢</th>
				<td><c:out value="${ info.age }" /></td>
			</tr>
			<tr>
				<th>郵便番号</th>
				<td><c:out value="${ info.postal }" /></td>
			</tr>
			<tr>
				<th>住所</th>
				<td><c:out value="${ info.address }" /></td>
			</tr>
			<tr>
				<th>最寄り駅</th>
				<td><c:out value="${ info.nearstation }" /></td>
			</tr>
			<tr>
				<th>自宅電話番号</th>
				<td><c:out value="${ info.phone }" /></td>
			</tr>
			<tr>
				<th>携帯電話番号</th>
				<td><c:out value="${ info.mobile }" /></td>
			</tr>
			<tr>
				<th>配偶者</th>
				<td><c:out value="${ info.partner }" /></td>
			</tr>
			<tr>
				<th>扶養人数</th>
				<td><c:out value="${ info.huyou }" /></td>
			</tr>
			<tr>
				<th>学歴</th>
				<td><c:out value="${ info.education }" /></td>
			</tr>
			<tr>
				<th>希望職種1</th>
				<td><c:out value="${ info.hopejob1 }" /></td>
			</tr>
			<tr>
				<th>希望職種2</th>
				<td><c:out value="${ info.hopejob2 }" /></td>
			</tr>
			<tr>
				<th>希望職種3</th>
				<td><c:out value="${ info.hopejob3 }" /></td>
			</tr>
			<tr>
				<th>希望業種</th>
				<td><c:out value="${ info.hopejobcategory }" /></td>
			</tr>
			<tr>
				<th>希望勤務地</th>
				<td><c:out value="${ info.hopeworkplace }" /></td>
			</tr>
			<tr>
				<th>希望雇用形態</th>
				<td><c:out value="${ info.hopekoyoukeitai }" /></td>
			</tr>
			<tr>
				<th>希望勤務日時</th>
				<td><c:out value="${ info.hopeworkingDate }" /></td>
			</tr>
			<tr>
				<th>希望勤務時間(開始)</th>
				<td><c:out value="${ info.hopebegintime }" /></td>
			</tr>
			<tr>
				<th>希望勤務時間(終了)</th>
				<td><c:out value="${ info.hopeendtime }" /></td>
			</tr>
			<tr>
				<th>希望月給</th>
				<td><c:out value="${ info.hopesalary }" /></td>
			</tr>
			<tr>
				<th>希望時間給</th>
				<td><c:out value="${ info.hopejikyu }" /></td>
			</tr>
			<tr>
				<th>その他希望</th>
				<td><c:out value="${ info.hopeetc }" /></td>
			</tr>
			<tr>
				<th>自動車免許</th>
				<td><c:out value="${ info.driverlicense }" /></td>
			</tr>
			<tr>
				<th>その他免許</th>
				<td><c:out value="${ info.licenseetc }" /></td>
			</tr>
			<tr>
				<th>パソコンスキル</th>
				<td><c:out value="${ info.pasokonskill }" /></td>
			</tr>
			<tr>
				<th>留意点</th>
				<td><c:out value="${ info.caution }" /></td>
			</tr>
			<tr>
				<th>担当職業者紹介者氏名</th>
				<td><c:out value="${ info.tantoustaffname }" /></td>
			</tr>
			<tr>
				<th>担当職業者紹介者ID</th>
				<td><c:out value="${ info.tantoustaffid }" /></td>
			</tr>
			<tr>
				<th>パスワード</th>
				<td><c:out value="${ info.password }" /></td>
			</tr>
		</table>
		<input type="submit" value="編集">
	</div>
	<!-- フッター　-->
	<footer>
		<small>Copyright(C) 2009有限責任事業組合 大阪職業教育協働機構(A'ワーク創造館) All
			Rights Reserved.</small>
	</footer>
</body>
</html>