@NopReg
Feature: NopCommerce
  Background:
    Given I am on NopCommerce home page

  Scenario: Registration Using Only mandatory Fields
    Given I am on NopCommerce home page
   And I click on Register link
    And  I populate only the mandatory fields firstName as "Bob", lastname as "omotosho",email as "omo7@gmail.com"password and confirm password as "123456"
    And I click on register button
    Then Your registration completed



  Scenario: Registration Using all the input Fields

    And I click on Register link
    And  I populate only the mandatory fields firstName as "Bob", lastname as "omotosho",email as "omo2@gmail.com"password and confirm password as "123456"
    And I populate day as "3", month as "February", year as  "1980", and company as "Malashe"
    And I click on register button
    Then  Your registration completed

