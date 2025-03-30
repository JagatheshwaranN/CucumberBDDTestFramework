@placeOrder
Feature: Place Order

  @api @service
  Scenario Outline: Verify user able to place order as guest user.
    Given I'm a guest user
    And my billing details are
      | firstname | lastname | address_line      | city  | state | zipcode | email            |
      | Test      | User     | 5300 Spring Creek | Plano | Texas | 75024   | tester@gmail.com |
    And I have a <product_id> in the cart via service
    And I'm on the checkout page
    When I provide the billing details
    And I place an order
    Then the order should be placed successfully
    Examples:
      | product_id |
      | 1215       |
