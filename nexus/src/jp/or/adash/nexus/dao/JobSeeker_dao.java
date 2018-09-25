package jp.or.adash.nexus.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jp.or.adash.nexus.entity.JobSeekerMain;
import jp.or.adash.nexus.entity.Jobseeker_simple_entity;
import jp.or.adash.nexus.utils.dao.Transaction;

/**
 * 求職者データアクセスクラス
 * @author s.aihara
 *
 */

public class JobSeeker_dao {

	/**
	 * データベース接続オブジェクト
	 */
	private Connection conn;

	/**
	 * コンストラクタ
	 * @param transaction トランザクションオブジェクト
	 */
	public JobSeeker_dao(Transaction transaction) {
		this.conn = transaction.getConnection();
	}

	/**
	 * 求職者の情報一覧を取得する
	 * @return 求職者情報リスト
	 * @auther aihara
	 * @throws IOException
	 */
	public List<Jobseeker_simple_entity> selectJobseekerList() throws IOException {
		List<Jobseeker_simple_entity> jobseeker = new ArrayList<Jobseeker_simple_entity>();

		// SQL文を生成する
		StringBuffer sql = new StringBuffer();
		sql.append("select js.id, js.name, js.age, js.sex, js.hopejobcategory, js.hopejob1, js.hopeworkplace, st.name");
		sql.append(" from jobseeker js");
		sql.append(" left join staff st on js.tantoustaffid = st.id");
		sql.append(" order by js.id");
		try (PreparedStatement ps = this.conn.prepareStatement(sql.toString())) {
			// SQL文を実行する
			try (ResultSet rs = ps.executeQuery()) {
				// 取得結果をリストに格納する
				while(rs.next()) {
					jobseeker.add(new Jobseeker_simple_entity(rs.getString("js.id"),
							rs.getString("js.name"),
							rs.getInt("js.age"),
							rs.getString("js.sex"),
							rs.getString("js.hopejobcategory"),
							rs.getString("js.hopejob1"),
							rs.getString("js.hopeworkplace"),
							rs.getString("st.name")));
				}
			} catch(SQLException e) {
				throw new IOException(e);
			}
		} catch(SQLException e) {
			throw new IOException(e);
		}

		return jobseeker;
	}
	/**
	 * 求職者IDを元に、求職者情報（1件）を取得する
	 * @auther aihara
	 * @throws IOException
	 */

	public List<Jobseeker_simple_entity> selectJobSeekerId(String js_id) throws IOException {
		List<Jobseeker_simple_entity> jobseeker = new ArrayList<Jobseeker_simple_entity>();

		// SQL文を生成する
		StringBuffer sql = new StringBuffer();
		sql.append(" select js.id, js.name, js.sex, js.age, js.hopejobcategory, js.hopejob1, js.hopeworkplace, st.name");
		sql.append(" from jobseeker js");
		sql.append(" left join staff st on js.tantoustaffid = st.id");
		sql.append(" where js.id = ?");
		try (PreparedStatement ps = this.conn.prepareStatement(sql.toString())) {
			ps.setString(1, js_id);

			// SQL文を実行する
			try (ResultSet rs = ps.executeQuery()) {
				// 取得結果をリストに格納する
				while(rs.next()) {
					jobseeker.add(new Jobseeker_simple_entity(
							rs.getString("js.id"),
							rs.getString("js.name"),
							rs.getInt("js.age"),
							rs.getString("js.sex"),
							rs.getString("js.hopejobcategory"),
							rs.getString("js.hopejob1"),
							rs.getString("js.hopeworkplace"),
							rs.getString("st.name")));
				}
			} catch(SQLException e) {
				throw new IOException(e);
			}
		} catch(SQLException e) {
			throw new IOException(e);
		}
		return jobseeker;
	}


	/**
	 * 求職者IDを元に、求職者情報の詳細情報（1件）を取得する
	 * @return 求職者情報の詳細情報
	 * @throws IOException
	 */
	public JobSeekerMain selectJobseekermaininfo(String js_id) throws IOException {
		JobSeekerMain jobseeker = null;

		// SQL文を生成する
		StringBuffer sql = new StringBuffer();
		sql.append(" select js.id, js.name, js.kana, js.sex, js.birthdt, js.age,");
		sql.append(" js.postal, js.address, js.nearstation, js.phone, js.mobile, js.partner, js.huyou, js.education,");
		sql.append(" js.hopejob1, js.hopejob2, js.hopejob3, js.hopejobcategory, js.hopeworkplace,");
		sql.append(" js.hopekoyoukeitai, js.hopeworkingdate, js.hopebegintime, js.hopeendtime,");
		sql.append(" js.hopesalary, js.hopejikyu, js.hopeetc, js.driverlicense, js.licenseetc,");
		sql.append(" js.pasokonskill, js.caution, st.name, js.tantoustaffid, js.password,");
		sql.append(" js.createdt, js.createuserid, js.updatedt, js.updateuserid, js.deleteflag");
		sql.append(" from jobseeker js");
		sql.append(" left join staff st on js.tantoustaffid = st.id");
		sql.append(" where js.id = ?");
		try (PreparedStatement ps = this.conn.prepareStatement(sql.toString())) {
			ps.setString(1, js_id);

			// SQL文を実行する
			try (ResultSet rs = ps.executeQuery()) {
				// 取得結果をリストに格納する
				while(rs.next()) {
				jobseeker = new JobSeekerMain(
							rs.getString("js.id"),
							rs.getString("js.name"),
							rs.getString("js.kana"),
							rs.getString("js.sex"),
							rs.getDate("js.birthdt"),
							rs.getInt("js.age"),
							rs.getString("js.postal"),
							rs.getString("js.address"),
							rs.getString("js.nearstation"),
							rs.getString("js.phone"),
							rs.getString("js.mobile"),
							rs.getString("js.partner"),
							rs.getInt("js.huyou"),
							rs.getString("js.education"),
							rs.getString("js.hopejob1"),
							rs.getString("js.hopejob2"),
							rs.getString("js.hopejob3"),
							rs.getString("js.hopejobcategory"),
							rs.getString("js.hopeworkplace"),
							rs.getString("js.hopekoyoukeitai"),
							rs.getInt("js.hopeworkingdate"),
							rs.getInt("js.hopebegintime"),
							rs.getInt("js.hopeendtime"),
							rs.getInt("js.hopesalary"),
							rs.getInt("js.hopejikyu"),
							rs.getString("js.hopeetc"),
							rs.getString("js.driverlicense"),
							rs.getString("js.licenseetc"),
							rs.getString("js.pasokonskill"),
							rs.getString("js.caution"),
							rs.getString("st.name"),
							rs.getString("js.tantoustaffid"),
							rs.getString("js.password"),
							rs.getDate("js.createdt"),
							rs.getString("js.createuserid"),
							rs.getDate("js.updatedt"),
							rs.getString("js.updateuserid"),
							rs.getString("js.deleteflag")
							);
				}
			} catch(SQLException e) {
				throw new IOException(e);
			}
		} catch(SQLException e) {
			throw new IOException(e);
		}

		return jobseeker;

	}
}
