package org.gameleira.app;

import org.gameleira.models.Car;
import org.gameleira.models.Motorcycle;
import org.gameleira.models.Truck;

public class App {

	public static void main(String[] args) {
		
		Car car = new Car("Toyota", "Corolla", 2022L, "ABC-1234", (short) 4);
		Motorcycle motocycle = new Motorcycle("Honda", "CB 500", 2021, "XYZ-5678", 500);
		Truck truck =  new Truck("Volvo", "FH 540", 2020, "DEF-9101", 3000000);
		
		System.out.println(car.toString());
		System.out.println(motocycle.toString());
		System.out.println(truck.toString());
		
	}

}
