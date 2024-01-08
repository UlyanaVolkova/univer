package ru.volkova.univerapp.entity;

public class University {
    private String universityName;
    private Teacher teacher;
    private Student student;

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public University(String universityName, Teacher teacher, Student student) {
        this.universityName = universityName;
        this.teacher = teacher;
        this.student = student;
    }

    public University(String universityName) {
        this.universityName = universityName;
    }

    public University() {
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("университете ")
                .append("" + universityName)
                .append('.');
        return sb.toString();
    }
}
