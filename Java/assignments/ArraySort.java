package assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.IntStream;

public class ArraySort
{
    public static void main(String[] args)
    {
        int temp;
        int[] arrNumbers = {14, 8, 5, 54, 41, 10, 1, 500};

        List  array = Arrays.asList(arrNumbers);

        array.listIterator();

        for(Object a : array){

            System.out.println(array);

        }



        for(int a = 0; a <= arrNumbers.length - 1; a++)
        {
            for(int b = 0; b <= arrNumbers.length - 2; b++)
            {
                if(arrNumbers[b] < arrNumbers[b + 1])
                {
                    temp = arrNumbers[b];
                    arrNumbers[b] = arrNumbers[b + 1];
                    arrNumbers[b + 1] = temp;
                }
            }
        }
        System.out.println("Long Number: ");
        Arrays.sort(arrNumbers);

        for(int num : arrNumbers)
        {
            System.out.print(num);


        }
    }
}