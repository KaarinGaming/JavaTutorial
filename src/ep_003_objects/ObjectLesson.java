package ep_003_objects;

public class ObjectLesson {
	public static void main(String[] args) {
		System.out.println("Welcome to a new tutorial!");
		methodOne();
		methodTwo();

		House myHouse = new House();
		House yourHouse;
		yourHouse = new House();

	}

	public static void methodOne() {
		System.out.println("This is inside method one!");
	}

	public static void methodTwo() {
		System.out.println("Another One!");
		methodThree();
	}

	public static void methodThree() {
		System.out.println("Yet antoher one!");
	}
}
