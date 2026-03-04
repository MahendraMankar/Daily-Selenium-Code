package advanceProgram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NonInspectAutoSugge {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@role='button']")).click();
		driver.findElement(By.name("q")).sendKeys("iphone");
		Thread.sleep(2000);

		List<WebElement> autoSuggestion = driver.findElements(By.xpath("//ul[contains(@class,'VCplLH')]/li"));
		for (WebElement alllinks : autoSuggestion) {
			System.out.println(alllinks.getText());
		}
		Thread.sleep(2000);
		driver.quit();
	}

}
