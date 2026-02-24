package New;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindowHandling {

	public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/browser-windows");
        System.out.println("Main Page Title: " + driver.getTitle());

        // Click on New Tab button
        driver.findElement(By.id("tabButton")).click();
        Thread.sleep(3000);
        
        // Get all window IDs
        Set<String> ids = driver.getWindowHandles();
        Iterator<String> it = ids.iterator();

        String parentId = it.next();   // Main window
        String childId = it.next();    // New tab window
        Thread.sleep(3000);
        // Switch to child window
        driver.switchTo().window(childId);
        System.out.println("Child Page Title: " + driver.getTitle());
        Thread.sleep(3000);
        // Switch back to parent window
        driver.switchTo().window(parentId);
        System.out.println("Back to Parent Title: " + driver.getTitle());

        Thread.sleep(3000);

        driver.quit(); // Close all windows
	}

}
