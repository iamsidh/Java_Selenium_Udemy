package constructors;

public class Test extends Students {


    public void parentmethod() {

        super.parentmethod();
        System.out.println("this memthod from childclass");
    }


    public static void main(String[] args) {


        Students t = new Test();

        t.parentmethod();







    }


}



