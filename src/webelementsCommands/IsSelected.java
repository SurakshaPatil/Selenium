package webelementsCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.id("bmwradio"));
		System.out.println("is selected status: " + element.isSelected());
        element.click();
		Thread.sleep(2000);
		System.out.println("is selected status: " + element.isSelected());
		driver.close();

	}

}
