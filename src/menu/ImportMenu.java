/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menu;

import utilities.InputScanner;

/**
 *
 * @author dream
 */
public final class ImportMenu {
    
    public static void ImportMenu() {
    
        System.out.println("Please choose the following actions for your import:");
        System.out.println("For Student press 1");
        System.out.println("For Trainer press 2");
        System.out.println("For Assignment press 3");
        System.out.println("For Course press 4");
        System.out.println("For Students Per Course press 5");
        System.out.println("For Trainers Per Course press 6");
        System.out.println("For Assignments Per Course press 7");
        System.out.println("For Assignments Per Course Per Student press 8");
        
        
        int option = InputScanner.intInput();
        
        switch (option) {
        
            case 1:
                StudentMenu.StudentMenu();
                MainMenu.MainMenu();
                break;
            case 2:
                TrainerMenu.TrainerMenu();
                MainMenu.MainMenu();
                break;
            case 3:
                AssignmentMenu.AssignmentMenu();
                MainMenu.MainMenu();
                break;
            case 4:
                CourseMenu.CourseMenu();
                MainMenu.MainMenu();
                break;
            case 5:
                StudentsPerCourseMenu.StudentsPerCourseMenu();
                MainMenu.MainMenu();
                break;
            case 6:
                TrainersPerCourseMenu.TrainersPerCourseMenu();
                MainMenu.MainMenu();
                break;
            case 7:
                AssignmentsPerCourseMenu.AssignmnentsPerCourseMenu();
                MainMenu.MainMenu();
                break;
            case 8:
                AssignmentsPerCoursePerStudentMenu.AssignmentsPerCoursePerStudentMenu();
                MainMenu.MainMenu();
                break;
        }
        
        
    }
}
