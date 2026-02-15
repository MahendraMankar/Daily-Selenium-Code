package SeleniumCode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

        // Chrome Browser Executed						-------> 12/02/26
        WebDriver driver = new ChromeDriver();
        
      /*
   	     Firefox Browser Not Executed

         WebDriver driver1 = new FirefoxDriver(); -->not execute because the browser is not installed in desktop.

         Edge Browser Executed
         WebDriver driver2 = new EdgeDriver();

         Internet Explorer Browser Executed
         WebDriver driver3 = new InternetExplorerDriver();
       *   
       */
         
        // Navigate to application    					-------> 13/02/26
        driver.get("https://www.instagram.com/");
        Thread.sleep(2000);						      	//---> 14/02/26 
        
        //getTitle
        String title = driver.getTitle();	 //  To get title of the web site 
        System.out.println(title);	
        
      //getCurrentURL
        String url =driver.getCurrentUrl(); 	//  To get current URL of the web site  
        System.out.println(url);
        
        //getSourceCode
        String sourcecode= driver.getPageSource(); 	//  To get Source Code of the web site  
        System.out.println(sourcecode);

	}

}
