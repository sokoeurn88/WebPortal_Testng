package commondatasetup;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import utilities.TakeScreenShot;

public class Listeners extends TakeScreenShot implements ITestListener {
	
	public void onTestStart(ITestResult result) {
		
		System.setProperty("org.uncommons.reportng.title", "Sokoeurn Chhay RCV Academy Test Report");
		
		Reporter.log("My method name is - "+ result.getName());
		System.out.println("Test case is starting");
	}
	
	public void onTestSuccess(ITestResult result) {
		Reporter.log("Status of execution is - "+ result.getStatus());
	}
	
	public void onTestFailure(ITestResult result) {
		System.out.println("Test failed - screenshot captured");
		try {
			getScreenshot();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		System.setProperty("org.uncommons.reportng.escape-output", "false");
		Reporter.log("<a href=\"C:\\Users\\sokoeurn chhay\\Selenium_Java_Review\\webportal-TestNG\\ebayscreenshot\\Sat-Jun-11-11-43-31-CDT-2022.png\">Test Results</a>");
	}

}
