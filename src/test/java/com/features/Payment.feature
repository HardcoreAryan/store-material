Feature: Paymant Functionality;

@Test
Scenario: verify user is able to place an order

When user enter username and password
And user click on login button 
When user add product into the basket
And user naviate to check out
And user enter user deatils
And user place an order
Then validate the success message