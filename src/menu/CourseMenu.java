/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menu;

import dao.CourseDao;

/**
 *
 * @author dream
 */
public class CourseMenu {
    
    public static void CourseMenu() {
    
        CourseDao c = new CourseDao();
        c.importCourse();
    
    }
    
}
