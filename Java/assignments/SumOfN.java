package assignments;

public class SumOfN {

    public static void main(String[] args) {
        int n = 100;
        int sum = 0;
        for (int i = 0; i <= n; i++) {

            sum = sum + i;
        }

        System.out.println("Sum : " + sum);
    }
}
