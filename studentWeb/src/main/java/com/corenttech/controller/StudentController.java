package com.corenttech.controller;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.corenttech.model.Student;
import com.corenttech.service.StudentService;

@Controller
@Path("/students")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class StudentController {

	@Autowired
	private StudentService studentService;

	@GET
	public List<Student> getStudent() {
		return studentService.getStudents();
	}

	@POST
	public Student postStudent(Student student) {
		return studentService.insertStudent(student);
	}

	@PUT
	public Student updateStudent(Student student) {
		return studentService.updateStudent(student);
	}

	@DELETE
	public void deleteStudent(@QueryParam("id")long id) {
		studentService.deleteStudent(id);
	}

}
