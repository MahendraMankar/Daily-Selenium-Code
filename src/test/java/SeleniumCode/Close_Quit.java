package SeleniumCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Close_Quit {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Google+")).click();  	// Use to open second window 
		Thread.sleep(3000);										// To hold the execution for 3 second
		driver.close(); 											// --> close parent window
		//driver.quit(); 										// --> close both parent & child window

	}

}