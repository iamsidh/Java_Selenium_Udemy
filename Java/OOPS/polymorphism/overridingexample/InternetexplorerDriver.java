package polymorphism.overridingexample;

public class InternetexplorerDriver extends Webdriver{
    public void sendKeys(){

        System.out.println("Send keys method  -- IE()");
    }

    public void getTitle(){

        System.out.println("getTitile method --IE()");
    }

    public void getText(){

        System.out.println("getText method --IE()");
    }

}
