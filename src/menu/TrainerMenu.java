/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menu;

import dao.TrainerDao;

/**
 *
 * @author dream
 */
public class TrainerMenu {
    
    public static void TrainerMenu() {
    
        TrainerDao t = new TrainerDao();
        t.importTrainer();
        
    }
}
