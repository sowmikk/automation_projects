import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class FileUpload {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Browser Driver\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/entry_ad");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#modal > div.modal > div.modal-footer > p"))).click();
		
		System.out.println("Test successfull!!");

	}

}
