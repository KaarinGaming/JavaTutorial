package ep_014_interface;

public class House extends Building implements HeatPump, HouseKeeper {

	public House() {

		sizeSqMeter = 200;
		floors = 2;
		costInDollar = 200000;
		typeOfBuilding = "House";

	}

	public void methodInsideHouse() {
		System.out.println("Hello, inside the house!");
	}

	@Override
	public void startHeatPump() {
		System.out.println("Heatpump started because its snowing!");

	}

	@Override
	public void stopHeatPump() {
		System.out.println("Heatpump stoped!");

	}

	@Override
	public void checkStatus() {
		// TODO Auto-generated method stub

	}

}
