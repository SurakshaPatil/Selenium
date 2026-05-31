package webelementsCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Submit {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/facebook.html");
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("Nita");

		Thread.sleep(2000);

		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("1234");
		Thread.sleep(2000);
		driver.findElement(By.id("loginbutton")).submit();
		Thread.sleep(5000);
		

	}

}
