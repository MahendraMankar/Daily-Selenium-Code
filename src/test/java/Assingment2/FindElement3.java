package Assingment2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FindElement3 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		List<WebElement> link = driver.findElements(By.tagName("a"));
		for (WebElement alllinks : link) {
			System.out.println(alllinks.getText());
			if (alllinks.getText().contains("About Us")) {
				Thread.sleep(2000);
				alllinks.click();
				break;
			}
		}
	}
}