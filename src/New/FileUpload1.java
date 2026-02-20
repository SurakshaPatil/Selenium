package New;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload1 {

	public static void main(String[] args) throws InterruptedException {
		String baseUrl="http://demo.guru99.com/test/upload/";
		WebDriver driver=new ChromeDriver();
		driver.get(baseUrl);
		Thread.sleep(2000);
		WebElement uploadElement=driver.findElement(By.id("uploadfile_0"));
		Thread.sleep(2000);
		//enter the file path on to the file-selection input field
		uploadElement.sendKeys("C:\\chromedriver.exe");
		Thread.sleep(2000);
		//checkthe"I accept the terms of service" checkbox
		driver.findElement(By.id("terms")).click();
		Thread.sleep(2000);
		//clickthe"UploadFile"button
		driver.findElement(By.name("send")).click();
		Thread.sleep(2000);
		driver.close();
	}

}
