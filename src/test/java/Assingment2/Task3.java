package Assingment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Set;

public class Task3 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.shoppersstack.com");
        Thread.sleep(5000); 

        driver.findElement(By.xpath("//div[contains(@class,'card')]")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//i[contains(@class,'info')]")).click();
        Thread.sleep(3000);

        String parentWindow = driver.getWindowHandle();

        Set<String> allWindows = driver.getWindowHandles();

        for (String window : allWindows) {
            driver.switchTo().window(window);
            String url = driver.getCurrentUrl();
            if (url.contains("flipkart.com")) {
                driver.close();
            }
        }

        driver.switchTo().window(parentWindow);

        Thread.sleep(2000);
        driver.quit();
    }
}
