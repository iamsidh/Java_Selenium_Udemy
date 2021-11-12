package polymorphism.overridingexample;

public class Base {


    public Webdriver getBrowser(String browserName){

        if( browserName=="firefox"){

            return new FirefoxDriver();
        }
        else if(browserName=="chrome"){

            return new ChromeDriver();
        }
        else if (browserName=="ie"){
            return new InternetexplorerDriver();
        }else {
            return new FirefoxDriver();
        }
    }
}
