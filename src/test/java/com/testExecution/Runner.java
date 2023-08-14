package com.testExecution;

import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import com.base.TestBase;
import com.pageObject.PageObjectManager2;
import com.utility.ConfigReader;
import com.utility.ExcelReader;

public class Runner extends TestBase {
	PageObjectManager2 pom  = new PageObjectManager2();
	
	
	@BeforeSuite
	private void setUp() {
		browserLaunch(ConfigReader.browserTc001);
	}

	@BeforeMethod
	private void aUrl() {
		launchUrl("https://www.facebook.com");
	}




	@Test(dataProvider = "data",dataProviderClass  = ExcelReader.class)
	private void searchAProduct(String data[]) {

		inputValues(pom.getLop().getUsername(),data[0]);
		inputValues(pom.getLop().getPassword(),data[1]);
	}

	

	@AfterTest
	public void tearDown() {
		exit();
	}

}
