package com.techment.service;

import java.util.List;

import com.techment.entity.College;

public interface CollegeService {

	public void addCollege(College college);
	List<College> viewCollege();
}
