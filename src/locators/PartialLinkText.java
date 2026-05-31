package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkText {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
		 driver.get("https://www.facebook.com");
	     Thread.sleep(5000);
	     // Click Forgot Password link using partialLinkText
	     driver.findElement(By.partialLinkText("Forgotten")).click();
	     Thread.sleep(5000);
	     System.out.println("Navigated to Forgot Password page");
	     System.out.println("Page title: " + driver.getTitle());
	     driver.close();

	}

}
