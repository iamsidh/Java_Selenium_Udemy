package basicJava;


public class Array2D {

    public static void main(String[] args) {

        // arrays within array
        //in this case array 1 is 5 index -- now 2 different index contains array with 3 index

        int[][] array = new int[2][3];


        array[0][0] = 2;
        array[0][1] = 5;
        array[0][2] = 7;


        array[1][0] = 12;
        array[1][1] = 25;
        array[1][2] = 57;


        /*
         * System.out.println(array[1][1]);
         *
         * System.out.println(array.length);
         *
         * System.out.println(array[0].length);
         */

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++)  // i will be index for second array .,replaced 0
            {
                System.out.print(array[i][j] + "  ");
            }

            System.out.println(); // new line will be added
        }


    }

}
