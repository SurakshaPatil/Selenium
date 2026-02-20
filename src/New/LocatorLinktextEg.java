package New;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorLinktextEg {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

        driver.get("https://www.wikipedia.org");
        Thread.sleep(5000);
        // Find all links using tagName
        List<WebElement> links = driver.findElements(By.tagName("a"));

        System.out.println("Total links on page: " + links.size());

        // Print link text
        for (WebElement link : links) {
            System.out.println(link.getText());
        }
        driver.quit();
	}

}
