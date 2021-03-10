package com.company.repositories.interfaces; //Alikhan Aras

import com.company.entities.Student;

import java.util.List;

public interface IStudentRepository {
    boolean createStudent(Student student);

    Student getStudent(int s_id);

    List<Student> getAllStudents();


}
