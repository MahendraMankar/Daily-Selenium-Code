package advanceProgram;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDoubleClickMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver = new EdgeDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     driver.get("https://testpages.eviltester.com/pages/interaction/javascript-events/");
	     WebElement btn = driver.findElement(By.id("ondoubleclick"));
	     Actions act = new Actions(driver);
//	     act.moveToElement(btn).doubleClick().perform();
	     act.doubleClick(btn).perform();
	     
	}

}
