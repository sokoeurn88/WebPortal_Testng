package ui;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commondatasetup.DataSetup;

public class LoginTest extends DataSetup {
	
	@BeforeTest
	public void loginToApplication() {
		System.out.println("Login to application.");
	}

	@AfterTest
	public void logoutFromApplication() {
		System.out.println("Logout from application.");
	}
	
	@BeforeMethod
	public void connectToDB() {
		System.out.println("connect to DB");
	}
	
	@AfterMethod
	public void disconnectFromDB() {
		System.out.println("disconnect from DB");
	}
	
	@Test(priority=2, description="it is the first login test")
	public void Test1() {
		System.out.println("test1");
		
	}
	
	@Test(priority=1, description="it is the last logout test")
	public void Test2() {
		System.out.println("test2");
	}

}
