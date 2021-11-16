import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JQueryUIMenus {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Browser Driver\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/jqueryui/menu#");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement enabled = driver.findElement(By.xpath("//a[text()='Enabled']"));
		WebElement downloads = driver.findElement(By.xpath("//a[text()='Downloads']"));
		
		Actions action = new Actions(driver);
		Thread.sleep(1000);
		action.moveToElement(enabled);
		action.moveToElement(downloads);
		
	}

}
