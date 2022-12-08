package com.example.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.example.student.entity.Student;
import com.example.student.service.StudentServiceRepository;

@RestController
public class StudentController {

	
	@Autowired
	private StudentServiceRepository repositoryServiceRepository;
	
	
	@PostMapping("/student")
	public Student saveStudent(@RequestBody Student student) {
		return repositoryServiceRepository.saveStudent(student);
	}
	

	@GetMapping("/student")
	public List<Student> getStudentList(){
		
		return repositoryServiceRepository.getStudentList();
	}

	
	@GetMapping("/student/{id}")
	public Student getStudentById(@PathVariable("id") Long id  ) {
		
		return repositoryServiceRepository.getStudentById(id);
	}
	
	
	@DeleteMapping("/student/{id}")
	public String deleteStudentById(@PathVariable("id") Long id  ) {
		
		repositoryServiceRepository.deleteStudentById(id);
		return "Student deleted having id "+id;
	}
	
	
	@PutMapping("/student/{id}")
	public Student updateStudent(@PathVariable("id") Long id, @RequestBody Student student) {
		
		
		return  repositoryServiceRepository.updateStudent(id,student);
	}
	
	
	
	
}
