package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDropAction {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		Actions action = new Actions(driver);

		// DRAG AND DROP
		driver.get("https://demoqa.com/droppable");
		Thread.sleep(2000);
		
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));

		action.dragAndDrop(source, target).perform();
		Thread.sleep(2000);
		
		driver.quit();
	}

}
