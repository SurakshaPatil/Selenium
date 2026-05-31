package UploadDownload;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		String baseURL = "https://the-internet.herokuapp.com/upload";
		driver.get(baseURL);
		
		WebElement uploadElement=driver.findElement(By.id("file-upload"));
		Thread.sleep(2000);
		//enter the file path on to the file-selection input field
		uploadElement.sendKeys("C:\\chromedriver.exe");
		Thread.sleep(2000);
		driver.findElement(By.id("file-submit")).click();
		Thread.sleep(2000);
		driver.close();
	}

}
