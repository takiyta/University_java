package com.company.entities; //arai

public class Student extends Department  { //Create a class student inherited from a department class
    private int s_id;
    private String name;
    private String grant; // private = restricted access

    public Student( ) { //The default constructor is the no-argument constructor automatically generated
    }

    public Student(int s_id, String name, String grant) { //Creat constructor
        this.s_id = s_id;
        this.grant = grant;
        this.name = name;
    }

    public Student( int s_id, String name, String grant, int dep_id) { //Creat constructor with superclass variable
        super(dep_id);
        this.s_id = s_id;
        this.name = name;
        this.grant = grant;
    }

    public Student(String name, String grant, int dep_id) { //Creat constructor
        super(dep_id);
        this.name = name;
        this.grant = grant;
    }

    public Student(String name) {
        this.name = name;
    }

    public int getS_id() {
        return s_id;
    } //method returns the variable value

    public void setS_id(int s_id) {
        this.s_id = s_id;
    } //method sets the value

    public String getGrant() {
        return grant;
    } //method returns the variable value

    public void setGrant(String grant) {
        this.grant = grant;
    } //method sets the value

    public String getName() { return name; } //method returns the variable value

    public void setName(String name) { this.name = name; } //method sets the value



    @Override
    public String toString() { //method is overridden so that the object values can be returned
        return "Student{" +
                "s_id=" + s_id +
                ", name='" + name + '\'' +
                ", grant='" + grant + '\'' +
                '}';
    }
}
