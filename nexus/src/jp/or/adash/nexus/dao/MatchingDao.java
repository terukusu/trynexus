package jp.or.adash.nexus.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jp.or.adash.nexus.entity.MatchingCase;
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
	 * 商品を登録する
	 * @param item 登録する商品の情報
	 * @return 登録件数
	 * @throws IOException
	 */
	public int insert(MatchingCase matching) throws IOException {
		int count = 0;

		// SQL文を生成する
		StringBuffer sql = new StringBuffer();
		sql.append("insert into matchingcase(");
		sql.append("id,kyujinno,jobseekerid,staffid,interviewdt,enterdt,assessment,"
				+ "note,createdt,createuserid,upDatedt,upDateuserid");
		sql.append(") values (");
		sql.append("?,?,?,?,?,?,?,?,?,?,?,?");
		sql.append(")");
		try (PreparedStatement ps = this.conn.prepareStatement(sql.toString())) {
			ps.setInt(1,matching.getId());
			ps.setString(2,matching.getKyujinno());
			ps.setString(3,matching.getJobseekerid());
			ps.setString(4,matching.getStaffid());
			ps.setDate(5,(Date) matching.getInterviewdt());
			ps.setDate(6,(Date) matching.getEnterdt());
			ps.setString(7,matching.getAssessment());
		    ps.setDate(8,(Date)matching.getCreatedt());
			ps.setString(9,matching.getNote());
			ps.setString(10,matching.getCreateuserid());
		    ps.setDate(11,(Date)matching.getUpDatedt());
			ps.setString(12,matching. getUpDateuserid());


			// SQL文を実行する
			count = ps.executeUpdate();
		} catch (SQLException e) {
			throw new IOException(e);
		}

		return count;
	}

	//private void setString(int i, String jobseekerid) {
		// TODO 自動生成されたメソッド・スタブ

	}

/*
	 * 商品コードを元に、商品情報（1件）を取得する
	 * @param itemNo 商品番号
	 * @return 商品オブジェクト
	 * @throws IOException
	 */
/*
public Item selectItem(int itemNo) throws IOException {
		Item item = null;

		// SQL文を生成する
		StringBuffer sql = new StringBuffer();
		sql.append("select code, name, unitprice");
		sql.append(" from item");
		sql.append(" where code = ?");
		try (PreparedStatement ps = this.conn.prepareStatement(sql.toString())) {
			ps.setInt(1, itemNo);

			// SQL文を実行する
			try (ResultSet rs = ps.executeQuery()) {
				// 取得結果をリストに格納する
				while (rs.next()) {
					return new Item(rs.getInt("code"),
							rs.getString("name"),
							rs.getInt("unitprice"));
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
				// 取得結果をリストに格納する
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



