package com.StepDefination;


import com.pages.Paymentpage;

import com.pages.Productpage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Paymentpagesteps  {

Productpage product = new Productpage();
Paymentpage Payment = new Paymentpage();

	
	
	
@When("user add product into the basket")
public void user_add_product_into_the_basket() {
    product.addToCart();
}
@When("user naviate to check out")
public void user_naviate_to_check_out() {
   product.clickToCartIcon();
   product.clickToCheckOut();
}
@When("user enter user deatils")
public void user_enter_user_deatils() {
    Payment.enterUserDetails();
}
@When("user place an order")
public void user_place_an_order() {
   Payment.placeOrder();
}
@Then("validate the success message")
public void validate_the_success_message() {
   // Payment.validateOfConfermation();
}
}