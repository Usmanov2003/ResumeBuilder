package org.pk.resume.builder.beans;

public class ExpertActivities {
    private int id;
    private String exportRole;
    private String level;
    private String place;
    private String isbnNo;
    public ActivityType actName;

    public ExpertActivities() {
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getExportRole() {
        return this.exportRole;
    }

    public void setExportRole(String exportRole) {
        this.exportRole = exportRole;
    }

    public String getLevel() {
        return this.level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPlace() {
        return this.place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getIsbnNo() {
        return this.isbnNo;
    }

    public void setIsbnNo(String isbnNo) {
        this.isbnNo = isbnNo;
    }

    public ActivityType getActivityType() {
        return this.actName;
    }

    public void setActivityType(ActivityType actName) {
        this.actName = actName;
    }

    public static ActivityType getActivityType(String actName) {
        ActivityType[] var4;
        int var3 = (var4 = ExpertActivities.ActivityType.values()).length;

        for(int var2 = 0; var2 < var3; ++var2) {
            ActivityType aName = var4[var2];
            if (actName.equals(aName.name())) {
                return aName;
            }
        }

        return null;
    }

    public String toString() {
        return "Expert Activity { id = " + this.id + ",Expert Role = " + this.exportRole + ",Level = " + this.level + ",Activity Type = " + this.actName + ",Place = " + this.place + ",ISBN NO = " + this.isbnNo + " }";
    }

    public static enum ActivityType {
        JOURNAL,
        CONFERENCE,
        WORKSHOPS;

        private ActivityType() {
        }
    }
}
