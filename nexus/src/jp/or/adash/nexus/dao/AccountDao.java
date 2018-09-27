package jp.or.adash.nexus.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jp.or.adash.nexus.entity.Staff;
import jp.or.adash.nexus.utils.dao.Transaction;

/**
 * アカウント登録データアクセスクラス
 * @author Ishida
 *
 */
public class AccountDao {

	/**
	 * データベース接続オブジェクト
	 */
	private Connection conn;

	/**
	 * コンストラクタ
	 * @param transaction トランザクションオブジェクト
	 */
	public AccountDao(Transaction transaction) {
		this.conn = transaction.getConnection();
	}

	/**
	 * アカウントを登録する
	 * @param Staff アカウント情報
	 * @return 登録件数
	 * @auther Ishida
	 */
	public int insert(Staff staff) throws IOException {
		int count = 0;

		// SQL文を生成する
		StringBuffer sql = new StringBuffer();
		sql.append("insert into staff");
		sql.append("(id, name, kana, authority, password, createuserid, updateuserid, deleteflag)");
		sql.append("values");
		sql.append("(?, ?, ?, ?, ?, ?, ?, ?)");
		try (PreparedStatement ps = this.conn.prepareStatement(sql.toString())) {
			ps.setString(1, staff.getId());
			ps.setString(2, staff.getName());
			ps.setString(3, staff.getKana());
			ps.setString(4, staff.getAuthority());
			ps.setString(5, staff.getPassword());
			ps.setString(6, staff.getCreateuserid());
			ps.setString(7, staff.getUpdateuserid());
			ps.setString(8, staff.getDeleteflag());

		// SQL文を実行する　executeUpdateはデータの行数が返ってくる
			count = ps.executeUpdate();

		} catch(SQLException e) {
			throw new IOException(e);
		}

		return count;
	}
}

