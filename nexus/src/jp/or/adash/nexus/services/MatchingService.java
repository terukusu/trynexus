package jp.or.adash.nexus.services;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jp.or.adash.nexus.dao.MatchingDao;
import jp.or.adash.nexus.entity.JobSeekerMain;
import jp.or.adash.nexus.entity.Kyujin;
import jp.or.adash.nexus.entity.MatchingCase;
import jp.or.adash.nexus.utils.common.DataCommons;
import jp.or.adash.nexus.utils.common.MessageCommons;
import jp.or.adash.nexus.utils.dao.Transaction;

/**
 * マッチング登録に関する処理を定義するクラス
 * @author ji
 *
 */
public class MatchingService {

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
	public MatchingService() {
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
	 * 求人ＮＯ.／求職者ＩＤのオブジェクト作成
	 * @param kyujinno 求人ＮＯ/jobseekerid 求職者ＮＯ
	 *
	 */
	KyujinService kyujinservice = new KyujinService();
	private String kyujinno;
	Kyujin kyujin = kyujinservice.getKyujin(kyujinno);

	JobSeekerService jobseekerService = new JobSeekerService();
	private String jobseekerid;
	JobSeekerMain jobseekermain = jobseekerService.getJobseekermaininfo(jobseekerid);

	     /**
		 * マッチング情報の入力内容をチェックする（エラーチェック）
		 * @param matching マッチング情報
		 * @return 処理結果（true:成功、false:失敗）
		 */
	public boolean check(MatchingCase matching) {
		boolean result = true; // チェック結果

		// 求人IDの値が入力されているか
		if (matching.getKyujinno().equals("")) {
			messages.add("求人NOが入力されていません。");
			result = false;
		}

		errMsg = DataCommons.chksDigits(matching.getKyujinno(), 14);
		messages.add(errMsg);

		// 求職者IDの値が入力されているか
		if (matching.getJobseekerid().equals("")) {
			messages.add("求職者IDが入力されていません。");
			result = false;
		}

		errMsg = DataCommons.chksDigits(matching.getJobseekerid(), 8);
		messages.add(errMsg);

		// 職業紹介者IDの値が入力されているか
		if (matching.getStaffid().equals("")) {
			messages.add("職業紹介者IDが入力されていません。");
			result = false;
		}

		errMsg = DataCommons.chksDigits(matching.getStaffid(), 4);
		messages.add(errMsg);

		//面接日の値が入力されているか
		if (matching.getInterviewdt() == null) {
			messages.add("面接日が入力されていません。");
			result = false;
		}

		//入社日の値が入力されているか
		if (matching.getEnterdt() == null) {
			messages.add("入社日が入力されていません。");
			result = false;
		}
		// 評価の値が入力されているか
		if (matching.getAssessment().equals("")) {
			messages.add("評価が入力されていません。");
			result = false;
		}

		// 備考の値が入力されているか
		errMsg = DataCommons.chksDigits(matching.getNote(), 200);
		messages.add(errMsg);

		return result;
	}

	/**
	 * マッチング情報を登録する。
	 * @param matching マッチング情報
	 * @return マッシング情報を登録する。
	 */

	public boolean insertMatchingCases(MatchingCase matching) {
		boolean result = false; //1処理結果

		try {
			// 1データベース接続を開始する
			transaction.open();

			// 1トランザクションを開始する
			transaction.beginTrans();

			// 1商品単価を取得する
			MatchingDao dao = new MatchingDao(transaction);
			int count = dao.insert(matching);

			if (count > 0) {
				// 1完了メッセージをセットする
				messages.add(MSG_MATCHING_REGIST_COMPLETE);
				result = true;
			} else {
				// 1エラーメッセージをセットする
				messages.add(MSG_MATCHING_REGIST_FAILURE);
				result = false;
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

	/* 1登録完了メッセージ
	 */
	private static final String MSG_MATCHING_REGIST_COMPLETE = "マッチング登録が完了しました。";

	/* 1登録完了メッセージ
	 */
	private static final String MSG_MATCHING_REGIST_FAILURE = "マッチング登録が失敗しました。";
}
