package org.gameleira.models;

public class Dog extends Animal {
	
	public Dog() {
		super();
	}

	public Dog(String name, int age) {
		super(name, age);
	}

	@Override
	public void makeSound() {
	    System.out.println("AAAAAAAAAAAAAAAAAAAUUUUUUUUUUUUUUUUUUUUUUUUUU");
	}

	@Override
	public void eat() {
	    System.out.println("NHEQUE NHEQUE");
	}
}
