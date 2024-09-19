package com.shubham.HMA;

public class Cardiologist extends Doctor{

	 public Cardiologist(int doctorId, String doctorName) {
	        super(doctorId, doctorName, "Cardiologist");
	    }
	 
	 public void performHeartSurgery() {
	        System.out.println("Performing heart surgery");
	    }
	
}
