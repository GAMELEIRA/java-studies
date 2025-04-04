package org.gameleira.models;

//CLASSES ABSTRATAS SAO DEFINIDAS PARA DETERMINAR UMA 
//HIERARQUIA DE UMA CLASSE CONCEITUAL DEFININDO UM TIPO MAIS GENERICO DE ALGO MAIS ESPECIFICO
public abstract class Animal {
	
	private String name;
	private int age;
	
	public Animal() {}

	public Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public abstract void makeSound();
	
	public abstract void eat();

	@Override
	public String toString() {
		return "Animal [name=" + name + ", age=" + age + "]";
	}
	
}
