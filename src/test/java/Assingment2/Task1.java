package Assingment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Task1 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://demowebshop.tricentis.com/");
        Thread.sleep(2000);
        driver.findElement(By.partialLinkText("Jewelry")).click();
        driver.findElement(By.xpath("//a[text()='Black & White Diamond Heart']/../..//input[@value='Add to cart']")).click();
        Thread.sleep(2000); 
        WebElement msg = driver.findElement(By.xpath("//div[@id='bar-notification']//p[contains(text(),'The product has been added')]"));
        System.out.println(msg.getText());
        driver.quit();
    }
}