/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import models.StudentsPerCourse;
import utilities.DbConnection;
import java.sql.SQLException;
import utilities.InputScanner;

/**
 *
 * @author dream
 */
public class StudentsPerCourseDao {

    public static List<StudentsPerCourse> studentspercourse = new ArrayList<>();
    public static List<StudentsPerCourse> validationmap = new ArrayList<>();

    public static void getAllStudentsPerCourse() {

        Connection con = DbConnection.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "select StFirstName, StLastName, DateOfBirth, CourseTitle, Stream, Type, StartDate, EndDate from students"
                + " inner join studentspercourse on students.Student_ID=studentspercourse.Student"
                + " inner join courses on courses.Course_ID=studentspercourse.StCourse"
                + " order by StPerCourse_ID";

        try {

            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {

                StudentsPerCourse stpc = new StudentsPerCourse(
                        rs.getString("StFirstName"),
                        rs.getString("StLastName"),
                        rs.getDate("DateOfBirth"),
                        rs.getString("CourseTitle"),
                        rs.getString("Stream"),
                        rs.getString("Type"),
                        rs.getDate("StartDate"),
                        rs.getDate("EndDate"));

                studentspercourse.add(stpc);

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

        for (int i = 0; i < studentspercourse.size(); i++) {
            System.out.println(studentspercourse.get(i));
        }

    }

    public void studentPerCourseValidation() {

        Connection con = DbConnection.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "select * from studentspercourse";

        try {

            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {

                StudentsPerCourse stpc = new StudentsPerCourse(
                        rs.getInt("Student"),
                        rs.getInt("StCourse"));

                validationmap.add(stpc);

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

    public void importStudentPerCourse() {

        System.out.println("Please enter a valid student ID: ");
        int student_id = InputScanner.intInput();

        System.out.println("Please enter a valid course ID: ");
        int course_id = InputScanner.intInput();

        StudentsPerCourse tempData = new StudentsPerCourse(student_id, course_id);
        StudentsPerCourse comparator = new StudentsPerCourse();
        boolean flag = true;

        while (flag) {

            for (int i = 0; i < validationmap.size(); i++) {
                comparator = validationmap.get(i);
                if (tempData.equals(comparator)) {
                    
                    System.out.println("Please enter a valid student ID: ");
                    student_id = InputScanner.intInput();

                    System.out.println("Please enter a valid course ID: ");
                    course_id = InputScanner.intInput();
                    
                    tempData = new StudentsPerCourse(student_id, course_id);
                } else {
                    flag = false;
                }
            }
        }

        Connection con = DbConnection.getConnection();
        PreparedStatement ps = null;
        String sql = "insert into studentspercourse values (?,?,?)";

        try {

            ps = con.prepareStatement(sql);
            ps.setString(1, null);
            ps.setInt(2, student_id);
            ps.setInt(3, course_id);
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
