package com.techment.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import io.swagger.annotations.ApiModelProperty;

@Entity

@Table(name="Students")
public class Student {

	@Id
	private int studentId;
	@ApiModelProperty(required=false)
	private String studentName;
	@ApiModelProperty(required=false)
	private String dept;
	
	@OneToOne
	@JoinColumn(name = "cId",referencedColumnName = "collegeId")
	
	@ApiModelProperty(required=false)
	College college;

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

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public College getCollege() {
		return college;
	}

	public void setCollege(College college) {
		this.college = college;
	}

	public Student(int studentId, String studentName, String dept, College college) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.dept = dept;
		this.college = college;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", dept=" + dept + ", college="
				+ college + "]";
	}
	
	
}
