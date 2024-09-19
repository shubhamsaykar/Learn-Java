package com.shubham.HMA;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Patient {

	private int pId;
	private String patientName;
	private long age;
	private String gender;
	private List<String> medicalHistory;
	private Map<String, String> vitals;

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public long getAge() {
		return age;
	}

	public void setAge(long age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public List<String> getMedicalHistory() {
		return medicalHistory;
	}

	public void setMedicalHistory(List<String> medicalHistory) {
		this.medicalHistory = medicalHistory;
	}

	public Map<String, String> getVitals() {
		return vitals;
	}

	public void setVitals(Map<String, String> vitals) {
		this.vitals = vitals;
	}

	public Patient(int pId, String patientName, long age, String gender, List<String> medicalHistory) {
		super();
		this.pId = pId;
		this.patientName = patientName;
		this.age = age;
		this.gender = gender;
		this.medicalHistory = medicalHistory;
		this.vitals = new HashMap<>();
	}

	@Override
	public String toString() {
		return "Patient [pId=" + pId + ", patientName=" + patientName + ", age=" + age + ", gender=" + gender
				+ ", medicalHistory=" + medicalHistory + ", vitals=" + vitals + "]";
	}

	public void updateVital(String vitalType, String value) {
		this.vitals.put(vitalType, value);
	}

	public Patient() {

	}

}
