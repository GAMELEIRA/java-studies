package org.gameleira.app;

import java.util.Locale;
import java.util.Scanner;

import org.gameleira.models.*;
public class App {

	public static Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
	  
	public static void main(String[] args) {
		
		String registration;
		School school = new School();
		Student student;
		
		Student student1 = new Student("Gabriel", "1", 10.00);
		Student student2 = new Student("Cibele", "2", 10.00);
		Student student3 = new Student("Cibs", "3", 7.00);
		
		school.addStudent(student1);
		school.addStudent(student2);
		school.addStudent(student3);

		System.out.println("Listagem de alunos apos a inclusao dos alunos: ");
		school.listStudents();
		
		System.out.println("Informe um registo para buscar um aluno: ");
		registration = scanner.nextLine();
		
		student = school.findStudentByRegistration(registration);
		
		System.out.println("Aluno encontrado: ");
		System.out.println(student);
		
		student.setScoreFinal(8);
		
		System.out.println("Aluno apos a alteracao do score do aluno: ");
		System.out.println(student);
		
		school.removeStudenteByRegistration(registration);
		
		System.out.println("Listagem de alunos apos a exclusao de um aluno: ");
		school.listStudents();

	}

}
