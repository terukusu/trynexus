package jp.or.adash.nexus.entity;

public class JsCareer {
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
	 * @return id
	 */
	public int getId() {
		return id;
	}


	/**
	 * @return career
	 */
	public String getCareer() {
		return career;
	}


	/**
	 * @return nyusyokudt
	 */
	public int getNyusyokudt() {
		return nyusyokudt;
	}


	/**
	 * @return taisyokudt
	 */
	public int getTaisyokudt() {
		return taisyokudt;
	}




}
