package basicJava;


public class BreakAndContinue {

    public void breakandcont() {

        System.out.println("First");

        // break;

        System.out.println("Last");
    }

    public static void main(String[] args) {

        BreakAndContinue b =new BreakAndContinue();
        /*
         * b.breakandcont();
         */
        for (int i = 0; i < 10; i++)
        {

			/*if (i == 5) {
				break;*/

            if (i>=0)

                continue;               //Continue will only increament i value(i++) -- next cycle increment
            System.out.println(i);

        }
        System.out.println("Outside For Loop");


        b.continuestudy();

    }

    public void continuestudy() {

        for (int i=0;i<=10;i++) {

            if(i>=5 && i<=7)     //5,6,7 will skipp due to continue
                continue;

            System.out.println(i);
        }
    }



}

