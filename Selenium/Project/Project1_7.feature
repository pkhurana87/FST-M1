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
@project1_7
Feature: Seveth Activity

Scenario: Opening a LMS webpage using Selenium
    Given User is on LMS Home Page
    When User Finds the navigation bar
    Then Select the menu item that says "All Courses" and click it.
    When Get all the courses on the page.
    Then Print the number of courses on the page
    
  

 