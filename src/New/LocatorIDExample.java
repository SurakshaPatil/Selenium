package New;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorIDExample {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/ajax.html");
		driver.findElement(By.id("no")).click();
		Thread.sleep(500);
		driver.findElement(By.id("buttoncheck")).click();
		Thread.sleep(500);
		driver.close();
	}

}
