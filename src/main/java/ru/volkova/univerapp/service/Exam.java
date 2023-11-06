package ru.volkova.univerapp.service;


import ru.volkova.univerapp.entity.Student;
import ru.volkova.univerapp.entity.Teacher;
import ru.volkova.univerapp.entity.University;

public interface Exam {
    public void exam(University university, Student student, Teacher teacher);
}
