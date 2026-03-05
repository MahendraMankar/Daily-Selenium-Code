package advanceProgram;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class RobotClassMethodProgram1 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/ ");
		Robot rob = new Robot();
		rob.keyPress(KeyEvent.VK_TAB);
		rob.keyPress(KeyEvent.VK_A);
		rob.keyPress(KeyEvent.VK_M);
		rob.keyPress(KeyEvent.VK_R);
		rob.keyPress(KeyEvent.VK_U);
		
		rob.keyPress(KeyEvent.VK_TAB);
		rob.keyPress(KeyEvent.VK_1);
		rob.keyPress(KeyEvent.VK_2);
		rob.keyPress(KeyEvent.VK_3);
		rob.keyPress(KeyEvent.VK_4);
		Thread.sleep(3000);
		driver.quit();
		
	}

}
