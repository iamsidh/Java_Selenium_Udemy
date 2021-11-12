package assignments.strings_assign;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        String str, reverse = "";

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String to Check Palindrome");

        str = sc.nextLine();

        sc.close();

        for (int i = str.length() - 1; i >= 0; i--) {

            reverse = reverse + str.charAt(i);

        }

        if (str.equals(reverse)) {

            System.out.println(str + "   String is Palindrome");
        } else {

            System.out.println(str + "   String is not Palindrome");
        }
    }
}
