package assignments.strings_assign;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {

        System.out.println("Enter String : ");

        Scanner sc = new Scanner(System.in);

        String S = sc.nextLine();

        sc.close();


        for (int i = S.length()-1; i >= 0; --i) {

            System.out.print(S.charAt(i));

        }

    }
}
