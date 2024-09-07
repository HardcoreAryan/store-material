Feature: login functionlity 

@smoke
Scenario: verify login functionality with valid deatils
Given user launch site url
When user enter username and password
And user click on login button 
Then  validate user is sucessfully loggedIn

