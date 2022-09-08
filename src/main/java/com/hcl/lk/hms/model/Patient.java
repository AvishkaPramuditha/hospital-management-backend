package com.hcl.lk.hms.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "patient_details")
public class Patient {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "patient_id_seq", initialValue=1)
	@Column(name = "id",scale = 10)
	private int id;
	
	@Column(name = "name", length = 50)
	private String name;
	
	@Column(name = "address", length = 100)
	private String address;
	
	@Column(name = "dob")
	@Temporal(TemporalType.DATE)
	private Date dob;
	
	@Column(name = "gender", length = 20)
	private String gender;
	
	@Column(name = "email", length = 50)
	private String email;
	
	@Column(name = "contactNumber", length = 20)
	private String contactNumber;
	
	@Column(name = "emergencyContactNumber", length = 20)
	private String emergencyContactNumber;
	
	@Column(name = "bloodType", length = 20)
	private String bloodType;
	
	@Column(name = "allergies", length = 75)
	private String allergies;
	
	@Column(name = "cause", length = 75)
	private String cause;
	
	@Column(name = "priorityLevel", length = 20)
	private int priorityLevel;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Patient(String name, String address, Date dob, String gender, String email, String contactNumber,
			String emergencyContactNumber, String bloodType, String allergies, String cause, int priorityLevel) {
		super();
		this.name = name;
		this.address = address;
		this.dob = dob;
		this.gender = gender;
		this.email = email;
		this.contactNumber = contactNumber;
		this.emergencyContactNumber = emergencyContactNumber;
		this.bloodType = bloodType;
		this.allergies = allergies;
		this.cause = cause;
		this.priorityLevel = priorityLevel;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getEmergencyContactNumber() {
		return emergencyContactNumber;
	}
	public void setEmergencyContactNumber(String emergencyContactNumber) {
		this.emergencyContactNumber = emergencyContactNumber;
	}
	public String getBloodType() {
		return bloodType;
	}
	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}
	public String getAllergies() {
		return allergies;
	}
	public void setAllergies(String allergies) {
		this.allergies = allergies;
	}
	public String getCause() {
		return cause;
	}
	public void setCause(String cause) {
		this.cause = cause;
	}
	public int getPriorityLevel() {
		return priorityLevel;
	}
	public void setPriorityLevel(int priorityLevel) {
		this.priorityLevel = priorityLevel;
	}
	
	
}
