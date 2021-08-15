#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@project1_6
Feature: Sixth Activity

Scenario: Open the website and log-in using the provided credentials.
    Given User is on LMS Home Page
    When User Finds the navigation bar
    Then Select the menu item that says "My Account" and click it.
    When Get the page title of the Account Page
    Then Validate that user is landed to correct page
    When Get the Login button on the page and click it.
    Then Find the username field of the login form and enter the username into that field.
		And the password field of the login form and enter the password into that field.
		When Get the login button and click it.
		Then Verify that you have logged in.
		And Close the LMS browser
  

 