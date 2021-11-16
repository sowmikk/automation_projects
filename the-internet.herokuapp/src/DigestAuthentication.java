import org.openqa.selenium.chrome.ChromeDriver;

public class DigestAuthentication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Browser Driver\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://admin:admin@the-internet.herokuapp.com/digest_auth");
		

	}

}
