package com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFile {
	
	public static FileInputStream fis;
	public static Workbook wb;
	public  static Object[][] getAllData(){
		File file = new File("C:\\Users\\rmuth\\Documents\\DataDriven.xlsx");
		
		try {
			fis = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			wb = new XSSFWorkbook(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//up casting
		Sheet sheetAt = wb.getSheetAt(2);

		//Get row value include header
		int physicalNumberOfRows = sheetAt.getPhysicalNumberOfRows();
		System.out.println("include header:"+physicalNumberOfRows);

		//Get last row value
		int lastRowNum = sheetAt.getLastRowNum();
		System.out.println("last row value:"+lastRowNum);
		//Get last cell value
		short lastCellNum = sheetAt.getRow(0).getLastCellNum();
		System.out.println("last cell value:"+lastCellNum);

		//Iterate the row and column
		Object[][] data = new Object[physicalNumberOfRows-1][lastCellNum];
		for (int i = 1; i <physicalNumberOfRows; i++) {
			for (int j = 0; j <lastCellNum; j++) {
				Cell cell = sheetAt.getRow(i).getCell(j);
				DataFormatter dataf = new DataFormatter();
				String formatCellValue = dataf.formatCellValue(cell);
				data[i-1][j]=formatCellValue;
			}
		}
		return data;

	}


}
