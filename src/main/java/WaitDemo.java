import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class WaitDemo {

    public static void main(String[] args) throws IOException {


        WebDriver driver = new ChromeDriver();

       // driver.manage().window().maximize();

        Dimension dimension = new Dimension(1500,1200);

        driver.manage().window().setSize(dimension);

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("https://www.google.com/");

        //WebDriverWait wait = new WebDriverWait(driver,5);

        //wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.name("btnK")));

        String titile=  driver.getTitle();

        System.out.println(titile);

        File src = ((org.openqa.selenium.TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        FileUtils.copyFile(src,new File("C:\\abc.png"));

        driver.quit();

        //driver.close();


    }
}
