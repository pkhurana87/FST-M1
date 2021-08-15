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
@project1_9
Feature: Last Activity

Scenario: Navigate to a particular lesson and complete it.
    Given User is on LMS Home Page
    When User Finds the navigation bar
    Then Select the menu item that says "My Account" and click it.
    When User is logged in with username and password.
    Then Select the menu item that says "All Courses" and click it.
    When Select any course.
    Then Click on a lesson in the course and Verify the title of the course.
    When Click the Mark Complete button on the page if available
    Then Close the LMS browser
    
    
    
  

 