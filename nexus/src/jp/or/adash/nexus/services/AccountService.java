package jp.or.adash.nexus.services;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jp.or.adash.nexus.dao.AccountDao;
import jp.or.adash.nexus.dao.SaibanDao;
import jp.or.adash.nexus.entity.Staff;
import jp.or.adash.nexus.utils.common.MessageCommons;
import jp.or.adash.nexus.utils.dao.Transaction;



/**
 * 商品に関する処理を定義するクラス
 * @author T.Kawasaki
 *
 */
public class AccountService {

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
			// データベース接続を開始する
			transaction.open();

			// トランザクションを開始する
			transaction.beginTrans();

			// 商品単価を取得する
			AccountDao accountdao = new AccountDao(transaction);
			SaibanDao saibandao = new SaibanDao(transaction);


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

}
