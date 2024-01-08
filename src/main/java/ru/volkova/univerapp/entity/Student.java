package ru.volkova.univerapp.entity;

import ru.volkova.univerapp.service.Exam;
import ru.volkova.univerapp.service.StudentAction;

public class Student implements Exam, StudentAction {
    private String studentName;
    private int group;
    private Teacher teacher;
    private University university;

    public Student(String studentName, int group, Teacher teacher, University university) {
        this.studentName = studentName;
        this.group = group;
        this.university = university;
        this.teacher = teacher;
    }

    public Student(String studentName, int group) {
        this.studentName = studentName;
        this.group = group;
    }

    public Student() {
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getGroup(int group) {
        return group;
    }

    public void setGroup() {
        this.group = group;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
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
        sb.append("Студент ")
                .append("по фамилии " + studentName)
                .append(" " + group)
                .append('.');
        return sb.toString();
    }

    @Override
    public void exam(University university, Student student, Teacher teacher) {
        System.out.println("Я учусь в " + university);
        System.out.println("Сегодня экзамен принимает " + teacher);
    }

    @Override
    public void pullTicket(Teacher teacher) {
        int num = (int) (Math.random() * 10);
        if (num % 2 == 0) {
            System.out.println("Ура я выучил все четные билеты, я сдам экзамен! " + teacher + " поставит мне 5!");
        } else {
            System.out.println("О, нет! Этот билет я не знаю. Экзамен не сдать. " + teacher + " отправит на пересдачу.");
        }
    }
}


