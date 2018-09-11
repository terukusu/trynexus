package jp.or.adash.nexus.entity;

/**
 * 求職者職歴マスタのEntityクラス
 * @author pgjavaAT
 *
 */
public class JsCareer {

	/**
	 * jobseekerid 求職者ID
	* career 職歴
	* nyusyokudt 入職年月
	* taisyokudt 退職年月
	 */
	private int id;
	private String career;
	private int nyusyokudt;
	private int taisyokudt;

	public JsCareer(int id, String career, int nyusyokudt, int taisyokudt) {
		this.id = id;
		this.career = career;
		this.nyusyokudt = nyusyokudt;
		this.taisyokudt = taisyokudt;
	}

	/**
	 * 求職者IDを返す
	 * @return id
	 */
	public int getId() {
		return id;
	}

	/**
	 * 職歴を返す
	 * @return career
	 */
	public String getCareer() {
		return career;
	}

	/**
	 * 入職年月を返す
	 * @return nyusyokudt
	 */
	public int getNyusyokudt() {
		return nyusyokudt;
	}

	/**
	 * 退職年月を返す
	 * @return taisyokudt
	 */
	public int getTaisyokudt() {
		return taisyokudt;
	}

}
