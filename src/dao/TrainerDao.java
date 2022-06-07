/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import models.Trainer;
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
public class TrainerDao {

    public static List<Trainer> trainers = new ArrayList<>();

    public static void getAllTrainers() {

        Connection con = DbConnection.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "select * from privateschool.trainers";

        try {

            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {

                Trainer s = new Trainer(
                        rs.getInt("Trainer_ID"),
                        rs.getString("TrFirstName"),
                        rs.getString("TrLastName"),
                        rs.getString("Subject"));

                trainers.add(s);

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
        
        for (int i=0; i < trainers.size(); i++) {
            System.out.println(trainers.get(i));
        }

    }

    public void importTrainer() {

        System.out.println("Please enter your first name: ");
        String firstName = InputScanner.stringInput();

        System.out.println("Please enter your last name: ");
        String lastName = InputScanner.stringInput();

        System.out.println("Please enter your subject: ");
        String subject = InputScanner.stringInput();

        Connection con = DbConnection.getConnection();
        PreparedStatement ps = null;
        String sql = "insert into trainers values (?,?,?,?)";

        try {

            ps = con.prepareStatement(sql);
            ps.setString(1, null);
            ps.setString(2, firstName);
            ps.setString(3, lastName);
            ps.setString(4, subject);
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
