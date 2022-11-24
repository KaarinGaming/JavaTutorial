package ep_002_methods;

public class Methods {
	public static void main(String[] args) {
		System.out.println("Welcome to a new tutorial!");
		methodOne();
		methodTwo();
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
