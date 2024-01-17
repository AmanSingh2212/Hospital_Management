package database;

import models.Patient;

import java.util.HashMap;

public class PatientDatabase {

     HashMap<String, Patient> patientDB;

     PatientDatabase(){
         this.patientDB = new HashMap<>();
     }

     public void addPatient(Patient obj){
          String pid = obj.pId;
          patientDB.put(pid, obj);
     }

     public Patient getPatient(String pid){
         return patientDB.get(pid);
     }

}
