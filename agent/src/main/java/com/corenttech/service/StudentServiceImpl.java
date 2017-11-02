package com.corenttech.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.corenttech.model.Student;
import com.corenttech.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentRepository;

	@Override
	public List<Student> getStudents() {
		List<Student> students = new ArrayList<Student>();
		studentRepository.findAll().forEach(students::add);
		return students;
	}

	@Override
	public Student insertStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public Student updateStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public void deleteStudent(Long id) {
		Optional<Student> student = studentRepository.findById(id);
		studentRepository.delete(student.get());
	}

}
