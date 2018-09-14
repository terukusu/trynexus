import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jp.or.adash.nexus.entity.Jobseeker_simple_entity;
import jp.or.adash.nexus.utils.common.MessageCommons;
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
	 * 処理結果メッセージを取得する
	 * @return 処理結果メッセージ
	 */
	public List<String> getMessages() {
		return messages;
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

}
