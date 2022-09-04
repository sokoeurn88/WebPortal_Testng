package ui;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class DataProviderCalledFromOtherClass {
	
//	@DataProvider
//	public Object[][] dataSet() {
//		Object[][] dataset = new Object[4][2];
//		//first row
//		dataset[0][0] = "user1";
//		dataset[0][1] = "pass1";
//		//second row
//		dataset[1][0] = "user2";
//		dataset[1][1] = "pass2";
//		//third row
//		dataset[2][0] = "user3";
//		dataset[2][1] = "pass3";
//		//fourth row
//		dataset[3][0] = "user4";
//		dataset[3][1] = "pass4";
//		
//		return dataset;
//
//	}
	
	@DataProvider
	public Object[][] dataSet1(Method m) {
		
		Object [][] testdataa = null;
		
		if(m.getName().equals("testdata")) {
			testdataa = new Object[][] {
				{"username1", "password1"},
				{"username2", "password2"},
				{"username3", "password3"},
				{"username4", "password4"},
				};
		} else if(m.getName().equals("testdata1")) {
			testdataa = new Object[][] {
				{"username1", "password1", "test1"},
				{"username2", "password2", "test2"},
				{"username3", "password3", "test3"},
				{"username4", "password4", "test4"},
				};
		} else if(m.getName().equals("testdata2")) {
			testdataa =  new Object[][] {
			{"username1", "password1", "test1", "fourth"},
			{"username2", "password2", "test2", "fourth"},
			{"username3", "password3", "test3", "fourth"},
			{"username4", "password4", "test4", "fourth"}
			};
	}
		return testdataa;

}
}
