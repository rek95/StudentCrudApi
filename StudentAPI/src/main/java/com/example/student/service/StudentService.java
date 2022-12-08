package com.example.student.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.student.entity.Student;
import com.example.student.repository.StudentRepository;

@Service
public class StudentService implements StudentServiceRepository {

	
	
	@Autowired
	private StudentRepository studentRepository;
	
	
	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}
	@Override
	public List<Student> getStudentList() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}
	
	@Override
	public Student getStudentById(Long id) {
		// TODO Auto-generated method stub
		return studentRepository.findById(id).get();
	}
	
	
	@Override
	public void deleteStudentById(Long id) {
		// TODO Auto-generated method stub
		 studentRepository.deleteById(id);
	}
	
	@Override
	public Student updateStudent(Long id, Student student) {
		// TODO Auto-generated method stub
		Student getStudent=studentRepository.findById(id).get();
		
		if(Objects.nonNull(student.getStudentfirstName())) {
			getStudent.setStudentfirstName(student.getStudentfirstName());
		}

		if(Objects.nonNull(student.getStudentlastName())) {
			getStudent.setStudentlastName(student.getStudentlastName());
		}
		
		if(Objects.nonNull(student.getEmailaddress())) {
			getStudent.setEmailaddress(student.getEmailaddress());
		}
		
		
		if(Objects.nonNull(student.getCourse())) {
			getStudent.setCourse(student.getCourse());
		}
		
				
		if(Objects.nonNull(student.getContact())) {
			getStudent.setContact(student.getContact());
		}
		
		
		
		
		
		
		return studentRepository.save(getStudent);
	}
}
