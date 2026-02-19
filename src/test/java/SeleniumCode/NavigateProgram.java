package SeleniumCode;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class NavigateProgram {
	// todays topic ---> 18/02/26
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		driver.navigate().to(new URL("https://www.google.com/")); // --> to(URL url) method use 
		Thread.sleep(2000);
		driver.navigate().to("https://www.facebook.com/");	// --> to(String Url) method use 
		Thread.sleep(2000);
		driver.navigate().back();						//back method use
		Thread.sleep(2000);
		driver.navigate().forward();					// forward method use
		driver.navigate().refresh();					// refresh method use
		// todays topic till here ---> 18/02/26
	}

}
