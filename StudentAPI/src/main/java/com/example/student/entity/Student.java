package com.example.student.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;



@Entity
@Table(name = "student_table")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long studentid;
	
	private String studentfirstName;
	private String studentlastName;
	
	private String emailaddress;
	private String course;
	private String contact;
	
	
	
	public Long getStudentid() {
		return studentid;
	}
	public void setStudentid(Long studentid) {
		this.studentid = studentid;
	}
	public String getStudentfirstName() {
		return studentfirstName;
	}
	public void setStudentfirstName(String studentfirstName) {
		this.studentfirstName = studentfirstName;
	}
	
	public String getStudentlastName() {
		return studentlastName;
	}
	public void setStudentlastName(String studentlastName) {
		this.studentlastName = studentlastName;
	}
	public String getEmailaddress() {
		return emailaddress;
	}
	public void setEmailaddress(String emailaddress) {
		this.emailaddress = emailaddress;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	
	
	
	
	
	
	
	
	
	
}
