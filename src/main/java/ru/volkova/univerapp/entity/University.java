package ru.volkova.univerapp.entity;

public class University {
    String universityName;
    Teacher teacher;
    Student student;

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName() {
        this.universityName = universityName;
    }

    public University(String universityName) {
        this.universityName = universityName;
    }

    public University() {
    }
}
