package com.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;



public class HomePage extends TestBase{

	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath=Home.skin)
	private WebElement skin;
	

	@FindBy(xpath=Home.facewash)
	private WebElement facewash;

	@FindBy(xpath=Home.natural)
	private WebElement natural ;
	
	@FindBy(id = Home.search)
	private WebElement searchP;
	
	public WebElement getSearchP() {
		return searchP;
	}
	
	public WebElement getNatural() {
		return natural;
	}



	public WebElement getSkin() {
		return skin;
	}



	public WebElement getFacewash() {
		return facewash;
	}



	
	
}
