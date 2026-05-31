package webelementsCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearCommand {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/facebook.html");
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("Nita");
		Thread.sleep(2000);
		email.clear();
		Thread.sleep(2000);
		driver.close();

	}

}
