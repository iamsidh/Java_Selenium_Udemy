package basicJava;

import java.io.IOException;

public class ForLoops {

    public static void main(String[] args) throws IOException, InterruptedException {

        for (int i = 1; i <= 100; i++) {
            System.out.println(i);

            Thread.sleep(500);

            /*
             * for (; ;) { //if we do not give any condition then it will by default true
             *
             * System.out.println("Inside Blank For loop"); }
             */
        }

    }

}


//While-->When Number of iterations are unknown

//for - numbers of iterations are known

//Do-While --- atleast run for one time