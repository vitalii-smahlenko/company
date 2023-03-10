package com.gmail.smaglenko.company;

public class Programmer extends Employee {
    private String language;
    private String level;

    public Programmer(String name, int age, String language, String level) {
        super(name, age);
        this.language = language;
        this.level = level;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}