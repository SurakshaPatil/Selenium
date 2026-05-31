package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		String baseURL = "https://www.letskodeit.com/practice?utm_source=chatgpt.com";
		driver.get(baseURL);
		Thread.sleep(500);
		driver.manage().window().maximize();
		Thread.sleep(500);
		WebElement dropdownbox=driver.findElement(By.id("multiple-select-example"));
		Select select=new Select(dropdownbox);
		select.selectByValue("apple");
		select.selectByIndex(1);
		select.selectByVisibleText("Peach");
		Thread.sleep(500);
		select.deselectByIndex(1);
		driver.close();
	}

}
