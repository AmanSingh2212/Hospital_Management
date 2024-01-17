package models;

public class Hospital {
    private String name;
    private String address;
    private Long phone_No;
    private String email_id;

//    Constructor
    public Hospital(String name, String address, Long phone_No, String email_Id) {
        this.name = name;
        this.address = address;
        this.phone_No = phone_No;
        this.email_id = email_Id;
    }

//    Getter and Setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getPhone_No() {
        return phone_No;
    }

    public void setPhone_No(Long phone_No) {
        this.phone_No = phone_No;
    }

    public String getEmail_id() {
        return email_id;
    }

    public void setEmail_id(String email_id) {
        this.email_id = email_id;
    }
}
