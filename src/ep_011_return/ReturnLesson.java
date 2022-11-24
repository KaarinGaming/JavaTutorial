package ep_011_return;

public class ReturnLesson {

	public ReturnLesson() {
		System.out.println("Hello, this is the constructor talking!");
		int a = getNumber();
		String b = getText();
	}

	public void noReturnHere() {
		System.out.println("I return nothing");
	}

	public String getText() {
		return "I return a text!";
	}

	public int getNumber() {
		return 5;
	}

	public int differentReturns() {
		boolean state = false;
		if (state) {
			return 5;
		} else {
			return 1;
		}
	}

	public int returnsWhenLoopFindsTheValue() {
		for (int i = 0; i < 100; i++) {
			if (i == 14) {
				return i;
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		new ReturnLesson();
	}

}
