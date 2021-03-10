package com.company.entities; //arai

public class University { //public class in java is a blueprint of objects which specifies properties and methods of objects belonging to that particular class.
    private int u_id;
    public University() {
    }
    public University(int u_id) //Creat constructor
    {
        this.u_id = u_id;
    }

    public int getU_id() { //method returns the variable value
        return u_id;
    }

    public void setU_id(int u_id) { //method sets the value
        this.u_id = u_id;
    }
    @Override //method is overridden so that the object values can be returned
    public String toString() {
        return "University{" +
                "u_id=" + u_id +
                '}';
    }
}
