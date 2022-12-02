
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
	
	private class Window{
		
	}
}
