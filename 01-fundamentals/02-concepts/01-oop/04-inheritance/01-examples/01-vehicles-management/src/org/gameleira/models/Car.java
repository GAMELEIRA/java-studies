package org.gameleira.models;

public class Car extends Vehicle {

	private short quantityDoors;
	
	public Car() {
		super();
	}

	public Car(String brand, String model, long yearOfManufacture, String licensePlate, short quantityDoors) {
		super(brand, model, yearOfManufacture, licensePlate);
		this.quantityDoors = quantityDoors;
	}

	public short getQuantityDoors() {
		return quantityDoors;
	}
	
	public void setQuantityDoors(short quantityDoors) {
		this.quantityDoors = quantityDoors;
	}

	@Override
	public String toString() {
	    return String.format(
	        "Car { brand='%s', model='%s', year=%d, licensePlate='%s', quantityDoors=%d }",
	        getBrand(), getModel(), getYearOfManufacture(), getLicensePlate(), quantityDoors
	    );
	}

}
