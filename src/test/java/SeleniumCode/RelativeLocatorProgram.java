package SeleniumCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLocatorProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  WebDriver driver = new EdgeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://demowebshop.tricentis.com/");
	        WebElement ref = driver.findElement(By.xpath("//input[@type='submit']"));
	        driver.findElement(RelativeLocator.with(By.tagName("input")).toLeftOf(ref)).sendKeys("mobile");
	        
	}

}
