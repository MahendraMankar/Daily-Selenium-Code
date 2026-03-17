package advanceProgram;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionPopups {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.easemytrip.com/");

		driver.findElement(By.id("dvfarecal")).click();
		String cMonth = driver.findElement(By.className("month-sec")).getText();
		
		while (!cMonth.equals("DEC 2026")) {
			driver.findElement(By.id("img2Nex")).click(); // go forward
			Thread.sleep(500);
			cMonth = driver.findElement(By.className("month-sec")).getText();
		}

		driver.findElement(By.id("frth_0_20/12/2026")).click();
		
		Thread.sleep(2000);
		driver.quit();
	}
}
