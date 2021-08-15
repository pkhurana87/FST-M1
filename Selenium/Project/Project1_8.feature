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
@project1_8
Feature: Eight Activity

Scenario: Navigate to the “Contact Us” page and complete the form.
    Given User is on LMS Home Page
    When User Finds the navigation bar
    Then Select the menu item that says "Contact" and click it.
    And Find the contact form fields
    When Fill in the information and leave a message
    Then Click on Send message
    And Read and print the message displayed after submission.
		And Close the LMS browser
    
  

 