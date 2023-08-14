package com.testExecution;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.base.TestBase;

public class TS003  extends TestBase{

	
	
	@Test(invocationCount = 2,threadPoolSize = 2)
	private void setUp() {
		browserLaunch("chrome");
	}

	
	private void aUrl() {
		launchUrl("https://www.amazon.in");
	}

}
