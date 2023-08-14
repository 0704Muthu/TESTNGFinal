package com.testEvn;


import org.testng.annotations.*;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.base.TestBase;
import com.pageObject.PageObjectManager2;
import com.utility.ConfigReader;

public class TC002 extends TestBase {
PageObjectManager2 pom = new PageObjectManager2();
	
	@BeforeClass
	private void setUp() {
		browserLaunch(ConfigReader.browserTc002);
		launchUrl(ConfigReader.urlTc001);
	}
	
	
	
	@Test(enabled = false)
	private void validateTheHomePage() {
		String expected="Amazon.in";
		String actual=driver.getTitle();
		//Assert--->Validation/Verification
		//HardAssert--->Validation
		//Assert.assertEquals(actual, expected);
		//SoftAssert--->verification
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(actual, expected);
		//soft.assertAll();
	}
	
	
	@Test()
	private void searchAProduct() {
		inputValues(pom.getLop().getAmazonSearch(), ConfigReader.SearchdataTc002);
	}
	
	@AfterSuite
	private void tearDown() {
		exit();
	}
}
