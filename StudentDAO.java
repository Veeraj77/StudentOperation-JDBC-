//StudentDAO.java

import java.sql.*;
import java.util.ArrayList;

public class StudentDAO {

    // Add a new student to the DB
    public void addStudent(Student student) {
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement("INSERT INTO students VALUES (?, ?, ?, ?, ?)")) {
            ps.setString(1, student.getName());
            ps.setInt(2, student.getPRN());
            ps.setString(3, student.getBranch());
            ps.setString(4, student.getBatch());
            ps.setFloat(5, student.getCGPA());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error adding student: " + e.getMessage());
        }
    }

