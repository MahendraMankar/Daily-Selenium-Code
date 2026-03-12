package advanceProgram;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionMoveToElementMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriver driver = new EdgeDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     driver.get("https://www.woodenstreet.com/");
	     WebElement sofas = driver.findElement(By.xpath("//p[text()='Sofas']"));
	     Actions act = new Actions(driver);
	     act.moveToElement(sofas).perform();
	     
	     Thread.sleep(2000);
	     driver.quit();
	}

}
