package com.utility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer {
	int count=0;
	int max=2;
	
	@Override
	public boolean retry(ITestResult result) {
		if(count<max) {
			//0<2
			count++;
			return true; 
		}
		return false;
	}

}
