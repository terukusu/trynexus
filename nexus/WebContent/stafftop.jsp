<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="ja">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width,initial-scale=1.0">
    <title>スタッフページ</title>
   <link href="https://use.fontawesome.com/releases/v5.0.6/css/all.css"rel="stylesheet" >
<link href="https://fonts.googleapis.com/css?family=M+PLUS+1p" rel="stylesheet">
<link href="bootstrap-reboot.css" rel="stylesheet">
<link href="applicantlist.css" rel="stylesheet">
<link href="common.css" rel="stylesheet">
<link href="header.css" rel="stylesheet">
<link href="footer.css" rel="stylesheet">
<link href="stafftop.css" rel="stylesheet">
</head>
<body>
<main>
<div><!--　コンテナー-->
	<div>
		<h1>トップページ</h1>
	</div>
	<!-- 検索メニュ　※URLはダミー　-->
	<div>
    <table>
    	<tr>
    	<th>
			<label>検索</label>
		</th>
        </tr>
        <tr>
        <td><a href="http://www.fureai.or.jp/~irie/html-tag/">■求人検索</a></td>
        </tr>
    </table>
	</div>

    <!-- 登録＆閲覧メニュー　※URLはダミー　-->
	<div>
    <table>
    	<tr>
    	<th>
			<label>登録＆閲覧</label>
		</th>
        </tr>
        <tr>
        <td><a href="http://www.fureai.or.jp/~irie/html-tag/">■求人情報</a></td>
        </tr>
        <tr>
        <td><a href="http://www.fureai.or.jp/~irie/html-tag/">■求職者情報</a></td>
        </tr>
        <tr>
        <td><a href="http://www.fureai.or.jp/~irie/html-tag/">■企業マスター</a></td>
        </tr>
        <tr>
        <td><a href="http://www.fureai.or.jp/~irie/html-tag/">■マッチング履歴</a></td>
        </tr>
    </table>
	</div>
    <!-- 管理メニュー　※URLはダミー　-->
	<div>
    <table>
    	<tr>
    	<th>
			<label>管理</label>
		</th>
        </tr>
        <tr>
        <td><a href="http://www.fureai.or.jp/~irie/html-tag/">■アカウント</a></td>
        </tr>
    </table>
	</div>


	<div>
	 <form name= "logout" method="GET" action="logoutservlet">
    <input type="submit" name="close" value="ログアウト">
  </form>
	</div>



</div><!--　コンテナ終了-->
</main>
<footer>
  <small>Copyright(C) 2009有限責任事業組合 大阪職業教育協働機構(A'ワーク創造館)　All Rights Reserved.</small>
</footer>

</body>
</html>
