package oopProject;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Stack;

public class CarDealership extends ArrayList<Car> {

	public static Stack<Car> garage = new Stack<Car>();
	
	public CarDealership() {
		// TODO Auto-generated constructor stub
	}

	public CarDealership(int initialCapacity) {
		super(initialCapacity);
		// TODO Auto-generated constructor stub
	}

	public CarDealership(Collection<? extends Car> c) {
		super(c);
		// TODO Auto-generated constructor stub
	}
	
	public void washCars() {
		for (Car dirtyCar : CarDealership.this) {
			System.out.println("Washing the " + dirtyCar.getMake() + " " + dirtyCar.getModel() + ", now it is ready for waxing.");
		} 
	}
	
	public void washCars(Car...dirtyCars) {
		for (Car car : dirtyCars) {
			System.out.println("Washing the " + car.getMake() + " " + car.getModel() + ", now it is ready for waxing.");
		}
	}
	
	public void testDrive(Car carToTestDrive) {
		if ((carToTestDrive.getMake()).contentEquals("Porsche")) {
			System.out.println("Test driving the " + carToTestDrive.getYear() + " " + carToTestDrive.getMake() + " " + carToTestDrive.getModel() + ", this is supa fast!");
		} else {
			System.out.println("Test driving the " + carToTestDrive.getYear() + " " + carToTestDrive.getMake() + " " + carToTestDrive.getModel() + ", this is way too slow!");
		}
	}
	
	public void pullCarsIntoGarage() {
		for (Car car : CarDealership.this) {
			garage.add(car);
		}
		System.out.println("All cars are safely parked in the garage");
	}
	
	public void pullCarsIntoGarage(Car...carsOutsideGarage) {
		for (Car car : carsOutsideGarage) {
			garage.add(car);
		}
		System.out.println("Finished pulling in " + carsOutsideGarage.length + " cars to the garage");
	}
	
	public void pullCarsOutOfGarage() {
		for (int i = 0; i < garage.capacity(); i++) {
			garage.pop();
		}
		System.out.println("All cars have exited the garage");
	}
}
