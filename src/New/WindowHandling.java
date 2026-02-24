package New;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = new FirefoxDriver();
	        driver.manage().window().maximize();

	        // 1️⃣ Open URL
	        driver.get("https://demoqa.com/browser-windows");

	        // Store parent window ID
	        String parentId = driver.getWindowHandle();

	        // 2️⃣ Click all child window buttons
	        driver.findElement(By.id("tabButton")).click();
	        driver.findElement(By.id("windowButton")).click();

	        Thread.sleep(3000);

	        // 3️⃣ Get all windows
	        Set<String> allWindows = driver.getWindowHandles();

	        for (String id : allWindows) {

	            // If it is not parent → then it is child
	            if (!id.equals(parentId)) {

	                driver.switchTo().window(id);
	                Thread.sleep(3000);
	                // Print text from child window
	                String text = driver.findElement(By.id("sampleHeading")).getText();
	                System.out.println("Child Window Text: " + text);

	                driver.close(); // Close child window
	            }
	        }
	        Thread.sleep(3000);
	        // 4️⃣ Switch back to parent window
	        driver.switchTo().window(parentId);
	        Thread.sleep(3000);
	        // Print parent heading
	        String parentHeading = driver.findElement(By.xpath("//h1")).getText();
	        System.out.println("Parent Heading: " + parentHeading);
	        Thread.sleep(3000);
	        driver.quit();
	}

}
