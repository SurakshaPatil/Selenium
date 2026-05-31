package webelementsCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.id("enabled-example-input"));
		System.out.println("display status: " + element.isEnabled());

		element.sendKeys("nita");
		Thread.sleep(2000);
		element.clear();
		
		driver.findElement(By.id("disabled-button")).click();
		Thread.sleep(2000);
		element.click();
		
		System.out.println("display status: " + element.isEnabled());
		driver.findElement(By.id("enabled-button")).click();
		element.sendKeys("nita");
		Thread.sleep(2000);
		System.out.println("display status: " + element.isEnabled());
		driver.close();

	}

}
