package Assingment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(5000);

		try {
			driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
		} catch (Exception e) {
			System.out.println("Popup not found or already closed.");
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"top-banner\"]/div[2]")).click();

		driver.findElement(By.xpath("//label[@for='departure']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[@aria-label='Sun Mar 08 2026']")).click();
		Thread.sleep(2000);

		driver.quit();
	}
}
