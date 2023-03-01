
Feature: UKBA

  Background:
  @UKBA
  Scenario: Country and Study
    Given I am on "https://www.gov.uk/check-uk-visa/y"
    When I provide nationality of "Japan"
    And I click on Continue button
    And I select reason as "Study"
    And I click on Continue button
    And I state I intend to stay for more than 6 months
    And I click on Continue button
    Then I should be informed that "You'll need a visa to study in the UK"
@UKBA2
  Scenario Outline:  Japan Nationalities coming to the Uk to Study for more than 6 months require visa using Scenario outline

    Given I am on "https://www.gov.uk/check-uk-visa/y"
    When I provide nationality of "<CountryName>"
    And I click on Continue button
    And I select reason as "Study"
    And I click on Continue button
    And I state I intend to stay for more than 6 months
    And I click on Continue button
    Then I should be informed that "You'll need a visa to study in the UK"
    Examples:
    |CountryName           |
    |Japan                 |
    |Ukraine|
    |Morocco|
    |USA|
    |Australia|
    |Canada|



  Scenario Outline:  Nationalities coming to the UK for Tourism will not need Visa using Scenario Outline
    Given I am on "https://www.gov.uk/check-uk-visa/y"
    Given I provide a nationality of "<CountryName>"
    And I click on Continue button
    And I select the reason as "Tourism"
    And I click on Continue button
    Then I will be informed "You will not need a visa to come to the UK"
  Examples:
  |CountryName|
  |Japan|
  |USA|
  |Malaysia|
  |Canada|
  |Australia|

  @UKBA3
Scenario Outline: Nationalities and Tourism
  Given I am on "https://www.gov.uk/check-uk-visa/y"
  Given I provide nationality of "<CountryName>"
  And I click on Continue button
  And I select the reason as "Tourism"
  And I click on Continue button
  And I select "Yes" button for travelling with or visiting partner or family member
  And I click on Continue button
  Then  I will be informed "You'll usually need a visa to come to the UK"
  Examples:
  |CountryName|
  |Russia|
  |Cuba|
  |Belarus|
  |Albania|


