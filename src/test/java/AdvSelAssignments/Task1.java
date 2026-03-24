package AdvSelAssignments;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Task1 {
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("http://49.249.28.218:8098/");
		driver.findElement(By.id("username")).sendKeys("rmgyantra");
		driver.findElement(By.id("inputPassword")).sendKeys("rmgy@9999");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
//Locate User Icon
		driver.findElement(By.xpath("//div[@class='user-icon']"));

//Locate Logout Button		
		driver.findElement(By.xpath("//div[text()='Logout ']"));
		
//Locate Create Campaign Button	 	
		driver.findElement(By.xpath("//span[text()='Create Campaign']"));

//Locate Go to last page Button	 			
		driver.findElement(By.xpath("//a[text()='»']"));

//Locate Search by Campaign Name in search bar		
		driver.findElement(By.xpath("//option[@value='campaignName']"));
		
//Locate Create User Button		
		driver.findElement(By.xpath("//button[@type='submit']"));
		
//Locate Delete Button		
		driver.findElement(By.xpath("//td[text()='CAM12055']/ancestor::tr//i[@title='Delete']"));
		
//Locate Edit Button		
		driver.findElement(By.xpath("//td[text()='CAM12055']/ancestor::tr//i[@title='Edit']"));
		
//Locate View Users Button	
		driver.findElement(By.xpath("//div[@class='dropdown-item' and text()='View Users']"));
		
//Locate Time Range	on Dashboard
		driver.findElement(By.xpath("//option[@value='1Y']"));
		
	}
}
