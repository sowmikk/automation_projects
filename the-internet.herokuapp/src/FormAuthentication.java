import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormAuthentication {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Browser Driver\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/login");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.cssSelector("#username")).sendKeys("tomsmith");
		driver.findElement(By.cssSelector("#password")).sendKeys("SuperSecretPassword!");
		driver.findElement(By.cssSelector("button")).click();
		
		String succes = driver.findElement(By.cssSelector("h2")).getText();
		if(succes.equals("Secure Area")) {
			System.out.println("Test is successfull!");
		}
		
		driver.close();
	}

}
