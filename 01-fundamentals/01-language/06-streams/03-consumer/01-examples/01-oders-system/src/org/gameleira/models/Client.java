package org.gameleira.models;

public final class Client {
	
	private String name;

	public Client(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Client [name=" + name + "]";
	}

}
