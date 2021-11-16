import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddRemoveElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Browser Driver\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		int initial = 1;
		int clickNumber = 5;

		while (initial <= clickNumber) {
			driver.findElement(By.cssSelector("button[onclick]")).click();
			initial++;
		}
		Thread.sleep(2000);

		while (clickNumber > 0) {
			driver.findElement(By.cssSelector("button[onclick='deleteElement()']")).click();
			clickNumber--;
		}

	}

}
