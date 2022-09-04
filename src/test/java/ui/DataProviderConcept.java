package ui;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderConcept {
	
	@Test(dataProvider="dataSet", dataProviderClass=DataProviderCalledFromOtherClass.class)
	public void testdata(String username, String password) {
		
		System.out.println("username"+"password");
	}
	
	@Test(dataProvider="dataSet1", dataProviderClass=DataProviderCalledFromOtherClass.class)
	public void testdata1(String username, String password, String test) {
		
		System.out.println("username"+"password"+"test");
	}
	
	@Test(dataProvider="dataSet1", dataProviderClass=DataProviderCalledFromOtherClass.class)
	public void testdata2(String username, String password, String test, String fourth) {
		
		System.out.println("username"+"password"+"test"+"fourth");
	}
	


}
