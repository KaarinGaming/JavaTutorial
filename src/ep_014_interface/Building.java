package ep_014_interface;

public class Building {

	public int sizeSqMeter;
	public int floors;
	public int costInDollar;
	public String typeOfBuilding;

	public void costAndType() {
		System.out.println("This building: " + typeOfBuilding + " cost: " + costInDollar);
	}

}
