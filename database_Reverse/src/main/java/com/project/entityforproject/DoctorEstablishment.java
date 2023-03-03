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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * DoctorEstablishment generated by hbm2java
 */
@Entity
@Table(name = "doctor_establishment", catalog = "project")
public class DoctorEstablishment implements java.io.Serializable {

	private Integer eid;
	private char establishment;
	private String establishmentName;
	private String establishmentLocation;
	private String establishmentCity;
	private String establishmentProof;
	private String establishmentPin;
	private Date lastUpdated;
	private String extraCol1;
	private String extraCol2;
	private String extraCol3;
	private Set doctorPrimaries = new HashSet(0);

	public DoctorEstablishment() {
	}

	public DoctorEstablishment(char establishment, String establishmentName, String establishmentLocation,
			String establishmentCity, String establishmentProof, String establishmentPin, Date lastUpdated) {
		this.establishment = establishment;
		this.establishmentName = establishmentName;
		this.establishmentLocation = establishmentLocation;
		this.establishmentCity = establishmentCity;
		this.establishmentProof = establishmentProof;
		this.establishmentPin = establishmentPin;
		this.lastUpdated = lastUpdated;
	}

	public DoctorEstablishment(char establishment, String establishmentName, String establishmentLocation,
			String establishmentCity, String establishmentProof, String establishmentPin, Date lastUpdated,
			String extraCol1, String extraCol2, String extraCol3, Set doctorPrimaries) {
		this.establishment = establishment;
		this.establishmentName = establishmentName;
		this.establishmentLocation = establishmentLocation;
		this.establishmentCity = establishmentCity;
		this.establishmentProof = establishmentProof;
		this.establishmentPin = establishmentPin;
		this.lastUpdated = lastUpdated;
		this.extraCol1 = extraCol1;
		this.extraCol2 = extraCol2;
		this.extraCol3 = extraCol3;
		this.doctorPrimaries = doctorPrimaries;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "EID", unique = true, nullable = false)
	public Integer getEid() {
		return this.eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	@Column(name = "Establishment", nullable = false, length = 1)
	public char getEstablishment() {
		return this.establishment;
	}

	public void setEstablishment(char establishment) {
		this.establishment = establishment;
	}

	@Column(name = "Establishment_Name", nullable = false, length = 100)
	public String getEstablishmentName() {
		return this.establishmentName;
	}

	public void setEstablishmentName(String establishmentName) {
		this.establishmentName = establishmentName;
	}

	@Column(name = "Establishment_Location", nullable = false, length = 100)
	public String getEstablishmentLocation() {
		return this.establishmentLocation;
	}

	public void setEstablishmentLocation(String establishmentLocation) {
		this.establishmentLocation = establishmentLocation;
	}

	@Column(name = "Establishment_City", nullable = false, length = 100)
	public String getEstablishmentCity() {
		return this.establishmentCity;
	}

	public void setEstablishmentCity(String establishmentCity) {
		this.establishmentCity = establishmentCity;
	}

	@Column(name = "Establishment_Proof", nullable = false, length = 100)
	public String getEstablishmentProof() {
		return this.establishmentProof;
	}

	public void setEstablishmentProof(String establishmentProof) {
		this.establishmentProof = establishmentProof;
	}

	@Column(name = "Establishment_Pin", nullable = false, length = 6)
	public String getEstablishmentPin() {
		return this.establishmentPin;
	}

	public void setEstablishmentPin(String establishmentPin) {
		this.establishmentPin = establishmentPin;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "Last_Updated", nullable = false, length = 19)
	public Date getLastUpdated() {
		return this.lastUpdated;
	}

	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	@Column(name = "Extra_Col1", length = 200)
	public String getExtraCol1() {
		return this.extraCol1;
	}

	public void setExtraCol1(String extraCol1) {
		this.extraCol1 = extraCol1;
	}

	@Column(name = "Extra_Col2", length = 200)
	public String getExtraCol2() {
		return this.extraCol2;
	}

	public void setExtraCol2(String extraCol2) {
		this.extraCol2 = extraCol2;
	}

	@Column(name = "Extra_Col3", length = 200)
	public String getExtraCol3() {
		return this.extraCol3;
	}

	public void setExtraCol3(String extraCol3) {
		this.extraCol3 = extraCol3;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "doctorEstablishment")
	public Set getDoctorPrimaries() {
		return this.doctorPrimaries;
	}

	public void setDoctorPrimaries(Set doctorPrimaries) {
		this.doctorPrimaries = doctorPrimaries;
	}

}
