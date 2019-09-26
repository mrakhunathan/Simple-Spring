package net.imaginovation.test.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.imaginovation.test.entities.Student;
import net.imaginovation.test.repositories.StudentRepository;
import net.imaginovation.test.services.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	StudentRepository studentRepository;

	@Override
	public void createStudent(Student student) {
		studentRepository.save(student);
	}

	@Override
	public Student getStudentById(int id) {
		Student s1 = studentRepository.findById(id);
		return s1;
	}

	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}
}
