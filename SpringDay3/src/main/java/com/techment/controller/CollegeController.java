package com.techment.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.techment.entity.College;
import com.techment.service.CollegeService;

@RestController
public class CollegeController {

	@Autowired
	CollegeService collegeService;
	
	private Logger logger = LoggerFactory.getLogger(CollegeController.class);
	
	@PostMapping("/addcollege")
	public String addCollege(@RequestBody College college) {
		
		logger.info("Trying to add college");
		collegeService.addCollege(college);
		logger.info("College Added");
		return "College Added Successfully";
	}
	
	@GetMapping("/getcollege")
	public List<College> viewCollege() {
		return collegeService.viewCollege();
	}
	
}
