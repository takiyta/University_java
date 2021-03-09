package com.company.entities;

public class University {
    private int u_id;
    public University() {
    }
    public University(int u_id) {
        this.u_id = u_id;
    }
    public int getU_id() {
        return u_id;
    }
    public void setU_id(int u_id) {
        this.u_id = u_id;
    }
    @Override
    public String toString() {
        return "University{" +
                "u_id=" + u_id +
                '}';
    }
}
