package ep_017_enum;

public class EnumLesson {

	public EnumLesson() {
		Continent c = Continent.ASIA;
		c = Continent.EUROPE;

		switch (c) {
		case AFRICA:
			System.out.println("Algeria is the biggest country");
			break;
		case ANTARCTICA:
			break;
		case ASIA:
			System.out.println("China is the biggest country");
			break;
		case AUSTRALIA:
			System.out.println("AUSTRALIA is the biggest country");
			break;
		case EUROPE:
			System.out.println("Russia is the biggest country");
			break;
		case NORTH_AMERICA:
			System.out.println("Canada is the biggest country");
			break;
		case SOUTH_AMERICA:
			System.out.println("Brazil is the biggest country");
			break;
		default:
			break;

		}

		System.out.println(Continent.AUSTRALIA.getSizeSqKm());

	}

	public static void main(String[] args) {
		new EnumLesson();

	}

}
