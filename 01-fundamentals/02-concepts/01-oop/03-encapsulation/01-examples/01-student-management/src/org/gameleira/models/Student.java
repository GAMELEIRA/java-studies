package org.gameleira.models;

public class Student {
	
	private String name; 
	private String registration;
	private double scoreFinal;
	
	public Student() {}
	
	public Student(String name, String registration, double scoreFinal) {
		this.setName(name);
		this.setRegistration(registration);
		this.setScoreFinal(scoreFinal);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRegistration() {
		return registration;
	}

	public void setRegistration(String registration) {
		this.registration = registration;
	}

	public double getScoreFinal() {
		return scoreFinal;
	}

	public void setScoreFinal(double scoreFinal) {
		if (scoreFinal > -1.00 && scoreFinal < 11.00) {
			this.scoreFinal = scoreFinal;	
		} else {
			this.scoreFinal = 0.0;
		}
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", registration=" + registration + ", scoreFinal=" + scoreFinal + "]";
	}
	
}
