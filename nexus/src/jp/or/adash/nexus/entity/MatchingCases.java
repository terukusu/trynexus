package jp.or.adash.nexus.entity;

import java.sql.Date;
import java.sql.Timestamp;

public class MatchingCases {
	private int id;
	private String kyujinno;
	private String jobseekerid;
	private String staffid;
	private java.util.Date interviewdt;
	private java.util.Date enterdt;
	private String assessment;
	private String note;
	private Timestamp createdt;
	private String createuserid;
	private Timestamp upDatedt;
	private String upDateuserid;

	public MatchingCases(int id, String kyujinno, String jobseekerid, String staffid, java.util.Date interviewdt2,
			java.util.Date enterdt2,
			String assessment, String note, Timestamp createdt, String createuserid, Timestamp upDatedt,
			String upDateuserid) {
		this.id = id;
		this.kyujinno = kyujinno;
		this.jobseekerid = jobseekerid;
		this.staffid = staffid;
		this.interviewdt = interviewdt2;
		this.enterdt = enterdt2;
		this.assessment = assessment;
		this.note = note;
		this.createdt = createdt;
		this.createuserid = createuserid;
		this.upDatedt = upDatedt;
		this.upDateuserid = upDateuserid;
	}

	public int getid() {
		return id;
	}

	public String getKyujinno() {
		return kyujinno;
	}

	public String getJobseekerid() {
		return jobseekerid;
	}

	public String getStaffid() {
		return staffid;
	}

	public Date getInterviewdt() {
		return (Date) interviewdt;
	}

	public Date getEnterdt() {
		return (Date) enterdt;
	}

	public String getAssessment() {
		return assessment;
	}

	public String getNote() {
		return note;
	}

	public Timestamp getCreatedt() {
		return createdt;
	}

	public String getCreateuserid() {
		return createuserid;
	}

	public Timestamp getUpDatedt() {
		return upDatedt;
	}

	public String getUpDateuserid() {
		return upDateuserid;
	}

}
