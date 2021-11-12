package assignments;

public class Calculator {

	private int add(int a, int b) {

		int addition = a + b;

		return addition;
	}

	public int mul(int a, int b) {

		int mul = a * b;

		return mul;
	}

	public int sub(int a, int b) {

		int sub = a - b;

		return sub;
	}

	public int div(int a, int b) {

		int div = a / b;

		return div;
	}

	public static void main(String[] args) {

		Calculator calc = new Calculator();

		int sum = calc.add(10, 10);
		int multiplication = calc.mul(5, 25);
		int sub = calc.sub(50, 17);
		int div = calc.div(78, 12);
		
		System.out.println("Sum is :"+sum);
		System.out.println("Multiplication is :"+multiplication);
		System.out.println("Substraction is : "+sub);
		System.out.println("Division is :"+div);

	}
}
