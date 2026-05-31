package webelementsCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSize{

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.toolsqa.com/selenium-training?q=banner#enroll-form");
		
		WebElement element = driver.findElement(By.xpath("//input[@id='first-name']"));
		System.out.println("Size is: " + element.getSize());
		driver.close();

	}
}

