package webelementsCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GetText {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		Actions action = new Actions(driver);
		driver.manage().window().maximize();
		driver.get("https://www.toolsqa.com/selenium-training?q=banner#enroll-form");
		Thread.sleep(2000);
		action.sendKeys(Keys.HOME).perform();
		WebElement element = driver.findElement(By.xpath("//a[text() = 'Go To Registration ']"));
		System.out.println("Text is: " + element.getText());
		Thread.sleep(2000);
		driver.close();

	}

}
