package ep_010_arrays;

public class Arrays {

	public static void main(String[] args) {

		int a = 5;
		int b = 66;
		int c = 9000;
		int d = 11;
		int e = -12383;
		int f = 0;
		int g = 49999;
		int h = 1;

		// Or we can do it like this

		int[] intArray = new int[8];

		intArray[0] = a;
		intArray[1] = b;
		intArray[2] = c;
		intArray[3] = d;
		intArray[4] = e;
		intArray[5] = f;
		intArray[6] = g;
		intArray[7] = h;

		// Can also do this
		int[] intArrayTwo = { 20, 305, 3, 1, -1233, 55, 3123, 556, 332, 2, 1 };

		// Get values
		int value = intArray[5];
		System.out.println("Value at index 5 is: " + value);

		// 2 Dimensional array (Arrays in an array)
		int[][] twoDArray = new int[5][4];

	}

}
