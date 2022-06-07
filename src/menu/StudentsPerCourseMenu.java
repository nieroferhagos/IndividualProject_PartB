/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menu;

import dao.StudentsPerCourseDao;

/**
 *
 * @author dream
 */
public class StudentsPerCourseMenu {
    
    public static void StudentsPerCourseMenu() {
    
    StudentsPerCourseDao stpc = new StudentsPerCourseDao();
    stpc.studentPerCourseValidation();
    stpc.importStudentPerCourse();
    }
    
   
}
