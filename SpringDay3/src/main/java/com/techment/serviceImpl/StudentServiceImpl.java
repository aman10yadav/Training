package com.techment.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techment.dao.StudentDao;
import com.techment.entity.Student;
import com.techment.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService  {

	@Autowired
	StudentDao studentDao;
	
	@Override
	public void addStudent(Student student) {
		// TODO Auto-generated method stub
		studentDao.save(student);
		
	}

	@Override
	public List<Student> viewStudent() {
		// TODO Auto-generated method stub
		return studentDao.findAll();
	}

}
