@End2End @Integration
Feature: Data Table Demo Feature
  I want to use this template for my feature file

  Background: User logs into the website
    
    
    Scenarios: There are two scenarios


  Scenario: the user should be able to login with valid username and password
    Given user is on the login page
    When user enters correct username and correct password
      | username               | password        |
      | elysium306@hotmail.com | DeMoBlaze@2024  |
      | invalidUsername        | DeMoBlaze@2024  |
      | elysium306@hotmail.com | invalidPassword |
    Then user is redirected to landing page
    And user gets confirmation message

  Scenario: Scenario 2
    Given user is on the login page
    When user does b
    Then user does c

  Scenario: Scenario 3
    Given user is on the login page
    When user does e
    Then user does f
