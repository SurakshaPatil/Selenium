package New;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice?utm_source=chatgpt.com");
		driver.manage().window().maximize();
		Thread.sleep(500);
		WebElement checkbox1 = driver.findElement(By.xpath("//input[@id='bmwcheck']"));
		checkbox1.click();
		Thread.sleep(2000);
		WebElement checkbox2 = driver.findElement(By.xpath("//input[@id='benzcheck']"));
		checkbox2.click();
		Thread.sleep(2000);
		System.out.println("After Click - Is Selected: " + checkbox1.isSelected());
		System.out.println("After Click - Is Selected: " + checkbox2.isSelected());
		Thread.sleep(2000);
		driver.quit();
	}

}
