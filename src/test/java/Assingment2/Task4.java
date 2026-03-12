package Assingment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task4 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.shoppersstack.com/"); 
        Thread.sleep(5000);
        System.out.println("Hi");
        driver.findElement(By.id("loginBtn ")).click();
        driver.findElement(By.linkText("Create Account")).click();
        driver.findElement(By.id("First Name")).sendKeys("Mahendra");
        driver.findElement(By.id("Last Name")).sendKeys("Mankar");
        driver.findElement(By.id("Male")).click();
        driver.findElement(By.id("Phone Number")).sendKeys("8380826059");        
        driver.findElement(By.id("Email Address")).sendKeys("mahendramankar98@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("Mahendra@123");
        driver.findElement(By.id("Confirm Password")).sendKeys("Mahendra@123");
        driver.findElement(By.id("Terms and Conditions")).click();
        driver.findElement(By.id("Register")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("Email")).sendKeys("mahendramankar98@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("Mahendra@123");
        driver.findElement(By.xpath("//button/span[text()='Login']")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("logoutBtn")).click();
        Thread.sleep(3000);

        driver.quit();
    }
}

