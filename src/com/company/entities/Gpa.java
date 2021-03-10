package com.company.entities;

public class Gpa {
    private int gpa_id;
    private int gpa_percentage;

    public Gpa(int gpa_id, int gpa_percentage) {
        this.gpa_id = gpa_id;
        this.gpa_percentage = gpa_percentage;
    }

    public int getGpa_id() {
        return gpa_id;
    }

    public void setGpa_id(int gpa_id) {
        this.gpa_id = gpa_id;
    }

    public int getGpa_percentage() {
        return gpa_percentage;
    }

    public void setGpa_percentage(int gpa_percentage) {
        this.gpa_percentage = gpa_percentage;
    }
}
