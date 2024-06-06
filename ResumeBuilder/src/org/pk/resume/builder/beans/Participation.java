package org.pk.resume.builder.beans;

public final class Participation {
    private int id;
    private String startDate;
    private String endDate;
    private String sponsores;
    private String note;
    private String topic;
    private String place;
    public ParticipationName partName;

    public Participation() {
    }

    public Participation(ParticipationName partName, String startDate, String endDate, String sponsores, String note, String topic, String place) {
        this.setId(this.id);
        this.setStartDate(startDate);
        this.setEndDate(endDate);
        this.setSponsores(sponsores);
        this.setNote(note);
        this.setTopic(topic);
        this.setPlace(place);
        this.setParticipation(partName);
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStartDate() {
        return this.startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return this.endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getSponsores() {
        return this.sponsores;
    }

    public void setSponsores(String sponsores) {
        this.sponsores = sponsores;
    }

    public String getNote() {
        return this.note;
    }

    public void setNote(String Note) {
        this.note = Note;
    }

    public String getTopic() {
        return this.topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getPlace() {
        return this.place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public ParticipationName getParticipation() {
        return this.partName;
    }

    public void setParticipation(ParticipationName partName) {
        this.partName = partName;
    }

    public static ParticipationName getParticipation(String partName) {
        ParticipationName[] var4;
        int var3 = (var4 = Participation.ParticipationName.values()).length;

        for(int var2 = 0; var2 < var3; ++var2) {
            ParticipationName pName = var4[var2];
            if (partName.equals(pName.name())) {
                return pName;
            }
        }

        return null;
    }

    public String toString() {
        return "Participation { id = " + this.id + ",Partcipation name = " + this.partName + ",Start Date = " + this.startDate + ",End Date = " + this.endDate + ",Sponsores = " + this.sponsores + ",Note = " + this.note + ",Topic = " + this.topic + ",Place = " + this.place + "}";
    }

    public static enum ParticipationName {
        TRAINING,
        WORKSHOPS,
        FDP,
        STTP,
        OTHERS;

        private ParticipationName() {
        }
    }
}
