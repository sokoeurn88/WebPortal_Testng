package ui;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import commondatasetup.BaseTest;

public class ListenerTakeScreenshot extends BaseTest {
	
	
	static {
		
		Reporter.log("This is before launch app");
		System.out.println("Reporter test lauch app");
	}
	
//	@Test(retryAnalyzer = commondatasetup.RunningFailedTest.class)
	@Test()
	public void launchApp() {
	
		driver.get("https://www.ebay.com");
		Assert.assertTrue(false);	// make it fails to generate screenshot
		
	}
}
