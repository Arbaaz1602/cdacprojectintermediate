package com.project.entity;
// Generated 24-Feb-2023, 5:59:39 pm by Hibernate Tools 4.3.6.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * DoctorPrimary generated by hbm2java
 */
@Entity
@Table(name = "doctor_primary", catalog = "project")
/*
 * uniqueConstraints = {
 * 
 * @UniqueConstraint(columnNames = "ADHAAR_CARD"), @UniqueConstraint(columnNames
 * = "EMAIL"),
 * 
 * @UniqueConstraint(columnNames =
 * "MEDICAL_REG_ID"), @UniqueConstraint(columnNames = "PAN_CARD"),
 * 
 * @UniqueConstraint(columnNames = "PHONE_NUMBER") })
 */
public class DoctorPrimary implements java.io.Serializable {

	private int doctorId;
	private Integer address;
	private int doctorAvailMaster;
	private int doctorEstablishment;
	private int doctorMedRegistration;
	private int securityQuestions;
	private String securityQuestionsAnswer;
	private String fname;
	private String lname;
	private String email;
	private String pwd;
	private String phoneNumber;
	private char gender;
	private String panCard;
	private String adhaarCard;
	private String specialization;
	private int yearOfExperience;
	private char profileStatus;
	private String profilePhoto;
	private Date lastUpdated;
	private String extraCol1;
	private String extraCol2;
	private String extraCol3;

	public DoctorPrimary() {
	}

	public DoctorPrimary(int address, int doctorAvailMaster, int doctorEstablishment,
			int doctorMedRegistration, int securityQuestions,
			String securityQuestionsAnswer, String fname, String lname, String email, String pwd, String phoneNumber,
			char gender, String panCard, String adhaarCard, String specialization, int yearOfExperience,
			char profileStatus) {
		this.address = address;
		this.doctorAvailMaster = doctorAvailMaster;
		this.doctorEstablishment = doctorEstablishment;
		this.doctorMedRegistration = doctorMedRegistration;
		this.securityQuestions = securityQuestions;
		this.securityQuestionsAnswer = securityQuestionsAnswer;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.pwd = pwd;
		this.phoneNumber = phoneNumber;
		this.gender = gender;
		this.panCard = panCard;
		this.adhaarCard = adhaarCard;
		this.specialization = specialization;
		this.yearOfExperience = yearOfExperience;
		this.profileStatus = profileStatus;
	}

