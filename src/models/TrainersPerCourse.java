/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.Date;



/**
 *
 * @author dream
 */
public class TrainersPerCourse {
    
    private int trpc_id;
    private int trainer_id;
    private int course_id;
    private String firstName;
    private String lastName;
    private String title;
    private String subject;
    private String type;
    private Date startDate;
    private Date endDate;

    public TrainersPerCourse() {
    }

    public TrainersPerCourse(int trainer_id, int course_id) {
        this.trainer_id = trainer_id;
        this.course_id = course_id;
    }

    public TrainersPerCourse(int trpc_id, int trainer_id, int course_id) {
        this.trpc_id = trpc_id;
        this.trainer_id = trainer_id;
        this.course_id = course_id;
    }

    public TrainersPerCourse(String firstName, String lastName, String title, String subject, String type, Date startDate, Date endDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.subject = subject;
        this.type = type;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public int getTrpc_id() {
        return trpc_id;
    }

    public void setTrpc_id(int trpc_id) {
        this.trpc_id = trpc_id;
    }

    public int getTrainer_id() {
        return trainer_id;
    }

    public void setTrainer_id(int trainer_id) {
        this.trainer_id = trainer_id;
    }

    public int getCourse_id() {
        return course_id;
    }

    public void setCourse_id(int course_id) {
        this.course_id = course_id;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TrainersPerCourse{");
        sb.append("firstName=").append(firstName);
        sb.append(", lastName=").append(lastName);
        sb.append(", title=").append(title);
        sb.append(", subject=").append(subject);
        sb.append(", type=").append(type);
        sb.append(", startDate=").append(startDate);
        sb.append(", endDate=").append(endDate);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + this.trainer_id;
        hash = 41 * hash + this.course_id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final TrainersPerCourse other = (TrainersPerCourse) obj;
        if (this.trainer_id != other.trainer_id) {
            return false;
        }
        return this.course_id == other.course_id;
    }
    
    
    
    
}
