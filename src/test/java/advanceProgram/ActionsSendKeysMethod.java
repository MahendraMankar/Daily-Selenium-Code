package advanceProgram;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsSendKeysMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		WebElement searchBox = driver.findElement(By.id("small-searchterms"));
		Actions act = new Actions(driver);
		act.moveToElement(searchBox).click().sendKeys("iphone").perform();
//		act.click(searchBox).sendKeys("mobile").perform();
		Thread.sleep(2000);
		driver.quit();
	}

}
