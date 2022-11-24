package ep_012_extends;

public class Building {

	int sizeSqMeter;
	int floors;
	int costInDollar;
	public String typeOfBuilding;

	public void costAndType() {
		System.out.println("This building: " + typeOfBuilding + " cost: " + costInDollar);
	}

}
