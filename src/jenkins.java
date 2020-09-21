import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class jenkins {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","D:\\selenium latest\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		

	}

}
