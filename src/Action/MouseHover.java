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

		//Find 'Music'
		WebElement mainItem1 = driver.findElement(By.xpath("//a[text()='Main Item 1']"));

		//Move to 'Music'
		action.moveToElement(mainItem1).perform();
		Thread.sleep(2000);

		//Find 'Rock'
		WebElement rock = driver.findElement(By.xpath("//a[text()='Rock']"));

		//Move to 'Rock'
		action.moveToElement(rock).perform();
		Thread.sleep(2000);

		//Find 'Alternative'
		WebElement alternative = driver.findElement(By.xpath("//a[text()='Alternative']"));

		//Click 'Alternative'
		alternative.click();

		Thread.sleep(3000);
		driver.quit();
	}

}
