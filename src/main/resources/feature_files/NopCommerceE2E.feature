Feature: NopCommerceE2E
@NopE2E
  Scenario: Test that yu cannot checkout without logging in

    Given I am on NopCommerce home page
    And I am not logged in
    When I click on Computers link
    And I click on Desktops link
    And I click on "Build your own computer" link
    And I select "2 GB" of RAM and "320 GB" of HDD
    And I click on the "ADD TO CART" button
    And I click on the "shopping cart" link on top
    And I click on Agree to terms check box
    And  I click on CHECKOUT button
    Then "Welcome, Please Sign In" page is displayed