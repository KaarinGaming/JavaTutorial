package ep_014_interface;

public class InterfaceLesson {

	public static void main(String[] args) {

		House house = new House();
		Apartment app = new Apartment();

		house.startHeatPump();
		house.stopHeatPump();

		house.showCost();

		int a = HeatPump.powerUsagePerHour;
		HeatPump.showVersion();

		app.startHeatPump();
		app.stopHeatPump();

	}

}
