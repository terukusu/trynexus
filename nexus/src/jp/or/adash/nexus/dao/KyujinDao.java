package jp.or.adash.nexus.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jp.or.adash.nexus.entity.SimpleKyujin;
import jp.or.adash.nexus.utils.dao.Transaction;

public class KyujinDao {
	/**
	 * データベース接続オブジェクト
	 */
	private Connection conn;

	/**
	 * コンストラクタ
	 * @param transaction トランザクションオブジェクト
	 */
	public KyujinDao(Transaction transaction) {
		this.conn = transaction.getConnection();
	}

	/**
	 * 商品コードを元に、商品情報（1件）を取得する
	 * @param itemNo 商品番号
	 * @return 商品オブジェクト
	 * @throws IOException
	 */
	public List<SimpleKyujin> selectKyujin(String job, String jobsmallcd1, String jobsmallcd2, String jobsmallcd3,
			String joblargecd1,String joblargecd2, String joblargecd3,
			int salarymin, int salarymax, int adresscd, int koyoukeitaicd)
			throws IOException {
		List<SimpleKyujin> kyujinlist = new ArrayList<SimpleKyujin>();

		// SQL文を生成する
		StringBuffer sql = new StringBuffer();
		sql.append("select jobsmallcd1, jobsmallcd2, jobsmallcd3,"
				+ " joblargecd1, joblargecd2, joblargecd3, adresscd,"
				+ " koyoukeitaicd, salarymin, salarymax");
		sql.append(" from kyujin");
		sql.append(" where code = " + jobsmallcd1 + " ," + jobsmallcd2 + " ," + jobsmallcd3 + ",?,?,?,?,"
				+ joblargecd1 + " ," + joblargecd2 + " ," + joblargecd3+ ","  + adresscd
						 + "," + koyoukeitaicd + salarymin + "," + salarymax +","
						+"AND salarymin <= "+ salarymin
						+"AND salarymax >= "+ salarymax+";"
				);
		try (PreparedStatement ps = this.conn.prepareStatement(sql.toString())) {

			// SQL文を実行する
			try (ResultSet rs = ps.executeQuery()) {
				// 取得結果をリストに格納する
				while (rs.next()) {
					kyujinlist.add(
						new	SimpleKyujin(rs.getString("no"), rs.getString("companyno"),
							rs.getString("jobsmallcd1"), rs.getString("jobsmallcd2"), rs.getString("jobsmallcd3"),
							rs.getString("joblargecd1"), rs.getString("joblargecd2"), rs.getString("joblargecd3"),
							rs.getString("companyname"), rs.getString("adress"), rs.getString("adresscd"),
							rs.getString("nearstation"), rs.getString("job"), rs.getString("koyoukeitaicd"),
							rs.getInt("agemin"), rs.getInt("agemax"), rs.getInt("salarymin"), rs.getInt("salarymax")));
					}
			} catch (SQLException e) {
				throw new IOException(e);
			}
		} catch (SQLException e) {
			throw new IOException(e);
		}

		return kyujinlist;
	}

	/**
	 * 商品の一覧を取得する
	 * @return 商品リスト
	 * @throws IOException
	 */
	public List<SimpleKyujin> selectKyujinList() throws IOException {
		List<SimpleKyujin> kyujin = new ArrayList<SimpleKyujin>();

		// SQL文を生成する
		StringBuffer sql = new StringBuffer();
		sql.append(
				"select no, companyno, jobsmallcd1, jobsmallcd2, jobsmallcd3, joblargecd1, joblargecd2, joblargecd3, "
						+ "companyname, adress,adresscd, nearstation,"
						+ " job, koyoukeitaicd, salarymin, salarymax");
		sql.append(" from kyujin");
		sql.append(" order by no");
		try (PreparedStatement ps = this.conn.prepareStatement(sql.toString())) {
			// SQL文を実行する
			try (ResultSet rs = ps.executeQuery()) {
				// 1取得結果をリストに格納する
				while (rs.next()) {
					kyujin.add(new SimpleKyujin(rs.getString("no"), rs.getString("companyno"),
							rs.getString("jobsmallcd1"), rs.getString("jobsmallcd2"), rs.getString("jobsmallcd3"),
							rs.getString("joblargecd1"), rs.getString("joblargecd2"), rs.getString("joblargecd3"),
							rs.getString("companyname"), rs.getString("adress"), rs.getString("adresscd"),
							rs.getString("nearstation"), rs.getString("job"), rs.getString("koyoukeitaicd"),
							rs.getInt("agemin"), rs.getInt("agemax"), rs.getInt("salarymin"), rs.getInt("salarymax")));
				}
			} catch (SQLException e) {
				throw new IOException(e);
			}
		} catch (SQLException e) {
			throw new IOException(e);
		}

		return kyujin;
	}

}
