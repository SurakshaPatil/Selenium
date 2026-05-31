package New;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Gecko {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new FirefoxDriver();
		String url = "https://www.facebook.com/";
		driver.get(url);
		String title=driver.getTitle();
		System.out.println(title);
		String currentUrl=driver.getCurrentUrl();
		System.out.println(currentUrl);
		System.out.println("Page Source is: "+driver.getPageSource());
		
		Thread.sleep(500);
		driver.quit();
	}

}
