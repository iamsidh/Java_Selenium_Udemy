package assignments.interview;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Add_0_every_5 {

    public static void main(String[] args) {

        int[] arr = {4, 6, 5, 7, 9, 5, 8, 5, 1};

        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());

        int position = 5;

        int element = 0;


        for (int i = (arr.length - 1); i >= (position - 1); i--)
        {
            arr[i + 1] = arr[i];
        }
        arr[position - 1] = element;



        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]+",");
        }
        System.out.print(arr[arr.length]);

    }

}
