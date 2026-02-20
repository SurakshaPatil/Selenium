package New;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementSubmit {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/facebook.html");
		WebElement w=driver.findElement(By.className("inputtext"));
		w.sendKeys("Test");
		Thread.sleep(500);
		driver.findElement(By.id("pass")).sendKeys("12345");
		Thread.sleep(500);
		driver.findElement(By.id("u_0_b")).submit();
		Thread.sleep(500);
		driver.close();
	}

}
