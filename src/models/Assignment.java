/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author dream
 */
public class Assignment {
    
    private int assignment_id;
    private String title;
    private String description;

    public Assignment() {
    }

    public Assignment(int assignment_id, String title, String description) {
        this.assignment_id = assignment_id;
        this.title = title;
        this.description = description;
    }

    public int getAssignment_id() {
        return assignment_id;
    }

    public void setAssignment_id(int assignment_id) {
        this.assignment_id = assignment_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Assignment{");
        sb.append("assignment_id=").append(assignment_id);
        sb.append(", title=").append(title);
        sb.append(", description=").append(description);
        sb.append('}');
        return sb.toString();
    }
    
    
}
