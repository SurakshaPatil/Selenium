package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpDown {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://sellglobal.ebay.in/seller-center/");

        Thread.sleep(2000);

        // Reject cookies (if present)
        try {
            driver.findElement(By.id("onetrust-reject-all-handler")).click();
        } catch (Exception e) {
            System.out.println("Cookie popup not displayed");
        }

        Actions action = new Actions(driver);

        // Scroll down using keyboard
        action.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);

        // Scroll up
        action.sendKeys(Keys.PAGE_UP).perform();
        Thread.sleep(2000);

        // Scroll to bottom using keyboard
        action.sendKeys(Keys.END).perform();
        Thread.sleep(2000);

        // Scroll to top using keyboard
        action.sendKeys(Keys.HOME).perform();
        Thread.sleep(2000);

        driver.quit();
    }
}