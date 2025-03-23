package com.gameleira.model;

/**
 * CAMADA RESPONSAVEL PELA LOGICA DO NEGOCIO E PELOS MODELOS DE DADOS
 * PODE SE COMUNICAR COM BANCO DE DADOS
 * */
public class User {
	
	private String firstName;
	private String middleName;
	private String lastName;
	
	public User(String firstName, String middleName, String lastName) {
		super();
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getMiddleName() {
		return middleName;
	}
	
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@Override
	public String toString() {
		return "Usuario\nPrimeiro Nome:" + firstName + ", Segundo Nome: " + middleName + ", ultimo nome: " + lastName;
	}
	
}
