/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menu;

import dao.AssignmentsPerCourseDao;

/**
 *
 * @author dream
 */
public class AssignmentsPerCourseMenu {

    public static void AssignmnentsPerCourseMenu() {

        AssignmentsPerCourseDao apc = new AssignmentsPerCourseDao();
        apc.assignmentsPerCourseValidation();
        apc.importAssignmentsPerCourse();
        
    }
}