	public DoctorPrimary(int address, int doctorAvailMaster, int doctorEstablishment,
			int doctorMedRegistration, int securityQuestions,
			String securityQuestionsAnswer, String fname, String lname, String email, String pwd, String phoneNumber,
			char gender, String panCard, String adhaarCard, String specialization, int yearOfExperience,
			char profileStatus, String profilePhoto, Date lastUpdated, String extraCol1, String extraCol2,
			String extraCol3) {
		this.address = address;
		this.doctorAvailMaster = doctorAvailMaster;
		this.doctorEstablishment = doctorEstablishment;
		this.doctorMedRegistration = doctorMedRegistration;
		this.securityQuestions = securityQuestions;
		this.securityQuestionsAnswer = securityQuestionsAnswer;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.pwd = pwd;
		this.phoneNumber = phoneNumber;
		this.gender = gender;
		this.panCard = panCard;
		this.adhaarCard = adhaarCard;
		this.specialization = specialization;
		this.yearOfExperience = yearOfExperience;
		this.profileStatus = profileStatus;
		this.profilePhoto = profilePhoto;
		this.lastUpdated = lastUpdated;
		this.extraCol1 = extraCol1;
		this.extraCol2 = extraCol2;
		this.extraCol3 = extraCol3;
	}

		
	@Id
	@Column(name = "DOCTOR_ID", unique = true, nullable = false)
	public int getDoctorId() {
		return this.doctorId;
	}

	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}

	//@ManyToOne(fetch = FetchType.LAZY)
	//@JoinColumn(name = "ADDRESS_ID", nullable = false)
	public int getAddress() {
		return this.address;
	}

	public void setAddress(int address) {
		this.address = address;
	}

	//@OneToOne(fetch = FetchType.LAZY)
	//@PrimaryKeyJoinColumn
	public int getDoctorAvailMaster() {
		return this.doctorAvailMaster;
	}

	public void setDoctorAvailMaster(int doctorAvailMaster) {
		this.doctorAvailMaster = doctorAvailMaster;
	}

	//@ManyToOne(fetch = FetchType.LAZY)
	//@JoinColumn(name = "EID", nullable = false)
	public int getDoctorEstablishment() {
		return this.doctorEstablishment;
	}

	public void setDoctorEstablishment(int doctorEstablishment) {
		this.doctorEstablishment = doctorEstablishment;
	}

	//@ManyToOne(fetch = FetchType.LAZY)
	//@JoinColumn(name = "MEDICAL_REG_ID", unique = true, nullable = false)
	public int getDoctorMedRegistration() {
		return this.doctorMedRegistration;
	}

	public void setDoctorMedRegistration(int doctorMedRegistration) {
		this.doctorMedRegistration = doctorMedRegistration;
	}

	//@ManyToOne(fetch = FetchType.LAZY)
	//@JoinColumn(name = "SECURITY_QUESTIONS_ID", nullable = false)
	public int getSecurityQuestions() {
		return this.securityQuestions;
	}

	public void setSecurityQuestions(int securityQuestions) {
		this.securityQuestions = securityQuestions;
	}

	@Column(name = "SECURITY_QUESTIONS_ANSWER", nullable = false, length = 50)
	public String getSecurityQuestionsAnswer() {
		return this.securityQuestionsAnswer;
	}

	public void setSecurityQuestionsAnswer(String securityQuestionsAnswer) {
		this.securityQuestionsAnswer = securityQuestionsAnswer;
	}

	@Column(name = "FNAME", nullable = false, length = 50)
	public String getFname() {
		return this.fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	@Column(name = "LNAME", nullable = false, length = 50)
	public String getLname() {
		return this.lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	@Column(name = "EMAIL", unique = true, nullable = false, length = 50)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "PWD", nullable = false, length = 50)
	public String getPwd() {
		return this.pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	@Column(name = "PHONE_NUMBER", unique = true, nullable = false, length = 13)
	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Column(name = "GENDER", nullable = false, length = 1)
	public char getGender() {
		return this.gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	@Column(name = "PAN_CARD", unique = true, nullable = false, length = 10)
	public String getPanCard() {
		return this.panCard;
	}

	public void setPanCard(String panCard) {
		this.panCard = panCard;
	}

	@Column(name = "ADHAAR_CARD", unique = true, nullable = false, length = 12)
	public String getAdhaarCard() {
		return this.adhaarCard;
	}

	public void setAdhaarCard(String adhaarCard) {
		this.adhaarCard = adhaarCard;
	}

	@Column(name = "SPECIALIZATION", nullable = false, length = 50)
	public String getSpecialization() {
		return this.specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	@Column(name = "YEAR_OF_EXPERIENCE", nullable = false)
	public int getYearOfExperience() {
		return this.yearOfExperience;
	}

	public void setYearOfExperience(int yearOfExperience) {
		this.yearOfExperience = yearOfExperience;
	}

	@Column(name = "PROFILE_STATUS", nullable = false, length = 1)
	public char getProfileStatus() {
		return this.profileStatus;
	}

	public void setProfileStatus(char profileStatus) {
		this.profileStatus = profileStatus;
	}

	@Override
	public String toString() {
		return "DoctorPrimary [doctorId=" + doctorId + ", address=" + address + ", doctorAvailMaster="
				+ doctorAvailMaster + ", doctorEstablishment=" + doctorEstablishment + ", doctorMedRegistration="
				+ doctorMedRegistration + ", securityQuestions=" + securityQuestions + ", securityQuestionsAnswer="
				+ securityQuestionsAnswer + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ", pwd="
				+ pwd + ", phoneNumber=" + phoneNumber + ", gender=" + gender + ", panCard=" + panCard + ", adhaarCard="
				+ adhaarCard + ", specialization=" + specialization + ", yearOfExperience=" + yearOfExperience
				+ ", profileStatus=" + profileStatus + "]";
	}

	
	  @Column(name = "PROFILE_PHOTO", length = 100) public String getProfilePhoto()
	  { return this.profilePhoto; }
	  
	  public void setProfilePhoto(String profilePhoto) { this.profilePhoto =
	  profilePhoto; }
	  
	  @Temporal(TemporalType.TIMESTAMP)
	  
	  @Column(name = "LAST_UPDATED", length = 19) public Date getLastUpdated() {
	  return this.lastUpdated; }
	  
	  public void setLastUpdated(Date lastUpdated) { this.lastUpdated =
	  lastUpdated; }
	  
	  @Column(name = "EXTRA_COL1", length = 100) public String getExtraCol1() {
	  return this.extraCol1; }
	  
	  public void setExtraCol1(String extraCol1) { this.extraCol1 = extraCol1; }
	  
	  @Column(name = "EXTRA_COL2", length = 100) public String getExtraCol2() {
	  return this.extraCol2; }
	  
	  public void setExtraCol2(String extraCol2) { this.extraCol2 = extraCol2; }
	  
	  @Column(name = "EXTRA_COL3", length = 100) public String getExtraCol3() {
	  return this.extraCol3; }
	  
	  public void setExtraCol3(String extraCol3) { this.extraCol3 = extraCol3; }
	 
}
