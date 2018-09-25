package jp.or.adash.nexus.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jp.or.adash.nexus.entity.MatchingCase;
import jp.or.adash.nexus.utils.common.DataCommons;
import jp.or.adash.nexus.utils.dao.Transaction;
/**
 * 商品データアクセスクラス
 * @author T.Kawasaki
 *
 */
public class MatchingDao {

	/**
	 * データベース接続オブジェクト
	 */
	private Connection conn;

	/**
	 * コンストラクタ
	 * @param transaction トランザクションオブジェクト
	 */
	public MatchingDao(Transaction transaction) {
		this.conn = transaction.getConnection();
	}

	/**
	 * マッチング結果を登録する
	 * @param matching 登録する商品の情報
	 * @return 登録件数
	 * @throws IOException
	 */
	public int insert(MatchingCase matching) throws IOException {
		int count = 0;

		// SQL文を生成する
		StringBuffer sql = new StringBuffer();
		sql.append("insert into matchingcase ");
		sql.append("(kyujinno,jobseekerid,staffid,interviewdt,enterdt,assessment,"
				+ "note,createuserid,updateuserid");
		sql.append(") values (");
		sql.append("?,?,?,?,?,?,?,?,?");
		sql.append(")");
		try (PreparedStatement ps = this.conn.prepareStatement(sql.toString())) {
			//ps.setInt(1,matching.getId());
			ps.setString(1,matching.getKyujinno());
			ps.setString(2,matching.getJobseekerid());
			ps.setString(3,matching.getStaffid());
			ps.setDate(4,DataCommons.convertToSqlDate(matching.getInterviewdt()));
			ps.setDate(5,DataCommons.convertToSqlDate(matching.getEnterdt()));
			ps.setString(6,matching.getAssessment());
			ps.setString(7,matching.getNote());
			ps.setString(8,matching.getCreateuserid());
			ps.setString(9,matching.getUpDateuserid());


			// SQL文を実行する
			count = ps.executeUpdate();
		} catch (SQLException e) {
			throw new IOException(e);
		}

		return count;
	}

}



	//private void setString(int i, String jobseekerid) {
		// TODO 自動生成されたメソッド・スタブ




	 /* 商品コードを元に、商品情報（1件）を取得する
	 * @param kyuNo 求人番号
	 * @return 求人オブジェクト
	 * @throws IOException
	 */

//マッチング登録時の照合　↓

	/*
	public MatchingCase selectMatching(MatchingCase matching) throws IOException {
	MatchingCase matchingObject = null;
		// SQL文を生成する
		StringBuffer sql = new StringBuffer();
		sql.append("select kyujinno , jobseekerid FROM matchingcase where kyujinno = ?");
		try (PreparedStatement ps = this.conn.prepareStatement(sql.toString())) {
			ps.setInt(1, itemNo);
			// SQL文を実行する
			try (ResultSet rs = ps.executeQuery()) {
				//  1取得結果をリストに格納する
				while (rs.next()) {
					return new Kyuno(rs.getInt("no");
				}
			} catch (SQLException e) {
				throw new IOException(e);
			}
		} catch (SQLException e) {
			throw new IOException(e);
		}
		return item;
}
/*
	/**
	 * 商品の一覧を取得する
	 * @return 商品リスト
	 * @throws IOException
	 */
	/*public List<Item> selectItemList() throws IOException {
		List<Item> items = new ArrayList<Item>();
		// SQL文を生成する
		StringBuffer sql = new StringBuffer();
		sql.append("select code, name, unitprice");
		sql.append(" from item");
		sql.append(" order by code");
		try (PreparedStatement ps = this.conn.prepareStatement(sql.toString())) {
			// SQL文を実行する
			try (ResultSet rs = ps.executeQuery()) {
				// 1取得結果をリストに格納する
				while (rs.next()) {
					items.add(new Item(rs.getInt("code"),
							rs.getString("name"),
							rs.getInt("unitprice")));
				}
			} catch (SQLException e) {
				throw new IOException(e);
			}
		} catch (SQLException e) {
			throw new IOException(e);
		}
		return items;
	}
	/**
	 * 商品データを更新する
	 * @param item 商品データ
	 * @return 更新件数
	 * @throws IOException
	 */
	/*
	 public int update(Item item) throws IOException {
		int count = 0;
		// SQL文を生成する
		StringBuffer sql = new StringBuffer();
		sql.append("update item set");
		sql.append(" name = ?");
		sql.append(", unitprice = ?");
		sql.append(" where");
		sql.append(" code = ?");
		try (PreparedStatement ps = this.conn.prepareStatement(sql.toString())) {
			ps.setString(1, item.getItemName());
			ps.setInt(2, item.getUnitPrice());
			ps.setInt(3, item.getItemNo());
			// SQL文を実行する
			count = ps.executeUpdate();
		} catch (SQLException e) {
			throw new IOException(e);
		}
		return count;
		*/
