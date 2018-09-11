package jp.or.adash.nexus.entity;

public class JsCharacter {
	private char jobseekerid;
	private int characterid;

	public JsCharacter(char jobseekerid, int characterid) {
		this.jobseekerid = jobseekerid;
		this.characterid = characterid;
	}

	/**
	 * @return jobseekerid
	 */
	public char getJobseekerid() {
		return jobseekerid;
	}

	/**
	 * @return characterid
	 */
	public int getCharacterid() {
		return characterid;
	}

}
