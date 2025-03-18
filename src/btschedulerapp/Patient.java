/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btschedulerapp;

/**
 *
 * @author damie
 */
public class Patient {
    //Declare Data types
    private int patientID;
    private String sName;
    private String gp;
    private int age;
    private boolean ward;
    
    //Default Constructor
    public Patient(){
        this.patientID=0;
        this.sName = new String();
        this.gp = new String();
        this.age = 0;
        this.ward = false;
    }

    //Getters and Setters
    public int getPatientID(){
        return patientID;
    }
    
    public void setPatientID(int patientID){
        this.patientID = patientID;
    }
    
    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getGp() {
        return gp;
    }

    public void setGp(String gp) {
        this.gp = gp;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isWard() {
        return ward;
    }

    public void setWard(boolean ward) {
        this.ward = ward;
    }
    
}
