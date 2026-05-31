package webelementsCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssValue{

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.toolsqa.com/selenium-training?q=banner#enroll-form");
		
		WebElement element = driver.findElement(By.xpath("//a[text() = 'Go To Registration ']"));
		System.out.println("Css value is: " + element.getCssValue("background-color"));
		
		driver.close();

	}
}

