/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author dream
 */
public class AssignmentsPerCourse {
    
    private int apc_id;
    private int assignment_id;
    private int course_id;
    private String assignmentTitle;
    private String description;
    private String courseTitle;
    private String stream;
    private String type;

    public AssignmentsPerCourse() {
    }

    public AssignmentsPerCourse(int assignment_id, int course_id) {
        this.assignment_id = assignment_id;
        this.course_id = course_id;
    }

    public AssignmentsPerCourse(int apc_id, int assignment_id, int course_id) {
        this.apc_id = apc_id;
        this.assignment_id = assignment_id;
        this.course_id = course_id;
    }

    public AssignmentsPerCourse(String assignmentTitle, String description, String courseTitle, String stream, String type) {
        this.assignmentTitle = assignmentTitle;
        this.description = description;
        this.courseTitle = courseTitle;
        this.stream = stream;
        this.type = type;
    }

    public int getApc_id() {
        return apc_id;
    }

    public void setApc_id(int apc_id) {
        this.apc_id = apc_id;
    }

    public int getAssignment_id() {
        return assignment_id;
    }

    public void setAssignment_id(int assignment_id) {
        this.assignment_id = assignment_id;
    }

    public int getCourse_id() {
        return course_id;
    }

    public void setCourse_id(int course_id) {
        this.course_id = course_id;
    }

    public String getAssignmentTitle() {
        return assignmentTitle;
    }

    public void setAssignmentTitle(String assignmentTitle) {
        this.assignmentTitle = assignmentTitle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AssignmentsPerCourse{");
        sb.append("assignmentTitle=").append(assignmentTitle);
        sb.append(", description=").append(description);
        sb.append(", courseTitle=").append(courseTitle);
        sb.append(", stream=").append(stream);
        sb.append(", type=").append(type);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + this.assignment_id;
        hash = 59 * hash + this.course_id;
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
        final AssignmentsPerCourse other = (AssignmentsPerCourse) obj;
        if (this.assignment_id != other.assignment_id) {
            return false;
        }
        return this.course_id == other.course_id;
    }

    
    
    
    
}
