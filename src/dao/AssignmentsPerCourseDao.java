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
import utilities.DbConnection;
import java.sql.SQLException;
import models.AssignmentsPerCourse;
import utilities.InputScanner;
/**
 *
 * @author dream
 */
public class AssignmentsPerCourseDao {
    
    public static List<AssignmentsPerCourse> assignmentspercourse = new ArrayList<>();
    public static List<AssignmentsPerCourse> validationmap = new ArrayList<>();
    
    public static void getAllAssignmentsPerCourse() {
    
        Connection con = DbConnection.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "select AssTitle, Description, CourseTitle, Stream, Type from assignments"
                + " inner join assignmentspercourse on assignments.Assignment_ID=assignmentspercourse.Assignment"
                + " inner join courses on courses.Course_ID=assignmentspercourse.AssCourse"
                + " order by AssPerCourse_ID";
        
        try {

            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {

                AssignmentsPerCourse stpc = new AssignmentsPerCourse(
                        rs.getString("AssTitle"),
                        rs.getString("Description"),
                        rs.getString("CourseTitle"),
                        rs.getString("Stream"),
                        rs.getString("Type"));

                assignmentspercourse.add(stpc);

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
               
        for (int i=0; i < assignmentspercourse.size(); i++) {
            System.out.println(assignmentspercourse.get(i));
        }
        
    }
    
    public void assignmentsPerCourseValidation() {

        Connection con = DbConnection.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "select * from assignmentspercourse";

        try {

            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {

                AssignmentsPerCourse stpc = new AssignmentsPerCourse(
                        rs.getInt("Assignment"),
                        rs.getInt("AssCourse"));

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

    public void importAssignmentPerCourse() {

        System.out.println("Please enter a valid assignment ID: ");
        int assignment_id = InputScanner.intInput();

        System.out.println("Please enter a valid course ID: ");
        int course_id = InputScanner.intInput();

        AssignmentsPerCourse tempData = new AssignmentsPerCourse(assignment_id, course_id);
        AssignmentsPerCourse comparator = new AssignmentsPerCourse();
        boolean flag = true;

        while (flag) {

            for (int i = 0; i < validationmap.size(); i++) {
                comparator = validationmap.get(i);
                if (tempData.equals(comparator)) {
                    
                    System.out.println("Please enter a valid assignment ID: ");
                    assignment_id = InputScanner.intInput();

                    System.out.println("Please enter a valid course ID: ");
                    course_id = InputScanner.intInput();
                    
                    tempData = new AssignmentsPerCourse(assignment_id, course_id);
                } else {
                    flag = false;
                }
            }
        }

        Connection con = DbConnection.getConnection();
        PreparedStatement ps = null;
        String sql = "insert into assignmentspercourse values (?,?,?)";

        try {

            ps = con.prepareStatement(sql);
            ps.setString(1, null);
            ps.setInt(2, assignment_id);
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
