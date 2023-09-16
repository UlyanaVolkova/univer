package ru.volkova.univerapp.entity;

import ru.volkova.univerapp.service.Exam;
import ru.volkova.univerapp.service.TeacherAction;


public class Teacher implements Exam, TeacherAction {
    String name;
    String subject;

    Student student = new Student("Ivanov", 222);
    String studentExam = student.studentName;
    int studentGroup = student.group;

    University university = new University();
    String nameUniver = university.universityName;

    public Teacher(String nameTeacher, String subject ){

    }

@Override
    public void exam(){
    System.out.println("Сегодня я принимаю экзамен в " + nameUniver + " у " + studentGroup + " группы. Надеюсь они подготовились.");
}

@Override
    public void giveExams(){
    System.out.println("Сегодня я принимаю экзамен у " + studentExam);

}
    }

