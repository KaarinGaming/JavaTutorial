package ep_007_if_statements;

public class IfStatements {

	public static void main(String[] args) {
		boolean haveKey = false;
		boolean superPowers = true;
		boolean canPicklock = true;

		if (haveKey == true) {
			System.out.println("Player got key! Door opens!");
		} else if (superPowers == true) {
			System.out.println("Player opens the door with superpowers!");
		} else if (canPicklock = true) {
			System.out.println("Player opens the door with lockpick!");
		} else {
			System.out.println("Player does not have the key! Door remains closed!");
		}

		System.out.println("Hello!");

		// Nested statements. ifs inside ifs.

		if (haveKey == true) {
			System.out.println("Player got key! Door opens!");

			if (superPowers == true) {
				System.out.println("Player have superpowers!");

				if (canPicklock == true) {
					System.out.println("Player can picklock!");

				}
			}
		}

		// Same as above, but simplified checks.
		if (haveKey) {
			System.out.println("Player got key! Door opens!");

			if (superPowers) {
				System.out.println("Player have superpowers!");

				if (canPicklock) {
					System.out.println("Player can picklock!");

				}
			}
		}

		// Can also check if its false
		if (!haveKey) {
			System.out.println("Player does NOT have the key! Door is closed!");

			if (!superPowers) {
				System.out.println("Player does NOT have superpowers!");

				if (!canPicklock) {
					System.out.println("Player cannot picklock!");

				}
			}
		}
		
		
		
		// Checks with integers or other numbers
		
		/*
		 * == equals
		 * != not equals
		 * > more than
		 * < less than
		 * >= more than or equal
		 * <= less than or equal
		 */
		
		int a = 5;
		int b = 11; 
		int c = 100;
		int d = -55;
		
		if(a == b) {
			System.out.println("a is equal to b");
		}else if(a >= b) {
			System.out.println("a is more than or equal to b");
		}else if(a < b) {
			System.out.println("a is less than b");
		}else {
			System.out.println("Something is wrong...");
		}
		
		// Can check for more than one thing at a time
		
		/*
		 * || means OR
		 * && means AND
		 * 
		 */
		
		if(a == b || c > d && d > 0) {
			System.out.println("a is equal to b, OR , c bigger than d AND d is more than 0");
		}
		
		
		// Can check strings too.
		String textA = "Hello";
		String textB = "hello";
		String textC = new String("Hello");
		String textD = "hello";
		
		if(textB == textD) {
			System.out.println("Text b is the same as text d");
		}
		
		// But this is the correct way of checking strings in Java.
		
		if(textB.equals(textD)) {
			System.out.println("Text b is the same as text d. This is the correct way of testing.");
		}
		
		// This will not be true
		if(textA == textC) {
			System.out.println("Will not be true");
		}
		
		// This will be true.
		if(textA.equals(textC)){
			System.out.println("This is true!");
		}
		
	
		
		
		
		
		
		
		
		

	}

}
