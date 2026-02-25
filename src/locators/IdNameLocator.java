package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdNameLocator {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/selenium-training?q=banner#enroll-form");
		driver.findElement(By.name("firstName")).sendKeys("Suraksha");
		driver.findElement(By.name("lastName")).sendKeys("Patil");
		driver.findElement(By.xpath("//button[@class=\"btn btn-block btn-primary\"]")).click();
	}

}
