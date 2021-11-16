import org.openqa.selenium.chrome.ChromeDriver;

public class BasicAuth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Browser Driver\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();

		driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");


	}

}
