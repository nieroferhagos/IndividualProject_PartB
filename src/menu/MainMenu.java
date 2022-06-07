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
public final class MainMenu {
    
    public static void MainMenu(){
     
        System.out.println("Welcome to our Private School");
        System.out.println("If you want to import new data press 1");
        System.out.println("If you want to view our list press 2");
        System.out.println("If you want to exit press 0");
        
        int option = InputScanner.intInput();
        
        switch (option) {
            
            case 1:
               ImportMenu.ImportMenu();
               break;
            case 2:
                ViewMenu.ViewMenu();
                break;
            case 0:
                System.exit(0);
                break;
        }
    
    }
    
}
