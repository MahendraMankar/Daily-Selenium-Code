package SeleniumCode;
import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TagNameWE {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
			WebDriver driver = new EdgeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.actitime.com/");
	        Thread.sleep(2000);
//	        WebElement button = driver.findElement(By.linkText("Try actiTIME for Free"));
//	        System.out.println(button.getTagName());
//	        System.out.println(button.getCssValue("font-family"));
//	        System.out.println(button.getSize());
//	        System.out.println(button.getLocation());
	        //////////////////////////////////////
	        
	        Rectangle button = driver.findElement(By.linkText("Try actiTIME for Free")).getRect();
	        System.out.println(button.getHeight());
	        System.out.println(button.getWidth());
	        System.out.println(button.getX());
	        System.out.println(button.getY());
	}

}
