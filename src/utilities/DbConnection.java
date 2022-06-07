/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author dream
 */
public class DbConnection {

    private static final String url = "jdbc:mysql://localhost:3306/privateschool?zeroDateTimeBehavior=CONVERT_TO_NULL";
    private static final String user = "root";
    private static final String password = "rNh11@kM25#18kz";

    public static Connection getConnection() {

        Connection con = null;

        try {
            con = DriverManager.getConnection(url, user, password);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return con;
    }
}
