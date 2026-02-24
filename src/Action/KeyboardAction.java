package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardAction {

	public static void main(String[] args) throws InterruptedException {
		// KEYBOARD ACTIONS
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		Actions action = new Actions(driver);
		
		driver.get("https://demoqa.com/text-box");
		Thread.sleep(3000);
		WebElement nameField = driver.findElement(By.id("userName"));

		// sendKeys()
		nameField.sendKeys("Suraksha");
		Thread.sleep(3000);
		// CTRL + A (Select All)
		action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		Thread.sleep(3000);
		driver.quit();
	}

}
