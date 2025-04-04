package org.gameleira.app;

import org.gameleira.models.Dog;
import org.gameleira.models.Lion;

public class App {

	public static void main(String[] args) {
		
		Dog dog = new Dog("Milu", 10);
		Lion lion = new Lion("Leo", 20);
		
		dog.eat();
		dog.makeSound();
		lion.eat();
		lion.makeSound();
		
		System.out.println(dog.toString());
		System.out.println(lion.toString());
		
	}

}
