package advanceProgram;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsContextClickMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver = new EdgeDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     driver.get("https://www.google.com/");
	     Actions act = new Actions(driver);
	     WebElement link = driver.findElement(By.linkText("Gmail"));
//	     act.contextClick().perform();
	     act.contextClick(link).perform();
	     
	     
	}

}
