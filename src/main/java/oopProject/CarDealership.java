package oopProject;

import java.util.ArrayList;
import java.util.Collection;

public class CarDealership extends ArrayList<Car> {

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

}
