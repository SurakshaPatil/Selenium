package New;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		String baseURL = "https://www.letskodeit.com/practice?utm_source=chatgpt.com";
		driver.get(baseURL);
		Thread.sleep(500);
		driver.manage().window().maximize();
		Thread.sleep(500);
		WebElement element=driver.findElement(By.id("carselect"));
		Select select=new Select(element);
		select.selectByIndex(1);
		Thread.sleep(500);
		select.selectByValue("bmw");
		Thread.sleep(500);
		select.selectByVisibleText("Honda");
		Thread.sleep(500);
		driver.close();
	}

}
