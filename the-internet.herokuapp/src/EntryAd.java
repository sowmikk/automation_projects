import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;



public class EntryAd {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Browser Driver\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.cssSelector("#file-upload")).sendKeys("C:\\Users\\Sowmik\\Documents\\a.txt");
		driver.findElement(By.cssSelector("#file-submit")).click();
		String success = driver.findElement(By.xpath("//div[@id='uploaded-files']")).getText();
		
		if(success.equals("a.txt")) {
			System.out.println("Test is successful!");
		}
		
		driver.close();

	}

}
