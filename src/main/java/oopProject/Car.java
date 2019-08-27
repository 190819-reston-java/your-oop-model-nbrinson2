package oopProject;

public class Car extends Vehicle implements Movement {

	public static int numberOfCarRightTurns = 0;
	
	public Car(String year, String make, String model, boolean autoTransmission) {
		super(year, make, model, autoTransmission);
		// TODO Auto-generated constructor stub
	}

	public Car(String year, String make, String model) {
		super(year, make, model);
		// TODO Auto-generated constructor stub
	}

	public Car(String year, String make) {
		super(year, make);
		// TODO Auto-generated constructor stub
	}

	public Car(String year) {
		super(year);
		// TODO Auto-generated constructor stub
	}

	public Car() {
		// TODO Auto-generated constructor stub
	}

	public void moveForward() {
		// TODO Auto-generated method stub

	}

	public void moveBackward() {
		// TODO Auto-generated method stub

	}

	public void idle() {
		// TODO Auto-generated method stub

	}

	public void turnRight() {
		numberOfCarRightTurns++;
		System.out.println("Number of right turns increase to " + numberOfCarRightTurns);		
	}

	public void turnLeft() {
		// TODO Auto-generated method stub

	}

}
