package jp.or.adash.nexus.kyujin.services;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jp.or.adash.nexus.entity.Todouhuken;
import jp.or.adash.nexus.kyujin.dao.TodouhukenDao;
import jp.or.adash.nexus.utils.common.MessageCommons;
import jp.or.adash.nexus.utils.dao.Transaction;

/**
 * 都道府県に関する処理を定義するクラス
 * @author aizawa
 *
 */
public class TodouhukenService {


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
	public TodouhukenService() {
		transaction = new Transaction();
		messages = new ArrayList<String>();
	}


	/**
	 * 都道府県リストを取得する
	 * @return 都道府県リスト
	 */
	public List<Todouhuken> getTodouhukenList() {
		List<Todouhuken> todouhukenList = new ArrayList<Todouhuken>();

		try {
			// データベース接続を開始する
			transaction.open();

			// 商品リストを取得する
			TodouhukenDao dao = new TodouhukenDao(transaction);
			todouhukenList = dao.selectTodouhukenList();

		} catch(IOException e) {
			// エラーメッセージをセットする
			messages.add(MessageCommons.ERR_DB_CONNECT);
		} finally {
			// データベース接続を終了する
			transaction.close();
		}

		return todouhukenList;
	}


}