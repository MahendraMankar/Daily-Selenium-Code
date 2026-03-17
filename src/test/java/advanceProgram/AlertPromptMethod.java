package advanceProgram;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPromptMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoqa.com/alerts");
		driver.findElement(By.id("promtButton")).click();
		Alert a = driver.switchTo().alert();
		a.sendKeys("Mahendra");
		Thread.sleep(1000);
		a.accept();
		WebElement result = driver.findElement(By.id("promptResult"));
		System.out.println(result.getText());
		System.out.println(a.getText());
		Thread.sleep(1500);
		driver.quit();
		
	}

}
