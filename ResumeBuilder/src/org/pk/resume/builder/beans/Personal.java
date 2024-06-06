package org.pk.resume.builder.beans;

public class Personal {
    private int id;
    private String name;
    private String fatherName;
    private String motherName;
    private String surname;
    private String gender;
    private String dob;
    private String mobileNo;
    private String emailId;
    private String address;
    private String place;
    private String age;
    private String nationality;
    private String maritalStatus;
    private String langaugeProf;
    private String careerObjectives;
    private String strengths;
    private String hobbies;

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPlace() {
        return this.place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getMotherName() {
        return this.motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getNationality() {
        return this.nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getCareerObjectives() {
        return this.careerObjectives;
    }

    public void setCareerObjectives(String careerObjectives) {
        this.careerObjectives = careerObjectives;
    }

    public String getStrengths() {
        return this.strengths;
    }

    public void setStrengths(String strengths) {
        this.strengths = strengths;
    }

    public String getHobbies() {
        return this.hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    public Personal() {
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDob() {
        return this.dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getMobileNo() {
        return this.mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getEmailId() {
        return this.emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAge() {
        return this.age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getMaritalStatus() {
        return this.maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getFatherName() {
        return this.fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getLangaugeProf() {
        return this.langaugeProf;
    }

    public void setLangaugeProf(String langaugeProf) {
        this.langaugeProf = langaugeProf;
    }

    public String toString() {
        return "Personal {id=" + this.id + ", name=" + this.name + ", fatherName=" + this.fatherName + ", gender=" + this.gender + ", dob=" + this.dob + ", age=" + this.age + ", address=" + this.address + ", contact=" + this.mobileNo + ", maritalStatus=" + this.maritalStatus + ", mail=" + this.emailId + ", Languages known=" + this.langaugeProf + "  }";
    }
}
