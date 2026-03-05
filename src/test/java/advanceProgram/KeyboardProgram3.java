package advanceProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class KeyboardProgram3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/reg/?entry_point=login&next=");
		Thread.sleep(2000);
		WebElement date = driver.findElement(By.xpath("//div[@aria-label='Select day']"));
		date.click();
		date.sendKeys(Keys.ARROW_DOWN);
		date.sendKeys(Keys.ARROW_DOWN);
		date.sendKeys(Keys.ARROW_DOWN , Keys.ENTER);
		Thread.sleep(3000);
		driver.quit();
	}

}
