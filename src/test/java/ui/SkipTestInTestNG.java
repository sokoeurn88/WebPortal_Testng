package ui;

import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

import commondatasetup.DataSetup;

public class SkipTestInTestNG extends DataSetup {
	
	Boolean providetestdata = true;

	@Test(enabled=false, groups="regression")
	public void testData() {
		System.out.println("testData");
	}
	
	@Test(groups="regression")
	public void testData2() {
		System.out.println("testData2");
		throw new SkipException("testData2");
	}
	
	@Test
	public void testData3() {
		System.out.println("testData3");
		if(providetestdata==false) {
			System.out.println("testData3");	
		} else {
			System.out.println("testData3");
			throw new SkipException("testData3");
		}
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("beforeclass");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("afterclass");
	}
	
	@BeforeGroups(value="regression")
	public void beforeGroup() {
		System.out.println("print before groups");
	}
	
	@AfterGroups(value="regression")
	public void afterGroups() {
		System.out.println("print after group");
	}
}
