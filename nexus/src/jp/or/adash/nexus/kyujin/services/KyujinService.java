package jp.or.adash.nexus.kyujin.services;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jp.or.adash.nexus.entity.Kyujin;
import jp.or.adash.nexus.kyujin.dao.KyujinDao;
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
	public Kyujin getKyujin(int no) {
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
	 * 商品リストを取得する
	 * @return 商品リスト
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

	/**
	 * 創業設立年を取得する
	 * @param no 求人番号
	 * @return 商品価格（エラーの場合、-1をセット）
	 */
	public int getKyujinEstablishdt(int no) {
		// 創業設立年（創業設立年がなければ、0）
		int establishdt = 0;

		try {
			// データベース接続を開始する
			transaction.open();

			// 創業設立年を取得する
			KyujinDao dao = new KyujinDao(transaction);
			Kyujin kyujin = dao.selectKyujin(no);
			establishdt = kyujin.getEstablishdt();

		} catch (IOException e) {
			// エラーメッセージをセットする
			establishdt = -1;
		} finally {
			// データベース接続を終了する
			transaction.close();
		}

		return establishdt;
	}

	/**
	 * 商品データの内容をチェックする
	 * @param item 商品データ
	 * @return 処理結果（true:成功、false:失敗）
	public boolean check(Item item) {
		boolean result = true; // チェック結果

		// 商品コードの値が正しいか
		if (item.getItemNo() <= 0) {
			messages.add("商品コードに0より小さい値は指定できません。");
			result = false;
		}

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

		return result;
	}
	*/

	/**
	 * 登録完了メッセージ
	 */
	private static final String MSG_ITEM_REGIST_COMPLETE = "求人データの登録が完了しました。";

	/**
	 * 登録失敗メッセージ
	 */
	private static final String MSG_ITEM_REGIST_FAILURE = "求人データの登録に失敗しました。";

	/**
	 * 商品データを登録する
	 * @param item 商品データ
	 * @return 処理結果（true:成功、false:失敗）
	 */
	public boolean registKyujin(Kyujin kyujin) {
		boolean result = false;

		// データベースに商品が既に存在するかどうか確認する
		if (exists(kyujin.getEstablishdt())) {
			// 存在する場合は、商品データを更新する
			result = this.updateKyujin(kyujin);
		} else {
			// 存在しなければ、商品データを登録する
			result = this.insertKyujin(kyujin);
		}

		return result;
	}

	/**
	 * 商品コードがデータベースに既に存在するかどうかを確認する
	 * @param code 商品コード
	 * @return true:存在する、false:存在しない
	 */
	private boolean exists(int no) {
		boolean result = false; // 確認結果

		// コードをキーにして、データベースを検索する
		int establishdt = this.getKyujinEstablishdt(no);

		// データが存在する場合、true	を返す
		if (establishdt > 0) {
			result = true;
		}

		return result;
	}

	/**
	 * 商品データを更新する
	 * @param item 商品データ
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
	 * 商品データをデータベースに登録する
	 * @param item 商品データ
	 * @return 処理結果（true:成功、false:失敗）
	 */
	public boolean insertKyujin(Kyujin kyujin) {
		boolean result = false; // 処理結果

		try {
			// データベース接続を開始する
			transaction.open();

			// トランザクションを開始する
			transaction.beginTrans();

			// 商品単価を取得する
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
