package jp.or.adash.nexus.entity;

import java.util.Date;

/**
 * 求職者マスタのEntityクラス
 * @author pgjavaAT
 *
 */
public class JobSeeker {
	/**
	 * id 求職者ID
	* name 求職者氏名
	* kana 氏名（カナ）
	* birthdt 生年月日
	* sex 性別
	* age 年齢
	* postal 自宅郵便番号
	* address 自宅住所
	* nearstation 最寄り駅
	* phone 自宅TEL
	* mobile 携帯TEL
	* partner 配偶者
	* huyou 扶養家族
	* education 学歴
	* hopejob1 希望職種１
	* hopejob2 希望職種２
	* hopejob3 希望職種３
	* hopejobcategory 希望業種
	* hopeworkplace 希望勤務地
	* hopekoyoukeitai 希望雇用形態
	* hopeworkingdate 希望勤務日時
	* hopebegintime 希望勤務時間（開始）
	* hopeendtime 希望勤務時間（終了）
	* hopesalary 希望月給
	* hopejikyu 希望時間給
	* hopeetc その他希望
	* driverlicense 自動車免許
	* licenseetc その他免許
	* pasokonskill パソコンスキル
	* caution 留意点
	* tantoustaffid 担当職業紹介者ID
	* password パスワード
	* createdt 新規登録日
	* createuserid 新規登録ユーザー
	* updatedt 最終更新日
	* updateuserid 最終更新ユーザー
	* deleteflag 削除フラグ
	 */
	private String id;
	private String name;
	private String kana;
	private Date birthdt;
	private String sex;
	private int age;
	private String postal;
	private String address;
	private String nearstation;
	private String phone;
	private String mobile;
	private String partner;
	private int huyou;
	private String education;
	private String hopejob1;
	private String hopejob2;
	private String hopejob3;
	private String hopejobcategory;
	private String hopeworkplace;
	private String hopekoyoukeitai;
	private int hopeworkingDate;
	private int hopebegintime;
	private int hopeendtime;
	private int hopesalary;
	private int hopejikyu;
	private String hopeetc;
	private String driverlicense;
	private String licenseetc;
	private String pasokonskill;
	private String caution;
	private String tantoustaffid;
	private String password;
	private Date createdt;
	private String createuserid;
	private Date upDatedt;
	private String upDateuserid;
	private String deleteflag;

	public JobSeeker(String id, String name, String kana, Date birthdt, String sex, int age, String postal,
			String address, String nearstation, String phone, String mobile, String partner, int huyou,
			String education, String hopejob1, String hopejob2, String hopejob3, String hopejobcategory,
			String hopeworkplace, String hopekoyoukeitai, int hopeworkingDate, int hopebegintime, int hopeendtime,
			int hopesalary, int hopejikyu, String hopeetc, String driverlicense, String licenseetc, String pasokonskill,
			String caution, String tantoustaffid, String password, Date createdt, String createuserid,
			Date upDatedt, String upDateuserid, String deleteflag) {

		this.id = id;
		this.name = name;
		this.kana = kana;
		this.birthdt = birthdt;
		this.sex = sex;
		this.age = age;
		this.postal = postal;
		this.address = address;
		this.nearstation = nearstation;
		this.phone = phone;
		this.mobile = mobile;
		this.partner = partner;
		this.huyou = huyou;
		this.education = education;
		this.hopejob1 = hopejob1;
		this.hopejob2 = hopejob2;
		this.hopejob3 = hopejob3;
		this.hopejobcategory = hopejobcategory;
		this.hopeworkplace = hopeworkplace;
		this.hopekoyoukeitai = hopekoyoukeitai;
		this.hopeworkingDate = hopeworkingDate;
		this.hopebegintime = hopebegintime;
		this.hopeendtime = hopeendtime;
		this.hopesalary = hopesalary;
		this.hopejikyu = hopejikyu;
		this.hopeetc = hopeetc;
		this.driverlicense = driverlicense;
		this.licenseetc = licenseetc;
		this.pasokonskill = pasokonskill;
		this.caution = caution;
		this.tantoustaffid = tantoustaffid;
		this.password = password;
		this.createdt = createdt;
		this.createuserid = createuserid;
		this.upDatedt = upDatedt;
		this.upDateuserid = upDateuserid;
		this.deleteflag = deleteflag;
	}

