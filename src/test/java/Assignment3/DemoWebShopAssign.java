package Assignment3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class DemoWebShopAssign {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("Jewelry")).click();
        driver.findElement(By.xpath("//a[text()='Create Your Own Jewelry']/../..//input[@value='Add to cart']")).click();
        driver.findElement(By.xpath("//input[@id='add-to-cart-button-71']")).click();
        WebElement msg = driver.findElement(By.xpath("//p[@class='content']")); 
        System.out.println(msg.getText());
        
        WebElement notification = driver.findElement(By.xpath("//div[@id='bar-notification']"));
        String bgColor = notification.getCssValue("background-color");
        System.out.println("Background color: " + bgColor);
      
        Thread.sleep(1500);
        driver.quit();
        
        
	}
}
