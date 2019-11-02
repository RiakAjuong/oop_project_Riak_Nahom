/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.iuea.oop.model;

/**
 *
 * @author mac
 */
public class Course {
    
    private String courseName;
    private int courseCode;
    private String courseDescription;
    
    public String GetCourseName() {
        return courseName;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public int getCourseCode() {
        return courseCode;      
    }
    public void setCourseCode(int courseCode) {
        this.courseCode = courseCode;
    }
    public String getCourseDescription() {
	return courseDescription;
    }
    public void setCourseDecription(String courseDescription) {
        this.courseDescription = courseDescription;
    }
    
}
