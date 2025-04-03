package org.gameleira.models;

public class Vehicle {
	
	private String brand;
	private String model; 
	private long yearOfManufacture;
	private String licensePlate;
	
	public Vehicle () {} 
	
	public Vehicle(String brand, String model, long yearOfManufacture, String licensePlate) {
		super();
		this.brand = brand;
		this.model = model;
		this.yearOfManufacture = yearOfManufacture;
		this.licensePlate = licensePlate;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public long getYearOfManufacture() {
		return yearOfManufacture;
	}
	
	public void setYearOfManufacture(long yearOfManufacture) {
		this.yearOfManufacture = yearOfManufacture;
	}
	
	public String getLicensePlate() {
		return licensePlate;
	}
	
	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}

	@Override
	public String toString() {
		return "Vehicle [brand=" + brand + ", model=" + model + ", yearOfManufacture=" + yearOfManufacture
				+ ", licensePlate=" + licensePlate + "]";
	}
		
}
