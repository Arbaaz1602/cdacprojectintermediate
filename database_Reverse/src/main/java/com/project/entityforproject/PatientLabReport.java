package com.project.entityforproject;
// Generated 03-Mar-2023, 8:40:48 pm by Hibernate Tools 4.3.6.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * PatientLabReport generated by hbm2java
 */
@Entity
@Table(name = "patient_lab_report", catalog = "project")
public class PatientLabReport implements java.io.Serializable {

	private Integer labReportId;
	private PatientMedLog patientMedLog;
	private String labReportType;
	private String labReport;
	private Date lastUpdated;
	private String extraCol1;
	private String extraCol2;
	private String extraCol3;

	public PatientLabReport() {
	}

	public PatientLabReport(String labReportType, String labReport, Date lastUpdated) {
		this.labReportType = labReportType;
		this.labReport = labReport;
		this.lastUpdated = lastUpdated;
	}

	public PatientLabReport(PatientMedLog patientMedLog, String labReportType, String labReport, Date lastUpdated,
			String extraCol1, String extraCol2, String extraCol3) {
		this.patientMedLog = patientMedLog;
		this.labReportType = labReportType;
		this.labReport = labReport;
		this.lastUpdated = lastUpdated;
		this.extraCol1 = extraCol1;
		this.extraCol2 = extraCol2;
		this.extraCol3 = extraCol3;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "LAB_REPORT_ID", unique = true, nullable = false)
	public Integer getLabReportId() {
		return this.labReportId;
	}

	public void setLabReportId(Integer labReportId) {
		this.labReportId = labReportId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MED_LOG_ID")
	public PatientMedLog getPatientMedLog() {
		return this.patientMedLog;
	}

	public void setPatientMedLog(PatientMedLog patientMedLog) {
		this.patientMedLog = patientMedLog;
	}

	@Column(name = "LAB_REPORT_TYPE", nullable = false, length = 50)
	public String getLabReportType() {
		return this.labReportType;
	}

	public void setLabReportType(String labReportType) {
		this.labReportType = labReportType;
	}

	@Column(name = "LAB_REPORT", nullable = false, length = 100)
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

	@Column(name = "EXTRA_COL1", length = 100)
	public String getExtraCol1() {
		return this.extraCol1;
	}

	public void setExtraCol1(String extraCol1) {
		this.extraCol1 = extraCol1;
	}

	@Column(name = "EXTRA_COL2", length = 100)
	public String getExtraCol2() {
		return this.extraCol2;
	}

	public void setExtraCol2(String extraCol2) {
		this.extraCol2 = extraCol2;
	}

	@Column(name = "EXTRA_COL3", length = 100)
	public String getExtraCol3() {
		return this.extraCol3;
	}

	public void setExtraCol3(String extraCol3) {
		this.extraCol3 = extraCol3;
	}

}
