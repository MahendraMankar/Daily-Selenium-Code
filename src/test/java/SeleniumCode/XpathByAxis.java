package SeleniumCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class XpathByAxis {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/ ");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='submit']/preceding-sibling::input")).sendKeys("mobile");

	}

}
