package advanceProgram;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelect1 {

	// description of this program
	// this is single select program it contains all the single select methods in one program 

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu ");
		WebElement dropdown = driver.findElement(By.id("oldSelectMenu"));
		Select sel1 = new Select(dropdown); // red
//		Thread.sleep(2000);
//		sel1.selectByIndex(1);//blue
//		Thread.sleep(2000);
//		sel1.selectByValue("3");//yellow
		Thread.sleep(2000);
		sel1.selectByVisibleText("Black");// black
//		sel1.deselectByVisibleText("Black"); //UnsupportedOperationException
		System.out.println(sel1.isMultiple()); // false
		List<WebElement> alloptions = sel1.getOptions();
		for (WebElement ele : alloptions) {
			System.out.println(ele.getText()); // print all the options
		}
		Thread.sleep(3000);
		driver.quit();

	}

}
