package com.utility;

public class ConfigReader {

	
	/**
	 * get Property is used to get the value from properties file
	 *
	 */
	
	public static String browserTc001 = ProperyFileReader.getAPropertyFiles().getProperty("browserNameTC001");
	public static String urlTc001 = ProperyFileReader.getAPropertyFiles().getProperty("urlTC001");
	public static String SearchdataTc001 = ProperyFileReader.getAPropertyFiles().getProperty("searchTC001");

	
	public static String browserTc002 = ProperyFileReader.getAPropertyFiles().getProperty("browserNameTC002");
	public static String SearchdataTc002 = ProperyFileReader.getAPropertyFiles().getProperty("searchTC002");
	public static String fburl = ProperyFileReader.getAPropertyFiles().getProperty("urlFb");
	
	
	
	
}
