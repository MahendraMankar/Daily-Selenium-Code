package advanceProgram;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionMoveByOffsetMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriver driver = new EdgeDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     driver.get("https://demowebshop.tricentis.com/");
	     Actions act = new Actions(driver);
	     act.moveByOffset(458,200).perform();
	     
	     Thread.sleep(2000);
	     driver.quit();
	}

}
