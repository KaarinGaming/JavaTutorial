package ep_015_final_abstract;

public class House extends Building {

	public House() {

		sizeSqMeter = 200;
		floors = 2;
		costInDollar = 200000;
		typeOfBuilding = "House";

	}
	
//	@Override
//	public void costAndType() {
//		System.out.println("This is not going to work.");
//	}

	public void methodInsideHouse() {
		System.out.println("Hello, inside the house!");
	}

	@Override
	public void methodTwo() {
		System.out.println("Hello!");
		
	}



}
