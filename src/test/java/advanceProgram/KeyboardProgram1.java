package advanceProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class KeyboardProgram1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/ ");
		Thread.sleep(2000);
		WebElement Un = driver.findElement(By.id("user-name"));
		Un.sendKeys("standard_user",Keys.TAB,"secret_sauce");
		Thread.sleep(2000);
		Un.sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		driver.quit();

	}
}
