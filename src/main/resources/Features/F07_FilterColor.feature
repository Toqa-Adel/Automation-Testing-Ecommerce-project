@smoke

Feature:filter with color

  Background:
    Given user logged in by "toka.adel@gmail.com" and "258369"

    Scenario: Logged user could filter with color
      When user navigate to category Apparel - shoes
      And user select color
      Then products would be filtered by color