package advanceProgram;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class KeyPressAndReleaseProgram5 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		WebElement text = driver.findElement(By.id("small-searchterms"));
		Robot rob = new Robot();
		text.click();
		rob.keyPress(KeyEvent.VK_CAPS_LOCK);
		rob.keyPress(KeyEvent.VK_M);
		rob.keyPress(KeyEvent.VK_O);
		rob.keyPress(KeyEvent.VK_B);
		rob.keyPress(KeyEvent.VK_I);
		rob.keyPress(KeyEvent.VK_L);
		rob.keyPress(KeyEvent.VK_E);
		rob.keyRelease(KeyEvent.VK_CAPS_LOCK);
		Thread.sleep(3000);
		driver.quit();
	}

}
