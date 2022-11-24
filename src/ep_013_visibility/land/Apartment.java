package ep_013_visibility.land;

public class Apartment extends Building {

	private int number = 5;

	public Apartment() {
		sizeSqMeter = 100;
		floors = 1;
		costInDollar = 10000;
		typeOfBuilding = "Apartment";
		helloMsg();
	}

	private void helloMsg() {
		System.out.println("Hello!");
	}

	void defaultMethod() {
		System.out.println("This method can only be called by classes in the same package!");
	}

}
