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
public class AssignmentSubmission {
    
    private int id;
    private int student_id;
    private int assignment_id;
    private double oralMark;
    private double writtenMark;
    private Date submission;

    public AssignmentSubmission() {
    }

    public AssignmentSubmission(int id, int student_id, int assignment_id, double oralMark, double writtenMark, Date submission) {
        this.id = id;
        this.student_id = student_id;
        this.assignment_id = assignment_id;
        this.oralMark = oralMark;
        this.writtenMark = writtenMark;
        this.submission = submission;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public int getAssignment_id() {
        return assignment_id;
    }

    public void setAssignment_id(int assignment_id) {
        this.assignment_id = assignment_id;
    }

    public double getOralMark() {
        return oralMark;
    }

    public void setOralMark(double oralMark) {
        this.oralMark = oralMark;
    }

    public double getWrittenMark() {
        return writtenMark;
    }

    public void setWrittenMark(double writtenMark) {
        this.writtenMark = writtenMark;
    }

    public Date getSubmission() {
        return submission;
    }

    public void setSubmission(Date submission) {
        this.submission = submission;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AssignmentSubmission{");
        sb.append("id=").append(id);
        sb.append(", oralMark=").append(oralMark);
        sb.append(", writtenMark=").append(writtenMark);
        sb.append(", submission=").append(submission);
        sb.append('}');
        return sb.toString();
    }
    
    
}
