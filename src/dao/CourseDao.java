/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import models.Course;
import utilities.DbConnection;
import utilities.InputScanner;

/**
 *
 * @author dream
 */
public class CourseDao {

    public static List<Course> courses = new ArrayList<>();

    public static void getAllCourses() {

        Connection con = DbConnection.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "select * from privateschool.courses";

        try {

            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {

                Course c = new Course(
                        rs.getInt("Course_ID"),
                        rs.getString("CourseTitle"),
                        rs.getString("Stream"),
                        rs.getString("Type"),
                        rs.getDate("StartDate"),
                        rs.getDate("EndDate"));

                courses.add(c);

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

        for (int i = 0; i < courses.size(); i++) {
            System.out.println(courses.get(i));
        }
        
    }

    public void importCourse() {

        System.out.println("Please enter your course title:");
        String title = InputScanner.LineInput();

        System.out.println("Please enter your stream:");
        String stream = InputScanner.LineInput();

        System.out.println("Please enter your type:");
        String type = InputScanner.LineInput();

        System.out.println("Please enter a starting date(yyyy-MM-dd):");
        java.util.Date startDate = InputScanner.dateInput();

        boolean flag = true;
        System.out.println("Please enter an ending date(yyyy-MM-dd):");
        java.util.Date endDate = InputScanner.dateInput();
        int comparator = endDate.compareTo(startDate);

        while (flag) {

            if (comparator <= 0) {

                System.out.println("Please enter a valid date!");
                endDate = InputScanner.dateInput();
                comparator = endDate.compareTo(startDate);

            } else {

                flag = false;

            }

        }

        Connection con = DbConnection.getConnection();
        PreparedStatement ps = null;
        String sql = "insert into courses values (?,?,?,?,?,?)";
        java.sql.Date sqlDate1 = new java.sql.Date(startDate.getTime());
        java.sql.Date sqlDate2 = new java.sql.Date(endDate.getTime());

        try {

            ps = con.prepareStatement(sql);
            ps.setString(1, null);
            ps.setString(2, title);
            ps.setString(3, stream);
            ps.setString(4, type);
            ps.setDate(5, sqlDate1);
            ps.setDate(6, sqlDate2);
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
