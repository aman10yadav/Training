package com.techment.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import io.swagger.annotations.ApiModelProperty;

@Entity
public class College {

	@Id
	private int collegeId;
	@ApiModelProperty(required=false)
	private String collegeName;
	
	@ApiModelProperty(required=false)
	private String address;
	
	@ApiModelProperty(required=false)
	private String course;
	
	public int getCollegeId() {
		return collegeId;
	}
	public void setCollegeId(int collegeId) {
		this.collegeId = collegeId;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public College(int collegeId, String collegeName, String address, String course) {
		super();
		this.collegeId = collegeId;
		this.collegeName = collegeName;
		this.address = address;
		this.course = course;
	}
	public College() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "College [collegeId=" + collegeId + ", collegeName=" + collegeName + ", address=" + address + ", course="
				+ course + "]";
	} 
	
}
