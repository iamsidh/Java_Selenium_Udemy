package basicJava;


// Static and Non Static method demo

public class MethodsCalling {

    public static void main(String[] args) {

        MethodsCalling m = new MethodsCalling();

        m.go(); // here we need to create first object of clas becasue method is static and we
        // do not call directly method
        // Static component can not give directly call to non static component

        go3(); // directly called because method behavior is same i.e both are static

    }

    public void go() {

        System.out.println("Inside Go Method");

        go1(); // we can call this withoout creating object because method return type is not
        // static

    }

    public void go1() {

        System.out.println("Inside Go1 Method");

        go2();

    }

    public void go2() {

        System.out.println("Inside Go2 Method");
        go3();

    }

    public static void go3() {

        System.out.println("inside go3 Static method");
    }
}
