<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html lang="ja">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="https://use.fontawesome.com/releases/v5.0.6/css/all.css"
	rel="stylesheet" type="text/css" />
<link href="https://fonts.googleapis.com/css?family=M+PLUS+1p"
	rel="stylesheet" type="text/css" />
<link href="css/bootstrap-reboot.css" rel="stylesheet" type="text/css" />
<link href="css/common.css" rel="stylesheet" type="text/css" />
<link href="css/header.css" rel="stylesheet" type="text/css" />
<link href="css/footer.css" rel="stylesheet" type="text/css" />
<link href="css/job_search.css" rel="stylesheet" type="text/css" />
<title>求人検索項目</title>
</head>
<body>
	<!-- ヘッダー　-->
	<header> <section>
	<h1 class="logo">
		<a href="#">LOGO</a>
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
	</section> </header>
	<main> <!--　求人検索項目 -->
	<div id="job_search">
		<h3 style="float: none;">求人検索項目</h3>
		<form action="/web/job-search" method="post">
			<div class="listbox2">
				<h4 class="word">職種をフリーワード検索</h4>
				<textarea class="word" name="job" cols="60" rows="3"
					placeholder="職種名より検索します。" tabindex="1"></textarea>
			</div>

			<div class="listbox2">
				<h4 class="word">業種をフリーワード検索</h4>
				<textarea class="word" name="jobcategory" cols="60" rows="3"
					placeholder="業種名より検索します。" tabindex="1"></textarea>
			</div>
			<div class="listbox1">
				<h4 class="word">勤務地</h4>
				<select name="addresscd" tabindex="2" style="width: 400px;">
					<option value="1">北海道</option>
					<option value="2">青森県</option>
					<option value="3">岩手県</option>
					<option value="4">宮城県</option>
					<option value="5">秋田県</option>
					<option value="6">山形県</option>
					<option value="7">福島県</option>
					<option value="8">茨城県</option>
					<option value="9">栃木県</option>
					<option value="10">群馬県</option>
					<option value="11">埼玉県</option>
					<option value="12">千葉県</option>
					<option value="13">東京都</option>
					<option value="14">神奈川県</option>
					<option value="15">新潟県</option>
					<option value="16">富山県</option>
					<option value="17">石川県</option>
					<option value="18">福井県</option>
					<option value="19">山梨県</option>
					<option value="20">長野県</option>
					<option value="21">岐阜県</option>
					<option value="22">静岡県</option>
					<option value="23">愛知県</option>
					<option value="24">三重県</option>
					<option value="25">滋賀県</option>
					<option value="26">京都府</option>
					<option value="27">大阪府</option>
					<option value="28">兵庫県</option>
					<option value="29">奈良県</option>
					<option value="30">和歌山県</option>
					<option value="31">鳥取県</option>
					<option value="32">島根県</option>
					<option value="33">岡山県</option>
					<option value="34">広島県</option>
					<option value="35">山口県</option>
					<option value="36">徳島県</option>
					<option value="37">香川県</option>
					<option value="38">愛媛県</option>
					<option value="39">高知県</option>
					<option value="40">福岡県</option>
					<option value="41">佐賀県</option>
					<option value="42">長崎県</option>
					<option value="43">熊本県</option>
					<option value="44">大分県</option>
					<option value="45">宮崎県</option>
					<option value="46">鹿児島県</option>
					<option value="47">沖縄県</option>
				</select>
			</div>
			<div class="listbox1" style="clear: left;">
				<h4>給料</h4>
				<input name="salarymin" type="number" maxlength="2" tabindex="3"
					min="0" style="width: 90px;" /> 万円～ <input name="salarymax"
					type="number" maxlength="2" tabindex="4" min="0"
					style="width: 90px;" /> 万円
			</div>
			<div class="listbox1">
				<h4>雇用形態</h4>
				<select name="koyoukeitaicd" tabindex="5">
					<option value="0"></option>
					<option value="1">正社員</option>
					<option value="2">正社員以外</option>
					<option value="3">有期雇用派遣</option>
					<option value="4">無期雇用派遣</option>
					<option value="5">パート労働者</option>
					<option value="6">有期派遣パート</option>
					<option value="7">無期派遣パート</option>
				</select>
			</div>
			<!--隠し項目（年齢など他）-->
			<input name="" type="hidden" value="" /> <input name=""
				type="hidden" value="" />
			<!--ここまで隠し項目-->
			<div class="listbox2">
				<h4 class="word">求人詳細内をフリーワード検索</h4>
				<textarea class="word" name="job" cols="60" rows="6"
					placeholder="求人詳細項目より検索します。"></textarea>
			</div>
			<div class="listbox3">
				<input class="submit_button" type="submit" value="検索" /> <input
					class="reset_button" type="reset" value="選択項目をすべてクリア" />
			</div>
		</form>
	</div>
	<div id="job_search_list">
		<h3>求人一覧表示</h3>
		<table width="" border="0">
			<tbody id="">
				<tr>
					<th scope="col">&nbsp;</th>
					<th scope="col">求人No.</th>
					<th scope="col">事業所名</th>
					<th scope="col">就業場所</th>
					<th scope="col">最寄り駅</th>
					<th scope="col">職種</th>
					<th scope="col">雇用形態</th>
					<th scope="col">年齢制限</th>
					<th scope="col">基本給</th>
				</tr>
				<c:forEach var="SimpleKyujin" items="${ kyujin }">

					<tr>
						<td>
							<form method="get" action="/web/kyujin-disp">
								<input type="hidden" name="no" value="${ SimpleKyujin.no }">
									<input type="submit" value="詳細"></form>
						</td>
						<td><c:out value="${ SimpleKyujin.no }" /></td>
						<td><c:out value="${ SimpleKyujin.companyname }" /></td>
						<td><c:out value="${ SimpleKyujin.address }" /></td>
						<td><c:out value="${ SimpleKyujin.nearstation }" /></td>
						<td><c:out value="${ SimpleKyujin.job }" /></td>
						<td><c:out value="${ SimpleKyujin.koyoukeitaicd }" /></td>
						<td><c:out value="${ SimpleKyujin.agemin }" />歳 ～ <c:out
								value="${ SimpleKyujin.agemax }" />歳</td>
						<td><c:out value="${ SimpleKyujin.salarymin }" />円 ～ <c:out
								value="${ SimpleKyujin.salarymax }" />円</td>

					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	</main>
	<!-- フッター　-->
	<footer> <small>Copyright(C) 2009有限責任事業組合
		大阪職業教育協働機構(A'ワーク創造館) All Rights Reserved.</small> </footer>
</body>
</html>