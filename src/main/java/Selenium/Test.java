package Selenium;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub
        int temp=0;
        // Initialize array
        // remove space from string
        int[] str = { 1, 57, 2, 3, 4, 5 };
        // int[] str = {14, 8, 5, 54, 41, 10, 1, 500};



        StringBuilder stringBuffer = new StringBuilder();
        for (char i = 0; i < str.length; i++) {
            if ((str[i] != ' ') && (str[i] != '\t')) {
                stringBuffer.append(str[i]);
            }
        }
        // Print the string after the removal of white space
        String noSpaceStr2 = stringBuffer.toString();
        System.out.println("Removing all the white space from the string is: " + noSpaceStr2);

        char[] new2 = noSpaceStr2.toCharArray();

        System.out.println(new2);





        int a = 0;
        int b = a+1;
        // Sort the array in descending order
        for ( a = 0; a < noSpaceStr2.length(); a++) {
            for ( b = a + 1; a < noSpaceStr2.length()-1; a++) {
                if (str[a] < str[b]) {
                    temp = str[a];
                    str[a] = str[b];
                    str[b] = temp;
                }

                System.out.print(str[a]);

            }
            System.out.println();
        }



        // Displaying elements of array after sorting
        System.out.println("Elements of array sorted in descending order: ");
        for (int i = 0; i < noSpaceStr2.length()-1; i++) {

            for(int j = i+1 ; j < noSpaceStr2.length()-2;j++){

                if (noSpaceStr2.charAt(i)>noSpaceStr2.charAt(j)){




                }
            }

            System.out.print(str[i]);
        }

    }
}