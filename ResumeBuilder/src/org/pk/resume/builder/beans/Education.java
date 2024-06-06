package org.pk.resume.builder.beans;

public class Education {
    private int id;
    private int userId;
    private String collegeName;
    private String degree;
    private String subject;
    private String year;
    private String board;
    private String obtainedMarks;
    private String totalMarks;
    private String percentage;

    public Education() {
    }

    public String getPercentage() {
        return this.percentage;
    }

    public void setPercentage(String percentage) {
        this.percentage = percentage;
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

    public String getCollegeName() {
        return this.collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getDegree() {
        return this.degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getYear() {
        return this.year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getBoard() {
        return this.board;
    }

    public void setBoard(String board) {
        this.board = board;
    }

    public String getObtainedMarks() {
        return this.obtainedMarks;
    }

    public void setObtainedMarks(String obtainedMarks) {
        this.obtainedMarks = obtainedMarks;
    }

    public String getTotalMarks() {
        return this.totalMarks;
    }

    public void setTotalMarks(String totalMarks) {
        this.totalMarks = totalMarks;
    }

    public String toString() {
        return "Educational {id=" + this.id + ",school=" + this.collegeName + ", degree=" + this.degree + ", subject=" + this.subject + ", year=" + this.year + ", board=" + this.board + ", obtainedMarks=" + this.obtainedMarks + ", totalMarks=" + this.totalMarks + " }";
    }
}
