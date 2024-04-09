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
@Integration
Feature: Test the login functionality on <demoblaze.com> website
  I want to use test how to demo the login to this page

  @Smoke
  Scenario: DemoBlaze Login Test
    Given I went to demoblaze landing page
    And Clicked on login option
    When I enter username and password
    And Clicked on signin button
    Then Logout option should be available
    And welcome message should be displayed
