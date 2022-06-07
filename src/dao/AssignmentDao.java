/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import static dao.AssignmentsPerCoursePerStudentDao.validationmap;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import models.Assignment;
import utilities.DbConnection;
import java.sql.SQLException;
import java.util.Date;
import models.AssignmentsPerCoursePerStudent;
import static utilities.Convert.convert;
import utilities.InputScanner;

/**
 *
 * @author dream
 */
public class AssignmentDao {

    public static List<Assignment> assignments = new ArrayList<>();

    public static void getAllAssignments() {

        Connection con = DbConnection.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "select * from privateschool.assignments";

        try {

            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {

                Assignment a = new Assignment(
                        rs.getInt("Assignment_ID"),
                        rs.getString("AssTitle"),
                        rs.getString("Description"));

                assignments.add(a);

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

        for (int i = 0; i < assignments.size(); i++) {
            System.out.println(assignments.get(i));
        }

    }

    public void importAssignment() {

        System.out.println("Please enter your assignment title:");
        String title = InputScanner.stringInput();

        System.out.println("Please enter your description:");
        String description = InputScanner.LineInput();

        Connection con = DbConnection.getConnection();
        PreparedStatement ps = null;
        String sql = "insert into assignments values (?,?,?)";

        try {

            ps = con.prepareStatement(sql);
            ps.setString(1, null);
            ps.setString(2, title);
            ps.setString(3, description);
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

    public void importSubmission() {

        AssignmentsPerCoursePerStudentDao acs = new AssignmentsPerCoursePerStudentDao();
        acs.assPerCoPerStuValidation();
        boolean flag = true;

        System.out.println("Please put a valid student ID:");
        int student_id = InputScanner.intInput();

        System.out.println("Please put a valid assignment ID:");
        int assignment_id = InputScanner.intInput();
        while (flag) {
            
            AssignmentsPerCoursePerStudent temp = new AssignmentsPerCoursePerStudent(student_id, assignment_id);
            AssignmentsPerCoursePerStudent comparator = new AssignmentsPerCoursePerStudent();

            for (int i = 0; i < validationmap.size(); i++) {
                comparator = validationmap.get(i);
                if (temp.equals(comparator)) {

                    System.out.println("Please enter a valid student ID: ");
                    student_id = InputScanner.intInput();

                    System.out.println("Please enter a valid assignment ID: ");
                    assignment_id = InputScanner.intInput();

                    temp = new AssignmentsPerCoursePerStudent(student_id, assignment_id);
                } else {
                    flag = false;
                }
            }
        }
        System.out.println("Please put an oral mark:");
        double oralMark = InputScanner.doubleInput();

        System.out.println("Please put a written mark:");
        double writtenMark = InputScanner.doubleInput();

        System.out.println("Please enter a valid submission date:");
        Date submission = InputScanner.dateTimeInput();

        Connection con = DbConnection.getConnection();
        PreparedStatement ps = null;
        String sql = "insert into studentsubmission (StudentSub,AssSub,OralMark,"
                + "WrittenMark,SubDateTime) values (?,?,?,?,?)";

        java.sql.Timestamp sqlTimeStamp = convert(submission);

        try {

            ps = con.prepareStatement(sql);
            ps.setInt(1, student_id);
            ps.setInt(2, assignment_id);
            ps.setDouble(3, oralMark);
            ps.setDouble(4, writtenMark);
            ps.setTimestamp(5, sqlTimeStamp);

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
