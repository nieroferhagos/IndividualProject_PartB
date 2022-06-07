/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author dream
 */
public class Trainer {
    
    private int trainer_id;
    private String firstName;
    private String lastName;
    private String subject;

    public Trainer() {
    }

    public Trainer(int trainer_id, String firstName, String lastName, String subject) {
        this.trainer_id = trainer_id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
    }

    public int getTrainer_id() {
        return trainer_id;
    }

    public void setTrainer_id(int trainer_id) {
        this.trainer_id = trainer_id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Trainer{");
        sb.append("trainer_id=").append(trainer_id);
        sb.append(", firstName=").append(firstName);
        sb.append(", lastName=").append(lastName);
        sb.append(", subject=").append(subject);
        sb.append('}');
        return sb.toString();
    }
    
    
}
