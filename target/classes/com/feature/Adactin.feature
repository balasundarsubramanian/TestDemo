Feature: Login Functionlity 


Background:
Given user Launch The Url


@scenarioSmoke
Scenario: Verify the valid user login in Adactin

When user Enter the Username in Username Field
And user Enter the password in Password field
Then user click Login button and navigates to home page



Scenario Outline: verify the valid login in different countries
Given user laucnch the url of "<region>"

Examples:
|region|username|password|
|UK|  abc@gmail.com|wgrwgwr|
|US| xyz@gmail.com|ertr|












