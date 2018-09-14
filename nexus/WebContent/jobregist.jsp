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


<form id="form" method="post" action="./regist">

  <div id="job_edit">
  <h2>求人登録</h2>
  </div>

  <div id="message">
      メッセージを表示
    </div>

<table border="1">
  <tr>
    <th>項目名</th>
    <th>内容</th>
  </tr>
  <tr>
    <td>求人No.</td>
    <td><input type="text" name="receptiondt" value="<c:out value="${ kyujin.no }" />"></td>
  </tr>
  <tr>
    <td>受付年月日</td>
     <td><input type="date" name="receptiondt" value="<c:out value="${ kyujin.receptiondt }" />" maxlength="" tabindex=""></td>
  </tr>
  <tr>
    <td>求人有効年月日</td>
     <td><input type="date" name="perioddt" value="<c:out value="${ kyujin.perioddt }" />" maxlength="" tabindex=""></td>
  </tr>
  <tr>
    <td>事業所番号</td>
     <td><input type="text" name="companyno" value="<c:out value="${ kyujin.companyno }" />" maxlength="13" tabindex=""></td>
  </tr>
  <tr>
    <td>就業場所コード</td>
    <td><input type="text" name="addresscd" value="<c:out value="${ kyujin.addresscd }" />" maxlength="2" tabindex=""></td>
  </tr>
  <tr>
     <td>職種細分類コード１</td>
     <td><input type="text" name="jobsmallcd1" value="<c:out value="${ kyujin.jobsmallcd1 }" />" maxlength="6" tabindex=""></td>
   </tr>
   <tr>
    <td>職種細分類コード2</td>
     <td><input type="text" name="jobsmallcd2" value="<c:out value="${ kyujin.jobsmallcd2 }" />" maxlength="6" tabindex=""></td>
  </tr>
  <tr>
    <td>職種細分類コード3</td>
     <td><input type="text" name="jobsmallcd3" value="<c:out value="${ kyujin.jobsmallcd3 }" />" maxlength="6" tabindex=""></td>
  </tr>
  <tr>
    <td>職種大分類コード１</td>
     <td><input type="text" name="joblargecd1" value="<c:out value="${ kyujin.joblargecd1 }" />" maxlength="1" tabindex=""></td>
  </tr>
  <tr>
    <td>職種大分類コード2</td>
     <td><input type="text" name="joblargecd2" value="<c:out value="${ kyujin.joblargecd2 }" />" maxlength="1" tabindex=""></td>
  </tr>
  <tr>
    <td>職種大分類コード3</td>
     <td><input type="text" name="joblargecd3" value="<c:out value="${ kyujin.joblargecd3 }" />" maxlength="1" tabindex=""></td>
  </tr>
  <tr>
    <td>産業細分類コード</td>
     <td><input type="text" name="jobcategorysmallcd" value="<c:out value="${ kyujin.jobcategorysmallcd }" />" maxlength="3" tabindex=""></td>
  </tr>
  <tr>
    <td>産業大分類コード</td>
     <td><input type="text" name="jobcategorylargecd" value="<c:out value="${ kyujin.jobcategorylargecd }" />" maxlength="1
     " tabindex=""></td>
  </tr>
  <tr>
    <td>産業分類名</td>
     <td><input type="text" name="jobcategory" value="<c:out value="${ kyujin.jobcategory }" />" tabindex=""></td>
  </tr>
  <tr>
    <td>事業所名（かな）</td>
     <td><input type="text" name="companykana" value="<c:out value="${ kyujin.companykana }" />" size="60" tabindex=""></td>
  </tr>
  <tr>
    <td>事業所名</td>
     <td><input type="text" name="companyname" value="<c:out value="${ kyujin.companyname }" />" size="60" tabindex=""></td>
  </tr>
  <tr>
    <td>事業所郵便番号</td>
     <td><input type="text" name="companypostal" value="<c:out value="${ kyujin.companypostal }" />" maxlength="8" tabindex=""></td>
  </tr>
  <tr>
    <td>事業所所在地</td>
     <td><input type="text" name="companyplace" value="<c:out value="${ kyujin.companyplace }" />" size="100" tabindex=""></td>
  </tr>
  <tr>
    <td>事業所URL</td>
     <td><input type="text" name="companyurl" value="<c:out value="${ kyujin.companyurl }" />" size="60" tabindex=""></td>
  </tr>
  <tr>
    <td>就業場所郵便番号</td>
     <td><input type="text" name="postal" value="<c:out value="${ kyujin.postal }" />" maxlength="8" tabindex=""></td>
  </tr>
  <tr>
    <td>就業場所</td>
     <td><input type="text" name="adress" value="<c:out value="${ kyujin.adress }" />" size="100" tabindex=""></td>
  </tr>
  <tr>
    <td>最寄り駅</td>
     <td><input type="text" name="nearstation" value="<c:out value="${ kyujin.nearstation }" />" size="60" tabindex=""></td>
  </tr>
  <tr>
    <td>職種</td>
     <td><input type="text" name="job" value="<c:out value="${ kyujin.job }" />" tabindex=""></td>
  </tr>
  <tr>
    <td>派遣/請負コード</td>
    <td>
    <c:if test="${1 == kyujin.hakencd}">
    <input type="radio" name="hakencd" value="1" checked="checked"/> 派遣
    </c:if>
    <c:if test="${2 == kyujin.hakencd}">
    <input type="radio" name="hakencd" value="2" checked="checked"/> 請負
    </c:if>
    <c:if test="${1 != kyujin.hakencd && 2 != kyujin.hakencd}">
    <input type="radio" name="hakencd" value="1"/> 派遣
    <input type="radio" name="hakencd" value="2"/> 請負
    </c:if>

    <!--input type="text" name="hakencd" value="<c:out value="${ kyujin.hakencd }" />" tabindex=""--></td>
  </tr>
  <tr>
    <td>仕事の内容</td>
     <td>
      <textarea name="detail" cols="80" rows="10" value="<c:out value="${ kyujin.detail }" />"  tabindex=""></textarea>
      </td>
  </tr>
  <tr>
    <td>雇用形態コード</td>
     <td>
 	 <!-- JSで設定する  -->
 	 <select name="koyoukeitaicd">
          <option value=""></option>
          <option value="1">正社員</option>
          <option value="2">正社員以外</option>
          <option value="3">有期雇用派遣</option>
          <option value="4">無期雇用派遣</option>
          <option value="5">パート労働者</option>
          <option value="6">有期派遣パート</option>
          <option value="7">無期派遣パート</option>
     </select>

    <!-- input type="text" name="koyoukeitaicd" value="<c:out value="${ kyujin.koyoukeitaicd }" />" tabindex=""--></td>
  </tr>
  <tr>
    <td>雇用期間の定め</td>
    <td><c:if test="${1 == kyujin.koyoukikan}">
    <input type="radio" name="koyoukikan" value="1" checked="checked"/> 有り
    </c:if>
    <c:if test="${2 == kyujin.koyoukikan}">
    <input type="radio" name="koyoukikan" value="2" checked="checked"/> 無し
    </c:if>
    <c:if test="${1 != kyujin.koyoukikan && 2 != kyujin.koyoukikan}">
    <input type="radio" name="koyoukikan" value="1"/> 有り
    <input type="radio" name="koyoukikan" value="2"/> 無し
    </c:if>
	<!--input type="text" name="koyoukikan" value="<c:out value="${ kyujin.koyoukikan }" />" tabindex=""-->
	</td>
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
     <td><input type="text" name="education" value="<c:out value="${ kyujin.education }" />" size="60" tabindex=""></td>
  </tr>
  <tr>
    <td>必要な経験等</td>
     <td><input type="text" name="experience" value="<c:out value="${ kyujin.experience }" />" size="60" tabindex=""></td>
  </tr>
  <tr>
    <td>必要な免許・資格等</td>
     <td><input type="text" name="license" value="<c:out value="${ kyujin.license }" />" size="60" tabindex=""></td>
  </tr>
  <tr>
    <td>年齢制限・下限</td>
     <td><input type="number" name="agemin" value="<c:out value="${ kyujin.agemin }" />" maxlength="3" tabindex=""></td>
  </tr>
  <tr>
    <td>年齢制限・上限</td>
     <td><input type="number" name="agemax" value="<c:out value="${ kyujin.agemax }" />" maxlength="3" tabindex=""></td>
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
     <td>
     <c:if test="${1 == kyujin.salaryformcd}">
        <input type="radio" name="salaryformcd" value="1" checked="checked"/> 月給
        </c:if>
        <c:if test="${3 == kyujin.salaryformcd}">
        <input type="radio" name="salaryformcd" value="3" checked="checked"/> 日給
        </c:if>
        <c:if test="${4 == kyujin.salaryformcd}">
        <input type="radio" name="salaryformcd" value="4" checked="checked"/> 時間給
        </c:if>
        <c:if test="${5 == kyujin.salaryformcd}">
        <input type="radio" name="salaryformcd" value="5" checked="checked"/> 年棒
        </c:if>
        <c:if test="${6 == kyujin.salaryformcd}">
        <input type="radio" name="salaryformcd" value="6" checked="checked"/> その他
        </c:if>

        <c:if test="${ null == kyujin.salaryformcd}">
        <input type="radio" name="salaryformcd" value="1"/> 月給
        <input type="radio" name="salaryformcd" value="3"/> 日給
        <input type="radio" name="salaryformcd" value="4"/> 時間給
        <input type="radio" name="salaryformcd" value="5"/> 年俸
        <input type="radio" name="salaryformcd" value="6"/> その他
        </c:if>
       <!--input type="text" name="salaryformcd" value="<c:out value="${ kyujin.salaryformcd }" />" maxlength="1" tabindex=""--></td>
  </tr>
  <tr>
    <td>就業時間・始業</td>
     <td><input type="time" name="begintime" value="<c:out value="${ kyujin.begintime }" />" maxlength="4" tabindex=""></td>
  </tr>
  <tr>
    <td>就業時間・終業</td>
     <td><input type="time" name="endtime" value="<c:out value="${ kyujin.endtime }" />" maxlength="4" tabindex=""></td>
  </tr>
  <tr>
    <td>創業設立年</td>
     <td><input type="number" name="establishdt" value="<c:out value="${ kyujin.establishdt }" />" maxlength="4" tabindex=""></td>
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
     <td>
     <c:if test="${1 == kyujin.hiddensex}">
    <input type="radio" name="hiddensex" value="1" checked="checked"/> 男
    </c:if>
    <c:if test="${2 == kyujin.hiddensex}">
    <input type="radio" name="hiddensex" value="2" checked="checked"/> 女
    </c:if>
    <c:if test="${1 != kyujin.hiddensex && 2 != kyujin.hiddensex}">
    <input type="radio" name="hiddensex" value="1"/> 男
    <input type="radio" name="hiddensex" value="2"/> 女
    </c:if>
    <!--      <input type="text" name="hiddensex" value="<c:out value="${ kyujin.hiddensex }" />" maxlength="1" tabindex=""> -->
    </td>
  </tr>
  <tr>
    <td>年齢下限（求職者に非公開）</td>
     <td><input type="number" name="hiddenagemin" value="<c:out value="${ kyujin.hiddenagemin }" />" maxlength="3" tabindex=""></td>
  </tr>
  <tr>
    <td>年齢上限（求職者に非公開）</td>
     <td><input type="number" name="hiddenagemax" value="<c:out value="${ kyujin.hiddenagemax }" />" maxlength="3" tabindex=""></td>
  </tr>
  <tr>
    <td>その他非公開情報</td>
     <td>
        <textarea name="hiddenetc" cols="80" rows="10" value="<c:out value="${ kyujin.hiddenetc }" />"  tabindex=""></textarea></td>
  </tr>
  <tr>
    <td>新規登録日</td>
     <td><c:out value="${ kyujin.createdt }" /></td>
  </tr>
  <tr>
    <td>新規登録ユーザ</td>
     <td><c:out value="${ kyujin.createuserid }" />
  <tr>
    <td>最終更新日</td>
     <td><c:out value="${ kyujin.updatedt }" /></td>
  </tr>
  <tr>
    <td>最終更新ユーザ</td>
     <td><c:out value="${ kyujin.updateuserid }" /></td>
  </tr>

</table>
<!-- jsでウィンドウクローズにする -->
<button type="button" class="main_b main_b_jobedit return" tabindex="" onClick="window.CloseWindow();">戻る</button>

<c:if test="${ kyujin.no == null }">
	<button type="submit" id="regist" class="main_b main_b_jobedit regist" tabindex="">登録</button>
</c:if>
<c:if test="${ kyujin.no != null }">
	<button type="submit" id="update"  class="main_b main_b_jobedit update" tabindex="">更新</button>
	<button type="submit" id="delete" class="main_b main_b_jobedit delete" tabindex="">削除</button>
</c:if>
</form>

<footer>
  <small>Copyright(C) 2009有限責任事業組合 大阪職業教育協働機構(A'ワーク創造館)　All Rights Reserved.</small>
</footer>
<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>

<script type="text/javascript" src="js/jobregist.js"></script>
</body>
</html>
