package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class landingPage {
	public WebDriver driver;

	
	By LiteBundle = By.xpath("//*[text()='Lite']");
	By ClassicBundle = By.xpath("//*[text()='Classic']");
	By PremiumBundle = By.xpath("//*[text()='Premium']");
	
	By litePrice = By.xpath("//*[@id='currency-lite']//b");
	By classicPrice = By.xpath("//*[@id='currency-classic']//b");
	By premiumPrice = By.xpath("//*[@id='currency-premium']//b");
	
	//Currency 
	
	By liteCUR = By.xpath("//*[@id='currency-lite']//i");
	By classicCUR = By.xpath("//*[@id='currency-classic']//i");
	By premiumCUR = By.xpath("//*[@id='currency-premium']//i");
	public landingPage(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver = driver2;
	}

	public WebElement litepkg()

	{
		return driver.findElement(LiteBundle);

	}

	public WebElement Classicpkg()

	{
		return driver.findElement(ClassicBundle);

	}
	public WebElement  Premiumpkg()

	{
		return driver.findElement(PremiumBundle);

	}
	//Prices
	
	public WebElement liteprice()

	{
		return driver.findElement(litePrice);

	}
	public WebElement ClassicPrice()

	{
		return driver.findElement(classicPrice);

	}
	public WebElement  PremiumPrice()

	{
		return driver.findElement(premiumPrice);

	}
	
	//Currency 
	
	public WebElement liteCUR()

	{
		return driver.findElement(liteCUR);

	}
	public WebElement ClassicCUR()

	{
		return driver.findElement(classicCUR);

	}
	public WebElement  PremiumCUR()

	{
		return driver.findElement(premiumCUR);

	}
	
}
