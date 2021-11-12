package basicJava;


public class Methods {


    // public -- access modifier
    // void -- return type

    //a method can only have one return type

    public int display() {


        return 2;
    }

    public String display2() {


        return "Siddhesh";


    }

    public void addition(int a,int b) {

        int addition = a + b;

        System.out.println("Addition is :"+addition);
    }

    public float multiplication(float a,float b) {

        float mul = a * b;

        return mul;

    }


    public static void main(String[] args) {

        Methods d = new Methods(); // created new object of class to call a method

        d.display();
        d.display2();
        d.addition(15, 20);
        System.out.println(d.multiplication(10, 5));
    }

}

