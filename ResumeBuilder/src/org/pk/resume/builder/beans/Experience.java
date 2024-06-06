package org.pk.resume.builder.beans;

public class Experience {
    private int id;
    private int userId;
    private String employer;
    private String designation;
    private String joiningDate;
    private String leavingDate;
    private String working;
    private String experience;
    private String subjectThaught;
    private String course;

    public Experience() {
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return this.userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getEmployer() {
        return this.employer;
    }

    public void setEmployer(String employer) {
        this.employer = employer;
    }

    public String getDesignation() {
        return this.designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getJoiningDate() {
        return this.joiningDate;
    }

    public void setJoiningDate(String joiningDate) {
        this.joiningDate = joiningDate;
    }

    public String getLeavingDate() {
        return this.leavingDate;
    }

    public void setLeavingDate(String leavingDate) {
        this.leavingDate = leavingDate;
    }

    public String getWorking() {
        return this.working;
    }

    public void setWorking(String working) {
        this.working = working;
    }

    public String getExperience() {
        return this.experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getSubjectThaught() {
        return this.subjectThaught;
    }

    public void setSubjectThaught(String subjectThaught) {
        this.subjectThaught = subjectThaught;
    }

    public String getCourse() {
        return this.course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String toString() {
        return "Experience {id=" + this.id + ", employer=" + this.employer + ", designation=" + this.designation + ", joiningDate=" + this.joiningDate + ", leavingDate=" + this.leavingDate + ", working=" + this.working + ", experience=" + this.experience + ", subjectThaught=" + this.subjectThaught + ", course=" + this.course + " }";
    }
}
