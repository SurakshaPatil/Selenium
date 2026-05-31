package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class LinkText {
	
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
	 driver.get("https://demo.guru99.com/test/accessing-link.html");
     Thread.sleep(5000);
     // Click Forgot Password link using partialLinkText
     driver.findElement(By.linkText("click here")).click();
     Thread.sleep(5000);
     System.out.println("Navigated to Forgot Password page");
     System.out.println("Page title: " + driver.getTitle());
     driver.close();
	}
}
