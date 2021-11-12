package assignments;

import org.testng.annotations.Test;

public class LargestAndSmallestNumber_Array {

    public static void main(String[] args) {


        int array[] = new int[]{33, 76, 98, 45, 76, 99, 12, 35};

        int largest = array[0];

        int smallest = array[0];


        for (int i = 0; i < array.length; i++) {

            if (array[i] > largest) {

                largest = array[i];

            } else if (array[i] < smallest) {

                smallest = array[i];

            }

        }
        System.out.println("Largest Number of array "+largest);

        System.out.println("Smallest Number of array "+smallest);
    }
}

