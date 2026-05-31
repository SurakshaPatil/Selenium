package UploadDownload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadFile1 {

	public static void main(String[] args) throws InterruptedException {
		String baseURL = "https://eternallybored.org/misc/wget/";
		WebDriver driver = new ChromeDriver();
		driver.get(baseURL);
		driver.findElement(By.linkText("ZIP")).click();
		Thread.sleep(3000);
		driver.close();

	}

}
