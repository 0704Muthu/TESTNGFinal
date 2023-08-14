package com.pageObject;


public interface Login {

	String addtobag="(//span[text()='Add to Bag'])[1]";

	String order="//div[@class=\"css-0 e1ewpqpu1\"]";

	String cart ="//span[@class='cart-count']";

	String qty ="//div[@class='css-e7m3y7 e2bqcji3']//span[@label='2']";

	String proceed = "//span[text()='Proceed']";

	String login = "//button[text()='Log In']";

	String deliver ="//button[text()='Deliver here']";

	String cash = "//div[@class='css-46b9vi efuv1qx0']//following::p[text()='Cash on delivery']";

	String placeorder = "//button[text()='Place order']";

	String account = "//span[@class='AccountText']";

	String myOrder = "//a[text()='My Orders']";

	String details = "(//span[@class='undefined']//following::span[text()='Order Details'])[1]";

	String cancel = "//button[text()='Cancel Order']";

	String reason = "//span[text()='Select reason']";

	String wrongOrder = "//div[text()='Wrong shade/size/colour ordered']";

	String cancelOrder = "//button[text()='Cancel order']";

	String confirm ="//button[text()='Confirm']";

	String enter = "//input[@placeholder='Enter Mobile Number or Email']";

	String verify = "//button[text()='verify']";

}