package assignments;

import java.util.Scanner;

public class EvenNumberOrNot {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println(" Enter Number : ");

			int num = sc.nextInt();

			if (num % 2 == 0) {

				System.out.println(num + " is Even Number");
			} 
			else {

				System.out.println(num + " is Odd Number");
			}
		}

	}

}
