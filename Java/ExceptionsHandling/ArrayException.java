package ExceptionsHandling;

public class ArrayException {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try {
            int a[] = new int[3];

            a[6] = 15;

        } catch (Exception e) {
            System.out.println("error occurred");
        }

    }
}
