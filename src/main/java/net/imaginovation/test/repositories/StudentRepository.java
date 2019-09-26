package net.imaginovation.test.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.imaginovation.test.entities.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Serializable> {
	Student findById(int id);
}
