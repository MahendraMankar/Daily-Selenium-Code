package advanceProgram;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClickAndHoldAndRelease {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://yonobusiness.sbi.bank.in/yonobusinesslogin");
		driver.findElement(By.xpath("//span[contains(@class,'icon-cancel')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("mahendra1234");
		WebElement eye = driver.findElement(By.xpath("//img[@loading='lazy']/parent::button"));
		Actions act = new Actions(driver);
		act.clickAndHold(eye).perform();
		Thread.sleep(2000);
		act.release().perform();
		
	}

}
