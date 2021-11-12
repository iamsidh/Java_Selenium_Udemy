package basicJava;


public class PredefinedMethods {

    public void random() {

        int d = (int)(Math.random()*5);

        double max = Math.max(20, 36);

        System.out.println("Random Number is " + d);
        System.out.println("Max Number is " + max);

    }

    public static void main(String[] args) {

        PredefinedMethods pre = new PredefinedMethods();

        pre.random();

        new PredefinedMethods().random();
    }
}
