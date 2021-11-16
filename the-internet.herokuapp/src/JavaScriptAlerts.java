import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptAlerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Browser Driver\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		
		WebElement first_button = driver.findElement(By.cssSelector("ul > li:nth-child(1) > button"));
		WebElement second_button = driver.findElement(By.cssSelector("ul > li:nth-child(2) > button"));
		WebElement third_button = driver.findElement(By.cssSelector("ul > li:nth-child(3) > button"));
		WebElement result = driver.findElement(By.cssSelector("#result"));
		
		Thread.sleep(2000);
		first_button.click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		if(result.getText().equals("You successfully clicked an alert")) {
			System.out.println("Test 1 Successfull!");
		}
		
		Thread.sleep(2000);
		second_button.click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		if(result.getText().equals("You clicked: Cancel")) {
			System.out.println("Test 2 Successfull!");
		}
		
		Thread.sleep(2000);
		third_button.click();
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("Hello");
		driver.switchTo().alert().accept();
		if(result.getText().equals("You entered: Hello")) {
			System.out.println("Test 3 Successfull!");
		}
		
		driver.close();
	}

}
