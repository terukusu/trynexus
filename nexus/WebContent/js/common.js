// カレンダー
$(function() {
	  $('.datepicker').datepicker({
	      dateFormat: 'yy-mm-dd',
	  });
  });

// 削除確認
function kakunin(){
	 if(!confirm("アカウントを削除します。本当によろしいですか？")){
		 return false;
	 }

	  /*if (ret == true){
	    location.href = "/nexus/web/account-delete?id='1234'";
	  }*/
	}
/**
*
*/
//ウィンドウをクローズする
function CloseWindow(){
	window.open('about:blank','_self').close();
}

//IDを取得してそれを元にURL遷移
function MovePages(ele){
	var page_id = ele.id;
	var loc = location.pathname;
	var url = loc.substring(0, loc.lastIndexOf('/')) + '/';
	console.log(url);
	$("#form").attr("action",url + page_id );
}

$(function(){
window.location.hash="no-back";
window.location.hash="no-back-button";
window.onhashchange=function(){
    window.location.hash="no-back";
}
});