	/**
	 * 求職者IDを返す
	 * @return id
	 */
	public String getId() {
		return id;
	}

	/**
	 * 求職者氏名を返す
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * 氏名（カナ）を返す
	 * @return kana
	 */
	public String getKana() {
		return kana;
	}

	/**
	 * 生年月日を返す
	 * @return birthdt
	 */
	public Date getBirthdt() {
		return birthdt;
	}

	/**
	 * 性別を返す
	 * @return sex
	 */
	public String getSex() {
		return sex;
	}

	/**
	 * 年齢を返す
	 * @return age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * 自宅郵便番号を返す
	 * @return postal
	 */
	public String getPostal() {
		return postal;
	}

	/**
	 * 自宅住所を返す
	 * @return address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * 最寄り駅を返す
	 * @return nearstation
	 */
	public String getNearstation() {
		return nearstation;
	}

	/**
	 * 自宅TELを返す
	 * @return phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * 携帯TELを返す
	 * @return mobile
	 */
	public String getMobile() {
		return mobile;
	}

	/**
	 * 配偶者を返す
	 * @return partner
	 */
	public String getPartner() {
		return partner;
	}

	/**
	 * 扶養家族を返す
	 * @return huyou
	 */
	public int getHuyou() {
		return huyou;
	}

	/**
	 * 学歴を返す
	 * @return education
	 */
	public String getEducation() {
		return education;
	}

	/**
	 * 希望職種１を返す
	 * @return hopejob1
	 */
	public String getHopejob1() {
		return hopejob1;
	}

	/**
	 * 希望職種２を返す
	 * @return hopejob2
	 */
	public String getHopejob2() {
		return hopejob2;
	}

	/**
	 * 希望職種３を返す
	 * @return hopejob3
	 */
	public String getHopejob3() {
		return hopejob3;
	}

	/**
	 * 希望業種を返す
	 * @return hopejobcategory
	 */
	public String getHopejobcategory() {
		return hopejobcategory;
	}

	/**
	 * 希望勤務地を返す
	 * @return hopeworkplace
	 */
	public String getHopeworkplace() {
		return hopeworkplace;
	}

	/**
	 * 希望雇用形態を返す
	 * @return hopekoyoukeitai
	 */
	public String getHopekoyoukeitai() {
		return hopekoyoukeitai;
	}

	/**
	 * 希望勤務日時を返す
	 * @return hopeworkingDate
	 */
	public int getHopeworkingDate() {
		return hopeworkingDate;
	}

	/**
	 * 希望勤務時間（開始）を返す
	 * @return hopebegintime
	 */
	public int getHopebegintime() {
		return hopebegintime;
	}

	/**
	 * 希望勤務時間（終了）を返す
	 * @return hopeendtime
	 */
	public int getHopeendtime() {
		return hopeendtime;
	}

	/**
	 * 希望月給を返す
	 * @return hopesalary
	 */
	public int getHopesalary() {
		return hopesalary;
	}

	/**
	 * 希望時間給を返す
	 * @return hopejikyu
	 */
	public int getHopejikyu() {
		return hopejikyu;
	}

	/**
	 * その他希望を返す
	 * @return hopeetc
	 */
	public String getHopeetc() {
		return hopeetc;
	}

	/**
	 * 自動車免許を返す
	 * @return driverlicense
	 */
	public String getDriverlicense() {
		return driverlicense;
	}

	/**
	 * その他免許を返す
	 * @return licenseetc
	 */
	public String getLicenseetc() {
		return licenseetc;
	}

	/**
	 * パソコンスキルを返す
	 * @return pasokonskill
	 */
	public String getPasokonskill() {
		return pasokonskill;
	}

	/**
	 * 留意点を返す
	 * @return caution
	 */
	public String getCaution() {
		return caution;
	}

	/**
	 * 担当職業紹介者IDを返す
	 * @return tantoustaffid
	 */
	public String getTantoustaffid() {
		return tantoustaffid;
	}

	/**
	 * パスワードを返す
	 * @return password
	 */
	public String getPassword() {
		return password;
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

	/**
	 * 削除フラグを返す
	 * @return deleteflag
	 */
	public String getDeleteflag() {
		return deleteflag;
	}

}
