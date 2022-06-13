@smoke

Feature: add different products to Wishlist

  Background:
    Given user logged in to app by "toka.adel@gmail.com" and "258369"

    Scenario: Logged user could add different products to Wishlist
      When user search for product "Flower Girl Bracelet"
      And user go to a product and press add to wishlist
      Then product would be added to wishlist