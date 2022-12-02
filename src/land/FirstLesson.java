package land;

import water.Ship;

public class FirstLesson {

	public static void main(String[] args) {

		House house = new House();
		Store store = new Store();
		Apartment app = new Apartment();
		LogCabin logCabin = new LogCabin();

		house.costAndType();
		store.costAndType();
		app.costAndType();
		logCabin.costAndType();

		RowBoat rowBoat = new RowBoat();

	}

}
