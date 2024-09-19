# Learn-Java
Deep Diving in Core java Patterns Printing programs, Data Structure and Algorithms, Searching algorithms, New java Features

# new packege named HMA for following Assignment
ASSIGNMENT
Problem Statement: Health Monitoring System Using OOPS Concepts
Introduction:
In modern healthcare, tracking and monitoring patient health information is vital for providing 
timely and efficient care. This problem statement focuses on creating a Health Monitoring System 
(HMS) using Object-Oriented Programming (OOPS) concepts in Java. The system will enable 
healthcare professionals to store, manage, and retrieve patient information, including vitals, 
medications, and appointments.
Objective:
1. Implement an HMS that manages patient data using OOPS principles such as classes, 
inheritance, polymorphism, and encapsulation.
2. Incorporate sorting algorithms to organize patient data based on various criteria (e.g., age, 
medical condition severity, etc.).
3. Read input data from a file and allow the system to handle dynamic patient records.
4. Establish relationships between entities such as patients, doctors, appointments, and medical 
history using appropriate Java concepts (inheritance, interfaces, and association).
5. Develop multiple use cases for managing health records, scheduling appointments, and 
retrieving sorted data efficiently.
6. Ensure that all necessary OOPS and Java concepts like exception handling, file I/O, and 
collections are covered.
Relationships between Entities:
- Association: A doctor can have many patients and appointments.
- Inheritance: Specialized of doctors like Cardiologist and Paediatrician inherit from the Doctor.
- Aggregation: The Appointment aggregates patient and doctor data.
- Composition: The Medical History is composed within the Patient to maintain health records.
Use Cases:
1. Register New Patient: Add a new patient record to the system with personal and medical details.
2. Schedule Appointment: Allow a patient to schedule an appointment with a specific doctor based
on specialization.
3. Update Patient Vitals: Update vitals like blood pressure, heart rate, etc., for an existing patient.
4. Retrieve Sorted Patient Data: Use sorting algorithms (e.g., bubble sort, quicksort) to organize 
patient records based on age, condition severity, or appointment dates.
5. Manage Doctor’s Appointments: Display a list of appointments for each doctor and update 
statuses (e.g., completed, canceled).
6. Retrieve Medical History: Access a patient’s medical history based on their ID.
Key Java Concepts:
1. Classes and Objects: For defining entities such as Patient, Doctor, and Appointment.
2. Inheritance and Polymorphism: For creating specialized doctors (e.g., Cardiologist, 
Dermatologist) and overriding methods for different functionalities.
3. Encapsulation: To hide sensitive information (like medical history) and only expose necessary 
details through getter methods.
4. Interfaces: Define contracts for entities like Schedule (for booking and managing appointments).
5. File I/O: To read input data for patients, doctors, and appointments from a file (e.g., CSV or text 
file).
6. Exception Handling: Handle errors such as invalid patient ID or overlapping appointment times.
7. Collections Framework: Use lists and maps to store dynamic data about patients and doctors.
8. Sorting Algorithms: Implement algorithms like bubble sort or quicksort to organize patient 
records.
Example Scenarios:
1. Scenario 1: Register and Sort Patients by Age
 - Input a list of patients.
 - Sort patients by age using the selected sorting algorithm.
 - Output: A sorted list of patients in ascending order of their age.
2. Scenario 2: Schedule and Retrieve Appointments
 - Input a doctor’s ID.
 - Output: List of all appointments for the specified doctor, ordered by the appointment date.
Dataset File - Sample examples
If required more attributes then you can add attributes as per problem statement.

Patients.csv
id, name, age, gender, medicalHistory
1,Rajesh,28,Male,["BP,"Fever"]
2,Rohan,23,Male,["Cancer","BP"]

Doctors.csv
doctorId, name, specialization
1, Dr.Ganesh,Cardiologist
2, Dr.John,Dermatologist

-------------------------------------------------------------------------------------------------------------------------------
