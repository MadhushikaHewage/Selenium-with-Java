@tag
Feature: Luma Cloths

  @tag1
  Scenario: Assignment
    Given User navigate to the Welcome Page
    Then User navigate to the Authentication Page
    When User enter the email address and password
    And User click the SignIn button
    Then User navigate to the Cloths page
    And User selects short in size and color
    And User clicks short Add to cart
    And User selects tee in size and color
    And User clicks add to cart
    And User clicks cart button
    Then User clicks on Proceed to Checkout button
    And User clicks Next button
    Then User clicks Place Order button
    And User verifies the order