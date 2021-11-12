package polymorphism.overridingexample;

public class ChromeDriver extends Webdriver{

    public void sendKeys(){

        System.out.println("Send keys method  -- Chrome()");
    }

    public void getTitle(){

        System.out.println("getTitile method --Chrome()");
    }

    public void getText(){

        System.out.println("getText method --Chrome()");
    }

}
