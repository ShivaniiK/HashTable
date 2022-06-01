package com.HashTable;

import java.util.Hashtable;

public class HashTableJava {

	// Creating an empty Hashtable
	public void getHashTableData() {
    	

    // Inserting elements into the table
    Hashtable<String, String> objHashtable = new Hashtable<String, String> ();
    objHashtable.put("PatientName", "Soham");
    objHashtable.put("HospitalName", "Lotus Hospital");
    objHashtable.put("PatientsAge", "38");
    objHashtable.put("PatientsBloodGroup", "AB Positive");
    objHashtable.put("Patients Address", "Pune");

    // Displaying the Hashtable
    System.out.println("Patient's details are: " +objHashtable);

    // Displaying the size of the table
    System.out.println("The size of the table is " + objHashtable.size());

	}
	
}