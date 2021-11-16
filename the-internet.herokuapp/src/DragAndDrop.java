import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Browser Driver\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
//		driver.get("https://the-internet.herokuapp.com/drag_and_drop");
//		
//		WebElement A = driver.findElement(By.cssSelector("div#column-a"));
//		WebElement B = driver.findElement(By.cssSelector("div#column-b"));
//		Thread.sleep(3000);
//		
//		Actions action = new Actions(driver);
//		action.dragAndDrop(A, B).perform();
		driver.get("https://jqueryui.com/droppable/#default");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement frame = driver.findElement(By.cssSelector("#content > iframe"));
		driver.switchTo().frame(frame);
		WebElement A = driver.findElement(By.id("draggable"));
		WebElement B = driver.findElement(By.id("droppable"));
		Thread.sleep(2000);
		
		Actions action = new Actions(driver);
		action.dragAndDrop(A, B).perform();

	}

}
