package ep_008_switch;

public class SwitchLesson {

	public static void main(String[] args) {

		int aNumber = 15;

		switch (aNumber) {
		case 1:
		case 2:
			System.out.println("Apple Pie");
			break;
		case 4: {
			System.out.println("Potato");
		}
			break;
		case 8:
			System.out.println("Carrots");
		case 15:
			System.out.println("BlueBerries");
		default:
			System.out.println("Something else...");

		}
	}
}
