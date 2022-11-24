package ep_012_extends;

import ep_013_visibility.land.LogCabin;

public class ExtendLesson {

	public static void main(String[] args) {
		House house = new House();
		Store store = new Store();
		Apartment app = new Apartment();
		LogCabin logCabin = new LogCabin();
		
		System.out.println("House is: " + house.sizeSqMeter + "!");
		System.out.println("Store is: " + store.sizeSqMeter + "!");
		System.out.println("Apartment is: " + app.sizeSqMeter + "!");

		house.costAndType();
		store.costAndType();
		app.costAndType();
		logCabin.costAndType();

	}
}
