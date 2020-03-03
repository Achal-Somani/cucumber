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

Feature: signup
  I want to use this template for my feature file

  Scenario Outline: register testmeapp
    Given Navigate to home page
    When user enters valid inputs "<username>", "<firstname>","<lastname>","<pwd>","<pwdconfirm>","<email>","<mob>","<dob>","<addr>","<security>","<answer>"
    Then user registered successfully
    Examples: 
      | username  | firstname |lastname|pwd|pwdconfirm|email|mob|dob|addr|security|answer|
      | anch0905987 |     Anchal |somani|Password123|Password123|anch@123|76830950286|10/25/2000|35,pearl Society,Nagpur|What is your Birth Place?|Nagpur|

