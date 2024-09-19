package com.shubham.HMA;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Doctor implements Schedule {

	private int doctorId;
	private String doctorName;
	private String specialization;

	private List<Patient> patients;
	private List<Appointment> appointments = new ArrayList<>();

	@Override
	public void scheduleAppointment(Patient patient, Doctor doctor, String status) {

//		to get a date after 2 days for appointment
		Date today = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(today);
		calendar.add(Calendar.DAY_OF_YEAR, 2);
		Date dateInTwoDays = calendar.getTime();

		Appointment appointment = new Appointment(appointments.size() + 1, patient, doctor, dateInTwoDays, status);
		appointments.add(appointment);
		System.out.println(
				"Appointment scheduled for patient: " + patient.getPatientName() + " with  " + doctor.getDoctorName());
		
	}

	@Override
	public void cancelAppointment(Appointment appointment) {
		appointment.setAppointmentDate(new Date());
		appointment.setAppointmentId(appointment.getAppointmentId());
		appointment.setDoctor(appointment.getDoctor());
		appointment.setPatient(appointment.getPatient());
		appointment.setStatus("Canceled");
		System.out.println("All appointments for "+appointment.getDoctor().getDoctorName()+ " are cancel..");
	}

	public Doctor(int doctorId, String doctorName, String specialization, List<Patient> patients,
			List<Appointment> appointments) {
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.specialization = specialization;
		this.patients = patients;
		this.appointments = appointments;
	}

	public Doctor(int doctorId, String doctorName, String specialization) {
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.specialization = specialization;
	}

	public int getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public List<Patient> getPatients() {
		return patients;
	}

	public void setPatients(List<Patient> patients) {
		this.patients = patients;
	}

	public List<Appointment> getAppointments() {
		return appointments;
	}

	public void setAppointments(List<Appointment> appointments) {
		this.appointments = appointments;
	}

	@Override
	public String toString() {
		return "Doctor [doctorId=" + doctorId + ", doctorName=" + doctorName + ", specialization=" + specialization
				+ ", patients=" + patients + ", appointments=" + appointments + "]";
	}

	public Doctor() {
		super();
	}

}
