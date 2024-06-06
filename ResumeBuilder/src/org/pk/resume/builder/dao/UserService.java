package org.pk.resume.builder.dao;

import org.pk.resume.builder.beans.*;

import java.util.ArrayList;

public class UserService {
    private DBConnect dbConnection = new DBConnect();

    public UserService() {
    }

    public boolean insertPersonalDetails(Personal personal) {
        return this.dbConnection.insertPersonalDetails(personal);
    }

    public boolean insertEducationalDetails(ArrayList<Education> education) {
        return this.dbConnection.insertEducationalDetails(education);
    }

    public boolean insertExperiences(ArrayList<Experience> experience) {
        return this.dbConnection.insertExperiences(experience);
    }

    public boolean inserParticipation(ArrayList<Participation> part) {
        return this.dbConnection.insertParticipations(part);
    }

    public boolean insertAchievement(ArrayList<Achievements> achievement) {
        return this.dbConnection.insertAchievements(achievement);
    }

    public boolean insertProject(ArrayList<Projects> projects) {
        return this.dbConnection.insertProjects(projects);
    }

    public boolean insertReference(ArrayList<References> reference) {
        return this.dbConnection.insertReferences(reference);
    }

    public Personal getPersonalDetails() {
        return this.dbConnection.getPersonalDetails();
    }

    public ArrayList<Education> getEducationDetails() {
        return this.dbConnection.getEducationalDetails();
    }

    public ArrayList<Experience> getExperienceDetails() {
        return this.dbConnection.getExperienceDetails();
    }

    public ArrayList<Participation> getParticipationDetails() {
        return this.dbConnection.getParticipationDetails();
    }

    public ArrayList<Achievements> getAchievementDetails() {
        return this.dbConnection.getAchievementDetails();
    }

    public ArrayList<Projects> getProjectDetails() {
        return this.dbConnection.getProjectDetails();
    }

    public ArrayList<References> getReferencesDetails() {
        return this.dbConnection.getReferencesDetails();
    }
}
