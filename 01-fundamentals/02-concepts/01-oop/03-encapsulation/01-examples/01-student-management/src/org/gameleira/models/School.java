package org.gameleira.models;

import java.util.ArrayList;

public class School {
	
	ArrayList<Student> students;
	
	public School() {
		this.students = new ArrayList<Student>();
	}
	
	public void listStudents() {
		for (Student student: this.students) {
			System.out.println(student);
		}
	}
	
	public void addStudent(Student student) {
		this.students.add(student);
	}
	
	public Student findStudentByRegistration(String registration) {
		for (Student student: this.students) {
			if (student.getRegistration().equals(registration)) {
				return student;
			}
		} 
		return null;
	}
	
	public void removeStudenteByRegistration(String registration) {
	    this.students.removeIf(student -> student.getRegistration().equals(registration));
	}
}
