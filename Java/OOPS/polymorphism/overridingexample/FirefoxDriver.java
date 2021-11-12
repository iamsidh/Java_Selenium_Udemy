package polymorphism.overridingexample;

public class FirefoxDriver extends Webdriver{


    public void sendKeys(){

        System.out.println("Send keys method  -- Firefox()");
    }

    public void getTitle(){

        System.out.println("getTitile method --Firefox()");
    }

    public void getText(){

        System.out.println("getText method --Firefox()");
    }

}


