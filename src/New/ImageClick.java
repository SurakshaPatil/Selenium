package New;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ImageClick {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.name("user-name")).sendKeys("visual_user");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("item_5_img_link")).click();
		Thread.sleep(2000);
		driver.close();
	}

}
