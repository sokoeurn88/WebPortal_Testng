package ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import commondatasetup.DataSetup;
import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyTitleTest extends DataSetup {
	
	@Test
	public void titleTest() {

		String title = "Electronics, Cars, Fashion, Collectibles & More | eBay";
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		
		String actualtile = driver.getTitle();
		
		Assert.assertEquals(actualtile, title);
		
		
	}

}
