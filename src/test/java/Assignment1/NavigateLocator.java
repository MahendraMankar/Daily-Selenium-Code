package Assignment1;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class NavigateLocator {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
        Thread.sleep(2000);

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile");
        driver.findElement(By.id("nav-search-submit-button")).click();
        Thread.sleep(2000);

        String parent = driver.getWindowHandle();

        driver.findElement(By.partialLinkText("Redmi A4 5G")).click();
        Thread.sleep(2000);

        Set<String> allWindows = driver.getWindowHandles();

        for (String id : allWindows) {
            if (!id.equals(parent)) {
                driver.switchTo().window(id);
                Thread.sleep(2000);
            }
        }
        
        driver.close();
    }
}

