package Assignment3;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class IrctcXpathsAssign {

    public static void main(String[] args) throws InterruptedException {
      
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.irctc.co.in/nget/train-search");
        
        // 1 PoP Window Ok Button
        WebElement popWind =  driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
        popWind.click();
        System.out.println("1) PoP Window Ok Button click ");

        // 2) Login button
        WebElement loginBtn = driver.findElement(By.xpath("//a[@class='search_btn loginText ng-star-inserted']"));
        System.out.println("2) Login button: " + loginBtn.isDisplayed());

        // 3) From Station field
        WebElement fromStation = driver.findElement(By.xpath("//input[@aria-label='Enter From station. Input is Mandatory.']"));
        fromStation.sendKeys(" PUNE JN - PUNE ");
        System.out.println("3) From station field: " + fromStation.isDisplayed());
        fromStation.sendKeys(Keys.TAB);

        // 4) TO Station field
        WebElement toStation = driver.findElement(By.xpath("//input[@aria-label='Enter To station. Input is Mandatory.']"));
        toStation.sendKeys("C SHIVAJI MAH T - CSMT (MUMBAI)");
        System.out.println("4) To station field: " + toStation.isDisplayed());
        toStation.sendKeys(Keys.TAB);

        // 5) Journey Date input
        WebElement journeyDate = driver.findElement(By.xpath("//td[contains(@class,'ui-datepicker-today') or contains(@class,'current-day')]"));
        journeyDate.click();
        System.out.println("5)Date selected successfully");

        // 6) contact Link
        WebElement contact = driver.findElement(By.xpath("//a[@aria-label='Click here to open contact us popup']"));
        System.out.println("6) contact field: " + contact.isDisplayed());

        // 7) Today's date element
        WebElement todayDate = driver.findElement(By.xpath("//td[contains(@class,'ui-datepicker-today') or contains(@class,'current-day')]"));
        System.out.println("7) Today's date element: " + todayDate.isDisplayed());

        Thread.sleep(1500);

        // 8) Search button
        WebElement searchBtn = driver.findElement(By.xpath("//button[contains(text(),'Search')]"));
        System.out.println("8) Search Train button: " + searchBtn.isDisplayed());

        // 9) Alert Link Click 
        WebElement alartLink = driver.findElement(By.xpath("//a[@aria-label='Click here for Alerts']"));
        System.out.println("9) Train list container: " + alartLink.isDisplayed());
        
     // 10) checkBox Link Click 
        WebElement checkBox = driver.findElement(By.xpath("//input[@name='dateSpecific']"));
        System.out.println("10) CheckBox selected: " + checkBox.isSelected());

        Thread.sleep(1500);
        driver.quit();
    }
}
