package advanceProgram;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileHandlingPopups {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.naukri.com/mnjuser/profile?id=&altresid");
        Thread.sleep(1000);

        // Login
        driver.findElement(By.id("login_Layer")).click();
        driver.findElement(By.id("usernameField")).sendKeys("mahendramankar98@gmail.com");
        driver.findElement(By.id("passwordField")).sendKeys("Mahendra@98");
        driver.findElement(By.xpath("//button[@type='submit' and text()='Login']")).click();
        Thread.sleep(1000);

        // Navigate to profile page
        driver.findElement(By.xpath("//a[@href='/mnjuser/profile']")).click();
        Thread.sleep(1000);

        // Scroll to Resume section
        WebElement resumeSection = driver.findElement(By.xpath("//h1[text()='Academic achievements']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", resumeSection);
        Thread.sleep(1000);

        // Upload CV file
        WebElement cvUpload = driver.findElement(By.xpath("//input[@type='file']"));
        Thread.sleep(1000);
        cvUpload.sendKeys("C:\\Users\\Akash\\Downloads\\MY PIC AI MY DATA\\MY DATA\\.....CV_Mahendra_Mankar_02_2026.pdf");

        System.out.println("CV uploaded successfully!");
        
        Thread.sleep(2000);
        driver.quit();
    }
}
