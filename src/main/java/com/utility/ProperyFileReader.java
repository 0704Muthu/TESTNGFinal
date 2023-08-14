package com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ProperyFileReader {

	public static FileInputStream fis;
	
	public static Properties getAPropertyFiles() {
		/**
		 * To store a Config properties file--->File class
		 */
		File file = new File("C:\\Users\\rmuth\\eclipse-workspace\\JULIPT\\src\\main\\java\\com\\utility\\config.properties");
		/**
		 * To read the File  using --->FileInputstream(pass a  file)
		 */
		try {
			 fis = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/**
		 * To create a Object for Properties class then we read the propertyfile --->java.util
		 */
		Properties property = new Properties();
		
		/**
		 * To using load we can read the property file
		 */
		try {
			
			property.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/**
		 * we will return the property file
		 */
		return property;
	
	}
	
	
	
}
