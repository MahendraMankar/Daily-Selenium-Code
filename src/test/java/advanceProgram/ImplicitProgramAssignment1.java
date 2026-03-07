package advanceProgram;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;

public class ImplicitProgramAssignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		WebDriver driver = new EdgeDriver();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.get("https://shoppersstack.com/products_page/34");
		driver.findElement(By.id("Check Delivery")).sendKeys("123456");
		driver.findElement(By.id("Check")).click();
		System.out.println("Hii");
	}

}
