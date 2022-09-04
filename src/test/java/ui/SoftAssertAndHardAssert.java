package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import commondatasetup.DataSetup;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SoftAssertAndHardAssert extends DataSetup {
	
	@Test
	public void titleTest() {

		String title = "Electronics, Cars, Fashion, Collectibles & More | eBay";
		String expectedsearch = "Search";
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		
		String actualtile = driver.getTitle();
		String search = driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).getAttribute("value");
		
		Assert.assertEquals(actualtile, title);
		Assert.assertEquals(search, expectedsearch, "it's not what I am looking for!");
		
		SoftAssert softassert = new SoftAssert();
		softassert.assertEquals(actualtile, actualtile, "it's wrong title");
		softassert.assertEquals(search, expectedsearch);
		softassert.assertAll();
		
		
		driver.close();
		driver.quit();
		driver=null;
		
		
	}

}
