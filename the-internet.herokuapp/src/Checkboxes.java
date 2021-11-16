import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Browser Driver\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(5000);
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		driver.findElement(By.cssSelector("input:first-child")).click();
		driver.findElement(By.cssSelector("input:last-child")).click();	
		
	}

}
