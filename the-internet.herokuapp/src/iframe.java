import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Browser Driver\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/iframe");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement frame = driver.findElement(By.cssSelector("iframe"));
		driver.switchTo().frame(frame);
		driver.findElement(By.cssSelector("p")).clear();
		driver.findElement(By.cssSelector("p")).sendKeys("This is clean text");
		
	}

}
