package Service;

import jp.or.adash.nexus.utils.dao.Transaction;

/**
 * ログイン処理に関する処理を定義するクラス
 * @author H.Tomonari
 */

public class LoginService {
	/**
	 * フィールド
	 * @param user　ユーザーID
	 * @param pass パスワード
	 */
	 	private final String user;
	    private final String pass;
	 	/**
		 * コンストラクタ
		 * @param user　ユーザーID
		 * @param pass パスワード
		 */
	    public LoginService(String user,String pass){
	        this.user=user;
	        this.pass=pass;
	    }
	    /**
		 * @return user
		 */
		public String getUser() {
			return user;
		}
		/**
		 * @return pass
		 */
		public String getPass() {
			return pass;
		}

	//0トランザクションオブジェクト
	private Transaction transaction;

	//0　ID,PASSが合致していればtrueを返す。
	public boolean authUser(String user, String pass) {
		if (user.equals("Dao.getid") &&
				pass.equals("Dao.getpass")) {
			return true;
		}
		return false;
	}
	//0IDを元にユーザー情報を取得する
	/*public String getUserData(String user,String pass,String name) {
		String userData = null;
		try {
			transaction = new Transaction();
			//0データベース接続を開始する
			transaction.open();

			//0ユーザー情報を取得する
			StaffLoginDao dao = new StaffLoginDao();
			userData = dao.getLogin();
		} catch (IOException e) {
			//0エラー処理を行う
		} finally {
			//0データベース接続をを終了する
			transaction.close();
		}
		return userData;
	}*/
}
