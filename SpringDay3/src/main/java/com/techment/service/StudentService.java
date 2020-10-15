package com.techment.service;

import java.util.List;

import com.techment.entity.Student;

public interface StudentService {

	void addStudent(Student student);
	List<Student> viewStudent();
}
