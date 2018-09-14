<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%
	response.setHeader("Pragma","no-cache");
	response.setHeader("Cache-Control","no-cache");
	response.addHeader("Cache-Control","no-store");
	response.setDateHeader("Expires", 0);
	%>

<!DOCTYPE html>
<html lang="ja">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width,initial-scale=1.0">
    <title>スタッフページ</title>
    <link rel="stylesheet" type="text/css" href="staff_main.css" />
</head>
<body>
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
        <td><a href="http://www.fureai.or.jp/~irie/html-tag/">■企業マスタ</a></td>
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
<body>
</body>
</html>
