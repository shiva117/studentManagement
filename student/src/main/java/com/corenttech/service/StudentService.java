package com.corenttech.service;

import java.util.List;

import com.corenttech.model.Student;

public interface StudentService {

	public List<Student> getStudents();

	public Student insertStudent(Student student);
	
	public Student updateStudent(Student student);
	
	public void deleteStudent(Long id);

}
