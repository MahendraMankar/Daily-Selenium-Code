package SeleniumCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CssSelector {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get(" https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("span[role='button']")).click();
		driver.findElement(By.name("q")).sendKeys("mobile");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		
	}

}
