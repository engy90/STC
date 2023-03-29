package STCTV.STC;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import POM.landingPage;
import resources.base;

public class Countrieschecks extends base {

		

		public WebDriver driver;
		

		
		
	@Parameters({"Kwurl"})
	@Test
	public void ValidationsKuwait(String url) throws IOException, InterruptedException {
String Currency = "KWD" ;
		
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
	   
	   assertTrue(liteCUR.contains(Currency));
	   assertTrue(classicCUR.contains(Currency));
	   assertTrue(premiumCUR.contains(Currency));

	}
	
	@Parameters({"SAurl"})
	@Test
	public void ValidationsSaudiArabia(String url) throws IOException, InterruptedException {
      String Currency = "SAR" ;
		
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
	   
	   assertTrue(liteCUR.contains(Currency));
	   assertTrue(classicCUR.contains(Currency));
	   assertTrue(premiumCUR.contains(Currency));

	}
	
	@Parameters({"Bhdurl"})
	@Test
	public void ValidationsBahrain(String url) throws IOException, InterruptedException {
String Currency = "BHD" ;
		
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
	   
	   assertTrue(liteCUR.contains(Currency));
	   assertTrue(classicCUR.contains(Currency));
	   assertTrue(premiumCUR.contains(Currency));

	}
	@AfterTest
	public void tiredown()  {
		driver.close();
	}
}
