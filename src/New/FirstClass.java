package New;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FirstClass {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String title=driver.getTitle();
		System.out.println(title);
		String currentUrl=driver.getCurrentUrl();
		System.out.println(currentUrl);
		System.out.println("Page Source is: "+driver.getPageSource());
		
		Thread.sleep(500);
		driver.quit();

	}

}
