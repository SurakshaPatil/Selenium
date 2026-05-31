package Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;

public class MultiSelectionDropdownNewStyle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
        // Scroll down by 500 pixels
        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(2000);
		WebElement dropdown = driver.findElement(By.xpath("//input[@id='react-select-4-input']"));
		dropdown.click();
		driver.findElement(By.xpath("//div[text() = 'Blue']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text() = 'Black']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text() = 'Red']")).click();
		Thread.sleep(1000);																	
		// Capture all options
        List<WebElement> options = driver.findElements(By.xpath("//div[@class='css-9jq23d']"));

        // Print all options
        for (WebElement option : options) {
            System.out.println(option.getText());
        }
		driver.close();
	}

}
