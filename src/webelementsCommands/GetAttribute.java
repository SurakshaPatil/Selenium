package webelementsCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.toolsqa.com/selenium-training?q=banner#enroll-form");
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("//input[@id='first-name']"));
		System.out.println("Attribute value is: " + element.getAttribute("name"));
		driver.close();

	}
}

