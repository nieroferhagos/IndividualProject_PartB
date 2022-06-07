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
public class AssignmentsPerCoursePerStudent {
    
    private int submission_id;
    private int student_id;
    private int assignment_id;
    private String firstName;
    private String lastName;
    private String courseTitle;
    private String stream;
    private String type;
    private String assignmentTitle;
    private double oralMark;
    private double writtenMark;
    private Date submissionDate;
    

    public AssignmentsPerCoursePerStudent() {
    }

    public AssignmentsPerCoursePerStudent(int student_id, int assignment_id) {
        this.student_id = student_id;
        this.assignment_id = assignment_id;
    }

    public AssignmentsPerCoursePerStudent(int submission_id, int student_id, int assignment_id) {
        this.submission_id = submission_id;
        this.student_id = student_id;
        this.assignment_id = assignment_id;
    }

    public AssignmentsPerCoursePerStudent(String firstName, String lastName, String courseTitle, String stream, String type, String assignmentTitle, double oralMark, double writtenMark, Date submissionDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.courseTitle = courseTitle;
        this.stream = stream;
        this.type = type;
        this.assignmentTitle = assignmentTitle;
        this.oralMark = oralMark;
        this.writtenMark = writtenMark;
        this.submissionDate = submissionDate;
    }

    public int getSubmission_id() {
        return submission_id;
    }

    public void setSubmission_id(int submission_id) {
        this.submission_id = submission_id;
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

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
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

    public String getAssignmentTitle() {
        return assignmentTitle;
    }

    public void setAssignmentTitle(String assignmentTitle) {
        this.assignmentTitle = assignmentTitle;
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

    public Date getSubmissionDate() {
        return submissionDate;
    }

    public void setSubmissionDate(Date submissionDate) {
        this.submissionDate = submissionDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AssignmentsPerCoursePerStudent{");
        sb.append("firstName=").append(firstName);
        sb.append(", lastName=").append(lastName);
        sb.append(", courseTitle=").append(courseTitle);
        sb.append(", stream=").append(stream);
        sb.append(", type=").append(type);
        sb.append(", assignmentTitle=").append(assignmentTitle);
        sb.append(", oralMark=").append(oralMark);
        sb.append(", writtenMark=").append(writtenMark);
        sb.append(", submissionDate=").append(submissionDate);
        sb.append('}');
        return sb.toString();
    }

    

    
    
    
}
