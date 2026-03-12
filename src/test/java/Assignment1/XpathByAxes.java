package Assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class XpathByAxes {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.irctc.co.in/nget/train-search");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//p-dialog//button[text()='OK']")).click();
        Thread.sleep(2000);
        WebElement pwdText = driver.findElement(By.xpath("//*[starts-with(text(),'Person')]"));
        System.out.println(pwdText.getText());

    }
}



















