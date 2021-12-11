package assignments.interview;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import java.util.concurrent.TimeUnit;

public class Flipkart {

    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.manage().window().maximize();

        driver.get("https://www.flipkart.com/");



        driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();

        driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("mobiles");

        driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys(Keys.ENTER);

        List<WebElement> element = driver.findElements(By.xpath("(//div[@class='_2kHMtA'])[1]"));

        element.get(0).click();


    }
}
