package Assignment1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class NavigateTotalImage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get(" https://www.actitime.com/");
		Thread.sleep(2000);
		List<WebElement> link = driver.findElements(By.tagName("img"));
		Thread.sleep(2000);
		System.out.println(link.size());
//		driver.quit();
	}

}
