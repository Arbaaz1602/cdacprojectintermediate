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
 * Address generated by hbm2java
 */
@Entity
@Table(name = "address", catalog = "project")
public class Address implements java.io.Serializable {

	private Integer addressId;
	private String addressLine1;
	private String userState;
	private String city;
	private String pinCode;
	private String country;
	private Date lastUpdated;
	private String extraCol1;
	private String extraCol2;
	private String extraCol3;
	private Set doctorPrimaries = new HashSet(0);
	private Set patientPrimaries = new HashSet(0);

	public Address() {
	}

	public Address(String addressLine1, String userState, String city, String pinCode, String country) {
		this.addressLine1 = addressLine1;
		this.userState = userState;
		this.city = city;
		this.pinCode = pinCode;
		this.country = country;
	}

	public Address(String addressLine1, String userState, String city, String pinCode, String country, Date lastUpdated,
			String extraCol1, String extraCol2, String extraCol3, Set doctorPrimaries, Set patientPrimaries) {
		this.addressLine1 = addressLine1;
		this.userState = userState;
		this.city = city;
		this.pinCode = pinCode;
		this.country = country;
		this.lastUpdated = lastUpdated;
		this.extraCol1 = extraCol1;
		this.extraCol2 = extraCol2;
		this.extraCol3 = extraCol3;
		this.doctorPrimaries = doctorPrimaries;
		this.patientPrimaries = patientPrimaries;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "Address_ID", unique = true, nullable = false)
	public Integer getAddressId() {
		return this.addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	@Column(name = "Address_line_1", nullable = false, length = 100)
	public String getAddressLine1() {
		return this.addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	@Column(name = "User_State", nullable = false, length = 50)
	public String getUserState() {
		return this.userState;
	}

	public void setUserState(String userState) {
		this.userState = userState;
	}

	@Column(name = "City", nullable = false, length = 50)
	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Column(name = "PinCode", nullable = false, length = 6)
	public String getPinCode() {
		return this.pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	@Column(name = "Country", nullable = false, length = 40)
	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "address")
	public Set getDoctorPrimaries() {
		return this.doctorPrimaries;
	}

	public void setDoctorPrimaries(Set doctorPrimaries) {
		this.doctorPrimaries = doctorPrimaries;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "address")
	public Set getPatientPrimaries() {
		return this.patientPrimaries;
	}

	public void setPatientPrimaries(Set patientPrimaries) {
		this.patientPrimaries = patientPrimaries;
	}

}
