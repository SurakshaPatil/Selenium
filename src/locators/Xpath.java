package locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("APjFqb")).sendKeys("facebook");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='gNO89b'][2]")).click();
		Thread.sleep(2000);
		driver.close();	
	}

}
