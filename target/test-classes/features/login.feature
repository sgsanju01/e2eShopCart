Feature: Login functionality for SauceDemo

  Scenario: Successful login with valid credentials
    Given I launch the SauceDemo application
    When I enter username "standard_user" and password "secret_sauce"
    And I click on the login button
    Then I should be redirected to the inventory page
