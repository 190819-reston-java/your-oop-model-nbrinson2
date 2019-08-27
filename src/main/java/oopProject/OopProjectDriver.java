package oopProject;

import java.util.ArrayList;
import java.util.List;

public class OopProjectDriver {

	public static void main(String[] args) {
		System.out.println(new Car());
		List<Car> carList = new ArrayList<Car>();
		List<Truck> truckList = new ArrayList<Truck>();
		
		carList.add(new Car("1989", "Honda", "Civic", false));
		carList.add(new Car("1989", "Toyota", "Prius", false));
		carList.add(new Car("1989", "Ford", "Focus", false));
		carList.add(new Car("1989", "Nissan", "Versa", false));
		
		System.out.println(carList);
		
		Truck f150 = new Truck("1989", "Ford", "F150", true);
		Truck titan = new Truck("1989", "Nissan", "Titan", true);
		Truck ranger = new Truck("1989", "Ford", "Ranger", true);
				
//		
//		focus.turnRight();
//		focus.turnRight();
//		versa.turnRight();
//		civic.turnRight();
		

	}

}
