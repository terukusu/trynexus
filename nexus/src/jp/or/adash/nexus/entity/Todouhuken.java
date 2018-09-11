package jp.or.adash.nexus.entity;

public class Todouhuken {
	private int cd;
	private String name;

	public Todouhuken(int cd, String name) {
		this.cd = cd;
		this.name = name;
	}

	/**
	 * @return cd
	 */
	public int getCd() {
		return cd;
	}

	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}

}