package ru.volkova.univerapp.entity;

import ru.volkova.univerapp.service.Exam;
import ru.volkova.univerapp.service.StudentAction;

public class Student implements Exam, StudentAction {
   static String studentName;
   static int group;
 String examiner = Teacher.name;
 String examSubject = Teacher.subject;
 String nameUniversity = University.universityName;

 public Student(String studentName, int group){
     this.studentName=studentName;
     this.group=group;
 }

 public String getStudentName(){
     return studentName;
 }

 public void setStudentName(){
     this.studentName=studentName;
 }

 public int getGroup(){
     return group;
 }

 public void setGroup(){
     this.group=group;
 }

    @Override

            public void exam(){
        System.out.println("Я учусь в " + nameUniversity + ". Сегодня экзамен по " + examSubject);
    }

    @Override

    public  void pullTicket(){
        int num = (int) (Math.random() * 10);
        if (num % 2 == 0) {
            System.out.println("Ура я выучил все четные билеты, я сдам экзамен! " + examiner + " поставит мне 5!");
        } else {
            System.out.println("О, нет! Этот билет я не знаю. Экзамен не сдать. " + examiner + " отправит на пересдачу.");
        }
    }
    }


