package wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplecitWaitExample {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.saucedemo.com/");
		// Implicit Wait for 20 seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.quit();
	}

}
