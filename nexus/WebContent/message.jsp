<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="UTF-8">
<title>ログインできない／アカウントをお持ちでない場合</title>
<link href="https://use.fontawesome.com/releases/v5.0.6/css/all.css"rel="stylesheet" />
<link href="https://fonts.googleapis.com/css?family=M+PLUS+1p" rel="stylesheet" />
<link href="css/bootstrap-reboot.css" rel="stylesheet" type="text/css" />
<link href="css/common.css" rel="stylesheet" type="text/css" />
<link href="css/header.css" rel="stylesheet" type="text/css" />
<link href="css/footer.css" rel="stylesheet" type="text/css" />
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
<script src="http://ajax.googleapis.com/ajax/libs/jqueryui/1/jquery-ui.min.js"></script>
<script type="text/javascript" src="./js/common.js"></script>
</head>
<body>

<!-- ヘッダー　-->
<header>
  <section>
    <h1 class="logo"><a href="/nexus/top"><img src="./css/TryNexus-Logo.png" width="97" height="70" alt="TryNexus" /></a></h1>
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
        <li><a href="/nexus/web/admin/account-list"><i class="far fa-bookmark"></i>管理</a></li>
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

<!-- body部分　-->
<main>
	<div><!--　コンテナー-->
  		<div>
    		<h2>ログインできない／アカウントをお持ちでない場合</h2>
        </div>

    <!--案内メッセージ-->
    	<div>
    		<p>恐れ入りますが、ログインができない場合、</p>
    		<p>アカウントをお持ちでない場合は、当館管理担当者までお申し出くださいませ。</p>
   		 </div>
   	<a href="/nexus/top">ログイン画面に戻る</a>

	</div><!--　コンテナ終了-->

</main>

<!-- フッター　-->
<footer>
  <small>Copyright(C) 2009有限責任事業組合 大阪職業教育協働機構(A'ワーク創造館)　All Rights Reserved.</small>
</footer>

</body>
</html>

