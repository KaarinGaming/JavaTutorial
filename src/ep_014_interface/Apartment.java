package ep_014_interface;

class Apartment extends Building implements HeatPump {

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

	@Override
	public void startHeatPump() {
		System.out.println("Heatpump started because its raining.");
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
