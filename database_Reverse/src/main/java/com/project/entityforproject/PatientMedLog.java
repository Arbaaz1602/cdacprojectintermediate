package com.project.entityforproject;
// Generated 03-Mar-2023, 8:40:48 pm by Hibernate Tools 4.3.6.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * PatientMedLog generated by hbm2java
 */
@Entity
@Table(name = "patient_med_log", catalog = "project")
public class PatientMedLog implements java.io.Serializable {

	private Integer medLogId;
	private PatientPrimary patientPrimary;
	private String prescription;
	private String labReport;
	private Date lastUpdated;
	private String drugName;
	private Boolean morning;
	private Boolean afternoon;
	private Boolean evening;
	private String extraCol1;
	private String extraCol2;
	private String extraCol3;
	private Set patientLabReports = new HashSet(0);

	public PatientMedLog() {
	}

	public PatientMedLog(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	public PatientMedLog(PatientPrimary patientPrimary, String prescription, String labReport, Date lastUpdated,
			String drugName, Boolean morning, Boolean afternoon, Boolean evening, String extraCol1, String extraCol2,
			String extraCol3, Set patientLabReports) {
		this.patientPrimary = patientPrimary;
		this.prescription = prescription;
		this.labReport = labReport;
		this.lastUpdated = lastUpdated;
		this.drugName = drugName;
		this.morning = morning;
		this.afternoon = afternoon;
		this.evening = evening;
		this.extraCol1 = extraCol1;
		this.extraCol2 = extraCol2;
		this.extraCol3 = extraCol3;
		this.patientLabReports = patientLabReports;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "MED_LOG_ID", unique = true, nullable = false)
	public Integer getMedLogId() {
		return this.medLogId;
	}

	public void setMedLogId(Integer medLogId) {
		this.medLogId = medLogId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "UID")
	public PatientPrimary getPatientPrimary() {
		return this.patientPrimary;
	}

	public void setPatientPrimary(PatientPrimary patientPrimary) {
		this.patientPrimary = patientPrimary;
	}

	@Column(name = "PRESCRIPTION")
	public String getPrescription() {
		return this.prescription;
	}

	public void setPrescription(String prescription) {
		this.prescription = prescription;
	}

	@Column(name = "LAB_REPORT")
	public String getLabReport() {
		return this.labReport;
	}

	public void setLabReport(String labReport) {
		this.labReport = labReport;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "LAST_UPDATED", nullable = false, length = 19)
	public Date getLastUpdated() {
		return this.lastUpdated;
	}

	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	@Column(name = "DRUG_NAME")
	public String getDrugName() {
		return this.drugName;
	}

	public void setDrugName(String drugName) {
		this.drugName = drugName;
	}

	@Column(name = "MORNING")
	public Boolean getMorning() {
		return this.morning;
	}

	public void setMorning(Boolean morning) {
		this.morning = morning;
	}

	@Column(name = "AFTERNOON")
	public Boolean getAfternoon() {
		return this.afternoon;
	}

	public void setAfternoon(Boolean afternoon) {
		this.afternoon = afternoon;
	}

	@Column(name = "EVENING")
	public Boolean getEvening() {
		return this.evening;
	}

	public void setEvening(Boolean evening) {
		this.evening = evening;
	}

	@Column(name = "EXTRA_COL1", length = 200)
	public String getExtraCol1() {
		return this.extraCol1;
	}

	public void setExtraCol1(String extraCol1) {
		this.extraCol1 = extraCol1;
	}

	@Column(name = "EXTRA_COL2", length = 200)
	public String getExtraCol2() {
		return this.extraCol2;
	}

	public void setExtraCol2(String extraCol2) {
		this.extraCol2 = extraCol2;
	}

	@Column(name = "EXTRA_COL3", length = 200)
	public String getExtraCol3() {
		return this.extraCol3;
	}

	public void setExtraCol3(String extraCol3) {
		this.extraCol3 = extraCol3;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "patientMedLog")
	public Set getPatientLabReports() {
		return this.patientLabReports;
	}

	public void setPatientLabReports(Set patientLabReports) {
		this.patientLabReports = patientLabReports;
	}

}
