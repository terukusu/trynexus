/**
 *
 */
package jp.or.adash.nexus.services;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jp.or.adash.nexus.dao.JobDao;
import jp.or.adash.nexus.entity.Job;
import jp.or.adash.nexus.utils.common.MessageCommons;
import jp.or.adash.nexus.utils.dao.Transaction;

/**
 * 職種に関する処理を定義するクラス
 * @author aizawa
 *
 */
public class JobService {

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
	public JobService() {
		transaction = new Transaction();
		messages = new ArrayList<String>();
	}

	/**
	 * 職種大分類リストを取得する
	 * @return 職種リスト
	 */
	public List<Job> getLargeJobList() {
		List<Job> LargeJobList = new ArrayList<Job>();

		try {
			// データベース接続を開始する
			transaction.open();

			// 商品リストを取得する
			JobDao dao = new JobDao(transaction);
			LargeJobList = dao.selectLargeJobList();

		} catch (IOException e) {
			// エラーメッセージをセットする
			messages.add(MessageCommons.ERR_DB_CONNECT);
		} finally {
			// データベース接続を終了する
			transaction.close();
		}

		return LargeJobList;
	}


	/**
	 * 職種小分類リストを取得する
	 * @return 職種リスト
	 */
	public List<Job> getSmallJobList() {
		List<Job> SmallJobList = new ArrayList<Job>();

		try {
			// データベース接続を開始する
			transaction.open();

			// 商品リストを取得する
			JobDao dao = new JobDao(transaction);
			SmallJobList = dao.selectSmallJobList();

		} catch (IOException e) {
			// エラーメッセージをセットする
			messages.add(MessageCommons.ERR_DB_CONNECT);
		} finally {
			// データベース接続を終了する
			transaction.close();
		}

		return SmallJobList;
	}

}
