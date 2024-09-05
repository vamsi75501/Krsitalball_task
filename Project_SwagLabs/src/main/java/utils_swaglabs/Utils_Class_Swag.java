package utils_swaglabs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Utils_Class_Swag {
	
	
	
	public static WebDriver driver;
	// cross browser

	public void browserlaunch(String browser) {
			switch (browser) {
			case "chrome":
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				break;
			case "firefox":
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				break;
			default:
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				break;
		

			}

	}
}
