/**
 *
 */
package jp.or.adash.nexus.utils.common;

import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

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
	 * 入力値を文字列→日付に変換する
	 * @param str 文字列
	 * @return date
	 * @author yCola
	 * @throws ParseException
	 */
	public Date getDate(String str) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		//Date型変換
		Date formatDate = sdf.parse(str);
		//変換した 値を返す
		return formatDate;
	}
}
