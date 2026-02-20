package New;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotExample {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");

		// Typecasting driver to TakesScreenshot
		TakesScreenshot ts = (TakesScreenshot) driver;

		// Capture screenshot
		File source = ts.getScreenshotAs(OutputType.FILE);

		// Destination file path
		File destination = new File("C:\\Users\\Public\\screenshot.png");

		// Copy file to destination
		FileUtils.copyFile(source, destination);
		Thread.sleep(2000);
		System.out.println("Screenshot taken successfully");
		
		driver.quit();
	}

}
