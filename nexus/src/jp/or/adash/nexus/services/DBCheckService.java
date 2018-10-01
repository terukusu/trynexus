package jp.or.adash.nexus.services;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jp.or.adash.nexus.dao.DBCheckDao;
import jp.or.adash.nexus.utils.common.MessageCommons;
import jp.or.adash.nexus.utils.dao.Transaction;

/**
 * データベースへデータがあるか確認する処理を定義するクラス
 * @author pgjavaAT
 */
public class DBCheckService {

	String errMsg = null;

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
	public DBCheckService() {
		transaction = new Transaction();
		messages = new ArrayList<String>();
	}

	/**
	 * noから該当する求人があるか確認する
	 * @param no
	 * @return
	 */
	public boolean checkKyujin(String no) {
		boolean result = false;

		try {
			// 1データベース接続を開始する
			transaction.open();

			// 1トランザクションを開始する
			transaction.beginTrans();

			// 1商品単価を取得する
			DBCheckDao dao = new DBCheckDao(transaction);
			result = dao.selectKyujinno(no);

			if(!result) {
				messages.add(MessageCommons.MSG_KYUJIN_FAILURE);
			}
			//1 トランザクションをコミットする
			transaction.commit();

		} catch (IOException e) {
			// 1トランザクションをロールバックする
			transaction.rollback();

			// 1エラーメッセージをセットする
			messages.add(MessageCommons.ERR_DB_CONNECT);
		} finally {
			//1 データベース接続をを終了する
			transaction.close();
		}

		return result;
	}

	/**
	 * idから該当する求職者があることを確認する
	 * @param id
	 * @return
	 */
	public boolean checkJobseeker(String id) {
		boolean result = false;

		try {
			// 1データベース接続を開始する
			transaction.open();

			// 1トランザクションを開始する
			transaction.beginTrans();

			// 1商品単価を取得する
			DBCheckDao dao = new DBCheckDao(transaction);
			result = dao.selectJobseeker(id);

			if(result == false){
				messages.add(MessageCommons.MSG_JOBSEEKER_FAILURE);
			}
			//1 トランザクションをコミットする
			transaction.commit();

		} catch (IOException e) {
			// 1トランザクションをロールバックする
			transaction.rollback();

			// 1エラーメッセージをセットする
			messages.add(MessageCommons.ERR_DB_CONNECT);
		} finally {
			//1 データベース接続をを終了する
			transaction.close();
		}

		return result;
	}
	/**
	 * 処理結果メッセージを取得する
	 * @return 処理結果メッセージ
	 */
	public List<String> getMessages() {
		return messages;
	}
}
