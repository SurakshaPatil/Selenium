package New;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisableIsEnabled {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice?utm_source=chatgpt.com");
		driver.manage().window().maximize();
		Thread.sleep(500);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(500);
		WebElement enable = driver.findElement(By.id("enabled-button"));
		enable.click();
		Thread.sleep(500);
		System.out.println("isEnabled status: " + driver.findElement(By.id("enabled-example-input")).isEnabled());
		Thread.sleep(500);
		driver.findElement(By.id("disabled-button")).click();
		Thread.sleep(500);
		System.out.println("isEnabled status: " + driver.findElement(By.id("enabled-example-input")).isEnabled());
		Thread.sleep(500);
		System.out.println("GetTagname method returning text : " + enable.getTagName());
		System.out.println("GetAttribute method returning text : " + enable.getAttribute("id"));
		System.out.println("GetSize method returning text : " + enable.getSize());
		System.out.println("GetCSSValue method returning text : " + enable.getCssValue("id"));
		driver.close();
	}

}
