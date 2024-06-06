package org.pk.resume.builder.beans;

public class Achievements {
    private String name;
    private String title;
    private String place;
    private String date;

    public Achievements() {
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPlace() {
        return this.place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String toString() {
        return "Achievements { Name = " + this.name + ",Title = " + this.title + ",Place = " + this.place + ",Date = " + this.date + " } ";
    }