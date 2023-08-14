package com.testEvn;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.base.TestBase;
import com.pageObject.PageObjectManager2;
import com.utility.ConfigReader;
import com.utility.Retry;

public class TC003 extends TestBase {

	PageObjectManager2 pom = new PageObjectManager2();

	@Test(groups = "chrome")
	private void chrome() {
		browserLaunch(ConfigReader.browserTc001);
		launchUrl(ConfigReader.urlTc001);
	}



	@Test(dependsOnMethods = "chrome")
	private void searchAProduct() {
		inputValues(pom.getLop().getAmazonSearch(), ConfigReader.SearchdataTc001);
	}

	@AfterSuite
	private void tearDown() {
		exit();
	}




}
