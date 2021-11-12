package assignments;

import org.testng.annotations.Test;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        int input;

        int result = 1;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number to Calculate factorial : ");

        input = sc.nextInt();

        sc.close();

        while (input>0){

            result = result * input ;

            input -- ;
        }
        /*do{
            result = result * input ;

            input -- ;

        }while (input>0);*/


        System.out.println("Factorial is : "+result);




    }
}
