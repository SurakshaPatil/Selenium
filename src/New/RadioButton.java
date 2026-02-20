package New;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice?utm_source=chatgpt.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement radioButton1 = driver.findElement(By.id("bmwradio"));
		radioButton1.click();
		Thread.sleep(2000);
		WebElement radioButton2 = driver.findElement(By.id("benzradio"));
		radioButton2.click();
		Thread.sleep(2000);
		driver.close();
	}

}
