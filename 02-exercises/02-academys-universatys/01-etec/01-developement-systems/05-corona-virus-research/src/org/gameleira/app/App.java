package org.gameleira.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.gameleira.enums.Sex;
import org.gameleira.models.Person;

public class App {
	public static Scanner scanner = new Scanner(System.in);
	public static ArrayList<Person> persons = new ArrayList<>(); 

	public static void main(String[] args) {
		requestDataOfPersons();
		double averageAge = getAverageAgePeople();
		double[] percentages = getPercentageOfMenAndWomen(persons);
		
		System.out.println("Média de idade: " + averageAge);
		System.out.println("Mulheres: " + percentages[0] + "%");
		System.out.println("Homens: " + percentages[1] + "%");
	}
	
	public static void requestDataOfPersons() {
		for (int i = 1; i <= 50; i++) {
			Person person = new Person();
			System.out.printf("Informe a idade da pessoa %d: ", i);
			person.setAge(scanner.nextInt());
			System.out.printf("%nInforme o sexo da pessoa %d: ", i);
			person.setSex(scanner.nextInt());
			persons.add(person);
		}
	}
	
	public static double getAverageAgePeople() {
		int totalAge = 0;
		double average;
		
		for (Person person : persons) {
			totalAge += person.getAge();
		}
		
		average = totalAge / persons.size();
		
		return average;
	}
	
	public static double[] getPercentageOfMenAndWomen(List<Person> persons) {
	    int quantityWoman = 0;
	    int quantityMan = 0;

	    for (Person person : persons) {
	        if (person.getSex() == Sex.MASCULINE) {
	            quantityMan++;
	        } else if (person.getSex() == Sex.FEMININE) {
	            quantityWoman++;
	        }
	    }

	    if (persons.size() == 0) {
	        return new double[]{0.0, 0.0};
	    }

	    double percentageWomen = (quantityWoman * 100.0) / persons.size();
	    double percentageMen = (quantityMan * 100.0) / persons.size();

	    return new double[]{percentageWomen, percentageMen};
	}


}
