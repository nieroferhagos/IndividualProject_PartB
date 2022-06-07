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
public class StudentsPerCourse {

    private int stpc_id;
    private int student_id;
    private int course_id;
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private String title;
    private String stream;
    private String type;
    private Date startDate;
    private Date endDate;

    public StudentsPerCourse() {
    }

    public StudentsPerCourse(int student_id, int course_id) {
        this.student_id = student_id;
        this.course_id = course_id;
    }

    
    public StudentsPerCourse(int stpc_id, int student_id, int course_id) {
        this.stpc_id = stpc_id;
        this.student_id = student_id;
        this.course_id = course_id;
    }
    
    

    public StudentsPerCourse(String firstName, String lastName, Date dateOfBirth, String title, String stream, String type, Date startDate, Date endDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.title = title;
        this.stream = stream;
        this.type = type;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    
    public StudentsPerCourse(int stpc_id, int student_id, int course_id, String firstName, String lastName, Date dateOfBirth, String title, String stream, String type, Date startDate, Date endDate) {
        this.stpc_id = stpc_id;
        this.student_id = student_id;
        this.course_id = course_id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.title = title;
        this.stream = stream;
        this.type = type;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public int getStpc_id() {
        return stpc_id;
    }

    public void setStpc_id(int stpc_id) {
        this.stpc_id = stpc_id;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
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

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
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
        sb.append("StudentsPerCourse{");
        sb.append("firstName=").append(firstName);
        sb.append(", lastName=").append(lastName);
        sb.append(", dateOfBirth=").append(dateOfBirth);
        sb.append(", title=").append(title);
        sb.append(", stream=").append(stream);
        sb.append(", type=").append(type);
        sb.append(", startDate=").append(startDate);
        sb.append(", endDate=").append(endDate);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + this.student_id;
        hash = 83 * hash + this.course_id;
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
        final StudentsPerCourse other = (StudentsPerCourse) obj;
        if (this.student_id != other.student_id) {
            return false;
        }
        return this.course_id == other.course_id;
    }

    

}
