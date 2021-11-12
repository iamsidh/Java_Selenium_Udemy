package interfaces;

public class Child1 extends ParentClass implements Parent1, Parent2 {
   /* @Override
    public void show() {

        System.out.println("Child1 show()");

    }*/

    public static void main(String[] args) {

        // Child1 c =new Child1();

        // Parent1 c =new Child1();

        Parent2 c = new Child1();


        c.show();
    }
}
