package models;
import java.util.*;

public class Doctor {
    String docId;
    String docDegree;
    String name;
    Long phoneNo;
    String speciality;
    int salary;
    String timeslot;

    List<Patient> patientList;

    public Doctor(String docId, String docDegree, String name, Long phoneNo, String speciality, int salary, String timeslot) {
        this.docId = docId;
        this.docDegree = docDegree;
        this.name = name;
        this.phoneNo = phoneNo;
        this.speciality = speciality;
        this.salary = salary;
        this.timeslot = timeslot;
        this.patientList = new ArrayList<>();
    }
}
