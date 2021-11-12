package abstractClasses;

public class test {

    public static void main(String[] args) {

       // Webdriver w = new Webdriver() ; Abstract class cannot be initiated

        IEDriver e = new IEDriver();

        e.showWeb(); //we can call concrete methods in abstract class by using child object


    }
}
