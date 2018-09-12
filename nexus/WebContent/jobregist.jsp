<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %><!DOCTYPE html>
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
  <div id="job_edit">
  <h2>求人登録</h2>
  <class="edit_table"></class>

  <div id="message">
      <td>メッセージを表示</td>
    </div>

<table border="1">
  <tr>
    <th>項目名</th>
    <th>内容</th>
  </tr>  <tr>
    <td>求人No.</td>
    <td><input type="text" name="no" value="<c:out value="${ kyujin.no }" />" tabindex="1"></td>
  </tr>
  <tr>
    <td>受付年月日</td>
     <td><input type="date" name="receptiondt" value="<c:out value="${ kyujin.receptiondt }" />" tabindex="2"></td>
  </tr>
  <tr>
    <td>求人有効年月日</td>
     <td><input type="date" name="perioddt" value="<c:out value="${ kyujin.perioddt }" />" tabindex="3"></td>
  </tr>
  <tr>
    <td>事業所番号</td>
     <td><input type="text" name="companyno" value="<c:out value="${ kyujin.companyno }" />" tabindex="4"></td>
  </tr>
  <tr>
    <td>就業場所コード</td>
    <td><input type="text" name="addresscd" value="<c:out value="${ kyujin.addresscd }" />" tabindex="5"></td>
  </tr>
  <tr>
  <tr>
     <td>職種細分類コード１</td>
     <td><input type="text" name="jobsmallcd１" value="<c:out value="${ kyujin.jobsmallcd１ }" />" tabindex=""></td>
   </tr>
   <tr>
    <td>職種細分類コード2</td>
     <td><input type="text" name="jobsmallcd２" value="<c:out value="${ kyujin.jobsmallcd２ }" />" tabindex=""></td>
  </tr>
  <tr>
    <td>職種細分類コード3</td>
     <td><input type="text" name="jobsmallcd３" value="<c:out value="${ kyujin.jobsmallcd３ }" />" tabindex=""></td>
  </tr>
  <tr>
    <td>職種大分類コード１</td>
     <td><input type="text" name="joblargecd１" value="<c:out value="${ kyujin.joblargecd１ }" />" tabindex=""></td>
  </tr>
  <tr>
    <td>職種大分類コード2</td>
     <td><input type="text" name="joblargecd２" value="<c:out value="${ kyujin.joblargecd２ }" />" tabindex=""></td>
  </tr>
  <tr>
    <td>職種大分類コード3</td>
     <td><input type="text" name="joblargecd３" value="<c:out value="${ kyujin.joblargecd３ }" />" tabindex=""></td>
  </tr>
  <tr>
    <td>産業細分類コード</td>
     <td><input type="text" name="jobcategorysmallcd" value="<c:out value="${ kyujin.jobcategorysmallcd }" />" tabindex=""></td>
  </tr>
  <tr>
    <td>産業大分類コード</td>
     <td><input type="text" name="jobcategorylargecd" value="<c:out value="${ kyujin.jobcategorylargecd }" />" tabindex=""></td>
  </tr>
  <tr>
    <td>産業分類名</td>
     <td><input type="text" name="jobcategory" value="<c:out value="${ kyujin.jobcategory }" />" tabindex=""></td>
  </tr>
  <tr>
    <td>事業所名（かな）</td>
     <td><input type="text" name="companykana" value="<c:out value="${ kyujin.companykana }" />" tabindex=""></td>
  </tr>
  <tr>
    <td>事業所名</td>
     <td><input type="text" name="companyname" value="<c:out value="${ kyujin.companyname }" />" tabindex=""></td>
  </tr>
  <tr>
    <td>事業所郵便番号</td>
     <td><input type="text" name="companypostal" value="<c:out value="${ kyujin.companypostal }" />" tabindex=""></td>
  </tr>
  <tr>
    <td>事業所所在地</td>
     <td><input type="text" name="companyplace" value="<c:out value="${ kyujin.companyplace }" />" tabindex=""></td>
  </tr>
  <tr>
    <td>事業所URL</td>
     <td><input type="text" name="companyurl" value="<c:out value="${ kyujin.companyurl }" />" tabindex=""></td>
  </tr>
  <tr>
    <td>就業場所郵便番号</td>
     <td><input type="text" name="postal" value="<c:out value="${ kyujin.postal }" />" tabindex=""></td>
  </tr>
  <tr>
    <td>就業場所</td>
     <td><input type="text" name="adress" value="<c:out value="${ kyujin.adress }" />" tabindex=""></td>
  </tr>
  <tr>
    <td>最寄り駅</td>
     <td><input type="text" name="nearstation" value="<c:out value="${ kyujin.nearstation }" />" tabindex=""></td>
  </tr>
  <tr>
    <td>職種</td>
     <td><input type="text" name="job" value="<c:out value="${ kyujin.job }" />" tabindex=""></td>
  </tr>
  <tr>
    <td>派遣/請負コード</td>
     <td><input type="text" name="hakencd" value="<c:out value="${ kyujin.hakencd }" />" tabindex=""></td>
  </tr>
  <tr>
    <td>仕事の内容</td>
     <td>
      <textarea name="detail" cols="80" rows="10" value="<c:out value="${ kyujin.detail }" />"  tabindex=""></textarea>
      </td>
  </tr>
  <tr>
    <td>雇用形態コード</td>
     <td><input type="text" name="koyoukeitaicd" value="<c:out value="${ kyujin.koyoukeitaicd }" />" tabindex="25"></td>
  </tr>
  <tr>
    <td>雇用期間の定め</td>
     <td><input type="text" name="koyoukikan" value="<c:out value="${ kyujin.koyoukikan }" />" tabindex="26"></td>
  </tr>
  <tr>
    <td>雇用期間開始年月日</td>
     <td><input type="date" name="koyoukikankaishi" value="<c:out value="${ kyujin.koyoukikankaishi }" />" tabindex=""></td>
  </tr>
  <tr>
    <td>雇用期間終了年月日</td>
     <td><input type="date" name="koyoukikanowari" value="<c:out value="${ kyujin.koyoukikanowari }" />" tabindex=""></td>
  </tr>
  <tr>
    <td>学歴</td>
     <td><input type="text" name="education" value="<c:out value="${ kyujin.education }" />" tabindex=""></td>
  </tr>
  <tr>
    <td>必要な経験等</td>
     <td><input type="text" name="experience" value="<c:out value="${ kyujin.experience }" />" tabindex=""></td>
  </tr>
  <tr>
    <td>必要な免許・資格等</td>
     <td><input type="text" name="license" value="<c:out value="${ kyujin.license }" />" tabindex=""></td>
  </tr>
  <tr>
    <td>年齢制限・下限</td>
     <td><input type="number" name="agemin" value="<c:out value="${ kyujin.agemin }" />" tabindex=""></td>
  </tr>
  <tr>
    <td>年齢制限・上限</td>
     <td><input type="number" name="agemax" value="<c:out value="${ kyujin.agemax }" />" tabindex=""></td>
  </tr>
  <tr>
    <td>基本給下限</td>
     <td><input type="number" name="salarymin" value="<c:out value="${ kyujin.salarymin }" />" tabindex=""></td>
  </tr>
  <tr>
    <td>基本給上限</td>
     <td><input type="number" name="salarymax" value="<c:out value="${ kyujin.salarymax }" />" tabindex=""></td>
  </tr>
  <tr>
    <td>賃金形態コード</td>
     <td><input type="text" name="salaryformcd" value="<c:out value="${ kyujin.salaryformcd }" />" tabindex=""></td>
  </tr>
  <tr>
    <td>就業時間・始業</td>
     <td><input type="time" name="begintime" value="<c:out value="${ kyujin.begintime }" />" tabindex=""></td>
  </tr>
  <tr>
    <td>就業時間・終業</td>
     <td><input type="time" name="endtime" value="<c:out value="${ kyujin.endtime }" />" tabindex=""></td>
  </tr>
  <tr>
    <td>創業設立年</td>
     <td><input type="number" name="establishdt" value="<c:out value="${ kyujin.establishdt }" />" tabindex=""></td>
  </tr>
  <tr>
    <td>資本金</td>
     <td><input type="number" name="capital" value="<c:out value="${ kyujin.capital }" />" tabindex=""></td>
  </tr>
  <tr>
    <td>会社の特徴</td>
     <td>
      <textarea name="companyfeature" cols="80" rows="10" value="<c:out value="${ kyujin.companyfeature }" />"  tabindex=""></textarea></td>
  </tr>
  <tr>
    <td>選考担当者課係名/役職名</td>
     <td><input type="text" name="tantouyakushoku" value="<c:out value="${ kyujin.tantouyakushoku }" />" tabindex=""></td>
  </tr>
  <tr>
    <td>選考担当者名（カナ）</td>
     <td><input type="text" name="tantoukana" value="<c:out value="${ kyujin.tantoukana }" />" tabindex=""></td>
  </tr>
  <tr>
    <td>選考担当者名</td>
     <td><input type="text" name="tantou" value="<c:out value="${ kyujin.tantou }" />" tabindex=""></td>
  </tr>
  <tr>
    <td>担当職業紹介者ID</td>
     <td><input type="text" name="tantoustaff_id" value="<c:out value="${ kyujin.tantoustaff_id }" />" tabindex=""></td>
  </tr>
  <tr>
    <td>応募書類</td>
     <td>
      <textarea name="applicationform" cols="80" rows="10" value="<c:out value="${ kyujin.applicationform }" />" tabindex=""></textarea></td>
  </tr>
  <tr>
    <td>募集背景</td>
     <td>
      <textarea name="background" cols="80" rows="10" tabindex="47" value="<c:out value="${ kyujin.background }" />"  tabindex=""></textarea></td>
  </tr>
  <tr>
    <td>性別（求職者に非公開）</td>
     <td><input type="text" name="hiddensex" value="<c:out value="${ kyujin.hiddensex }" />" tabindex=""></td>
  </tr>
  <tr>
    <td>年齢下限（求職者に非公開）</td>
     <td><input type="number" name="hiddenagemin" value="<c:out value="${ kyujin.hiddenagemin }" />" tabindex=""></td>
  </tr>
  <tr>
    <td>年齢上限（求職者に非公開）</td>
     <td><input type="number" name="hiddenagemax" value="<c:out value="${ kyujin.hiddenagemax }" />" tabindex=""></td>
  </tr>
  <tr>
    <td>その他非公開情報</td>
     <td>
        <textarea name="hiddenetc" cols="80" rows="10" value="<c:out value="${ kyujin.hiddenetc }" />"  tabindex=""></textarea></td>
  </tr>
  <tr>
    <td>新規登録日</td>
     <td><input type="date" name="createdt" value="<c:out value="${ kyujin.createdt }" />" tabindex=""></td>
  </tr>
  <tr>
    <td>新規登録ユーザ</td>
     <td><input type="text" name="createuserid" value="<c:out value="${ kyujin. }" />" tabindex=""></td>
  </tr>
  <tr>
    <td>最終更新日</td>
     <td><input type="date" name="updatedt" value="<c:out value="${ kyujin.updatedt }" />" tabindex=""></td>
  </tr>
  <tr>
    <td>最終更新ユーザ</td>
     <td><input type="text" name="updateuserid" value="<c:out value="${ kyujin.updateuserid }" />" tabindex=""></td>
  </tr>
  <tr>
    <td>削除フラグ</td>
     <td><input type="text" name="deleteflag" value="<c:out value="${ kyujin.deleteflag }" />" tabindex=""></td>
  </tr>
</table>

<button class="main_b main_b_jobedit return" tabindex="">戻る</button>
<button class="main_b main_b_jobedit regist" tabindex="">登録</button>
<button class="main_b main_b_jobedit update" tabindex="">更新</button>
<button class="main_b main_b_jobedit delete" tabindex="">削除</button>

</main>

<footer>
  <small>Copyright(C) 2009有限責任事業組合 大阪職業教育協働機構(A'ワーク創造館)　All Rights Reserved.</small>
</footer>

</body>
</html>
