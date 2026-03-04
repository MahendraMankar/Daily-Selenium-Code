
package advanceProgram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingMultiElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		List<WebElement> link = driver.findElements(By.tagName("a"));
		System.out.println(link.size());
		for(WebElement alllinks:link) {
//			System.out.println(alllinks.getText());
			if (alllinks.getText().equals("Shopping cart")) { 
				alllinks.click();
				break;
			}
		
		}
		Thread.sleep(2000);
		driver.quit();
	}

}
