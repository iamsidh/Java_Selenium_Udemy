package assignments;

import java.util.Scanner;

public class MaxOf3Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, b, c;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first Number : ");

		a = sc.nextInt();

		System.out.println("Enter Second Number : ");

		b = sc.nextInt();

		System.out.println("Enter 3rd Number : ");

		c = sc.nextInt();

		if (a > b && a > c) {

			System.out.println("First Number is Max" + a);

		} else if (b > a && b > c) {

			System.out.println("Second Number is Max " + b);

		}

		else {
			System.out.println("Third Number is Max " + c);
		}
	}

}
