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
public class CourseUnit {
    
    private String courseUnitName;
	private int courseUnitCreditUnit;
	private String courseUnitDescrip;
	private String courseUnitContent;
	private int courseUnitCode;
	private int courseUnitYear;
        
        
        public String getCourseUnitGrade() {
            return courseUnitName;
        }
        public void setCourseUnitName(String courseUnitName) {
	        this.courseUnitName = courseUnitName;
        }
        public int getCourseUnitCreditUnit() {
		return courseUnitCreditUnit;
        }
        public void setCourseUnitCreditUnit(int courseUnitCreditUnit) {
		this.courseUnitCreditUnit = courseUnitCreditUnit;
        }
        public String getCourseUnitDescrip() {
		return courseUnitDescrip;
        }
        public void setCourseUnitDescrip(String courseUnitDescrip) {
		this.courseUnitDescrip = courseUnitDescrip;
        }
        public String getCourseUnitContent() {
		return courseUnitContent;
        }
        public void setCourseUnitContent(String courseUnitContent) {
        this.courseUnitContent = courseUnitContent;
        }
        public int getCourseUnitCode() {
		return courseUnitCode;
        }
        public void setCourseUnitCode(int courseUnitCode) {
		this.courseUnitCode = courseUnitCode;
        }
        public int getCourseUnitYear() {
		return courseUnitYear;
        }
        public void setCourseUnitYear(int courseUnitYear) {
		this.courseUnitYear = courseUnitYear;
        }
                
    
}
