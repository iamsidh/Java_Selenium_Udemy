package abstractClasses;

public abstract class Webdriver {


    public abstract void sendKeys();

    public abstract void getTitle();

    public abstract void getText();

    public void showWeb(){

        System.out.println("concrete method in abstract class");
    }

}
