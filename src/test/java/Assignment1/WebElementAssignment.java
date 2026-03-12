package Assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class WebElementAssignment {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://crmaccess.vtiger.com/log-in/?mode=continue");
        driver.findElement(By.name("username")).sendKeys("mahe@gmail.com");
        driver.findElement(By.name("password")).sendKeys("123459");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(3000);
        WebElement error = driver.findElement(By.id("com-form-login-error"));
        System.out.println(error.getText());
        driver.quit();
    }
}