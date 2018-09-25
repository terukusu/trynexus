/**
 *
 */
package jp.or.adash.nexus.services;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jp.or.adash.nexus.dao.JobCategoryDao;
import jp.or.adash.nexus.entity.JobCategory;
import jp.or.adash.nexus.utils.common.MessageCommons;
import jp.or.adash.nexus.utils.dao.Transaction;

/**
 * 業種に関する処理を定義するクラス
 * @author aizawa
 *
 */
public class JobCategoryService {

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
	public JobCategoryService() {
		transaction = new Transaction();
		messages = new ArrayList<String>();
	}

	/**
	 * 業種大分類リストを取得する
	 * @return 業種リスト
	 */
	public List<JobCategory> getLargeJobCategoryList() {
		List<JobCategory> LargeJobCategoryList = new ArrayList<JobCategory>();

		try {
			// データベース接続を開始する
			transaction.open();

			// 商品リストを取得する
			JobCategoryDao dao = new JobCategoryDao(transaction);
			LargeJobCategoryList = dao.selectLargeJobCategoryList();

		} catch (IOException e) {
			// エラーメッセージをセットする
			messages.add(MessageCommons.ERR_DB_CONNECT);
		} finally {
			// データベース接続を終了する
			transaction.close();
		}

		return LargeJobCategoryList;
	}
	/**
	 * 業種小分類リストを取得する
	 * @return 業種リスト
	 */
	public List<JobCategory> getSmallJobCategoryList() {
		List<JobCategory> SmallJobCategoryList = new ArrayList<JobCategory>();

		try {
			// データベース接続を開始する
			transaction.open();

			// 商品リストを取得する
			JobCategoryDao dao = new JobCategoryDao(transaction);
			SmallJobCategoryList = dao.selectSmallJobCategoryList();

		} catch (IOException e) {
			// エラーメッセージをセットする
			messages.add(MessageCommons.ERR_DB_CONNECT);
		} finally {
			// データベース接続を終了する
			transaction.close();
		}

		return SmallJobCategoryList;
	}

}
