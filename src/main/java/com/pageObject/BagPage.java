package com.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;



public class BagPage extends TestBase {
	
	public BagPage() {	
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath=Login.addtobag)
	private WebElement addToBag;
	
	@FindBy(xpath=Login.order)
	private WebElement order;
	
	
	@FindBy(xpath=Login.cart)
	private WebElement cart;

	@FindBy(xpath=Login.qty)
	private WebElement qty;

	@FindBy(xpath=Login.proceed)
	private WebElement proceed;

	@FindBy(xpath=Login.login)
	private WebElement login;

	@FindBy(xpath=Login.deliver)
	private WebElement deliver;
	//
	
	@FindBy(xpath=Login.cash)
	private WebElement cash;
	
	@FindBy(xpath=Login.placeorder)
	private WebElement placeorder;
	
	
	@FindBy(name="otpValue")
	private WebElement otp;
	
	@FindBy(name="emailMobile")
	private WebElement mobile;
	

	@FindBy(id="submitVerification")
	private WebElement process;
	
	@FindBy(xpath=Login.account)
	private WebElement account;
	
	@FindBy(xpath=Login.myOrder)
	private WebElement myOrder;
	
	@FindBy(xpath=Login.details)
	private WebElement details;
	
	@FindBy(xpath=Login.cancel)
	private WebElement cancel;
	
	
	@FindBy(xpath=Login.reason)
	private WebElement reason;
	
	
	@FindBy(xpath=Login.wrongOrder)
	private WebElement wrongOrder;
	
	@FindBy(xpath=Login.cancelOrder)
	private WebElement cancelOrder;
	
	@FindBy(xpath=Login.confirm)
	private WebElement confirm;
	
	
	public WebElement getConfirm() {
		return confirm;
	}

	public WebElement getReason() {
		return reason;
	}

	public WebElement getWrongOrder() {
		return wrongOrder;
	}

	public WebElement getCancelOrder() {
		return cancelOrder;
	}

	public WebElement getAccount() {
		return account;
	}

	public WebElement getMyOrder() {
		return myOrder;
	}

	public WebElement getDetails() {
		return details;
	}

	public WebElement getCancel() {
		return cancel;
	}

	public WebElement getProcess() {
		return process;
	}

	@FindBy(xpath=Login.enter)
	private WebElement enter;
	
	@FindBy(xpath=Login.verify)
	private WebElement verify;
	
	public WebElement getVerify() {
		return verify;
	}

	public WebElement getOtp() {
		return otp;
	}

	public WebElement getMobile() {
		return mobile;
	}

	public WebElement getEnter() {
		return enter;
	}

	

	public WebElement getOrder() {
		return order;
	}

	public WebElement getAddToBag() {
		return addToBag;
	}
	public WebElement getCart() {
		return cart;
	}
	public WebElement getQty() {
		return qty;
	}
	public WebElement getProceed() {
		return proceed;
	}
	public WebElement getLogin() {
		return login;
	}
	public WebElement getDeliver() {
		return deliver;
	}
	public WebElement getCash() {
		return cash;
	}
	public WebElement getPlaceorder() {
		return placeorder;
	}

	
	
	
	
	
}
