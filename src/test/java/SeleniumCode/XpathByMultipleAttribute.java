package SeleniumCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class XpathByMultipleAttribute {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get(" https://www.youtube.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("search_query")).sendKeys("arjit song");
		driver.findElement(By.xpath("//button[@aria-label='Search' and @title='Search']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='video-title' and @href='/watch?v=O5gwxm3NxFU&list=RDO5gwxm3NxFU&start_radio=1&pp=ygUKYXJqaXQgc29uZ6AHAQ%3D%3D']")).click();
		

	}

}
