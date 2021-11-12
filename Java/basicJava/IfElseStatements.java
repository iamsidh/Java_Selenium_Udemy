package basicJava;

public class IfElseStatements {

    public static void main(String[] args) {

        int num = (int) (Math.random() * 20);

        System.out.println(num);

        if (num > 10) {

            System.out.println("Random Number is greater than 10");

        }

        else if(num<10 && num>5){

            System.out.println("Number is in between of 10 and 5");

        }

        else {
            System.out.println("Random Number is less than 10");
        }

    }

}

