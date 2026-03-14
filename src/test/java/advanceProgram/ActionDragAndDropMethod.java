package advanceProgram;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDragAndDropMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.selenium.dev/selenium/web/mouse_interaction.html");
		WebElement src = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		Actions act = new Actions(driver);
//		act.dragAndDrop(src, target).perform();
		act.dragAndDropBy(src, 20, 100).perform();
	}

}
