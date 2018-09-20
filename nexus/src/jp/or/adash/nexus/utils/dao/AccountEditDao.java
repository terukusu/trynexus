package jp.or.adash.nexus.utils.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jp.or.adash.nexus.entity.Staff;


public class AccountEditDao {
	/**
	 * データベース接続オブジェクト
	 */
	private Connection conn;

	/**
	 * コンストラクタ
	 * @param transaction トランザクションオブジェクト
	 */
	public AccountEditDao(Transaction transaction) {
		this.conn = transaction.getConnection();
	}
	/**
	 * アカウントを更新する
	 * @param staff 職業紹介者
	 * @return 更新件数
	 * @throws IOException
	 */
	public int update(Staff staff) throws IOException {
		int count = 0;

		// SQL文を生成する
		StringBuffer sql = new StringBuffer();
		sql.append("update staff");
		sql.append(" id = ?,");
		sql.append(" name = ?,");
		sql.append(" kana = ?,");
		sql.append(" authority = ?,");
		sql.append(" password = ?,");
		sql.append(" where");
		sql.append(" id = ?");
		try (PreparedStatement ps = this.conn.prepareStatement(sql.toString())) {
			ps.setString(1, staff.getId());
			ps.setString(2, staff.getName());
			ps.setString(3, staff.getKana());
			ps.setString(4, staff.getAuthority());
			ps.setString(5, staff.getPassword());

			// SQL文を実行する
			count = ps.executeUpdate();
		} catch(SQLException e) {
			throw new IOException(e);
		}

		return count;
	}
}
