/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menu;

import dao.AssignmentDao;

/**
 *
 * @author dream
 */
public class AssignmentMenu {
    
    public static void AssignmentMenu() {
    
        AssignmentDao a = new AssignmentDao();
        a.importSubmission();
    }
}
