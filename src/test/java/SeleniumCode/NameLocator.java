package SeleniumCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class NameLocator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys("Mahendra");
		driver.findElement(By.name("pass")).sendKeys("12345");
		Thread.sleep(2000);
		driver.close();
	}

}
