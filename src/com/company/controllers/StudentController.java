package com.company.controllers;
import com.company.entities.Student;
import com.company.repositories.interfaces.IStudentRepository;
import java.util.List; //It declares a Java class to use in the code below the import statement

public class StudentController {
    private final IStudentRepository repo;

    public StudentController(IStudentRepository repo) {
        this.repo = repo;
    }

    public String createStudent(String name, String grant, int dep_id) {
        Student student = new Student(name, grant, dep_id);

        boolean created = repo.createStudent(student);

        return (created ? "Student was created!" : "Student creation was failed!");
    }

    public String getStudent(int id) {
        Student student = repo.getStudent(id);

        return (student == null ? "Student was not found!" : student.toString());
    }

    public String getAllStudents() {
        List<Student> students = repo.getAllStudents();

        return students.toString();
    }
}
