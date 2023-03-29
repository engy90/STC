package STCTV.STC;

import static org.testng.Assert.assertTrue;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import POM.landingPage;
import resources.base;

public class LandingPage extends base  {
	
	
	public static void main(String args[]) throws InterruptedException, IOException
	{
		String url = "SAurl";
		driver = initializeDriver(url);
	
	landingPage land = new landingPage(driver);
	assertTrue(land.litepkg().isDisplayed());
	assertTrue(land.Classicpkg().isDisplayed());
	assertTrue(land.Premiumpkg().isDisplayed());
   String lite =   land.liteprice().getText();
   
   String classic =   land.ClassicPrice().getText();
   String premium =   land.PremiumPrice().getText();
   System.out.println( "Prices for our packages are " + lite+ classic + premium);
   
   String liteCUR =   land.liteCUR().getText();
   String classicCUR =   land.ClassicCUR().getText();
   String premiumCUR =   land.PremiumCUR().getText();
   
   assertTrue(liteCUR.contains("SAR"));
   assertTrue(classicCUR.contains("SAR"));
   assertTrue(premiumCUR.contains("SAR"));
   
		 
   
  
	
	
	
	
	
	
	
	}
}
