package org.pk.resume.builder.beans;

public class Projects {
    private String titte;
    private String guide;
    private String frontEnd;
    private String backEnd;
    private String inputs;
    private String outputs;
    private String description;

    public Projects() {
    }

    public String getBackEnd() {
        return this.backEnd;
    }

    public void setBackEnd(String backEnd) {
        this.backEnd = backEnd;
    }

    public String getTitte() {
        return this.titte;
    }

    public void setTitte(String titte) {
        this.titte = titte;
    }

    public String getGuide() {
        return this.guide;
    }

    public void setGuide(String guide) {
        this.guide = guide;
    }

    public String getFrontEnd() {
        return this.frontEnd;
    }

    public void setFrontEnd(String frontEnd) {
        this.frontEnd = frontEnd;
    }

    public String getInputs() {
        return this.inputs;
    }

    public void setInputs(String inputs) {
        this.inputs = inputs;
    }

    public String getOutputs() {
        return this.outputs;
    }

    public void setOutputs(String outputs) {
        this.outputs = outputs;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String toString() {
        return "Projects { Titte = " + this.titte + ",Guide = " + this.guide + ",Front End = " + this.frontEnd + ",Inputs = " + this.inputs + ",Outputs = " + this.outputs + ",Description = " + this.description + " } ";
    }
}
