package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demoqa.com/menu/");

		Actions action = new Actions(driver);

		// Find 'Main Item 1'
		WebElement mainItem1 = driver.findElement(By.xpath("//a[text()='Main Item 1']"));

		// Move to 'Main Item 1'
		action.moveToElement(mainItem1).perform();
		Thread.sleep(2000);

		// Find 'Main Item 2'
		WebElement mainItem2 = driver.findElement(By.xpath("//a[text()='Main Item 2']"));

		// Move to 'Main Item 2'
		action.moveToElement(mainItem2).perform();
		Thread.sleep(2000);

		// Find 'SUB SUB LIST'
		WebElement subList = driver.findElement(By.xpath("//a[text()='SUB SUB LIST »']"));

		// Click 'SUB SUB LIST'
		subList.click();

		Thread.sleep(3000);
		driver.quit();
	}

}
