package SeleniumCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class XpathByContains {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get(" https://www.lenskart.com/");
		Thread.sleep(2000);
		WebElement text = driver.findElement(By.xpath("//h3[contains(text(),'Nearby')]"));
		System.out.println(text.getText());
	}

}
