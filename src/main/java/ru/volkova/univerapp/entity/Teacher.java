package ru.volkova.univerapp.entity;

import ru.volkova.univerapp.service.Exam;
import ru.volkova.univerapp.service.TeacherAction;

public class Teacher implements Exam, TeacherAction {
    String name;
    String subject;
    Student student;
    University university;

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

    @Override
    public void exam(University university, Student student, Teacher teacher) {
        System.out.println("Сегодня я принимаю экзамен в " + university.universityName + " у " + student.group + " группы. Надеюсь они подготовились.");
    }

    @Override
    public void giveExams(Student student) {
        System.out.println("Сегодня я принимаю экзамен у " + student.studentName);
    }
}

