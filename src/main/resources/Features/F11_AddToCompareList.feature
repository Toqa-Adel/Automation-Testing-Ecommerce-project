@smoke

Feature: add different products to compare List

  Background:
    Given user logged in to app "toka.adel@gmail.com" and "258369"

  Scenario: Logged user could add different products to compare list
    When user search product "Apple MacBook"
    And user go to a product and press add to compare List
    Then product would be added to compare List