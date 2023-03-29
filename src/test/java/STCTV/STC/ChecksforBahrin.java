package STCTV.STC;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import POM.landingPage;
import resources.base;


public class ChecksforBahrin extends base {
	
	public WebDriver driver;
	

	@BeforeTest
	public void initializebrowser() throws IOException, InterruptedException {
		String url = "Bhdurl";
		driver = initializeDriver(url);
	}
	
@Parameters({"BHD"})
@Test
public void ValidationsBahrin(String Currency) throws IOException, InterruptedException {
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
