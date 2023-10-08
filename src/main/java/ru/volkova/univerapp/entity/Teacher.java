package ru.volkova.univerapp.entity;

import ru.volkova.univerapp.service.Exam;
import ru.volkova.univerapp.service.TeacherAction;

public class Teacher implements Exam, TeacherAction {
    static String name;
    static String subject;
    String studentExam = Student.studentName;
    int studentGroup = Student.group;
    String nameUniver = University.universityName;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
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
    public void exam() {
        System.out.println("Сегодня я принимаю экзамен в " + nameUniver + " у " + studentGroup + " группы. Надеюсь они подготовились.");
    }

    @Override
    public void giveExams() {
        System.out.println("Сегодня я принимаю экзамен у " + studentExam);
    }
}

