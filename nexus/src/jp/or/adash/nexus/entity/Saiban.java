package jp.or.adash.nexus.entity;

/**
 * 採番テーブルのEntityクラス
 * @author aizawa1807
 *
 */
public class Saiban {

	/**
	 * jobseekersaiban 求職者ID採番
     * kyujinsaiban　求人NO採番
     * companysaiban　事業所番号採番
     * staffsaiban 職業紹介者採番
	 *
	 */

	private int jobseekersaiban;
	private int kyujinsaiban;
	private int companysaiban;
	private int staffsaiban;

	public Saiban(int staffsaiban, int jobseekersaiban, int kyujinsaiban, int companysaiban) {
		this.staffsaiban =staffsaiban;
		this.jobseekersaiban = jobseekersaiban;
		this.kyujinsaiban = kyujinsaiban;
		this.companysaiban = companysaiban;
	}



	/**
	 * 求職者ID採番を返す
	 * @return jobseekersaiban
	 */
	public int getJobseekersaiban() {
		return jobseekersaiban;
	}

	/**
	 * 求人NO採番を返す
	 * @return kyujinsaiban
	 */
	public int getKyujinsaiban() {
		return kyujinsaiban;
	}

	/**
	 * 事業所番号採番を返す
	 * @return companysaiban
	 */
	public int getCompanysaiban() {
		return companysaiban;
	}

	/**
	 *職業紹介者ID採番を返す
	 * @return staffsaiban
	 */
	public int getStaffsaiban() {
		return staffsaiban;
	}
}
