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
public class Grade {
    
    private int courseUnitGrade;
    private int assignmentGrade;
    private int courseWorkGrade;
    private int practicalGrade;
    private int presentationGrade;
    private int finalExamGrade;
    private int finalMarkGrade;
    private String courseGrade;
    
    public int getCourseUnitGrade() {
        return courseUnitGrade;
    }
    public void setCourseUnitGrade(int courseUnitGrade) {
        this.courseUnitGrade = courseUnitGrade;
    }
    public int getAssignmentGrade() {
        return assignmentGrade;    
    }
    public void setAssignmentGrade(int assignmentGrade) {
        this.assignmentGrade = assignmentGrade;
    }
    public int getCourseWorkGrade() {
        return courseWorkGrade; 
    }
    
    public int getPracticalGrade() {
        return practicalGrade; 
    }
    public int getPresentationGrade() {
        return presentationGrade; 
    }
    public void setPresentationGrade(int presentation) {
        this.presentationGrade = presentationGrade;
    }
    public int getFinalExamGrade() {
        return finalExamGrade;
    }
    public void setFinalExamGrade(int finalExamGrade) {
        this.finalExamGrade = finalExamGrade;
    }
    public int getFinalMarkGrade() {
        return finalMarkGrade;
    }
    public void setFinalMarkGrade(int finalMarkGrade) {
	this.finalMarkGrade = finalMarkGrade;
    }
    public String getCourseGrade() {
		return courseGrade;
    }
    public void setCourseGrade(String courseGrade) {
		this.courseGrade = courseGrade;
    }
    
                
    
    
    
}
