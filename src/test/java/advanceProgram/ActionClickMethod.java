package advanceProgram;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClickMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver = new EdgeDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     driver.get("https://www.instagram.com/");
	     WebElement link = driver.findElement(By.xpath("//span[text()='Log in with Facebook']"));
	     Actions act = new Actions(driver);
	     // without argument click()
//	     act.moveToElement(link).click().perform();
	  // with argument click(argu)
	     act.click(link).perform();
	}

}
