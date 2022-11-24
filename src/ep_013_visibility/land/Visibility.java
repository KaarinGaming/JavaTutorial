package ep_013_visibility.land;

//import ep_013_visibility.water.Ship;

public class Visibility {

	public static void main(String[] args) {
		House house = new House();
		Store store = new Store();
		Apartment app = new Apartment();
		LogCabin logCabin = new LogCabin();

		house.costAndType();
		store.costAndType();
		app.costAndType();
		logCabin.costAndType();

		// Calling a protected method
		house.protectedMethod();

		// Calling a default method
		app.defaultMethod();

		// Ship is a default class, (not public) and can not be created here, since this
		// is a different package.

		// Ship ship = new Ship();

	}
}
