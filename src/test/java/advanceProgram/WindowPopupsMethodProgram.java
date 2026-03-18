package advanceProgram;

import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPopupsMethodProgram {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Step 1: Open Demo Web Shop
        driver.get("https://demowebshop.tricentis.com/");

        // Step 2: Click on Facebook link (footer social link)
        driver.findElement(By.xpath("//a[contains(@href,'facebook')]")).click();

        
        // Step 3: Handle multiple windows
        String parentWindow = driver.getWindowHandle();
        Set<String> allWindows = driver.getWindowHandles();

        for (String win : allWindows) {
            if (!win.equals(parentWindow)) {
                driver.switchTo().window(win); // ✅ switch to child window using handle
                break;
            }
        }

        // Step 4: Enter login details in Facebook popup
        driver.findElement(By.xpath("//input[@name='email' and @type='text']")).sendKeys("mahendramankar1245@gmail.com");
        driver.findElement(By.xpath("//input[@name='pass' and  @class='x1i10hfl xggy1nq "
        		+ "xtpw4lu x1tutvks x1s3xk63 x1s07b3s x1kdt53j x1a2a7pz xjbqb8w x1ejq31n x18oe1m7 x1sy0etr xstzfhl "
        		+ "x9f619 xzsf02u x1uxerd5 x1fcty0u x132q4wb x1a8lsjc xv54qhq xf7dkkf x9desvi xh8yej3']")).sendKeys("Mahendra@12345"); // Instade of class we can use diff locator 
        driver.findElement(By.xpath("//div[@role='none']//span[text()='Log in']")).click();


        System.out.println("Login details entered in Facebook popup");

        Thread.sleep(2000);

        // Step 5: Close child window and switch back to parent
        driver.close();
        driver.switchTo().window(parentWindow);

        System.out.println("Switched back to parent window");
        Thread.sleep(2000);
        driver.quit();
    }
}
