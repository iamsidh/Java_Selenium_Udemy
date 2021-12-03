import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class WindowHandle {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("https://demoqa.com/browser-windows");

        String parent = driver.getWindowHandle();

        // Open new window by clicking the button
        driver.findElement(By.id("windowButton")).click();

        Set<String> AllWindowHandles = driver.getWindowHandles();

        Iterator<String> itr = AllWindowHandles.iterator();

        while (itr.hasNext()){

            String childwindow= itr.next();
            if(!parent.equalsIgnoreCase(childwindow)){
                driver.switchTo().window(childwindow);

                System.out.println(driver.getCurrentUrl());

                driver.close();
            }
        }

        driver.switchTo().window(parent);

        System.out.println(driver.getTitle());





       // driver.quit();

    }
}


