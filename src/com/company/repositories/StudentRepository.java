package com.company.repositories; //Alikhan Aras

import com.company.data.interfaces.IDB;
import com.company.entities.Student;
import com.company.repositories.interfaces.IStudentRepository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements IStudentRepository {
    private final IDB db;

    public StudentRepository(IDB db) {
        this.db = db;
    }

    @Override
    public boolean createStudent(Student student) {
        Connection con = null;
        try {
            con = db.getConnection();
            String sql = "INSERT INTO Student(name, grant1, dep_id) VALUES (?,?,?)";
            PreparedStatement st = con.prepareStatement(sql);

            st.setString(1, student.getName());
            st.setString(2, student.getGrant());
            st.setInt(3, student.getDep_id());

            boolean executed = st.execute();
            return executed;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return false;
    }

    @Override
    public Student getStudent(int s_id) {
        Connection con = null;
        try {
            con = db.getConnection();
            String sql = "SELECT  s_id, name, grant1, dep_id FROM Student WHERE s_id=?";
            PreparedStatement st = con.prepareStatement(sql);

            st.setInt(1, s_id);

            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                Student student = new Student(rs.getInt("s_id"),
                        rs.getString("name"),
                        rs.getString("grant1"),
                        rs.getInt("dep_id"));


                return student;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public List<Student> getAllStudents() {
        Connection con = null;
        try {
            con = db.getConnection();
            String sql = "SELECT s_id, name, grant1, dep_id FROM student";
            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(sql);
            List<Student> students = new ArrayList<>();
            while (rs.next()) {
                Student student = new Student(rs.getInt("s_id"),
                        rs.getString("name"),
                        rs.getString("grant1"),
                        rs.getInt("dep_id"));


                students.add(student);
            }

            return students;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return null;
    }
}