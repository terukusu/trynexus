<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ja">

<head>
<meta charset="UTF-8">
<title>ログアウト</title>
<link href="https://use.fontawesome.com/releases/v5.0.6/css/all.css"rel="stylesheet" >
<link href="https://fonts.googleapis.com/css?family=M+PLUS+1p" rel="stylesheet">
<link href="css/bootstrap-reboot.css" rel="stylesheet">
<link href="css/common.css" rel="stylesheet">
<link href="css/header.css" rel="stylesheet">
<link href="css/footer.css" rel="stylesheet">
<link href="css/stafflogin.css" rel="stylesheet">

</head>
<body>
<!-- ヘッダー　-->
<header>
  <section>
    <h1 class="logo"><a href="#">TryNexus</a></h1>
    <div class="user">
      <div class="user__wrapper">
        <!-- <div class="user__image"></div> -->
        <div class="user__name">
          <a href="#"><i class="fas fa-ellipsis-v"></i></a>
          <ul class="drop-menu">
          </ul>
        </div>
      </div>
    </div>
  </section>
</header>
<div>

<div>
<h1>ログアウト完了</h1>
</div>

<div>
	<p>ログアウト完了いたしました。</p>
	<p>ご利用ありがとうございました。</p>
</div>

<div>
	<a href="./stafflogin.jsp">ログイン画面へ</a>
</div>

</div>

<!-- フッター　-->
<footer>
  <small>Copyright(C) 2009有限責任事業組合 大阪職業教育協働機構(A'ワーク創造館)　All Rights Reserved.</small>
</footer>
<script type="text/javascript">
window.location.hash="no-back";
window.location.hash="no-back-button";
window.onhashchange=function(){
    window.location.hash="no-back";
}
</script>
</body>
</html>