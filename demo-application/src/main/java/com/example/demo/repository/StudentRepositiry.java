package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.Repository;

import com.example.demo.model.Student;

public interface StudentRepositiry extends JpaRepository<Student, Integer> {

	//Student save(Student student);
}

