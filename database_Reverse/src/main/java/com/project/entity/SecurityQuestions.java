package com.project.entity;
// Generated 24-Feb-2023, 5:59:39 pm by Hibernate Tools 4.3.6.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * SecurityQuestions generated by hbm2java
 */
@Entity
@Table(name = "security_questions", catalog = "project23")
public class SecurityQuestions implements java.io.Serializable {

	private Integer securityQuestionsId;
	private String securityQuestion;
	private Date lastUpdated;
	private String extraCol1;
	private String extraCol2;
	private String extraCol3;
	
	private Set<DoctorPrimary> doctorPrimaries = new HashSet<DoctorPrimary>(0);

	public SecurityQuestions() {
	}

	public SecurityQuestions(String securityQuestion) {
		this.securityQuestion = securityQuestion;
	}

	public SecurityQuestions(String securityQuestion, Date lastUpdated, String extraCol1, String extraCol2) {
		this.securityQuestion = securityQuestion;
		this.lastUpdated = lastUpdated;
		this.extraCol1 = extraCol1;
		this.extraCol2 = extraCol2;
		this.extraCol3 = extraCol3;
		this.doctorPrimaries = doctorPrimaries;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "SECURITY_QUESTIONS_ID", unique = true, nullable = false)
	public Integer getSecurityQuestionsId() {
		return this.securityQuestionsId;
	}

	public void setSecurityQuestionsId(Integer securityQuestionsId) {
		this.securityQuestionsId = securityQuestionsId;
	}

	@Column(name = "SECURITY_QUESTION", nullable = false, length = 50)
	public String getSecurityQuestion() {
		return this.securityQuestion;
	}

	public void setSecurityQuestion(String securityQuestion) {
		this.securityQuestion = securityQuestion;
	}
	
	  @Temporal(TemporalType.TIMESTAMP)
	  
	  @Column(name = "LAST_UPDATED", length = 19) public Date getLastUpdated() {
	  return this.lastUpdated; }
	  
	  public void setLastUpdated(Date lastUpdated) { this.lastUpdated =
	  lastUpdated; }
	  
	  @Column(name = "EXTRA_COL1", length = 200) public String getExtraCol1() {
	  return this.extraCol1; }
	  
	  public void setExtraCol1(String extraCol1) { this.extraCol1 = extraCol1; }
	  
	  @Column(name = "EXTRA_COL2", length = 200) public String getExtraCol2() {
	  return this.extraCol2; }
	  
	  public void setExtraCol2(String extraCol2) { this.extraCol2 = extraCol2; }
	  
	  @Column(name = "EXTRA_COL3", length = 200) public String getExtraCol3() {
	  return this.extraCol3; }
	  
	  public void setExtraCol3(String extraCol3) { this.extraCol3 = extraCol3; }
	  
	  
	  
	  @OneToMany(fetch = FetchType.LAZY, mappedBy = "securityQuestions") public
	  Set<DoctorPrimary> getDoctorPrimaries() { return this.doctorPrimaries; }
	  
	  public void setDoctorPrimaries(Set<DoctorPrimary> doctorPrimaries) {
	  this.doctorPrimaries = doctorPrimaries; }
	 
}
