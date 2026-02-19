package SeleniumCode;

import org.openqa.selenium.Dimension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Manage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub --> 14/02/26

		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		// Second line of program for maximize window
		driver.manage().window().maximize();

		// todays topic from here ---> 18/02/26

		// driver.manage().window().minimize(); //not much in use this line of program
		// for minimize window
		// driver.manage().window().fullscreen(); //not much in use this line of program
		// for fullscreen window

		Dimension size = driver.manage().window().getSize(); // get height and weidth of screen in pixel format
		System.out.println(size); // printing size height and weidth in pixel format in console .
		// todays topic till here ---> 18/02/26

	}

}
