package com.pageObject;

public interface Home {
	String skin ="(//a[text()='skin'])[2]";

	String facewash = "(//a[contains(text(),'Face Wash')])[2]";

	String natural ="//div[text()='Simple Kind To Skin Refreshing Facial Wash']";

	String search="twotabsearchtextbox";
}
