@smoke

Feature: Create successful Order

  Background:
    Given user logged to the app "toka.adel@gmail.com" and "258369"
    And user Searched for "Pride and Prejudice"
    And user found product and add it to cart

    Scenario: Create successful Order
      When user go to cart
      And user agree with term
      And user press checkout
      And user enter billing data "Egypt" and "Giza" and "faisal" and "789" and "021589758"
      Then order successfully complete