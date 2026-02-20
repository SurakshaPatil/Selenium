package New;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/ajax.html");		
		Thread.sleep(500);
		WebElement element1 =driver.findElement(By.id("no"));
		System.out.println("Before selection: "+element1.isSelected());
		element1.click();
		Thread.sleep(500);
		System.out.println("For isSelected: "+element1.isSelected());
		Thread.sleep(500);
		driver.close();
	}

}
