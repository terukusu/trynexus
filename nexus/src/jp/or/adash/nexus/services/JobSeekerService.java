package jp.or.adash.nexus.services;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jp.or.adash.nexus.entity.JobSeeker;
import jp.or.adash.nexus.entity.Jobseeker_simple_entity;
import jp.or.adash.nexus.utils.common.MessageCommons;
import jp.or.adash.nexus.utils.dao.JobSeekerDao;
import jp.or.adash.nexus.utils.dao.JobSeeker_dao;
import jp.or.adash.nexus.utils.dao.Transaction;




public class JobSeekerService {
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
	public JobSeekerService() {
		transaction = new Transaction();
		messages = new ArrayList<String>();
	}
	/**
	 * 求職者idを元に絞込み、求職者情報を取得する
	 * @param id 求職者id
	 * @return idで絞り込んだ求職者情報
	 */
	public Jobseeker_simple_entity getJobseeker(int js_id) {
		Jobseeker_simple_entity jobseeker = null;

		try {
			// データベース接続を開始する
			transaction.open();

			// 商品単価を取得する
			JobSeeker_dao dao = new JobSeeker_dao(transaction);
			jobseeker = dao.selectItem(js_id);

		} catch(IOException e) {
			// エラーメッセージをセットする
		} finally {
			// データベース接続をを終了する
			transaction.close();
		}

		return jobseeker;
	}

	/**
	 * 求職者情報一覧を取得する
	 * @return 商品リスト
	 */
public List<Jobseeker_simple_entity> getJobSeekerList(){
	List<Jobseeker_simple_entity> jobseekerList = new ArrayList<Jobseeker_simple_entity>();
	try {
		// データベース接続を開始する
		transaction.open();

		// 商品リストを取得する
		JobSeeker_dao dao = new JobSeeker_dao(transaction);
		jobseekerList = dao.selectJobseekerList();

	} catch(IOException e) {
		// エラーメッセージをセットする
		messages.add(MessageCommons.ERR_DB_CONNECT);
	} finally {
		// データベース接続を終了する
		transaction.close();
	}

	return jobseekerList;
	}

	/**
	 * 求職者IDを元に、求職者情報を取得する
	 * @param id 求職者ID
	 * @return 求職者情報
	 */
	public JobSeeker getJobSeeker(String id) {
		JobSeeker seeker = null;

		try {
			// データベース接続を開始する
			transaction.open();

			// 商品単価を取得する
			JobSeekerDao dao = new JobSeekerDao(transaction);
			seeker = dao.selectJobSeeker(id);

		} catch(IOException e) {
			// エラーメッセージをセットする
		} finally {
			// データベース接続をを終了する
			transaction.close();
		}

		return seeker;
	}



	/**
	 * 商品データの内容をチェックする
	 * @param item 商品データ
	 * @return 処理結果（true:成功、false:失敗）
	 */
	public boolean check(JobSeeker seeker) {
		boolean result = true;		// チェック結果

		// 商品コードの値が正しいか
		if (seeker.getId() == null) {
			messages.add("IDが入力されていません。");
			result = false;
		}
/*
		// 商品名の長さが適切か
		DataCommons commons = new DataCommons();
		int length = commons.getBytes(item.getItemName());
		if (length <= 0 || length >= 100) {
			messages.add("商品名の文字数が多すぎます。");
			result = false;
		}

		// 単価の値が正しいか
		if (item.getUnitPrice() <= 0) {
			messages.add("単価は1円以上で入力してください。");
			result = false;
		}
*/
		return result;

	}
	/**
	 * 求職者情報を登録する
	 * @param item 商品データ
	 * @return 処理結果（true:成功、false:失敗）
	 */
	public boolean registItem(JobSeeker seeker) {
		boolean result = false;
		result = this.insertJobSeeker(seeker);

/*
		// データベースに商品が既に存在するかどうか確認する
		if (exists(seeker.getId())) {
			// 存在する場合は、商品データを更新する
			result = this.updateItem(seeker);
		} else {
			// 存在しなければ、商品データを登録する
			result = this.insertItem(seeker);
		}
*/
		return result;
	}

	/**
	 * 求職者情報をデータベースに登録する
	 * @param seeker 求職者情報
	 * @return 処理結果（true:成功、false:失敗）
	 */
	public boolean insertJobSeeker(JobSeeker seeker) {
		boolean result = false;		// 処理結果

		try {
			// データベース接続を開始する
			transaction.open();

			// トランザクションを開始する
			transaction.beginTrans();

			// 商品単価を取得する
			JobSeekerDao dao = new JobSeekerDao(transaction);
			int count = dao.insert(seeker);

			if (count > 0) {
				// 完了メッセージをセットする
				messages.add("登録完了");
				result = true;
			} else {
				// エラーメッセージをセットする
				messages.add("登録失敗");
				result = false;
			}

			// トランザクションをコミットする
			transaction.commit();

		} catch(IOException e) {
			// トランザクションをロールバックする
			transaction.rollback();

			// エラーメッセージをセットする
			messages.add("データベースアクセスに失敗しました。");
		} finally {
			// データベース接続をを終了する
			transaction.close();
		}

		return result;
	}


	/**
	 * 求職者情報を更新する
	 * @param seeker 求職者情報
	 * @return 処理結果（true:成功、false:失敗）
	 */
	public boolean updateJobSeeker(JobSeeker seeker) {
		boolean result = false;	// 処理結果

		try {
			// データベース接続を開始する
			transaction.open();

			// トランザクションを開始する
			transaction.beginTrans();

			// 商品単価を取得する
			JobSeekerDao dao = new JobSeekerDao(transaction);
			int count = dao.update(seeker);

			if (count > 0) {
				// 完了メッセージをセットする
				messages.add("編集が完了しました。");
				result = true;
			} else {
				// エラーメッセージをセットする
				messages.add("編集に失敗しました。");
			}

			// トランザクションをコミットする
			transaction.commit();

		} catch(IOException e) {
			// トランザクションをロールバックする
			transaction.rollback();

			// エラーメッセージをセットする
			messages.add("データベースアクセスに失敗しました。");
		} finally {
			// データベース接続をを終了する
			transaction.close();
		}

		return result;
	}
	/**
	 * 求職者情報がデータベースに既に存在するかどうかを確認する
	 * @param code 商品コード
	 * @return true:存在する、false:存在しない
	 */
	/*
	private boolean exists(int id) {
		boolean result = false;		// 確認結果

		// コードをキーにして、データベースを検索する
		int price = this.getId(id);

		// データが存在する場合、true	を返す
		if (price > 0) {
			result = true;
		}

		return result;
	}*/

	/**
	 * 処理結果メッセージを取得する
	 * @return 処理結果メッセージ
	 */

	public List<String> getMessages() {
		return messages;
	}
/*
	public JobSeeker getJobSeeker(int id) {
		JobSeeker seeker = null;

		try {
			// データベース接続を開始する
			transaction.open();

			// 商品単価を取得する
			JobSeekerDao dao = new JobSeeker(transaction);
			seeker = dao.selectJobSeeker(id);

		} catch(IOException e) {
			// エラーメッセージをセットする
		} finally {
			// データベース接続をを終了する
			transaction.close();
		}

		return seeker;

	}*/
}
