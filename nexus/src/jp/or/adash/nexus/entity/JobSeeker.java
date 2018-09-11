package jp.or.adash.nexus.entity;
import java.sql.Date;
import java.sql.Timestamp;

public class JobSeeker {
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
	private Timestamp createdt;
	private String createuserid;
	private Timestamp upDatedt;
	private String upDateuserid;
	private String deleteflag;

	public JobSeeker(String id, String name, String kana, Date birthdt, String sex, int age, String postal,
			String address, String nearstation, String phone, String mobile, String partner, int huyou,
			String education, String hopejob1, String hopejob2, String hopejob3, String hopejobcategory,
			String hopeworkplace, String hopekoyoukeitai, int hopeworkingDate, int hopebegintime, int hopeendtime,
			int hopesalary, int hopejikyu, String hopeetc, String driverlicense, String licenseetc, String pasokonskill,
			String caution, String tantoustaffid, String password, Timestamp createdt, String createuserid,
			Timestamp upDatedt, String upDateuserid, String deleteflag) {

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
	 * @return id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return kana
	 */
	public String getKana() {
		return kana;
	}

	/**
	 * @return birthdt
	 */
	public Date getBirthdt() {
		return birthdt;
	}

	/**
	 * @return sex
	 */
	public String getSex() {
		return sex;
	}

	/**
	 * @return age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @return postal
	 */
	public String getPostal() {
		return postal;
	}

	/**
	 * @return address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @return nearstation
	 */
	public String getNearstation() {
		return nearstation;
	}

	/**
	 * @return phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @return mobile
	 */
	public String getMobile() {
		return mobile;
	}

	/**
	 * @return partner
	 */
	public String getPartner() {
		return partner;
	}

	/**
	 * @return huyou
	 */
	public int getHuyou() {
		return huyou;
	}

	/**
	 * @return education
	 */
	public String getEducation() {
		return education;
	}

	/**
	 * @return hopejob1
	 */
	public String getHopejob1() {
		return hopejob1;
	}

	/**
	 * @return hopejob2
	 */
	public String getHopejob2() {
		return hopejob2;
	}

	/**
	 * @return hopejob3
	 */
	public String getHopejob3() {
		return hopejob3;
	}

	/**
	 * @return hopejobcategory
	 */
	public String getHopejobcategory() {
		return hopejobcategory;
	}

	/**
	 * @return hopeworkplace
	 */
	public String getHopeworkplace() {
		return hopeworkplace;
	}

	/**
	 * @return hopekoyoukeitai
	 */
	public String getHopekoyoukeitai() {
		return hopekoyoukeitai;
	}

	/**
	 * @return hopeworkingDate
	 */
	public int getHopeworkingDate() {
		return hopeworkingDate;
	}

	/**
	 * @return hopebegintime
	 */
	public int getHopebegintime() {
		return hopebegintime;
	}

	/**
	 * @return hopeendtime
	 */
	public int getHopeendtime() {
		return hopeendtime;
	}

	/**
	 * @return hopesalary
	 */
	public int getHopesalary() {
		return hopesalary;
	}

	/**
	 * @return hopejikyu
	 */
	public int getHopejikyu() {
		return hopejikyu;
	}

	/**
	 * @return hopeetc
	 */
	public String getHopeetc() {
		return hopeetc;
	}

	/**
	 * @return driverlicense
	 */
	public String getDriverlicense() {
		return driverlicense;
	}

	/**
	 * @return licenseetc
	 */
	public String getLicenseetc() {
		return licenseetc;
	}

	/**
	 * @return pasokonskill
	 */
	public String getPasokonskill() {
		return pasokonskill;
	}

	/**
	 * @return caution
	 */
	public String getCaution() {
		return caution;
	}

	/**
	 * @return tantoustaffid
	 */
	public String getTantoustaffid() {
		return tantoustaffid;
	}

	/**
	 * @return password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @return createdt
	 */
	public Timestamp getCreatedt() {
		return createdt;
	}

	/**
	 * @return createuserid
	 */
	public String getCreateuserid() {
		return createuserid;
	}

	/**
	 * @return upDatedt
	 */
	public Timestamp getUpDatedt() {
		return upDatedt;
	}

	/**
	 * @return upDateuserid
	 */
	public String getUpDateuserid() {
		return upDateuserid;
	}

	/**
	 * @return deleteflag
	 */
	public String getDeleteflag() {
		return deleteflag;
	}


}

