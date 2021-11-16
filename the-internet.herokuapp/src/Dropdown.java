import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Browser Driver\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dropdown");
		Thread.sleep(2000);
		
		WebElement dropdown = driver.findElement(By.id("dropdown"));
		Select select = new Select(dropdown);
		select.selectByValue("2");
		
//		select.selectByVisibleText("Option 1");

	}

}
