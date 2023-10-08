package ru.volkova.univerapp.entity;

public class University {
    static String universityName;

    public String getUniversityName(){
        return universityName;
    }

    public void setUniversityName(){
        this.universityName=universityName;
    }

    public University(String universityName){
        this.universityName = universityName;
    }
}
