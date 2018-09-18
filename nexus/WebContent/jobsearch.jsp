<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html lang="ja">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="job_search.css" rel="stylesheet" type="text/css">
<title>求人検索項目</title>
</head>
<body>
<!--　求人検索項目 -->
<div id="job_search">
<h2>求人検索項目</h2>
  <form action="" method="post">
    <div class="listbox1">
      <h3>職種中分類</h3>
      <select name="jobsmallcd2" tabindex="1">
        <option value="1">研究者</option>
        <option value="2">農林水産技術者</option>
        <option value="07">開発技術者</option>
        <option value="08">製造技術者</option>
        <option value="09">建築・土木・測量技術者</option>
        <option value="10">情報処理・通信技術者</option>
      </select>
    </div>
    <div class="listbox1">
      <h3>職種小分類</h3>
      <select name="jobsmallcd3" tabindex="2">
        <option value="1">システムコンサルタント</option>
        <option value="2">システム設計技術者</option>
        <option value="103">情報処理プロジェクトマネージャ</option>
        <option value="104">ソフトウェア開発技術者</option>
        <option value="105">システム運用管理者</option>
        <option value="106">通信ネットワーク技術</option>
        <option value="109">その他の情報処理・通信技術者</option>
      </select>
    </div>
    <div class="listbox1">
      <h3>業種中分類</h3>
      <select name="joblargecd2" tabindex="3">
        <option value="0"></option>
        <option value="1">情報・広告業</option>
        <option value="2">他事業サービス</option>
      </select>
    </div>
    <div class="listbox1">
      <h3>業種小分類</h3>
      <select name="joblargecd3" tabindex="4">
        <option value="0"></option>
        <option value="1">情報サービス業</option>
        <option value="2">ニュース供給業</option>
        <option value="3">興信業</option>
        <option value="4">広告業</option>
      </select>
    </div>
    <div class="listbox1">
      <h3>勤務地</h3>
      <select name="" tabindex="7">
        <option value="0"></option>
        <option value="1">test1</option>
        <option value="2">test2</option>
      </select>
    </div>
    <div class="listbox1">
      <h3>雇用形態</h3>
      <select name="KOYOUKEITAICD" tabindex="7">
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
    <div class="listbox1">
      <h3>希望勤務時間</h3>
      <select name="" tabindex="8">
        <option value="1">test1</option>
        <option value="2">test2</option>
      </select>
    </div>
    <!--隠し項目（年齢など他）-->
    <input name="" type="hidden" value="" />
    <input name="" type="hidden" value="" />
    <!--ここまで隠し項目-->
    <div class="listbox2">
      <h3 class="word">求人詳細内をフリーワード検索</h3>
      <textarea class="word" name="textarea" cols="60" rows="5" placeholder="求人詳細項目より検索します。"></textarea>
    </div>
    <div class="listbox3">
      <input class="submit_button" name="" type="submit" value="検索" />
      <input class="reset_button" name="" type="reset" value="選択項目をすべてクリア" />
    </div>
  </form>
</div>
</body>
</html>