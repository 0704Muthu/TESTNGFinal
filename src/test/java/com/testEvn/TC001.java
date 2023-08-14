package com.testEvn;

import org.testng.Assert;

import org.testng.annotations.*;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.base.TestBase;
import com.pageObject.PageObjectManager2;
import com.utility.ConfigReader;

public class TC001 extends TestBase {

	PageObjectManager2 pom = new PageObjectManager2();

	@BeforeTest
	private void setUp() {
		browserLaunch(ConfigReader.browserTc001);
		launchUrl(ConfigReader.urlTc001);
	}

	


	@Test()
	private void validateTheHomePage() {
		String expected="Amazon.in";
		String actual=driver.getTitle();
		System.out.println(actual);
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(actual, expected);
	}


	@Test()
	private void searchAProduct() {
		inputValues(pom.getLop().getAmazonSearch(), ConfigReader.SearchdataTc001);
	}

	@AfterTest
	private void tearDown() {
		exit();
	}
	
}
