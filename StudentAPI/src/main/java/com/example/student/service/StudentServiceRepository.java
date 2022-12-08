package com.example.student.service;

import java.util.List;

import com.example.student.entity.Student;

public interface StudentServiceRepository {

	Student saveStudent(Student student);

	List<Student> getStudentList();

	Student getStudentById(Long id);

	void deleteStudentById(Long id);

	Student updateStudent(Long id, Student student);

}
