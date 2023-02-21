package com.gmail.smaglenko.company;

public class ProjectManager extends Employee {
    private String project;

    public ProjectManager(String name, int age) {
        super(name, age);
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }
}