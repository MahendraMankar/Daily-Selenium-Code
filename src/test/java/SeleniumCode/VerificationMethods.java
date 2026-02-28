package SeleniumCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class VerificationMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// isDisplay() Method
/*
 * 		WebDriver driver = new EdgeDriver();
 * 		driver.manage().window().maximize();
        driver.get("https://demowebshop.tricentis.com/");
        Thread.sleep(2000);
        WebElement textField = driver.findElement(By.id("small-searchterms"));
        System.out.println(textField.isDisplayed());
        textField.sendKeys("mobile");
        
 */
 /*       
     // isSelected() Method
		WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://demowebshop.tricentis.com/");
        Thread.sleep(2000);
        WebElement radio = driver.findElement(By.id("pollanswers-3"));
        System.out.println(radio.isSelected());
        radio.click();
        System.out.println(radio.isSelected());
 */       
		// isSelected() Method
		WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.qaplayground.com/practice/button");
        Thread.sleep(2000);
        WebElement button = driver.findElement(By.id("button-disabled"));
        System.out.println(button.isEnabled());
        
	}

}
