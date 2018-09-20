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

<header>
  <section>
    <h1 class="logo"><a href="#">LOGO</a></h1>
    <nav>
      <ul class="mainnavi">
        <li><a href="#"><i class="fas fa-home"></i>検索</a></li>
        <li>
          <a href="#"><i class="fas fa-search"></i>登録&amp;閲覧</a>
          <ul class="drop-menu">
            <li><a href="#">求人情報<i class="fas fa-angle-right"></i></a></li>
            <li><a href="#">求職者情報<i class="fas fa-angle-right"></i></a></li>
            <li><a href="#">企業マスタ<i class="fas fa-angle-right"></i></a></li>
            <li><a href="#">マッチング履歴<i class="fas fa-angle-right"></i></a></li>
          </ul>
        </li>
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
<main>
<form id="form" method="post" action="">

  <div id="job_edit">
  <h2>求人登録</h2>
  </div>

  <div id="message">
      メッセージを表示
    </div>


    <table>
      <tr>
        <th>項目名</th>
        <th></th>
      </tr>
      <tr>
         <td>求人No.</td>
    <td><input type="text" name="no" value="<c:out value="${  kyujin.no }" />" tabindex=""></td>
  </tr>
  <tr>
    <td>受付年月日</td>
     <td>
     <input type="date" name="receptiondt" value="<c:out value="${ kyujin.receptiondt }" />" maxlength="" tabindex=""></td>
  </tr>
  <tr>
    <td>求人有効年月日</td>
     <td><input type="date" name="perioddt" value="<c:out value="${ kyujin.perioddt }" />" maxlength="" tabindex=""></td>
  </tr>
  <tr>
    <td>事業所番号</td>
     <td><input type="text" name="companyno" value="<c:out value="${ kyujin.companyno }" />" maxlength="13" tabindex=""></td>
  </tr>
