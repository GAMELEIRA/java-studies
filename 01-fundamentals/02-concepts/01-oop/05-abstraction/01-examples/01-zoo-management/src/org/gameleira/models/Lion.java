package org.gameleira.models;

import org.gameleira.interfaces.Performer;

public class Lion extends Animal implements Performer {
	
	public Lion() {
		super();
	}

	public Lion(String name, int age) {
		super(name, age);
	}

	@Override
	public void makeSound() {
		System.out.println("UUUUUUUUUUUUUUUUUUUUUUUUUU");
	}
	
	@Override
	public void eat() {
		System.out.println("HUMMMMMMMMMMMMMMMMM");
	}
	
    @Override
    public void performTrick() {
        System.out.println(getName() + " está pulando por dentro de um arco em chamas!");
    }

    @Override
    public void interactWithVisitors() {
        System.out.println(getName() + " está rugindo para impressionar os visitantes!");
    }
}
