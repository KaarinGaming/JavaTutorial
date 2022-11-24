package ep_004_the_constructor;

public class Constructor {
	public static void main(String[] args) {

		System.out.println("Welcome to a new tutorial!");

		House myHouse = new House("Red");
		myHouse.methodInsideHouse();

		House yourHouse;
		yourHouse = new House("Blue");
		yourHouse.methodInsideHouse();

		// This is this class.
		Constructor constructor = new Constructor();
		constructor.methodOne();
		
		// Calling a static method from a static method. 
		// Cannot call a non static method from a static method.
		methodTwo();

	}

	public void methodOne() {
		System.out.println("Code in a non-static method");
	}

	public static void methodTwo() {
		System.out.println("Code in a static method");
	}

}
