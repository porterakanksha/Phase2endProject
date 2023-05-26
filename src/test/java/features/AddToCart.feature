@AddToCart
Feature: This feature will be used to test the add product in Cart

Background: 
    Given I have launched the application
   When I enter username as "standard_user"
    And I enter password as "secret_sauce"
    And I click on Login button
    Then I should land on home page
  @Sanity  
    Scenario: Validate product name to add in cart
    When I select Product
    And Add product to cart
    Then Show in Cart