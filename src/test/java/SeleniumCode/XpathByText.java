package SeleniumCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class XpathByText {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get(" https://www.lenskart.com/");
		Thread.sleep(2000);
		WebElement text = driver.findElement(By.xpath("//h3[text()='Nearby Stores & Services']"));
		System.out.println(text.getText());
	}

}


//can you please share the navigate(), getWindowHandle(),getWindowHandles(), switchTo() method notes once again with me.
// I am not getting the notes on navigat(), getWindowHandle(),getWindowHandles(), switchTo() method can you please share the notes once again. 