<!-- コード類はc:でマスタからのリスト表示 -->
  <tr>
    <td>産業大分類コード</td>
     <td>

     <select name="jobcategorylargecd" tabindex="">
      	 <option>1</option>
     </select>

     <!-- input type="text" name="jobcategorylargecd" value="<c:out value="${ kyujin.jobcategorylargecd }" />" maxlength="1
     " tabindex=""-->
     </td>
  </tr>
  <tr>
    <td>産業細分類コード</td>
     <td>
     <select name="jobcategorysmallcd" tabindex="">
      	 <option>2</option>
      	 </select>
     <!--input type="text" name="jobcategorysmallcd" value="<c:out value="${ kyujin.jobcategorysmallcd }" />" maxlength="3" tabindex=""-->
     </td>
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
     <td><input type="text" name="companypostal" value="<c:out value="${ kyujin.companypostal }" />" maxlength="8" tabindex=""></td>
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
    <td>創業設立年</td>
     <td><input type="number" name="establishdt" value="<c:out value="${ kyujin.establishdt }" />" maxlength="4" tabindex="">年</td>
  </tr>
  <tr>
    <td>資本金</td>
     <td><input type="number" name="capital" value="<c:out value="${ kyujin.capital }" />" tabindex="">円</td>
  </tr>
  <tr>
    <td>会社の特徴</td>
     <td>
      <textarea name="companyfeature" value="<c:out value="${ kyujin.companyfeature }" />"  tabindex=""></textarea></td>
  </tr>
  <tr>
    <td>職種大分類コード１</td>
     <td>
     <select name="joblargecd1" tabindex="">
      	 <option>3</option>
  	 </select>

     <!--input type="text" name="joblargecd1" value="<c:out value="${ kyujin.joblargecd1 }" />" maxlength="1" tabindex=""-->
     </td>
  </tr>
  <tr>
     <td>職種細分類コード１</td>
     <td>
     <select name="jobsmallcd1" tabindex="">
      	 <option>4</option>
      	 </select>

  	 <!--input type="text" name="jobsmallcd1" value="<c:out value="${ kyujin.jobsmallcd1 }" />" maxlength="6" tabindex=""-->
  	 </td>
   </tr>
  <tr>
    <td>職種大分類コード2</td>
     <td>
     <select name="joblargecd2" tabindex="">
      	 <option>5</option>
      	 </select>

     <!-- input type="text" name="joblargecd2" value="<c:out value="${ kyujin.joblargecd2 }" />" maxlength="1" tabindex=""-->
     </td>
  </tr>
   <tr>
    <td>職種細分類コード2</td>
    <td>
     <select name="jobsmallcd2" tabindex="">
      	 <option>6</option>
      	 </select>
     <!-- input type="text" name="jobsmallcd2" value="<c:out value="${ kyujin.jobsmallcd2 }" />" maxlength="6" tabindex=""-->
     </td>
  </tr>
  <tr>
    <td>職種大分類コード3</td>
     <td>
     <select name="joblargecd3" tabindex="">
      	 <option>7</option>
      	 </select>
     <!--input type="text" name="joblargecd3" value="<c:out value="${ kyujin.joblargecd3 }" />" maxlength="1" tabindex=""-->
     </td>
  </tr>
  <tr>
    <td>職種細分類コード3</td>
     <td>
     <select name="jobsmallcd3" tabindex="">
      	 <option>8</option>
      	 </select>
     <!--input type="text" name="jobsmallcd3" value="<c:out value="${ kyujin.jobsmallcd3 }" />" maxlength="6" tabindex=""-->
     </td>
  </tr>
   <tr>
    <td>就業場所郵便番号</td>
     <td>
     <input type="text" name="postal" value="<c:out value="${ kyujin.postal }" />" maxlength="8" tabindex=""></td>
  </tr>
  <!--　メモ： リストで就業場所コードマスタを参照 -->
  <tr>
    <td>就業場所都道府県</td>
    <td>
     <select name="addresscd"  tabindex="">

	<option></option>
	<option value="1" <c:if test="${1 == kyujin.addresscd}">selected="selected"</c:if> />北海道</option>
	<option value="2" <c:if test="${2 == kyujin.addresscd}">selected="selected"</c:if> />青森県</option>
	<option value="3" <c:if test="${3 == kyujin.addresscd}">selected="selected"</c:if> />岩手県</option>
	<option value="4" <c:if test="${4 == kyujin.addresscd}">selected="selected"</c:if> />宮城県</option>
	<option value="5" <c:if test="${5 == kyujin.addresscd}">selected="selected"</c:if> />秋田県</option>
	<option value="6" <c:if test="${6 == kyujin.addresscd}">selected="selected"</c:if> />山形県</option>
	<option value="7" <c:if test="${7 == kyujin.addresscd}">selected="selected"</c:if> />福島県</option>
	<option value="8" <c:if test="${8 == kyujin.addresscd}">selected="selected"</c:if> />茨城県</option>
	<option value="9" <c:if test="${9 == kyujin.addresscd}">selected="selected"</c:if> />栃木県</option>
	<option value="10" <c:if test="${10 == kyujin.addresscd}">selected="selected"</c:if> />群馬県</option>
	<option value="11" <c:if test="${11 == kyujin.addresscd}">selected="selected"</c:if> />埼玉県</option>
	<option value="12" <c:if test="${12 == kyujin.addresscd}">selected="selected"</c:if> />千葉県</option>
	<option value="13" <c:if test="${13 == kyujin.addresscd}">selected="selected"</c:if> />東京都</option>
	<option value="14" <c:if test="${14 == kyujin.addresscd}">selected="selected"</c:if> />神奈川県</option>
	<option value="15" <c:if test="${15 == kyujin.addresscd}">selected="selected"</c:if> />新潟県</option>
	<option value="16" <c:if test="${16 == kyujin.addresscd}">selected="selected"</c:if> />富山県</option>
	<option value="17" <c:if test="${17 == kyujin.addresscd}">selected="selected"</c:if> />石川県</option>
	<option value="18" <c:if test="${18 == kyujin.addresscd}">selected="selected"</c:if> />福井県</option>
	<option value="19" <c:if test="${19 == kyujin.addresscd}">selected="selected"</c:if> />山梨県</option>
	<option value="20" <c:if test="${20 == kyujin.addresscd}">selected="selected"</c:if> />長野県</option>
	<option value="21" <c:if test="${21 == kyujin.addresscd}">selected="selected"</c:if> />岐阜県</option>
	<option value="22" <c:if test="${22 == kyujin.addresscd}">selected="selected"</c:if> />静岡県</option>
	<option value="23" <c:if test="${23 == kyujin.addresscd}">selected="selected"</c:if> />愛知県</option>
	<option value="24" <c:if test="${24 == kyujin.addresscd}">selected="selected"</c:if> />三重県</option>
	<option value="25" <c:if test="${25 == kyujin.addresscd}">selected="selected"</c:if> />滋賀県</option>
	<option value="26" <c:if test="${26 == kyujin.addresscd}">selected="selected"</c:if> />京都府</option>
	<option value="27" <c:if test="${27 == kyujin.addresscd}">selected="selected"</c:if> />大阪府</option>
	<option value="28" <c:if test="${28 == kyujin.addresscd}">selected="selected"</c:if> />兵庫県</option>
	<option value="29" <c:if test="${29 == kyujin.addresscd}">selected="selected"</c:if> />奈良県</option>
	<option value="30" <c:if test="${30 == kyujin.addresscd}">selected="selected"</c:if> />和歌山県</option>
	<option value="31" <c:if test="${31 == kyujin.addresscd}">selected="selected"</c:if> />鳥取県</option>
	<option value="32" <c:if test="${32 == kyujin.addresscd}">selected="selected"</c:if> />島根県</option>
	<option value="33" <c:if test="${33 == kyujin.addresscd}">selected="selected"</c:if> />岡山県</option>
	<option value="34" <c:if test="${34 == kyujin.addresscd}">selected="selected"</c:if> />広島県</option>
	<option value="35" <c:if test="${35 == kyujin.addresscd}">selected="selected"</c:if> />山口県</option>
	<option value="36" <c:if test="${36 == kyujin.addresscd}">selected="selected"</c:if> />徳島県</option>
	<option value="37" <c:if test="${37 == kyujin.addresscd}">selected="selected"</c:if> />香川県</option>
	<option value="38" <c:if test="${38 == kyujin.addresscd}">selected="selected"</c:if> />愛媛県</option>
	<option value="39" <c:if test="${39 == kyujin.addresscd}">selected="selected"</c:if> />高知県</option>
	<option value="40" <c:if test="${40 == kyujin.addresscd}">selected="selected"</c:if> />福岡県</option>
	<option value="41" <c:if test="${41 == kyujin.addresscd}">selected="selected"</c:if> />佐賀県</option>
	<option value="42" <c:if test="${42 == kyujin.addresscd}">selected="selected"</c:if> />長崎県</option>
	<option value="43" <c:if test="${43 == kyujin.addresscd}">selected="selected"</c:if> />熊本県</option>
	<option value="44" <c:if test="${44 == kyujin.addresscd}">selected="selected"</c:if> />大分県</option>
	<option value="45" <c:if test="${45 == kyujin.addresscd}">selected="selected"</c:if> />宮崎県</option>
	<option value="46" <c:if test="${46 == kyujin.addresscd}">selected="selected"</c:if> />鹿児島県</option>
	<option value="47" <c:if test="${47 == kyujin.addresscd}">selected="selected"</c:if> />沖縄県</option>

     </select>
    </td>
  </tr>
  <tr>
    <td>就業場所住所</td>
     <td><input type="text" name="address" value="<c:out value="${ kyujin.address }" />" tabindex=""></td>
  </tr>
  <tr>
    <td>就業場所最寄り駅</td>
     <td><input type="text" name="nearstation" value="<c:out value="${ kyujin.nearstation }" />" tabindex=""></td>
  </tr>
  <tr>
    <td>職種</td>
     <td><input type="text" name="job" value="<c:out value="${ kyujin.job }" />" tabindex=""></td>
  </tr>
  <tr>
    <td>派遣/請負</td>
    <td>

    <input type="radio" name="hakencd" value="1" <c:if test="${1 == kyujin.hakencd}">checked="checked"</c:if> tabindex="" /> 派遣
    <input type="radio" name="hakencd" value="2" <c:if test="${2 == kyujin.hakencd}">checked="checked"</c:if> tabindex="" /> 請負



  </tr>
  <tr>
    <td>仕事の内容</td>
     <td>
      <textarea name="detail" value="<c:out value="${ kyujin.detail }" />"  tabindex=""></textarea>
      </td>
  </tr>
  <tr>
    <td>雇用形態</td>
     <td>

 	 <select name="koyoukeitaicd" tabindex="">
 	 <option></option>
	<option value="1" <c:if test="${1 == kyujin.addresscd}">selected="selected"</c:if> />正社員</option>
	<option value="2" <c:if test="${2 == kyujin.addresscd}">selected="selected"</c:if> />正社員以外</option>
	<option value="3" <c:if test="${3 == kyujin.addresscd}">selected="selected"</c:if> />有期雇用派遣</option>
	<option value="4" <c:if test="${4 == kyujin.addresscd}">selected="selected"</c:if> />無期雇用派遣</option>
	<option value="5" <c:if test="${5 == kyujin.addresscd}">selected="selected"</c:if> />パート労働者</option>
	<option value="6" <c:if test="${6 == kyujin.addresscd}">selected="selected"</c:if> />有期派遣パート</option>
	<option value="7" <c:if test="${7 == kyujin.addresscd}">selected="selected"</c:if> />無期派遣パート</option>
     </select>

  </tr>
  <tr>
    <td>雇用期間の定め</td>
    <td>
    <input type="radio" name="koyoukikan" value="1" <c:if test="${1 == kyujin.koyoukikan}">checked="checked"</c:if>  tabindex="" /> 有り
    <input type="radio" name="koyoukikan" value="2" <c:if test="${2 == kyujin.koyoukikan}">checked="checked"</c:if>  tabindex="" /> 無し

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
     <td><input type="number" name="agemin" value="<c:out value="${ kyujin.agemin }" />" maxlength="3" tabindex="">歳</td>
  </tr>
  <tr>
    <td>年齢制限・上限</td>
     <td><input type="number" name="agemax" value="<c:out value="${ kyujin.agemax }" />" maxlength="3" tabindex="">歳</td>
  </tr>
  <tr>
    <td>基本給下限</td>
     <td><input type="number" name="salarymin" value="<c:out value="${ kyujin.salarymin }" />" tabindex="">円</td>
  </tr>
  <tr>
    <td>基本給上限</td>
     <td><input type="number" name="salarymax" value="<c:out value="${ kyujin.salarymax }" />" tabindex="">円</td>
  </tr>
  <tr>
    <td>賃金形態</td>
     <td>

        <input type="radio" name="salaryformcd" value="1" <c:if test="${1 == kyujin.salaryformcd}">checked="checked</c:if>  tabindex="" /> 月給
        <input type="radio" name="salaryformcd" value="3" <c:if test="${3 == kyujin.salaryformcd}">checked="checked"</c:if>  tabindex="" /> 日給
        <input type="radio" name="salaryformcd" value="4" <c:if test="${4 == kyujin.salaryformcd}">checked="checked"</c:if>  tabindex="" /> 時間給
        <input type="radio" name="salaryformcd" value="5" <c:if test="${5 == kyujin.salaryformcd}">checked="checked"</c:if>  tabindex="" /> 年棒
        <input type="radio" name="salaryformcd" value="6" <c:if test="${6 == kyujin.salaryformcd}">checked="checked"</c:if>  tabindex="" /> その他

   </tr>
  <tr>
    <td>就業時間・始業</td>
     <td><input type="text" name="begintime" value="<c:out value="${ kyujin.begintime }" />" maxlength="4" tabindex=""></td>
  </tr>
  <tr>
    <td>就業時間・終業</td>
     <td><input type="text" name="endtime" value="<c:out value="${ kyujin.endtime }" />" maxlength="4" tabindex=""></td>
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
      <textarea name="applicationform" value="<c:out value="${ kyujin.applicationform }" />" tabindex=""></textarea></td>
  </tr>
  <tr>
    <td>募集背景</td>
     <td>
      <textarea name="background" value="<c:out value="${ kyujin.background }" />"  tabindex=""></textarea></td>
  </tr>
  <tr>
    <td>性別（求職者に非公開）</td>
     <td>

    <input type="radio" name="hiddensex" value="1" <c:if test="${1 == kyujin.hiddensex}">checked="checked"</c:if>  tabindex="" /> 男
    <input type="radio" name="hiddensex" value="2" <c:if test="${2 == kyujin.hiddensex}">checked="checked"</c:if>  tabindex="" /> 女
   </td>
  </tr>
  <tr>
    <td>年齢下限（求職者に非公開）</td>
     <td><input type="number" name="hiddenagemin" value="<c:out value="${ kyujin.hiddenagemin }" />" maxlength="3" tabindex="">歳</td>
  </tr>
  <tr>
    <td>年齢上限（求職者に非公開）</td>
     <td><input type="number" name="hiddenagemax" value="<c:out value="${ kyujin.hiddenagemax }" />" maxlength="3" tabindex="">歳</td>
  </tr>
  <tr>
    <td>その他非公開情報</td>
     <td>
        <textarea name="hiddenetc" value="<c:out value="${ kyujin.hiddenetc }" />"  tabindex=""></textarea></td>
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
<button type="button" class="main-b" tabindex="" onClick="window.CloseWindow();">戻る</button>

<c:if test="${ kyujin.no == null }">
	<button type="submit" id="KyujinInsertServlet" class="main-b" tabindex="" onclick="MovePages(this)">登録</button>
</c:if>
<c:if test="${ kyujin.no != null }">
	<button type="submit" id="KyujinUpdateServlet"  class="main-b" tabindex="" onclick="MovePages(this)">更新</button>
	<button type="submit" id="KyujinDeleteServlet" class="main-b" tabindex="" onclick="MovePages(this)">削除</button>
</c:if>

</form>
</main>
<footer>
  <small>Copyright(C) 2009有限責任事業組合 大阪職業教育協働機構(A'ワーク創造館)　All Rights Reserved.</small>
</footer>
<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<script type="text/javascript" src="js/jobregist.js"></script>
</body>
</html>
