import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HorizontalSlider {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Browser Driver\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/horizontal_slider");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement slider = driver.findElement(By.cssSelector("input[type='range']"));
		
		Actions action = new Actions(driver);
		action.dragAndDropBy(slider, 40, 0).perform();
		
	}

}
