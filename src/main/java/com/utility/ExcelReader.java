package com.utility;

import org.testng.annotations.DataProvider;

public class ExcelReader {


	@DataProvider(name = "data",indices = {0,2})
	public static Object[][] getAData() {

		 Object[][] allData = ExcelFile.getAllData();
		return allData;

	}
	



}
