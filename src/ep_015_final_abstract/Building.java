package ep_015_final_abstract;

public abstract class Building {

	public int sizeSqMeter;
	public int floors;
	public int costInDollar;
	public String typeOfBuilding;

	public final void costAndType() {
		System.out.println("This building: " + typeOfBuilding + " cost: " + costInDollar);
	}
	
	public abstract void methodTwo();

}