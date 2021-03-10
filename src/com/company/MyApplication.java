package com.company;

import com.company.controllers.StudentController;
import com.company.repositories.interfaces.IStudentRepository;
import java.util.Scanner; //It declares a Java class to use in the code below the import statement

public class MyApplication {
    private final StudentController controller;
    private final Scanner scanner;

    public MyApplication(IStudentRepository studentRepository) {
        controller = new StudentController(studentRepository);
        scanner = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            System.out.println();
            System.out.println("Welcome to My Application");
            System.out.println("Select option:");
            System.out.println("1. Get all student");
            System.out.println("2. Get student by id");
            System.out.println("3. Create student");
            System.out.println("0. Exit");
            System.out.println(); //The text that comes out when you activate the compiler
            try {
                System.out.print("Enter option (1-3): ");
                int option = scanner.nextInt();
                if (option == 1) {
                    getAllStudentsMenu();
                } else if (option == 2) {
                    getStudentByIdMenu();
                } else if (option == 3) {
                    createStudentMenu();
                } else {
                    break; //Sends us to the method depending on what the user chooses
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                scanner.next(); // to ignore incorrect input
            }

            System.out.println("*********");

        }
    }

    public void getAllStudentsMenu() {
        String response = controller.getAllStudents();
        System.out.println(response); //Sent us to a method that calls all students
    }

    public void getStudentByIdMenu() {
        System.out.println("Please enter id");

        int id = scanner.nextInt();
        String response = controller.getStudent(id);
        System.out.println(response); //Sent us to a method that displays a student by ID
    }

    public void createStudentMenu() {
        System.out.println("Please enter name");
        String name = scanner.next();
        System.out.println("Please enter grant type ");
        String grant = scanner.next();
        System.out.println("Please enter department");
        String dep_id = scanner.next(); //Sent us to a method that introduces new students

        String response = controller.createStudent(name, grant, Integer.parseInt(dep_id));
        System.out.println(response);
    }
}