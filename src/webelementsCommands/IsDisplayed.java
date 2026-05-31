package webelementsCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.id("displayed-text"));
		System.out.println("display status: " + element.isDisplayed());
		driver.findElement(By.id("hide-textbox")).click();
		Thread.sleep(2000);
		System.out.println("display status: " + element.isDisplayed());
		driver.findElement(By.id("show-textbox")).click();
		Thread.sleep(2000);
		System.out.println("display status: " + element.isDisplayed());
		driver.close();

	}

}
