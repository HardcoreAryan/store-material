package com.pages;

import org.openqa.selenium.By;


import com.helper.Base;

public class Productpage extends Base {

	
     By addToCart = By.xpath("(//button[@class='btn_primary btn_inventory'])[1]");
	By clickToCartIcon = By.xpath("//a[@class='shopping_cart_link fa-layers fa-fw']");	
	By clickToCheckOut = By.xpath("//a[@class='btn_action checkout_button']");		
     
     
     
		public void addToCart() {
		
	clickonElement(addToCart);

	
	}
		public void clickToCartIcon()	{
			
				clickonElement(clickToCartIcon);
			
			}
			
			public void clickToCheckOut() {
				
				clickonElement(clickToCheckOut);
				
				
				
				
			}
						
			
}
