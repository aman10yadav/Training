package com.techment.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techment.dao.CollegeDao;
import com.techment.entity.College;
import com.techment.service.CollegeService;

@Service
public class CollegeServiceImpl implements CollegeService{

	@Autowired
	CollegeDao collegeDao;

	@Override
	public void addCollege(College college) {
		collegeDao.save(college);
	}

	@Override
	public List<College> viewCollege() {
		return collegeDao.findAll();
	}
}