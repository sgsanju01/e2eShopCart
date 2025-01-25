Feature: Login functionality for SauceDemo

  Scenario: Successful login with valid credentials
    Given I launch the SauceDemo application
    When I enter username "standard_user" and password "secret_sauce"
    And I click on the login button
    Then I should be redirected to the inventory page
    When I add the 1st and 4th items to the cart
    And I click cart button
    Then I should be redirected to the Your Cart page
    When I click on the Checkout button
    Then I should be checkout page
    When I fill up firstname "sanjay" and lastname "gupta" and zipcode 328722
    And click on the Continue button
    Then I should on the Payment page
    And total price of purchased items
    And click on Finish button
    Then I should on the orderdaetails page
    
    
    
