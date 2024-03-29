package models;

public class Patient {
    public String pId;
    public String name;
    public int age;
    public Long phoneNo;
    public String email;
    public String gender;
    public String disease;

    Doctor doctor;

    Room room;

    public Patient(String pId, String name, int age, Long phoneNo, String email, String gender, String disease, Doctor doctor, Room room) {
        this.pId = pId;
        this.name = name;
        this.age = age;
        this.phoneNo = phoneNo;
        this.email = email;
        this.gender = gender;
        this.disease = disease;
        this.doctor = doctor;
        this.room = room;
    }
}
