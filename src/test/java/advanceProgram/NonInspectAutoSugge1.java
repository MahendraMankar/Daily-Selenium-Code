package advanceProgram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class NonInspectAutoSugge1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
		Thread.sleep(2000);

		List<WebElement> autoSuggestion = driver.findElements(By.xpath("//div[@role='row']"));
		for (WebElement alllinks : autoSuggestion) {
			System.out.println(alllinks.getText());
			if (alllinks.getText().equals("iphone 16 pro 256gb")) { 
				alllinks.click();
				break;
			}
		}
		Thread.sleep(2000);
		driver.quit();
	}

}