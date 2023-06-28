@feature1
Feature: To Validate the login Functionality of myntra application

@Sanity
Scenario: To validate login with valid login Details

Given To launch the chrome browser and maximize window
When To launch the url of the myntra application
And To pass valid mobile number in textbox 
And To click the continue button
Then To close the browser