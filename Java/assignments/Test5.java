package assignments;

public class Test5 {


    public static void main(String[] args) {


        String[] input = "I am from INDIA Delhi is the capital of India INDIA is the second most populated country".split(" ");

        int length = input.length;

        int cnt = 0;

        for (int i = 0; i < length; i++) {

            if (input[i].equalsIgnoreCase("INDIA")) {

                cnt++;
            }
        }

        System.out.println("India Word occurrences are : " + cnt);


    }


}
