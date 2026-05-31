package UploadDownload;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadFile2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		String baseURL = "https://demoqa.com";
		driver.get(baseURL);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(500);
		driver.findElement(By.xpath("//a[@href='/elements']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//a[@href='/upload-download']")).click();
		Thread.sleep(500);
		driver.findElement(By.id("downloadButton")).click();
		Thread.sleep(3000);
		driver.close();
	}

}
