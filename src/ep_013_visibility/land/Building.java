package ep_013_visibility.land;

public class Building {

	int sizeSqMeter;
	int floors;
	int costInDollar;
	public String typeOfBuilding;

	public void costAndType() {
		System.out.println("This building: " + typeOfBuilding + " cost: " + costInDollar);
	}

	protected void protectedMethod() {
		System.out.println("This can only be called by classes in the same package, or by it's subclasses.");
	}

}
