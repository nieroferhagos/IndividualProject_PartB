/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menu;

import dao.AssignmentDao;
import dao.AssignmentsPerCourseDao;
import dao.AssignmentsPerCoursePerStudentDao;
import dao.CourseDao;
import dao.StudentDao;
import dao.StudentsPerCourseDao;
import dao.TrainerDao;
import dao.TrainersPerCourseDao;
import utilities.InputScanner;

/**
 *
 * @author dream
 */
public final class ViewMenu {
    
    public static void ViewMenu() {
    
        System.out.println("Please choose the following actions to view a list:");
        System.out.println("To view the list of all the students press 1");
        System.out.println("To view the list of all the trainers press 2");
        System.out.println("To view the list of all the assignments press 3");
        System.out.println("To view the list of all the courses press 4");
        System.out.println("To view the list of all the students per course press 5");
        System.out.println("To view the list of all the trainers per course press 6");
        System.out.println("To view the list of all the assignments per course press 7");
        System.out.println("To view the list of all the assignments per course per student press 8");
        System.out.println("To view the list of all the students that belong to more than one course press 9");
        
        int option = InputScanner.intInput();
        
        switch (option) {
        
            case 1:
                StudentDao.getAllStudents();
                MainMenu.MainMenu();
                break;
            case 2:
                TrainerDao.getAllTrainers();
                MainMenu.MainMenu();
                break;
            case 3:
                AssignmentDao.getAllAssignments();
                MainMenu.MainMenu();
                break;
            case 4:
                CourseDao.getAllCourses();
                MainMenu.MainMenu();
                break;
            case 5:
                StudentsPerCourseDao.getAllStudentsPerCourse();
                MainMenu.MainMenu();
                break;
            case 6:
                TrainersPerCourseDao.getAllTrainersPerCourse();
                MainMenu.MainMenu();
                break;
            case 7:
                AssignmentsPerCourseDao.getAllAssignmentsPerCourse();
                MainMenu.MainMenu();
                break;
            case 8:
                AssignmentsPerCoursePerStudentDao.getAllAssignmentsPerCoursePerStudent();
                MainMenu.MainMenu();
                break;
            case 9:
                StudentDao.getStudentsWithMultiple();
                MainMenu.MainMenu();
                break;  
        }
        
        
    }
}
