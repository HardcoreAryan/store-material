package com.pages;

import org.openqa.selenium.By;


import com.helper.Base;

public class Paymentpage extends Base {

	private static final By thankYouMessage = null;
	By firstName = By.xpath("//input[@id='first-name']");
	By LastName = By.xpath("//input[@id='last-name']");
	By ZipCode = By.xpath("//input[@id='postal-code']");
	By continousBtn = By.xpath("//input[@class='btn_primary cart_button']");
	By finishBtn = By.xpath("//a[@class='btn_action cart_button']");
	

    public void enterUserDetails () {
	clearAndEnterText(firstName, "Divyanshu");
	clearAndEnterText(LastName,"Arya");
	clearAndEnterText(ZipCode, "122334");
		clickonElement(continousBtn);
}
    
    public void placeOrder () {
    	
    clickonElement(finishBtn);
    	
    	
    }
    public void validateOfConfermation() {
    	
    	validateText(thankYouMessage, "Thank you for your Order ");
    	
    	
    }
    
    
}