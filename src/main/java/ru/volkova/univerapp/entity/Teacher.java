package ru.volkova.univerapp.entity;

import ru.volkova.univerapp.service.Exam;
import ru.volkova.univerapp.service.TeacherAction;

public class Teacher implements Exam, TeacherAction {
    private String name;
    private String subject;
    private Student student;
    private University university;

    public Teacher(String name, String subject, Student student, University university) {
        this.name = name;
        this.subject = subject;
        this.student = student;
        this.university = university;
    }

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public Teacher() {
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Преподаватель")
                .append(" " + name)
                .append(", предмет " + subject)
                .append('.');
        return sb.toString();
    }

    @Override
    public void exam(University university, Student student, Teacher teacher) {
        System.out.println("Сегодня я принимаю экзамен в " + university + " у " + student + " группы. Надеюсь они подготовились.");
    }

    @Override
    public void giveExams(Student student) {
        System.out.println("Сегодня я принимаю экзамен у " + student);
    }
}

