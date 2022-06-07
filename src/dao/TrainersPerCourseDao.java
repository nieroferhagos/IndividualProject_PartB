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
import models.TrainersPerCourse;
import utilities.DbConnection;
import java.sql.SQLException;
import utilities.InputScanner;

/**
 *
 * @author dream
 */
public class TrainersPerCourseDao {
    
    public static List<TrainersPerCourse> trainerspercourse = new ArrayList<>();
    public static List<TrainersPerCourse> validationmap = new ArrayList<>();
    
    public static void getAllTrainersPerCourse() {
    
        Connection con = DbConnection.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "select TrFirstName, TrLastName, CourseTitle, Subject, Type, StartDate, EndDate from trainers"
                + " inner join trainerspercourse on trainers.Trainer_ID=trainerspercourse.Trainer"
                + " inner join courses on courses.Course_ID=trainerspercourse.TrCourse"
                + " order by TrPerCourse_ID";
        
        try {

            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {

                TrainersPerCourse stpc = new TrainersPerCourse(
                        rs.getString("TrFirstName"),
                        rs.getString("TrLastName"),
                        rs.getString("CourseTitle"),
                        rs.getString("Subject"),
                        rs.getString("Type"),
                        rs.getDate("StartDate"),
                        rs.getDate("EndDate"));

                trainerspercourse.add(stpc);

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
               
        for (int i=0; i < trainerspercourse.size(); i++) {
            System.out.println(trainerspercourse.get(i));
        }
        
    }
    
    public void trainerPerCourseValidation() {

        Connection con = DbConnection.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "select * from trainerspercourse";

        try {

            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {

                TrainersPerCourse stpc = new TrainersPerCourse(
                        rs.getInt("Trainer"),
                        rs.getInt("TrCourse"));

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

        System.out.println("Please enter a valid trainer ID: ");
        int trainer_id = InputScanner.intInput();

        System.out.println("Please enter a valid course ID: ");
        int course_id = InputScanner.intInput();

        TrainersPerCourse tempData = new TrainersPerCourse(trainer_id, course_id);
        TrainersPerCourse comparator = new TrainersPerCourse();
        boolean flag = true;

        while (flag) {

            for (int i = 0; i < validationmap.size(); i++) {
                comparator = validationmap.get(i);
                if (tempData.equals(comparator)) {
                    
                    System.out.println("Please enter a valid trainer ID: ");
                    trainer_id = InputScanner.intInput();

                    System.out.println("Please enter a valid course ID: ");
                    course_id = InputScanner.intInput();
                    
                    tempData = new TrainersPerCourse(trainer_id, course_id);
                } else {
                    flag = false;
                }
            }
        }

        Connection con = DbConnection.getConnection();
        PreparedStatement ps = null;
        String sql = "insert into trainerspercourse values (?,?,?)";

        try {

            ps = con.prepareStatement(sql);
            ps.setString(1, null);
            ps.setInt(2, trainer_id);
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
