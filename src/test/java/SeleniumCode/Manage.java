package SeleniumCode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Manage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub --> 14/02/26
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/"); 
		//Second line of program for maximize window
		driver.manage().window().maximize();
		
		// 	todays topic						--->    15/02/26

	}

}
