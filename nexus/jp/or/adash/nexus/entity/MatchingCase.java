package jp.or.adash.nexus.entity;

import java.util.Date;

/**
 * マッチング事例マスタのEntityクラス
 * @author pgjavaAT
 *
 */
public class MatchingCase {

	/**
	 * id マッチング事例ID
	* kyujinno 求人NO
	* jobseekerid 求職者ID
	* staffid 職業紹介者ID
	* interviewdt 面接日
	* enterdt 入社日
	* assessment 評価
	* note 備考
	* createdt 新規登録日
	* createuserid 新規登録ユーザー
	* updatedt 最終更新日
	* updateuserid 最終更新ユーザー
	 */
	//private int id;
	private String kyujinno;
	private String jobseekerid;
	private String staffid;
	private Date interviewdt;
	private Date enterdt;
	private String assessment;
	private String note;
	private Date createdt;
	private String createuserid;
	private Date upDatedt;
	private String upDateuserid;

	public MatchingCase(String kyujinno, String jobseekerid, String staffid, Date interviewdt, Date enterdt,
			String assessment, String note, Date createdt, String createuserid, Date upDatedt,
			String upDateuserid) {
		//this.id = id;
		this.kyujinno = kyujinno;
		this.jobseekerid = jobseekerid;
		this.staffid = staffid;
		this.interviewdt = interviewdt;
		this.enterdt = enterdt;
		this.assessment = assessment;
		this.note = note;
		this.createdt = createdt;
		this.createuserid = createuserid;
		this.upDatedt = upDatedt;
		this.upDateuserid = upDateuserid;
	}

	/**
	 * マッチング事例IDを返す
	 * @return id
	 */
	//public int getId() {
		//return id;
	//}

	public MatchingCase(String kyujinno2, String jobseekerid2, String stffid, Date interviewdt2, Date enterdt2,
			String assessment2, String note2) {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	/**
	 * 求人NOを返す
	 * @return kyujinno
	 */
	public String getKyujinno() {
		return kyujinno;
	}

	/**
	 * 求職者IDを返す
	 * @return jobseekerid
	 */
	public String getJobseekerid() {
		return jobseekerid;
	}

	/**
	 * 職業紹介者IDを返す
	 * @return staffid
	 */
	public String getStaffid() {
		return staffid;
	}

	/**
	 * 面接日を返す
	 * @return interviewdt
	 */
	public Date getInterviewdt() {
		return interviewdt;
	}

	/**
	 * 入社日を返す
	 * @return enterdt
	 */
	public Date getEnterdt() {
		return enterdt;
	}

	/**
	 * 評価を返す
	 * @return assessment
	 */
	public String getAssessment() {
		return assessment;
	}

	/**
	 * 備考を返す
	 * @return note
	 */
	public String getNote() {
		return note;
	}

	/**
	 * 新規登録日を返す
	 * @return createdt
	 */
	public Date getCreatedt() {
		return createdt;
	}

	/**
	 * 新規登録ユーザーを返す
	 * @return createuserid
	 */
	public String getCreateuserid() {
		return createuserid;
	}

	/**
	 * 最終更新日を返す
	 * @return upDatedt
	 */
	public Date getUpDatedt() {
		return upDatedt;
	}

	/**
	 * 最終更新ユーザーを返す
	 * @return upDateuserid
	 */
	public String getUpDateuserid() {
		return upDateuserid;
	}

}
