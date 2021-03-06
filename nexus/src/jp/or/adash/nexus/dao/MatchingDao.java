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
 * @author ji
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



