/**
 *
 */
package jp.or.adash.nexus.utils.common;

import java.io.UnsupportedEncodingException;
import java.text.DateFormat;

/**
 * データを扱う際に使える共通クラス
 * @author T.Kawasaki
 *
 */
public class DataCommons {

	/**
	 * 文字列のバイト数を取得する
	 * @param str 文字列
	 * @return 文字列のバイト数（取得エラーの場合は、マイナス値を返す）
	 */
	public int getBytes(String str) {
		try {
			return str.getBytes("UTF-8").length;
		} catch (UnsupportedEncodingException e) {
			// 取得エラーの場合は、マイナス値を返す
			return -1;
		}
	}

	/**
	 *【エラー】形式チェック（日付）
	 * エラー発生条件：日付
	 * @param String 文字列（日付）
	 * @return string エラーメッセージ
	 * @author y.Koura
	 */
	public static String chkDate(String str) {
		if (checkDate(str)) {
			return null;
		} else {
			return ("日付ではない値が入力されています");
		}
	}
	//エラー判別
	public static boolean checkDate(String strDate) {
		if (strDate == null || strDate.length() != 10) {
			return false;
		}
		DateFormat format = DateFormat.getDateInstance();
		format.setLenient(false);
		try {
			format.parse(strDate);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	/**
	 *【エラー】形式チェック（数値）
	 * エラー発生条件：文字列
	 * @param int 整数
	 * @return string エラーメッセージ
	 * @author y.Koura
	 */
	public static String chkInt(int i) {
		try {
			return null;
		} catch (NumberFormatException e) {
			return "数値ではない値が入力されています";
		}
	}

	/**
	 *【エラー】形式チェック（半角カナ）
	 * @param String 文字列
	 * @return string エラーメッセージ
	 * @author y.Koura
	 */
	public static String chkKana(String str) {
		String MATCH_KATAKANA = "^[ｦ-ﾟ]*$";
		if (str.matches(MATCH_KATAKANA)) {
			return null;
		} else {
			return "半角ｶﾀｶﾅではない値が入力されています";
		}
	}

	/**
	 *【エラー】形式チェック（かな）
	 * @param String 文字列
	 * @return string エラーメッセージ
	 * @author y.Koura
	 */
	public static String chkHiragana(String str) {
		String MATCH_HIRAGANA = "^[\\u3040-\\u309F]+$";
		if (str.matches(MATCH_HIRAGANA)) {
			return null;
		} else {
			return "ひらがなではない値が入力されています";
		}
	}

	/**
	 *【エラー】形式チェック（事業所番号）
	 * @param String 文字列
	 * @return string エラーメッセージ
	 * @author y.Koura
	 */
	public static String chkCompanyno(String Str) {
		String MATCH_CNO = "^[0-9]{4}-[0-9]{6}-[0-9]{1}$";
		if (Str.matches(MATCH_CNO)) {
			return null;
		} else {
			return "事業所番号は xxxx-xxxxxx-x の形式で入力してください";
		}
	}

	/**
	 *【エラー】形式チェック（郵便番号）
	 * @param String 文字列
	 * @return string エラーメッセージ
	 * @author y.Koura
	 */
	public static String chkZipcode(String str) {
		String MATCH_ZIP = "^[0-9]{3}-[0-9]{4}$";
		if (str.matches(MATCH_ZIP)) {
			return null;
		} else {
			return "郵便番号は xxx-xxxx の形式で入力してください";
		}
	}

	/**
	 *【エラー】範囲チェック（数値）
	 * @param int 数値(low)、int 数値(high)
	 * @return string エラーメッセージ
	 * @author y.Koura
	 */
	public static String chkiRange(int low, int high) {
		if (low > high) {
			return "数字の大小に誤りがあります";
		} else {
			return null;
		}
	}

	/**
	 *【エラー】範囲チェック（日付）
	 * @param String 日付(start)、String 日付(end)
	 * @return string エラーメッセージ
	 * @author y.Koura
	 */
	public static String chkdRange(String start, String end) {
		if (checkDate(start) && checkDate(end)) {
			DateFormat format = DateFormat.getDateInstance();
			format.setLenient(false);
			try {
				int diff = start.compareTo(end);
				if (diff > 0) {
					return "日付の大小に誤りがあります";
				} else {
					return null;
				}
			} catch (Exception e) {
				return null;
			}
		} else {
			return ("日付ではない値が入力されています");
		}
	}

	/**
	 *【エラー】桁数チェック（数値）
	 * @param int 数値(検査項目)、int 数値(桁数)
	 * @return string エラーメッセージ
	 * @author y.Koura
	 */
	public static String chkiDigits(int i, int digits) {
		int len =  String.valueOf( i ).length();
		if (len > digits) {
			return "入力可能桁数（" + digits + "）を超えています";
		} else {
			return null;
		}
	}

	/**
	 *【エラー】桁数チェック（文字）
	 * @param int 文字(検査項目)、int 数値(桁数)
	 * @return string エラーメッセージ
	 * @author y.Koura
	 */
	public static String chksDigits(String s, int digits) {
		int len =  s.length();
		if (len > digits) {
			return "入力可能桁数を超えています(" + digits + ")";
		} else {
			return null;
		}
	}

	/**
	 * java.util.Dateクラスをjava.sql.Dateに変換するメソッド
	 * @param utilDate 変換したいjava.util.Dateクラスのオブジェクト
	 * @return java.sql.Date java.sql.Date型に変換されたオブジェクト
	 * @author a.taya
	 */

	public static java.sql.Date convertToSqlDate(java.util.Date utilDate){
	    return new java.sql.Date(utilDate.getTime());
	}
}

