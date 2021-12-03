package assignments.interview;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SumPresentInArray {

    public static void main(String[] args) {

        int[] a = {1, 2, 3, 3, 4, 5};

        int n = 6;

        System.out.println(sumArray(a, n));

    }

    public static boolean sumArray(int[] array, int num) {

        Arrays.sort(array);

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {

                if (array[i] + array[j] == num) {

                    return true;
                }
            }

        }


        return false;
    }
}
