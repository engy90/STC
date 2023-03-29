package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class base {

	
	public static WebDriver driver;
	public Properties prop1;
	public Properties prop2;
	public Properties prop3;
	static WebDriverWait wait;

	public static WebDriver initializeDriver(String url) throws IOException {
        Properties prop1;
		
		prop1 = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\ihuser\\eclipse-workspace\\STC\\src\\main\\java\\resources\\data.properties");
		prop1.load(fis);
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ihuser\\eclipse-workspace\\STC\\src\\main\\java\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get(prop1.getProperty(url));
	driver.manage().window().maximize();
	driver.navigate().refresh();
		return driver;

	}

}
