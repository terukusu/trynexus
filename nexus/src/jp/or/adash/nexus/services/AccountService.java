package jp.or.adash.nexus.services;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jp.or.adash.nexus.dao.AccountDao;
import jp.or.adash.nexus.dao.SaibanDao;
import jp.or.adash.nexus.entity.Staff;
import jp.or.adash.nexus.utils.common.DataCommons;
import jp.or.adash.nexus.utils.common.MessageCommons;
import jp.or.adash.nexus.utils.dao.Transaction;



/**
 * 商品に関する処理を定義するクラス
 * @author T.Kawasaki
 *
 */
public class AccountService {
	/**
	 *エラーメッセージを格納するリスト
	 */
	private String errMsg = null;
	/**
	 * トランザクションオブジェクト
	 */
	private Transaction transaction;

	/**
	 * 処理結果メッセージを格納するリスト
	 */
	private List<String> messages;

	/**
	 * コンストラクタ
	 */
	public AccountService() {
		transaction = new Transaction();
		messages = new ArrayList<String>();
	}
	/**
	 * 処理結果メッセージを取得する
	 * @return 処理結果メッセージ
	 */
	public List<String> getMessages() {
		return messages;
	}

	/**
	 * 登録完了メッセージ
	 */
	private static final String MSG_ACCOUNT_REGIST_COMPLETE = "アカウント登録が完了しました。";

	/**
	 * 登録失敗メッセージ
	 */
	private static final String MSG_ACCOUNT_REGIST_FAILURE = "アカウント登録に失敗しました。";





	/**
	 * アカウント情報を登録する
	 * @param item 商品データ
	 * @return 処理結果（true:成功、false:失敗）
	 */
	public boolean registAccount(Staff staff) {
		boolean result = false;

		try {
			// 0データベース接続を開始する
			transaction.open();

			// 0トランザクションを開始する
			transaction.beginTrans();

			/**
			 * 探番Daoからidを所得 Staffオブジェクトにsetする
			 */
			SaibanDao saibandao = new SaibanDao(transaction);
			int id = saibandao.getAccountId();
			staff.setId(id);


			/**
			 * アカウント情報を登録
			 */
			AccountDao accountdao = new AccountDao(transaction);
			int count = accountdao.insert(staff);
			//countが返ってくる
			if (count > 0) {
				// 完了メッセージをセットする
				messages.add(MSG_ACCOUNT_REGIST_COMPLETE);
				result = true;
			} else {
				// エラーメッセージをセットする
				messages.add(MSG_ACCOUNT_REGIST_FAILURE);
				result = false;
			}

			// トランザクションをコミットする
			transaction.commit();

		} catch(IOException e) {
			// トランザクションをロールバックする
			transaction.rollback();
			// エラーメッセージをセットする
			messages.add(MessageCommons.ERR_DB_CONNECT);
		} finally {
			// データベース接続をを終了する
			transaction.close();
		}


		return result;
	}

	/**
	 * アカウント情報の内容をチェックする
	 * @param staff アカウント情報
	 * @return 処理結果（true:成功、false:失敗）
	 */
	public boolean errorsCheck(Staff staff) {
		boolean result = true; // チェック結果

		//0名前空欄チェック
		if (staff.getName().equals("")) {
			messages.add("名前が入力されていません。");
			result = false;
		}
		// 0ふりがな空欄チェック
		if (staff.getKana().equals("")) {
			messages.add("ふりがなが入力されていません。");
			result = false;
		}
		// 0ひらがなチェック
		errMsg = DataCommons.chkHiragana(staff.getKana());
		if (errMsg != null) {
			messages.add(errMsg);
			result = false;
		}
		//0パスワード空欄チェック
		if (staff.getPassword().equals("")) {
			messages.add("パスワードが入力されていません。");
			result = false;
		}
		String pass = staff.getPassword();
		if(pass.length() <= 8) {
			messages.add("パスワードは８文字以上で入力してください。");
			result = false;
		}

		return result;
	}

}
