@smoke

Feature: add different products to Shopping cart

  Background:
    Given user login to website "toka.adel@gmail.com" and "258369"

    Scenario: Logged user could add different products to Shopping cart
      When user search for a product "Pride and Prejudice"
      And user go to a product and press add to cart
      Then product would be added to cart