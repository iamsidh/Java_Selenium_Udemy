package assignments;

public class ArrayShift {

    public static void main(String[] args) {

        int[] array = {10, 20, 30, 40, 50};

        int shiftPosition = 2;

        System.out.println("Original Array : ");

        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i] + ",");
        }
        for (int i = 0; i < shiftPosition; i++) {

            int last;
            last = array[array.length - 1];

            for (int j = array.length - 1; j > 0; j--) {

                array[j] = array[j - 1];

            }
            array[0] = last;
        }
        System.out.println();

        System.out.println("Array Shifting: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
