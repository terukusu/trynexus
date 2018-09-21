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
	 *
	 */

	private int jobseekersaiban;
	private int kyujinsaiban;
	private int companysaiban;

	public Saiban(int jobseekersaiban, int kyujinsaiban, int companysaiban) {
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


}
