package ep_015_final_abstract;

public class FinalAndAbstract {

	private final int number = 5;

	public FinalAndAbstract() {
		System.out.println("Final value: " + number);

		House house = new House();
		house.methodTwo();
//		house.costAndType();
//		Building building = new Building();
	}

	public static void main(String[] args) {

		new FinalAndAbstract();

	}

}
