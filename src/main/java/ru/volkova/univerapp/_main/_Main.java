package ru.volkova.univerapp._main;

import ru.volkova.univerapp.entity.Student;
import ru.volkova.univerapp.entity.Teacher;
import ru.volkova.univerapp.entity.University;

public class _Main {
    public static void main(String[] args) {
        Student student = new Student("Ivanov", 222);
        Teacher teacher = new Teacher("Petrov.A.A.", "Biology");
        University university = new University("TumGMU");

        student.exam();
        teacher.exam();
        student.pullTicket();
        teacher.giveExams();
    }
}
