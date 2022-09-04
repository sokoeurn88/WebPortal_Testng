package commondatasetup;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class DataSetup {

	@BeforeSuite
	public void dataSetup() {
		System.out.println("data setup");
	}

	@AfterSuite
	public void teardowndata() {
		System.out.println("data teardown");
	}

}
