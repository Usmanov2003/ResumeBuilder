package org.pk.resume.builder.beans;

public class Journal {
    String name;
    String paperTitle;
    String author;
    String publicationDate;
    String place;
    String volume;
    String pageNo;
    String doiNo;
    String link;
    String impactFactor;
    String impactType;
    String publicationType;

    public Journal() {
    }

    public Journal(String name, String paperTitle, String author, String publicationDate, String place, String volume, String pageNo, String doiNo, String link, String impactFactor, String impactType, String publicationType) {
        this.name = name;
        this.paperTitle = paperTitle;
        this.author = author;
        this.publicationDate = publicationDate;
        this.place = place;
        this.volume = volume;
        this.pageNo = pageNo;
        this.doiNo = doiNo;
        this.link = link;
        this.impactFactor = impactFactor;
        this.impactType = impactType;
        this.publicationType = publicationType;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPaperTitle() {
        return this.paperTitle;
    }

    public void setPaperTitle(String paperTitle) {
        this.paperTitle = paperTitle;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublicationDate() {
        return this.publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    public String getPlace() {
        return this.place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getVolume() {
        return this.volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getPageNo() {
        return this.pageNo;
    }

    public void setPageNo(String pageNo) {
        this.pageNo = pageNo;
    }

    public String getDoiNo() {
        return this.doiNo;
    }

    public void setDoiNo(String dioNo) {
        this.doiNo = dioNo;
    }

    public String getLink() {
        return this.link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getImpactFactor() {
        return this.impactFactor;
    }

    public void setImpactFactor(String impactFactor) {
        this.impactFactor = impactFactor;
    }

    public String getImpactType() {
        return this.impactType;
    }

    public void setImpactType(String impactType) {
        this.impactType = impactType;
    }

    public String getPublicationType() {
        return this.publicationType;
    }

    public void setPublicationType(String publicationType) {
        this.publicationType = publicationType;
    }
}
