/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btschedulerapp;

/**
 *
 * @author damie
 */
public class PQElement {
    // Priority key for this element (e.g., 1 for urgent)
    private int iKey;
    // The patient associated with this element
    private Patient patient;

    // Constructor: Initializes this element with a priority and patient
    public PQElement(int iInPriority, Patient inPatient) {
        this.iKey = iInPriority;  // Set the priority key
        this.patient = inPatient; // Set the patient object
    }

    // Returns the current priority key
    public int getiKey() {
        return iKey; // Dummy: get the key value
    }

    // Sets a new priority key
    public void setiKey(int iInPriority) {
        this.iKey = iInPriority; // Dummy: update the key value
    }

    // Returns the patient object stored in this element
    public Patient getPatient() {
        return patient; // Dummy: get the patient
    }

    // Updates the patient object stored in this element
    public void setPatient(Patient inPatient) {
        this.patient = inPatient; // Dummy: set a new patient
    }

    // Returns a string with formatted patient details
    public String printPatient() {
        String sMessage;
        // Dummy: Create a message with patient details
        sMessage = "\n--ID: " + patient.getPatientID() +
                   "\n--Patient: " + patient.getsName() +
                   "\n--Age: " + patient.getAge() +
                   "\n--GP Details: " + patient.getGp() +
                   "\n--From Ward(yes or no): " + (patient.isWard() ? "Yes" : "No");
        return sMessage; // Dummy: return the formatted string
    }
    
}
