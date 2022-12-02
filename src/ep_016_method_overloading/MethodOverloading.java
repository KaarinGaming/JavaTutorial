package ep_016_method_overloading;

public class MethodOverloading {

	public MethodOverloading() {

		int c = sum(10, 30);
		int d = sum(10, 30, 50);
		float e = sum(10.55f, 5.22f);
		sum();

	}

	private void sum() {
		System.out.println("no return, I am useless!");
	}

	private int sum(int a, int b) {

		return a + b;
	}

	private float sum(float a, float b) {

		return a + b;
	}

	private int sum(int a, int b, int c) {

		return a + b + c;
	}

	public static void main(String[] args) {
		new MethodOverloading();

	}

}
