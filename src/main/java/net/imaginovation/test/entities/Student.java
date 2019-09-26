package net.imaginovation.test.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	String name;
	Date dob;
	Long mark1;

	public Student() {
	}

	public Student(int id, String name, Date dob, Long mark1) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.mark1 = mark1;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Long getMark1() {
		return mark1;
	}

	public void setMark1(Long mark1) {
		this.mark1 = mark1;
	}
}
