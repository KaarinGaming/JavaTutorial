package ep_009_loops;

public class Loops {
	public static void main(String[] args) {

		int a = 1;

		System.out.println("The value is: " + a++);
		System.out.println("The value is: " + a++);
		System.out.println("The value is: " + a++);
		System.out.println("The value is: " + a++);
		System.out.println("The value is: " + a++);
		System.out.println("The value is: " + a++);
		System.out.println("The value is: " + a++);
		System.out.println("The value is: " + a++);

		// While loop
		while (a < 11) {
			System.out.println("The value is: " + a++);
		}

		// Do-While loop
		do {
			System.out.println("The value is: " + a++);
		} while (a < 11);

		// For loop
		for (int i = 0; i < 10; i++) {
			System.out.println("Hello! ");
		}

		// Nested For loop

		for (int i = 0; i < 10; i++) {
			System.out.println("Hello! ");
			for (int z = 0; z < 10; z++) {
				System.out.println("Hello Again! ");
			}
		}

	}
}
