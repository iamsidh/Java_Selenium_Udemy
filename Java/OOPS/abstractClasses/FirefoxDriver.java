package abstractClasses;

public class FirefoxDriver extends Webdriver{
    @Override
    public void sendKeys() {

        System.out.println("Send keys from Firefox");
    }

    @Override
    public void getTitle() {

    }

    @Override
    public void getText() {

    }

    public static void main(String[] args) {

        Webdriver d = new FirefoxDriver();

        d.sendKeys();
    }
}
