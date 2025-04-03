package org.gameleira.models;

public class Truck extends Vehicle {
	
	private double loadCapacity;

	public Truck() {
		super();
	}

	public Truck(String brand, String model, long yearOfManufacture, String licensePlate, double loadCapacity) {
		super(brand, model, yearOfManufacture, licensePlate);
		this.loadCapacity = loadCapacity;
	}

	public double getLoadCapacity() {
		return loadCapacity;
	}

	public void setLoadCapacity(double loadCapacity) {
		this.loadCapacity = loadCapacity;
	}

	@Override
	public String toString() {
	    return String.format(
	        "Truck { brand='%s', model='%s', year=%d, licensePlate='%s', loadCapacity=%.2f tons }",
	        getBrand(), getModel(), getYearOfManufacture(), getLicensePlate(), loadCapacity
	    );
	}

}
