package New;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.toolsqa.com/selenium-training?q=banner#enroll-form");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement element1 = driver.findElement(By.name("firstName"));
		System.out.println("For isEnabled: "+element1.isEnabled());
		element1.sendKeys("Suraksha");
		Thread.sleep(2000);
		element1.clear();
		WebElement sendButton =driver.findElement(By.xpath("//button[@class=\"btn btn-block btn-primary\"]"));
		boolean status=sendButton.isDisplayed();
		System.out.println("For isDisplayed: "+status);
		Thread.sleep(2000);
		driver.quit();
	}
}
