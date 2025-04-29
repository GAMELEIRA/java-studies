package org.gameleira.models;

public final class Order {
	
	private int number;
	private Client client;
	private double valueTotal;
	
	public Order() {
		super();
	}

	public Order(int number, Client client, double valueTotal) {
		super();
		this.number = number;
		this.client = client;
		this.valueTotal = valueTotal;
	}

	public int getNumber() {
		return number;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public Client getClient() {
		return client;
	}
	
	public void setClient(Client client) {
		this.client = client;
	}
	
	public double getValueTotal() {
		return valueTotal;
	}
	
	public void setValueTotal(double valueTotal) {
		this.valueTotal = valueTotal;
	}

	@Override
	public String toString() {
		return "Order [number=" + number + ", client=" + client + ", valueTotal=" + valueTotal + "]";
	}
	
}
