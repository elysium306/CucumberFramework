@DPDemo
Feature: data provider demo examples

 Scenario: Search for multiple products
 Given user goto base url
 When user select option 6
 And user searches for <product>
 | iPhone |
 |iMac|
 |iPad |
 |tablet| 
 Then user should see "Product Names Are: " on the page
