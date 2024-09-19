package com.shubham.HMA;

public class Paediatrician  extends Doctor{
	
	public Paediatrician(int doctorId, String doctorName) {
        super(doctorId, doctorName, "Paediatrician");
    }
	
	 public void performChildCare() {
	        System.out.println("Performing child care");
	    }

}
