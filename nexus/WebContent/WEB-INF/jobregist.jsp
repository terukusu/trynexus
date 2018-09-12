<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="UTF-8">
<title>求人登録</title>
<link href="https://use.fontawesome.com/releases/v5.0.6/css/all.css"rel="stylesheet" >
<link href="https://fonts.googleapis.com/css?family=M+PLUS+1p" rel="stylesheet">
<link href="css/bootstrap-reboot.css" rel="stylesheet">
<link href="css/common.css" rel="stylesheet">
<link href="css/header.css" rel="stylesheet">
<link href="css/footer.css" rel="stylesheet">
</head>
<body>


<main>
  <div id="jobregist">
  <h2>求人登録</h2>
  <class="edit_table"></class>
  </div>
  

  <div id="message">
      <td>メッセージを表示</td>
    </div>

<table border="1">
  <tr>
    <th>項目名</th>
    <th>内容</th>
  </tr>  <tr>
    <td>求人No.</td>
    <td><input type="text" name="no" value="" tabindex="1"></td>
  </tr>  
  <tr>
    <td>受付年月日</td>
     <td><input type="date" name="" value="" tabindex="2"></td>
  </tr>
  <tr>
    <td>求人有効年月日</td>
     <td><input type="date" name="" value="" tabindex="3"></td>
  </tr>
  <tr>
    <td>事業所番号</td>
     <td><input type="text" name="" value="" tabindex="4"></td>
  </tr>
  <tr>
     <td>職種細分類コード１</td>
     <td><input type="text" name="" value="" tabindex="5"></td>
   </tr>
   <tr>
    <td>職種細分類コード2</td>
     <td><input type="text" name="" value="" tabindex="6"></td>
  </tr>
  <tr>
    <td>職種細分類コード3</td>
     <td><input type="text" name="" value="" tabindex="7"></td>
  </tr>
  <tr>
    <td>職種大分類コード１</td>
     <td><input type="text" name="" value="" tabindex="8"></td>
  </tr>  
  <tr>
    <td>職種大分類コード2</td>
     <td><input type="text" name="" value="" tabindex="9"></td>
  </tr>  
  <tr>
    <td>職種大分類コード3</td>
     <td><input type="text" name="" value="" tabindex="10"></td>
  </tr>
  <tr>
    <td>産業細分類コード</td>
     <td><input type="text" name="" value="" tabindex="11"></td>
  </tr>
  <tr>
    <td>産業大分類コード</td>
     <td><input type="text" name="" value="" tabindex="12"></td>
  </tr>
  <tr>
    <td>産業分類名</td>
     <td><input type="text" name="" value="" tabindex="13"></td>
  </tr>
  <tr>
    <td>事業所名（かな）</td>
     <td><input type="text" name="" value="" tabindex="14"></td>
  </tr>
  <tr>
    <td>事業所名</td>
     <td><input type="text" name="" value="" tabindex="15"></td>
  </tr>
  <tr>
    <td>事業所郵便番号</td>
     <td><input type="text" name="" value="" tabindex="16"></td>
  </tr>
  <tr>
    <td>事業所所在地</td>
     <td><input type="text" name="" value="" tabindex="17"></td>
  </tr>
  <tr>
    <td>事業所URL</td>
     <td><input type="text" name="" value="" tabindex="18"></td>
  </tr>
  <tr>
    <td>就業場所郵便番号</td>
     <td><input type="text" name="" value="" tabindex="19"></td>
  </tr>
  <tr>
    <td>就業場所</td>
     <td><input type="text" name="" value="" tabindex="20"></td>
  </tr>  
  <tr>
    <td>最寄り駅</td>
     <td><input type="text" name="" value="" tabindex="21"></td>
  </tr>  
  <tr>
    <td>職種</td>
     <td><input type="text" name="" value="" tabindex="22"></td>
  </tr>  
  <tr>
    <td>派遣/請負コード</td>
     <td><input type="text" name="" value="" tabindex="23"></td>
  </tr>  
  <tr>
    <td>仕事の内容</td>
     <td>
      <textarea name="detail" cols="50" rows="10" tabindex="24"></textarea>
      </td>
  </tr>  
  <tr>
    <td>雇用形態コード</td>
     <td><input type="text" name="" value="" tabindex="25"></td>
  </tr>  
  <tr>
    <td>雇用期間の定め</td>
     <td><input type="text" name="" value="" tabindex="26"></td>
  </tr>  
  <tr>
    <td>雇用期間開始年月日</td>
     <td><input type="date" name="" value="" tabindex="27"></td>
  </tr>  
  <tr>
    <td>雇用期間終了年月日</td>
     <td><input type="date" name="" value="" tabindex="28"></td>
  </tr>  
  <tr>
    <td>学歴</td>
     <td><input type="text" name="" value="" tabindex="29"></td>
  </tr>  
  <tr>
    <td>必要な経験等</td>
     <td><input type="text" name="" value="" tabindex="30"></td>
  </tr>  
  <tr>
    <td>必要な免許・資格等</td>
     <td><input type="text" name="" value="" tabindex="31"></td>
  </tr>  
  <tr>
    <td>年齢制限・下限</td>
     <td><input type="number" name="" value="" tabindex="32"></td>
  </tr>  
  <tr>
    <td>年齢制限・上限</td>
     <td><input type="number" name="" value="" tabindex="33"></td>
  </tr>  
  <tr>
    <td>基本給下限</td>
     <td><input type="number" name="" value="" tabindex="34"></td>
  </tr>  
  <tr>
    <td>基本給上限</td>
     <td><input type="number" name="" value="" tabindex="35"></td>
  </tr>  
  <tr>
    <td>賃金形態コード</td>
     <td><input type="text" name="" value="" tabindex="36"></td>
  </tr>  
  <tr>
    <td>就業時間・始業</td>
     <td><input type="time" name="" value="" tabindex="37"></td>
  </tr>  
  <tr>
    <td>就業時間・終業</td>
     <td><input type="time" name="" value="" tabindex="38"></td>
  </tr>  
  <tr>
    <td>創業設立年</td>
     <td><input type="number" name="" value="" tabindex="39"></td>
  </tr>  
  <tr>
    <td>資本金</td>
     <td><input type="number" name="" value="" tabindex="40"></td>
  </tr>  
  <tr>
    <td>会社の特徴</td>
     <td>
      <textarea name="companyfeature" cols="50" rows="10" tabindex="41"></textarea></td>
  </tr>  
  <tr>
    <td>選考担当者課係名/役職名</td>
     <td><input type="text" name="" value="" tabindex="42"></td>
  </tr>  
  <tr>
    <td>選考担当者名（カナ）</td>
     <td><input type="text" name="" value="" tabindex="43"></td>
  </tr>  
  <tr>
    <td>選考担当者名</td>
     <td><input type="text" name="" value="" tabindex="44"></td>
  </tr>  
  <tr>
    <td>担当職業紹介者ID</td>
     <td><input type="text" name="" value="" tabindex="45"></td>
  </tr>
  <tr>
    <td>応募書類</td>
     <td>
      <textarea name="applicationform" cols="50" rows="10" tabindex="46"></textarea></td>
  </tr>
  <tr>
    <td>募集背景</td>
     <td>
      <textarea name="background" cols="50" rows="10" tabindex="47"></textarea></td>
  </tr>
  <tr>
    <td>性別（求職者に非公開）</td>
     <td><input type="text" name="" value="" tabindex="48"></td>
  </tr>
  <tr>
    <td>年齢下限（求職者に非公開）</td>
     <td><input type="number" name="" value="" tabindex="49"></td>
  </tr>
  <tr>
    <td>年齢上限（求職者に非公開）</td>
     <td><input type="number" name="" value="" tabindex="50"></td>
  </tr>
  <tr>
    <td>その他非公開情報</td>
     <td>
        <textarea name="hiddenetc" cols="50" rows="10" tabindex="51"></textarea></td>
  </tr>
  <tr>
    <td>新規登録日</td>
     <td><input type="text" name="" value="" tabindex="52"></td>
  </tr>
  <tr>
    <td>新規登録ユーザ</td>
     <td><input type="text" name="" value="" tabindex="53"></td>
  </tr>
  <tr>
    <td>最終更新日</td>
     <td><input type="text" name="" value="" tabindex="54"></td>
  </tr>
  <tr>
    <td>最終更新ユーザ</td>
     <td><input type="text" name="" value="" tabindex="55"></td>
  </tr>

</table>

<button class="main_b main_b_jobedit return" tabindex="56">戻る</button>
<button class="main_b main_b_jobedit regist" tabindex="57">登録</button>
<button class="main_b main_b_jobedit update" tabindex="58">更新</button>
<button class="main_b main_b_jobedit delete" tabindex="59">削除</button>

</main>

<footer>
  <small>Copyright(C) 2009有限責任事業組合 大阪職業教育協働機構(A'ワーク創造館)　All Rights Reserved.</small>
</footer>

</body>
</html>
