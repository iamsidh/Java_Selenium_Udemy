package polymorphism.overridingexample;

public class Testcase extends Base {

    String browserName = "chrome";

    public static void main(String[] args) {

        Testcase tc = new Testcase();

        tc.initBrowser();


    }

    public void initBrowser() {

        Webdriver driver = getBrowser(browserName);

        driver.getText();

        driver.getTitle();

        driver.sendKeys();

    }
}
