package assignments;

public class LargestFromArray {

    public static void main(String[] args) {

        int[] array = {10, 54, 77, 36, 98, 33, 101, 45};

        int temp;

        // String array2 = array.toString();

        // int sort = array[0];

        for (int i = 0; i <= array.length - 1; i++) {

            for (int j = 0; j <= array.length - 2; j++) {

                if (array[j] < array[j + 1]) {

                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }


            }


        }

        for (int num : array) {

            System.out.println(array);
        }


    }


}