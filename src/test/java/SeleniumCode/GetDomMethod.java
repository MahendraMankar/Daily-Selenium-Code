package SeleniumCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class GetDomMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://demowebshop.tricentis.com/");
        Thread.sleep(2000);
        WebElement textField = driver.findElement(By.id("small-searchterms"));
        System.out.println(textField.getDomAttribute("value"));
        System.out.println(textField.getDomProperty("value"));
        textField.sendKeys("Mobile");
        System.out.println(textField.getDomAttribute("value"));
        System.out.println(textField.getDomProperty("value"));
        
	}

}
