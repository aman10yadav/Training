package com.techment.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.techment.entity.Student;
import com.techment.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService studentService;
	

	private Logger logger = LoggerFactory.getLogger(StudentController.class);
	
	@PostMapping("/addStudent")
	public String addStudent(@RequestBody Student student) {
		
		logger.info("Trying to add student");
		studentService.addStudent(student);
		logger.info("Student Added");
		return "Student Added Successfully";
	}
	
	@GetMapping("/getStudent")
	public List<Student> viewStudent() {
		return studentService.viewStudent();
	}
	
}
