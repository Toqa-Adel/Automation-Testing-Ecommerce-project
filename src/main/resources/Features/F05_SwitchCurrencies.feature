@smoke

Feature: switching between currencies US-Euro

  Background:
    Given user could logged by "toka.adel@gmail.com" and "258369"

    Scenario: Logged User could switch between currencies US-Euro
     When user go to currencies options
     And user select currency "Euro"
      And navigate to any category
    Then currency switched

