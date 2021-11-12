package basicJava;


public class Array3D {

    public static void main(String[] args) {

        int Array[][][] = new int[2][3][4];

        for (int i = 0; i < Array.length; i++) {

            for (int j = 0; j < Array[i].length; j++) {

                for (int k = 0; k < Array[i][j].length; k++) {

                    Array[i][j][k] = (int) (Math.random() * 1000);

                    System.out.print(Array[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println();
    }

}
