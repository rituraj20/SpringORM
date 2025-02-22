package com.spring.orm.entities;

import jakarta.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student_datails")
public class Student {
	@Id
	@Column(name="student_Id")
	private int studentId;
	private String studentName;
	private String studentCity;
	public Student(int studentId, String studentName, String studentCity) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentCity = studentCity;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentCity() {
		return studentCity;
	}
	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}
	
}
