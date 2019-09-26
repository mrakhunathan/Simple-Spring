package net.imaginovation.test.services;

import java.util.List;

import net.imaginovation.test.entities.Student;

public interface StudentService {
	void createStudent(Student student);

	Student getStudentById(int id);

	List<Student> getAllStudents();

}
