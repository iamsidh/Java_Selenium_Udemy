package assignments;

import java.util.Scanner;

public class SwapNumbers {

    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first Number");
        try {
            int a = sc.nextInt();

            System.out.println("Enter second Number");

            int b = sc.nextInt();

            sc.close();


            a = a + b;

            b = a - b;

            a = a - b;


            System.out.println("Swapped Numbers : " + a + " " + b);
        } catch (Exception e) {
            System.out.println("error occurred");
        }

    }
}
