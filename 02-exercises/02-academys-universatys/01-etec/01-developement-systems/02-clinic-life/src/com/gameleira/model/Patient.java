package com.gameleira.model;

public class Patient {
	
	private String name;
	
	public Patient() {}
	
	public Patient(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Name: " + this.name;
	}
}
