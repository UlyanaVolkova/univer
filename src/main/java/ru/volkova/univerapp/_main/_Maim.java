package ru.volkova.univerapp._main;

import ru.volkova.univerapp.entity.Student;
import ru.volkova.univerapp.entity.University;
import ru.volkova.univerapp.service.TeacherAction;

public class _Maim {
    public static void main(String [] args){
        Student student = new Student("Ivanov", 222);
        student.pullTicket();
        student.exam();
        University university = new University("TumGMU");





    }
}
