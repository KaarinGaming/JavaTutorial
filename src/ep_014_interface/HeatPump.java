package ep_014_interface;

public interface HeatPump {

	static int powerUsagePerHour = 2000;

	void startHeatPump();

	void stopHeatPump();

	void checkStatus();

	default void showCost() {
		System.out.println("It cost 100 dollar per hour!");
		parts();
	}

	static void showVersion() {
		System.out.println("This is version 1");
		greetings();
	}

	private void parts() {
		System.out.println("All parts are here!");
	}

	private static void greetings() {
		System.out.println("Hello, I am a interface!");
	}

}
