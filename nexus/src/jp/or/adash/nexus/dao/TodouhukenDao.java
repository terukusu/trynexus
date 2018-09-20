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


/**
 * 都道府県データアクセスクラス
 * @author aizawa
 *
 */
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



	/**
	 * 都道府県番号を元に、都道府県情報を取得する
	 * @param cd 都道府県番号
	 * @return 都道府県オブジェクト
	 * @throws IOException
	 */
	public Todouhuken selectItem(int cd) throws IOException {
		Todouhuken todouhuken = null;

		// SQL文を生成する
		StringBuffer sql = new StringBuffer();
		sql.append("select cd, name");
		sql.append(" from todouhuken");
		sql.append(" where cd = ?");
		try (PreparedStatement ps = this.conn.prepareStatement(sql.toString())) {
			ps.setInt(0, cd);

			// SQL文を実行する
			try (ResultSet rs = ps.executeQuery()) {
				// 取得結果をリストに格納する
				while(rs.next()) {
					return new Todouhuken(rs.getInt("cd"),
							rs.getString("name"));

				}
			} catch(SQLException e) {
				throw new IOException(e);
			}
		} catch(SQLException e) {
			throw new IOException(e);
		}

		return todouhuken;
	}

	/**
	 * 都道府県の一覧を取得する
	 * @return 都道府県リスト
	 * @throws IOException
	 */
	public List<Todouhuken> selectItemList() throws IOException {
		List<Todouhuken> todouhukens = new ArrayList<Todouhuken>();

		// SQL文を生成する
		StringBuffer sql = new StringBuffer();
		sql.append("select cd, name");
		sql.append(" from todouhuken");
		sql.append(" order by cd");
		try (PreparedStatement ps = this.conn.prepareStatement(sql.toString())) {
			// SQL文を実行する
			try (ResultSet rs = ps.executeQuery()) {
				// 取得結果をリストに格納する
				while(rs.next()) {
					todouhukens.add(new Todouhuken(rs.getInt("cd"),
							rs.getString("name")));
				}
			} catch(SQLException e) {
				throw new IOException(e);
			}
		} catch(SQLException e) {
			throw new IOException(e);
		}

		return todouhukens;
	}




}
