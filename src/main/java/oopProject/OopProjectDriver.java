package oopProject;

import java.util.ArrayList;
import java.util.List;

public class OopProjectDriver {

	public static void main(String[] args) {
		List<Car> carList = new ArrayList<Car>();
		List<Truck> truckList = new ArrayList<Truck>();
		
		carList.add(new Car("1989", "Honda", "Civic", false));
		carList.add(new Car("1989", "Toyota", "Prius", false));
		carList.add(new Car("1989", "Ford", "Focus", false));
		carList.add(new Car("1989", "Nissan", "Versa", false));
		
		System.out.println(carList);
		
		truckList.add(new Truck("1989", "Ford", "F150", true));
		truckList.add(new Truck("1989", "Nissan", "Titan", true));
		truckList.add(new Truck("1989", "Ford", "Ranger", true));
				
		System.out.println(truckList);
		carList.get(0).turnRight();
		carList.get(1).turnRight();
		carList.get(3).turnRight();
		
		System.out.println(carList.get(0).numberOfCarRightTurns);

		CarDealership dealershipStock = new CarDealership(carList);
		
		dealershipStock.washCars();
		
		
	}

}
