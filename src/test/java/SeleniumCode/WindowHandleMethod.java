package SeleniumCode;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WindowHandleMethod {
	// todays topic from here ---> 19/02/26

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		String parent = driver.getWindowHandle();   //   getWindowHandle() Method
		System.out.println(parent);
		driver.findElement(By.linkText("YouTube")).click();
		Thread.sleep(2000);
		Set<String> child= driver.getWindowHandles(); 	//   getWindowHandles() Method
		child.remove(parent);
		System.out.println(child);
		
		for(String id:child) {    	// ----> switchTo method 
			driver.switchTo().window(id);
			Thread.sleep(2000);
			driver.close();
		}
		Thread.sleep(2000);
		driver.quit(); 	// It close the main window also 
	}

}
