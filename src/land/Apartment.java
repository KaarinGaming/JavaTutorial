package land;

class Apartment extends Building {

	public Apartment() {
		sizeSqMeter = 100;
		floors = 1;
		costInDollar = 10000;
		typeOfBuilding = "Apartment";
		helloMsg();
	}

	protected void helloMsg() {
		System.out.println("Hello!");
	}

}
