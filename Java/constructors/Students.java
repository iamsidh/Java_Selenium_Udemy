package constructors;

public class Students {
/*
Constructors have same name of class name

types --
Default Constructor
Non-Parameterised
Parameterised
 */

    public Students(){

        int a = 12;

        String s = "sidh";

        System.out.println(a+"            "+s);
    }

    public void parentmethod(){

        System.out.println("This method is from superclass");

    }


    public static void main(String[] args) {

        Students s = new Students();

        s.parentmethod();



    }
}
