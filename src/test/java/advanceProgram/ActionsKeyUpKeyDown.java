package advanceProgram;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsKeyUpKeyDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		Actions act = new Actions(driver);
		WebElement textfield = driver.findElement(By.id("small-searchterms"));
		act.click(textfield).keyDown(Keys.SHIFT).sendKeys("mobile").keyUp(Keys.SHIFT).perform();
		
	}

}
