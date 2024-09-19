package com.shubham.HMA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HospitalSystem {

	private ArrayList<Patient> patients = new ArrayList<>();
	private ArrayList<Doctor> doctors = addDoctores();
	private List<Appointment> doctorAppointments = new ArrayList<>();

	private static final Scanner scanner = new Scanner(System.in);

	public static ArrayList<Doctor> addDoctores() {
		ArrayList<Doctor> doctors = new ArrayList<>();
		doctors.add(new Doctor(1, "Dr.Shubham Saykar", "Cardiologist"));
		doctors.add(new Doctor(2, "Dr.Suresh Rana", "Paediatrician"));
		doctors.add(new Doctor(3, "Dr.Pratik patil", "Paediatrician"));
		doctors.add(new Doctor(4, "Dr.Vandana Tupe", "Paediatrician"));
		doctors.add(new Doctor(5, "Dr.Rahul Shinde", "Paediatrician"));
		doctors.add(new Doctor(6, "Dr.Pranali Supekar", "Paediatrician"));
		doctors.add(new Doctor(7, "Dr.Poonam Pawar", "Cardiologist"));
		doctors.add(new Doctor(8, "Dr.Gorakh Shewale", "Cardiologist"));
		doctors.add(new Doctor(9, "Dr.Narendra Ghule", "Cardiologist"));
		doctors.add(new Doctor(10, "Dr.Dhanashri Ghule", "Cardiologist"));
		return doctors;
	}

//	to register patient
	public void registerPatient(int pId, String name, long age, String gender, List<String> medicalHistory) {
		Patient newPatient = new Patient(pId, name, age, gender, medicalHistory);
		patients.add(newPatient);
	}

	// Method to schedule an appointment
	public void scheduleAppointment(int doctorId, int patientId, String status) {
		Doctor doctor = findDoctorById(doctorId);
		Patient patient = findPatientById(patientId);

		// If doctor and patient are found, schedule the appointment
		if (doctor != null && patient != null) {
			doctor.scheduleAppointment(patient, doctor, status);
		} else {
			System.out.println("Doctor or Patient not found!");
		}
	}

//	Using Stream api 
	public Doctor findDoctorById(int doctorId) {
		return doctors.stream().filter(doctor -> doctor.getDoctorId() == doctorId).findFirst().orElse(null);
	}

//	Using Stream api
	public Patient findPatientById(int patientId) {
		return patients.stream().filter(patient -> patient.getpId() == patientId).findFirst().orElse(null);
	}

	public void printAppointments(List<Appointment> doctorAppointments) {
		for (Appointment appointment : doctorAppointments) {
			System.out.println("Appointment ID: " + appointment.getAppointmentId() + ", Date: "
					+ appointment.getAppointmentDate() + ", Status: " + appointment.getStatus() + ", Doctor: "
					+ appointment.getDoctor().getDoctorName() + ", Patient: "
					+ appointment.getPatient().getPatientName() + ", Medical History: "
					+ appointment.getPatient().getMedicalHistory());
		}
	}

	public List<Appointment> getDoctorAppointments(int doctorId) {

		Doctor doctor = findDoctorById(doctorId);
		List<Appointment> appointments = doctor.getAppointments();

		return appointments;
	}

	// Method to update the status of an appointment
	public void updateAppointmentStatus(int appointmentId, String newStatus) {
		for (Appointment appointment : doctorAppointments) {
			if (appointment.getAppointmentId() == appointmentId) {
				appointment.setStatus(newStatus);
				System.out.println("Appointment status updated to " + newStatus);
				return;
			}
		}
		System.out.println("Appointment not found!");
	}

//	update vital for patients
	public void updatePatientVitals(int patientId, String vitalType, String value) {
		Patient patient = findPatientById(patientId);
		if (patient != null) {
			patient.updateVital(vitalType, value);
			System.out.println("Updated " + vitalType + " for patient ID " + patientId + " to " + value);
		} else {
			System.out.println("Patient not found!");
		}
	}

//	bubble sort to sort list of patients
	public static void sortPatientsByAge(List<Patient> patients) {
		int n = patients.size();
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (patients.get(j).getAge() > patients.get(j + 1).getAge()) {
					Collections.swap(patients, j, j + 1);
				}
			}
		}
	}

	// Method to retrieve medical history by patient ID
	public List<String> getMedicalHistoryByPatientId(int patientId) {
		Patient patient = findPatientById(patientId);
		if (patient != null) {
			return patient.getMedicalHistory();
		} else {
			System.out.println("Patient not found!");
			return new ArrayList<>();
		}
	}

	private void cancleAppointmentByDoctorId(int doctorId) {
		Doctor doctor = findDoctorById(doctorId);
		for (Appointment a : doctor.getAppointments()) {
			doctor.cancelAppointment(a);
		}

	}

	public static void main(String[] args) {
		HospitalSystem hospitalSystem = new HospitalSystem();
		String continueInput = "yes";

		// Register multiple patients
		while (continueInput.equalsIgnoreCase("yes")) {
			System.out.println("Enter patient ID: ");
			int patientId = scanner.nextInt();
			scanner.nextLine();

			System.out.println("Enter patient name: ");
			String patientName = scanner.nextLine();

			System.out.println("Enter patient age: ");
			long age = scanner.nextLong();
			scanner.nextLine();

			System.out.println("Enter patient gender: ");
			String gender = scanner.nextLine();

			System.out.println("Enter medical issues (comma separated): ");
			String medicalIssuesInput = scanner.nextLine();
			List<String> medicalIssues = Arrays.stream(medicalIssuesInput.split(",")).map(String::trim)
					.collect(Collectors.toList());

			hospitalSystem.registerPatient(patientId, patientName, age, gender, medicalIssues);

			System.out.println("Do you want to register another patient? (yes/no): ");
			continueInput = scanner.nextLine();
		}

		continueInput = "yes";

		while (continueInput.equalsIgnoreCase("yes")) {
			// Display doctors
			System.out.println("Available doctors:");
			for (Doctor doctor : hospitalSystem.doctors) {
				System.out.println("ID: " + doctor.getDoctorId() + ", Name: " + doctor.getDoctorName()
						+ ", Specialization: " + doctor.getSpecialization());
			}

			System.out.println("Enter doctor ID for the appointment: ");
			int doctorId = scanner.nextInt();
			scanner.nextLine(); // Consume newline

			System.out.println("Enter patient ID for the appointment: ");
			int patientId = scanner.nextInt();
			scanner.nextLine(); // Consume newline

			System.out.println("Enter appointment status: ");
			String status = scanner.nextLine();

			hospitalSystem.scheduleAppointment(doctorId, patientId, status);

			System.out.println("Do you want to schedule another appointment? (yes/no): ");
			continueInput = scanner.nextLine();
		}

		continueInput = "yes";

		while (continueInput.equalsIgnoreCase("yes")) {
			System.out.println("Choose an operation:");
			System.out.println("1. Update patient vitals");
			System.out.println("2. Retrieve sorted patient data");
			System.out.println("3. Retrieve medical history by patient ID");
			System.out.println("4. Retrieve list of appointments");
			System.out.println("5. Cancel Appointment");
			System.out.println("6. Exist...");
			int choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 1:

				System.out.println("Enter patient ID to update vitals: ");
				int patientIdForVitals = scanner.nextInt();
				scanner.nextLine();

				System.out.println("Enter vital type (e.g., Blood Pressure, Heart Rate): ");
				String vitalType = scanner.nextLine();

				System.out.println("Enter vital value: ");
				String vitalValue = scanner.nextLine();

				hospitalSystem.updatePatientVitals(patientIdForVitals, vitalType, vitalValue);
				break;

			case 2:

				List<Patient> patients = hospitalSystem.patients;
				HospitalSystem.sortPatientsByAge(patients);
				System.out.println("Sorted patients by age:");
				for (Patient patient : patients) {
					System.out.println(patient);
				}
				break;

			case 3:

				System.out.println("Enter patient ID to retrieve medical history: ");
				int patientIdForHistory = scanner.nextInt();
				scanner.nextLine();

				List<String> medicalHistory = hospitalSystem.getMedicalHistoryByPatientId(patientIdForHistory);
				if (!medicalHistory.isEmpty()) {
					System.out.println("Medical history for patient ID " + patientIdForHistory + ":");
					for (String record : medicalHistory) {
						System.out.println(record);
					}
				}
				break;

			case 4:
				System.out.println("All appointments:");
				for (Doctor doctor : hospitalSystem.doctors) {

					List<Appointment> doctorAppointments = hospitalSystem.getDoctorAppointments(doctor.getDoctorId());

					hospitalSystem.printAppointments(doctorAppointments);
				}
				break;

			case 5:
				System.out.println("Enter Doctor ID to cancle appointment: ");
				int doctorId = scanner.nextInt();
				hospitalSystem.cancleAppointmentByDoctorId(doctorId);

				break;

			case 6:

				System.out.println("Exiting...");
				return;

			default:
				System.out.println("Invalid choice. Please try again.");
				break;
			}

			System.out.println("Do you want to perform another operation? (yes/no): ");
			continueInput = scanner.nextLine();
		}
	}

}
