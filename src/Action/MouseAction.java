package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Keys;

public class MouseAction {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		Actions action = new Actions(driver);

		// DOUBLE CLICK & RIGHT CLICK
		driver.get("https://demoqa.com/buttons");
		Thread.sleep(2000);
		WebElement doubleClickBtn = driver.findElement(By.id("doubleClickBtn"));
		WebElement rightClickBtn = driver.findElement(By.id("rightClickBtn"));

		// Double Click
		action.doubleClick(doubleClickBtn).perform();
		System.out.println("Double click successfully.");
		Thread.sleep(2000);

		// Right Click
		action.contextClick(rightClickBtn).perform();
		Thread.sleep(2000);

		// Click and Hold
		action.clickAndHold(doubleClickBtn).pause(2000).release().perform();
		Thread.sleep(3000);

		driver.quit();
	}
}
