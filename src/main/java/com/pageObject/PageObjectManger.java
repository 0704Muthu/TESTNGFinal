package com.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;


public class PageObjectManger extends TestBase {

	public PageObjectManger() {
		PageFactory.initElements(driver, this);
	}


	private   HomePage hom;

	private BagPage Bop;

	public HomePage getHom() {
		return hom;
	}

	public BagPage getBop() {
		return Bop;
	}





}
