package jp.or.adash.nexus.services;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jp.or.adash.nexus.dao.KyujinDao;
import jp.or.adash.nexus.dao.SaibanDao;
import jp.or.adash.nexus.entity.Kyujin;
import jp.or.adash.nexus.utils.common.DataCommons;
import jp.or.adash.nexus.utils.common.MessageCommons;
import jp.or.adash.nexus.utils.dao.Transaction;


/**
 * 商品に関する処理を定義するクラス
 * @author T.Kawasaki
 *
 */
public class KyujinService {

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
	public KyujinService() {
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
	 * 求人番号を元に、商品情報を取得する
	 * @param code 商品コード
	 * @return 商品情報
	 */
	public Kyujin getKyujin(String no) {
		Kyujin kyujin = null;

		try {
			// データベース接続を開始する
			transaction.open();

			// 商品単価を取得する
			KyujinDao dao = new KyujinDao(transaction);
			kyujin = dao.selectKyujin(no);

		} catch (IOException e) {
			// エラーメッセージをセットする
		} finally {
			// データベース接続を終了する
			transaction.close();
		}

		return kyujin;
	}

	/**
	 * 求人票リストを取得する
	 * @return 求人票リスト
	 */
	public List<Kyujin> getKyujinList() {
		List<Kyujin> kyujinList = new ArrayList<Kyujin>();

		try {
			// データベース接続を開始する
			transaction.open();

			// 求人リストを取得する
			KyujinDao dao = new KyujinDao(transaction);
			kyujinList = dao.selectKyujinList();

		} catch (IOException e) {
			// エラーメッセージをセットする
			messages.add(MessageCommons.ERR_DB_CONNECT);
		} finally {
			// データベース接続を終了する
			transaction.close();
		}

		return kyujinList;
	}


/*
		 * 求人票データの内容をチェックする
		 * @param kyujin 求人票データ
		 * @return 処理結果（true:成功、false:失敗）
		 */
		public boolean check(Kyujin kyujin) {
			boolean result = true;		// チェック結果


			DataCommons commons = new DataCommons();

			// 事業所番号の長さが適切か
			int length = commons.getBytes(kyujin.getCompanyno());
			if (length <= 0 || length > 13) {
				messages.add("事業所番号が長すぎます。");
				result = false;
			}

			// 事業署名（カナ）の長さが適切か
						length = commons.getBytes(kyujin.getCompanykana());
			if (length <= 0 || length > 54) {
				messages.add("事業所名（カナ）が長すぎます。");
				result = false;
			}

			// 事業署名の長さが適切か
			length = commons.getBytes(kyujin.getCompanyname());
			if (length <= 0 || length > 60) {
				messages.add("事業所名が長すぎます。");
				result = false;
			}

			// 事業所郵便番号の長さが適切か
			length = commons.getBytes(kyujin.getCompanypostal());
			if (length > 8) {
				messages.add("郵便番号が長すぎます。");
				result = false;
			}

			// 事業所所在地の長さが適切か
			length = commons.getBytes(kyujin.getCompanyplace());
			if (length > 75) {
				messages.add("事業所所在地が長すぎます。");
				result = false;
			}

			// 事業所URLの長さが適切か
			length = commons.getBytes(kyujin.getCompanyurl());
			if (length > 100) {
				messages.add("事業所URLが長すぎます。");
				result = false;
			}

			// 就業場所郵便番号の長さが適切か
			length = commons.getBytes(kyujin.getPostal());
			if (length > 8) {
				messages.add("就業場所郵便番号が長すぎます。");
				result = false;
			}

			// 就業場所の長さが適切か
			length = commons.getBytes(kyujin.getAddress());
			if (length > 90) {
				messages.add("就業場所が長すぎます。");
				result = false;
			}

			// 最寄り駅の長さが適切か
			length = commons.getBytes(kyujin.getNearstation());
			if (length > 30) {
				messages.add("最寄り駅が長すぎます。");
				result = false;
			}

			// 就業場所の長さが適切か
			length = commons.getBytes(kyujin.getJob());
			if (length <= 0 || length > 28) {
				messages.add("職種が長すぎます。");
				result = false;
			}

			// 仕事の内容の長さが適切か
			length = commons.getBytes(kyujin.getDetail());
			if (length > 297) {
				messages.add("仕事の内容が長すぎます。");
				result = false;
			}

			// 学歴の内容の長さが適切か
			length = commons.getBytes(kyujin.getEducation());
			if (length > 64) {
				messages.add("学歴が長すぎます。");
				result = false;
			}

			// 必要な経験等の長さが適切か
			length = commons.getBytes(kyujin.getExperience());
			if (length > 84) {
				messages.add("必要な経験等が長すぎます。");
				result = false;
			}

			// 必要な免許・資格等の内容の長さが適切か
			length = commons.getBytes(kyujin.getLicense());
			if (length > 84) {
				messages.add("必要な免許・資格等が長すぎます。");
				result = false;
			}

			// 年齢の下限・上限の値が適切か
			if (kyujin.getAgemin() <= 0 || kyujin.getAgemin() > 2) {
				messages.add("年齢の下限の値が間違ってます。");
				result = false;
			}
			if (kyujin.getAgemax() <= 0 || kyujin.getAgemax() > 2) {
				messages.add("年齢の上限の値が間違ってます。");
				result = false;
			}
			if (kyujin.getAgemin() > kyujin.getAgemax()) {
				messages.add("年齢の範囲が間違ってます。");
				result = false;
			}

			// 基本給の下限・上限の値が適切か
			if (kyujin.getSalarymin() <= 0 || kyujin.getSalarymin() > 2) {
				messages.add("基本給の下限の値が間違ってます。");
				result = false;
			}
			if (kyujin.getSalarymax() <= 0 || kyujin.getSalarymax() > 2) {
				messages.add("基本給の上限の値が間違ってます。");
				result = false;
			}
			if (kyujin.getSalarymin() > kyujin.getSalarymax()) {
				messages.add("基本給の範囲が間違ってます。");
				result = false;
			}

			// 就業時間の下限・上限の値が適切か
			if (kyujin.getBegintime() <= 0 || kyujin.getBegintime() > 2) {
				messages.add("就業時間の下限の値が間違ってます。");
				result = false;
			}
			if (kyujin.getEndtime() <= 0 || kyujin.getEndtime() > 2) {
				messages.add("就業時間の上限の値が間違ってます。");
				result = false;
			}
			if (kyujin.getEndtime() > kyujin.getEndtime()) {
				messages.add("就業時間の範囲が間違ってます。");
				result = false;
			}



		return result;
	}

	/**
	 * 登録完了メッセージ
	 */
	private static final String MSG_ITEM_REGIST_COMPLETE = "求人データの登録が完了しました。";

	/**
	 * 登録失敗メッセージ
	 */
	private static final String MSG_ITEM_REGIST_FAILURE = "求人データの登録に失敗しました。";

	/**
	 * 求人票データを更新する
	 * @param kyujin 求人票データ
	 * @return 処理結果（true:成功、false:失敗）
	 */
	public boolean updateKyujin(Kyujin kyujin) {
		boolean result = false; // 処理結果

		try {
			// データベース接続を開始する
			transaction.open();

			// トランザクションを開始する
			transaction.beginTrans();

			// 商品単価を取得する
			KyujinDao dao = new KyujinDao(transaction);
			int count = dao.update(kyujin);

			if (count > 0) {
				// 完了メッセージをセットする
				messages.add(MSG_ITEM_REGIST_COMPLETE);
				result = true;
			} else {
				// エラーメッセージをセットする
				messages.add(MSG_ITEM_REGIST_FAILURE);
			}

			// トランザクションをコミットする
			transaction.commit();

		} catch (IOException e) {
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
	 * 求人票データをデータベースに登録する
	 * @param kyujin 求人票データ
	 * @return 処理結果（true:成功、false:失敗）
	 */
	public boolean insertKyujin(Kyujin kyujin) {
		boolean result = false; // 処理結果

		try {
			// データベース接続を開始する
			transaction.open();

			// トランザクションを開始する
			transaction.beginTrans();

			//采番マスタよりデータ取得
			SaibanDao saidao = new SaibanDao(transaction);
			int saiban = saidao.getsaiban();

			//とってきた番号を加工し、Kyujin.noにデータ格納
			String str = String.format("A" + "%013d", saiban);
			kyujin.setNo(str);

			//
			KyujinDao dao = new KyujinDao(transaction);
			int count = dao.insert(kyujin);

			if (count > 0) {
				// 完了メッセージをセットする
				messages.add(MSG_ITEM_REGIST_COMPLETE);
				result = true;
			} else {
				// エラーメッセージをセットする
				messages.add(MSG_ITEM_REGIST_FAILURE);
				result = false;
			}

			// トランザクションをコミットする
			transaction.commit();

		} catch (IOException e) {
			// トランザクションをロールバックする
			transaction.rollback();

			// エラーメッセージをセットする
			messages.add(MessageCommons.ERR_DB_CONNECT);
		} finally {
			// データベース接続を終了する
			transaction.close();
		}

		return result;
	}

	/*	 * 求人票データに削除フラグを立てる
	 * @return 処理結果（true:成功、false:失敗）
	 */
	public boolean deleteKyujin(String no, String delflag) {
		boolean result = false; // 処理結果

		try {
			// データベース接続を開始する
			transaction.open();

			// トランザクションを開始する
			transaction.beginTrans();

			// 商品単価を取得する
			KyujinDao dao = new KyujinDao(transaction);
			int count = dao.delete(no, delflag);

			if (count > 0) {
				// 完了メッセージをセットする
				messages.add(MSG_ITEM_REGIST_COMPLETE);
				result = true;
			} else {
				// エラーメッセージをセットする
				messages.add(MSG_ITEM_REGIST_FAILURE);
				result = false;
			}

			// トランザクションをコミットする
			transaction.commit();

		} catch (IOException e) {
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
