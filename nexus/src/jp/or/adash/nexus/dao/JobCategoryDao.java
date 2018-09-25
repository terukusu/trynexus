package jp.or.adash.nexus.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jp.or.adash.nexus.entity.JobCategory;
import jp.or.adash.nexus.utils.dao.Transaction;

/**
 *  業種データアクセスクラス
 * @author aizawa
 *
 */
public class JobCategoryDao {

	/**
	 * データベース接続オブジェクト
	 */
	private Connection conn;

	/**
	 * コンストラクタ
	 * @param transaction トランザクションオブジェクト
	 */
	public JobCategoryDao(Transaction transaction) {
		this.conn = transaction.getConnection();
	}

	/**
	 * 業種の大分類一覧を取得する
	 * @return 業種大分類リスト
	 * @throws IOException
	 */
	public List<JobCategory> selectLargeJobCategoryList() throws IOException {
		List<JobCategory> LargeJobCategoryList = new ArrayList<JobCategory>();

		// SQL文を生成する
		StringBuffer sql = new StringBuffer();
		sql.append("select largecd, name");
		sql.append(" from jobcategory");
		sql.append(" where middlecd = 0 and smallcd =0");
		sql.append(" order by cast(largecd as signed)");
		try (PreparedStatement ps = this.conn.prepareStatement(sql.toString())) {
			// SQL文を実行する
			try (ResultSet rs = ps.executeQuery()) {
				// 取得結果をリストに格納する
				while (rs.next()) {
					LargeJobCategoryList.add(new JobCategory(rs.getString("largecd"),
							rs.getString("name")));
				}
			} catch (SQLException e) {
				throw new IOException(e);
			}
		} catch (SQLException e) {
			throw new IOException(e);
		}

		return LargeJobCategoryList;
	}


	/**
	 * 業種小分類の一覧を取得する
	 * @return 業種小分類リスト
	 * @throws IOException
	 */
	public List<JobCategory> selectSmallJobCategoryList() throws IOException {
		List<JobCategory> SmallJobCategoryList = new ArrayList<JobCategory>();

		// SQL文を生成する
		StringBuffer sql = new StringBuffer();
		sql.append("select smallcd, name");
		sql.append(" from jobcategory");
		sql.append(" where  middlecd != 0 and smallcd !=0");
		sql.append(" order by cast(smallcd as signed)");
		try (PreparedStatement ps = this.conn.prepareStatement(sql.toString())) {
			// SQL文を実行する
			try (ResultSet rs = ps.executeQuery()) {
				//  取得結果をリストに格納する
				while (rs.next()) {
					SmallJobCategoryList.add(new JobCategory(rs.getString("smallcd"),
							rs.getString("name")));
				}
			} catch (SQLException e) {
				throw new IOException(e);
			}
		} catch (SQLException e) {
			throw new IOException(e);
		}

		return SmallJobCategoryList;
	}

}
