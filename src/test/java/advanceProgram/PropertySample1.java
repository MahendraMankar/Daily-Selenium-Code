package advanceProgram;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertySample1 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("src\\test\\resources\\commondata.properties");
        Properties prop = new Properties();
        prop.load(fis);

        String URL = prop.getProperty("url");
        String UN = prop.getProperty("username");
        String PWD = prop.getProperty("password");

        System.out.println(URL);
        System.out.println(UN);
        System.out.println(PWD);

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get(URL);
        driver.findElement(By.name("email")).sendKeys(UN);
        driver.findElement(By.name("pass")).sendKeys(PWD);
    }
}
