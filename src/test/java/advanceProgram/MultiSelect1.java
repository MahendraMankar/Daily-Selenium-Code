package advanceProgram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu ");
		Thread.sleep(1000);
		WebElement listbox = driver.findElement(By.id("cars"));
		Select sel = new Select(listbox);
		sel.selectByIndex(0);// select one
		sel.selectByValue("saab");// select one
		sel.selectByVisibleText("Opel");// select one
		Thread.sleep(1000);
		sel.deselectByIndex(0);// deselect one
		Thread.sleep(1000);
		sel.deselectByValue("saab");// deselect one
		Thread.sleep(1000);
		sel.deselectByVisibleText("Opel");// deselect one
		sel.selectByIndex(0);
		sel.selectByValue("saab");
		sel.selectByVisibleText("Opel");
		Thread.sleep(1000);
//		sel.deselectAll();	// deselecting all 
//		System.out.println(sel.getFirstSelectedOption().getText());// getting first option
//		List<WebElement> selectedoptions = sel.getAllSelectedOptions();
//		for (WebElement ele : selectedoptions) {
//			System.out.println(ele.getText()); // print all the selected options
//		}
		System.out.println(sel.isMultiple());//true // to check it is multiple selector or not
		
		List<WebElement> alloptions = sel.getOptions();
		for (WebElement ele : alloptions) {
			System.out.println(ele.getText()); // print all the options
		}
		Thread.sleep(1000);
		driver.quit();
	}

}
