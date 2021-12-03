package assignments;

public class PalindromNumber {

    public static void main(String[] args) {

        int r; //for reminder

        int sum = 0;  // for checking number with actual number

        int temp;   // for storing actual number

        int n = 454;  //Number to be checked

        temp = n;  // number assigned to temp variable

        while (n > 0) {

            r = n % 10; //reminder of number

            sum = (sum * 10) + r;

            n = n / 10;

        }

        if (temp == sum) {
            System.out.println("Number is Palindrome");

        } else {

            System.out.println("Number is not palindrome");
        }


    }

}
