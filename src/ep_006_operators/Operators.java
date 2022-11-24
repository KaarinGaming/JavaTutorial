package ep_006_operators;

public class Operators {
	public static void main(String[] args) {
		// Java Variables

		// Most common
		int number = 554385;					// Stores who numbers between -2147483648 and 2147483647
		boolean state = false;					// is either TRUE or FALSE
		float numberWithDecimals = 4.54f;		// Stores numbers with up to 7 decimals. Needs a "f" at the end
		String text = "This is a text!";		// Stores text. Uses " " around the text to be stored

		// Less common
		byte oneByte = 4;						// Stores whole numbers between -128 and 127
		short smallNumber = 484;				// Stores whole numbers between -32768 and 32767
		long bigNumber = 488747463493L;			// Stores whole numbers from -9223372036854775808 to
												// 9223372036854775807
		double moreDecimals = 5.575748574;		// Stores numbers with up to 16 decimals
		char letter = 'a';						// Stores characters. Uses ' ' around the letters. 
		char worksToo = '\101';					// Can be assigned ASCII values. ( '\101' is "A" )

		System.out.println("HELLO world".toUpperCase());
		
		int a = 10;
		int b = 15;
		int c;

		c = 10;
		c = c + 10;
		c += 22;
		c -= 10;
		c *= 5;
		System.out.println(c);
		c /= 5;
		System.out.println(c);

		int modulus = c % 5; // Returns the remainder, not the result. Ex 10 % 4 = 2.

		a++; // Same as a += 1, same as a=a+1;
		a++; // Added 1 after used
		++a; // Added 1 before used

		// Casting floats into integers
		int newNumber = number + (int) numberWithDecimals;
		int newerNumber = number + (int) (numberWithDecimals + 1.0f + 22.5433 + 2);

		// When you go over/under the memory limit of variables.
		byte d = 22;
		d += number;
		System.out.println(d);

		// Strings can be "added" to other strings.
		String oneLine = "hello";
		String anotherLine = "world";
		String sentence = oneLine + " " + anotherLine + "!";
		System.out.println(sentence);

		// Preferred way of adding strings.
		sentence = oneLine.concat(" ").concat(anotherLine).concat("!");
		System.out.println(sentence);

	}
}
