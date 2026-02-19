package SeleniumCode;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSetSize {
	// todays topic ---> 18/02/26
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");

		driver.manage().window().setSize(new Dimension(517, 503));
		Dimension size = driver.manage().window().getSize();
		System.out.println(size);
		// todays topic till here ---> 18/02/26
		
	}

}
