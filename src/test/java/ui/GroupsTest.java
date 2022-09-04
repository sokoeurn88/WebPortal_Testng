package ui;

import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commondatasetup.DataSetup;

@Test(groups="user-registration")
public class GroupsTest extends DataSetup implements ITestListener {
	
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
	
	@Test(priority=2, description="it is the first login test", groups="regression")
	public void Test1() {
		System.out.println("test1");
		 Assert.assertTrue(false, "this is not I am looking for");
		
	}
	
	@Test(priority=1, description="it is the last logout test", groups={"regression","bvt"})
	public void Test2() {
		System.out.println("test2");
	}
	@Test(priority=0, description="it is the last logout test", groups="bvt")
	public void Test3() {
		System.out.println("test3");
	}

}
