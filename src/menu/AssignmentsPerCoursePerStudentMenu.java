/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menu;

import dao.AssignmentsPerCoursePerStudentDao;

/**
 *
 * @author dream
 */
public class AssignmentsPerCoursePerStudentMenu {
    
    public static void AssignmentsPerCoursePerStudentMenu() {
    
        AssignmentsPerCoursePerStudentDao acs = new AssignmentsPerCoursePerStudentDao();
        acs.assPerCoPerStuValidation();
        acs.importAcs();
    }
}
