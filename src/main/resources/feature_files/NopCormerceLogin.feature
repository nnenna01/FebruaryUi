@NopLog
Feature: AS A USER, I WANT TO BE ABLE TO LOGIN IN SO THAT I CAN SHOP FOR PRODUCTS
Background:
  Given I am on NopCommerce home page



  Scenario: Login with incorrect credentials to display appropriate error message


    And I have no item in the shopping cart
    And I click on Login link
    When I attempt to login using incorrect credentials with Email as "nne@gmail.com" and Password as "567123"
    When I click Login button
    Then I should get the appropriate error message displayed as per design "<Login was unsuccessful. Please correct the errors and try again. No customer account found>"

    Scenario: 2

   When I enter invalid Email format as "nee.gee.com" and password as "Jane"
   Then should get the appropriate error message displayed as per design "<Wrong email>"Scenario: 3

   And I enter Email as "123456" and Password as "nee.gee.com
   Then should get the appropriate error message displayed as per design "<Wrong email>"



  Scenario: 4
   And I leave the email field blank and I enter the right password as "123456"
    Then Then should get the appropriate error message displayed as per design {string"Please enter your email"}

