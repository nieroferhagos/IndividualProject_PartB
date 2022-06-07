/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menu;

import dao.StudentDao;

/**
 *
 * @author dream
 */
public class StudentMenu {
    
    public static void StudentMenu() {
    
        StudentDao s = new StudentDao();
        s.importStudent();
        
    }
}
