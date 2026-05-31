package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class SingleSelectionDropdownNewStyle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		WebElement dropdown= driver.findElement(By.xpath("//input[@id='react-select-2-input']"));
		dropdown.click();
		Thread.sleep(2000);
		WebElement option = driver.findElement(By.xpath("//div[text()='Group 2, option 1']"));
		option.click();
		Thread.sleep(2000);
		driver.close();
	}

}
