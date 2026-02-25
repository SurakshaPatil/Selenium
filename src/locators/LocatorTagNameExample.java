package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorTagNameExample {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/facebook.html");
		driver.findElement(By.tagName("input")).sendKeys("Test");
		driver.findElement(By.tagName(null));
	}

}
