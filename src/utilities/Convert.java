/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilities;

/**
 *
 * @author dream
 */
public class Convert {
    
    public static java.sql.Timestamp convert(java.util.Date date) {
        return new java.sql.Timestamp(date.getTime());
    }
    
}
