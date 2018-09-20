package jp.or.adash.nexus.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jp.or.adash.nexus.entity.Todouhuken;
import jp.or.adash.nexus.utils.dao.Transaction;

public class TodouhukenDao {
	/**
	 * データベース接続オブジェクト
	 */
	private Connection conn;

	/**
	 * コンストラクタ
	 * @param transaction トランザクションオブジェクト
	 */
	public TodouhukenDao(Transaction transaction) {
		this.conn = transaction.getConnection();
	}
	public List<Todouhuken> selectTodouhuken()
			throws IOException {

		List<Todouhuken> todouhukenlist = new ArrayList<Todouhuken>();

		StringBuilder sqlTodouhuken = new StringBuilder();

		sqlTodouhuken.append("select no, name");
		sqlTodouhuken.append(" from todouhuken");
		sqlTodouhuken.append(" order by no;");

		try (PreparedStatement ps = this.conn.prepareStatement(sqlTodouhuken.toString())) {
			// SQL文を実行する
			try (ResultSet rs = ps.executeQuery()) {
				// 1.取得結果をリストに格納する
				while (rs.next()) {
					todouhukenlist.add(
							new Todouhuken(rs.getString("no"), rs.getString("name")));
				}
			} catch (SQLException e) {
				throw new IOException(e);
			}
		} catch (SQLException e) {
			throw new IOException(e);
		}

		return todouhukenlist;
		}
	}
