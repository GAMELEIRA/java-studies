package org.gameleira.models;

import org.gameleira.enums.Sex;

public class Person {
	private int age;
	private Sex sex;
	 
	public Person() {
		super();
	}

	public Person(int age, Sex sex) {
		super();
		this.age = age;
		this.sex = sex;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public Sex getSex() {
		return sex;
	}
	
	public void setSex(int sex) {
	    try {
	        Sex validSex = Sex.fromCode(sex);
	        this.sex = validSex;
	    } catch (IllegalArgumentException e) {
	        throw new RuntimeException("Invalid sex value: " + sex);
	    }
	}

}
