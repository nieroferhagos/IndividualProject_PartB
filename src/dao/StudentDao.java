/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import models.Student;
import utilities.DbConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import utilities.InputScanner;

/**
 *
 * @author dream
 */
public class StudentDao {

    public static List<Student> students = new ArrayList<>();
    public static List<Student> multiplecoursestudents = new ArrayList<>();

    public static void getAllStudents() {

        Connection con = DbConnection.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "select * from privateschool.students";

        try {

            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {

                Student s = new Student(
                        rs.getInt("Student_ID"),
                        rs.getString("StFirstName"),
                        rs.getString("StLastName"),
                        rs.getDate("DateOfBirth"),
                        rs.getDouble("TuitionFees"));

                students.add(s);

            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {

            try {
                rs.close();
                ps.close();
                con.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }

        }
        
        for (int i=0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }

    }
    
    public static void getStudentsWithMultiple() {

        Connection con = DbConnection.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "select Student_ID, StFirstName, StLastName from privateschool.students"
                + " INNER JOIN studentspercourse ON Student_ID=Student"
                + " GROUP BY Student_ID"
                + " HAVING COUNT(Student)>1";

        try {

            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {

                Student s = new Student(
                        rs.getInt("Student_ID"),
                        rs.getString("StFirstName"),
                        rs.getString("StLastName"));

                multiplecoursestudents.add(s);

            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {

            try {
                rs.close();
                ps.close();
                con.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }

        }
        
        for (int i=0; i < multiplecoursestudents.size(); i++) {
            System.out.println(multiplecoursestudents.get(i));
        }

    }

    public void importStudent() {

        System.out.println("Please enter your first name: ");
        String firstName = InputScanner.stringInput();

        System.out.println("Please enter your last name: ");
        String lastName = InputScanner.stringInput();

        System.out.println("Please enter your date of birth: ");
        java.util.Date dateOfBirth = InputScanner.dateInput();

        System.out.println("Please enter your tuition fees: ");
        double tuitionFees = InputScanner.doubleInput();

        Connection con = DbConnection.getConnection();
        PreparedStatement ps = null;
        String sql = "insert into students values (?,?,?,?,?)";
        java.sql.Date sqlDate = new java.sql.Date(dateOfBirth.getTime());

        try {

            ps = con.prepareStatement(sql);
            ps.setString(1, null);
            ps.setString(2, firstName);
            ps.setString(3, lastName);
            ps.setDate(4, sqlDate);
            ps.setDouble(5, tuitionFees);
            ps.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {

            try {
                ps.close();
                con.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }

        }
    }

}
