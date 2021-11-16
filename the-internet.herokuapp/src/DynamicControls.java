import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class DynamicControls {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Browser Driver\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_controls");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Checkbox
		driver.findElement(By.cssSelector("#checkbox > input")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#checkbox > input")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("#checkbox-example > button")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("#checkbox-example > button")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.cssSelector("input[type='checkbox']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[type='checkbox']")).click();
		Thread.sleep(2000);
		
		//Input Field
		driver.findElement(By.cssSelector("#input-example > button")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Hello");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#input-example > button")).click();
		
		
	}

}