package com.testExecution;


import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.base.TestBase;
import com.pageObject.PageObjectManager2;
import com.pageObject.PageObjectManger;

public class TS001 extends TestBase {
	
	PageObjectManager2 pom  = new PageObjectManager2();
	
	@BeforeSuite
	private void setUp() {
		browserLaunch("chrome");
	}

	@BeforeTest
	private void aUrl() {
		launchUrl("https://www.amazon.in");
	}

	@Test()
	private void ValidateTheHomePage() {
		String expected="Amazon.in";
		String actual = driver.getTitle();
		//Assert----->For validation/Verification
		//HardAssert--->Validation
		//Assert.assertEquals(actual, expected);
		//SoftAssert--->Verification
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(actual, expected);
		//soft.assertAll();
	}
	
	@Parameters("search")
	@Test(dependsOnMethods = "ValidateTheHomePage")
	private void searchAProduct(String data) {

		inputValues(pom.getLop().getAmazonSearch(),data);
	}


	@AfterClass
	public void tearDown() {
		exit();
	}
	

	
}
