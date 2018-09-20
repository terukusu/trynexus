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

public class JobSearchDao {
	/**
	 * データベース接続オブジェクト
	 */
	private Connection conn;

	/**
	 * コンストラクタ
	 * @param transaction トランザクションオブジェクト
	 */
	public JobSearchDao(Transaction transaction) {
		this.conn = transaction.getConnection();
	}

	/**
	 * 商品コードを元に、商品情報（1件）を取得する
	 * @param itemNo 商品番号
	 * @return 商品オブジェクト
	 * @throws IOException
	 */
	public List<SimpleKyujin> selectKyujin(String job, String addresscd, String jobsmallcd1, String jobsmallcd2, String jobsmallcd3,
			String joblargecd1, String joblargecd2, String joblargecd3,
			int salarymin, int salarymax, int koyoukeitaicd)
			throws IOException {
		List<SimpleKyujin> kyujinlist = new ArrayList<SimpleKyujin>();

		//where句を付け足す処理
		int setFlag = 0;
		int setFlagJobsmallcd1 = 0;
		int setFlagJobsmallcd2 = 0;
		int setFlagJobsmallcd3 = 0;
		int setFlagJoblargecd1 = 0;
		int setFlagJoblargecd2 = 0;
		int setFlagJoblargecd3 = 0;
		int setFlagJob = 0;
		int setFlagKoyoukeitaicd = 0;
		int setFlagSalarymin = 0;
		int setFlagSalarymax = 0;


		List<String> whereStr = new ArrayList<String>();


		if (jobsmallcd1 != null && !"".equals(jobsmallcd1)) {
			whereStr.add("jobsmallcd1 = ?");
			setFlagJobsmallcd1 = ++setFlag;
		}

		if (jobsmallcd2 != null && !"".equals(jobsmallcd2)) {
			whereStr.add("jobsmallcd2 = ?");
			setFlagJobsmallcd2 = ++setFlag;
		}

		if (jobsmallcd3 != null && !"".equals(jobsmallcd3)) {
			whereStr.add("jobsmallcd3 = ?");
			setFlagJobsmallcd3 = ++setFlag;
		}

		if (joblargecd1 != null && !"".equals(joblargecd1)) {
			whereStr.add("joblargecd1 = ?");
			setFlagJoblargecd1 = ++setFlag;
		}

		if (joblargecd2 != null && !"".equals(joblargecd2)) {
			whereStr.add("joblargecd2 = ?");
			setFlagJoblargecd2 = ++setFlag;
		}

		if (joblargecd3 != null && !"".equals(joblargecd3)) {
			whereStr.add("joblargecd3 = ?");
			setFlagJoblargecd3 = ++setFlag;
		}


		if (job != null && !"".equals(job)) {
			whereStr.add("job = ?");
			setFlagJob = ++setFlag;
		}

		if (koyoukeitaicd != 0 && !"".equals(koyoukeitaicd)) {
			whereStr.add("koyoukeitaicd = ?");
			setFlagKoyoukeitaicd = ++setFlag;
		}

		whereStr.add("salarymin = ?");
		setFlagSalarymin = ++setFlag;

		whereStr.add("salarymax = ?");
		setFlagSalarymax = ++setFlag;

		StringBuilder sqlSearchJob = new StringBuilder();

		sqlSearchJob.append("select no, companyno,addresscd, jobsmallcd1,jobsmallcd2,jobsmallcd3,");
		sqlSearchJob.append("joblargecd1,joblargecd2,joblargecd3,");
		sqlSearchJob.append("companyname,address,");
		sqlSearchJob.append(" from kyujin");
		sqlSearchJob.append(" order by no");
		sqlSearchJob.append("where ");
		sqlSearchJob.append(String.join(" and ", whereStr));


		try (PreparedStatement ps = conn.prepareStatement(sqlSearchJob.toString())) {

			if(setFlagJobsmallcd1 != 0){
				ps.setString(setFlagJobsmallcd1, jobsmallcd1);
			}

			if(setFlagJobsmallcd2 != 0){
				ps.setString(setFlagJobsmallcd2, jobsmallcd2);

			}

			if(setFlagJobsmallcd3 != 0){
				ps.setString(setFlagJobsmallcd3, jobsmallcd3);
			}

			if(setFlagJoblargecd1 != 0){
				ps.setString(setFlagJoblargecd1, joblargecd1);
			}

			if(setFlagJoblargecd2 != 0){
				ps.setString(setFlagJoblargecd2, joblargecd2);
			}

			if(setFlagJoblargecd3 != 0){
				ps.setString(setFlagJoblargecd3, joblargecd3);
			}

			if(setFlagJob != 0){
				ps.setString(setFlagJob, job);
			}

			if(setFlagKoyoukeitaicd != 0){
				ps.setInt(setFlagKoyoukeitaicd, koyoukeitaicd);
			}

			if(setFlagKoyoukeitaicd != 0){
				ps.setInt(setFlagKoyoukeitaicd, koyoukeitaicd);
			}

			if(setFlagKoyoukeitaicd != 0){
				ps.setInt(setFlagKoyoukeitaicd, koyoukeitaicd);
			}

			if(setFlagSalarymin != 0){
				ps.setInt(setFlagSalarymin, salarymin);
			}

			if(setFlagSalarymax != 0){
				ps.setInt(setFlagSalarymax, salarymax);
			}

			}catch (SQLException e) {
				throw new IOException(e);
			}




		// SQL文を生成する
		StringBuffer sql = new StringBuffer();

		try (PreparedStatement ps = this.conn.prepareStatement(sql.toString())) {

			// SQL文を実行する
			try (ResultSet rs = ps.executeQuery()) {
				// 1.取得結果をリストに格納する
				while (rs.next()) {
					kyujinlist.add(
							new SimpleKyujin(rs.getString("no"), rs.getString("companyno"),
									rs.getString("jobsmallcd1"), rs.getString("jobsmallcd2"),
									rs.getString("jobsmallcd3"),
									rs.getString("joblargecd1"), rs.getString("joblargecd2"),
									rs.getString("joblargecd3"),
									rs.getString("companyname"), rs.getString("adress"), rs.getString("adresscd"),
									rs.getString("nearstation"), rs.getString("job"), rs.getString("koyoukeitaicd"),
									rs.getInt("agemin"), rs.getInt("agemax"), rs.getInt("salarymin"),
									rs.getInt("salarymax")));
				}
			} catch (SQLException e) {
				throw new IOException(e);
			}
		} catch (SQLException e) {
			throw new IOException(e);
		}

		return kyujinlist;
	}
}