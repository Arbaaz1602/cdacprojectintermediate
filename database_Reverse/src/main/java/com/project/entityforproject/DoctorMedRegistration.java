package com.project.entityforproject;
// Generated 03-Mar-2023, 8:40:48 pm by Hibernate Tools 4.3.6.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * DoctorMedRegistration generated by hbm2java
 */
@Entity
@Table(name = "doctor_med_registration", catalog = "project")
public class DoctorMedRegistration implements java.io.Serializable {

	private int medicalRegId;
	private String registrationCouncil;
	private Date registrationYear;
	private String degree;
	private String college;
	private Date yearOfCompletion;
	private Date lastUpdated;
	private String extraCol1;
	private String extraCol2;
	private String extraCol3;
	private Set doctorPrimaries = new HashSet(0);

	public DoctorMedRegistration() {
	}

	public DoctorMedRegistration(int medicalRegId, String registrationCouncil, Date registrationYear, String degree,
			String college, Date yearOfCompletion) {
		this.medicalRegId = medicalRegId;
		this.registrationCouncil = registrationCouncil;
		this.registrationYear = registrationYear;
		this.degree = degree;
		this.college = college;
		this.yearOfCompletion = yearOfCompletion;
	}

	public DoctorMedRegistration(int medicalRegId, String registrationCouncil, Date registrationYear, String degree,
			String college, Date yearOfCompletion, Date lastUpdated, String extraCol1, String extraCol2,
			String extraCol3, Set doctorPrimaries) {
		this.medicalRegId = medicalRegId;
		this.registrationCouncil = registrationCouncil;
		this.registrationYear = registrationYear;
		this.degree = degree;
		this.college = college;
		this.yearOfCompletion = yearOfCompletion;
		this.lastUpdated = lastUpdated;
		this.extraCol1 = extraCol1;
		this.extraCol2 = extraCol2;
		this.extraCol3 = extraCol3;
		this.doctorPrimaries = doctorPrimaries;
	}

	@Id

	@Column(name = "Medical_Reg_Id", unique = true, nullable = false)
	public int getMedicalRegId() {
		return this.medicalRegId;
	}

	public void setMedicalRegId(int medicalRegId) {
		this.medicalRegId = medicalRegId;
	}

	@Column(name = "Registration_Council", nullable = false, length = 100)
	public String getRegistrationCouncil() {
		return this.registrationCouncil;
	}

	public void setRegistrationCouncil(String registrationCouncil) {
		this.registrationCouncil = registrationCouncil;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "Registration_Year", nullable = false, length = 4)
	public Date getRegistrationYear() {
		return this.registrationYear;
	}

	public void setRegistrationYear(Date registrationYear) {
		this.registrationYear = registrationYear;
	}

	@Column(name = "Degree", nullable = false, length = 20)
	public String getDegree() {
		return this.degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	@Column(name = "College", nullable = false, length = 100)
	public String getCollege() {
		return this.college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "Year_Of_Completion", nullable = false, length = 4)
	public Date getYearOfCompletion() {
		return this.yearOfCompletion;
	}

	public void setYearOfCompletion(Date yearOfCompletion) {
		this.yearOfCompletion = yearOfCompletion;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "Last_Updated", length = 19)
	public Date getLastUpdated() {
		return this.lastUpdated;
	}

	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	@Column(name = "Extra_Col1", length = 100)
	public String getExtraCol1() {
		return this.extraCol1;
	}

	public void setExtraCol1(String extraCol1) {
		this.extraCol1 = extraCol1;
	}

	@Column(name = "Extra_Col2", length = 100)
	public String getExtraCol2() {
		return this.extraCol2;
	}

	public void setExtraCol2(String extraCol2) {
		this.extraCol2 = extraCol2;
	}

	@Column(name = "Extra_Col3", length = 100)
	public String getExtraCol3() {
		return this.extraCol3;
	}

	public void setExtraCol3(String extraCol3) {
		this.extraCol3 = extraCol3;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "doctorMedRegistration")
	public Set getDoctorPrimaries() {
		return this.doctorPrimaries;
	}

	public void setDoctorPrimaries(Set doctorPrimaries) {
		this.doctorPrimaries = doctorPrimaries;
	}

}
