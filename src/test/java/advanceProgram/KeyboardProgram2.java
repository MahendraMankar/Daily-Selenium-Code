package advanceProgram;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class KeyboardProgram2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/ ");
		Thread.sleep(2000);
		WebElement Un = driver.findElement(By.name("email"));
		Un.sendKeys("mahendra",Keys.CONTROL+"a");
		Un.sendKeys(Keys.CONTROL+"c");
		Un.sendKeys(Keys.TAB,Keys.CONTROL+"v");
		WebElement Ps = driver.findElement(By.xpath("//div[contains(@aria-label,'Show password')]"));
		Ps.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.quit();
	}

}
