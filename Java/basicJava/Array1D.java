package basicJava;


public class Array1D {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        /*
         * java arrays are objects in java start with []
         *
         * how to define----- int [] array = new int [10];
         *
         *
         */

        int[] array = new int[10];

        /*
         * String array2[] = new String[15];
         *
         * System.out.println(array.length);
         *
         * System.out.println(array2.length);
         */

        array[0] = 10;

        array[3] = 15;
        array[9] = 17;
        array[7] = 20;

//		System.out.println(array[0]);

        for (int index = 0; index < array.length; index++) {

            System.out.println(array[index]);
        }

        Array1D a = new Array1D();

        a.arrayStudy();
        a.arrayStudy2();
    }

    public void arrayStudy() {

        int[] array = new int[10];

        System.out.println("Printing array in Normal Position");

        for (int index = 0; index < array.length; index++) {

            array[index] = (int) (Math.random() * 1000);

            System.out.println(array[index]);

        }

        System.out.println("---Printing Array in Reverse Position---");

        for (int index = array.length - 1; index >= 0; index--) {

            System.out.println(array[index]);

        }

    }

    public void arrayStudy2() {

        int array3[] = {1, 5, 7, 83, 4, 1, 2};

        System.out.println("Length of Array 3 :" + array3.length);
        System.out.println(array3[0]);

    }

}

