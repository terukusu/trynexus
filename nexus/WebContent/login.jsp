<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html lang="ja">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width,initial-scale=1.0">
    <title>ログイン（紹介者・スタッフ）</title>
    <link rel="stylesheet" type="text/css" href="login.css" />
</head>
<body>
<div><!--　コンテナー-->
	<div>
		<h1>ログイン</h1>
	</div>
    <!--ID&PW入力フォーム-->
    <div>
    <form action="./loginServlet" method="POST">
    <table>
    	<tr>
			<th rowspan="2">ID</th>
		</tr>
        <tr>
			<td><input type="text" id="id" name="id" required></td>
		</tr>
        <tr>
			<th rowspan="2">パスワード</th>
		</tr>
			<tr>
				<td><input type="password" id="pass" name="pass" required></td>
			</tr>
	</table>
    	<input type=submit value="ログイン">
    </form>

    </div>

    <!-- ログインできないとき　※リンクはダミーです　-->
	<div>
		<a href="http://www.fureai.or.jp/~irie/html-tag/">ログインできない／アカウントをお持ちでない場合</a>
	</div>

</div><!--　コンテナ終了-->
<body>
</body>
</html>
