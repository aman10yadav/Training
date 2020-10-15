package com.techment.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techment.entity.Student;

@Repository
public interface StudentDao extends JpaRepository<Student,Integer>{

}
