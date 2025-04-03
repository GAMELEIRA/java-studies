package org.gameleira.models;

public class Motorcycle extends Vehicle {
	
	private double cylinderCapacity;

	public Motorcycle() {
		super();
	}

	public Motorcycle(String brand, String model, long yearOfManufacture, String licensePlate, double cylinderCapacity) {
		super(brand, model, yearOfManufacture, licensePlate);
		this.cylinderCapacity = cylinderCapacity;
	}

	public double getCylinderCapacity() {
		return cylinderCapacity;
	}

	public void setCylinderCapacity(double cylinderCapacity) {
		this.cylinderCapacity = cylinderCapacity;
	}

	@Override
	public String toString() {
	    return String.format(
	        "Motorcycle { brand='%s', model='%s', year=%d, licensePlate='%s', cylinderCapacity=%.1f cc }",
	        getBrand(), getModel(), getYearOfManufacture(), getLicensePlate(), cylinderCapacity
	    );
	}
	
}
