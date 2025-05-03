package org.gameleira.app;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class App {

	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		String name;
		int age;
		int dateActually = LocalDate.now().getYear();
		int yearChrismas;
		
		System.out.println("Informe o seu nome:");
		name = scanner.nextLine();
		
		System.out.println("Informe o ano que nasceu:");
		yearChrismas = scanner.nextInt();
		
		age = dateActually - yearChrismas; 
		
		System.out.printf("Olá %s você tem %d anos %n", name, age);
	}

}
