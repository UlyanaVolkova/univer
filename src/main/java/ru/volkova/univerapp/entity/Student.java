package ru.volkova.univerapp.entity;

import ru.volkova.univerapp.service.Exam;
import ru.volkova.univerapp.service.StudentAction;

public class Student implements Exam, StudentAction {
    String studentName;
    int group;
    Teacher teacher;
    University university;

    public Student(String studentName, int group) {
        this.studentName = studentName;
        this.group = group;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName() {
        this.studentName = studentName;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup() {
        this.group = group;
    }

    @Override
    public void exam(University university, Student student, Teacher teacher) {
        System.out.println("Я учусь в " + university.universityName + ". Сегодня экзамен по " + teacher.subject);
    }

    @Override
    public void pullTicket(Teacher teacher) {
        int num = (int) (Math.random() * 10);
        if (num % 2 == 0) {
            System.out.println("Ура я выучил все четные билеты, я сдам экзамен! " + teacher.name + " поставит мне 5!");
        } else {
            System.out.println("О, нет! Этот билет я не знаю. Экзамен не сдать. " + teacher.name + " отправит на пересдачу.");
        }
    }
}


