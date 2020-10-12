package com.techment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.techment.dao.StudentDao;
import com.techment.entity.Student;

@SpringBootApplication
public class Application implements CommandLineRunner {

@Autowired
StudentDao studentDao;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.print("===Project Started====");
		
		Student student = new Student(2,"Aman","hr",22);
		studentDao.save(student);
		System.out.print("Record Inserted");

	}
}
