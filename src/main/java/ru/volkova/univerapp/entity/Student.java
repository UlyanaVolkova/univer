package ru.volkova.univerapp.entity;

import ru.volkova.univerapp.service.Exam;
import ru.volkova.univerapp.service.StudentAction;

public class Student implements Exam, StudentAction {

   String studentName;
   int group;

   Teacher teacher = new Teacher("Ivan Ivanovich", "Biology");
 String examiner = teacher.name;
 String examSubject = teacher.subject;

 University university = new University();
 String nameUniversity = university.universityName;

    public Student(String name, int group) {
    }

    @Override

            public void exam(){
        System.out.println("Я учусь в " + nameUniversity + ". Сегодня экзамен по " + examSubject);
    }


    @Override

    public void pullTicket(){
        int num = (int) (Math.random() * 10);
        if (num % 2 == 0) {
            System.out.println("Ура я выучил все четные билеты, я сдам экзамен! " + examiner + " поставит мне 5!");
        } else {
            System.out.println("О, нет! Этот билет я не знаю. Экзамен не сдать. " + examiner + " отправит на пересдачу.");
        }

    }
    }


