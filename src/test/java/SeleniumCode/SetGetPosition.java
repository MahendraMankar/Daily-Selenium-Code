package SeleniumCode;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SetGetPosition {
	// todays topic ---> 18/02/26
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.instagram.com/");
		// Second line of program for maximize window
		driver.manage().window().maximize(); // (-7, -7)
		// driver.manage().window().minimize(); //(10, 10)
		// driver.manage().window().fullscreen(); //(0, 0)

		// Point position=driver.manage().window().getPosition();
		// System.out.println(position);

		driver.manage().window().setPosition(new Point(200, 200));
		Point position = driver.manage().window().getPosition();
		System.out.println(position);
		// todays topic till here ---> 18/02/26
	}

}
