import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Browser Driver\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/hovers");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement first_image = driver.findElement(By.cssSelector("div:nth-child(3) > img"));
		WebElement second_image = driver.findElement(By.cssSelector("div:nth-child(4) > img"));
		WebElement third_image = driver.findElement(By.cssSelector("div:nth-child(5) > img"));
		
		Actions action = new Actions(driver);
		action.moveToElement(first_image).perform();
		Thread.sleep(2000);
		action.moveToElement(second_image).perform();
		Thread.sleep(2000);		
		action.moveToElement(third_image).perform();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("a[href='/users/3']")).click();
		Thread.sleep(2000);
		driver.navigate().back();	
		
	}

}
