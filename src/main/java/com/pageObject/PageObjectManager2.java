package com.pageObject;

import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

public class PageObjectManager2 extends TestBase {

	public PageObjectManager2() {
		PageFactory.initElements(driver, this);
	}
	
	
	private LoginPage lop;
	
	public LoginPage getLop() {
		lop = new LoginPage();
		return lop;
	}
	
	
}
