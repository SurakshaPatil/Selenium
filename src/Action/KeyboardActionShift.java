package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActionShift {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		Actions action = new Actions(driver);

		driver.get("https://demoqa.com/text-box");
		Thread.sleep(2000);

		WebElement nameField = driver.findElement(By.id("userName"));
		action.keyDown(nameField, Keys.SHIFT).sendKeys("suraksha").keyUp(Keys.SHIFT).perform();

		Thread.sleep(2000);
		driver.close();
	}

}
