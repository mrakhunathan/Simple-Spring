package net.imaginovation.test.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import net.imaginovation.test.entities.Student;
import net.imaginovation.test.services.StudentService;

@Controller
public class StudentController {
	@Autowired
	StudentService studentService;

	@ResponseBody
	@RequestMapping(value = "api/v1/student", method = RequestMethod.POST)
	public void saveStudent(@RequestBody Student student) {
		studentService.createStudent(student);
	}

	@ResponseBody
	@RequestMapping(value = "api/v1/student/{id}", method = RequestMethod.GET)
	public Student getStudent(@PathVariable("id") int id) {
		return studentService.getStudentById(id);
	}

	@ResponseBody
	@RequestMapping(value = "api/v1/students", method = RequestMethod.GET)
	public List<Student> getStudents() {
		return studentService.getAllStudents();
	}
}
