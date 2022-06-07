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
import models.AssignmentsPerCoursePerStudent;
import utilities.DbConnection;
import java.sql.SQLException;
import utilities.InputScanner;

/**
 *
 * @author dream
 */
public class AssignmentsPerCoursePerStudentDao {

    public static List<AssignmentsPerCoursePerStudent> assignmentspercourseperstudent = new ArrayList<>();
    public static List<AssignmentsPerCoursePerStudent> validationmap = new ArrayList<>();

    public static void getAllAssignmentsPerCoursePerStudent() {

        Connection con = DbConnection.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "select StFirstName, StLastName, CourseTitle, Stream, Type, AssTitle, OralMark, WrittenMark, SubDateTime from students"
                + " inner join studentsubmission on students.Student_ID=studentsubmission.StudentSub"
                + " inner join assignments on assignments.Assignment_ID=studentsubmission.AssSub"
                + " inner join studentspercourse on students.Student_ID=studentspercourse.Student"
                + " inner join courses on courses.Course_ID=studentspercourse.StCourse"
                + " order by StudSub_ID";

        try {

            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {

                AssignmentsPerCoursePerStudent stpc = new AssignmentsPerCoursePerStudent(
                        rs.getString("StFirstName"),
                        rs.getString("StLastName"),
                        rs.getString("CourseTitle"),
                        rs.getString("Stream"),
                        rs.getString("Type"),
                        rs.getString("AssTitle"),
                        rs.getDouble("OralMark"),
                        rs.getDouble("WrittenMark"),
                        rs.getDate("SubDateTime"));

                assignmentspercourseperstudent.add(stpc);

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

        for (int i = 0; i < assignmentspercourseperstudent.size(); i++) {
            System.out.println(assignmentspercourseperstudent.get(i));
        }

    }

    public void assPerCoPerStuValidation() {

        Connection con = DbConnection.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "select Student_ID, Assignment_ID from students"
                + " inner join studentsubmission on students.Student_ID=studentsubmission.StudentSub"
                + " inner join assignments on assignments.Assignment_ID=studentsubmission.AssSub"
                + " inner join studentspercourse on students.Student_ID=studentspercourse.Student"
                + " inner join courses on courses.Course_ID=studentspercourse.StCourse"
                + " order by StudSub_ID";

        try {

            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {

                AssignmentsPerCoursePerStudent asc = new AssignmentsPerCoursePerStudent(
                        rs.getInt("Student_ID"),
                        rs.getInt("Assignment_ID"));

                validationmap.add(asc);

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

    public void importAcs() {

        System.out.println("Please enter a valid student ID: ");
        int student_id = InputScanner.intInput();

        System.out.println("Please enter a valid assignment ID: ");
        int assignment_id = InputScanner.intInput();

        AssignmentsPerCoursePerStudent tempData = new AssignmentsPerCoursePerStudent(student_id, assignment_id);
        AssignmentsPerCoursePerStudent comparator = new AssignmentsPerCoursePerStudent();
        boolean flag = true;

        while (flag) {

            for (int i = 0; i < validationmap.size(); i++) {
                comparator = validationmap.get(i);
                if (tempData.equals(comparator)) {

                    System.out.println("Please enter a valid student ID: ");
                    student_id = InputScanner.intInput();

                    System.out.println("Please enter a valid assignment ID: ");
                    assignment_id = InputScanner.intInput();

                    tempData = new AssignmentsPerCoursePerStudent(student_id, assignment_id);
                } else {
                    flag = false;
                }
            }
        }

        Connection con = DbConnection.getConnection();
        PreparedStatement ps = null;
        String sql = "insert into studentsubmission values (?,?,?,?,?,?)";

        try {

            ps = con.prepareStatement(sql);
            ps.setString(1, null);
            ps.setInt(2, student_id);
            ps.setInt(3, assignment_id);
            ps.setString(4, null);
            ps.setString(5, null);
            ps.setString(6, null);
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
