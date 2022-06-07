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
public class Student {
    
    private int student_id;
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private double tuitionFees;

    public Student() {
    }

    public Student(int student_id, String firstName, String lastName) {
        this.student_id = student_id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Student(int student_id, String firstName, String lastName, Date dateOfBirth, double tuitionFees) {
        this.student_id = student_id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.tuitionFees = tuitionFees;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
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

    public double getTuitionFees() {
        return tuitionFees;
    }

    public void setTuitionFees(double tuitionFees) {
        this.tuitionFees = tuitionFees;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Student{");
        sb.append("student_id=").append(student_id);
        sb.append(", firstName=").append(firstName);
        sb.append(", lastName=").append(lastName);
        sb.append(", dateOfBirth=").append(dateOfBirth);
        sb.append(", tuitionFees=").append(tuitionFees);
        sb.append('}');
        return sb.toString();
    }

}
