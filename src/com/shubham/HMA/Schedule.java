package com.shubham.HMA;


public interface Schedule {
	
	void scheduleAppointment(Patient patient, Doctor doctor, String status);
    void cancelAppointment(Appointment appointment);

}
