package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CalenderHandle {
    WebDriver driver;

    @BeforeClass
    void launchBrowser() {
        System.out.println("STEP- Open chrome browser");
        System.setProperty("webdriver.chrome.driver", "./resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println("STEP- Open URL");
        driver.get("https://www.goibibo.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    void AutocompletTest() throws InterruptedException {
        driver.findElement(By.xpath(".//*[@id='departureCalendar']")).click();
        Thread.sleep(3000);

        String monthYrvalue = driver.findElement(By.xpath("//div[@class='DayPicker-Caption']/div")).getText();

        System.out.println(monthYrvalue);

        String month = monthYrvalue.split(" ")[0].trim();
        String yr = monthYrvalue.split(" ")[1].trim();

        while (!(month.equals("June")) && yr.equals("2022")){

            driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();

            monthYrvalue = driver.findElement(By.xpath("//div[@class='DayPicker-Caption']/div")).getText();

            System.out.println(monthYrvalue);

            month = monthYrvalue.split(" ")[0].trim();
            yr = monthYrvalue.split(" ")[1].trim();
        }

        driver.findElement(By.xpath("//div[@class='DayPicker-Day']/div[text()=25]")).click();
    }
}
