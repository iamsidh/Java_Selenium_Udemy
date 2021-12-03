package assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo {

    public static void main(String[] args) {

        int[] array = {10, 25, 56, 75, 97, 45};

        Arrays.sort(array);

        String a = Arrays.toString(array);

        System.out.println(a);

        String[] aa = a.substring(1,a.length()-1).split(", ");

        for(String c:aa){

            System.out.print(c);
        }


    }


}
