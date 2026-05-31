package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpDownJsExecuter {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://motionflow.dev/demos?utm_source=chatgpt.com");

        Thread.sleep(2000);
        
		JavascriptExecutor js = (JavascriptExecutor) driver;
        // Scroll down by 500 pixels
        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(2000);

        //Scroll until specific element is visible
        WebElement element = driver.findElement(By.xpath("//h3[text()='Slide Animations']"));
        
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(4000);

        // Scroll to bottom of page
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        Thread.sleep(2000);

        // Scroll up by -1000 pixels
        js.executeScript("window.scrollBy(0,-1000)");
        Thread.sleep(2000);

        // Correct way to scroll to top
        js.executeScript("window.scrollTo(0,0)");
        Thread.sleep(2000);
        driver.quit();
	}

}
