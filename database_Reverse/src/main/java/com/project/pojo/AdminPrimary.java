package com.project.pojo;
// Generated 24-Feb-2023, 5:28:10 pm by Hibernate Tools 5.4.33.Final

import java.util.Date;

/**
 * AdminPrimary generated by hbm2java
 */
public class AdminPrimary implements java.io.Serializable {

	private Integer adminId;
	private String email;
	private String pwd;
	private Date lastUpdatedDate;
	private String extCol1;
	private String extCol2;
	private String extCol3;

	public AdminPrimary() {
	}

	public AdminPrimary(String email, String pwd) {
		this.email = email;
		this.pwd = pwd;
	}

	public AdminPrimary(String email, String pwd, Date lastUpdatedDate, String extCol1, String extCol2,
			String extCol3) {
		this.email = email;
		this.pwd = pwd;
		this.lastUpdatedDate = lastUpdatedDate;
		this.extCol1 = extCol1;
		this.extCol2 = extCol2;
		this.extCol3 = extCol3;
	}

	public Integer getAdminId() {
		return this.adminId;
	}

	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPwd() {
		return this.pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public Date getLastUpdatedDate() {
		return this.lastUpdatedDate;
	}

	public void setLastUpdatedDate(Date lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}

	public String getExtCol1() {
		return this.extCol1;
	}

	public void setExtCol1(String extCol1) {
		this.extCol1 = extCol1;
	}

	public String getExtCol2() {
		return this.extCol2;
	}

	public void setExtCol2(String extCol2) {
		this.extCol2 = extCol2;
	}

	public String getExtCol3() {
		return this.extCol3;
	}

	public void setExtCol3(String extCol3) {
		this.extCol3 = extCol3;
	}

}
