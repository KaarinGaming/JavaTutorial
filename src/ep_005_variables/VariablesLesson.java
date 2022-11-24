package ep_005_variables;

public class VariablesLesson {

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
	}

}
