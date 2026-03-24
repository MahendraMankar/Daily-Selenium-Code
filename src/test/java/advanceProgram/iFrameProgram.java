package advanceProgram;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrameProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.selenium.dev/selenium/web/iframes.html");
		driver.switchTo().frame(0);
//		driver.switchTo().frame("iframe1");
//		WebElement frame = driver.findElement(By.id("iframe1"));
//		driver.switchTo().frame(frame);
//		driver.findElement(By.id("imageButton")).click();
//		
	}

}
