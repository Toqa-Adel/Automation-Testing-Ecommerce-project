@smoke

Feature:select different tags

  Background:
    Given user logged in by "toka.adel@gmail.com" and "258369"

    Scenario:Logged user could select different tags
      When browse any category
      And user select tag
      Then Products tagged with selected tag